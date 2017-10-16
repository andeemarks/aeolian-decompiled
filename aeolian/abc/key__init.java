/*   */ package aeolian.abc; import clojure.lang.RT;
/*   */ 
/* 1 */ public class key__init { public static void load() { if (((clojure.lang.Symbol)const__1).equals(const__2)) { tmpTernaryOp = null; break label67; ((clojure.lang.IFn)new key.loading__5569__auto____55()).invoke(); } else { clojure.lang.LockingTransaction.runInTransaction((java.util.concurrent.Callable)new key.fn__57()); } label67: tmp70_67 = const__3; tmp70_67.setMeta((clojure.lang.IPersistentMap)const__9);tmp70_67.bindRoot(const__10); clojure.lang.Var tmp90_87 = const__11;tmp90_87.setMeta((clojure.lang.IPersistentMap)const__13);tmp90_87.bindRoot(const__14); clojure.lang.Var tmp110_107 = const__15;tmp110_107.setMeta((clojure.lang.IPersistentMap)const__20);tmp110_107.bindRoot(new key.duplication_percentage()); clojure.lang.Var tmp134_131 = const__21;tmp134_131.setMeta((clojure.lang.IPersistentMap)const__24);tmp134_131.bindRoot(new key.determine_key());
/*   */   }
/*   */   
/*   */   public static final clojure.lang.Var const__0;
/*   */   public static final clojure.lang.AFn const__1;
/*   */   public static final clojure.lang.AFn const__2;
/*   */   public static final clojure.lang.Var const__3;
/*   */   public static final clojure.lang.AFn const__9;
/*   */   public static final clojure.lang.Keyword const__10;
/*   */   public static final clojure.lang.Var const__11;
/*   */   public static final clojure.lang.AFn const__13;
/*   */   public static final clojure.lang.Keyword const__14;
/*   */   public static final clojure.lang.Var const__15;
/*   */   public static final clojure.lang.AFn const__20;
/*   */   public static final clojure.lang.Var const__21;
/*   */   public static final clojure.lang.AFn const__24;
/*   */   public static void __init0()
/*   */   {
/*   */     const__0 = (clojure.lang.Var)RT.var("clojure.core", "in-ns");
/*   */     const__1 = (clojure.lang.AFn)clojure.lang.Symbol.intern(null, "aeolian.abc.key");
/*   */     const__2 = (clojure.lang.AFn)clojure.lang.Symbol.intern(null, "clojure.core");
/*   */     const__3 = (clojure.lang.Var)RT.var("aeolian.abc.key", "major");
/*   */     const__9 = (clojure.lang.AFn)RT.map(new Object[] { RT.keyword(null, "line"), Integer.valueOf(3), RT.keyword(null, "column"), Integer.valueOf(1), RT.keyword(null, "file"), "aeolian/abc/key.clj" });
/*   */     const__10 = (clojure.lang.Keyword)RT.keyword(null, "major");
/*   */     const__11 = (clojure.lang.Var)RT.var("aeolian.abc.key", "minor");
/*   */     const__13 = (clojure.lang.AFn)RT.map(new Object[] { RT.keyword(null, "line"), Integer.valueOf(4), RT.keyword(null, "column"), Integer.valueOf(1), RT.keyword(null, "file"), "aeolian/abc/key.clj" });
/*   */     const__14 = (clojure.lang.Keyword)RT.keyword(null, "minor");
/*   */     const__15 = (clojure.lang.Var)RT.var("aeolian.abc.key", "duplication-percentage");
/*   */     const__20 = (clojure.lang.AFn)RT.map(new Object[] { RT.keyword(null, "private"), Boolean.TRUE, RT.keyword(null, "arglists"), clojure.lang.PersistentList.create(java.util.Arrays.asList(new Object[] { clojure.lang.Tuple.create(clojure.lang.Symbol.intern(null, "duplicate-metrics")) })), RT.keyword(null, "line"), Integer.valueOf(6), RT.keyword(null, "column"), Integer.valueOf(1), RT.keyword(null, "file"), "aeolian/abc/key.clj" });
/*   */     const__21 = (clojure.lang.Var)RT.var("aeolian.abc.key", "determine-key");
/*   */     const__24 = (clojure.lang.AFn)RT.map(new Object[] { RT.keyword(null, "arglists"), clojure.lang.PersistentList.create(java.util.Arrays.asList(new Object[] { clojure.lang.Tuple.create(clojure.lang.Symbol.intern(null, "duplicate-metrics")) })), RT.keyword(null, "line"), Integer.valueOf(13), RT.keyword(null, "column"), Integer.valueOf(1), RT.keyword(null, "file"), "aeolian/abc/key.clj" });
/*   */   }
/*   */   
/*   */   static
/*   */   {
/*   */     __init0();
/*   */     clojure.lang.Compiler.pushNSandLoader(RT.classForName("aeolian.abc.key__init").getClassLoader());
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


/* Location:              /home/amarks/code/aeolian/target/aeolian-0.1.1-SNAPSHOT.jar!/aeolian/abc/key__init.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */