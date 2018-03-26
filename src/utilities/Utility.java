package utilities;
import java.util.Scanner;

public class Utility {
    Scanner reader;

    public Utility() {
        reader = new Scanner(System.in);
    }

    public int GetInput() {
        Scanner reader = new Scanner(System.in);
        int n;

        n = reader.nextInt();

        reader.close();

        return n;
    }

    public int GetInputWithMessage(String message) {
        int n;
        boolean done = false;
        System.out.println(message + ": ");

        while(!done) {
            if(reader.hasNextInt()) {
                done = true;
            }
        }

        n = reader.nextInt();

        return n;
    }

    public void SendMessage(String message) {
        System.out.println(message);
    }
}
