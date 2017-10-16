/*    */ package aeolian.abc;
/*    */ 
/*    */ import clojure.lang.AFunction;
/*    */ import clojure.lang.RT;
/*    */ import clojure.lang.Var;
/*    */ 
/*    */ public final class notes$key_to_octave
/*    */   extends AFunction
/*    */ {
/*    */   /* Error */
/*    */   public static Object invokeStatic(Object octave_idx, Object composition_key)
/*    */   {
/*    */     // Byte code:
/*    */     //   0: getstatic 15	aeolian/abc/notes$key_to_octave:const__1	Lclojure/lang/Var;
/*    */     //   3: invokevirtual 21	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   6: aload_1
/*    */     //   7: aconst_null
/*    */     //   8: astore_1
/*    */     //   9: invokestatic 27	clojure/lang/Util:equiv	(Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   12: ifeq +40 -> 52
/*    */     //   15: getstatic 30	aeolian/abc/notes$key_to_octave:const__2	Lclojure/lang/Var;
/*    */     //   18: invokevirtual 21	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   21: checkcast 32	clojure/lang/IFn
/*    */     //   24: getstatic 35	aeolian/abc/notes$key_to_octave:const__3	Lclojure/lang/Var;
/*    */     //   27: invokevirtual 21	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   30: checkcast 32	clojure/lang/IFn
/*    */     //   33: ldc 37
/*    */     //   35: aload_0
/*    */     //   36: aconst_null
/*    */     //   37: astore_0
/*    */     //   38: invokeinterface 40 3 0
/*    */     //   43: invokeinterface 43 2 0
/*    */     //   48: goto +37 -> 85
/*    */     //   51: pop
/*    */     //   52: getstatic 30	aeolian/abc/notes$key_to_octave:const__2	Lclojure/lang/Var;
/*    */     //   55: invokevirtual 21	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   58: checkcast 32	clojure/lang/IFn
/*    */     //   61: getstatic 35	aeolian/abc/notes$key_to_octave:const__3	Lclojure/lang/Var;
/*    */     //   64: invokevirtual 21	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   67: checkcast 32	clojure/lang/IFn
/*    */     //   70: ldc 45
/*    */     //   72: aload_0
/*    */     //   73: aconst_null
/*    */     //   74: astore_0
/*    */     //   75: invokeinterface 40 3 0
/*    */     //   80: invokeinterface 43 2 0
/*    */     //   85: areturn
/*    */     // Line number table:
/*    */     //   Java source line #41	-> byte code offset #0
/*    */     //   Java source line #42	-> byte code offset #0
/*    */     //   Java source line #42	-> byte code offset #9
/*    */     //   Java source line #43	-> byte code offset #21
/*    */     //   Java source line #43	-> byte code offset #30
/*    */     //   Java source line #43	-> byte code offset #38
/*    */     //   Java source line #43	-> byte code offset #43
/*    */     //   Java source line #44	-> byte code offset #58
/*    */     //   Java source line #44	-> byte code offset #67
/*    */     //   Java source line #44	-> byte code offset #75
/*    */     //   Java source line #44	-> byte code offset #80
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	85	0	octave_idx	Object
/*    */     //   0	85	1	composition_key	Object
/*    */   }
/*    */   
/*    */   public Object invoke(Object paramObject1, Object paramObject2)
/*    */   {
/* 41 */     paramObject1 = null;paramObject2 = null;return invokeStatic(paramObject1, paramObject2); } public static final Var const__3 = (Var)RT.var("aeolian.abc.notes", "octave-idx-to-octave-name"); public static final Var const__2 = (Var)RT.var("clojure.core", "var-get"); public static final Var const__1 = (Var)RT.var("aeolian.abc.key", "major");
/*    */ }


/* Location:              /home/amarks/code/aeolian/target/aeolian-0.1.1-SNAPSHOT.jar!/aeolian/abc/notes$key_to_octave.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */