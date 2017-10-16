/*    */ package aeolian.midi;
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
/*    */ public final class core$instrument_for
/*    */   extends AFunction
/*    */ {
/*    */   public Object invoke(Object paramObject)
/*    */   {
/* 25 */     paramObject = null;return invokeStatic(paramObject); } public static final Var const__6 = (Var)RT.var("clojure.core", "int"); public static final Var const__5 = (Var)RT.var("clojure.core", "map"); public static final Var const__4 = (Var)RT.var("clojure.core", "+"); public static final Var const__3 = (Var)RT.var("clojure.core", "apply"); public static final Var const__2 = (Var)RT.var("clojure.core", "mod"); public static final Var const__1 = (Var)RT.var("aeolian.midi.core", "instruments");
/*    */   
/*    */   public static Object invokeStatic(Object filename) {
/* 28 */     filename = null;return RT.nth(const__1.getRawRoot(), RT.intCast((Number)((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__4.getRawRoot(), ((IFn)const__5.getRawRoot()).invoke(const__6.getRawRoot(), filename)), 
/* 29 */       Integer.valueOf(RT.count(const__1.getRawRoot())))));
/*    */   }
/*    */ }


/* Location:              /home/amarks/code/aeolian/target/aeolian-0.1.1-SNAPSHOT.jar!/aeolian/midi/core$instrument_for.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */