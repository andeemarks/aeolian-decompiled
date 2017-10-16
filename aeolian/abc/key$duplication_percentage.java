/*   */ package aeolian.abc;
/*   */ 
/*   */ import clojure.lang.AFunction;
/*   */ import clojure.lang.ILookupThunk;
/*   */ import clojure.lang.KeywordLookupSite;
/*   */ import clojure.lang.RT;
/*   */ 
/*   */ public final class key$duplication_percentage
/*   */   extends AFunction
/*   */ {
/*   */   /* Error */
/*   */   public static Object invokeStatic(Object duplicate_metrics)
/*   */   {
/*   */     // Byte code:
/*   */     //   0: getstatic 15	aeolian/abc/key$duplication_percentage:__thunk__0__	Lclojure/lang/ILookupThunk;
/*   */     //   3: dup
/*   */     //   4: aload_0
/*   */     //   5: dup_x2
/*   */     //   6: invokeinterface 20 2 0
/*   */     //   11: dup_x2
/*   */     //   12: if_acmpeq +7 -> 19
/*   */     //   15: pop
/*   */     //   16: goto +25 -> 41
/*   */     //   19: swap
/*   */     //   20: pop
/*   */     //   21: dup
/*   */     //   22: getstatic 24	aeolian/abc/key$duplication_percentage:__site__0__	Lclojure/lang/KeywordLookupSite;
/*   */     //   25: swap
/*   */     //   26: invokeinterface 30 2 0
/*   */     //   31: dup
/*   */     //   32: putstatic 15	aeolian/abc/key$duplication_percentage:__thunk__0__	Lclojure/lang/ILookupThunk;
/*   */     //   35: swap
/*   */     //   36: invokeinterface 20 2 0
/*   */     //   41: astore_1
/*   */     //   42: getstatic 33	aeolian/abc/key$duplication_percentage:__thunk__1__	Lclojure/lang/ILookupThunk;
/*   */     //   45: dup
/*   */     //   46: aload_0
/*   */     //   47: dup_x2
/*   */     //   48: invokeinterface 20 2 0
/*   */     //   53: dup_x2
/*   */     //   54: if_acmpeq +7 -> 61
/*   */     //   57: pop
/*   */     //   58: goto +25 -> 83
/*   */     //   61: swap
/*   */     //   62: pop
/*   */     //   63: dup
/*   */     //   64: getstatic 36	aeolian/abc/key$duplication_percentage:__site__1__	Lclojure/lang/KeywordLookupSite;
/*   */     //   67: swap
/*   */     //   68: invokeinterface 30 2 0
/*   */     //   73: dup
/*   */     //   74: putstatic 33	aeolian/abc/key$duplication_percentage:__thunk__1__	Lclojure/lang/ILookupThunk;
/*   */     //   77: swap
/*   */     //   78: invokeinterface 20 2 0
/*   */     //   83: invokestatic 42	clojure/lang/Numbers:isZero	(Ljava/lang/Object;)Z
/*   */     //   86: ifeq +10 -> 96
/*   */     //   89: getstatic 46	aeolian/abc/key$duplication_percentage:const__3	Ljava/lang/Object;
/*   */     //   92: goto +47 -> 139
/*   */     //   95: pop
/*   */     //   96: getstatic 49	aeolian/abc/key$duplication_percentage:__thunk__2__	Lclojure/lang/ILookupThunk;
/*   */     //   99: dup
/*   */     //   100: aload_0
/*   */     //   101: aconst_null
/*   */     //   102: astore_0
/*   */     //   103: dup_x2
/*   */     //   104: invokeinterface 20 2 0
/*   */     //   109: dup_x2
/*   */     //   110: if_acmpeq +7 -> 117
/*   */     //   113: pop
/*   */     //   114: goto +25 -> 139
/*   */     //   117: swap
/*   */     //   118: pop
/*   */     //   119: dup
/*   */     //   120: getstatic 52	aeolian/abc/key$duplication_percentage:__site__2__	Lclojure/lang/KeywordLookupSite;
/*   */     //   123: swap
/*   */     //   124: invokeinterface 30 2 0
/*   */     //   129: dup
/*   */     //   130: putstatic 49	aeolian/abc/key$duplication_percentage:__thunk__2__	Lclojure/lang/ILookupThunk;
/*   */     //   133: swap
/*   */     //   134: invokeinterface 20 2 0
/*   */     //   139: astore_2
/*   */     //   140: ldc2_w 53
/*   */     //   143: aload_1
/*   */     //   144: aconst_null
/*   */     //   145: astore_1
/*   */     //   146: aload_2
/*   */     //   147: aconst_null
/*   */     //   148: astore_2
/*   */     //   149: invokestatic 58	clojure/lang/Numbers:divide	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Number;
/*   */     //   152: invokestatic 62	clojure/lang/Numbers:multiply	(JLjava/lang/Object;)Ljava/lang/Number;
/*   */     //   155: invokestatic 68	clojure/lang/RT:floatCast	(Ljava/lang/Object;)F
/*   */     //   158: invokestatic 74	java/lang/Float:valueOf	(F)Ljava/lang/Float;
/*   */     //   161: areturn
/*   */     // Line number table:
/*   */     //   Java source line #6	-> byte code offset #0
/*   */     //   Java source line #7	-> byte code offset #0
/*   */     //   Java source line #7	-> byte code offset #5
/*   */     //   Java source line #8	-> byte code offset #42
/*   */     //   Java source line #8	-> byte code offset #42
/*   */     //   Java source line #8	-> byte code offset #47
/*   */     //   Java source line #8	-> byte code offset #83
/*   */     //   Java source line #8	-> byte code offset #96
/*   */     //   Java source line #8	-> byte code offset #103
/*   */     //   Java source line #11	-> byte code offset #149
/*   */     //   Java source line #10	-> byte code offset #152
/*   */     //   Java source line #9	-> byte code offset #155
/*   */     // Local variable table:
/*   */     //   start	length	slot	name	signature
/*   */     //   0	161	0	duplicate_metrics	Object
/*   */     //   42	119	1	duplicate_lines	Object
/*   */     //   140	21	2	total_lines	Object
/*   */   }
/*   */   
/*   */   public Object invoke(Object paramObject)
/*   */   {
/* 6 */     paramObject = null;return invokeStatic(paramObject); } static ILookupThunk __thunk__2__ = __site__2__ = new KeywordLookupSite(RT.keyword(null, "total-lines")); static final KeywordLookupSite __site__2__; static ILookupThunk __thunk__1__ = __site__1__ = new KeywordLookupSite(RT.keyword(null, "total-lines")); static final KeywordLookupSite __site__1__; static ILookupThunk __thunk__0__ = __site__0__ = new KeywordLookupSite(RT.keyword(null, "duplicate-lines")); static final KeywordLookupSite __site__0__; public static final Object const__3 = Long.valueOf(1L);
/*   */ }


/* Location:              /home/amarks/code/aeolian/target/aeolian-0.1.1-SNAPSHOT.jar!/aeolian/abc/key$duplication_percentage.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */