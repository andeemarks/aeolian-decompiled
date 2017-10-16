/*   */ package aeolian.abc; import clojure.lang.Var;
/*   */ 
/* 1 */ public final class key$loading__5569__auto____55 extends clojure.lang.AFunction { public static final clojure.lang.AFn const__1 = (clojure.lang.AFn)clojure.lang.Symbol.intern(null, "clojure.core"); public static final Var const__0 = (Var)clojure.lang.RT.var("clojure.core", "refer");
/*   */   
/*   */   /* Error */
/*   */   public Object invoke()
/*   */   {
/*   */     // Byte code:
/*   */     //   0: iconst_2
/*   */     //   1: anewarray 13	java/lang/Object
/*   */     //   4: dup
/*   */     //   5: iconst_0
/*   */     //   6: getstatic 19	clojure/lang/Compiler:LOADER	Lclojure/lang/Var;
/*   */     //   9: aastore
/*   */     //   10: dup
/*   */     //   11: iconst_1
/*   */     //   12: aload_0
/*   */     //   13: invokevirtual 23	java/lang/Object:getClass	()Ljava/lang/Class;
/*   */     //   16: checkcast 25	java/lang/Class
/*   */     //   19: invokevirtual 29	java/lang/Class:getClassLoader	()Ljava/lang/ClassLoader;
/*   */     //   22: aastore
/*   */     //   23: invokestatic 35	clojure/lang/RT:mapUniqueKeys	([Ljava/lang/Object;)Lclojure/lang/IPersistentMap;
/*   */     //   26: checkcast 37	clojure/lang/Associative
/*   */     //   29: invokestatic 43	clojure/lang/Var:pushThreadBindings	(Lclojure/lang/Associative;)V
/*   */     //   32: getstatic 46	aeolian/abc/key$loading__5569__auto____55:const__0	Lclojure/lang/Var;
/*   */     //   35: invokevirtual 49	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*   */     //   38: checkcast 51	clojure/lang/IFn
/*   */     //   41: getstatic 55	aeolian/abc/key$loading__5569__auto____55:const__1	Lclojure/lang/AFn;
/*   */     //   44: invokeinterface 58 2 0
/*   */     //   49: astore_1
/*   */     //   50: invokestatic 61	clojure/lang/Var:popThreadBindings	()V
/*   */     //   53: goto +9 -> 62
/*   */     //   56: astore_2
/*   */     //   57: invokestatic 61	clojure/lang/Var:popThreadBindings	()V
/*   */     //   60: aload_2
/*   */     //   61: athrow
/*   */     //   62: aload_1
/*   */     //   63: areturn
/*   */     // Line number table:
/*   */     //   Java source line #1	-> byte code offset #0
/*   */     //   Java source line #1	-> byte code offset #6
/*   */     //   Java source line #1	-> byte code offset #13
/*   */     //   Java source line #1	-> byte code offset #19
/*   */     //   Java source line #1	-> byte code offset #29
/*   */     //   Java source line #1	-> byte code offset #38
/*   */     //   Java source line #1	-> byte code offset #44
/*   */     //   Java source line #1	-> byte code offset #50
/*   */     //   Java source line #1	-> byte code offset #57
/*   */     // Local variable table:
/*   */     //   start	length	slot	name	signature
/*   */     //   0	63	0	this	Object
/*   */     //   49	14	1	localObject1	Object
/*   */     //   56	5	2	localObject2	Object
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   32	50	56	finally
/*   */   }
/*   */ }


/* Location:              /home/amarks/code/aeolian/target/aeolian-0.1.1-SNAPSHOT.jar!/aeolian/abc/key$loading__5569__auto____55.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */