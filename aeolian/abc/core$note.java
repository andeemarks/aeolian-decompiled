/*    */ package aeolian.abc;
/*    */ 
/*    */ import clojure.lang.AFunction;
/*    */ import clojure.lang.IFn;
/*    */ import clojure.lang.RT;
/*    */ import clojure.lang.Var;
/*    */ 
/*    */ public final class core$note extends AFunction
/*    */ {
/*    */   public Object invoke(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
/*    */   {
/* 12 */     paramObject1 = null;paramObject2 = null;paramObject3 = null;paramObject4 = null;return invokeStatic(paramObject1, paramObject2, paramObject3, paramObject4); } public static final Var const__5 = (Var)RT.var("clojure.core", "nil?"); public static final Var const__4 = (Var)RT.var("clojure.core", "remove"); public static final Var const__3 = (Var)RT.var("clojure.core", "interpose"); public static final Var const__2 = (Var)RT.var("clojure.core", "str"); public static final Var const__1 = (Var)RT.var("clojure.core", "apply"); public static final Var const__0 = (Var)RT.var("clojure.core", "list");
/* 13 */   public static Object invokeStatic(Object note, Object instrument, Object lyrics, Object tempo) { note = null;instrument = null;lyrics = null;tempo = null;Object note_components = ((IFn)const__0.getRawRoot()).invoke(note, instrument, lyrics, tempo);
/* 14 */     note_components = null;return ((IFn)const__1.getRawRoot()).invoke(const__2.getRawRoot(), ((IFn)const__3.getRawRoot()).invoke(" ", ((IFn)const__4.getRawRoot()).invoke(const__5.getRawRoot(), note_components)));
/*    */   }
/*    */ }


/* Location:              /home/amarks/code/aeolian/target/aeolian-0.1.1-SNAPSHOT.jar!/aeolian/abc/core$note.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */