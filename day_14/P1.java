public class P1 {
    public static void main(String[] args) {

        // Boxing
        // int a =10;
        // Integer i = a;
        // System.out.println("Implicit boxing: "+i);
        // Integer j = Integer.valueOf(a);
        // System.out.println("Explicit boxing: "+j);

        //Unboxing
        // Integer a= 10;
        // int i =a;
        // System.out.println("Implicit unboxing: "+i);
        // int j = a.intValue();
        // System.out.println("Explicit unboxing: "+j);

        // WAJP to convert each primitive data type to its's wrapper class and vice versa
        byte a= 1;
        short b = 2;
        int c=3;
        float d=4.0f;
        double e = 5.0;
        char f = 'a';
        boolean g = true;

        Byte A = Byte.valueOf(a);
        Short B = Short.valueOf(b);
        Integer C = Integer.valueOf(c);
        Float D = Float.valueOf(d);
        Double E = Double.valueOf(e);
        Character F = Character.valueOf(f);
        Boolean G = Boolean.valueOf(g);

        System.out.println("Explicit Boxing: ");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        System.out.println(E);
        System.out.println(F);
        System.out.println(G);

        byte p = A.byteValue();
        short q = B.shortValue();
        int r = C.intValue();
        float s = D.floatValue();
        double t = E.doubleValue();
        char u = F.charValue();
        boolean v = G.booleanValue();

        System.out.println("Explicit Unboxing");
        System.out.println(p);
        System.out.println(q);
        System.out.println(e);
        System.out.println(s);
        System.out.println(t);
        System.out.println(u);
        System.out.println(v);

    }
}
