import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input a: ");
        double a = scan.nextDouble();
        System.out.print("Input b: ");
        double b = scan.nextDouble();
        System.out.print("Input c: ");
        double c = scan.nextDouble();

        System.out.print("Input x: ");
        double x = scan.nextDouble();
        System.out.print("Input y: ");
        double y = scan.nextDouble();

        Line line = new Line(a,b,c);

        System.out.println(line);

        if (line.containsPoint(x,y)){
            System.out.println("Належать прямій");
        }
        else {
            System.out.println("Не належать прямій");
        }

        if (line.intersection(line) == null){
            System.out.println("Прямі паралельні");
        }
        else {
            System.out.println(line.intersection(line));
        }


    }
}