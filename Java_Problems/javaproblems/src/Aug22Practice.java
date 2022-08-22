import java.util.Arrays;

public class Aug22Practice {
    public static void main(String[] args) {

        // //Length
        String s = "hi i m jatin";
        System.out.println(s.length());

        // //Split
        String sSplit = "hello good mornig";
        String[] word = sSplit.split(" ");
        for (String wrd : word) {
            System.out.println(wrd);
        }

        // Count reapated word?
        String rString = "hello g world ka agla shikar hello hello ...";
        String[] rword = rString.split(" ");
        int count = 0;
        for (String w : rword) {
            if (w.equals("hello")) {
                count++;
            }
            System.out.println(w);

        }
        
        System.out.println(count);

        // Inverse String
        String iString = "jatin@gamil.com";
        int len = iString.length();
        String irev = "";

        for (int i = len - 1; i >= 0; i--) {
            irev = irev + iString.charAt(i);
        }
        System.out.println(irev);

        //String Panlindrome

        String pString = "madam";
        int plen = pString.length();
        String prev = "";
        for(int i  = plen-1;i>=0;i--){
            prev = prev + pString.charAt(i);
            if(prev.equals(pString)){
                System.out.println("String is panlindrome :" + pString);
            }

        }

        //Palindrome number

        Integer pi = 151;
        int pr = 0;
        int pnrev = 0;

        while(pi > 0){
            pr = pi % 10;
            pi = pi / 10;
            pnrev = pnrev * 10 + pr;
        }
        System.out.println(pnrev);

        //Armstrong number
        int ai = 153;
        int ar = 0;
        int arev = 0;
        while(ai > 0){
            ar = ai %  10;
            ai = ai / 10;
            arev = arev + ar*ar*ar;
        }
        System.out.println(arev);

        //Remove special character
        String email = "jatin@gmail.com";
        email = email.replace("@", "$$");
        System.out.println(email);

        //Number is prime
        int num = 113;
        if(num %2 != 0){
            System.out.println("Num is Prime :" + num);
        }
        System.out.println("Num is notPrime :" + num);

        //Prime no range
        int pnum = 12;
        for(int i = 0;i <=pnum;i++){
            if(i % 2 != 0 ){
                System.out.println("Prime no s are"+i);
            }
        }

        //Sorting and iterating array

        Integer[] intArray = {12,45,75,36,78,25};
        Arrays.sort(intArray);

        for(Integer i : intArray){
            System.out.println(i);
        }

        //print traingle of array

        for(int i = 0;i<intArray.length;i++){
            for(int j = 0;j<=i;j++){
                System.out.print(intArray[j]);
            }System.out.println();
        }

        //Fibbo Serise
        int f_no = 0;
        int s_no = 1;
        int sum = f_no+s_no;
        System.out.println(f_no);
        System.out.println(s_no);
        while(sum < 25){
            System.out.println(sum);
            f_no = s_no;
            s_no = sum;
            sum = f_no + s_no;
        }


    }

}
