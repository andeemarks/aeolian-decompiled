/*    */ package aeolian.abc;
/*    */ 
/*    */ import clojure.lang.AFunction;
/*    */ import clojure.lang.Keyword;
/*    */ import clojure.lang.RT;
/*    */ import clojure.lang.Var;
/*    */ 
/*    */ public final class notes$chord_for_method_length
/*    */   extends AFunction
/*    */ {
/*    */   /* Error */
/*    */   public static Object invokeStatic(Object method_length, Object composition_key, Object current_method_length)
/*    */   {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: aconst_null
/*    */     //   2: invokestatic 17	clojure/lang/Util:identical	(Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   5: ifeq +50 -> 55
/*    */     //   8: getstatic 21	aeolian/abc/notes$chord_for_method_length:const__1	Lclojure/lang/Var;
/*    */     //   11: invokevirtual 27	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   14: checkcast 29	clojure/lang/IFn
/*    */     //   17: aload_2
/*    */     //   18: aconst_null
/*    */     //   19: astore_2
/*    */     //   20: astore_3
/*    */     //   21: aload_3
/*    */     //   22: dup
/*    */     //   23: ifnull +15 -> 38
/*    */     //   26: getstatic 35	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
/*    */     //   29: if_acmpeq +10 -> 39
/*    */     //   32: aload_3
/*    */     //   33: aconst_null
/*    */     //   34: astore_3
/*    */     //   35: goto +7 -> 42
/*    */     //   38: pop
/*    */     //   39: getstatic 39	aeolian/abc/notes$chord_for_method_length:const__2	Ljava/lang/Object;
/*    */     //   42: aload_1
/*    */     //   43: aconst_null
/*    */     //   44: astore_1
/*    */     //   45: aconst_null
/*    */     //   46: invokeinterface 43 4 0
/*    */     //   51: goto +408 -> 459
/*    */     //   54: pop
/*    */     //   55: getstatic 46	aeolian/abc/notes$chord_for_method_length:const__3	Lclojure/lang/Var;
/*    */     //   58: invokevirtual 27	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   61: checkcast 29	clojure/lang/IFn
/*    */     //   64: getstatic 49	aeolian/abc/notes$chord_for_method_length:const__4	Ljava/lang/Object;
/*    */     //   67: aload_0
/*    */     //   68: getstatic 52	aeolian/abc/notes$chord_for_method_length:const__5	Ljava/lang/Object;
/*    */     //   71: invokeinterface 43 4 0
/*    */     //   76: dup
/*    */     //   77: ifnull +32 -> 109
/*    */     //   80: getstatic 35	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
/*    */     //   83: if_acmpeq +27 -> 110
/*    */     //   86: getstatic 55	aeolian/abc/notes$chord_for_method_length:const__6	Lclojure/lang/Var;
/*    */     //   89: invokevirtual 27	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   92: checkcast 29	clojure/lang/IFn
/*    */     //   95: getstatic 39	aeolian/abc/notes$chord_for_method_length:const__2	Ljava/lang/Object;
/*    */     //   98: aload_1
/*    */     //   99: aconst_null
/*    */     //   100: astore_1
/*    */     //   101: invokeinterface 58 3 0
/*    */     //   106: goto +353 -> 459
/*    */     //   109: pop
/*    */     //   110: getstatic 46	aeolian/abc/notes$chord_for_method_length:const__3	Lclojure/lang/Var;
/*    */     //   113: invokevirtual 27	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   116: checkcast 29	clojure/lang/IFn
/*    */     //   119: getstatic 61	aeolian/abc/notes$chord_for_method_length:const__7	Ljava/lang/Object;
/*    */     //   122: aload_0
/*    */     //   123: getstatic 64	aeolian/abc/notes$chord_for_method_length:const__8	Ljava/lang/Object;
/*    */     //   126: invokeinterface 43 4 0
/*    */     //   131: dup
/*    */     //   132: ifnull +32 -> 164
/*    */     //   135: getstatic 35	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
/*    */     //   138: if_acmpeq +27 -> 165
/*    */     //   141: getstatic 55	aeolian/abc/notes$chord_for_method_length:const__6	Lclojure/lang/Var;
/*    */     //   144: invokevirtual 27	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   147: checkcast 29	clojure/lang/IFn
/*    */     //   150: getstatic 49	aeolian/abc/notes$chord_for_method_length:const__4	Ljava/lang/Object;
/*    */     //   153: aload_1
/*    */     //   154: aconst_null
/*    */     //   155: astore_1
/*    */     //   156: invokeinterface 58 3 0
/*    */     //   161: goto +298 -> 459
/*    */     //   164: pop
/*    */     //   165: getstatic 46	aeolian/abc/notes$chord_for_method_length:const__3	Lclojure/lang/Var;
/*    */     //   168: invokevirtual 27	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   171: checkcast 29	clojure/lang/IFn
/*    */     //   174: getstatic 67	aeolian/abc/notes$chord_for_method_length:const__9	Ljava/lang/Object;
/*    */     //   177: aload_0
/*    */     //   178: getstatic 70	aeolian/abc/notes$chord_for_method_length:const__10	Ljava/lang/Object;
/*    */     //   181: invokeinterface 43 4 0
/*    */     //   186: dup
/*    */     //   187: ifnull +32 -> 219
/*    */     //   190: getstatic 35	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
/*    */     //   193: if_acmpeq +27 -> 220
/*    */     //   196: getstatic 55	aeolian/abc/notes$chord_for_method_length:const__6	Lclojure/lang/Var;
/*    */     //   199: invokevirtual 27	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   202: checkcast 29	clojure/lang/IFn
/*    */     //   205: getstatic 73	aeolian/abc/notes$chord_for_method_length:const__11	Ljava/lang/Object;
/*    */     //   208: aload_1
/*    */     //   209: aconst_null
/*    */     //   210: astore_1
/*    */     //   211: invokeinterface 58 3 0
/*    */     //   216: goto +243 -> 459
/*    */     //   219: pop
/*    */     //   220: getstatic 46	aeolian/abc/notes$chord_for_method_length:const__3	Lclojure/lang/Var;
/*    */     //   223: invokevirtual 27	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   226: checkcast 29	clojure/lang/IFn
/*    */     //   229: getstatic 76	aeolian/abc/notes$chord_for_method_length:const__12	Ljava/lang/Object;
/*    */     //   232: aload_0
/*    */     //   233: getstatic 79	aeolian/abc/notes$chord_for_method_length:const__13	Ljava/lang/Object;
/*    */     //   236: invokeinterface 43 4 0
/*    */     //   241: dup
/*    */     //   242: ifnull +32 -> 274
/*    */     //   245: getstatic 35	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
/*    */     //   248: if_acmpeq +27 -> 275
/*    */     //   251: getstatic 55	aeolian/abc/notes$chord_for_method_length:const__6	Lclojure/lang/Var;
/*    */     //   254: invokevirtual 27	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   257: checkcast 29	clojure/lang/IFn
/*    */     //   260: getstatic 82	aeolian/abc/notes$chord_for_method_length:const__14	Ljava/lang/Object;
/*    */     //   263: aload_1
/*    */     //   264: aconst_null
/*    */     //   265: astore_1
/*    */     //   266: invokeinterface 58 3 0
/*    */     //   271: goto +188 -> 459
/*    */     //   274: pop
/*    */     //   275: getstatic 46	aeolian/abc/notes$chord_for_method_length:const__3	Lclojure/lang/Var;
/*    */     //   278: invokevirtual 27	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   281: checkcast 29	clojure/lang/IFn
/*    */     //   284: getstatic 85	aeolian/abc/notes$chord_for_method_length:const__15	Ljava/lang/Object;
/*    */     //   287: aload_0
/*    */     //   288: getstatic 88	aeolian/abc/notes$chord_for_method_length:const__16	Ljava/lang/Object;
/*    */     //   291: invokeinterface 43 4 0
/*    */     //   296: dup
/*    */     //   297: ifnull +32 -> 329
/*    */     //   300: getstatic 35	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
/*    */     //   303: if_acmpeq +27 -> 330
/*    */     //   306: getstatic 55	aeolian/abc/notes$chord_for_method_length:const__6	Lclojure/lang/Var;
/*    */     //   309: invokevirtual 27	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   312: checkcast 29	clojure/lang/IFn
/*    */     //   315: getstatic 91	aeolian/abc/notes$chord_for_method_length:const__17	Ljava/lang/Object;
/*    */     //   318: aload_1
/*    */     //   319: aconst_null
/*    */     //   320: astore_1
/*    */     //   321: invokeinterface 58 3 0
/*    */     //   326: goto +133 -> 459
/*    */     //   329: pop
/*    */     //   330: getstatic 46	aeolian/abc/notes$chord_for_method_length:const__3	Lclojure/lang/Var;
/*    */     //   333: invokevirtual 27	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   336: checkcast 29	clojure/lang/IFn
/*    */     //   339: getstatic 94	aeolian/abc/notes$chord_for_method_length:const__18	Ljava/lang/Object;
/*    */     //   342: aload_0
/*    */     //   343: getstatic 97	aeolian/abc/notes$chord_for_method_length:const__19	Ljava/lang/Object;
/*    */     //   346: invokeinterface 43 4 0
/*    */     //   351: dup
/*    */     //   352: ifnull +32 -> 384
/*    */     //   355: getstatic 35	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
/*    */     //   358: if_acmpeq +27 -> 385
/*    */     //   361: getstatic 55	aeolian/abc/notes$chord_for_method_length:const__6	Lclojure/lang/Var;
/*    */     //   364: invokevirtual 27	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   367: checkcast 29	clojure/lang/IFn
/*    */     //   370: getstatic 52	aeolian/abc/notes$chord_for_method_length:const__5	Ljava/lang/Object;
/*    */     //   373: aload_1
/*    */     //   374: aconst_null
/*    */     //   375: astore_1
/*    */     //   376: invokeinterface 58 3 0
/*    */     //   381: goto +78 -> 459
/*    */     //   384: pop
/*    */     //   385: ldc2_w 98
/*    */     //   388: aload_0
/*    */     //   389: aconst_null
/*    */     //   390: astore_0
/*    */     //   391: invokestatic 105	clojure/lang/Numbers:lte	(JLjava/lang/Object;)Z
/*    */     //   394: ifeq +27 -> 421
/*    */     //   397: getstatic 55	aeolian/abc/notes$chord_for_method_length:const__6	Lclojure/lang/Var;
/*    */     //   400: invokevirtual 27	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   403: checkcast 29	clojure/lang/IFn
/*    */     //   406: getstatic 61	aeolian/abc/notes$chord_for_method_length:const__7	Ljava/lang/Object;
/*    */     //   409: aload_1
/*    */     //   410: aconst_null
/*    */     //   411: astore_1
/*    */     //   412: invokeinterface 58 3 0
/*    */     //   417: goto +42 -> 459
/*    */     //   420: pop
/*    */     //   421: getstatic 109	aeolian/abc/notes$chord_for_method_length:const__21	Lclojure/lang/Keyword;
/*    */     //   424: dup
/*    */     //   425: ifnull +32 -> 457
/*    */     //   428: getstatic 35	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
/*    */     //   431: if_acmpeq +27 -> 458
/*    */     //   434: getstatic 55	aeolian/abc/notes$chord_for_method_length:const__6	Lclojure/lang/Var;
/*    */     //   437: invokevirtual 27	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   440: checkcast 29	clojure/lang/IFn
/*    */     //   443: getstatic 39	aeolian/abc/notes$chord_for_method_length:const__2	Ljava/lang/Object;
/*    */     //   446: aload_1
/*    */     //   447: aconst_null
/*    */     //   448: astore_1
/*    */     //   449: invokeinterface 58 3 0
/*    */     //   454: goto +5 -> 459
/*    */     //   457: pop
/*    */     //   458: aconst_null
/*    */     //   459: areturn
/*    */     // Line number table:
/*    */     //   Java source line #26	-> byte code offset #0
/*    */     //   Java source line #27	-> byte code offset #0
/*    */     //   Java source line #28	-> byte code offset #2
/*    */     //   Java source line #28	-> byte code offset #14
/*    */     //   Java source line #28	-> byte code offset #21
/*    */     //   Java source line #28	-> byte code offset #46
/*    */     //   Java source line #27	-> byte code offset #55
/*    */     //   Java source line #29	-> byte code offset #61
/*    */     //   Java source line #29	-> byte code offset #71
/*    */     //   Java source line #29	-> byte code offset #92
/*    */     //   Java source line #29	-> byte code offset #101
/*    */     //   Java source line #27	-> byte code offset #110
/*    */     //   Java source line #30	-> byte code offset #116
/*    */     //   Java source line #30	-> byte code offset #126
/*    */     //   Java source line #30	-> byte code offset #147
/*    */     //   Java source line #30	-> byte code offset #156
/*    */     //   Java source line #27	-> byte code offset #165
/*    */     //   Java source line #31	-> byte code offset #171
/*    */     //   Java source line #31	-> byte code offset #181
/*    */     //   Java source line #31	-> byte code offset #202
/*    */     //   Java source line #31	-> byte code offset #211
/*    */     //   Java source line #27	-> byte code offset #220
/*    */     //   Java source line #32	-> byte code offset #226
/*    */     //   Java source line #32	-> byte code offset #236
/*    */     //   Java source line #32	-> byte code offset #257
/*    */     //   Java source line #32	-> byte code offset #266
/*    */     //   Java source line #27	-> byte code offset #275
/*    */     //   Java source line #33	-> byte code offset #281
/*    */     //   Java source line #33	-> byte code offset #291
/*    */     //   Java source line #33	-> byte code offset #312
/*    */     //   Java source line #33	-> byte code offset #321
/*    */     //   Java source line #27	-> byte code offset #330
/*    */     //   Java source line #34	-> byte code offset #336
/*    */     //   Java source line #34	-> byte code offset #346
/*    */     //   Java source line #34	-> byte code offset #367
/*    */     //   Java source line #34	-> byte code offset #376
/*    */     //   Java source line #27	-> byte code offset #385
/*    */     //   Java source line #35	-> byte code offset #391
/*    */     //   Java source line #35	-> byte code offset #403
/*    */     //   Java source line #35	-> byte code offset #412
/*    */     //   Java source line #27	-> byte code offset #421
/*    */     //   Java source line #36	-> byte code offset #440
/*    */     //   Java source line #36	-> byte code offset #449
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	459	0	method_length	Object
/*    */     //   0	459	1	composition_key	Object
/*    */     //   0	459	2	current_method_length	Object
/*    */     //   21	21	3	or__4469__auto__83	Object
/*    */   }
/*    */   
/*    */   public Object invoke(Object paramObject1, Object paramObject2, Object paramObject3)
/*    */   {
/* 26 */     paramObject1 = null;paramObject2 = null;paramObject3 = null;return invokeStatic(paramObject1, paramObject2, paramObject3); } public static final Keyword const__21 = (Keyword)RT.keyword(null, "else"); public static final Object const__19 = Long.valueOf(39L); public static final Object const__18 = Long.valueOf(30L); public static final Object const__17 = Long.valueOf(4L); public static final Object const__16 = Long.valueOf(29L); public static final Object const__15 = Long.valueOf(21L); public static final Object const__14 = Long.valueOf(3L); public static final Object const__13 = Long.valueOf(20L); public static final Object const__12 = Long.valueOf(16L); public static final Object const__11 = Long.valueOf(2L); public static final Object const__10 = Long.valueOf(15L); public static final Object const__9 = Long.valueOf(11L); public static final Object const__8 = Long.valueOf(10L); public static final Object const__7 = Long.valueOf(6L); public static final Var const__6 = (Var)RT.var("aeolian.abc.notes", "chord"); public static final Object const__5 = Long.valueOf(5L); public static final Object const__4 = Long.valueOf(1L); public static final Var const__3 = (Var)RT.var("clojure.core", "<="); public static final Object const__2 = Long.valueOf(0L); public static final Var const__1 = (Var)RT.var("aeolian.abc.notes", "chord-for-method-length");
/*    */ }


/* Location:              /home/amarks/code/aeolian/target/aeolian-0.1.1-SNAPSHOT.jar!/aeolian/abc/notes$chord_for_method_length.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */