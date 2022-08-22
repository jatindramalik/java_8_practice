import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class App {

    static String lengthStr = "I am ok ....ohk.. ok";

    public static void main(String[] args) throws Exception {

        System.out.println("The string is :" + lengthStr);

        // 1. Q-Length of string?
        System.out.println(lengthStr.length());

        // 2. Q-Split the string?
        String[] word = lengthStr.split(" ");
        for (String wrd : word) {
            System.out.println(wrd);
        }

        // 3. Q-Count repeated words in a sentence?
        // word- above string
        String[] wordNw = lengthStr.split(" ");
        int count = 1;
        for (String rptWord : wordNw) {
            if (rptWord.equals("ok")) {
                System.out.println("word is :" + rptWord);
                System.out.println(count++);

            }
        }

        // 4.Q-Inverse the given string?
        int len = lengthStr.length();
        String rev = "";
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + lengthStr.charAt(i);
        }
        System.out.println(rev);

        // 5.Q - String palindrome check?
        String pstring = "madamk";
        int plen = pstring.length();
        String pmrev = "";
        for (int i = plen - 1; i >= 0; i--) {
            pmrev = pmrev + pstring.charAt(i);
        }
        System.out.println(pmrev);

        // 6.Q-Palindrome number check?
        int p = 151;
        int r = 0;
        int prev = 0;
        while (p > 0) {
            r = p % 10;
            p = p / 10;
            prev = prev * 10 + r;
        }
        System.out.println(prev);

        // 7.Q-Armstrong number check?
        int a = 153;
        int ar = 0;
        int arev = 0;
        while (a > 0) {
            ar = a % 10;
            a = a / 10;
            arev = arev + ar * ar * ar;
        }
        System.out.println(arev);

        // 8.Q-Remove special character from string?

        String email = "jatin.niftem@gamil.com";
        email = email.replace("@", " ");
        System.out.println(email);

        // 9.Q-Number is prime is not?

        int pnum = 112;
        for (int i = 0; i <= pnum; i++) {
            if (i % 2 != 0) {
                System.out.println("PrimeNum :" + i);
            }
        }

        // 10.Q-Iterate and sorting an array ?
        Integer[] intarary = { 12, 15, 17, 19, 47, 25, 87, 69, 35 };
        Arrays.sort(intarary);
        for (int i = 0; i < intarary.length; i++) {
            System.out.println(intarary[i]);
        }
        Arrays.stream(intarary).sorted().forEach(System.out::println); // sorted using stream java8
        System.out.println("===============");
        System.out.println(findSecondSmallestNumber(intarary));

        // 12.Q-Print triangle of array?

        for (int i = 0; i < intarary.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(intarary[j]);
            }
            System.out.println();

        }
        // 13.Q-Print fibonacchi serise?
        int f_no = 0;
        int s_no = 1;
        int sum = f_no + s_no;
        System.out.println(f_no);
        System.out.println(s_no);
        while (sum < 15) {
            System.out.println(sum);
            f_no = s_no;
            s_no = sum;
            sum = f_no + s_no;
        }
        // 14.Q-Table?
        int it = 8;
        for (int i = 0; i <= 10; i++) {
            System.out.println("8 * i " + (i * it));
        }

        // 15.Q-Remove white space int between text?
        String spString = "j a v a  st r ";
        String reString = spString.replaceAll("\\s", "");
        System.out.println(reString);

        // 16.Q- Remove duplicate character in string?
        String dupString = "programming";
        // Method-1
        StringBuffer sb1 = new StringBuffer();
        dupString.chars().distinct().forEach(c -> sb1.append((char) c));
        System.out.println(sb1);

        // Method - 2
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < dupString.length(); i++) {
            char ch = dupString.charAt(i);
            int idx = dupString.indexOf(ch, i + 1);
            if (idx == -1) {
                sb2.append(ch);
            }
        }
        System.out.println(sb2);

        // Method - 3
        StringBuffer sb3 = new StringBuffer();
        Set<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < dupString.length(); i++) {
            set.add(dupString.charAt(i));
        }
        for (Character c : set) {
            sb3.append(c);
        }
        System.out.println(sb3);

        // 17.Q-Sort character for a string?
        String sortStr = "coading";
        char[] arr = sortStr.toCharArray();
        char temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(new String(arr));

        //Method-2
        String str1 = "jatin";
        char[] charArray = str1.toCharArray();
        Arrays.sort(charArray);
        System.out.println(new String(charArray));

        //18.Q-Replace character with its occurance?
        String input = "opentext";
        char charToReplace = 't';
        if(input.indexOf(charToReplace) == -1){
            System.out.println("Given character is not availavle");
            System.exit(0);
        }
        int cnt = 1;
        for(int i =  0; i< input.length();i++){
            char ch = input.charAt(i);
            if(ch == charToReplace){
                input = input.replaceFirst(String.valueOf(charToReplace), String.valueOf(cnt));
                cnt++;
            }
        }
        System.out.println(input);
    }

    // 11.Q-Function for second smallest number?
    public static Integer findSecondSmallestNumber(Integer[] num) {
        if (num.length <= 1) {
            return null;
        }
        Arrays.sort(num);
        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] != num[i + 1]) {
                return num[i + 1];
            }
        }
        return null;
    }

}
