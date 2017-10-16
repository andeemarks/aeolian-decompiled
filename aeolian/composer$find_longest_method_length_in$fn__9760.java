/*    */ package aeolian;
/*    */ 
/*    */ import clojure.lang.AFunction;
/*    */ import clojure.lang.ILookupThunk;
/*    */ import clojure.lang.KeywordLookupSite;
/*    */ import clojure.lang.RT;
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
/*    */ public final class composer$find_longest_method_length_in$fn__9760
/*    */   extends AFunction
/*    */ {
/* 29 */   static ILookupThunk __thunk__0__ = __site__0__ = new KeywordLookupSite(RT.keyword(null, "method-length")); static final KeywordLookupSite __site__0__; public static final Object const__1 = Long.valueOf(0L);
/*    */   
/*    */   /* Error */
/*    */   public Object invoke(Object p1__9759_SHARP_)
/*    */   {
/*    */     // Byte code:
/*    */     //   0: getstatic 15	aeolian/composer$find_longest_method_length_in$fn__9760:__thunk__0__	Lclojure/lang/ILookupThunk;
/*    */     //   3: dup
/*    */     //   4: aload_1
/*    */     //   5: aconst_null
/*    */     //   6: astore_1
/*    */     //   7: dup_x2
/*    */     //   8: invokeinterface 20 2 0
/*    */     //   13: dup_x2
/*    */     //   14: if_acmpeq +7 -> 21
/*    */     //   17: pop
/*    */     //   18: goto +25 -> 43
/*    */     //   21: swap
/*    */     //   22: pop
/*    */     //   23: dup
/*    */     //   24: getstatic 24	aeolian/composer$find_longest_method_length_in$fn__9760:__site__0__	Lclojure/lang/KeywordLookupSite;
/*    */     //   27: swap
/*    */     //   28: invokeinterface 30 2 0
/*    */     //   33: dup
/*    */     //   34: putstatic 15	aeolian/composer$find_longest_method_length_in$fn__9760:__thunk__0__	Lclojure/lang/ILookupThunk;
/*    */     //   37: swap
/*    */     //   38: invokeinterface 20 2 0
/*    */     //   43: astore_2
/*    */     //   44: aload_2
/*    */     //   45: dup
/*    */     //   46: ifnull +15 -> 61
/*    */     //   49: getstatic 36	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
/*    */     //   52: if_acmpeq +10 -> 62
/*    */     //   55: aload_2
/*    */     //   56: aconst_null
/*    */     //   57: astore_2
/*    */     //   58: goto +7 -> 65
/*    */     //   61: pop
/*    */     //   62: getstatic 40	aeolian/composer$find_longest_method_length_in$fn__9760:const__1	Ljava/lang/Object;
/*    */     //   65: areturn
/*    */     // Line number table:
/*    */     //   Java source line #29	-> byte code offset #0
/*    */     //   Java source line #29	-> byte code offset #0
/*    */     //   Java source line #29	-> byte code offset #7
/*    */     //   Java source line #29	-> byte code offset #44
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	65	0	this	Object
/*    */     //   0	65	1	p1__9759_SHARP_	Object
/*    */     //   44	21	2	or__4469__auto__9762	Object
/*    */   }
/*    */ }


/* Location:              /home/amarks/code/aeolian/target/aeolian-0.1.1-SNAPSHOT.jar!/aeolian/composer$find_longest_method_length_in$fn__9760.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */