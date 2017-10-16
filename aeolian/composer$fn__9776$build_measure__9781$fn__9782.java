/*    */ package aeolian;
/*    */ 
/*    */ import clojure.lang.AFunction;
/*    */ import clojure.lang.ILookupThunk;
/*    */ import clojure.lang.Keyword;
/*    */ import clojure.lang.KeywordLookupSite;
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
/*    */ public final class composer$fn__9776$build_measure__9781$fn__9782
/*    */   extends AFunction
/*    */ {
/*    */   public composer$fn__9776$build_measure__9781$fn__9782(Object paramObject1, Object paramObject2, Object paramObject3)
/*    */   {
/* 45 */     this.G__9773 = paramObject1;this.G__9774 = paramObject2;this.G__9775 = paramObject3; } static ILookupThunk __thunk__5__ = __site__5__ = new KeywordLookupSite(RT.keyword(null, "method-length")); static final KeywordLookupSite __site__5__; static ILookupThunk __thunk__4__ = __site__4__ = new KeywordLookupSite(RT.keyword(null, "notes")); static final KeywordLookupSite __site__4__; static ILookupThunk __thunk__3__ = __site__3__ = new KeywordLookupSite(RT.keyword(null, "complexity")); static final KeywordLookupSite __site__3__; static ILookupThunk __thunk__2__ = __site__2__ = new KeywordLookupSite(RT.keyword(null, "source-file")); static final KeywordLookupSite __site__2__; static ILookupThunk __thunk__1__ = __site__1__ = new KeywordLookupSite(RT.keyword(null, "author")); static final KeywordLookupSite __site__1__; static ILookupThunk __thunk__0__ = __site__0__ = new KeywordLookupSite(RT.keyword(null, "line-length")); static final KeywordLookupSite __site__0__; public static final Var const__14 = (Var)RT.var("clojure.core", "next"); public static final Keyword const__13 = (Keyword)RT.keyword(null, "method-length"); public static final Var const__12 = (Var)RT.var("clojure.core", "conj"); public static final Keyword const__11 = (Keyword)RT.keyword(null, "notes"); public static final Var const__9 = (Var)RT.var("aeolian.composer", "build-tempo"); public static final Var const__7 = (Var)RT.var("aeolian.composer", "build-lyrics"); public static final Var const__5 = (Var)RT.var("aeolian.composer", "build-instrument"); public static final Var const__3 = (Var)RT.var("aeolian.composer", "build-note"); public static final Var const__2 = (Var)RT.var("aeolian.abc.core", "note"); public static final Var const__1 = (Var)RT.var("clojure.core", "first"); public static final Var const__0 = (Var)RT.var("clojure.core", "not");
/*    */   Object G__9775;
/*    */   Object G__9774;
/*    */   Object G__9773;
/*    */   
/*    */   /* Error */
/*    */   public Object invoke()
/*    */   {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield 16	aeolian/composer$fn__9776$build_measure__9781$fn__9782:G__9773	Ljava/lang/Object;
/*    */     //   4: aload_0
/*    */     //   5: aconst_null
/*    */     //   6: putfield 16	aeolian/composer$fn__9776$build_measure__9781$fn__9782:G__9773	Ljava/lang/Object;
/*    */     //   9: astore_1
/*    */     //   10: aload_0
/*    */     //   11: getfield 18	aeolian/composer$fn__9776$build_measure__9781$fn__9782:G__9774	Ljava/lang/Object;
/*    */     //   14: aload_0
/*    */     //   15: aconst_null
/*    */     //   16: putfield 18	aeolian/composer$fn__9776$build_measure__9781$fn__9782:G__9774	Ljava/lang/Object;
/*    */     //   19: astore_2
/*    */     //   20: aload_0
/*    */     //   21: getfield 20	aeolian/composer$fn__9776$build_measure__9781$fn__9782:G__9775	Ljava/lang/Object;
/*    */     //   24: aload_0
/*    */     //   25: aconst_null
/*    */     //   26: putfield 20	aeolian/composer$fn__9776$build_measure__9781$fn__9782:G__9775	Ljava/lang/Object;
/*    */     //   29: astore_3
/*    */     //   30: getstatic 28	clojure/lang/PersistentArrayMap:EMPTY	Lclojure/lang/PersistentArrayMap;
/*    */     //   33: astore 4
/*    */     //   35: aload_1
/*    */     //   36: aconst_null
/*    */     //   37: astore_1
/*    */     //   38: astore 5
/*    */     //   40: aload_3
/*    */     //   41: aconst_null
/*    */     //   42: astore_3
/*    */     //   43: astore 6
/*    */     //   45: getstatic 32	aeolian/composer$fn__9776$build_measure__9781$fn__9782:const__0	Lclojure/lang/Var;
/*    */     //   48: invokevirtual 37	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   51: checkcast 39	clojure/lang/IFn
/*    */     //   54: aload 5
/*    */     //   56: invokeinterface 42 2 0
/*    */     //   61: dup
/*    */     //   62: ifnull +17 -> 79
/*    */     //   65: getstatic 48	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
/*    */     //   68: if_acmpeq +12 -> 80
/*    */     //   71: aload 4
/*    */     //   73: aconst_null
/*    */     //   74: astore 4
/*    */     //   76: goto +430 -> 506
/*    */     //   79: pop
/*    */     //   80: getstatic 51	aeolian/composer$fn__9776$build_measure__9781$fn__9782:const__1	Lclojure/lang/Var;
/*    */     //   83: invokevirtual 37	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   86: checkcast 39	clojure/lang/IFn
/*    */     //   89: aload 5
/*    */     //   91: invokeinterface 42 2 0
/*    */     //   96: astore 7
/*    */     //   98: getstatic 54	aeolian/composer$fn__9776$build_measure__9781$fn__9782:const__2	Lclojure/lang/Var;
/*    */     //   101: invokevirtual 37	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   104: checkcast 39	clojure/lang/IFn
/*    */     //   107: getstatic 57	aeolian/composer$fn__9776$build_measure__9781$fn__9782:const__3	Lclojure/lang/Var;
/*    */     //   110: invokevirtual 37	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   113: checkcast 39	clojure/lang/IFn
/*    */     //   116: getstatic 61	aeolian/composer$fn__9776$build_measure__9781$fn__9782:__thunk__0__	Lclojure/lang/ILookupThunk;
/*    */     //   119: dup
/*    */     //   120: aload 7
/*    */     //   122: dup_x2
/*    */     //   123: invokeinterface 66 2 0
/*    */     //   128: dup_x2
/*    */     //   129: if_acmpeq +7 -> 136
/*    */     //   132: pop
/*    */     //   133: goto +25 -> 158
/*    */     //   136: swap
/*    */     //   137: pop
/*    */     //   138: dup
/*    */     //   139: getstatic 70	aeolian/composer$fn__9776$build_measure__9781$fn__9782:__site__0__	Lclojure/lang/KeywordLookupSite;
/*    */     //   142: swap
/*    */     //   143: invokeinterface 76 2 0
/*    */     //   148: dup
/*    */     //   149: putstatic 61	aeolian/composer$fn__9776$build_measure__9781$fn__9782:__thunk__0__	Lclojure/lang/ILookupThunk;
/*    */     //   152: swap
/*    */     //   153: invokeinterface 66 2 0
/*    */     //   158: aload_2
/*    */     //   159: invokeinterface 79 3 0
/*    */     //   164: getstatic 82	aeolian/composer$fn__9776$build_measure__9781$fn__9782:const__5	Lclojure/lang/Var;
/*    */     //   167: invokevirtual 37	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   170: checkcast 39	clojure/lang/IFn
/*    */     //   173: getstatic 85	aeolian/composer$fn__9776$build_measure__9781$fn__9782:__thunk__1__	Lclojure/lang/ILookupThunk;
/*    */     //   176: dup
/*    */     //   177: aload 7
/*    */     //   179: dup_x2
/*    */     //   180: invokeinterface 66 2 0
/*    */     //   185: dup_x2
/*    */     //   186: if_acmpeq +7 -> 193
/*    */     //   189: pop
/*    */     //   190: goto +25 -> 215
/*    */     //   193: swap
/*    */     //   194: pop
/*    */     //   195: dup
/*    */     //   196: getstatic 88	aeolian/composer$fn__9776$build_measure__9781$fn__9782:__site__1__	Lclojure/lang/KeywordLookupSite;
/*    */     //   199: swap
/*    */     //   200: invokeinterface 76 2 0
/*    */     //   205: dup
/*    */     //   206: putstatic 85	aeolian/composer$fn__9776$build_measure__9781$fn__9782:__thunk__1__	Lclojure/lang/ILookupThunk;
/*    */     //   209: swap
/*    */     //   210: invokeinterface 66 2 0
/*    */     //   215: invokeinterface 42 2 0
/*    */     //   220: getstatic 91	aeolian/composer$fn__9776$build_measure__9781$fn__9782:const__7	Lclojure/lang/Var;
/*    */     //   223: invokevirtual 37	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   226: checkcast 39	clojure/lang/IFn
/*    */     //   229: getstatic 94	aeolian/composer$fn__9776$build_measure__9781$fn__9782:__thunk__2__	Lclojure/lang/ILookupThunk;
/*    */     //   232: dup
/*    */     //   233: aload 7
/*    */     //   235: dup_x2
/*    */     //   236: invokeinterface 66 2 0
/*    */     //   241: dup_x2
/*    */     //   242: if_acmpeq +7 -> 249
/*    */     //   245: pop
/*    */     //   246: goto +25 -> 271
/*    */     //   249: swap
/*    */     //   250: pop
/*    */     //   251: dup
/*    */     //   252: getstatic 97	aeolian/composer$fn__9776$build_measure__9781$fn__9782:__site__2__	Lclojure/lang/KeywordLookupSite;
/*    */     //   255: swap
/*    */     //   256: invokeinterface 76 2 0
/*    */     //   261: dup
/*    */     //   262: putstatic 94	aeolian/composer$fn__9776$build_measure__9781$fn__9782:__thunk__2__	Lclojure/lang/ILookupThunk;
/*    */     //   265: swap
/*    */     //   266: invokeinterface 66 2 0
/*    */     //   271: invokeinterface 42 2 0
/*    */     //   276: getstatic 100	aeolian/composer$fn__9776$build_measure__9781$fn__9782:const__9	Lclojure/lang/Var;
/*    */     //   279: invokevirtual 37	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   282: checkcast 39	clojure/lang/IFn
/*    */     //   285: getstatic 103	aeolian/composer$fn__9776$build_measure__9781$fn__9782:__thunk__3__	Lclojure/lang/ILookupThunk;
/*    */     //   288: dup
/*    */     //   289: aload 7
/*    */     //   291: dup_x2
/*    */     //   292: invokeinterface 66 2 0
/*    */     //   297: dup_x2
/*    */     //   298: if_acmpeq +7 -> 305
/*    */     //   301: pop
/*    */     //   302: goto +25 -> 327
/*    */     //   305: swap
/*    */     //   306: pop
/*    */     //   307: dup
/*    */     //   308: getstatic 106	aeolian/composer$fn__9776$build_measure__9781$fn__9782:__site__3__	Lclojure/lang/KeywordLookupSite;
/*    */     //   311: swap
/*    */     //   312: invokeinterface 76 2 0
/*    */     //   317: dup
/*    */     //   318: putstatic 103	aeolian/composer$fn__9776$build_measure__9781$fn__9782:__thunk__3__	Lclojure/lang/ILookupThunk;
/*    */     //   321: swap
/*    */     //   322: invokeinterface 66 2 0
/*    */     //   327: invokeinterface 42 2 0
/*    */     //   332: invokeinterface 109 5 0
/*    */     //   337: astore 8
/*    */     //   339: iconst_4
/*    */     //   340: anewarray 111	java/lang/Object
/*    */     //   343: dup
/*    */     //   344: iconst_0
/*    */     //   345: getstatic 115	aeolian/composer$fn__9776$build_measure__9781$fn__9782:const__11	Lclojure/lang/Keyword;
/*    */     //   348: aastore
/*    */     //   349: dup
/*    */     //   350: iconst_1
/*    */     //   351: getstatic 118	aeolian/composer$fn__9776$build_measure__9781$fn__9782:const__12	Lclojure/lang/Var;
/*    */     //   354: invokevirtual 37	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   357: checkcast 39	clojure/lang/IFn
/*    */     //   360: getstatic 121	aeolian/composer$fn__9776$build_measure__9781$fn__9782:__thunk__4__	Lclojure/lang/ILookupThunk;
/*    */     //   363: dup
/*    */     //   364: aload 4
/*    */     //   366: aconst_null
/*    */     //   367: astore 4
/*    */     //   369: dup_x2
/*    */     //   370: invokeinterface 66 2 0
/*    */     //   375: dup_x2
/*    */     //   376: if_acmpeq +7 -> 383
/*    */     //   379: pop
/*    */     //   380: goto +25 -> 405
/*    */     //   383: swap
/*    */     //   384: pop
/*    */     //   385: dup
/*    */     //   386: getstatic 124	aeolian/composer$fn__9776$build_measure__9781$fn__9782:__site__4__	Lclojure/lang/KeywordLookupSite;
/*    */     //   389: swap
/*    */     //   390: invokeinterface 76 2 0
/*    */     //   395: dup
/*    */     //   396: putstatic 121	aeolian/composer$fn__9776$build_measure__9781$fn__9782:__thunk__4__	Lclojure/lang/ILookupThunk;
/*    */     //   399: swap
/*    */     //   400: invokeinterface 66 2 0
/*    */     //   405: aload 8
/*    */     //   407: aconst_null
/*    */     //   408: astore 8
/*    */     //   410: invokeinterface 79 3 0
/*    */     //   415: aastore
/*    */     //   416: dup
/*    */     //   417: iconst_2
/*    */     //   418: getstatic 127	aeolian/composer$fn__9776$build_measure__9781$fn__9782:const__13	Lclojure/lang/Keyword;
/*    */     //   421: aastore
/*    */     //   422: dup
/*    */     //   423: iconst_3
/*    */     //   424: aload 6
/*    */     //   426: aconst_null
/*    */     //   427: astore 6
/*    */     //   429: aastore
/*    */     //   430: invokestatic 133	clojure/lang/RT:mapUniqueKeys	([Ljava/lang/Object;)Lclojure/lang/IPersistentMap;
/*    */     //   433: getstatic 136	aeolian/composer$fn__9776$build_measure__9781$fn__9782:const__14	Lclojure/lang/Var;
/*    */     //   436: invokevirtual 37	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   439: checkcast 39	clojure/lang/IFn
/*    */     //   442: aload 5
/*    */     //   444: aconst_null
/*    */     //   445: astore 5
/*    */     //   447: invokeinterface 42 2 0
/*    */     //   452: getstatic 139	aeolian/composer$fn__9776$build_measure__9781$fn__9782:__thunk__5__	Lclojure/lang/ILookupThunk;
/*    */     //   455: dup
/*    */     //   456: aload 7
/*    */     //   458: aconst_null
/*    */     //   459: astore 7
/*    */     //   461: dup_x2
/*    */     //   462: invokeinterface 66 2 0
/*    */     //   467: dup_x2
/*    */     //   468: if_acmpeq +7 -> 475
/*    */     //   471: pop
/*    */     //   472: goto +25 -> 497
/*    */     //   475: swap
/*    */     //   476: pop
/*    */     //   477: dup
/*    */     //   478: getstatic 142	aeolian/composer$fn__9776$build_measure__9781$fn__9782:__site__5__	Lclojure/lang/KeywordLookupSite;
/*    */     //   481: swap
/*    */     //   482: invokeinterface 76 2 0
/*    */     //   487: dup
/*    */     //   488: putstatic 139	aeolian/composer$fn__9776$build_measure__9781$fn__9782:__thunk__5__	Lclojure/lang/ILookupThunk;
/*    */     //   491: swap
/*    */     //   492: invokeinterface 66 2 0
/*    */     //   497: astore 6
/*    */     //   499: astore 5
/*    */     //   501: astore 4
/*    */     //   503: goto -458 -> 45
/*    */     //   506: areturn
/*    */     // Line number table:
/*    */     //   Java source line #45	-> byte code offset #0
/*    */     //   Java source line #52	-> byte code offset #45
/*    */     //   Java source line #52	-> byte code offset #51
/*    */     //   Java source line #52	-> byte code offset #56
/*    */     //   Java source line #54	-> byte code offset #86
/*    */     //   Java source line #54	-> byte code offset #91
/*    */     //   Java source line #55	-> byte code offset #104
/*    */     //   Java source line #56	-> byte code offset #113
/*    */     //   Java source line #56	-> byte code offset #116
/*    */     //   Java source line #56	-> byte code offset #122
/*    */     //   Java source line #56	-> byte code offset #159
/*    */     //   Java source line #57	-> byte code offset #170
/*    */     //   Java source line #57	-> byte code offset #173
/*    */     //   Java source line #57	-> byte code offset #179
/*    */     //   Java source line #57	-> byte code offset #215
/*    */     //   Java source line #58	-> byte code offset #226
/*    */     //   Java source line #58	-> byte code offset #229
/*    */     //   Java source line #58	-> byte code offset #235
/*    */     //   Java source line #58	-> byte code offset #271
/*    */     //   Java source line #59	-> byte code offset #282
/*    */     //   Java source line #59	-> byte code offset #285
/*    */     //   Java source line #59	-> byte code offset #291
/*    */     //   Java source line #59	-> byte code offset #327
/*    */     //   Java source line #55	-> byte code offset #332
/*    */     //   Java source line #61	-> byte code offset #357
/*    */     //   Java source line #61	-> byte code offset #360
/*    */     //   Java source line #61	-> byte code offset #369
/*    */     //   Java source line #61	-> byte code offset #410
/*    */     //   Java source line #62	-> byte code offset #439
/*    */     //   Java source line #62	-> byte code offset #447
/*    */     //   Java source line #63	-> byte code offset #452
/*    */     //   Java source line #63	-> byte code offset #461
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	506	0	this	Object
/*    */     //   10	496	1	measure_lines_metrics	Object
/*    */     //   20	486	2	composition_key	Object
/*    */     //   30	476	3	method_length	Object
/*    */     //   35	471	4	measure	Object
/*    */     //   40	466	5	remaining_line_metrics	Object
/*    */     //   45	461	6	current_method_length	Object
/*    */     //   98	408	7	metric_components	Object
/*    */     //   339	167	8	final_note	Object
/*    */   }
/*    */ }


/* Location:              /home/amarks/code/aeolian/target/aeolian-0.1.1-SNAPSHOT.jar!/aeolian/composer$fn__9776$build_measure__9781$fn__9782.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */