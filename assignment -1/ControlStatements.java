public class ControlStatements {
    public static void main(String[] args) {
        int number = 10;

        // if-else
        if (number > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Not a positive number");
        }

        // switch
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Other day");
        }

        // for loop
        for (int i = 0; i < 3; i++) {
            System.out.println("For loop i: " + i);
        }

        // while loop
        int j = 0;
        while (j < 3) {
            System.out.println("While loop j: " + j);
            j++;
        }

        // do-while
        int k = 0;
        do {
            System.out.println("Do-while k: " + k);
            k++;
        } while (k < 3);

        // break and continue
        for (int m = 0; m < 5; m++) {
            if (m == 2) continue; // skip 2
            if (m == 4) break;    // stop at 4
            System.out.println("Loop m: " + m);
        }
    }
}
