
class MemberDetails {

    String name;
    int age;
    float salary;


}


public class MemberDetailsMain {

    public static void main(String[] args){

        MemberDetails ob=new MemberDetails();

        ob.name="Sailakshmi";
        ob.age=22;
        ob.salary=20000;

        System.out.println("Members Name : " +ob.name);
        System.out.println("Members Age : " +ob.age);
        System.out.println("Members Salary : " +ob.salary);

    }

}
