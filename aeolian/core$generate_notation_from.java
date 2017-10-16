/*    */ package aeolian;
/*    */ 
/*    */ import clojure.lang.AFunction;
/*    */ import clojure.lang.Keyword;
/*    */ import clojure.lang.RT;
/*    */ import clojure.lang.Var;
/*    */ 
/*    */ public final class core$generate_notation_from
/*    */   extends AFunction
/*    */ {
/*    */   /* Error */
/*    */   public static Object invokeStatic(Object input_file_name, Object output_file_name, Object duplicate_metrics)
/*    */   {
/*    */     // Byte code:
/*    */     //   0: getstatic 15	aeolian/core$generate_notation_from:const__0	Lclojure/lang/Var;
/*    */     //   3: invokevirtual 21	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   6: checkcast 23	clojure/lang/IFn
/*    */     //   9: aload_0
/*    */     //   10: invokeinterface 27 2 0
/*    */     //   15: astore_3
/*    */     //   16: getstatic 30	aeolian/core$generate_notation_from:const__1	Lclojure/lang/Var;
/*    */     //   19: invokevirtual 21	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   22: checkcast 23	clojure/lang/IFn
/*    */     //   25: aload_2
/*    */     //   26: aconst_null
/*    */     //   27: astore_2
/*    */     //   28: invokeinterface 27 2 0
/*    */     //   33: astore 4
/*    */     //   35: getstatic 33	aeolian/core$generate_notation_from:const__2	Lclojure/lang/Var;
/*    */     //   38: invokevirtual 21	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   41: checkcast 23	clojure/lang/IFn
/*    */     //   44: new 35	aeolian/core$generate_notation_from$fn__9944
/*    */     //   47: dup
/*    */     //   48: invokespecial 36	aeolian/core$generate_notation_from$fn__9944:<init>	()V
/*    */     //   51: getstatic 39	aeolian/core$generate_notation_from:const__3	Lclojure/lang/Var;
/*    */     //   54: invokevirtual 21	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   57: checkcast 23	clojure/lang/IFn
/*    */     //   60: aload_3
/*    */     //   61: invokeinterface 27 2 0
/*    */     //   66: invokeinterface 42 3 0
/*    */     //   71: astore 5
/*    */     //   73: getstatic 45	aeolian/core$generate_notation_from:const__4	Lclojure/lang/Var;
/*    */     //   76: invokevirtual 21	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   79: checkcast 23	clojure/lang/IFn
/*    */     //   82: aload 5
/*    */     //   84: aconst_null
/*    */     //   85: astore 5
/*    */     //   87: aload 4
/*    */     //   89: invokeinterface 42 3 0
/*    */     //   94: astore 6
/*    */     //   96: getstatic 48	aeolian/core$generate_notation_from:const__5	Lclojure/lang/Var;
/*    */     //   99: invokevirtual 21	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   102: checkcast 23	clojure/lang/IFn
/*    */     //   105: aload_1
/*    */     //   106: getstatic 51	aeolian/core$generate_notation_from:const__6	Lclojure/lang/Var;
/*    */     //   109: invokevirtual 21	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   112: checkcast 23	clojure/lang/IFn
/*    */     //   115: getstatic 54	aeolian/core$generate_notation_from:const__7	Lclojure/lang/Var;
/*    */     //   118: invokevirtual 21	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   121: checkcast 23	clojure/lang/IFn
/*    */     //   124: aload_0
/*    */     //   125: aconst_null
/*    */     //   126: astore_0
/*    */     //   127: aload 4
/*    */     //   129: aconst_null
/*    */     //   130: astore 4
/*    */     //   132: invokeinterface 42 3 0
/*    */     //   137: aload 6
/*    */     //   139: aconst_null
/*    */     //   140: astore 6
/*    */     //   142: invokeinterface 42 3 0
/*    */     //   147: invokeinterface 42 3 0
/*    */     //   152: pop
/*    */     //   153: getstatic 57	aeolian/core$generate_notation_from:const__8	Lclojure/lang/Var;
/*    */     //   156: invokevirtual 21	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   159: checkcast 23	clojure/lang/IFn
/*    */     //   162: getstatic 60	aeolian/core$generate_notation_from:const__9	Lclojure/lang/Var;
/*    */     //   165: invokevirtual 63	clojure/lang/Var:get	()Ljava/lang/Object;
/*    */     //   168: getstatic 67	aeolian/core$generate_notation_from:const__10	Lclojure/lang/Keyword;
/*    */     //   171: ldc 69
/*    */     //   173: ldc 71
/*    */     //   175: getstatic 75	aeolian/core$generate_notation_from:const__11	Ljava/lang/Object;
/*    */     //   178: getstatic 78	aeolian/core$generate_notation_from:const__12	Lclojure/lang/Keyword;
/*    */     //   181: getstatic 81	aeolian/core$generate_notation_from:const__13	Lclojure/lang/Keyword;
/*    */     //   184: new 83	clojure/lang/Delay
/*    */     //   187: dup
/*    */     //   188: new 85	aeolian/core$generate_notation_from$fn__9946
/*    */     //   191: dup
/*    */     //   192: aload_1
/*    */     //   193: aconst_null
/*    */     //   194: astore_1
/*    */     //   195: invokespecial 88	aeolian/core$generate_notation_from$fn__9946:<init>	(Ljava/lang/Object;)V
/*    */     //   198: checkcast 23	clojure/lang/IFn
/*    */     //   201: invokespecial 91	clojure/lang/Delay:<init>	(Lclojure/lang/IFn;)V
/*    */     //   204: aconst_null
/*    */     //   205: getstatic 94	aeolian/core$generate_notation_from:const__14	Ljava/lang/Object;
/*    */     //   208: invokeinterface 97 11 0
/*    */     //   213: astore 7
/*    */     //   215: aload_3
/*    */     //   216: aconst_null
/*    */     //   217: astore_3
/*    */     //   218: checkcast 102	java/io/Reader
/*    */     //   221: invokevirtual 105	java/io/Reader:close	()V
/*    */     //   224: aconst_null
/*    */     //   225: pop
/*    */     //   226: goto +19 -> 245
/*    */     //   229: astore 8
/*    */     //   231: aload_3
/*    */     //   232: aconst_null
/*    */     //   233: astore_3
/*    */     //   234: checkcast 102	java/io/Reader
/*    */     //   237: invokevirtual 105	java/io/Reader:close	()V
/*    */     //   240: aconst_null
/*    */     //   241: pop
/*    */     //   242: aload 8
/*    */     //   244: athrow
/*    */     //   245: aload 7
/*    */     //   247: areturn
/*    */     // Line number table:
/*    */     //   Java source line #19	-> byte code offset #0
/*    */     //   Java source line #24	-> byte code offset #6
/*    */     //   Java source line #24	-> byte code offset #10
/*    */     //   Java source line #25	-> byte code offset #22
/*    */     //   Java source line #25	-> byte code offset #28
/*    */     //   Java source line #26	-> byte code offset #41
/*    */     //   Java source line #26	-> byte code offset #57
/*    */     //   Java source line #26	-> byte code offset #61
/*    */     //   Java source line #26	-> byte code offset #66
/*    */     //   Java source line #27	-> byte code offset #79
/*    */     //   Java source line #27	-> byte code offset #89
/*    */     //   Java source line #28	-> byte code offset #102
/*    */     //   Java source line #28	-> byte code offset #112
/*    */     //   Java source line #28	-> byte code offset #121
/*    */     //   Java source line #28	-> byte code offset #132
/*    */     //   Java source line #28	-> byte code offset #142
/*    */     //   Java source line #28	-> byte code offset #147
/*    */     //   Java source line #29	-> byte code offset #159
/*    */     //   Java source line #29	-> byte code offset #208
/*    */     //   Java source line #24	-> byte code offset #221
/*    */     //   Java source line #24	-> byte code offset #237
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	247	0	input_file_name	Object
/*    */     //   0	247	1	output_file_name	Object
/*    */     //   0	247	2	duplicate_metrics	Object
/*    */     //   15	219	3	rdr	Object
/*    */     //   33	98	4	composition_key	Object
/*    */     //   71	15	5	parsed_metrics	Object
/*    */     //   94	47	6	composition	Object
/*    */     //   213	33	7	localObject1	Object
/*    */     //   229	14	8	localObject2	Object
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   16	215	229	finally
/*    */   }
/*    */   
/*    */   public Object invoke(Object paramObject1, Object paramObject2, Object paramObject3)
/*    */   {
/* 19 */     paramObject1 = null;paramObject2 = null;paramObject3 = null;return invokeStatic(paramObject1, paramObject2, paramObject3); } public static final Object const__14 = Integer.valueOf(1192640903); public static final Keyword const__13 = (Keyword)RT.keyword(null, "auto"); public static final Keyword const__12 = (Keyword)RT.keyword(null, "p"); public static final Object const__11 = Integer.valueOf(29); public static final Keyword const__10 = (Keyword)RT.keyword(null, "info"); public static final Var const__9 = (Var)RT.var("taoensso.timbre", "*config*"); public static final Var const__8 = (Var)RT.var("taoensso.timbre", "-log!"); public static final Var const__7 = (Var)RT.var("aeolian.core", "build-header"); public static final Var const__6 = (Var)RT.var("clojure.core", "str"); public static final Var const__5 = (Var)RT.var("clojure.core", "spit"); public static final Var const__4 = (Var)RT.var("aeolian.composer", "compose"); public static final Var const__3 = (Var)RT.var("clojure.core", "line-seq"); public static final Var const__2 = (Var)RT.var("clojure.core", "map"); public static final Var const__1 = (Var)RT.var("aeolian.abc.key", "determine-key"); public static final Var const__0 = (Var)RT.var("clojure.java.io", "reader");
/*    */ }


/* Location:              /home/amarks/code/aeolian/target/aeolian-0.1.1-SNAPSHOT.jar!/aeolian/core$generate_notation_from.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */