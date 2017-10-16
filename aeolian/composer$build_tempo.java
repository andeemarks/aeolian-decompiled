/*    */ package aeolian;
/*    */ 
/*    */ import clojure.lang.AFunction;
/*    */ import clojure.lang.RT;
/*    */ import clojure.lang.Var;
/*    */ 
/*    */ public final class composer$build_tempo
/*    */   extends AFunction
/*    */ {
/*    */   /* Error */
/*    */   public static Object invokeStatic(Object complexity)
/*    */   {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: lconst_1
/*    */     //   2: invokestatic 17	clojure/lang/Numbers:gt	(Ljava/lang/Object;J)Z
/*    */     //   5: ifeq +38 -> 43
/*    */     //   8: getstatic 21	aeolian/composer$build_tempo:const__2	Lclojure/lang/Var;
/*    */     //   11: invokevirtual 27	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   14: checkcast 29	clojure/lang/IFn
/*    */     //   17: getstatic 32	aeolian/composer$build_tempo:const__3	Lclojure/lang/Var;
/*    */     //   20: invokevirtual 27	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   23: checkcast 29	clojure/lang/IFn
/*    */     //   26: aload_0
/*    */     //   27: aconst_null
/*    */     //   28: astore_0
/*    */     //   29: invokeinterface 35 2 0
/*    */     //   34: invokeinterface 35 2 0
/*    */     //   39: goto +5 -> 44
/*    */     //   42: pop
/*    */     //   43: aconst_null
/*    */     //   44: areturn
/*    */     // Line number table:
/*    */     //   Java source line #33	-> byte code offset #0
/*    */     //   Java source line #34	-> byte code offset #0
/*    */     //   Java source line #34	-> byte code offset #2
/*    */     //   Java source line #35	-> byte code offset #14
/*    */     //   Java source line #35	-> byte code offset #23
/*    */     //   Java source line #35	-> byte code offset #29
/*    */     //   Java source line #35	-> byte code offset #34
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	44	0	complexity	Object
/*    */   }
/*    */   
/*    */   public Object invoke(Object paramObject)
/*    */   {
/* 33 */     paramObject = null;return invokeStatic(paramObject); } public static final Var const__3 = (Var)RT.var("aeolian.abc.tempo", "tempo-for"); public static final Var const__2 = (Var)RT.var("aeolian.abc.core", "inline");
/*    */ }


/* Location:              /home/amarks/code/aeolian/target/aeolian-0.1.1-SNAPSHOT.jar!/aeolian/composer$build_tempo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */