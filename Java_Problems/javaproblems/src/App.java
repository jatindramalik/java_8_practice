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
                System.out.println(count++);

            }
        }

        //Q-Inverse the given string?
        int len = lengthStr.length();
        String rev = "";
        for(int i = len - 1;i>=0;i--){
            rev = rev+lengthStr.charAt(i);
        }
        System.out.println(rev);

        //Q - String palindrome check?
        String pstring = "madamk";
        int plen = pstring.length();
        String pmrev = "";
        for(int i = plen-1;i>=0;i--){
            pmrev=pmrev+pstring.charAt(i);
        }
        System.out.println(pmrev);

        //Q-Palindrome number check?
        int p = 151;
        int r = 0;
        int prev = 0;
        while(p>0){
            r = p % 10;
            p = p /10;
            prev = prev*10+r;
        }
        System.out.println(prev);

    }

}
