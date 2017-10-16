/*   */ package aeolian.abc; import clojure.lang.Var;
/*   */ 
/* 1 */ public class header__init { public static void load() { if (((clojure.lang.Symbol)const__1).equals(const__2)) { tmpTernaryOp = null; break label67; ((clojure.lang.IFn)new header.loading__5569__auto____9750()).invoke(); } else { clojure.lang.LockingTransaction.runInTransaction((java.util.concurrent.Callable)new header.fn__9752()); } label67: tmp70_67 = const__3; tmp70_67.setMeta((clojure.lang.IPersistentMap)const__9);tmp70_67.bindRoot("\nX:1"); Var tmp89_86 = const__10;tmp89_86.setMeta((clojure.lang.IPersistentMap)const__12);tmp89_86.bindRoot("\nT:"); Var tmp108_105 = const__13;tmp108_105.setMeta((clojure.lang.IPersistentMap)const__15);tmp108_105.bindRoot("\nC:AEOLIAN"); Var tmp127_124 = const__16;tmp127_124.setMeta((clojure.lang.IPersistentMap)const__18);tmp127_124.bindRoot("\nM:4/4"); Var tmp146_143 = const__19;tmp146_143.setMeta((clojure.lang.IPersistentMap)const__21);tmp146_143.bindRoot("\nL:1/8"); Var tmp165_162 = const__22;tmp165_162.setMeta((clojure.lang.IPersistentMap)const__24);tmp165_162.bindRoot("\n%%MIDI chordvol 50"); Var tmp184_181 = const__25;tmp184_181.setMeta((clojure.lang.IPersistentMap)const__27);tmp184_181.bindRoot("\n%%MIDI channel 1\n%%MIDI drum dd2d2ddd2d2d 59 51 51 59 59 51 51 59 100 50 50 100 100 50 50 100\n%%MIDI drumon"); Var tmp203_200 = const__28;tmp203_200.setMeta((clojure.lang.IPersistentMap)const__30);tmp203_200.bindRoot(clojure.lang.RT.map(new Object[] { const__31.getRawRoot(), "\nK:C", const__32.getRawRoot(), "\nK:Amin" })); Var tmp255_252 = const__33;tmp255_252.setMeta((clojure.lang.IPersistentMap)const__37);tmp255_252.bindRoot(new header.build_common_header()); Var tmp279_276 = const__38;tmp279_276.setMeta((clojure.lang.IPersistentMap)const__41);tmp279_276.bindRoot(new header.build_major_header()); Var tmp303_300 = const__42;tmp303_300.setMeta((clojure.lang.IPersistentMap)const__45);tmp303_300.bindRoot(new header.build_minor_header());
/*   */   }
/*   */   
/*   */   public static final Var const__0;
/*   */   public static final clojure.lang.AFn const__1;
/*   */   public static final clojure.lang.AFn const__2;
/*   */   public static final Var const__3;
/*   */   public static final clojure.lang.AFn const__9;
/*   */   public static final Var const__10;
/*   */   public static final clojure.lang.AFn const__12;
/*   */   public static final Var const__13;
/*   */   public static final clojure.lang.AFn const__15;
/*   */   public static final Var const__16;
/*   */   public static final clojure.lang.AFn const__18;
/*   */   public static final Var const__19;
/*   */   public static final clojure.lang.AFn const__21;
/*   */   public static final Var const__22;
/*   */   public static final clojure.lang.AFn const__24;
/*   */   public static final Var const__25;
/*   */   public static final clojure.lang.AFn const__27;
/*   */   public static final Var const__28;
/*   */   public static final clojure.lang.AFn const__30;
/*   */   public static final Var const__31;
/*   */   public static final Var const__32;
/*   */   public static final Var const__33;
/*   */   public static final clojure.lang.AFn const__37;
/*   */   public static final Var const__38;
/*   */   public static final clojure.lang.AFn const__41;
/*   */   public static final Var const__42;
/*   */   public static final clojure.lang.AFn const__45;
/*   */   public static void __init0()
/*   */   {
/*   */     const__0 = (Var)clojure.lang.RT.var("clojure.core", "in-ns");
/*   */     const__1 = (clojure.lang.AFn)clojure.lang.Symbol.intern(null, "aeolian.abc.header");
/*   */     const__2 = (clojure.lang.AFn)clojure.lang.Symbol.intern(null, "clojure.core");
/*   */     const__3 = (Var)clojure.lang.RT.var("aeolian.abc.header", "reference");
/*   */     const__9 = (clojure.lang.AFn)clojure.lang.RT.map(new Object[] { clojure.lang.RT.keyword(null, "line"), Integer.valueOf(5), clojure.lang.RT.keyword(null, "column"), Integer.valueOf(1), clojure.lang.RT.keyword(null, "file"), "aeolian/abc/header.clj" });
/*   */     const__10 = (Var)clojure.lang.RT.var("aeolian.abc.header", "title-prefix");
/*   */     const__12 = (clojure.lang.AFn)clojure.lang.RT.map(new Object[] { clojure.lang.RT.keyword(null, "line"), Integer.valueOf(6), clojure.lang.RT.keyword(null, "column"), Integer.valueOf(1), clojure.lang.RT.keyword(null, "file"), "aeolian/abc/header.clj" });
/*   */     const__13 = (Var)clojure.lang.RT.var("aeolian.abc.header", "composer");
/*   */     const__15 = (clojure.lang.AFn)clojure.lang.RT.map(new Object[] { clojure.lang.RT.keyword(null, "line"), Integer.valueOf(7), clojure.lang.RT.keyword(null, "column"), Integer.valueOf(1), clojure.lang.RT.keyword(null, "file"), "aeolian/abc/header.clj" });
/*   */     const__16 = (Var)clojure.lang.RT.var("aeolian.abc.header", "meter");
/*   */     const__18 = (clojure.lang.AFn)clojure.lang.RT.map(new Object[] { clojure.lang.RT.keyword(null, "line"), Integer.valueOf(8), clojure.lang.RT.keyword(null, "column"), Integer.valueOf(1), clojure.lang.RT.keyword(null, "file"), "aeolian/abc/header.clj" });
/*   */     const__19 = (Var)clojure.lang.RT.var("aeolian.abc.header", "note-length");
/*   */     const__21 = (clojure.lang.AFn)clojure.lang.RT.map(new Object[] { clojure.lang.RT.keyword(null, "line"), Integer.valueOf(9), clojure.lang.RT.keyword(null, "column"), Integer.valueOf(1), clojure.lang.RT.keyword(null, "file"), "aeolian/abc/header.clj" });
/*   */     const__22 = (Var)clojure.lang.RT.var("aeolian.abc.header", "misc");
/*   */     const__24 = (clojure.lang.AFn)clojure.lang.RT.map(new Object[] { clojure.lang.RT.keyword(null, "line"), Integer.valueOf(10), clojure.lang.RT.keyword(null, "column"), Integer.valueOf(1), clojure.lang.RT.keyword(null, "file"), "aeolian/abc/header.clj" });
/*   */     const__25 = (Var)clojure.lang.RT.var("aeolian.abc.header", "drums");
/*   */     const__27 = (clojure.lang.AFn)clojure.lang.RT.map(new Object[] { clojure.lang.RT.keyword(null, "line"), Integer.valueOf(11), clojure.lang.RT.keyword(null, "column"), Integer.valueOf(1), clojure.lang.RT.keyword(null, "file"), "aeolian/abc/header.clj" });
/*   */     const__28 = (Var)clojure.lang.RT.var("aeolian.abc.header", "key-mapping");
/*   */     const__30 = (clojure.lang.AFn)clojure.lang.RT.map(new Object[] { clojure.lang.RT.keyword(null, "line"), Integer.valueOf(12), clojure.lang.RT.keyword(null, "column"), Integer.valueOf(1), clojure.lang.RT.keyword(null, "file"), "aeolian/abc/header.clj" });
/*   */     const__31 = (Var)clojure.lang.RT.var("aeolian.abc.key", "major");
/*   */     const__32 = (Var)clojure.lang.RT.var("aeolian.abc.key", "minor");
/*   */     const__33 = (Var)clojure.lang.RT.var("aeolian.abc.header", "build-common-header");
/*   */     const__37 = (clojure.lang.AFn)clojure.lang.RT.map(new Object[] { clojure.lang.RT.keyword(null, "arglists"), clojure.lang.PersistentList.create(java.util.Arrays.asList(new Object[] { clojure.lang.Tuple.create(clojure.lang.Symbol.intern(null, "title"), clojure.lang.Symbol.intern(null, "key")) })), clojure.lang.RT.keyword(null, "line"), Integer.valueOf(14), clojure.lang.RT.keyword(null, "column"), Integer.valueOf(1), clojure.lang.RT.keyword(null, "file"), "aeolian/abc/header.clj" });
/*   */     const__38 = (Var)clojure.lang.RT.var("aeolian.abc.header", "build-major-header");
/*   */     const__41 = (clojure.lang.AFn)clojure.lang.RT.map(new Object[] { clojure.lang.RT.keyword(null, "arglists"), clojure.lang.PersistentList.create(java.util.Arrays.asList(new Object[] { clojure.lang.Tuple.create(clojure.lang.Symbol.intern(null, "title")) })), clojure.lang.RT.keyword(null, "line"), Integer.valueOf(17), clojure.lang.RT.keyword(null, "column"), Integer.valueOf(1), clojure.lang.RT.keyword(null, "file"), "aeolian/abc/header.clj" });
/*   */     const__42 = (Var)clojure.lang.RT.var("aeolian.abc.header", "build-minor-header");
/*   */     const__45 = (clojure.lang.AFn)clojure.lang.RT.map(new Object[] { clojure.lang.RT.keyword(null, "arglists"), clojure.lang.PersistentList.create(java.util.Arrays.asList(new Object[] { clojure.lang.Tuple.create(clojure.lang.Symbol.intern(null, "title")) })), clojure.lang.RT.keyword(null, "line"), Integer.valueOf(20), clojure.lang.RT.keyword(null, "column"), Integer.valueOf(1), clojure.lang.RT.keyword(null, "file"), "aeolian/abc/header.clj" });
/*   */   }
/*   */   
/*   */   static
/*   */   {
/*   */     __init0();
/*   */     clojure.lang.Compiler.pushNSandLoader(clojure.lang.RT.classForName("aeolian.abc.header__init").getClassLoader());
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


/* Location:              /home/amarks/code/aeolian/target/aeolian-0.1.1-SNAPSHOT.jar!/aeolian/abc/header__init.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */