package listPackage;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Amir", "Boss", 1));
        employeeList.add( new Employee("Gray", "Man", 2));
        employeeList.add(new Employee("John", "Doe", 3));
        employeeList.add(new Employee("Jeanne", "DOE", 4));

        Employee amir = new Employee("Amir", "Boss", 1);
        Employee grayMan = new Employee("Gray", "Man", 2);
        Employee johnDoe = new Employee("John", "Doe", 3);
        Employee jeanneDoe = new Employee("Jeanne", "DOE", 4);


        /**
         * LinkedList Implementation
         */
        EmployeeLinkedList list = new EmployeeLinkedList();
        System.out.println(list.isEmpty());
        list.addToFront(amir);
        list.addToFront(grayMan);
        list.addToFront(johnDoe);
        list.addToFront(jeanneDoe);
        list.printList();
        System.out.println(list.isEmpty());
        System.out.println(list.getSize());
        employeeList.forEach(employee -> System.out.println(employee));

        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);

        for (Employee employee: employeeArray){
            System.out.println(employee);
        }

    }

}
