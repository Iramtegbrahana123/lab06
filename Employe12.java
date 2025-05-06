class Employe12 {  // Corrected class name
    String name;
    int id;
    double salary;

    // Constructor
    Employe12(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Display details method
    void displaydetails() {
        System.out.println("Name: " + name);  // Corrected variable name
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String args[]) {
        Employe12 e = new Employe12("John Doe", 101, 50000.0);  // Corrected constructor call
        e.displaydetails();
    }
}
