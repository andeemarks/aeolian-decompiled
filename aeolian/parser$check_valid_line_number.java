/*    */ package aeolian;
/*    */ 
/*    */ import clojure.lang.IFn;
/*    */ import clojure.lang.Var;
/*    */ 
/*    */ public final class parser$check_valid_line_number extends clojure.lang.AFunction
/*    */ {
/*    */   public Object invoke(Object paramObject)
/*    */   {
/* 10 */     paramObject = null;return invokeStatic(paramObject); } public static final Object const__4 = java.util.regex.Pattern.compile("#"); public static final Var const__3 = (Var)clojure.lang.RT.var("clojure.string", "split"); public static final Var const__2 = (Var)clojure.lang.RT.var("clojure.core", "last"); public static final Var const__1 = (Var)clojure.lang.RT.var("aeolian.parser", "metric-line-to-bits"); public static final Var const__0 = (Var)clojure.lang.RT.var("clojure.core", "first");
/* 11 */   public static Object invokeStatic(Object metric) { metric = null;Object file_line_id = ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(metric));
/* 12 */     file_line_id = null;return Integer.valueOf(Integer.parseInt((String)((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(file_line_id, const__4))));
/*    */   }
/*    */ }


/* Location:              /home/amarks/code/aeolian/target/aeolian-0.1.1-SNAPSHOT.jar!/aeolian/parser$check_valid_line_number.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */