public class App {

    static String lengthStr = "I am ok ....ohk.. ok";

    public static void main(String[] args) throws Exception {

        System.out.println("The string is :" + lengthStr);

        // Q-Length of string?
        System.out.println(lengthStr.length());

        // Q-Split the string?
        String[] word = lengthStr.split(" ");
        for (String wrd : word) {
            System.out.println(wrd);
        }

        // Q-Count repeated words in a sentence?
        // word- above string
        String[] wordNw = lengthStr.split(" ");
        int count = 1;
        for (String rptWord : wordNw) {
            if (rptWord.equals("ok")) {
                System.out.println("word is :" + rptWord);
                count++;
            }
        }

        //Q-Inverse the given string?
        int len = lengthStr.length();
        String rev = "";
        for(int i = len - 1;i>=0;i--){
            rev = rev+lengthStr.charAt(i);
        }
        System.out.println(rev);

    }

}
