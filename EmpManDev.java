abstract public class EmpManDev {
    abstract void calculateSalary();
    abstract void displayDetails();
}

class Manager extends EmpManDev {
    void calculateSalary() {
       
    }
    
    void EmpDetails(int id, String name, int sal, int age) {
        System.out.println("Manager id:" + id);
        System.out.println("Manager name:" + name);
        System.out.println("Manager salary:" + sal);
        System.out.println("Manager age:" + age);
    }
    
    void displayDetails() {
        System.out.println("All details of manager");
    }
}

class Developer extends Manager {
    void calculateSalary() {
        
    }
    
    @Override
    void displayDetails() {
        System.out.println("All details of developer");
    }
    
    void DevDetails(int id, String name, int sal, int age) {
        System.out.println("Developer id:" + id);
        System.out.println("Developer name:" + name);
        System.out.println("Developer salary:" + sal);
        System.out.println("Developer age:" + age);
    }

    public static void main(String[] args) {
        Developer d1 = new Developer();
        d1.DevDetails(147, "Hrushi", 25000, 22);
        Manager m1 = new Manager();
        m1.EmpDetails(149, "John yamaguchi", 18000, 19);
        m1.displayDetails();
    }
}
