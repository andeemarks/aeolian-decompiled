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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class notes$note_from_octave
/*    */   extends AFunction
/*    */ {
/*    */   public Object invoke(Object paramObject1, Object paramObject2, Object paramObject3)
/*    */   {
/* 46 */     paramObject1 = null;paramObject2 = null;paramObject3 = null;return invokeStatic(paramObject1, paramObject2, paramObject3); } public static final Var const__2 = (Var)RT.var("clojure.core", "mod"); public static final Var const__0 = (Var)RT.var("aeolian.abc.notes", "key-to-octave");
/* 47 */   public static Object invokeStatic(Object octave_idx, Object line_length, Object composition_key) { octave_idx = null;composition_key = null;Object octave = ((IFn)const__0.getRawRoot()).invoke(octave_idx, composition_key);
/* 48 */     line_length = null;octave = null;return RT.nth(octave, RT.intCast((Number)((IFn)const__2.getRawRoot()).invoke(line_length, Integer.valueOf(RT.count(octave)))));
/*    */   }
/*    */ }


/* Location:              /home/amarks/code/aeolian/target/aeolian-0.1.1-SNAPSHOT.jar!/aeolian/abc/notes$note_from_octave.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */