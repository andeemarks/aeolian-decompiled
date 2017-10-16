package aeolian;

import clojure.lang.Util;
import clojure.lang.Var;

public class core
{
  private static final Var main__var = Var.internPrivate("aeolian.core", "-main");
  private static final Var equals__var = Var.internPrivate("aeolian.core", "-equals");
  private static final Var toString__var = Var.internPrivate("aeolian.core", "-toString");
  private static final Var hashCode__var = Var.internPrivate("aeolian.core", "-hashCode");
  private static final Var clone__var = Var.internPrivate("aeolian.core", "-clone");
  
  static
  {
    Util.loadWithClass("/aeolian/core", core.class);
  }
  
  /* Error */
  public boolean equals(Object arg1)
  {
    // Byte code:
    //   0: getstatic 28	aeolian/core:equals__var	Lclojure/lang/Var;
    //   3: dup
    //   4: invokevirtual 57	clojure/lang/Var:isBound	()Z
    //   7: ifeq +9 -> 16
    //   10: invokevirtual 61	clojure/lang/Var:get	()Ljava/lang/Object;
    //   13: goto +5 -> 18
    //   16: pop
    //   17: aconst_null
    //   18: dup
    //   19: ifnull +22 -> 41
    //   22: checkcast 63	clojure/lang/IFn
    //   25: aload_0
    //   26: aload_1
    //   27: invokeinterface 67 3 0
    //   32: checkcast 69	java/lang/Boolean
    //   35: invokevirtual 72	java/lang/Boolean:booleanValue	()Z
    //   38: goto +9 -> 47
    //   41: pop
    //   42: aload_0
    //   43: aload_1
    //   44: invokespecial 74	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   47: ireturn
  }
  
  /* Error */
  public String toString()
  {
    // Byte code:
    //   0: getstatic 32	aeolian/core:toString__var	Lclojure/lang/Var;
    //   3: dup
    //   4: invokevirtual 57	clojure/lang/Var:isBound	()Z
    //   7: ifeq +9 -> 16
    //   10: invokevirtual 61	clojure/lang/Var:get	()Ljava/lang/Object;
    //   13: goto +5 -> 18
    //   16: pop
    //   17: aconst_null
    //   18: dup
    //   19: ifnull +18 -> 37
    //   22: checkcast 63	clojure/lang/IFn
    //   25: aload_0
    //   26: invokeinterface 79 2 0
    //   31: checkcast 81	java/lang/String
    //   34: goto +8 -> 42
    //   37: pop
    //   38: aload_0
    //   39: invokespecial 83	java/lang/Object:toString	()Ljava/lang/String;
    //   42: areturn
  }
  
  /* Error */
  public int hashCode()
  {
    // Byte code:
    //   0: getstatic 36	aeolian/core:hashCode__var	Lclojure/lang/Var;
    //   3: dup
    //   4: invokevirtual 57	clojure/lang/Var:isBound	()Z
    //   7: ifeq +9 -> 16
    //   10: invokevirtual 61	clojure/lang/Var:get	()Ljava/lang/Object;
    //   13: goto +5 -> 18
    //   16: pop
    //   17: aconst_null
    //   18: dup
    //   19: ifnull +21 -> 40
    //   22: checkcast 63	clojure/lang/IFn
    //   25: aload_0
    //   26: invokeinterface 79 2 0
    //   31: checkcast 87	java/lang/Number
    //   34: invokevirtual 90	java/lang/Number:intValue	()I
    //   37: goto +8 -> 45
    //   40: pop
    //   41: aload_0
    //   42: invokespecial 92	java/lang/Object:hashCode	()I
    //   45: ireturn
  }
  
  /* Error */
  public Object clone()
  {
    // Byte code:
    //   0: getstatic 40	aeolian/core:clone__var	Lclojure/lang/Var;
    //   3: dup
    //   4: invokevirtual 57	clojure/lang/Var:isBound	()Z
    //   7: ifeq +9 -> 16
    //   10: invokevirtual 61	clojure/lang/Var:get	()Ljava/lang/Object;
    //   13: goto +5 -> 18
    //   16: pop
    //   17: aconst_null
    //   18: dup
    //   19: ifnull +15 -> 34
    //   22: checkcast 63	clojure/lang/IFn
    //   25: aload_0
    //   26: invokeinterface 79 2 0
    //   31: goto +8 -> 39
    //   34: pop
    //   35: aload_0
    //   36: invokespecial 95	java/lang/Object:clone	()Ljava/lang/Object;
    //   39: areturn
  }
  
  /* Error */
  public static void main(String[] arg0)
  {
    // Byte code:
    //   0: getstatic 24	aeolian/core:main__var	Lclojure/lang/Var;
    //   3: dup
    //   4: invokevirtual 57	clojure/lang/Var:isBound	()Z
    //   7: ifeq +9 -> 16
    //   10: invokevirtual 61	clojure/lang/Var:get	()Ljava/lang/Object;
    //   13: goto +5 -> 18
    //   16: pop
    //   17: aconst_null
    //   18: dup
    //   19: ifnull +19 -> 38
    //   22: checkcast 63	clojure/lang/IFn
    //   25: aload_0
    //   26: invokestatic 103	clojure/lang/RT:seq	(Ljava/lang/Object;)Lclojure/lang/ISeq;
    //   29: invokeinterface 107 2 0
    //   34: pop
    //   35: goto +13 -> 48
    //   38: new 109	java/lang/UnsupportedOperationException
    //   41: dup
    //   42: ldc 111
    //   44: invokespecial 114	java/lang/UnsupportedOperationException:<init>	(Ljava/lang/String;)V
    //   47: athrow
    //   48: return
  }
}


/* Location:              /home/amarks/code/aeolian/target/aeolian-0.1.1-SNAPSHOT.jar!/aeolian/core.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */