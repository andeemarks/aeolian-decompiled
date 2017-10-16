/*    */ package aeolian;
/*    */ 
/*    */ import clojure.lang.AFunction;
/*    */ import clojure.lang.RT;
/*    */ import clojure.lang.Var;
/*    */ 
/*    */ public final class composer$map_indentation
/*    */   extends AFunction
/*    */ {
/*    */   /* Error */
/*    */   public static Object invokeStatic(Object indentation_QMARK_)
/*    */   {
/*    */     // Byte code:
/*    */     //   0: getstatic 15	aeolian/composer$map_indentation:const__0	Lclojure/lang/Var;
/*    */     //   3: invokevirtual 21	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   6: checkcast 23	clojure/lang/IFn
/*    */     //   9: aload_0
/*    */     //   10: aconst_null
/*    */     //   11: astore_0
/*    */     //   12: aconst_null
/*    */     //   13: invokestatic 29	clojure/lang/Util:identical	(Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   16: ifeq +9 -> 25
/*    */     //   19: getstatic 35	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
/*    */     //   22: goto +6 -> 28
/*    */     //   25: getstatic 38	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
/*    */     //   28: invokeinterface 41 2 0
/*    */     //   33: dup
/*    */     //   34: ifnull +26 -> 60
/*    */     //   37: getstatic 38	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
/*    */     //   40: if_acmpeq +21 -> 61
/*    */     //   43: getstatic 44	aeolian/composer$map_indentation:const__2	Lclojure/lang/Var;
/*    */     //   46: invokevirtual 21	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   49: checkcast 23	clojure/lang/IFn
/*    */     //   52: invokeinterface 46 1 0
/*    */     //   57: goto +5 -> 62
/*    */     //   60: pop
/*    */     //   61: aconst_null
/*    */     //   62: areturn
/*    */     // Line number table:
/*    */     //   Java source line #37	-> byte code offset #0
/*    */     //   Java source line #38	-> byte code offset #0
/*    */     //   Java source line #38	-> byte code offset #6
/*    */     //   Java source line #38	-> byte code offset #13
/*    */     //   Java source line #38	-> byte code offset #28
/*    */     //   Java source line #39	-> byte code offset #49
/*    */     //   Java source line #39	-> byte code offset #52
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	62	0	indentation_QMARK_	Object
/*    */   }
/*    */   
/*    */   public Object invoke(Object paramObject)
/*    */   {
/* 37 */     paramObject = null;return invokeStatic(paramObject); } public static final Var const__2 = (Var)RT.var("aeolian.midi.core", "volume-boost"); public static final Var const__0 = (Var)RT.var("clojure.core", "not");
/*    */ }


/* Location:              /home/amarks/code/aeolian/target/aeolian-0.1.1-SNAPSHOT.jar!/aeolian/composer$map_indentation.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */