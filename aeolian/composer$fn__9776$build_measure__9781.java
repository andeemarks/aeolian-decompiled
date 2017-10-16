/*    */ package aeolian;
/*    */ 
/*    */ import clojure.lang.AFn;
/*    */ import clojure.lang.AFunction;
/*    */ import clojure.lang.IObj;
/*    */ import clojure.lang.IPersistentMap;
/*    */ import clojure.lang.Keyword;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class composer$fn__9776$build_measure__9781
/*    */   extends AFunction
/*    */ {
/*    */   public composer$fn__9776$build_measure__9781(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4, Object paramObject5)
/*    */   {
/* 45 */     this.input_schema9770 = paramObject1;this.output_schema9769 = paramObject2;this.input_checker9771 = paramObject3;this.ufv__ = paramObject4;this.output_checker9772 = paramObject5; } public static final Keyword const__11 = (Keyword)RT.keyword(null, "output"); public static final Keyword const__10 = (Keyword)RT.keyword(null, "error"); public static final Keyword const__9 = (Keyword)RT.keyword(null, "value"); public static final Keyword const__8 = (Keyword)RT.keyword(null, "schema"); public static final Keyword const__7 = (Keyword)RT.keyword("schema.core", "error"); public static final Keyword const__6 = (Keyword)RT.keyword(null, "type"); public static final Var const__5 = (Var)RT.var("clojure.core", "pr-str"); public static final Var const__4 = (Var)RT.var("schema.utils", "format*"); public static final Var const__3 = (Var)RT.var("clojure.core", "deref"); public static final AFn const__2 = (AFn)((IObj)Symbol.intern(null, "build-measure")).withMeta((IPersistentMap)RT.map(new Object[] { RT.keyword(null, "schema"), Symbol.intern(null, "Measure") })); public static final Keyword const__1 = (Keyword)RT.keyword(null, "input"); public static final Var const__0 = (Var)RT.var("schema.core", "fn-validator");
/*    */   Object output_checker9772;
/*    */   Object ufv__;
/*    */   Object input_checker9771;
/*    */   Object output_schema9769;
/*    */   Object input_schema9770;
/*    */   
/*    */   /* Error */
/*    */   public Object invoke(Object G__9773, Object G__9774, Object G__9775)
/*    */   {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield 24	aeolian/composer$fn__9776$build_measure__9781:ufv__	Ljava/lang/Object;
/*    */     //   4: checkcast 30	java/util/concurrent/atomic/AtomicReference
/*    */     //   7: invokevirtual 34	java/util/concurrent/atomic/AtomicReference:get	()Ljava/lang/Object;
/*    */     //   10: astore 4
/*    */     //   12: aload 4
/*    */     //   14: dup
/*    */     //   15: ifnull +258 -> 273
/*    */     //   18: getstatic 40	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
/*    */     //   21: if_acmpeq +253 -> 274
/*    */     //   24: aload_1
/*    */     //   25: aload_2
/*    */     //   26: aload_3
/*    */     //   27: invokestatic 46	clojure/lang/Tuple:create	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lclojure/lang/IPersistentVector;
/*    */     //   30: astore 5
/*    */     //   32: getstatic 50	aeolian/composer$fn__9776$build_measure__9781:const__0	Lclojure/lang/Var;
/*    */     //   35: invokevirtual 55	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   38: dup
/*    */     //   39: ifnull +60 -> 99
/*    */     //   42: getstatic 40	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
/*    */     //   45: if_acmpeq +55 -> 100
/*    */     //   48: getstatic 50	aeolian/composer$fn__9776$build_measure__9781:const__0	Lclojure/lang/Var;
/*    */     //   51: invokevirtual 55	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   54: checkcast 57	clojure/lang/IFn
/*    */     //   57: getstatic 61	aeolian/composer$fn__9776$build_measure__9781:const__1	Lclojure/lang/Keyword;
/*    */     //   60: getstatic 65	aeolian/composer$fn__9776$build_measure__9781:const__2	Lclojure/lang/AFn;
/*    */     //   63: aload_0
/*    */     //   64: getfield 18	aeolian/composer$fn__9776$build_measure__9781:input_schema9770	Ljava/lang/Object;
/*    */     //   67: getstatic 68	aeolian/composer$fn__9776$build_measure__9781:const__3	Lclojure/lang/Var;
/*    */     //   70: invokevirtual 55	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   73: checkcast 57	clojure/lang/IFn
/*    */     //   76: aload_0
/*    */     //   77: getfield 22	aeolian/composer$fn__9776$build_measure__9781:input_checker9771	Ljava/lang/Object;
/*    */     //   80: invokeinterface 71 2 0
/*    */     //   85: aload 5
/*    */     //   87: aconst_null
/*    */     //   88: astore 5
/*    */     //   90: invokeinterface 74 6 0
/*    */     //   95: pop
/*    */     //   96: goto +174 -> 270
/*    */     //   99: pop
/*    */     //   100: getstatic 68	aeolian/composer$fn__9776$build_measure__9781:const__3	Lclojure/lang/Var;
/*    */     //   103: invokevirtual 55	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   106: checkcast 57	clojure/lang/IFn
/*    */     //   109: aload_0
/*    */     //   110: getfield 22	aeolian/composer$fn__9776$build_measure__9781:input_checker9771	Ljava/lang/Object;
/*    */     //   113: invokeinterface 71 2 0
/*    */     //   118: checkcast 57	clojure/lang/IFn
/*    */     //   121: aload 5
/*    */     //   123: invokeinterface 71 2 0
/*    */     //   128: astore 6
/*    */     //   130: aload 6
/*    */     //   132: dup
/*    */     //   133: ifnull +134 -> 267
/*    */     //   136: getstatic 40	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
/*    */     //   139: if_acmpeq +129 -> 268
/*    */     //   142: aload 6
/*    */     //   144: aconst_null
/*    */     //   145: astore 6
/*    */     //   147: astore 7
/*    */     //   149: new 76	clojure/lang/ExceptionInfo
/*    */     //   152: dup
/*    */     //   153: getstatic 79	aeolian/composer$fn__9776$build_measure__9781:const__4	Lclojure/lang/Var;
/*    */     //   156: invokevirtual 55	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   159: checkcast 57	clojure/lang/IFn
/*    */     //   162: ldc 81
/*    */     //   164: getstatic 65	aeolian/composer$fn__9776$build_measure__9781:const__2	Lclojure/lang/AFn;
/*    */     //   167: getstatic 84	aeolian/composer$fn__9776$build_measure__9781:const__5	Lclojure/lang/Var;
/*    */     //   170: invokevirtual 55	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   173: checkcast 57	clojure/lang/IFn
/*    */     //   176: aload 7
/*    */     //   178: invokeinterface 71 2 0
/*    */     //   183: invokeinterface 86 4 0
/*    */     //   188: checkcast 88	java/lang/String
/*    */     //   191: bipush 8
/*    */     //   193: anewarray 90	java/lang/Object
/*    */     //   196: dup
/*    */     //   197: iconst_0
/*    */     //   198: getstatic 93	aeolian/composer$fn__9776$build_measure__9781:const__6	Lclojure/lang/Keyword;
/*    */     //   201: aastore
/*    */     //   202: dup
/*    */     //   203: iconst_1
/*    */     //   204: getstatic 96	aeolian/composer$fn__9776$build_measure__9781:const__7	Lclojure/lang/Keyword;
/*    */     //   207: aastore
/*    */     //   208: dup
/*    */     //   209: iconst_2
/*    */     //   210: getstatic 99	aeolian/composer$fn__9776$build_measure__9781:const__8	Lclojure/lang/Keyword;
/*    */     //   213: aastore
/*    */     //   214: dup
/*    */     //   215: iconst_3
/*    */     //   216: aload_0
/*    */     //   217: getfield 18	aeolian/composer$fn__9776$build_measure__9781:input_schema9770	Ljava/lang/Object;
/*    */     //   220: aastore
/*    */     //   221: dup
/*    */     //   222: iconst_4
/*    */     //   223: getstatic 102	aeolian/composer$fn__9776$build_measure__9781:const__9	Lclojure/lang/Keyword;
/*    */     //   226: aastore
/*    */     //   227: dup
/*    */     //   228: iconst_5
/*    */     //   229: aload 5
/*    */     //   231: aconst_null
/*    */     //   232: astore 5
/*    */     //   234: aastore
/*    */     //   235: dup
/*    */     //   236: bipush 6
/*    */     //   238: getstatic 105	aeolian/composer$fn__9776$build_measure__9781:const__10	Lclojure/lang/Keyword;
/*    */     //   241: aastore
/*    */     //   242: dup
/*    */     //   243: bipush 7
/*    */     //   245: aload 7
/*    */     //   247: aconst_null
/*    */     //   248: astore 7
/*    */     //   250: aastore
/*    */     //   251: invokestatic 111	clojure/lang/RT:mapUniqueKeys	([Ljava/lang/Object;)Lclojure/lang/IPersistentMap;
/*    */     //   254: checkcast 113	clojure/lang/IPersistentMap
/*    */     //   257: invokespecial 116	clojure/lang/ExceptionInfo:<init>	(Ljava/lang/String;Lclojure/lang/IPersistentMap;)V
/*    */     //   260: checkcast 118	java/lang/Throwable
/*    */     //   263: athrow
/*    */     //   264: goto +6 -> 270
/*    */     //   267: pop
/*    */     //   268: aconst_null
/*    */     //   269: pop
/*    */     //   270: goto +6 -> 276
/*    */     //   273: pop
/*    */     //   274: aconst_null
/*    */     //   275: pop
/*    */     //   276: new 123	aeolian/composer$fn__9776$build_measure__9781$fn__9782
/*    */     //   279: dup
/*    */     //   280: aload_1
/*    */     //   281: aconst_null
/*    */     //   282: astore_1
/*    */     //   283: aload_2
/*    */     //   284: aconst_null
/*    */     //   285: astore_2
/*    */     //   286: aload_3
/*    */     //   287: aconst_null
/*    */     //   288: astore_3
/*    */     //   289: invokespecial 126	aeolian/composer$fn__9776$build_measure__9781$fn__9782:<init>	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
/*    */     //   292: checkcast 57	clojure/lang/IFn
/*    */     //   295: invokeinterface 128 1 0
/*    */     //   300: astore 5
/*    */     //   302: aload 4
/*    */     //   304: aconst_null
/*    */     //   305: astore 4
/*    */     //   307: dup
/*    */     //   308: ifnull +244 -> 552
/*    */     //   311: getstatic 40	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
/*    */     //   314: if_acmpeq +239 -> 553
/*    */     //   317: getstatic 50	aeolian/composer$fn__9776$build_measure__9781:const__0	Lclojure/lang/Var;
/*    */     //   320: invokevirtual 55	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   323: dup
/*    */     //   324: ifnull +57 -> 381
/*    */     //   327: getstatic 40	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
/*    */     //   330: if_acmpeq +52 -> 382
/*    */     //   333: getstatic 50	aeolian/composer$fn__9776$build_measure__9781:const__0	Lclojure/lang/Var;
/*    */     //   336: invokevirtual 55	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   339: checkcast 57	clojure/lang/IFn
/*    */     //   342: getstatic 131	aeolian/composer$fn__9776$build_measure__9781:const__11	Lclojure/lang/Keyword;
/*    */     //   345: getstatic 65	aeolian/composer$fn__9776$build_measure__9781:const__2	Lclojure/lang/AFn;
/*    */     //   348: aload_0
/*    */     //   349: getfield 20	aeolian/composer$fn__9776$build_measure__9781:output_schema9769	Ljava/lang/Object;
/*    */     //   352: getstatic 68	aeolian/composer$fn__9776$build_measure__9781:const__3	Lclojure/lang/Var;
/*    */     //   355: invokevirtual 55	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   358: checkcast 57	clojure/lang/IFn
/*    */     //   361: aload_0
/*    */     //   362: getfield 26	aeolian/composer$fn__9776$build_measure__9781:output_checker9772	Ljava/lang/Object;
/*    */     //   365: invokeinterface 71 2 0
/*    */     //   370: aload 5
/*    */     //   372: invokeinterface 74 6 0
/*    */     //   377: pop
/*    */     //   378: goto +171 -> 549
/*    */     //   381: pop
/*    */     //   382: getstatic 68	aeolian/composer$fn__9776$build_measure__9781:const__3	Lclojure/lang/Var;
/*    */     //   385: invokevirtual 55	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   388: checkcast 57	clojure/lang/IFn
/*    */     //   391: aload_0
/*    */     //   392: getfield 26	aeolian/composer$fn__9776$build_measure__9781:output_checker9772	Ljava/lang/Object;
/*    */     //   395: invokeinterface 71 2 0
/*    */     //   400: checkcast 57	clojure/lang/IFn
/*    */     //   403: aload 5
/*    */     //   405: invokeinterface 71 2 0
/*    */     //   410: astore 6
/*    */     //   412: aload 6
/*    */     //   414: dup
/*    */     //   415: ifnull +131 -> 546
/*    */     //   418: getstatic 40	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
/*    */     //   421: if_acmpeq +126 -> 547
/*    */     //   424: aload 6
/*    */     //   426: aconst_null
/*    */     //   427: astore 6
/*    */     //   429: astore 7
/*    */     //   431: new 76	clojure/lang/ExceptionInfo
/*    */     //   434: dup
/*    */     //   435: getstatic 79	aeolian/composer$fn__9776$build_measure__9781:const__4	Lclojure/lang/Var;
/*    */     //   438: invokevirtual 55	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   441: checkcast 57	clojure/lang/IFn
/*    */     //   444: ldc -123
/*    */     //   446: getstatic 65	aeolian/composer$fn__9776$build_measure__9781:const__2	Lclojure/lang/AFn;
/*    */     //   449: getstatic 84	aeolian/composer$fn__9776$build_measure__9781:const__5	Lclojure/lang/Var;
/*    */     //   452: invokevirtual 55	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   455: checkcast 57	clojure/lang/IFn
/*    */     //   458: aload 7
/*    */     //   460: invokeinterface 71 2 0
/*    */     //   465: invokeinterface 86 4 0
/*    */     //   470: checkcast 88	java/lang/String
/*    */     //   473: bipush 8
/*    */     //   475: anewarray 90	java/lang/Object
/*    */     //   478: dup
/*    */     //   479: iconst_0
/*    */     //   480: getstatic 93	aeolian/composer$fn__9776$build_measure__9781:const__6	Lclojure/lang/Keyword;
/*    */     //   483: aastore
/*    */     //   484: dup
/*    */     //   485: iconst_1
/*    */     //   486: getstatic 96	aeolian/composer$fn__9776$build_measure__9781:const__7	Lclojure/lang/Keyword;
/*    */     //   489: aastore
/*    */     //   490: dup
/*    */     //   491: iconst_2
/*    */     //   492: getstatic 99	aeolian/composer$fn__9776$build_measure__9781:const__8	Lclojure/lang/Keyword;
/*    */     //   495: aastore
/*    */     //   496: dup
/*    */     //   497: iconst_3
/*    */     //   498: aload_0
/*    */     //   499: getfield 20	aeolian/composer$fn__9776$build_measure__9781:output_schema9769	Ljava/lang/Object;
/*    */     //   502: aastore
/*    */     //   503: dup
/*    */     //   504: iconst_4
/*    */     //   505: getstatic 102	aeolian/composer$fn__9776$build_measure__9781:const__9	Lclojure/lang/Keyword;
/*    */     //   508: aastore
/*    */     //   509: dup
/*    */     //   510: iconst_5
/*    */     //   511: aload 5
/*    */     //   513: aastore
/*    */     //   514: dup
/*    */     //   515: bipush 6
/*    */     //   517: getstatic 105	aeolian/composer$fn__9776$build_measure__9781:const__10	Lclojure/lang/Keyword;
/*    */     //   520: aastore
/*    */     //   521: dup
/*    */     //   522: bipush 7
/*    */     //   524: aload 7
/*    */     //   526: aconst_null
/*    */     //   527: astore 7
/*    */     //   529: aastore
/*    */     //   530: invokestatic 111	clojure/lang/RT:mapUniqueKeys	([Ljava/lang/Object;)Lclojure/lang/IPersistentMap;
/*    */     //   533: checkcast 113	clojure/lang/IPersistentMap
/*    */     //   536: invokespecial 116	clojure/lang/ExceptionInfo:<init>	(Ljava/lang/String;Lclojure/lang/IPersistentMap;)V
/*    */     //   539: checkcast 118	java/lang/Throwable
/*    */     //   542: athrow
/*    */     //   543: goto +6 -> 549
/*    */     //   546: pop
/*    */     //   547: aconst_null
/*    */     //   548: pop
/*    */     //   549: goto +6 -> 555
/*    */     //   552: pop
/*    */     //   553: aconst_null
/*    */     //   554: pop
/*    */     //   555: aload 5
/*    */     //   557: aconst_null
/*    */     //   558: astore 5
/*    */     //   560: areturn
/*    */     // Line number table:
/*    */     //   Java source line #45	-> byte code offset #0
/*    */     //   Java source line #45	-> byte code offset #7
/*    */     //   Java source line #45	-> byte code offset #12
/*    */     //   Java source line #45	-> byte code offset #32
/*    */     //   Java source line #45	-> byte code offset #54
/*    */     //   Java source line #45	-> byte code offset #73
/*    */     //   Java source line #45	-> byte code offset #80
/*    */     //   Java source line #45	-> byte code offset #90
/*    */     //   Java source line #45	-> byte code offset #106
/*    */     //   Java source line #45	-> byte code offset #113
/*    */     //   Java source line #45	-> byte code offset #118
/*    */     //   Java source line #45	-> byte code offset #123
/*    */     //   Java source line #45	-> byte code offset #130
/*    */     //   Java source line #45	-> byte code offset #159
/*    */     //   Java source line #45	-> byte code offset #173
/*    */     //   Java source line #45	-> byte code offset #178
/*    */     //   Java source line #45	-> byte code offset #183
/*    */     //   Java source line #45	-> byte code offset #292
/*    */     //   Java source line #45	-> byte code offset #295
/*    */     //   Java source line #45	-> byte code offset #302
/*    */     //   Java source line #45	-> byte code offset #317
/*    */     //   Java source line #45	-> byte code offset #339
/*    */     //   Java source line #45	-> byte code offset #358
/*    */     //   Java source line #45	-> byte code offset #365
/*    */     //   Java source line #45	-> byte code offset #372
/*    */     //   Java source line #45	-> byte code offset #388
/*    */     //   Java source line #45	-> byte code offset #395
/*    */     //   Java source line #45	-> byte code offset #400
/*    */     //   Java source line #45	-> byte code offset #405
/*    */     //   Java source line #45	-> byte code offset #412
/*    */     //   Java source line #45	-> byte code offset #441
/*    */     //   Java source line #45	-> byte code offset #455
/*    */     //   Java source line #45	-> byte code offset #460
/*    */     //   Java source line #45	-> byte code offset #465
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	560	0	this	Object
/*    */     //   0	560	1	G__9773	Object
/*    */     //   0	560	2	G__9774	Object
/*    */     //   0	560	3	G__9775	Object
/*    */     //   12	548	4	validate__8479__auto__9791	Object
/*    */     //   32	238	5	args__8480__auto__9787	Object
/*    */     //   302	258	5	o__8482__auto__9790	Object
/*    */     //   130	140	6	temp__4657__auto__9786	Object
/*    */     //   412	137	6	temp__4657__auto__9789	Object
/*    */     //   149	115	7	error__8481__auto__9785	Object
/*    */     //   431	112	7	error__8481__auto__9788	Object
/*    */   }
/*    */ }


/* Location:              /home/amarks/code/aeolian/target/aeolian-0.1.1-SNAPSHOT.jar!/aeolian/composer$fn__9776$build_measure__9781.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */