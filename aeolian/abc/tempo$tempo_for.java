/*    */ package aeolian.abc;
/*    */ 
/*    */ import clojure.lang.IFn;
/*    */ import clojure.lang.Var;
/*    */ 
/*    */ public final class tempo$tempo_for extends clojure.lang.AFunction
/*    */ {
/*    */   public Object invoke(Object paramObject)
/*    */   {
/* 10 */     paramObject = null;return invokeStatic(paramObject); } public static final Var const__2 = (Var)clojure.lang.RT.var("aeolian.abc.tempo", "generate"); public static final Var const__1 = (Var)clojure.lang.RT.var("aeolian.abc.tempo", "prefix"); public static final Var const__0 = (Var)clojure.lang.RT.var("clojure.core", "str");
/* 11 */   public static Object invokeStatic(Object complexity) { complexity = null;return ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), ((IFn)const__2.getRawRoot()).invoke(complexity));
/*    */   }
/*    */ }


/* Location:              /home/amarks/code/aeolian/target/aeolian-0.1.1-SNAPSHOT.jar!/aeolian/abc/tempo$tempo_for.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */