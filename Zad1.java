package Module;

public class Zad1 {
    public static void main(String[] args) {
        System.out.println(numberOfDifferentElements(new int[]{1, 4, 5, 1, 1, 3}));
    }

    public static int numberOfDifferentElements(int[] massOfElements) {
        int result = 0;
        for (int i = 0; i < massOfElements.length; i++) {
            int count = 0;
            for (int j = 0; j < i; j++) {
                if (massOfElements[i] == massOfElements[j]) {
                    count++;
                }
            }
            if (count == 0) {
                result++;
            }
        }
        return result;
    }
}