package stopwatch;

import java.util.Scanner;

public class Stopwatch {

    public static Scanner input = new Scanner(System.in);
    public static int time = 1;

    public static void main(String[] args) {

        int stop = 0;
        while (stop == 0) {
            System.out.println("enter \"1\" when ready");
            String in = input.next();
            if (in.equals("1")) {
                stop = stop + 1;
                stopwatch();
            } else {

            }
        }
    }

    public static void stopwatch() {
        int stop = 0;
        System.out.println("When ready enter \"2\" to stop");
        while (stop == 0) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            System.out.println(time);
            time++;
        }
    }

}
