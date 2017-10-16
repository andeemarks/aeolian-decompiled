/*    */ package aeolian;
/*    */ 
/*    */ import clojure.lang.AFunction;
/*    */ import clojure.lang.IFn;
/*    */ import clojure.lang.RT;
/*    */ import clojure.lang.Var;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class composer$fn__9849$map_metrics__9854$fn__9855
/*    */   extends AFunction
/*    */ {
/*    */   public composer$fn__9849$map_metrics__9854$fn__9855(Object paramObject1, Object paramObject2)
/*    */   {
/* 78 */     this.G__9847 = paramObject1;this.G__9848 = paramObject2; } public static final Var const__3 = (Var)RT.var("clojure.core", "str"); public static final Var const__2 = (Var)RT.var("clojure.core", "apply"); public static final Var const__1 = (Var)RT.var("clojure.core", "map"); public static final Var const__0 = (Var)RT.var("aeolian.composer", "split-metrics-into-equal-measures"); public Object invoke() { ((fn__9855)this).G__9847 = null;Object metrics = ((fn__9855)this).G__9847;((fn__9855)this).G__9848 = null;Object composition_key = ((fn__9855)this).G__9848;
/*    */     
/*    */ 
/* 81 */     metrics = null;Object metrics_in_measures = ((IFn)const__0.getRawRoot()).invoke(metrics);
/* 82 */     composition_key = null;metrics_in_measures = null;Object mapped_notes = ((IFn)const__1.getRawRoot()).invoke(new composer.fn__9849.map_metrics__9854.fn__9855.fn__9856(composition_key), metrics_in_measures);
/* 83 */     mapped_notes = null;return ((IFn)const__2.getRawRoot()).invoke(const__3.getRawRoot(), mapped_notes);
/*    */   }
/*    */   
/*    */   Object G__9848;
/*    */   Object G__9847;
/*    */ }


/* Location:              /home/amarks/code/aeolian/target/aeolian-0.1.1-SNAPSHOT.jar!/aeolian/composer$fn__9849$map_metrics__9854$fn__9855.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */