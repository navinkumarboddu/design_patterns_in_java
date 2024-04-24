package structural.designpatternsinjava.composite;

import java.util.ArrayList;
import java.util.List;

// Component interface
interface Department {
    void printDepartmentName();
}

// Leaf class
class FinancialDepartment implements Department {
    public void printDepartmentName() {
        System.out.println("Financial Department");
    }
}

// Leaf class
class SalesDepartment implements Department {
    public void printDepartmentName() {
        System.out.println("Sales Department");
    }
}

// Composite class
class HeadDepartment implements Department {
    private String name;
    private List<Department> childDepartments;

    public HeadDepartment(String name) {
        this.name = name;
        this.childDepartments = new ArrayList<>();
    }

    public void printDepartmentName() {
        System.out.println("Head Department: " + name);
        for (Department dept : childDepartments) {
            dept.printDepartmentName();
        }
    }

    public void addDepartment(Department dept) {
        childDepartments.add(dept);
    }

    public void removeDepartment(Department dept) {
        childDepartments.remove(dept);
    }
}

public class CompositePatternExample {
    public static void main(String[] args) {
        Department financialDepartment = new FinancialDepartment();
        Department salesDepartment = new SalesDepartment();

        HeadDepartment headDepartment = new HeadDepartment("Head Office");
        headDepartment.addDepartment(financialDepartment);
        headDepartment.addDepartment(salesDepartment);

        headDepartment.printDepartmentName();
    }
}
