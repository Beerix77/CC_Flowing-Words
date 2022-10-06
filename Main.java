import java.util.Arrays;

class Main {
    static boolean valid = true;

    public static void main(String[] args) {

        //Scanner keyboard = new Scanner(System.in);
        //String phrase = keyboard.nextLine();
        String test = "This snake eats straw";
        String test2 = test.toLowerCase();
        String[] arr = test2.split("");

        System.out.println(Arrays.toString(arr));
        for (int i = 0; i <= arr.length-1; i++){
            int testIndex = 0;

            if (arr[i].equals(" ")){
                testIndex = i;
                if (!arr[testIndex-1].equals(arr[testIndex+1])){
                    valid = false;
                }
            }
        }

        if(valid) {
            System.out.println("Valid");
        }
        else{
            System.out.println("Not Valid");
        }}
}
