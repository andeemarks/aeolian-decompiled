/*    */ package aeolian;
/*    */ 
/*    */ import clojure.lang.ISeq;
/*    */ import clojure.lang.Keyword;
/*    */ import clojure.lang.RT;
/*    */ import clojure.lang.RestFn;
/*    */ import clojure.lang.Var;
/*    */ 
/*    */ public final class core$_main
/*    */   extends RestFn
/*    */ {
/*    */   /* Error */
/*    */   public static Object invokeStatic(ISeq args)
/*    */   {
/*    */     // Byte code:
/*    */     //   0: getstatic 17	aeolian/core$_main:const__0	Lclojure/lang/Var;
/*    */     //   3: invokevirtual 23	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   6: checkcast 25	clojure/lang/IFn
/*    */     //   9: invokeinterface 28 1 0
/*    */     //   14: pop
/*    */     //   15: getstatic 31	aeolian/core$_main:const__1	Lclojure/lang/Var;
/*    */     //   18: invokevirtual 23	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   21: checkcast 25	clojure/lang/IFn
/*    */     //   24: aload_0
/*    */     //   25: invokeinterface 34 2 0
/*    */     //   30: astore_1
/*    */     //   31: aload_1
/*    */     //   32: dup
/*    */     //   33: ifnull +201 -> 234
/*    */     //   36: getstatic 40	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
/*    */     //   39: if_acmpeq +196 -> 235
/*    */     //   42: aload_1
/*    */     //   43: aconst_null
/*    */     //   44: astore_1
/*    */     //   45: astore_2
/*    */     //   46: aload_2
/*    */     //   47: dup
/*    */     //   48: invokestatic 46	clojure/lang/Util:classOf	(Ljava/lang/Object;)Ljava/lang/Class;
/*    */     //   51: getstatic 48	aeolian/core$_main:__cached_class__0	Ljava/lang/Class;
/*    */     //   54: if_acmpeq +17 -> 71
/*    */     //   57: dup
/*    */     //   58: instanceof 50
/*    */     //   61: ifne +25 -> 86
/*    */     //   64: dup
/*    */     //   65: invokestatic 46	clojure/lang/Util:classOf	(Ljava/lang/Object;)Ljava/lang/Class;
/*    */     //   68: putstatic 48	aeolian/core$_main:__cached_class__0	Ljava/lang/Class;
/*    */     //   71: getstatic 53	aeolian/core$_main:const__2	Lclojure/lang/Var;
/*    */     //   74: invokevirtual 23	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   77: swap
/*    */     //   78: invokeinterface 34 2 0
/*    */     //   83: goto +8 -> 91
/*    */     //   86: invokeinterface 56 1 0
/*    */     //   91: checkcast 58	java/io/File
/*    */     //   94: invokevirtual 62	java/io/File:exists	()Z
/*    */     //   97: ifeq +74 -> 171
/*    */     //   100: getstatic 65	aeolian/core$_main:const__3	Lclojure/lang/Var;
/*    */     //   103: invokevirtual 23	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   106: checkcast 25	clojure/lang/IFn
/*    */     //   109: getstatic 68	aeolian/core$_main:const__4	Lclojure/lang/Var;
/*    */     //   112: invokevirtual 23	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   115: checkcast 25	clojure/lang/IFn
/*    */     //   118: aload_0
/*    */     //   119: aconst_null
/*    */     //   120: astore_0
/*    */     //   121: invokeinterface 34 2 0
/*    */     //   126: invokeinterface 34 2 0
/*    */     //   131: astore_3
/*    */     //   132: getstatic 71	aeolian/core$_main:const__5	Lclojure/lang/Var;
/*    */     //   135: invokevirtual 23	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   138: checkcast 25	clojure/lang/IFn
/*    */     //   141: aload_2
/*    */     //   142: getstatic 74	aeolian/core$_main:const__6	Lclojure/lang/Var;
/*    */     //   145: invokevirtual 23	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   148: checkcast 25	clojure/lang/IFn
/*    */     //   151: aload_2
/*    */     //   152: aconst_null
/*    */     //   153: astore_2
/*    */     //   154: invokeinterface 34 2 0
/*    */     //   159: aload_3
/*    */     //   160: aconst_null
/*    */     //   161: astore_3
/*    */     //   162: invokeinterface 77 4 0
/*    */     //   167: goto +64 -> 231
/*    */     //   170: pop
/*    */     //   171: getstatic 82	aeolian/core$_main:const__7	Lclojure/lang/Var;
/*    */     //   174: invokevirtual 23	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   177: checkcast 25	clojure/lang/IFn
/*    */     //   180: getstatic 85	aeolian/core$_main:const__8	Lclojure/lang/Var;
/*    */     //   183: invokevirtual 88	clojure/lang/Var:get	()Ljava/lang/Object;
/*    */     //   186: getstatic 92	aeolian/core$_main:const__9	Lclojure/lang/Keyword;
/*    */     //   189: ldc 94
/*    */     //   191: ldc 96
/*    */     //   193: getstatic 99	aeolian/core$_main:const__10	Ljava/lang/Object;
/*    */     //   196: getstatic 102	aeolian/core$_main:const__11	Lclojure/lang/Keyword;
/*    */     //   199: getstatic 105	aeolian/core$_main:const__12	Lclojure/lang/Keyword;
/*    */     //   202: new 107	clojure/lang/Delay
/*    */     //   205: dup
/*    */     //   206: new 109	aeolian/core$_main$fn__9949
/*    */     //   209: dup
/*    */     //   210: aload_2
/*    */     //   211: aconst_null
/*    */     //   212: astore_2
/*    */     //   213: invokespecial 112	aeolian/core$_main$fn__9949:<init>	(Ljava/lang/Object;)V
/*    */     //   216: checkcast 25	clojure/lang/IFn
/*    */     //   219: invokespecial 115	clojure/lang/Delay:<init>	(Lclojure/lang/IFn;)V
/*    */     //   222: aconst_null
/*    */     //   223: getstatic 118	aeolian/core$_main:const__13	Ljava/lang/Object;
/*    */     //   226: invokeinterface 121 11 0
/*    */     //   231: goto +61 -> 292
/*    */     //   234: pop
/*    */     //   235: getstatic 82	aeolian/core$_main:const__7	Lclojure/lang/Var;
/*    */     //   238: invokevirtual 23	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   241: checkcast 25	clojure/lang/IFn
/*    */     //   244: getstatic 85	aeolian/core$_main:const__8	Lclojure/lang/Var;
/*    */     //   247: invokevirtual 88	clojure/lang/Var:get	()Ljava/lang/Object;
/*    */     //   250: getstatic 92	aeolian/core$_main:const__9	Lclojure/lang/Keyword;
/*    */     //   253: ldc 94
/*    */     //   255: ldc 96
/*    */     //   257: getstatic 125	aeolian/core$_main:const__14	Ljava/lang/Object;
/*    */     //   260: getstatic 102	aeolian/core$_main:const__11	Lclojure/lang/Keyword;
/*    */     //   263: getstatic 105	aeolian/core$_main:const__12	Lclojure/lang/Keyword;
/*    */     //   266: new 107	clojure/lang/Delay
/*    */     //   269: dup
/*    */     //   270: new 127	aeolian/core$_main$fn__9951
/*    */     //   273: dup
/*    */     //   274: invokespecial 128	aeolian/core$_main$fn__9951:<init>	()V
/*    */     //   277: checkcast 25	clojure/lang/IFn
/*    */     //   280: invokespecial 115	clojure/lang/Delay:<init>	(Lclojure/lang/IFn;)V
/*    */     //   283: aconst_null
/*    */     //   284: getstatic 131	aeolian/core$_main:const__15	Ljava/lang/Object;
/*    */     //   287: invokeinterface 121 11 0
/*    */     //   292: areturn
/*    */     // Line number table:
/*    */     //   Java source line #31	-> byte code offset #0
/*    */     //   Java source line #48	-> byte code offset #6
/*    */     //   Java source line #48	-> byte code offset #9
/*    */     //   Java source line #50	-> byte code offset #21
/*    */     //   Java source line #50	-> byte code offset #25
/*    */     //   Java source line #50	-> byte code offset #31
/*    */     //   Java source line #51	-> byte code offset #46
/*    */     //   Java source line #51	-> byte code offset #46
/*    */     //   Java source line #51	-> byte code offset #78
/*    */     //   Java source line #51	-> byte code offset #94
/*    */     //   Java source line #52	-> byte code offset #106
/*    */     //   Java source line #52	-> byte code offset #115
/*    */     //   Java source line #52	-> byte code offset #121
/*    */     //   Java source line #52	-> byte code offset #126
/*    */     //   Java source line #53	-> byte code offset #138
/*    */     //   Java source line #53	-> byte code offset #148
/*    */     //   Java source line #53	-> byte code offset #154
/*    */     //   Java source line #53	-> byte code offset #162
/*    */     //   Java source line #54	-> byte code offset #177
/*    */     //   Java source line #54	-> byte code offset #226
/*    */     //   Java source line #55	-> byte code offset #241
/*    */     //   Java source line #55	-> byte code offset #287
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	292	0	args	ISeq
/*    */     //   31	261	1	temp__4655__auto__9954	Object
/*    */     //   46	185	2	metrics_file_name	Object
/*    */     //   132	35	3	duplicate_metrics	Object
/*    */   }
/*    */   
/*    */   public Object doInvoke(Object paramObject)
/*    */   {
/* 31 */     paramObject = null;return invokeStatic((ISeq)paramObject); } public static final Object const__15 = Integer.valueOf(786962005); public static final Object const__14 = Integer.valueOf(55); public static final Object const__13 = Integer.valueOf(-839635880); public static final Keyword const__12 = (Keyword)RT.keyword(null, "auto"); public static final Keyword const__11 = (Keyword)RT.keyword(null, "p"); public static final Object const__10 = Integer.valueOf(54); public static final Keyword const__9 = (Keyword)RT.keyword(null, "error"); public static final Var const__8 = (Var)RT.var("taoensso.timbre", "*config*"); public static final Var const__7 = (Var)RT.var("taoensso.timbre", "-log!"); public static final Var const__6 = (Var)RT.var("aeolian.core", "notation-file-name"); public static final Var const__5 = (Var)RT.var("aeolian.core", "generate-notation-from"); public static final Var const__4 = (Var)RT.var("clojure.core", "second"); public static final Var const__3 = (Var)RT.var("clojure.core", "read-string"); public static final Var const__2 = (Var)RT.var("clojure.java.io", "as-file"); public static final Var const__1 = (Var)RT.var("clojure.core", "first"); public static final Var const__0 = (Var)RT.var("aeolian.banner", "banner");
/*    */   private static Class __cached_class__0;
/*    */   
/*    */   public int getRequiredArity()
/*    */   {
/*    */     return 0;
/*    */   }
/*    */ }


/* Location:              /home/amarks/code/aeolian/target/aeolian-0.1.1-SNAPSHOT.jar!/aeolian/core$_main.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */