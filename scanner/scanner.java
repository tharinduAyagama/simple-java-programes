import java.util.Scanner;

class scanner{
    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        Scanner Y = new Scanner(System.in);
        
        String A = X.nextLine();
        String B = X.nextLine();
        String C = X.nextLine();

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);

        int P = Y.nextInt();
        int Q = Y.nextInt();
        int R = Y.nextInt();

        System.out.println(P);
        System.out.println(Q);
        System.out.println(R);
    }
}