import java.util.Scanner;
public class Vowelconsonant {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input an alphabet: ");
        String input = in.nextLine();
        int len=input.length();
        int ch1;

        for (int i=0; i <= len-1; i++)
        {
            ch1 = input.charAt(i);
            System.out.print(ch1);
            if (ch1 == 'a' || ch1== 'e' || ch1 == 'i'
                    || ch1 == 'o' || ch1 == 'u'||ch1 == 'A' || ch1== 'E'
                    || ch1 == 'I'|| ch1 == 'O' || ch1 == 'U') {
                System.out.print( " : Vowel ");
            }
            else
            {
                System.out.print( " : Consonant ");
            }
        }

    }
}



