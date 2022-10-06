import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner keyboard = new Scanner(System.in);
        //String phrase = keyboard.nextLine();

        String test = "This snake eats straw";
        String[] arr = test.split(" ");
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i <= arr.length - 1; i++) {
            String[] letters = arr[i].split("");
            System.out.println(Arrays.toString(letters));
            }
        }
    }
