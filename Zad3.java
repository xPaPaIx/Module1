package Module;

public class Zad3 {
    public static void main(String[] args) {
        double x1 = 4.0,
                x2 = 1.0,
                x3 = 5.0;
        double y1 = 0.0,
                y2 = 3.0,
                y3 = 2.0;
        double a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double c = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        if (a + b <= c || a + c <= b || a + c <= b)
            System.out.println("Треугольник не существует");
        else
        {
            double p = (a + b + c) / 2.0;
            double square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("Площадь: " + square);
        }
    }
}

