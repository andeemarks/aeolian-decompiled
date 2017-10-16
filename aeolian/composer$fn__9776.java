/*    */ package aeolian;
/*    */ 
/*    */ import clojure.lang.AFn;
/*    */ import clojure.lang.AFunction;
/*    */ import clojure.lang.Delay;
/*    */ import clojure.lang.IFn;
/*    */ import clojure.lang.IObj;
/*    */ import clojure.lang.IPersistentMap;
/*    */ import clojure.lang.ISeq;
/*    */ import clojure.lang.Keyword;
/*    */ import clojure.lang.PersistentList;
/*    */ import clojure.lang.RT;
/*    */ import clojure.lang.Symbol;
/*    */ import clojure.lang.Tuple;
/*    */ import clojure.lang.Var;
/*    */ import java.util.Arrays;
/*    */ import schema.core.Maybe;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class composer$fn__9776
/*    */   extends AFunction
/*    */ {
/* 45 */   public Object invoke() { return invokeStatic(); } public static Object invokeStatic() { Object ufv__ = const__0.getRawRoot();Object output_schema9769 = const__1;Object input_schema9770 = Tuple.create(((IFn)const__2.getRawRoot()).invoke(const__4, const__5), ((IFn)const__2.getRawRoot()).invoke(const__6.getRawRoot(), const__7), ((IFn)const__2.getRawRoot()).invoke(const__6.getRawRoot(), const__8));Object input_checker9771 = new Delay((IFn)new composer.fn__9776.fn__9777(input_schema9770));Object output_checker9772 = new Delay((IFn)new composer.fn__9776.fn__9779(output_schema9769)); Var tmp123_120 = const__9;tmp123_120.setMeta((IPersistentMap)RT.mapUniqueKeys(new Object[] { const__10, const__11, const__12, ((IFn)const__13.getRawRoot()).invoke(output_schema9769, Tuple.create(input_schema9770)), const__14, "Inputs: [measure-lines-metrics :- [ParsedMetricLine] composition-key method-length]\n  Returns: Measure", const__15, const__16, const__17, const__18, const__19, const__20, const__21, "aeolian/composer.clj" })); Var tmp244_123 = tmp123_120;input_checker9771 = null;ufv__ = null;output_checker9772 = null;tmp244_123.bindRoot(new composer.fn__9776.build_measure__9781(input_schema9770, output_schema9769, input_checker9771, ufv__, output_checker9772));Object ret__9734__auto__9793 = tmp244_123;output_schema9769 = null;input_schema9770 = null;((IFn)const__22.getRawRoot()).invoke(((IFn)const__23.getRawRoot()).invoke(const__9.getRawRoot()), ((IFn)const__13.getRawRoot()).invoke(output_schema9769, Tuple.create(input_schema9770)));ret__9734__auto__9793 = null;return ret__9734__auto__9793; } public static final Var const__23 = (Var)RT.var("schema.utils", "fn-schema-bearer"); public static final Var const__22 = (Var)RT.var("schema.utils", "declare-class-schema!"); public static final Keyword const__21 = (Keyword)RT.keyword(null, "file"); public static final Object const__20 = Integer.valueOf(1); public static final Keyword const__19 = (Keyword)RT.keyword(null, "column"); public static final Object const__18 = Integer.valueOf(45); public static final Keyword const__17 = (Keyword)RT.keyword(null, "line"); public static final ISeq const__16 = (ISeq)PersistentList.create(Arrays.asList(new Object[] { Tuple.create(Symbol.intern(null, "measure-lines-metrics"), RT.keyword(null, "-"), Tuple.create(Symbol.intern(null, "ParsedMetricLine")), Symbol.intern(null, "composition-key"), Symbol.intern(null, "method-length")) })); public static final Keyword const__15 = (Keyword)RT.keyword(null, "raw-arglists"); public static final Keyword const__14 = (Keyword)RT.keyword(null, "doc"); public static final Var const__13 = (Var)RT.var("schema.core", "->FnSchema"); public static final Keyword const__12 = (Keyword)RT.keyword(null, "schema"); public static final ISeq const__11 = (ISeq)PersistentList.create(Arrays.asList(new Object[] { Tuple.create(((IObj)Symbol.intern(null, "measure-lines-metrics")).withMeta((IPersistentMap)RT.map(new Object[] { RT.keyword(null, "schema"), Tuple.create(Symbol.intern(null, "ParsedMetricLine")) })), ((IObj)Symbol.intern(null, "composition-key")).withMeta((IPersistentMap)RT.map(new Object[] { RT.keyword(null, "schema"), Symbol.intern("schema.core", "Any") })), ((IObj)Symbol.intern(null, "method-length")).withMeta((IPersistentMap)RT.map(new Object[] { RT.keyword(null, "schema"), Symbol.intern("schema.core", "Any") }))) })); public static final Keyword const__10 = (Keyword)RT.keyword(null, "arglists"); public static final Var const__9 = (Var)RT.var("aeolian.composer", "build-measure"); public static final AFn const__8 = (AFn)((IObj)Symbol.intern(null, "method-length")).withMeta((IPersistentMap)RT.map(new Object[] { RT.keyword(null, "schema"), Symbol.intern("schema.core", "Any") })); public static final AFn const__7 = (AFn)((IObj)Symbol.intern(null, "composition-key")).withMeta((IPersistentMap)RT.map(new Object[] { RT.keyword(null, "schema"), Symbol.intern("schema.core", "Any") })); public static final Var const__6 = (Var)RT.var("schema.core", "Any"); public static final AFn const__5 = (AFn)((IObj)Symbol.intern(null, "measure-lines-metrics")).withMeta((IPersistentMap)RT.map(new Object[] { RT.keyword(null, "schema"), Tuple.create(Symbol.intern(null, "ParsedMetricLine")) })); public static final AFn const__4 = (AFn)Tuple.create(((IObj)RT.map(new Object[] { RT.keyword(null, "author"), Maybe.create(RT.map(new Object[] { RT.keyword(null, "schema"), RT.classForName("java.lang.String") })), RT.keyword(null, "line-length"), RT.classForName("java.lang.Number"), RT.keyword(null, "source-file"), RT.classForName("java.lang.String"), RT.keyword(null, "method-length"), Maybe.create(RT.map(new Object[] { RT.keyword(null, "schema"), RT.classForName("java.lang.Number") })), RT.keyword(null, "indentation?"), Maybe.create(RT.map(new Object[] { RT.keyword(null, "schema"), RT.classForName("java.lang.String") })), RT.keyword(null, "complexity"), RT.classForName("java.lang.Number"), RT.keyword(null, "timestamp"), Maybe.create(RT.map(new Object[] { RT.keyword(null, "schema"), RT.classForName("java.lang.Number") })) })).withMeta((IPersistentMap)RT.map(new Object[] { RT.keyword(null, "name"), ((IObj)Symbol.intern(null, "ParsedMetricLine")).withMeta((IPersistentMap)RT.map(new Object[] { RT.keyword(null, "const"), Boolean.TRUE })), RT.keyword(null, "ns"), Symbol.intern(null, "aeolian.composer") }))); public static final Var const__2 = (Var)RT.var("schema.core", "one"); public static final AFn const__1 = (AFn)((IObj)RT.map(new Object[] { RT.keyword(null, "notes"), Tuple.create(RT.classForName("java.lang.String")), RT.keyword(null, "method-length"), Maybe.create(RT.map(new Object[] { RT.keyword(null, "schema"), RT.classForName("java.lang.Number") })) })).withMeta((IPersistentMap)RT.map(new Object[] { RT.keyword(null, "name"), ((IObj)Symbol.intern(null, "Measure")).withMeta((IPersistentMap)RT.map(new Object[] { RT.keyword(null, "const"), Boolean.TRUE })), RT.keyword(null, "ns"), Symbol.intern(null, "aeolian.composer") })); public static final Var const__0 = (Var)RT.var("schema.utils", "use-fn-validation");
/*    */ }


/* Location:              /home/amarks/code/aeolian/target/aeolian-0.1.1-SNAPSHOT.jar!/aeolian/composer$fn__9776.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */