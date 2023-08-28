package homework1;

public class FigurePainter {
    public static void main(String[] args) {
        int toxer = 5;

        for (int i = 1; i <= toxer; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
