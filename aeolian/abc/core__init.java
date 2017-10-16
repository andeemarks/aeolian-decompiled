/*   */ package aeolian.abc; import clojure.lang.RT;
/*   */ 
/* 1 */ public class core__init { public static void load() { if (((clojure.lang.Symbol)const__1).equals(const__2)) { tmpTernaryOp = null; break label67; ((clojure.lang.IFn)new core.loading__5569__auto____88()).invoke(); } else { clojure.lang.LockingTransaction.runInTransaction((java.util.concurrent.Callable)new core.fn__90()); } label67: tmp70_67 = const__3; tmp70_67.setMeta((clojure.lang.IPersistentMap)const__11);tmp70_67.bindRoot(new core.inline()); clojure.lang.Var tmp94_91 = const__12;tmp94_91.setMeta((clojure.lang.IPersistentMap)const__15);tmp94_91.bindRoot(new core.measure()); clojure.lang.Var tmp118_115 = const__16;tmp118_115.setMeta((clojure.lang.IPersistentMap)const__19);tmp118_115.bindRoot(new core.lyrics_for()); clojure.lang.Var tmp142_139 = const__20;tmp142_139.setMeta((clojure.lang.IPersistentMap)const__23);tmp142_139.bindRoot(new core.note());
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
/*   */   public static final clojure.lang.AFn const__19;
/*   */   public static final clojure.lang.Var const__20;
/*   */   public static final clojure.lang.AFn const__23;
/*   */   public static void __init0()
/*   */   {
/*   */     const__0 = (clojure.lang.Var)RT.var("clojure.core", "in-ns");
/*   */     const__1 = (clojure.lang.AFn)clojure.lang.Symbol.intern(null, "aeolian.abc.core");
/*   */     const__2 = (clojure.lang.AFn)clojure.lang.Symbol.intern(null, "clojure.core");
/*   */     const__3 = (clojure.lang.Var)RT.var("aeolian.abc.core", "inline");
/*   */     const__11 = (clojure.lang.AFn)RT.map(new Object[] { RT.keyword(null, "arglists"), clojure.lang.PersistentList.create(java.util.Arrays.asList(new Object[] { clojure.lang.Tuple.create(clojure.lang.Symbol.intern(null, "command")) })), RT.keyword(null, "line"), Integer.valueOf(3), RT.keyword(null, "column"), Integer.valueOf(1), RT.keyword(null, "file"), "aeolian/abc/core.clj" });
/*   */     const__12 = (clojure.lang.Var)RT.var("aeolian.abc.core", "measure");
/*   */     const__15 = (clojure.lang.AFn)RT.map(new Object[] { RT.keyword(null, "arglists"), clojure.lang.PersistentList.create(java.util.Arrays.asList(new Object[] { clojure.lang.Tuple.create(clojure.lang.Symbol.intern(null, "chord"), clojure.lang.Symbol.intern(null, "notes")) })), RT.keyword(null, "line"), Integer.valueOf(6), RT.keyword(null, "column"), Integer.valueOf(1), RT.keyword(null, "file"), "aeolian/abc/core.clj" });
/*   */     const__16 = (clojure.lang.Var)RT.var("aeolian.abc.core", "lyrics-for");
/*   */     const__19 = (clojure.lang.AFn)RT.map(new Object[] { RT.keyword(null, "arglists"), clojure.lang.PersistentList.create(java.util.Arrays.asList(new Object[] { clojure.lang.Tuple.create(clojure.lang.Symbol.intern(null, "lyric")) })), RT.keyword(null, "line"), Integer.valueOf(9), RT.keyword(null, "column"), Integer.valueOf(1), RT.keyword(null, "file"), "aeolian/abc/core.clj" });
/*   */     const__20 = (clojure.lang.Var)RT.var("aeolian.abc.core", "note");
/*   */     const__23 = (clojure.lang.AFn)RT.map(new Object[] { RT.keyword(null, "arglists"), clojure.lang.PersistentList.create(java.util.Arrays.asList(new Object[] { clojure.lang.Tuple.create(clojure.lang.Symbol.intern(null, "note"), clojure.lang.Symbol.intern(null, "instrument"), clojure.lang.Symbol.intern(null, "lyrics"), clojure.lang.Symbol.intern(null, "tempo")) })), RT.keyword(null, "line"), Integer.valueOf(12), RT.keyword(null, "column"), Integer.valueOf(1), RT.keyword(null, "file"), "aeolian/abc/core.clj" });
/*   */   }
/*   */   
/*   */   static
/*   */   {
/*   */     __init0();
/*   */     clojure.lang.Compiler.pushNSandLoader(RT.classForName("aeolian.abc.core__init").getClassLoader());
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


/* Location:              /home/amarks/code/aeolian/target/aeolian-0.1.1-SNAPSHOT.jar!/aeolian/abc/core__init.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */