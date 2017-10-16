/*    */ package aeolian.abc; import clojure.lang.RT;
/*    */ 
/*  1 */ public class notes__init { public static void load() { if (((clojure.lang.Symbol)const__1).equals(const__2)) { tmpTernaryOp = null; break label67; ((clojure.lang.IFn)new notes.loading__5569__auto____53()).invoke(); } else { clojure.lang.LockingTransaction.runInTransaction((java.util.concurrent.Callable)new notes.fn__61()); } label67: tmp70_67 = const__3; tmp70_67.setMeta((clojure.lang.IPersistentMap)const__10);tmp70_67.bindRoot("z"); clojure.lang.Var tmp89_86 = const__11;tmp89_86.setMeta((clojure.lang.IPersistentMap)const__13);tmp89_86.bindRoot(const__14); clojure.lang.Var tmp109_106 = const__15;tmp109_106.setMeta((clojure.lang.IPersistentMap)const__17);tmp109_106
/*    */     
/*    */ 
/*    */ 
/*    */ 
/*  6 */       .bindRoot(((clojure.lang.IFn)const__18.getRawRoot()).invoke(new notes.fn__64(), const__14)); clojure.lang.Var tmp150_147 = const__19;tmp150_147.setMeta((clojure.lang.IPersistentMap)const__21);tmp150_147.bindRoot(const__14); clojure.lang.Var tmp170_167 = const__22;tmp170_167.setMeta((clojure.lang.IPersistentMap)const__24);tmp170_167
/*    */     
/*  8 */       .bindRoot(((clojure.lang.IFn)const__18.getRawRoot()).invoke(const__25.getRawRoot(), const__14)); clojure.lang.Var tmp210_207 = const__26;tmp210_207.setMeta((clojure.lang.IPersistentMap)const__28);tmp210_207
/*  9 */       .bindRoot(((clojure.lang.IFn)const__18.getRawRoot()).invoke(new notes.fn__67(), const__29)); clojure.lang.Var tmp251_248 = const__30;tmp251_248.setMeta((clojure.lang.IPersistentMap)const__32);tmp251_248
/* 10 */       .bindRoot(((clojure.lang.IFn)const__18.getRawRoot()).invoke(new notes.fn__70(), const__33)); clojure.lang.Var tmp292_289 = const__34;tmp292_289.setMeta((clojure.lang.IPersistentMap)const__36);tmp292_289.bindRoot(const__37); clojure.lang.Var tmp312_309 = const__38;tmp312_309.setMeta((clojure.lang.IPersistentMap)const__40);tmp312_309.bindRoot(const__41); clojure.lang.Var tmp332_329 = const__42;tmp332_329.setMeta((clojure.lang.IPersistentMap)const__44);tmp332_329
/*    */     
/*    */ 
/*    */ 
/* 14 */       .bindRoot(((clojure.lang.IFn)const__18.getRawRoot()).invoke(new notes.fn__73(), const__41)); clojure.lang.Var tmp373_370 = const__45;tmp373_370.setMeta((clojure.lang.IPersistentMap)const__47);tmp373_370.bindRoot(const__41); clojure.lang.Var tmp393_390 = const__48;tmp393_390.setMeta((clojure.lang.IPersistentMap)const__50);tmp393_390
/*    */     
/* 16 */       .bindRoot(((clojure.lang.IFn)const__18.getRawRoot()).invoke(const__25.getRawRoot(), const__41)); clojure.lang.Var tmp433_430 = const__51;tmp433_430.setMeta((clojure.lang.IPersistentMap)const__53);tmp433_430
/* 17 */       .bindRoot(((clojure.lang.IFn)const__18.getRawRoot()).invoke(new notes.fn__76(), const__54)); clojure.lang.Var tmp474_471 = const__55;tmp474_471.setMeta((clojure.lang.IPersistentMap)const__57);tmp474_471
/* 18 */       .bindRoot(((clojure.lang.IFn)const__18.getRawRoot()).invoke(new notes.fn__79(), const__58)); clojure.lang.Var tmp515_512 = const__59;tmp515_512.setMeta((clojure.lang.IPersistentMap)const__61);tmp515_512.bindRoot(const__62); clojure.lang.Var tmp535_532 = const__63;tmp535_532.setMeta((clojure.lang.IPersistentMap)const__68);tmp535_532.bindRoot(new notes.chord()); clojure.lang.Var tmp559_556 = const__69;tmp559_556.setMeta((clojure.lang.IPersistentMap)const__72);tmp559_556.bindRoot(new notes.chord_for_method_length()); clojure.lang.Var tmp583_580 = const__73;tmp583_580.setMeta((clojure.lang.IPersistentMap)const__76);tmp583_580.bindRoot(new notes.octave_idx_to_octave_name()); clojure.lang.Var tmp607_604 = const__77;tmp607_604.setMeta((clojure.lang.IPersistentMap)const__80);tmp607_604.bindRoot(new notes.key_to_octave()); clojure.lang.Var tmp631_628 = const__81;tmp631_628.setMeta((clojure.lang.IPersistentMap)const__84);tmp631_628.bindRoot(new notes.note_from_octave()); clojure.lang.Var tmp655_652 = const__85;tmp655_652.setMeta((clojure.lang.IPersistentMap)const__88);tmp655_652.bindRoot(new notes.note_for_line_length());
/*    */   }
/*    */   
/*    */   public static final clojure.lang.Var const__0;
/*    */   public static final clojure.lang.AFn const__1;
/*    */   public static final clojure.lang.AFn const__2;
/*    */   public static final clojure.lang.Var const__3;
/*    */   public static final clojure.lang.AFn const__10;
/*    */   public static final clojure.lang.Var const__11;
/*    */   public static final clojure.lang.AFn const__13;
/*    */   public static final clojure.lang.AFn const__14;
/*    */   public static final clojure.lang.Var const__15;
/*    */   public static final clojure.lang.AFn const__17;
/*    */   public static final clojure.lang.Var const__18;
/*    */   public static final clojure.lang.Var const__19;
/*    */   public static final clojure.lang.AFn const__21;
/*    */   public static final clojure.lang.Var const__22;
/*    */   public static final clojure.lang.AFn const__24;
/*    */   public static final clojure.lang.Var const__25;
/*    */   public static final clojure.lang.Var const__26;
/*    */   public static final clojure.lang.AFn const__28;
/*    */   public static final clojure.lang.ISeq const__29;
/*    */   public static final clojure.lang.Var const__30;
/*    */   public static final clojure.lang.AFn const__32;
/*    */   public static final clojure.lang.ISeq const__33;
/*    */   public static final clojure.lang.Var const__34;
/*    */   public static final clojure.lang.AFn const__36;
/*    */   public static final clojure.lang.AFn const__37;
/*    */   public static final clojure.lang.Var const__38;
/*    */   public static final clojure.lang.AFn const__40;
/*    */   public static final clojure.lang.AFn const__41;
/*    */   public static final clojure.lang.Var const__42;
/*    */   public static final clojure.lang.AFn const__44;
/*    */   public static final clojure.lang.Var const__45;
/*    */   public static final clojure.lang.AFn const__47;
/*    */   public static final clojure.lang.Var const__48;
/*    */   public static final clojure.lang.AFn const__50;
/*    */   public static final clojure.lang.Var const__51;
/*    */   public static final clojure.lang.AFn const__53;
/*    */   public static final clojure.lang.ISeq const__54;
/*    */   public static final clojure.lang.Var const__55;
/*    */   public static final clojure.lang.AFn const__57;
/*    */   public static final clojure.lang.ISeq const__58;
/*    */   public static final clojure.lang.Var const__59;
/*    */   public static final clojure.lang.AFn const__61;
/*    */   public static final clojure.lang.AFn const__62;
/*    */   public static final clojure.lang.Var const__63;
/*    */   public static final clojure.lang.AFn const__68;
/*    */   public static final clojure.lang.Var const__69;
/*    */   public static final clojure.lang.AFn const__72;
/*    */   public static final clojure.lang.Var const__73;
/*    */   public static final clojure.lang.AFn const__76;
/*    */   public static final clojure.lang.Var const__77;
/*    */   public static final clojure.lang.AFn const__80;
/*    */   public static final clojure.lang.Var const__81;
/*    */   public static final clojure.lang.AFn const__84;
/*    */   public static final clojure.lang.Var const__85;
/*    */   public static final clojure.lang.AFn const__88;
/*    */   public static void __init0()
/*    */   {
/*    */     const__0 = (clojure.lang.Var)RT.var("clojure.core", "in-ns");
/*    */     const__1 = (clojure.lang.AFn)clojure.lang.Symbol.intern(null, "aeolian.abc.notes");
/*    */     const__2 = (clojure.lang.AFn)clojure.lang.Symbol.intern(null, "clojure.core");
/*    */     const__3 = (clojure.lang.Var)RT.var("aeolian.abc.notes", "rest-note");
/*    */     const__10 = (clojure.lang.AFn)RT.map(new Object[] { RT.keyword(null, "const"), Boolean.TRUE, RT.keyword(null, "line"), Integer.valueOf(4), RT.keyword(null, "column"), Integer.valueOf(1), RT.keyword(null, "file"), "aeolian/abc/notes.clj" });
/*    */     const__11 = (clojure.lang.Var)RT.var("aeolian.abc.notes", "major-raw-notes");
/*    */     const__13 = (clojure.lang.AFn)RT.map(new Object[] { RT.keyword(null, "const"), Boolean.TRUE, RT.keyword(null, "line"), Integer.valueOf(5), RT.keyword(null, "column"), Integer.valueOf(1), RT.keyword(null, "file"), "aeolian/abc/notes.clj" });
/*    */     const__14 = (clojure.lang.AFn)clojure.lang.Tuple.create("C", "E", "G", "B");
/*    */     const__15 = (clojure.lang.Var)RT.var("aeolian.abc.notes", "major-octave-1");
/*    */     const__17 = (clojure.lang.AFn)RT.map(new Object[] { RT.keyword(null, "const"), Boolean.TRUE, RT.keyword(null, "line"), Integer.valueOf(6), RT.keyword(null, "column"), Integer.valueOf(1), RT.keyword(null, "file"), "aeolian/abc/notes.clj" });
/*    */     const__18 = (clojure.lang.Var)RT.var("clojure.core", "map");
/*    */     const__19 = (clojure.lang.Var)RT.var("aeolian.abc.notes", "major-octave-2");
/*    */     const__21 = (clojure.lang.AFn)RT.map(new Object[] { RT.keyword(null, "const"), Boolean.TRUE, RT.keyword(null, "line"), Integer.valueOf(7), RT.keyword(null, "column"), Integer.valueOf(1), RT.keyword(null, "file"), "aeolian/abc/notes.clj" });
/*    */     const__22 = (clojure.lang.Var)RT.var("aeolian.abc.notes", "major-octave-3");
/*    */     const__24 = (clojure.lang.AFn)RT.map(new Object[] { RT.keyword(null, "const"), Boolean.TRUE, RT.keyword(null, "line"), Integer.valueOf(8), RT.keyword(null, "column"), Integer.valueOf(1), RT.keyword(null, "file"), "aeolian/abc/notes.clj" });
/*    */     const__25 = (clojure.lang.Var)RT.var("clojure.string", "lower-case");
/*    */     const__26 = (clojure.lang.Var)RT.var("aeolian.abc.notes", "major-octave-4");
/*    */     const__28 = (clojure.lang.AFn)RT.map(new Object[] { RT.keyword(null, "const"), Boolean.TRUE, RT.keyword(null, "line"), Integer.valueOf(9), RT.keyword(null, "column"), Integer.valueOf(1), RT.keyword(null, "file"), "aeolian/abc/notes.clj" });
/*    */     const__29 = (clojure.lang.ISeq)clojure.lang.PersistentList.create(java.util.Arrays.asList(new Object[] { "c", "e", "g", "b" }));
/*    */     const__30 = (clojure.lang.Var)RT.var("aeolian.abc.notes", "major-octave-5");
/*    */     const__32 = (clojure.lang.AFn)RT.map(new Object[] { RT.keyword(null, "const"), Boolean.TRUE, RT.keyword(null, "line"), Integer.valueOf(10), RT.keyword(null, "column"), Integer.valueOf(1), RT.keyword(null, "file"), "aeolian/abc/notes.clj" });
/*    */     const__33 = (clojure.lang.ISeq)clojure.lang.PersistentList.create(java.util.Arrays.asList(new Object[] { "c'", "e'", "g'", "b'" }));
/*    */     const__34 = (clojure.lang.Var)RT.var("aeolian.abc.notes", "major-chords");
/*    */     const__36 = (clojure.lang.AFn)RT.map(new Object[] { RT.keyword(null, "const"), Boolean.TRUE, RT.keyword(null, "line"), Integer.valueOf(11), RT.keyword(null, "column"), Integer.valueOf(1), RT.keyword(null, "file"), "aeolian/abc/notes.clj" });
/*    */     const__37 = (clojure.lang.AFn)RT.vector(new Object[] { "C", "Dm", "Em", "F", "G", "A+", "B+" });
/*    */     const__38 = (clojure.lang.Var)RT.var("aeolian.abc.notes", "minor-raw-notes");
/*    */     const__40 = (clojure.lang.AFn)RT.map(new Object[] { RT.keyword(null, "const"), Boolean.TRUE, RT.keyword(null, "line"), Integer.valueOf(13), RT.keyword(null, "column"), Integer.valueOf(1), RT.keyword(null, "file"), "aeolian/abc/notes.clj" });
/*    */     const__41 = (clojure.lang.AFn)clojure.lang.Tuple.create("C", "^D", "G", "^A");
/*    */     const__42 = (clojure.lang.Var)RT.var("aeolian.abc.notes", "minor-octave-1");
/*    */     const__44 = (clojure.lang.AFn)RT.map(new Object[] { RT.keyword(null, "const"), Boolean.TRUE, RT.keyword(null, "line"), Integer.valueOf(14), RT.keyword(null, "column"), Integer.valueOf(1), RT.keyword(null, "file"), "aeolian/abc/notes.clj" });
/*    */     const__45 = (clojure.lang.Var)RT.var("aeolian.abc.notes", "minor-octave-2");
/*    */     const__47 = (clojure.lang.AFn)RT.map(new Object[] { RT.keyword(null, "const"), Boolean.TRUE, RT.keyword(null, "line"), Integer.valueOf(15), RT.keyword(null, "column"), Integer.valueOf(1), RT.keyword(null, "file"), "aeolian/abc/notes.clj" });
/*    */     const__48 = (clojure.lang.Var)RT.var("aeolian.abc.notes", "minor-octave-3");
/*    */     const__50 = (clojure.lang.AFn)RT.map(new Object[] { RT.keyword(null, "const"), Boolean.TRUE, RT.keyword(null, "line"), Integer.valueOf(16), RT.keyword(null, "column"), Integer.valueOf(1), RT.keyword(null, "file"), "aeolian/abc/notes.clj" });
/*    */     const__51 = (clojure.lang.Var)RT.var("aeolian.abc.notes", "minor-octave-4");
/*    */     const__53 = (clojure.lang.AFn)RT.map(new Object[] { RT.keyword(null, "const"), Boolean.TRUE, RT.keyword(null, "line"), Integer.valueOf(17), RT.keyword(null, "column"), Integer.valueOf(1), RT.keyword(null, "file"), "aeolian/abc/notes.clj" });
/*    */     const__54 = (clojure.lang.ISeq)clojure.lang.PersistentList.create(java.util.Arrays.asList(new Object[] { "c", "^d", "g", "^a" }));
/*    */     const__55 = (clojure.lang.Var)RT.var("aeolian.abc.notes", "minor-octave-5");
/*    */     const__57 = (clojure.lang.AFn)RT.map(new Object[] { RT.keyword(null, "const"), Boolean.TRUE, RT.keyword(null, "line"), Integer.valueOf(18), RT.keyword(null, "column"), Integer.valueOf(1), RT.keyword(null, "file"), "aeolian/abc/notes.clj" });
/*    */     const__58 = (clojure.lang.ISeq)clojure.lang.PersistentList.create(java.util.Arrays.asList(new Object[] { "c'", "^d'", "g'", "^a'" }));
/*    */     const__59 = (clojure.lang.Var)RT.var("aeolian.abc.notes", "minor-chords");
/*    */     const__61 = (clojure.lang.AFn)RT.map(new Object[] { RT.keyword(null, "const"), Boolean.TRUE, RT.keyword(null, "line"), Integer.valueOf(19), RT.keyword(null, "column"), Integer.valueOf(1), RT.keyword(null, "file"), "aeolian/abc/notes.clj" });
/*    */     const__62 = (clojure.lang.AFn)RT.vector(new Object[] { "Cm", "Ddim", "_E", "Fm", "Gm", "_A+", "_B+" });
/*    */     const__63 = (clojure.lang.Var)RT.var("aeolian.abc.notes", "chord");
/*    */     const__68 = (clojure.lang.AFn)RT.map(new Object[] { RT.keyword(null, "private"), Boolean.TRUE, RT.keyword(null, "arglists"), clojure.lang.PersistentList.create(java.util.Arrays.asList(new Object[] { clojure.lang.Tuple.create(clojure.lang.Symbol.intern(null, "chord-index"), clojure.lang.Symbol.intern(null, "composition-key")) })), RT.keyword(null, "line"), Integer.valueOf(21), RT.keyword(null, "column"), Integer.valueOf(1), RT.keyword(null, "file"), "aeolian/abc/notes.clj" });
/*    */     const__69 = (clojure.lang.Var)RT.var("aeolian.abc.notes", "chord-for-method-length");
/*    */     const__72 = (clojure.lang.AFn)RT.map(new Object[] { RT.keyword(null, "arglists"), clojure.lang.PersistentList.create(java.util.Arrays.asList(new Object[] { clojure.lang.Tuple.create(clojure.lang.Symbol.intern(null, "method-length"), clojure.lang.Symbol.intern(null, "composition-key"), clojure.lang.Symbol.intern(null, "current-method-length")) })), RT.keyword(null, "line"), Integer.valueOf(26), RT.keyword(null, "column"), Integer.valueOf(1), RT.keyword(null, "file"), "aeolian/abc/notes.clj" });
/*    */     const__73 = (clojure.lang.Var)RT.var("aeolian.abc.notes", "octave-idx-to-octave-name");
/*    */     const__76 = (clojure.lang.AFn)RT.map(new Object[] { RT.keyword(null, "private"), Boolean.TRUE, RT.keyword(null, "arglists"), clojure.lang.PersistentList.create(java.util.Arrays.asList(new Object[] { clojure.lang.Tuple.create(clojure.lang.Symbol.intern(null, "octave-prefix"), clojure.lang.Symbol.intern(null, "octave-idx")) })), RT.keyword(null, "line"), Integer.valueOf(38), RT.keyword(null, "column"), Integer.valueOf(1), RT.keyword(null, "file"), "aeolian/abc/notes.clj" });
/*    */     const__77 = (clojure.lang.Var)RT.var("aeolian.abc.notes", "key-to-octave");
/*    */     const__80 = (clojure.lang.AFn)RT.map(new Object[] { RT.keyword(null, "private"), Boolean.TRUE, RT.keyword(null, "arglists"), clojure.lang.PersistentList.create(java.util.Arrays.asList(new Object[] { clojure.lang.Tuple.create(clojure.lang.Symbol.intern(null, "octave-idx"), clojure.lang.Symbol.intern(null, "composition-key")) })), RT.keyword(null, "line"), Integer.valueOf(41), RT.keyword(null, "column"), Integer.valueOf(1), RT.keyword(null, "file"), "aeolian/abc/notes.clj" });
/*    */     const__81 = (clojure.lang.Var)RT.var("aeolian.abc.notes", "note-from-octave");
/*    */     const__84 = (clojure.lang.AFn)RT.map(new Object[] { RT.keyword(null, "private"), Boolean.TRUE, RT.keyword(null, "arglists"), clojure.lang.PersistentList.create(java.util.Arrays.asList(new Object[] { clojure.lang.Tuple.create(clojure.lang.Symbol.intern(null, "octave-idx"), clojure.lang.Symbol.intern(null, "line-length"), clojure.lang.Symbol.intern(null, "composition-key")) })), RT.keyword(null, "line"), Integer.valueOf(46), RT.keyword(null, "column"), Integer.valueOf(1), RT.keyword(null, "file"), "aeolian/abc/notes.clj" });
/*    */     const__85 = (clojure.lang.Var)RT.var("aeolian.abc.notes", "note-for-line-length");
/*    */     const__88 = (clojure.lang.AFn)RT.map(new Object[] { RT.keyword(null, "arglists"), clojure.lang.PersistentList.create(java.util.Arrays.asList(new Object[] { clojure.lang.Tuple.create(clojure.lang.Symbol.intern(null, "line-length"), clojure.lang.Symbol.intern(null, "composition-key")) })), RT.keyword(null, "line"), Integer.valueOf(50), RT.keyword(null, "column"), Integer.valueOf(1), RT.keyword(null, "file"), "aeolian/abc/notes.clj" });
/*    */   }
/*    */   
/*    */   static
/*    */   {
/*    */     __init0();
/*    */     clojure.lang.Compiler.pushNSandLoader(RT.classForName("aeolian.abc.notes__init").getClassLoader());
/*    */     try
/*    */     {
/*    */       load();
/*    */       clojure.lang.Var.popThreadBindings();
/*    */     }
/*    */     finally
/*    */     {
/*    */       clojure.lang.Var.popThreadBindings();
/*    */       throw finally;
/*    */     }
/*    */   }
/*    */ }


/* Location:              /home/amarks/code/aeolian/target/aeolian-0.1.1-SNAPSHOT.jar!/aeolian/abc/notes__init.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */