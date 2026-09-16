public abstract class Employee extends Person {
        private String id;
        
        public Employee(String name, int age, String id)
        {
            super(name, age);
            this.id = id;
        }
        
        public String getId()
        {
            return id;
        }
        
        public abstract double calculateSalary();
        
        public String toString()
        {
            return "ID: " + id + super.toString();
        }
        
}
 