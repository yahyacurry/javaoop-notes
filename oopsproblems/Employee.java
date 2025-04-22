package oopsproblems;
    //3. Create a class Employee with overloaded
    // constructors to initialize employee details based on
    // different combinations of arguments.
    // Ensure the constructors support the creation of objects in various ways.
    class Employee {
         String name;
         int age;
         int employeeID;
         int salary;
        public Employee(String name, int age, int employeeID) {
            this.name = name;
            this.age = age;
            this.employeeID = employeeID;
        }
        public Employee(String name, int age, int employeeID, int salary) {
            this.name = name;
            this.age = age;
            this.employeeID = employeeID;
            this.salary = salary;
        }
        public void employeeDetails() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("employeeID: " + employeeID);
            System.out.println("Salary: " + salary);
        }

        public void employeeDetails2() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("employeeID: " + employeeID);
        }

        public static void main(String[] args) {
            Employee emp1 = new Employee("Yahya ", 28, 12345);
            Employee emp2 = new Employee("Yahya ", 35, 56789, 55000);

            emp1.employeeDetails2();
            emp2.employeeDetails();
        }
    }
