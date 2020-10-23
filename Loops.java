
public class Loops {

    public static void main(String[] args) {
        search:
        while (true) {
            for (int i = 0; i < 100; i++) {
                if (i == 50) {
                    break search;
                }
            }
        }
    }
}