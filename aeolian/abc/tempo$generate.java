/*   */ package aeolian.abc;
/*   */ 
/*   */ import clojure.lang.Var;
/*   */ 
/*   */ public final class tempo$generate extends clojure.lang.AFunction {
/*   */   public Object invoke(Object paramObject) {
/* 7 */     paramObject = null;return invokeStatic(paramObject); } public static final Var const__3 = (Var)clojure.lang.RT.var("aeolian.abc.tempo", "default-tempo"); public static Object invokeStatic(Object complexity) { complexity = null;
/* 8 */     return clojure.lang.Numbers.add(clojure.lang.Numbers.multiply(20L, complexity), const__3.getRawRoot());
/*   */   }
/*   */ }


/* Location:              /home/amarks/code/aeolian/target/aeolian-0.1.1-SNAPSHOT.jar!/aeolian/abc/tempo$generate.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */