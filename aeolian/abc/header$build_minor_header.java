/*    */ package aeolian.abc;
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
/*    */ public final class header$build_minor_header
/*    */   extends AFunction
/*    */ {
/*    */   public Object invoke(Object paramObject)
/*    */   {
/* 20 */     paramObject = null;return invokeStatic(paramObject); } public static final Var const__1 = (Var)RT.var("aeolian.abc.key", "minor"); public static final Var const__0 = (Var)RT.var("aeolian.abc.header", "build-common-header");
/* 21 */   public static Object invokeStatic(Object title) { title = null;return ((IFn)const__0.getRawRoot()).invoke(title, const__1.getRawRoot());
/*    */   }
/*    */ }


/* Location:              /home/amarks/code/aeolian/target/aeolian-0.1.1-SNAPSHOT.jar!/aeolian/abc/header$build_minor_header.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */