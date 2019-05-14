import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {

        long temp,rev=0,n1,sum=0;

        System.out.println("Enter number");
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();

        temp=n;

        while(n!=0){
            n1=n%10;
            rev=rev*10+n1;
            if(n1%2==0)
            sum=sum+n1;

            n=n/10;
        }

        if(temp==rev && sum>25) {
            System.out.println(rev + " is a palindrome and the sum of even numbers is greater than 25");
        }
        else if(temp==rev && sum<25){

            System.out.println(rev + " is a palindrome and the sum of even numbers is less than 25");

        }
        else {
            System.out.println(temp +" is not a palindrome");
        }





    }

}
