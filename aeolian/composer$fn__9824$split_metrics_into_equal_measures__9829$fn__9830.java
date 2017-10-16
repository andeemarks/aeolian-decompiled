/*    */ package aeolian;
/*    */ 
/*    */ import clojure.lang.AFunction;
/*    */ import clojure.lang.IFn;
/*    */ import clojure.lang.RT;
/*    */ import clojure.lang.Tuple;
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
/*    */ public final class composer$fn__9824$split_metrics_into_equal_measures__9829$fn__9830
/*    */   extends AFunction
/*    */ {
/*    */   public composer$fn__9824$split_metrics_into_equal_measures__9829$fn__9830(Object paramObject)
/*    */   {
/* 74 */     this.G__9823 = paramObject; } public static final Var const__2 = (Var)RT.var("clojure.core", "last"); public static final Object const__1 = Long.valueOf(8L); public static final Var const__0 = (Var)RT.var("clojure.core", "partition"); public Object invoke() { ((fn__9830)this).G__9823 = null;Object metrics = ((fn__9830)this).G__9823;
/*    */     
/* 76 */     metrics = null;return ((IFn)const__0.getRawRoot()).invoke(const__1, const__1, Tuple.create(((IFn)const__2.getRawRoot()).invoke(metrics)), metrics);
/*    */   }
/*    */   
/*    */   Object G__9823;
/*    */ }


/* Location:              /home/amarks/code/aeolian/target/aeolian-0.1.1-SNAPSHOT.jar!/aeolian/composer$fn__9824$split_metrics_into_equal_measures__9829$fn__9830.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */