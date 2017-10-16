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
/*    */ public final class composer$build_note
/*    */   extends AFunction
/*    */ {
/*    */   public Object invoke(Object paramObject1, Object paramObject2)
/*    */   {
/* 31 */     paramObject1 = null;paramObject2 = null;return invokeStatic(paramObject1, paramObject2); } public static Object invokeStatic(Object line_length, Object composition_key) { line_length = null;composition_key = null;return ((IFn)const__0.getRawRoot()).invoke(line_length, composition_key); } public static final Var const__0 = (Var)RT.var("aeolian.abc.notes", "note-for-line-length");
/*    */ }


/* Location:              /home/amarks/code/aeolian/target/aeolian-0.1.1-SNAPSHOT.jar!/aeolian/composer$build_note.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */