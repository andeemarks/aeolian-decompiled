/*   */ package aeolian.abc; import clojure.lang.AFn;
/*   */ 
/* 1 */ public final class header$loading__5569__auto____9750 extends clojure.lang.AFunction { public static final AFn const__4 = (AFn)clojure.lang.Tuple.create(clojure.lang.Symbol.intern(null, "aeolian.abc.key"), clojure.lang.RT.keyword(null, "as"), clojure.lang.Symbol.intern(null, "k")); public static final AFn const__3 = (AFn)clojure.lang.Tuple.create(clojure.lang.Symbol.intern(null, "aeolian.abc.tempo"), clojure.lang.RT.keyword(null, "as"), clojure.lang.Symbol.intern(null, "t")); public static final clojure.lang.Var const__2 = (clojure.lang.Var)clojure.lang.RT.var("clojure.core", "require"); public static final AFn const__1 = (AFn)clojure.lang.Symbol.intern(null, "clojure.core"); public static final clojure.lang.Var const__0 = (clojure.lang.Var)clojure.lang.RT.var("clojure.core", "refer");
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
/*   */     //   32: getstatic 46	aeolian/abc/header$loading__5569__auto____9750:const__0	Lclojure/lang/Var;
/*   */     //   35: invokevirtual 49	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*   */     //   38: checkcast 51	clojure/lang/IFn
/*   */     //   41: getstatic 55	aeolian/abc/header$loading__5569__auto____9750:const__1	Lclojure/lang/AFn;
/*   */     //   44: invokeinterface 58 2 0
/*   */     //   49: pop
/*   */     //   50: getstatic 61	aeolian/abc/header$loading__5569__auto____9750:const__2	Lclojure/lang/Var;
/*   */     //   53: invokevirtual 49	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*   */     //   56: checkcast 51	clojure/lang/IFn
/*   */     //   59: getstatic 64	aeolian/abc/header$loading__5569__auto____9750:const__3	Lclojure/lang/AFn;
/*   */     //   62: getstatic 67	aeolian/abc/header$loading__5569__auto____9750:const__4	Lclojure/lang/AFn;
/*   */     //   65: invokeinterface 70 3 0
/*   */     //   70: astore_1
/*   */     //   71: invokestatic 73	clojure/lang/Var:popThreadBindings	()V
/*   */     //   74: goto +9 -> 83
/*   */     //   77: astore_2
/*   */     //   78: invokestatic 73	clojure/lang/Var:popThreadBindings	()V
/*   */     //   81: aload_2
/*   */     //   82: athrow
/*   */     //   83: aload_1
/*   */     //   84: areturn
/*   */     // Line number table:
/*   */     //   Java source line #1	-> byte code offset #0
/*   */     //   Java source line #1	-> byte code offset #6
/*   */     //   Java source line #1	-> byte code offset #13
/*   */     //   Java source line #1	-> byte code offset #19
/*   */     //   Java source line #1	-> byte code offset #29
/*   */     //   Java source line #1	-> byte code offset #38
/*   */     //   Java source line #1	-> byte code offset #44
/*   */     //   Java source line #1	-> byte code offset #56
/*   */     //   Java source line #1	-> byte code offset #65
/*   */     //   Java source line #1	-> byte code offset #71
/*   */     //   Java source line #1	-> byte code offset #78
/*   */     // Local variable table:
/*   */     //   start	length	slot	name	signature
/*   */     //   0	84	0	this	Object
/*   */     //   70	14	1	localObject1	Object
/*   */     //   77	5	2	localObject2	Object
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   32	71	77	finally
/*   */   }
/*   */ }


/* Location:              /home/amarks/code/aeolian/target/aeolian-0.1.1-SNAPSHOT.jar!/aeolian/abc/header$loading__5569__auto____9750.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */