import java.util.Scanner;

public class MyQuadraticEquation {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int a = readInt("a");
        int b = readInt("b");
        int c = readInt("c");

        //double D = b*b-4*a*c;
        double D = Math.pow(b,2.0)-4 * a * c;
        System.out.println("D = "+D);

        if (D>0) {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("D > 0");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
            if (D == 0) {
                double x = (-b + Math.sqrt(D)) / (2 * a);
                System.out.println("D = 0");
                System.out.println("x= " + x);
            }
        }else{
            System.out.println("D < 0, no solutions");}
    }
    public static int readInt(String name) {
        System.out.println("enter " + name + ":");
        return scanner.nextInt();
    }
}

