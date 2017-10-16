/*    */ package aeolian.midi;
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
/*    */ public final class core$instrument_command_for
/*    */   extends AFunction
/*    */ {
/*    */   public Object invoke(Object paramObject)
/*    */   {
/* 31 */     paramObject = null;return invokeStatic(paramObject); } public static final Var const__1 = (Var)RT.var("aeolian.midi.core", "instrument-for"); public static final Var const__0 = (Var)RT.var("clojure.core", "str");
/* 32 */   public static Object invokeStatic(Object filename) { filename = null;return ((IFn)const__0.getRawRoot()).invoke("[I: MIDI program ", ((IFn)const__1.getRawRoot()).invoke(filename), "]");
/*    */   }
/*    */ }


/* Location:              /home/amarks/code/aeolian/target/aeolian-0.1.1-SNAPSHOT.jar!/aeolian/midi/core$instrument_command_for.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */