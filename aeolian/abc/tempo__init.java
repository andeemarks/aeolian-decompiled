/*   */ package aeolian.abc; import clojure.lang.Var;
/*   */ 
/* 1 */ public class tempo__init { public static void load() { if (((clojure.lang.Symbol)const__1).equals(const__2)) { tmpTernaryOp = null; break label67; ((clojure.lang.IFn)new tempo.loading__5569__auto____47()).invoke(); } else { clojure.lang.LockingTransaction.runInTransaction((java.util.concurrent.Callable)new tempo.fn__49()); } label67: tmp70_67 = const__3; tmp70_67.setMeta((clojure.lang.IPersistentMap)const__9);tmp70_67.bindRoot("Q:1/4="); Var tmp89_86 = const__10;tmp89_86.setMeta((clojure.lang.IPersistentMap)const__12);tmp89_86.bindRoot(const__13); Var tmp109_106 = const__14;tmp109_106.setMeta((clojure.lang.IPersistentMap)const__16);tmp109_106
/*   */     
/*   */ 
/*   */ 
/* 5 */       .bindRoot(((clojure.lang.IFn)const__17.getRawRoot()).invoke(const__3.getRawRoot(), const__10.getRawRoot())); Var tmp152_149 = const__18;tmp152_149.setMeta((clojure.lang.IPersistentMap)const__22);tmp152_149.bindRoot(new tempo.generate()); Var tmp176_173 = const__23;tmp176_173.setMeta((clojure.lang.IPersistentMap)const__26);tmp176_173.bindRoot(new tempo.tempo_for());
/*   */   }
/*   */   
/*   */   public static final Var const__0;
/*   */   public static final clojure.lang.AFn const__1;
/*   */   public static final clojure.lang.AFn const__2;
/*   */   public static final Var const__3;
/*   */   public static final clojure.lang.AFn const__9;
/*   */   public static final Var const__10;
/*   */   public static final clojure.lang.AFn const__12;
/*   */   public static final Object const__13;
/*   */   public static final Var const__14;
/*   */   public static final clojure.lang.AFn const__16;
/*   */   public static final Var const__17;
/*   */   public static final Var const__18;
/*   */   public static final clojure.lang.AFn const__22;
/*   */   public static final Var const__23;
/*   */   public static final clojure.lang.AFn const__26;
/*   */   public static void __init0()
/*   */   {
/*   */     const__0 = (Var)clojure.lang.RT.var("clojure.core", "in-ns");
/*   */     const__1 = (clojure.lang.AFn)clojure.lang.Symbol.intern(null, "aeolian.abc.tempo");
/*   */     const__2 = (clojure.lang.AFn)clojure.lang.Symbol.intern(null, "clojure.core");
/*   */     const__3 = (Var)clojure.lang.RT.var("aeolian.abc.tempo", "prefix");
/*   */     const__9 = (clojure.lang.AFn)clojure.lang.RT.map(new Object[] { clojure.lang.RT.keyword(null, "line"), Integer.valueOf(3), clojure.lang.RT.keyword(null, "column"), Integer.valueOf(1), clojure.lang.RT.keyword(null, "file"), "aeolian/abc/tempo.clj" });
/*   */     const__10 = (Var)clojure.lang.RT.var("aeolian.abc.tempo", "default-tempo");
/*   */     const__12 = (clojure.lang.AFn)clojure.lang.RT.map(new Object[] { clojure.lang.RT.keyword(null, "line"), Integer.valueOf(4), clojure.lang.RT.keyword(null, "column"), Integer.valueOf(1), clojure.lang.RT.keyword(null, "file"), "aeolian/abc/tempo.clj" });
/*   */     const__13 = Long.valueOf(120L);
/*   */     const__14 = (Var)clojure.lang.RT.var("aeolian.abc.tempo", "starting-tempo");
/*   */     const__16 = (clojure.lang.AFn)clojure.lang.RT.map(new Object[] { clojure.lang.RT.keyword(null, "line"), Integer.valueOf(5), clojure.lang.RT.keyword(null, "column"), Integer.valueOf(1), clojure.lang.RT.keyword(null, "file"), "aeolian/abc/tempo.clj" });
/*   */     const__17 = (Var)clojure.lang.RT.var("clojure.core", "str");
/*   */     const__18 = (Var)clojure.lang.RT.var("aeolian.abc.tempo", "generate");
/*   */     const__22 = (clojure.lang.AFn)clojure.lang.RT.map(new Object[] { clojure.lang.RT.keyword(null, "arglists"), clojure.lang.PersistentList.create(java.util.Arrays.asList(new Object[] { clojure.lang.Tuple.create(clojure.lang.Symbol.intern(null, "complexity")) })), clojure.lang.RT.keyword(null, "line"), Integer.valueOf(7), clojure.lang.RT.keyword(null, "column"), Integer.valueOf(1), clojure.lang.RT.keyword(null, "file"), "aeolian/abc/tempo.clj" });
/*   */     const__23 = (Var)clojure.lang.RT.var("aeolian.abc.tempo", "tempo-for");
/*   */     const__26 = (clojure.lang.AFn)clojure.lang.RT.map(new Object[] { clojure.lang.RT.keyword(null, "arglists"), clojure.lang.PersistentList.create(java.util.Arrays.asList(new Object[] { clojure.lang.Tuple.create(clojure.lang.Symbol.intern(null, "complexity")) })), clojure.lang.RT.keyword(null, "line"), Integer.valueOf(10), clojure.lang.RT.keyword(null, "column"), Integer.valueOf(1), clojure.lang.RT.keyword(null, "file"), "aeolian/abc/tempo.clj" });
/*   */   }
/*   */   
/*   */   static
/*   */   {
/*   */     __init0();
/*   */     clojure.lang.Compiler.pushNSandLoader(clojure.lang.RT.classForName("aeolian.abc.tempo__init").getClassLoader());
/*   */     try
/*   */     {
/*   */       load();
/*   */       Var.popThreadBindings();
/*   */     }
/*   */     finally
/*   */     {
/*   */       Var.popThreadBindings();
/*   */       throw finally;
/*   */     }
/*   */   }
/*   */ }


/* Location:              /home/amarks/code/aeolian/target/aeolian-0.1.1-SNAPSHOT.jar!/aeolian/abc/tempo__init.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */