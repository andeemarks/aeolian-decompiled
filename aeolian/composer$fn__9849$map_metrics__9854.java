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
/*    */ public final class composer$fn__9849$map_metrics__9854
/*    */   extends AFunction
/*    */ {
/*    */   public composer$fn__9849$map_metrics__9854(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4, Object paramObject5)
/*    */   {
/* 78 */     this.ufv__ = paramObject1;this.output_checker9846 = paramObject2;this.input_checker9845 = paramObject3;this.output_schema9843 = paramObject4;this.input_schema9844 = paramObject5; } public static final Keyword const__11 = (Keyword)RT.keyword(null, "output"); public static final Keyword const__10 = (Keyword)RT.keyword(null, "error"); public static final Keyword const__9 = (Keyword)RT.keyword(null, "value"); public static final Keyword const__8 = (Keyword)RT.keyword(null, "schema"); public static final Keyword const__7 = (Keyword)RT.keyword("schema.core", "error"); public static final Keyword const__6 = (Keyword)RT.keyword(null, "type"); public static final Var const__5 = (Var)RT.var("clojure.core", "pr-str"); public static final Var const__4 = (Var)RT.var("schema.utils", "format*"); public static final Var const__3 = (Var)RT.var("clojure.core", "deref"); public static final AFn const__2 = (AFn)((IObj)Symbol.intern(null, "map-metrics")).withMeta((IPersistentMap)RT.map(new Object[] { RT.keyword(null, "schema"), Symbol.intern("schema.core", "Any") })); public static final Keyword const__1 = (Keyword)RT.keyword(null, "input"); public static final Var const__0 = (Var)RT.var("schema.core", "fn-validator");
/*    */   Object input_schema9844;
/*    */   Object output_schema9843;
/*    */   Object input_checker9845;
/*    */   Object output_checker9846;
/*    */   Object ufv__;
/*    */   
/*    */   /* Error */
/*    */   public Object invoke(Object G__9847, Object G__9848)
/*    */   {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield 18	aeolian/composer$fn__9849$map_metrics__9854:ufv__	Ljava/lang/Object;
/*    */     //   4: checkcast 30	java/util/concurrent/atomic/AtomicReference
/*    */     //   7: invokevirtual 34	java/util/concurrent/atomic/AtomicReference:get	()Ljava/lang/Object;
/*    */     //   10: astore_3
/*    */     //   11: aload_3
/*    */     //   12: dup
/*    */     //   13: ifnull +257 -> 270
/*    */     //   16: getstatic 40	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
/*    */     //   19: if_acmpeq +252 -> 271
/*    */     //   22: aload_1
/*    */     //   23: aload_2
/*    */     //   24: invokestatic 46	clojure/lang/Tuple:create	(Ljava/lang/Object;Ljava/lang/Object;)Lclojure/lang/IPersistentVector;
/*    */     //   27: astore 4
/*    */     //   29: getstatic 50	aeolian/composer$fn__9849$map_metrics__9854:const__0	Lclojure/lang/Var;
/*    */     //   32: invokevirtual 55	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   35: dup
/*    */     //   36: ifnull +60 -> 96
/*    */     //   39: getstatic 40	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
/*    */     //   42: if_acmpeq +55 -> 97
/*    */     //   45: getstatic 50	aeolian/composer$fn__9849$map_metrics__9854:const__0	Lclojure/lang/Var;
/*    */     //   48: invokevirtual 55	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   51: checkcast 57	clojure/lang/IFn
/*    */     //   54: getstatic 61	aeolian/composer$fn__9849$map_metrics__9854:const__1	Lclojure/lang/Keyword;
/*    */     //   57: getstatic 65	aeolian/composer$fn__9849$map_metrics__9854:const__2	Lclojure/lang/AFn;
/*    */     //   60: aload_0
/*    */     //   61: getfield 26	aeolian/composer$fn__9849$map_metrics__9854:input_schema9844	Ljava/lang/Object;
/*    */     //   64: getstatic 68	aeolian/composer$fn__9849$map_metrics__9854:const__3	Lclojure/lang/Var;
/*    */     //   67: invokevirtual 55	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   70: checkcast 57	clojure/lang/IFn
/*    */     //   73: aload_0
/*    */     //   74: getfield 22	aeolian/composer$fn__9849$map_metrics__9854:input_checker9845	Ljava/lang/Object;
/*    */     //   77: invokeinterface 71 2 0
/*    */     //   82: aload 4
/*    */     //   84: aconst_null
/*    */     //   85: astore 4
/*    */     //   87: invokeinterface 74 6 0
/*    */     //   92: pop
/*    */     //   93: goto +174 -> 267
/*    */     //   96: pop
/*    */     //   97: getstatic 68	aeolian/composer$fn__9849$map_metrics__9854:const__3	Lclojure/lang/Var;
/*    */     //   100: invokevirtual 55	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   103: checkcast 57	clojure/lang/IFn
/*    */     //   106: aload_0
/*    */     //   107: getfield 22	aeolian/composer$fn__9849$map_metrics__9854:input_checker9845	Ljava/lang/Object;
/*    */     //   110: invokeinterface 71 2 0
/*    */     //   115: checkcast 57	clojure/lang/IFn
/*    */     //   118: aload 4
/*    */     //   120: invokeinterface 71 2 0
/*    */     //   125: astore 5
/*    */     //   127: aload 5
/*    */     //   129: dup
/*    */     //   130: ifnull +134 -> 264
/*    */     //   133: getstatic 40	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
/*    */     //   136: if_acmpeq +129 -> 265
/*    */     //   139: aload 5
/*    */     //   141: aconst_null
/*    */     //   142: astore 5
/*    */     //   144: astore 6
/*    */     //   146: new 76	clojure/lang/ExceptionInfo
/*    */     //   149: dup
/*    */     //   150: getstatic 79	aeolian/composer$fn__9849$map_metrics__9854:const__4	Lclojure/lang/Var;
/*    */     //   153: invokevirtual 55	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   156: checkcast 57	clojure/lang/IFn
/*    */     //   159: ldc 81
/*    */     //   161: getstatic 65	aeolian/composer$fn__9849$map_metrics__9854:const__2	Lclojure/lang/AFn;
/*    */     //   164: getstatic 84	aeolian/composer$fn__9849$map_metrics__9854:const__5	Lclojure/lang/Var;
/*    */     //   167: invokevirtual 55	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   170: checkcast 57	clojure/lang/IFn
/*    */     //   173: aload 6
/*    */     //   175: invokeinterface 71 2 0
/*    */     //   180: invokeinterface 87 4 0
/*    */     //   185: checkcast 89	java/lang/String
/*    */     //   188: bipush 8
/*    */     //   190: anewarray 91	java/lang/Object
/*    */     //   193: dup
/*    */     //   194: iconst_0
/*    */     //   195: getstatic 94	aeolian/composer$fn__9849$map_metrics__9854:const__6	Lclojure/lang/Keyword;
/*    */     //   198: aastore
/*    */     //   199: dup
/*    */     //   200: iconst_1
/*    */     //   201: getstatic 97	aeolian/composer$fn__9849$map_metrics__9854:const__7	Lclojure/lang/Keyword;
/*    */     //   204: aastore
/*    */     //   205: dup
/*    */     //   206: iconst_2
/*    */     //   207: getstatic 100	aeolian/composer$fn__9849$map_metrics__9854:const__8	Lclojure/lang/Keyword;
/*    */     //   210: aastore
/*    */     //   211: dup
/*    */     //   212: iconst_3
/*    */     //   213: aload_0
/*    */     //   214: getfield 26	aeolian/composer$fn__9849$map_metrics__9854:input_schema9844	Ljava/lang/Object;
/*    */     //   217: aastore
/*    */     //   218: dup
/*    */     //   219: iconst_4
/*    */     //   220: getstatic 103	aeolian/composer$fn__9849$map_metrics__9854:const__9	Lclojure/lang/Keyword;
/*    */     //   223: aastore
/*    */     //   224: dup
/*    */     //   225: iconst_5
/*    */     //   226: aload 4
/*    */     //   228: aconst_null
/*    */     //   229: astore 4
/*    */     //   231: aastore
/*    */     //   232: dup
/*    */     //   233: bipush 6
/*    */     //   235: getstatic 106	aeolian/composer$fn__9849$map_metrics__9854:const__10	Lclojure/lang/Keyword;
/*    */     //   238: aastore
/*    */     //   239: dup
/*    */     //   240: bipush 7
/*    */     //   242: aload 6
/*    */     //   244: aconst_null
/*    */     //   245: astore 6
/*    */     //   247: aastore
/*    */     //   248: invokestatic 112	clojure/lang/RT:mapUniqueKeys	([Ljava/lang/Object;)Lclojure/lang/IPersistentMap;
/*    */     //   251: checkcast 114	clojure/lang/IPersistentMap
/*    */     //   254: invokespecial 117	clojure/lang/ExceptionInfo:<init>	(Ljava/lang/String;Lclojure/lang/IPersistentMap;)V
/*    */     //   257: checkcast 119	java/lang/Throwable
/*    */     //   260: athrow
/*    */     //   261: goto +6 -> 267
/*    */     //   264: pop
/*    */     //   265: aconst_null
/*    */     //   266: pop
/*    */     //   267: goto +6 -> 273
/*    */     //   270: pop
/*    */     //   271: aconst_null
/*    */     //   272: pop
/*    */     //   273: new 124	aeolian/composer$fn__9849$map_metrics__9854$fn__9855
/*    */     //   276: dup
/*    */     //   277: aload_1
/*    */     //   278: aconst_null
/*    */     //   279: astore_1
/*    */     //   280: aload_2
/*    */     //   281: aconst_null
/*    */     //   282: astore_2
/*    */     //   283: invokespecial 127	aeolian/composer$fn__9849$map_metrics__9854$fn__9855:<init>	(Ljava/lang/Object;Ljava/lang/Object;)V
/*    */     //   286: checkcast 57	clojure/lang/IFn
/*    */     //   289: invokeinterface 129 1 0
/*    */     //   294: astore 4
/*    */     //   296: aload_3
/*    */     //   297: aconst_null
/*    */     //   298: astore_3
/*    */     //   299: dup
/*    */     //   300: ifnull +244 -> 544
/*    */     //   303: getstatic 40	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
/*    */     //   306: if_acmpeq +239 -> 545
/*    */     //   309: getstatic 50	aeolian/composer$fn__9849$map_metrics__9854:const__0	Lclojure/lang/Var;
/*    */     //   312: invokevirtual 55	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   315: dup
/*    */     //   316: ifnull +57 -> 373
/*    */     //   319: getstatic 40	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
/*    */     //   322: if_acmpeq +52 -> 374
/*    */     //   325: getstatic 50	aeolian/composer$fn__9849$map_metrics__9854:const__0	Lclojure/lang/Var;
/*    */     //   328: invokevirtual 55	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   331: checkcast 57	clojure/lang/IFn
/*    */     //   334: getstatic 132	aeolian/composer$fn__9849$map_metrics__9854:const__11	Lclojure/lang/Keyword;
/*    */     //   337: getstatic 65	aeolian/composer$fn__9849$map_metrics__9854:const__2	Lclojure/lang/AFn;
/*    */     //   340: aload_0
/*    */     //   341: getfield 24	aeolian/composer$fn__9849$map_metrics__9854:output_schema9843	Ljava/lang/Object;
/*    */     //   344: getstatic 68	aeolian/composer$fn__9849$map_metrics__9854:const__3	Lclojure/lang/Var;
/*    */     //   347: invokevirtual 55	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   350: checkcast 57	clojure/lang/IFn
/*    */     //   353: aload_0
/*    */     //   354: getfield 20	aeolian/composer$fn__9849$map_metrics__9854:output_checker9846	Ljava/lang/Object;
/*    */     //   357: invokeinterface 71 2 0
/*    */     //   362: aload 4
/*    */     //   364: invokeinterface 74 6 0
/*    */     //   369: pop
/*    */     //   370: goto +171 -> 541
/*    */     //   373: pop
/*    */     //   374: getstatic 68	aeolian/composer$fn__9849$map_metrics__9854:const__3	Lclojure/lang/Var;
/*    */     //   377: invokevirtual 55	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   380: checkcast 57	clojure/lang/IFn
/*    */     //   383: aload_0
/*    */     //   384: getfield 20	aeolian/composer$fn__9849$map_metrics__9854:output_checker9846	Ljava/lang/Object;
/*    */     //   387: invokeinterface 71 2 0
/*    */     //   392: checkcast 57	clojure/lang/IFn
/*    */     //   395: aload 4
/*    */     //   397: invokeinterface 71 2 0
/*    */     //   402: astore 5
/*    */     //   404: aload 5
/*    */     //   406: dup
/*    */     //   407: ifnull +131 -> 538
/*    */     //   410: getstatic 40	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
/*    */     //   413: if_acmpeq +126 -> 539
/*    */     //   416: aload 5
/*    */     //   418: aconst_null
/*    */     //   419: astore 5
/*    */     //   421: astore 6
/*    */     //   423: new 76	clojure/lang/ExceptionInfo
/*    */     //   426: dup
/*    */     //   427: getstatic 79	aeolian/composer$fn__9849$map_metrics__9854:const__4	Lclojure/lang/Var;
/*    */     //   430: invokevirtual 55	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   433: checkcast 57	clojure/lang/IFn
/*    */     //   436: ldc -122
/*    */     //   438: getstatic 65	aeolian/composer$fn__9849$map_metrics__9854:const__2	Lclojure/lang/AFn;
/*    */     //   441: getstatic 84	aeolian/composer$fn__9849$map_metrics__9854:const__5	Lclojure/lang/Var;
/*    */     //   444: invokevirtual 55	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   447: checkcast 57	clojure/lang/IFn
/*    */     //   450: aload 6
/*    */     //   452: invokeinterface 71 2 0
/*    */     //   457: invokeinterface 87 4 0
/*    */     //   462: checkcast 89	java/lang/String
/*    */     //   465: bipush 8
/*    */     //   467: anewarray 91	java/lang/Object
/*    */     //   470: dup
/*    */     //   471: iconst_0
/*    */     //   472: getstatic 94	aeolian/composer$fn__9849$map_metrics__9854:const__6	Lclojure/lang/Keyword;
/*    */     //   475: aastore
/*    */     //   476: dup
/*    */     //   477: iconst_1
/*    */     //   478: getstatic 97	aeolian/composer$fn__9849$map_metrics__9854:const__7	Lclojure/lang/Keyword;
/*    */     //   481: aastore
/*    */     //   482: dup
/*    */     //   483: iconst_2
/*    */     //   484: getstatic 100	aeolian/composer$fn__9849$map_metrics__9854:const__8	Lclojure/lang/Keyword;
/*    */     //   487: aastore
/*    */     //   488: dup
/*    */     //   489: iconst_3
/*    */     //   490: aload_0
/*    */     //   491: getfield 24	aeolian/composer$fn__9849$map_metrics__9854:output_schema9843	Ljava/lang/Object;
/*    */     //   494: aastore
/*    */     //   495: dup
/*    */     //   496: iconst_4
/*    */     //   497: getstatic 103	aeolian/composer$fn__9849$map_metrics__9854:const__9	Lclojure/lang/Keyword;
/*    */     //   500: aastore
/*    */     //   501: dup
/*    */     //   502: iconst_5
/*    */     //   503: aload 4
/*    */     //   505: aastore
/*    */     //   506: dup
/*    */     //   507: bipush 6
/*    */     //   509: getstatic 106	aeolian/composer$fn__9849$map_metrics__9854:const__10	Lclojure/lang/Keyword;
/*    */     //   512: aastore
/*    */     //   513: dup
/*    */     //   514: bipush 7
/*    */     //   516: aload 6
/*    */     //   518: aconst_null
/*    */     //   519: astore 6
/*    */     //   521: aastore
/*    */     //   522: invokestatic 112	clojure/lang/RT:mapUniqueKeys	([Ljava/lang/Object;)Lclojure/lang/IPersistentMap;
/*    */     //   525: checkcast 114	clojure/lang/IPersistentMap
/*    */     //   528: invokespecial 117	clojure/lang/ExceptionInfo:<init>	(Ljava/lang/String;Lclojure/lang/IPersistentMap;)V
/*    */     //   531: checkcast 119	java/lang/Throwable
/*    */     //   534: athrow
/*    */     //   535: goto +6 -> 541
/*    */     //   538: pop
/*    */     //   539: aconst_null
/*    */     //   540: pop
/*    */     //   541: goto +6 -> 547
/*    */     //   544: pop
/*    */     //   545: aconst_null
/*    */     //   546: pop
/*    */     //   547: aload 4
/*    */     //   549: aconst_null
/*    */     //   550: astore 4
/*    */     //   552: areturn
/*    */     // Line number table:
/*    */     //   Java source line #78	-> byte code offset #0
/*    */     //   Java source line #78	-> byte code offset #7
/*    */     //   Java source line #78	-> byte code offset #11
/*    */     //   Java source line #78	-> byte code offset #29
/*    */     //   Java source line #78	-> byte code offset #51
/*    */     //   Java source line #78	-> byte code offset #70
/*    */     //   Java source line #78	-> byte code offset #77
/*    */     //   Java source line #78	-> byte code offset #87
/*    */     //   Java source line #78	-> byte code offset #103
/*    */     //   Java source line #78	-> byte code offset #110
/*    */     //   Java source line #78	-> byte code offset #115
/*    */     //   Java source line #78	-> byte code offset #120
/*    */     //   Java source line #78	-> byte code offset #127
/*    */     //   Java source line #78	-> byte code offset #156
/*    */     //   Java source line #78	-> byte code offset #170
/*    */     //   Java source line #78	-> byte code offset #175
/*    */     //   Java source line #78	-> byte code offset #180
/*    */     //   Java source line #78	-> byte code offset #286
/*    */     //   Java source line #78	-> byte code offset #289
/*    */     //   Java source line #78	-> byte code offset #296
/*    */     //   Java source line #78	-> byte code offset #309
/*    */     //   Java source line #78	-> byte code offset #331
/*    */     //   Java source line #78	-> byte code offset #350
/*    */     //   Java source line #78	-> byte code offset #357
/*    */     //   Java source line #78	-> byte code offset #364
/*    */     //   Java source line #78	-> byte code offset #380
/*    */     //   Java source line #78	-> byte code offset #387
/*    */     //   Java source line #78	-> byte code offset #392
/*    */     //   Java source line #78	-> byte code offset #397
/*    */     //   Java source line #78	-> byte code offset #404
/*    */     //   Java source line #78	-> byte code offset #433
/*    */     //   Java source line #78	-> byte code offset #447
/*    */     //   Java source line #78	-> byte code offset #452
/*    */     //   Java source line #78	-> byte code offset #457
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	552	0	this	Object
/*    */     //   0	552	1	G__9847	Object
/*    */     //   0	552	2	G__9848	Object
/*    */     //   11	541	3	validate__8479__auto__9866	Object
/*    */     //   29	238	4	args__8480__auto__9862	Object
/*    */     //   296	256	4	o__8482__auto__9865	Object
/*    */     //   127	140	5	temp__4657__auto__9861	Object
/*    */     //   404	137	5	temp__4657__auto__9864	Object
/*    */     //   146	115	6	error__8481__auto__9860	Object
/*    */     //   423	112	6	error__8481__auto__9863	Object
/*    */   }
/*    */ }


/* Location:              /home/amarks/code/aeolian/target/aeolian-0.1.1-SNAPSHOT.jar!/aeolian/composer$fn__9849$map_metrics__9854.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */