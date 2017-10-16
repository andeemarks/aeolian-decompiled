/*   */ package aeolian;
/*   */ import clojure.lang.Var;
/*   */ 
/*   */ public final class banner$line extends clojure.lang.RestFn { public int getRequiredArity() { return 1; } public Object doInvoke(Object paramObject1, Object paramObject2) { paramObject1 = null;paramObject2 = null;return invokeStatic(paramObject1, (clojure.lang.ISeq)paramObject2); } public static Object invokeStatic(Object text, clojure.lang.ISeq p__9935) { p__9935 = null;Object vec__9936 = p__9935;vec__9936 = null;Object args = clojure.lang.RT.nth(vec__9936, clojure.lang.RT.intCast(0L), null);text = null;args = null;return ((clojure.lang.IFn)const__2.getRawRoot()).invoke(((clojure.lang.IFn)const__3.getRawRoot()).invoke(text, args)); } public static final Var const__3 = (Var)clojure.lang.RT.var("clansi", "style"); public static final Var const__2 = (Var)clojure.lang.RT.var("clojure.core", "println");
/*   */ }


/* Location:              /home/amarks/code/aeolian/target/aeolian-0.1.1-SNAPSHOT.jar!/aeolian/banner$line.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */