package Module;

public class Zad2 {
    public static void main(String[] args) {
        proverkaHoda(4, 3, 6, 4);
    }
    public static void proverkaHoda(int x0, int y0, int x1, int y1) {
        if ((Math.pow((x0 - x1), 2) + Math.pow((y0 - y1), 2)) == 5 && x1>=0 && x1<=7 && y1>=0 && y1<=7) {
            System.out.println("Конь так ходит");
        } else System.out.println("Конь так не ходит");
    }
}
