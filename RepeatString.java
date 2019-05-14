import java.util.Scanner;

public class RepeatString {


    public static String repeat(String str, int times) {
        StringBuilder sb = new StringBuilder(str.length() * times);
        for (int i = 0; i < times; i++)
            sb.append(str);
        return sb.toString();
    }

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the string");
        String s=sc.nextLine();
        String sub="",sub1="";

        System.out.println("Enter integer");
        int n=sc.nextInt();

        int len=s.length();

        for(int i=s.length()-1;i>n;i--)
        {
            sub+=s.charAt(i);
        }
        for(int i=sub.length()-1;i>=0;i--)
        {
            sub1+=sub.charAt(i);
        }

        System.out.println(s+repeat(sub1,n));

       }

    }


