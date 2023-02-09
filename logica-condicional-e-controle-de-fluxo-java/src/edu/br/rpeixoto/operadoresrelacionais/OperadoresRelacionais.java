package edu.br.rpeixoto.operadoresrelacionais;

public class OperadoresRelacionais {

    public static void main(String[] args) throws Exception {
        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 5.5f;
        char c1 = 'x';
        char c2 = 'y';
        String s1 = "Fulano";
        String s2 = "Fulano";
        boolean b1 = true;
        boolean b2 = false;

        System.out.println("i1 == i2: " + (i1 == i2));
        System.out.println("i1 != i2: " + (i1 != i2));
        System.out.println("i1 > i2: " + (i1 > i2));
        System.out.println("i1 <= i2: " + (i1 <= i2));

        System.out.println("f1 == f2: " + (f1 == f2));
        System.out.println("f1 != f2: " + (f1 != f2));
        System.out.println("f1 > f2: " + (f1 > f2));
        System.out.println("f1 <= f2: " + (f1 <= f2));

        System.out.println("c1 == c2: " + (c1 == c2));
        System.out.println("c1 != c2: " + (c1 != c2));
        System.out.println("c1 < c2: " + (c1 < c2));
        System.out.println("c1 <= c2: " + (c1 <= c2));

        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1 != s2: " + (s1 != s2));
        // System.out.println("s1 < s2: " + (s1 < s2)); // Da erro
        // System.out.println("s1 <=s2: " + (s1<= s2)); // Da erro

        System.out.println("b1 == b2: " + (b1 == b2));
        System.out.println("b1 != b2: " + (b1 != b2));
        // System.out.println("b1 < b2: " + (b1 < b2)); // da erro
        // System.out.println("b1 <= b2: " + (b1<= i1)); // da erro

        System.out.println("i2 <= f1: " + (i2 <= f1));
    }
}
