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
/*    */ public final class core$notation_file_name
/*    */   extends AFunction
/*    */ {
/*    */   public Object invoke(Object paramObject)
/*    */   {
/* 16 */     paramObject = null;return invokeStatic(paramObject); } public static final Var const__0 = (Var)RT.var("clojure.core", "str");
/* 17 */   public static Object invokeStatic(Object original_file_name) { original_file_name = null;return ((IFn)const__0.getRawRoot()).invoke(original_file_name, ".abc");
/*    */   }
/*    */ }


/* Location:              /home/amarks/code/aeolian/target/aeolian-0.1.1-SNAPSHOT.jar!/aeolian/core$notation_file_name.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */