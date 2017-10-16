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
/*    */ public final class composer$fn__9801
/*    */   extends AFunction
/*    */ {
/* 65 */   public Object invoke() { return invokeStatic(); } public static Object invokeStatic() { Object ufv__ = const__0.getRawRoot();Object output_schema9794 = const__1.getRawRoot();Object input_schema9795 = Tuple.create(((IFn)const__2.getRawRoot()).invoke(const__4, const__5), ((IFn)const__2.getRawRoot()).invoke(const__1.getRawRoot(), const__6), ((IFn)const__2.getRawRoot()).invoke(const__1.getRawRoot(), const__7));Object input_checker9796 = new Delay((IFn)new composer.fn__9801.fn__9802(input_schema9795));Object output_checker9797 = new Delay((IFn)new composer.fn__9801.fn__9804(output_schema9794)); Var tmp126_123 = const__8;tmp126_123.setMeta((IPersistentMap)RT.mapUniqueKeys(new Object[] { const__9, const__10, const__11, ((IFn)const__12.getRawRoot()).invoke(output_schema9794, Tuple.create(input_schema9795)), const__13, "Inputs: [metrics-in-measure :- [ParsedMetricLine] composition-key method-length]", const__14, const__15, const__16, const__17, const__18, const__19, const__20, "aeolian/composer.clj" })); Var tmp247_126 = tmp126_123;input_checker9796 = null;ufv__ = null;output_checker9797 = null;tmp247_126.bindRoot(new composer.fn__9801.metrics_to_measure__9806(input_checker9796, input_schema9795, ufv__, output_schema9794, output_checker9797));Object ret__9734__auto__9818 = tmp247_126;output_schema9794 = null;input_schema9795 = null;((IFn)const__21.getRawRoot()).invoke(((IFn)const__22.getRawRoot()).invoke(const__8.getRawRoot()), ((IFn)const__12.getRawRoot()).invoke(output_schema9794, Tuple.create(input_schema9795)));ret__9734__auto__9818 = null;return ret__9734__auto__9818; } public static final Var const__22 = (Var)RT.var("schema.utils", "fn-schema-bearer"); public static final Var const__21 = (Var)RT.var("schema.utils", "declare-class-schema!"); public static final Keyword const__20 = (Keyword)RT.keyword(null, "file"); public static final Object const__19 = Integer.valueOf(1); public static final Keyword const__18 = (Keyword)RT.keyword(null, "column"); public static final Object const__17 = Integer.valueOf(65); public static final Keyword const__16 = (Keyword)RT.keyword(null, "line"); public static final ISeq const__15 = (ISeq)PersistentList.create(Arrays.asList(new Object[] { Tuple.create(Symbol.intern(null, "metrics-in-measure"), RT.keyword(null, "-"), Tuple.create(Symbol.intern(null, "ParsedMetricLine")), Symbol.intern(null, "composition-key"), Symbol.intern(null, "method-length")) })); public static final Keyword const__14 = (Keyword)RT.keyword(null, "raw-arglists"); public static final Keyword const__13 = (Keyword)RT.keyword(null, "doc"); public static final Var const__12 = (Var)RT.var("schema.core", "->FnSchema"); public static final Keyword const__11 = (Keyword)RT.keyword(null, "schema"); public static final ISeq const__10 = (ISeq)PersistentList.create(Arrays.asList(new Object[] { Tuple.create(((IObj)Symbol.intern(null, "metrics-in-measure")).withMeta((IPersistentMap)RT.map(new Object[] { RT.keyword(null, "schema"), Tuple.create(Symbol.intern(null, "ParsedMetricLine")) })), ((IObj)Symbol.intern(null, "composition-key")).withMeta((IPersistentMap)RT.map(new Object[] { RT.keyword(null, "schema"), Symbol.intern("schema.core", "Any") })), ((IObj)Symbol.intern(null, "method-length")).withMeta((IPersistentMap)RT.map(new Object[] { RT.keyword(null, "schema"), Symbol.intern("schema.core", "Any") }))) })); public static final Keyword const__9 = (Keyword)RT.keyword(null, "arglists"); public static final Var const__8 = (Var)RT.var("aeolian.composer", "metrics-to-measure"); public static final AFn const__7 = (AFn)((IObj)Symbol.intern(null, "method-length")).withMeta((IPersistentMap)RT.map(new Object[] { RT.keyword(null, "schema"), Symbol.intern("schema.core", "Any") })); public static final AFn const__6 = (AFn)((IObj)Symbol.intern(null, "composition-key")).withMeta((IPersistentMap)RT.map(new Object[] { RT.keyword(null, "schema"), Symbol.intern("schema.core", "Any") })); public static final AFn const__5 = (AFn)((IObj)Symbol.intern(null, "metrics-in-measure")).withMeta((IPersistentMap)RT.map(new Object[] { RT.keyword(null, "schema"), Tuple.create(Symbol.intern(null, "ParsedMetricLine")) })); public static final AFn const__4 = (AFn)Tuple.create(((IObj)RT.map(new Object[] { RT.keyword(null, "author"), Maybe.create(RT.map(new Object[] { RT.keyword(null, "schema"), RT.classForName("java.lang.String") })), RT.keyword(null, "line-length"), RT.classForName("java.lang.Number"), RT.keyword(null, "source-file"), RT.classForName("java.lang.String"), RT.keyword(null, "method-length"), Maybe.create(RT.map(new Object[] { RT.keyword(null, "schema"), RT.classForName("java.lang.Number") })), RT.keyword(null, "indentation?"), Maybe.create(RT.map(new Object[] { RT.keyword(null, "schema"), RT.classForName("java.lang.String") })), RT.keyword(null, "complexity"), RT.classForName("java.lang.Number"), RT.keyword(null, "timestamp"), Maybe.create(RT.map(new Object[] { RT.keyword(null, "schema"), RT.classForName("java.lang.Number") })) })).withMeta((IPersistentMap)RT.map(new Object[] { RT.keyword(null, "name"), ((IObj)Symbol.intern(null, "ParsedMetricLine")).withMeta((IPersistentMap)RT.map(new Object[] { RT.keyword(null, "const"), Boolean.TRUE })), RT.keyword(null, "ns"), Symbol.intern(null, "aeolian.composer") }))); public static final Var const__2 = (Var)RT.var("schema.core", "one"); public static final Var const__1 = (Var)RT.var("schema.core", "Any"); public static final Var const__0 = (Var)RT.var("schema.utils", "use-fn-validation");
/*    */ }


/* Location:              /home/amarks/code/aeolian/target/aeolian-0.1.1-SNAPSHOT.jar!/aeolian/composer$fn__9801.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */