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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class composer$fn__9824
/*    */   extends AFunction
/*    */ {
/* 74 */   public Object invoke() { return invokeStatic(); } public static Object invokeStatic() { Object ufv__ = const__0.getRawRoot();Object output_schema9819 = const__3;Object input_schema9820 = Tuple.create(((IFn)const__4.getRawRoot()).invoke(const__5, const__6));Object input_checker9821 = new Delay((IFn)new composer.fn__9824.fn__9825(input_schema9820));Object output_checker9822 = new Delay((IFn)new composer.fn__9824.fn__9827(output_schema9819)); Var tmp77_74 = const__7;tmp77_74.setMeta((IPersistentMap)RT.mapUniqueKeys(new Object[] { const__8, const__9, const__10, ((IFn)const__11.getRawRoot()).invoke(output_schema9819, Tuple.create(input_schema9820)), const__12, "Inputs: [metrics :- [ParsedMetricLine]]\n  Returns: [[ParsedMetricLine]]", const__13, const__14, const__15, const__16, const__17, const__18, const__19, "aeolian/composer.clj" })); Var tmp198_77 = tmp77_74;ufv__ = null;input_checker9821 = null;output_checker9822 = null;tmp198_77.bindRoot(new composer.fn__9824.split_metrics_into_equal_measures__9829(input_schema9820, ufv__, input_checker9821, output_checker9822, output_schema9819));Object ret__9734__auto__9841 = tmp198_77;output_schema9819 = null;input_schema9820 = null;((IFn)const__20.getRawRoot()).invoke(((IFn)const__21.getRawRoot()).invoke(const__7.getRawRoot()), ((IFn)const__11.getRawRoot()).invoke(output_schema9819, Tuple.create(input_schema9820)));ret__9734__auto__9841 = null;return ret__9734__auto__9841; } public static final Var const__21 = (Var)RT.var("schema.utils", "fn-schema-bearer"); public static final Var const__20 = (Var)RT.var("schema.utils", "declare-class-schema!"); public static final Keyword const__19 = (Keyword)RT.keyword(null, "file"); public static final Object const__18 = Integer.valueOf(1); public static final Keyword const__17 = (Keyword)RT.keyword(null, "column"); public static final Object const__16 = Integer.valueOf(74); public static final Keyword const__15 = (Keyword)RT.keyword(null, "line"); public static final ISeq const__14 = (ISeq)PersistentList.create(Arrays.asList(new Object[] { Tuple.create(Symbol.intern(null, "metrics"), RT.keyword(null, "-"), Tuple.create(Symbol.intern(null, "ParsedMetricLine"))) })); public static final Keyword const__13 = (Keyword)RT.keyword(null, "raw-arglists"); public static final Keyword const__12 = (Keyword)RT.keyword(null, "doc"); public static final Var const__11 = (Var)RT.var("schema.core", "->FnSchema"); public static final Keyword const__10 = (Keyword)RT.keyword(null, "schema"); public static final ISeq const__9 = (ISeq)PersistentList.create(Arrays.asList(new Object[] { Tuple.create(((IObj)Symbol.intern(null, "metrics")).withMeta((IPersistentMap)RT.map(new Object[] { RT.keyword(null, "schema"), Tuple.create(Symbol.intern(null, "ParsedMetricLine")) }))) })); public static final Keyword const__8 = (Keyword)RT.keyword(null, "arglists"); public static final Var const__7 = (Var)RT.var("aeolian.composer", "split-metrics-into-equal-measures"); public static final AFn const__6 = (AFn)((IObj)Symbol.intern(null, "metrics")).withMeta((IPersistentMap)RT.map(new Object[] { RT.keyword(null, "schema"), Tuple.create(Symbol.intern(null, "ParsedMetricLine")) })); public static final AFn const__5 = (AFn)Tuple.create(((IObj)RT.map(new Object[] { RT.keyword(null, "author"), Maybe.create(RT.map(new Object[] { RT.keyword(null, "schema"), RT.classForName("java.lang.String") })), RT.keyword(null, "line-length"), RT.classForName("java.lang.Number"), RT.keyword(null, "source-file"), RT.classForName("java.lang.String"), RT.keyword(null, "method-length"), Maybe.create(RT.map(new Object[] { RT.keyword(null, "schema"), RT.classForName("java.lang.Number") })), RT.keyword(null, "indentation?"), Maybe.create(RT.map(new Object[] { RT.keyword(null, "schema"), RT.classForName("java.lang.String") })), RT.keyword(null, "complexity"), RT.classForName("java.lang.Number"), RT.keyword(null, "timestamp"), Maybe.create(RT.map(new Object[] { RT.keyword(null, "schema"), RT.classForName("java.lang.Number") })) })).withMeta((IPersistentMap)RT.map(new Object[] { RT.keyword(null, "name"), ((IObj)Symbol.intern(null, "ParsedMetricLine")).withMeta((IPersistentMap)RT.map(new Object[] { RT.keyword(null, "const"), Boolean.TRUE })), RT.keyword(null, "ns"), Symbol.intern(null, "aeolian.composer") }))); public static final Var const__4 = (Var)RT.var("schema.core", "one"); public static final AFn const__3 = (AFn)Tuple.create(Tuple.create(((IObj)RT.map(new Object[] { RT.keyword(null, "author"), Maybe.create(RT.map(new Object[] { RT.keyword(null, "schema"), RT.classForName("java.lang.String") })), RT.keyword(null, "line-length"), RT.classForName("java.lang.Number"), RT.keyword(null, "source-file"), RT.classForName("java.lang.String"), RT.keyword(null, "method-length"), Maybe.create(RT.map(new Object[] { RT.keyword(null, "schema"), RT.classForName("java.lang.Number") })), RT.keyword(null, "indentation?"), Maybe.create(RT.map(new Object[] { RT.keyword(null, "schema"), RT.classForName("java.lang.String") })), RT.keyword(null, "complexity"), RT.classForName("java.lang.Number"), RT.keyword(null, "timestamp"), Maybe.create(RT.map(new Object[] { RT.keyword(null, "schema"), RT.classForName("java.lang.Number") })) })).withMeta((IPersistentMap)RT.map(new Object[] { RT.keyword(null, "name"), ((IObj)Symbol.intern(null, "ParsedMetricLine")).withMeta((IPersistentMap)RT.map(new Object[] { RT.keyword(null, "const"), Boolean.TRUE })), RT.keyword(null, "ns"), Symbol.intern(null, "aeolian.composer") })))); public static final Var const__0 = (Var)RT.var("schema.utils", "use-fn-validation");
/*    */ }


/* Location:              /home/amarks/code/aeolian/target/aeolian-0.1.1-SNAPSHOT.jar!/aeolian/composer$fn__9824.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */