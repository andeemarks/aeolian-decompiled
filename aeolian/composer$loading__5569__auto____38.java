/*   */ package aeolian; import clojure.lang.AFn;
/*   */ 
/* 1 */ public final class composer$loading__5569__auto____38 extends clojure.lang.AFunction { public static final AFn const__9 = (AFn)clojure.lang.Tuple.create(clojure.lang.Symbol.intern(null, "aeolian.abc.header"), clojure.lang.RT.keyword(null, "as"), clojure.lang.Symbol.intern(null, "h")); public static final AFn const__8 = (AFn)clojure.lang.Tuple.create(clojure.lang.Symbol.intern(null, "schema.core"), clojure.lang.RT.keyword(null, "as"), clojure.lang.Symbol.intern(null, "s")); public static final AFn const__7 = (AFn)clojure.lang.Tuple.create(clojure.lang.Symbol.intern(null, "taoensso.timbre"), clojure.lang.RT.keyword(null, "as"), clojure.lang.Symbol.intern(null, "log")); public static final AFn const__6 = (AFn)clojure.lang.Tuple.create(clojure.lang.Symbol.intern(null, "aeolian.abc.core"), clojure.lang.RT.keyword(null, "as"), clojure.lang.Symbol.intern(null, "abc")); public static final AFn const__5 = (AFn)clojure.lang.Tuple.create(clojure.lang.Symbol.intern(null, "aeolian.abc.notes"), clojure.lang.RT.keyword(null, "as"), clojure.lang.Symbol.intern(null, "n")); public static final AFn const__4 = (AFn)clojure.lang.Tuple.create(clojure.lang.Symbol.intern(null, "aeolian.abc.tempo"), clojure.lang.RT.keyword(null, "as"), clojure.lang.Symbol.intern(null, "t")); public static final AFn const__3 = (AFn)clojure.lang.Tuple.create(clojure.lang.Symbol.intern(null, "aeolian.midi.core"), clojure.lang.RT.keyword(null, "as"), clojure.lang.Symbol.intern(null, "midi")); public static final clojure.lang.Var const__2 = (clojure.lang.Var)clojure.lang.RT.var("clojure.core", "require"); public static final AFn const__1 = (AFn)clojure.lang.Symbol.intern(null, "clojure.core"); public static final clojure.lang.Var const__0 = (clojure.lang.Var)clojure.lang.RT.var("clojure.core", "refer");
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
/*   */     //   32: getstatic 46	aeolian/composer$loading__5569__auto____38:const__0	Lclojure/lang/Var;
/*   */     //   35: invokevirtual 49	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*   */     //   38: checkcast 51	clojure/lang/IFn
/*   */     //   41: getstatic 55	aeolian/composer$loading__5569__auto____38:const__1	Lclojure/lang/AFn;
/*   */     //   44: invokeinterface 58 2 0
/*   */     //   49: pop
/*   */     //   50: getstatic 61	aeolian/composer$loading__5569__auto____38:const__2	Lclojure/lang/Var;
/*   */     //   53: invokevirtual 49	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*   */     //   56: checkcast 51	clojure/lang/IFn
/*   */     //   59: getstatic 64	aeolian/composer$loading__5569__auto____38:const__3	Lclojure/lang/AFn;
/*   */     //   62: getstatic 67	aeolian/composer$loading__5569__auto____38:const__4	Lclojure/lang/AFn;
/*   */     //   65: getstatic 70	aeolian/composer$loading__5569__auto____38:const__5	Lclojure/lang/AFn;
/*   */     //   68: getstatic 73	aeolian/composer$loading__5569__auto____38:const__6	Lclojure/lang/AFn;
/*   */     //   71: getstatic 76	aeolian/composer$loading__5569__auto____38:const__7	Lclojure/lang/AFn;
/*   */     //   74: getstatic 79	aeolian/composer$loading__5569__auto____38:const__8	Lclojure/lang/AFn;
/*   */     //   77: getstatic 82	aeolian/composer$loading__5569__auto____38:const__9	Lclojure/lang/AFn;
/*   */     //   80: invokeinterface 85 8 0
/*   */     //   85: astore_1
/*   */     //   86: invokestatic 88	clojure/lang/Var:popThreadBindings	()V
/*   */     //   89: goto +9 -> 98
/*   */     //   92: astore_2
/*   */     //   93: invokestatic 88	clojure/lang/Var:popThreadBindings	()V
/*   */     //   96: aload_2
/*   */     //   97: athrow
/*   */     //   98: aload_1
/*   */     //   99: areturn
/*   */     // Line number table:
/*   */     //   Java source line #1	-> byte code offset #0
/*   */     //   Java source line #1	-> byte code offset #6
/*   */     //   Java source line #1	-> byte code offset #13
/*   */     //   Java source line #1	-> byte code offset #19
/*   */     //   Java source line #1	-> byte code offset #29
/*   */     //   Java source line #1	-> byte code offset #38
/*   */     //   Java source line #1	-> byte code offset #44
/*   */     //   Java source line #1	-> byte code offset #56
/*   */     //   Java source line #1	-> byte code offset #80
/*   */     //   Java source line #1	-> byte code offset #86
/*   */     //   Java source line #1	-> byte code offset #93
/*   */     // Local variable table:
/*   */     //   start	length	slot	name	signature
/*   */     //   0	99	0	this	Object
/*   */     //   85	14	1	localObject1	Object
/*   */     //   92	5	2	localObject2	Object
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   32	86	92	finally
/*   */   }
/*   */ }


/* Location:              /home/amarks/code/aeolian/target/aeolian-0.1.1-SNAPSHOT.jar!/aeolian/composer$loading__5569__auto____38.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */