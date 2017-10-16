/*   */ package aeolian.abc; import clojure.lang.Var;
/*   */ 
/* 3 */ public final class core$inline extends clojure.lang.AFunction { public Object invoke(Object paramObject) { paramObject = null;return invokeStatic(paramObject); } public static final Var const__0 = (Var)clojure.lang.RT.var("clojure.core", "str");
/* 4 */   public static Object invokeStatic(Object command) { command = null;return ((clojure.lang.IFn)const__0.getRawRoot()).invoke("[", command, "]");
/*   */   }
/*   */ }


/* Location:              /home/amarks/code/aeolian/target/aeolian-0.1.1-SNAPSHOT.jar!/aeolian/abc/core$inline.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */