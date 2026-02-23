public class Employee {
    private int number;
    private String name;
    private double salary;

    public Employee(){
        number=-1;
        name="UnKnown";
        salary=400;
    }
    public Employee(int number,String name,double salary){
        setNumber(number);
        setName(name);
        setSalary(salary);
    }
    public void setNumber(int number){
        if (number >=1 && number<=100){
            this.number=number;
        }else {
            this.number=-1;
        }
    }
    public int getNumber(){
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
       if (salary >= 400){
           this.salary = salary;
       }else {
           this.salary = 400;
       }
    }

    private double getTax(){
        return (getSalary() * 0.1);
    }

    public double getNetSalary(){
        return (salary - getTax());
    }
    public Employee getCopy(){
        return (new Employee(number,name,salary));
    }

    @Override
    public String toString() {
        return "Employee{" +
                "\n number=" + number +
                ",\n name='" + name + '\'' +
                ",\n salary=" + salary +
                ",\n Tax=" + getTax() +
                ",\n Net Salary=" + getNetSalary() +
                '}';
    }
}
