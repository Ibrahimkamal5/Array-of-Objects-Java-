import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        Employee[] arr = new Employee[2];

        fillArray(arr);
        printArray(arr);
        System.out.println("Sum Array = " + SumArray(arr));
        System.out.println("Max Salary = " + getMaxSalary(arr));

    }

    public static void fillArray(Employee[] arr) {
        System.out.println("-----Fill Array-----");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Employee();
            System.out.println("Enter the Number One :- ");
            arr[i].setNumber(input.nextInt());
            System.out.println("Enter the Name :- ");
            arr[i].setName(input.next());
            System.out.println("Enter the Salary :- ");
            arr[i].setSalary(input.nextDouble());
        }
    }
    public static void printArray(Employee[] arr){
        System.out.println("-----Print Array-----");
        System.out.printf("%-10s%-30s%20s%20s%n",
                           "Number","Name","Salary","NetSalary");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%-10d" , arr[i].getNumber());
            System.out.printf("%-30s" , arr[i].getName());
            System.out.printf("%20.2f" , arr[i].getSalary());
            System.out.printf("%20.2f%n" , arr[i].getNetSalary());

        }
    }

    public static double SumArray(Employee[] arr){
        double sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i].getNetSalary();
        }
        return (sum / arr.length);
    }

    public static Employee getMaxSalary(Employee[] arr){
        if (arr == null || arr.length == 0) {
            return null;
        }
        Employee max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i].getNetSalary() > max.getNetSalary()){
                max = arr[i];
            }
        }
        return max;
    }
}
