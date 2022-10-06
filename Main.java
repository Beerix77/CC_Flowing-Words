import java.util.Scanner;

class Main {
    static boolean valid = true;

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String phrase = keyboard.nextLine();
        //String test = "This snake eats straw";

        String modifiedPhrase = phrase.toLowerCase();
        String[] arr = modifiedPhrase.split("");

        //System.out.println(Arrays.toString(arr));
        for (int i = 0; i <= arr.length-1; i++){
            if (arr[i].equals(" ")){
                if (!arr[i-1].equals(arr[i+1])){
                    valid = false;
                }
            }
        }

        if(valid) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
