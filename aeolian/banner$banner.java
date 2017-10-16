/*    */ package aeolian;
/*    */ 
/*    */ import clojure.lang.IFn;
/*    */ 
/*    */ public final class banner$banner extends clojure.lang.AFunction {
/*  6 */   public Object invoke() { return invokeStatic(); } public static final clojure.lang.Var const__4 = (clojure.lang.Var)clojure.lang.RT.var("clojure.core", "println"); public static final clojure.lang.Keyword const__3 = (clojure.lang.Keyword)clojure.lang.RT.keyword(null, "bg-cyan"); public static final clojure.lang.Keyword const__2 = (clojure.lang.Keyword)clojure.lang.RT.keyword(null, "bg-green"); public static final clojure.lang.Keyword const__1 = (clojure.lang.Keyword)clojure.lang.RT.keyword(null, "bg-blue"); public static final clojure.lang.Var const__0 = (clojure.lang.Var)clojure.lang.RT.var("aeolian.banner", "line");
/*  7 */   public static Object invokeStatic() { ((IFn)const__0.getRawRoot()).invoke("                      lll iii                 ", const__1);
/*  8 */     ((IFn)const__0.getRawRoot()).invoke("  aa aa   eee   oooo  lll       aa aa nn nnn  ", const__2);
/*  9 */     ((IFn)const__0.getRawRoot()).invoke(" aa aaa ee   e oo  oo lll iii  aa aaa nnn  nn ", const__3);
/* 10 */     ((IFn)const__0.getRawRoot()).invoke("aa  aaa eeeee  oo  oo lll iii aa  aaa nn   nn ", const__2);
/* 11 */     ((IFn)const__0.getRawRoot()).invoke(" aaa aa  eeeee  oooo  lll iii  aaa aa nn   nn ", const__1);
/* 12 */     return ((IFn)const__4.getRawRoot()).invoke("");
/*    */   }
/*    */ }


/* Location:              /home/amarks/code/aeolian/target/aeolian-0.1.1-SNAPSHOT.jar!/aeolian/banner$banner.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */