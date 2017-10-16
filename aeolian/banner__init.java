/*   */ package aeolian; import clojure.lang.RT;
/*   */ 
/* 1 */ public class banner__init { public static void load() { if (((clojure.lang.Symbol)const__1).equals(const__2)) { tmpTernaryOp = null; break label67; ((clojure.lang.IFn)new banner.loading__5569__auto____9911()).invoke(); } else { clojure.lang.LockingTransaction.runInTransaction((java.util.concurrent.Callable)new banner.fn__9933()); } label67: tmp70_67 = const__3; tmp70_67.setMeta((clojure.lang.IPersistentMap)const__12);tmp70_67.bindRoot(new banner.line()); clojure.lang.Var tmp94_91 = const__13;tmp94_91.setMeta((clojure.lang.IPersistentMap)const__16);tmp94_91.bindRoot(new banner.banner());
/*   */   }
/*   */   
/*   */   public static final clojure.lang.Var const__0;
/*   */   public static final clojure.lang.AFn const__1;
/*   */   public static final clojure.lang.AFn const__2;
/*   */   public static final clojure.lang.Var const__3;
/*   */   public static final clojure.lang.AFn const__12;
/*   */   public static final clojure.lang.Var const__13;
/*   */   public static final clojure.lang.AFn const__16;
/*   */   public static void __init0()
/*   */   {
/*   */     const__0 = (clojure.lang.Var)RT.var("clojure.core", "in-ns");
/*   */     const__1 = (clojure.lang.AFn)clojure.lang.Symbol.intern(null, "aeolian.banner");
/*   */     const__2 = (clojure.lang.AFn)clojure.lang.Symbol.intern(null, "clojure.core");
/*   */     const__3 = (clojure.lang.Var)RT.var("aeolian.banner", "line");
/*   */     const__12 = (clojure.lang.AFn)RT.map(new Object[] { RT.keyword(null, "private"), Boolean.TRUE, RT.keyword(null, "arglists"), clojure.lang.PersistentList.create(java.util.Arrays.asList(new Object[] { clojure.lang.Tuple.create(clojure.lang.Symbol.intern(null, "text"), clojure.lang.Symbol.intern(null, "&"), clojure.lang.Tuple.create(clojure.lang.Symbol.intern(null, "args"))) })), RT.keyword(null, "line"), Integer.valueOf(4), RT.keyword(null, "column"), Integer.valueOf(1), RT.keyword(null, "file"), "aeolian/banner.clj" });
/*   */     const__13 = (clojure.lang.Var)RT.var("aeolian.banner", "banner");
/*   */     const__16 = (clojure.lang.AFn)RT.map(new Object[] { RT.keyword(null, "arglists"), clojure.lang.PersistentList.create(java.util.Arrays.asList(new Object[] { clojure.lang.Tuple.create() })), RT.keyword(null, "line"), Integer.valueOf(6), RT.keyword(null, "column"), Integer.valueOf(1), RT.keyword(null, "file"), "aeolian/banner.clj" });
/*   */   }
/*   */   
/*   */   static
/*   */   {
/*   */     __init0();
/*   */     clojure.lang.Compiler.pushNSandLoader(RT.classForName("aeolian.banner__init").getClassLoader());
/*   */     try
/*   */     {
/*   */       load();
/*   */       clojure.lang.Var.popThreadBindings();
/*   */     }
/*   */     finally
/*   */     {
/*   */       clojure.lang.Var.popThreadBindings();
/*   */       throw finally;
/*   */     }
/*   */   }
/*   */ }


/* Location:              /home/amarks/code/aeolian/target/aeolian-0.1.1-SNAPSHOT.jar!/aeolian/banner__init.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */