class NamberTest{
  public static void main(String[] args ) {
    int i = 10;
    short sh = 100;
    double d = 5.450;
    
    char ch = '9';
    //Character c1 = new Character(ch);
    //arg[0]= c1.toString ();
   
    Integer k1 = new Integer(55);
    Integer k2 = new Integer(100);
    Double d1 = new Double(3.14);
    try{
      i = Integer.parseInt(args[0]);
      sh = Short.parseShort(args[0]);
      d = Double.parseDouble(args[0]);
      d1 = new Double(args[1]);
      k1 = new Integer(args[1]);
    }catch(Exception e){}
    
    double x = 1.0/0.0;
    System.out.println("i = " + i);
    System.out.println("sh = " + sh);
    System.out.println("d = " + d);
    System.out.println("k1.intValue() = " + k1.intValue());    
    System.out.println("d1.intValue() = " + d1.intValue());
    System.out.println("k1 > k2? " + k2.compareTo(k1));
    System.out.println("x = " + x);
    //System.out.println("x = isNaN?" + Double.isNan(x));
    System.out.println("x = isInfinite? " + Double.isInfinite(x));
    System.out.println("x = isInfinity? " + (x == Double.POSITIVE_INFINITY));
    System.out.println("d = " + Double.doubleToLongBits(d));
    System.out.println("i = " + Integer.toBinaryString(i));
    System.out.println("i = " + Integer.toHexString(i));
    System.out.println("i = " + Integer.toOctalString(i));
    
    
  }
}