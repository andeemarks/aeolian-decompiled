/*    */ package aeolian.abc;
/*    */ 
/*    */ import clojure.lang.AFunction;
/*    */ import clojure.lang.RT;
/*    */ import clojure.lang.Var;
/*    */ 
/*    */ public final class notes$note_for_line_length
/*    */   extends AFunction
/*    */ {
/*    */   /* Error */
/*    */   public static Object invokeStatic(Object line_length, Object composition_key)
/*    */   {
/*    */     // Byte code:
/*    */     //   0: lconst_0
/*    */     //   1: aload_0
/*    */     //   2: invokestatic 17	clojure/lang/Util:equiv	(JLjava/lang/Object;)Z
/*    */     //   5: ifeq +9 -> 14
/*    */     //   8: ldc 19
/*    */     //   10: goto +274 -> 284
/*    */     //   13: pop
/*    */     //   14: getstatic 23	aeolian/abc/notes$note_for_line_length:const__2	Lclojure/lang/Var;
/*    */     //   17: invokevirtual 29	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   20: checkcast 31	clojure/lang/IFn
/*    */     //   23: getstatic 35	aeolian/abc/notes$note_for_line_length:const__3	Ljava/lang/Object;
/*    */     //   26: aload_0
/*    */     //   27: getstatic 38	aeolian/abc/notes$note_for_line_length:const__4	Ljava/lang/Object;
/*    */     //   30: invokeinterface 42 4 0
/*    */     //   35: dup
/*    */     //   36: ifnull +35 -> 71
/*    */     //   39: getstatic 48	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
/*    */     //   42: if_acmpeq +30 -> 72
/*    */     //   45: getstatic 51	aeolian/abc/notes$note_for_line_length:const__5	Lclojure/lang/Var;
/*    */     //   48: invokevirtual 29	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   51: checkcast 31	clojure/lang/IFn
/*    */     //   54: getstatic 35	aeolian/abc/notes$note_for_line_length:const__3	Ljava/lang/Object;
/*    */     //   57: aload_0
/*    */     //   58: aconst_null
/*    */     //   59: astore_0
/*    */     //   60: aload_1
/*    */     //   61: aconst_null
/*    */     //   62: astore_1
/*    */     //   63: invokeinterface 42 4 0
/*    */     //   68: goto +216 -> 284
/*    */     //   71: pop
/*    */     //   72: getstatic 23	aeolian/abc/notes$note_for_line_length:const__2	Lclojure/lang/Var;
/*    */     //   75: invokevirtual 29	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   78: checkcast 31	clojure/lang/IFn
/*    */     //   81: getstatic 54	aeolian/abc/notes$note_for_line_length:const__6	Ljava/lang/Object;
/*    */     //   84: aload_0
/*    */     //   85: getstatic 57	aeolian/abc/notes$note_for_line_length:const__7	Ljava/lang/Object;
/*    */     //   88: invokeinterface 42 4 0
/*    */     //   93: dup
/*    */     //   94: ifnull +35 -> 129
/*    */     //   97: getstatic 48	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
/*    */     //   100: if_acmpeq +30 -> 130
/*    */     //   103: getstatic 51	aeolian/abc/notes$note_for_line_length:const__5	Lclojure/lang/Var;
/*    */     //   106: invokevirtual 29	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   109: checkcast 31	clojure/lang/IFn
/*    */     //   112: getstatic 60	aeolian/abc/notes$note_for_line_length:const__8	Ljava/lang/Object;
/*    */     //   115: aload_0
/*    */     //   116: aconst_null
/*    */     //   117: astore_0
/*    */     //   118: aload_1
/*    */     //   119: aconst_null
/*    */     //   120: astore_1
/*    */     //   121: invokeinterface 42 4 0
/*    */     //   126: goto +158 -> 284
/*    */     //   129: pop
/*    */     //   130: getstatic 23	aeolian/abc/notes$note_for_line_length:const__2	Lclojure/lang/Var;
/*    */     //   133: invokevirtual 29	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   136: checkcast 31	clojure/lang/IFn
/*    */     //   139: getstatic 63	aeolian/abc/notes$note_for_line_length:const__9	Ljava/lang/Object;
/*    */     //   142: aload_0
/*    */     //   143: getstatic 66	aeolian/abc/notes$note_for_line_length:const__10	Ljava/lang/Object;
/*    */     //   146: invokeinterface 42 4 0
/*    */     //   151: dup
/*    */     //   152: ifnull +35 -> 187
/*    */     //   155: getstatic 48	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
/*    */     //   158: if_acmpeq +30 -> 188
/*    */     //   161: getstatic 51	aeolian/abc/notes$note_for_line_length:const__5	Lclojure/lang/Var;
/*    */     //   164: invokevirtual 29	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   167: checkcast 31	clojure/lang/IFn
/*    */     //   170: getstatic 69	aeolian/abc/notes$note_for_line_length:const__11	Ljava/lang/Object;
/*    */     //   173: aload_0
/*    */     //   174: aconst_null
/*    */     //   175: astore_0
/*    */     //   176: aload_1
/*    */     //   177: aconst_null
/*    */     //   178: astore_1
/*    */     //   179: invokeinterface 42 4 0
/*    */     //   184: goto +100 -> 284
/*    */     //   187: pop
/*    */     //   188: getstatic 23	aeolian/abc/notes$note_for_line_length:const__2	Lclojure/lang/Var;
/*    */     //   191: invokevirtual 29	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   194: checkcast 31	clojure/lang/IFn
/*    */     //   197: getstatic 72	aeolian/abc/notes$note_for_line_length:const__12	Ljava/lang/Object;
/*    */     //   200: aload_0
/*    */     //   201: getstatic 75	aeolian/abc/notes$note_for_line_length:const__13	Ljava/lang/Object;
/*    */     //   204: invokeinterface 42 4 0
/*    */     //   209: dup
/*    */     //   210: ifnull +35 -> 245
/*    */     //   213: getstatic 48	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
/*    */     //   216: if_acmpeq +30 -> 246
/*    */     //   219: getstatic 51	aeolian/abc/notes$note_for_line_length:const__5	Lclojure/lang/Var;
/*    */     //   222: invokevirtual 29	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   225: checkcast 31	clojure/lang/IFn
/*    */     //   228: getstatic 78	aeolian/abc/notes$note_for_line_length:const__14	Ljava/lang/Object;
/*    */     //   231: aload_0
/*    */     //   232: aconst_null
/*    */     //   233: astore_0
/*    */     //   234: aload_1
/*    */     //   235: aconst_null
/*    */     //   236: astore_1
/*    */     //   237: invokeinterface 42 4 0
/*    */     //   242: goto +42 -> 284
/*    */     //   245: pop
/*    */     //   246: ldc2_w 79
/*    */     //   249: aload_0
/*    */     //   250: invokestatic 85	clojure/lang/Numbers:lte	(JLjava/lang/Object;)Z
/*    */     //   253: ifeq +30 -> 283
/*    */     //   256: getstatic 51	aeolian/abc/notes$note_for_line_length:const__5	Lclojure/lang/Var;
/*    */     //   259: invokevirtual 29	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   262: checkcast 31	clojure/lang/IFn
/*    */     //   265: getstatic 88	aeolian/abc/notes$note_for_line_length:const__16	Ljava/lang/Object;
/*    */     //   268: aload_0
/*    */     //   269: aconst_null
/*    */     //   270: astore_0
/*    */     //   271: aload_1
/*    */     //   272: aconst_null
/*    */     //   273: astore_1
/*    */     //   274: invokeinterface 42 4 0
/*    */     //   279: goto +5 -> 284
/*    */     //   282: pop
/*    */     //   283: aconst_null
/*    */     //   284: areturn
/*    */     // Line number table:
/*    */     //   Java source line #50	-> byte code offset #0
/*    */     //   Java source line #51	-> byte code offset #0
/*    */     //   Java source line #52	-> byte code offset #2
/*    */     //   Java source line #51	-> byte code offset #14
/*    */     //   Java source line #53	-> byte code offset #20
/*    */     //   Java source line #53	-> byte code offset #30
/*    */     //   Java source line #53	-> byte code offset #51
/*    */     //   Java source line #53	-> byte code offset #63
/*    */     //   Java source line #51	-> byte code offset #72
/*    */     //   Java source line #54	-> byte code offset #78
/*    */     //   Java source line #54	-> byte code offset #88
/*    */     //   Java source line #54	-> byte code offset #109
/*    */     //   Java source line #54	-> byte code offset #121
/*    */     //   Java source line #51	-> byte code offset #130
/*    */     //   Java source line #55	-> byte code offset #136
/*    */     //   Java source line #55	-> byte code offset #146
/*    */     //   Java source line #55	-> byte code offset #167
/*    */     //   Java source line #55	-> byte code offset #179
/*    */     //   Java source line #51	-> byte code offset #188
/*    */     //   Java source line #56	-> byte code offset #194
/*    */     //   Java source line #56	-> byte code offset #204
/*    */     //   Java source line #56	-> byte code offset #225
/*    */     //   Java source line #56	-> byte code offset #237
/*    */     //   Java source line #51	-> byte code offset #246
/*    */     //   Java source line #57	-> byte code offset #250
/*    */     //   Java source line #57	-> byte code offset #262
/*    */     //   Java source line #57	-> byte code offset #274
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	284	0	line_length	Object
/*    */     //   0	284	1	composition_key	Object
/*    */   }
/*    */   
/*    */   public Object invoke(Object paramObject1, Object paramObject2)
/*    */   {
/* 50 */     paramObject1 = null;paramObject2 = null;return invokeStatic(paramObject1, paramObject2); } public static final Object const__16 = Long.valueOf(5L); public static final Object const__14 = Long.valueOf(4L); public static final Object const__13 = Long.valueOf(99L); public static final Object const__12 = Long.valueOf(80L); public static final Object const__11 = Long.valueOf(3L); public static final Object const__10 = Long.valueOf(79L); public static final Object const__9 = Long.valueOf(40L); public static final Object const__8 = Long.valueOf(2L); public static final Object const__7 = Long.valueOf(39L); public static final Object const__6 = Long.valueOf(10L); public static final Var const__5 = (Var)RT.var("aeolian.abc.notes", "note-from-octave"); public static final Object const__4 = Long.valueOf(9L); public static final Object const__3 = Long.valueOf(1L); public static final Var const__2 = (Var)RT.var("clojure.core", "<=");
/*    */ }


/* Location:              /home/amarks/code/aeolian/target/aeolian-0.1.1-SNAPSHOT.jar!/aeolian/abc/notes$note_for_line_length.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */