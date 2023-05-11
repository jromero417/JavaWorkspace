package class15;

public class SyntaxEmployee {
    String empId;
    int salary;
    static String CEO = "Sumair";

    public static void main(String[] args) {
        SyntaxEmployee emp1 = new SyntaxEmployee();
        emp1.empId="A5";
        emp1.salary=95000;
        System.out.println(emp1.empId);
        System.out.println(SyntaxEmployee.CEO);

        SyntaxEmployee emp2= new SyntaxEmployee();
        emp2.empId="A6";
        emp2.salary=125000;
        System.out.println(emp2.empId);
        System.out.println(SyntaxEmployee.CEO);
    }
}
