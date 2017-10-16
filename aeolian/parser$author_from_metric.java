/*    */ package aeolian;
/*    */ 
/*    */ import clojure.lang.AFunction;
/*    */ import clojure.lang.IFn;
/*    */ import clojure.lang.RT;
/*    */ import clojure.lang.Var;
/*    */ import java.util.regex.Pattern;
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
/*    */ public final class parser$author_from_metric
/*    */   extends AFunction
/*    */ {
/*    */   public Object invoke(Object paramObject)
/*    */   {
/* 31 */     paramObject = null;return invokeStatic(paramObject); } public static final Object const__2 = Pattern.compile("AU=(\\S*)\\s"); public static final Var const__1 = (Var)RT.var("clojure.core", "re-find"); public static final Var const__0 = (Var)RT.var("clojure.core", "second");
/* 32 */   public static Object invokeStatic(Object metric) { metric = null;return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(const__2, metric));
/*    */   }
/*    */ }


/* Location:              /home/amarks/code/aeolian/target/aeolian-0.1.1-SNAPSHOT.jar!/aeolian/parser$author_from_metric.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */