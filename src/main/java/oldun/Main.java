package oldun;

public class Main {
    public static void main(String[] args) {

// Zadaem peremennie

        int A = 1;
        int B = 2;
        double C = 33.3;
        double D = Double.MAX_VALUE;

// Zadanie 1:

        System.out.println(A + B);
        System.out.println(A - B);
        System.out.println(A * B);
        System.out.println(A / B);

// Zadanie 2:

        System.out.println(A * C);
        System.out.println(C * C);
        System.out.println(B * D);

// Zadanie 3:
        System.out.println(A > B);
        System.out.println(A < B);
        System.out.println(A != B);
        System.out.println(A == B);
        System.out.println(C >= B);
        System.out.println(C == C);
        System.out.println(C <= B);

// Zadanie 4:
        System.out.println(D * D);
        System.out.println(D / D);
        System.out.println(A + D);
    }
}