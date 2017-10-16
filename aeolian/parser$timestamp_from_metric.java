/*    */ package aeolian;
/*    */ 
/*    */ import clojure.lang.AFunction;
/*    */ import clojure.lang.RT;
/*    */ import clojure.lang.Var;
/*    */ import java.util.regex.Pattern;
/*    */ 
/*    */ public final class parser$timestamp_from_metric
/*    */   extends AFunction
/*    */ {
/*    */   /* Error */
/*    */   public static Object invokeStatic(Object metric)
/*    */   {
/*    */     // Byte code:
/*    */     //   0: getstatic 15	aeolian/parser$timestamp_from_metric:const__0	Lclojure/lang/Var;
/*    */     //   3: invokevirtual 21	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   6: checkcast 23	clojure/lang/IFn
/*    */     //   9: getstatic 26	aeolian/parser$timestamp_from_metric:const__1	Lclojure/lang/Var;
/*    */     //   12: invokevirtual 21	clojure/lang/Var:getRawRoot	()Ljava/lang/Object;
/*    */     //   15: checkcast 23	clojure/lang/IFn
/*    */     //   18: getstatic 30	aeolian/parser$timestamp_from_metric:const__2	Ljava/lang/Object;
/*    */     //   21: aload_0
/*    */     //   22: aconst_null
/*    */     //   23: astore_0
/*    */     //   24: invokeinterface 34 3 0
/*    */     //   29: invokeinterface 36 2 0
/*    */     //   34: astore_1
/*    */     //   35: aload_1
/*    */     //   36: dup
/*    */     //   37: ifnull +28 -> 65
/*    */     //   40: getstatic 42	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
/*    */     //   43: if_acmpeq +23 -> 66
/*    */     //   46: aload_1
/*    */     //   47: aconst_null
/*    */     //   48: astore_1
/*    */     //   49: astore_2
/*    */     //   50: aload_2
/*    */     //   51: aconst_null
/*    */     //   52: astore_2
/*    */     //   53: checkcast 44	java/lang/String
/*    */     //   56: invokestatic 50	java/lang/Integer:parseInt	(Ljava/lang/String;)I
/*    */     //   59: invokestatic 54	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
/*    */     //   62: goto +5 -> 67
/*    */     //   65: pop
/*    */     //   66: aconst_null
/*    */     //   67: areturn
/*    */     // Line number table:
/*    */     //   Java source line #34	-> byte code offset #0
/*    */     //   Java source line #35	-> byte code offset #6
/*    */     //   Java source line #35	-> byte code offset #15
/*    */     //   Java source line #35	-> byte code offset #24
/*    */     //   Java source line #35	-> byte code offset #29
/*    */     //   Java source line #35	-> byte code offset #35
/*    */     //   Java source line #36	-> byte code offset #56
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	67	0	metric	Object
/*    */     //   35	32	1	temp__4655__auto__9908	Object
/*    */     //   50	12	2	timestamp	Object
/*    */   }
/*    */   
/*    */   public Object invoke(Object paramObject)
/*    */   {
/* 34 */     paramObject = null;return invokeStatic(paramObject); } public static final Object const__2 = Pattern.compile("TS=(\\d+)"); public static final Var const__1 = (Var)RT.var("clojure.core", "re-find"); public static final Var const__0 = (Var)RT.var("clojure.core", "second");
/*    */ }


/* Location:              /home/amarks/code/aeolian/target/aeolian-0.1.1-SNAPSHOT.jar!/aeolian/parser$timestamp_from_metric.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */