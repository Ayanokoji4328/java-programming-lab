class Employee {
    String name;
    int id;
    public Employee() {
        name = "Unknown";
        id = 0;
    }
    public Employee(String empName, int empId) {
        name = empName;
        id = empId;
    }
    public void display() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee("John", 101);
        emp1.display();
        emp2.display();
    }
}
