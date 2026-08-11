  static class Student {
        int rollNo;
        String name;

        Student(int rollNo, String name) {
            this.rollNo = rollNo;
            this.name = name;
            System.out.println("Constructor called for Roll No: " + rollNo);
        }

        void display() {
            System.out.println("Roll No: " + rollNo + "\tName: " + name);
        }
    }

    public static void main(String[] args) {

        System.out.println("----- Creating Array of Objects -----");

        Student[] students = new Student[3];

        students[0] = new Student(101, "Arun");
        students[1] = new Student(102, "Bala");
        students[2] = new Student(103, "Chitra");

        System.out.println("\n----- Displaying Student Details -----");

        for (Student student : students) {
            student.display();
        }

        System.out.println("\n----- Dereferencing Objects -----");

        for (int i = 0; i < students.length; i++) {
            students[i] = null;
        }

        System.out.println("Objects are now eligible for garbage collection.");

        // Request garbage collection (not guaranteed to run immediately)
        System.gc();
    }
}