class Student {
    private String name;
    private int age;
    private int ID;
    private double gpa;

    public Student(String name, int age, int ID, double gpa) {
        this.name = name;
        this.age = age;
        this.ID = ID;
        this.gpa = gpa;
    }

    public boolean compareTo(Student student){
        if (student.getID() < ID) return true;
        else return false;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name = '" + name + '\'' +
                ", age = " + age +
                ", ID = " + ID +
                ", gpa = " + gpa +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}