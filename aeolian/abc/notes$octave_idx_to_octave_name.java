/*    */ package aeolian.abc;
/*    */ 
/*    */ import clojure.lang.AFn;
/*    */ import clojure.lang.AFunction;
/*    */ import clojure.lang.IFn;
/*    */ import clojure.lang.RT;
/*    */ import clojure.lang.Symbol;
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
/*    */ public final class notes$octave_idx_to_octave_name
/*    */   extends AFunction
/*    */ {
/*    */   public Object invoke(Object paramObject1, Object paramObject2)
/*    */   {
/* 38 */     paramObject1 = null;paramObject2 = null;return invokeStatic(paramObject1, paramObject2); } public static final Var const__3 = (Var)RT.var("clojure.core", "str"); public static final Var const__2 = (Var)RT.var("clojure.core", "symbol"); public static final AFn const__1 = (AFn)Symbol.intern(null, "aeolian.abc.notes"); public static final Var const__0 = (Var)RT.var("clojure.core", "intern");
/* 39 */   public static Object invokeStatic(Object octave_prefix, Object octave_idx) { octave_prefix = null;octave_idx = null;return ((IFn)const__0.getRawRoot()).invoke(const__1, ((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(octave_prefix, octave_idx)));
/*    */   }
/*    */ }


/* Location:              /home/amarks/code/aeolian/target/aeolian-0.1.1-SNAPSHOT.jar!/aeolian/abc/notes$octave_idx_to_octave_name.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */