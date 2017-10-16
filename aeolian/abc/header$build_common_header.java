/*    */ package aeolian.abc;
/*    */ 
/*    */ import clojure.lang.AFunction;
/*    */ import clojure.lang.IFn;
/*    */ import clojure.lang.RT;
/*    */ import clojure.lang.Var;
/*    */ 
/*    */ 
/*    */ public final class header$build_common_header
/*    */   extends AFunction
/*    */ {
/*    */   public Object invoke(Object paramObject1, Object paramObject2)
/*    */   {
/* 14 */     paramObject1 = null;paramObject2 = null;return invokeStatic(paramObject1, paramObject2); } public static final Var const__9 = (Var)RT.var("aeolian.abc.header", "drums"); public static final Var const__8 = (Var)RT.var("aeolian.abc.header", "misc"); public static final Var const__7 = (Var)RT.var("aeolian.abc.header", "key-mapping"); public static final Var const__6 = (Var)RT.var("aeolian.abc.tempo", "starting-tempo"); public static final Var const__5 = (Var)RT.var("aeolian.abc.header", "note-length"); public static final Var const__4 = (Var)RT.var("aeolian.abc.header", "meter"); public static final Var const__3 = (Var)RT.var("aeolian.abc.header", "composer"); public static final Var const__2 = (Var)RT.var("aeolian.abc.header", "title-prefix"); public static final Var const__1 = (Var)RT.var("aeolian.abc.header", "reference"); public static final Var const__0 = (Var)RT.var("clojure.core", "str");
/* 15 */   public static Object invokeStatic(Object title, Object key) { title = null;key = null;return ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), const__2.getRawRoot(), title, const__3.getRawRoot(), const__4.getRawRoot(), const__5.getRawRoot(), "\n", const__6.getRawRoot(), ((IFn)key).invoke(const__7.getRawRoot()), const__8.getRawRoot(), const__9.getRawRoot());
/*    */   }
/*    */ }


/* Location:              /home/amarks/code/aeolian/target/aeolian-0.1.1-SNAPSHOT.jar!/aeolian/abc/header$build_common_header.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */