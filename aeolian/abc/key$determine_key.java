/*    */ package aeolian.abc;
/*    */ 
/*    */ import clojure.lang.AFunction;
/*    */ import clojure.lang.RT;
/*    */ import clojure.lang.Var;
/*    */ 
/*    */ public final class key$determine_key
/*    */   extends AFunction
/*    */ {
/*    */   /* Error */
/*    */   public static Object invokeStatic(Object duplicate_metrics)
/*    */   {
/*    */     // Byte code:
/*    */     //   0: getstatic 15	aeolian/abc/key$determine_key:const__1	Lclojure/lang/Var;
/*    */     //   3: invokevirtual 21	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   6: checkcast 23	clojure/lang/IFn
/*    */     //   9: aload_0
/*    */     //   10: aconst_null
/*    */     //   11: astore_0
/*    */     //   12: invokeinterface 26 2 0
/*    */     //   17: ldc2_w 27
/*    */     //   20: invokestatic 34	clojure/lang/Numbers:lt	(Ljava/lang/Object;J)Z
/*    */     //   23: ifeq +13 -> 36
/*    */     //   26: getstatic 37	aeolian/abc/key$determine_key:const__3	Lclojure/lang/Var;
/*    */     //   29: invokevirtual 21	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   32: goto +10 -> 42
/*    */     //   35: pop
/*    */     //   36: getstatic 40	aeolian/abc/key$determine_key:const__4	Lclojure/lang/Var;
/*    */     //   39: invokevirtual 21	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   42: areturn
/*    */     // Line number table:
/*    */     //   Java source line #13	-> byte code offset #0
/*    */     //   Java source line #14	-> byte code offset #0
/*    */     //   Java source line #14	-> byte code offset #6
/*    */     //   Java source line #14	-> byte code offset #12
/*    */     //   Java source line #14	-> byte code offset #20
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	42	0	duplicate_metrics	Object
/*    */   }
/*    */   
/*    */   public Object invoke(Object paramObject)
/*    */   {
/* 13 */     paramObject = null;return invokeStatic(paramObject); } public static final Var const__4 = (Var)RT.var("aeolian.abc.key", "minor"); public static final Var const__3 = (Var)RT.var("aeolian.abc.key", "major"); public static final Var const__1 = (Var)RT.var("aeolian.abc.key", "duplication-percentage");
/*    */ }


/* Location:              /home/amarks/code/aeolian/target/aeolian-0.1.1-SNAPSHOT.jar!/aeolian/abc/key$determine_key.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */