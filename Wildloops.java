public class Wildloops
{

    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;

    public void run() {
        int i = 0;
        while (i < 15) {
            System.out.println("i is" + i + "but is less than 15");
            i = i + 1;
        }

        int k = 7;
        while (k > 5) {
            System.out.println("k is" + k + "but is greater than 5");
            k = k -1;
        }

        int a = 8;
        int b = 16;
        while (a < 10 && b <= 20) {
            System.out.println("a is" + a + "but is less than 10");
            System.out.println("b is" + b + "but is less than or equal to 20");
            a = a + 1;
            b = b + 1;
        }
    }
}
