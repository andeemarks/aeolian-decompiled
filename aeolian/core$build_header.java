/*    */ package aeolian;
/*    */ 
/*    */ import clojure.lang.AFunction;
/*    */ import clojure.lang.IFn;
/*    */ import clojure.lang.RT;
/*    */ import clojure.lang.Var;
/*    */ 
/*    */ public final class core$build_header
/*    */   extends AFunction
/*    */ {
/*    */   public Object invoke(Object paramObject1, Object paramObject2)
/*    */   {
/* 13 */     paramObject1 = null;paramObject2 = null;return invokeStatic(paramObject1, paramObject2); } public static final Var const__2 = (Var)RT.var("aeolian.midi.core", "header"); public static final Var const__1 = (Var)RT.var("aeolian.abc.header", "build-common-header"); public static final Var const__0 = (Var)RT.var("clojure.core", "str");
/* 14 */   public static Object invokeStatic(Object metrics_file_name, Object key) { metrics_file_name = null;key = null;return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(metrics_file_name, key), "\n", const__2.getRawRoot());
/*    */   }
/*    */ }


/* Location:              /home/amarks/code/aeolian/target/aeolian-0.1.1-SNAPSHOT.jar!/aeolian/core$build_header.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */