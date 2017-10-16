/*    */ package aeolian;
/*    */ 
/*    */ import clojure.lang.AFunction;
/*    */ import clojure.lang.ILookupThunk;
/*    */ import clojure.lang.KeywordLookupSite;
/*    */ import clojure.lang.RT;
/*    */ import clojure.lang.Var;
/*    */ 
/*    */ public final class composer$find_longest_method_length_in
/*    */   extends AFunction
/*    */ {
/*    */   /* Error */
/*    */   public static Object invokeStatic(Object metrics)
/*    */   {
/*    */     // Byte code:
/*    */     //   0: getstatic 15	aeolian/composer$find_longest_method_length_in:__thunk__0__	Lclojure/lang/ILookupThunk;
/*    */     //   3: dup
/*    */     //   4: getstatic 19	aeolian/composer$find_longest_method_length_in:const__1	Lclojure/lang/Var;
/*    */     //   7: invokevirtual 25	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   10: checkcast 27	clojure/lang/IFn
/*    */     //   13: getstatic 30	aeolian/composer$find_longest_method_length_in:const__2	Lclojure/lang/Var;
/*    */     //   16: invokevirtual 25	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   19: new 32	aeolian/composer$find_longest_method_length_in$fn__9760
/*    */     //   22: dup
/*    */     //   23: invokespecial 33	aeolian/composer$find_longest_method_length_in$fn__9760:<init>	()V
/*    */     //   26: aload_0
/*    */     //   27: aconst_null
/*    */     //   28: astore_0
/*    */     //   29: invokeinterface 37 4 0
/*    */     //   34: dup_x2
/*    */     //   35: invokeinterface 42 2 0
/*    */     //   40: dup_x2
/*    */     //   41: if_acmpeq +7 -> 48
/*    */     //   44: pop
/*    */     //   45: goto +25 -> 70
/*    */     //   48: swap
/*    */     //   49: pop
/*    */     //   50: dup
/*    */     //   51: getstatic 46	aeolian/composer$find_longest_method_length_in:__site__0__	Lclojure/lang/KeywordLookupSite;
/*    */     //   54: swap
/*    */     //   55: invokeinterface 52 2 0
/*    */     //   60: dup
/*    */     //   61: putstatic 15	aeolian/composer$find_longest_method_length_in:__thunk__0__	Lclojure/lang/ILookupThunk;
/*    */     //   64: swap
/*    */     //   65: invokeinterface 42 2 0
/*    */     //   70: areturn
/*    */     // Line number table:
/*    */     //   Java source line #28	-> byte code offset #0
/*    */     //   Java source line #29	-> byte code offset #0
/*    */     //   Java source line #29	-> byte code offset #10
/*    */     //   Java source line #29	-> byte code offset #29
/*    */     //   Java source line #29	-> byte code offset #34
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	70	0	metrics	Object
/*    */   }
/*    */   
/*    */   public Object invoke(Object paramObject)
/*    */   {
/* 28 */     paramObject = null;return invokeStatic(paramObject); } static ILookupThunk __thunk__0__ = __site__0__ = new KeywordLookupSite(RT.keyword(null, "method-length")); static final KeywordLookupSite __site__0__; public static final Var const__2 = (Var)RT.var("clojure.core", "max-key"); public static final Var const__1 = (Var)RT.var("clojure.core", "apply");
/*    */ }


/* Location:              /home/amarks/code/aeolian/target/aeolian-0.1.1-SNAPSHOT.jar!/aeolian/composer$find_longest_method_length_in.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */