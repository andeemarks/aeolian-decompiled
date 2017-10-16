/*   */ package aeolian; import clojure.lang.RT;
/*   */ 
/* 1 */ public class core__init { public static void load() { if (((clojure.lang.Symbol)const__1).equals(const__2)) { tmpTernaryOp = null; break label67; ((clojure.lang.IFn)new core.loading__5569__auto____36()).invoke(); } else { clojure.lang.LockingTransaction.runInTransaction((java.util.concurrent.Callable)new core.fn__9939()); } label67: tmp70_67 = const__3; tmp70_67.setMeta((clojure.lang.IPersistentMap)const__11);tmp70_67.bindRoot(new core.build_header()); clojure.lang.Var tmp94_91 = const__12;tmp94_91.setMeta((clojure.lang.IPersistentMap)const__15);tmp94_91.bindRoot(new core.notation_file_name()); clojure.lang.Var tmp118_115 = const__16;tmp118_115.setMeta((clojure.lang.IPersistentMap)const__20);tmp118_115.bindRoot(new core.generate_notation_from()); clojure.lang.Var tmp142_139 = const__21;tmp142_139.setMeta((clojure.lang.IPersistentMap)const__24);tmp142_139.bindRoot(new core._main());
/*   */   }
/*   */   
/*   */   public static final clojure.lang.Var const__0;
/*   */   public static final clojure.lang.AFn const__1;
/*   */   public static final clojure.lang.AFn const__2;
/*   */   public static final clojure.lang.Var const__3;
/*   */   public static final clojure.lang.AFn const__11;
/*   */   public static final clojure.lang.Var const__12;
/*   */   public static final clojure.lang.AFn const__15;
/*   */   public static final clojure.lang.Var const__16;
/*   */   public static final clojure.lang.AFn const__20;
/*   */   public static final clojure.lang.Var const__21;
/*   */   public static final clojure.lang.AFn const__24;
/*   */   public static void __init0()
/*   */   {
/*   */     const__0 = (clojure.lang.Var)RT.var("clojure.core", "in-ns");
/*   */     const__1 = (clojure.lang.AFn)clojure.lang.Symbol.intern(null, "aeolian.core");
/*   */     const__2 = (clojure.lang.AFn)clojure.lang.Symbol.intern(null, "clojure.core");
/*   */     const__3 = (clojure.lang.Var)RT.var("aeolian.core", "build-header");
/*   */     const__11 = (clojure.lang.AFn)RT.map(new Object[] { RT.keyword(null, "arglists"), clojure.lang.PersistentList.create(java.util.Arrays.asList(new Object[] { clojure.lang.Tuple.create(clojure.lang.Symbol.intern(null, "metrics-file-name"), clojure.lang.Symbol.intern(null, "key")) })), RT.keyword(null, "line"), Integer.valueOf(13), RT.keyword(null, "column"), Integer.valueOf(1), RT.keyword(null, "file"), "aeolian/core.clj" });
/*   */     const__12 = (clojure.lang.Var)RT.var("aeolian.core", "notation-file-name");
/*   */     const__15 = (clojure.lang.AFn)RT.map(new Object[] { RT.keyword(null, "arglists"), clojure.lang.PersistentList.create(java.util.Arrays.asList(new Object[] { clojure.lang.Tuple.create(clojure.lang.Symbol.intern(null, "original-file-name")) })), RT.keyword(null, "line"), Integer.valueOf(16), RT.keyword(null, "column"), Integer.valueOf(1), RT.keyword(null, "file"), "aeolian/core.clj" });
/*   */     const__16 = (clojure.lang.Var)RT.var("aeolian.core", "generate-notation-from");
/*   */     const__20 = (clojure.lang.AFn)RT.map(new Object[] { RT.keyword(null, "arglists"), clojure.lang.PersistentList.create(java.util.Arrays.asList(new Object[] { clojure.lang.Tuple.create(clojure.lang.Symbol.intern(null, "input-file-name"), clojure.lang.Symbol.intern(null, "output-file-name"), clojure.lang.Symbol.intern(null, "duplicate-metrics")) })), RT.keyword(null, "doc"), "Using the contents of the `input-file-name` and `duplicate-metrics`, write\n  ABC notation to `output-file-name`.\n  ", RT.keyword(null, "line"), Integer.valueOf(19), RT.keyword(null, "column"), Integer.valueOf(1), RT.keyword(null, "file"), "aeolian/core.clj" });
/*   */     const__21 = (clojure.lang.Var)RT.var("aeolian.core", "-main");
/*   */     const__24 = (clojure.lang.AFn)RT.map(new Object[] { RT.keyword(null, "arglists"), clojure.lang.PersistentList.create(java.util.Arrays.asList(new Object[] { clojure.lang.Tuple.create(clojure.lang.Symbol.intern(null, "&"), clojure.lang.Symbol.intern(null, "args")) })), RT.keyword(null, "doc"), "Command line entry point for Aeolian.\n\n  Usage:\n\n  `lein run [metrics-file] [duplication-metrics]`\n\n  where:\n\n  * `metrics-file` is the name of the file containing all the generated metrics for the repository being processed.\n  * `duplication-metrics` is a Clojure hash of the form `{:duplicate-lines n1 :total-lines n2}` with `n1` and `n2` being non-negative integers and `n1` >= `n2`\n\n  Example:\n\n  `lein run repo.metrics {:duplicate-lines 533 :total-lines 15}`\n  ", RT.keyword(null, "line"), Integer.valueOf(31), RT.keyword(null, "column"), Integer.valueOf(1), RT.keyword(null, "file"), "aeolian/core.clj" });
/*   */   }
/*   */   
/*   */   static
/*   */   {
/*   */     __init0();
/*   */     clojure.lang.Compiler.pushNSandLoader(RT.classForName("aeolian.core__init").getClassLoader());
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


/* Location:              /home/amarks/code/aeolian/target/aeolian-0.1.1-SNAPSHOT.jar!/aeolian/core__init.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */