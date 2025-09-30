public class Student {
    private String name;
    private String id;
    private int grade;

    public Student(String name, int grade) {
        this.id = generateId();   
        this.name = name;
        this.grade = grade;
    }

    public Student(String name) {
        grade = 10;
        this.name = name;
        this.id = generateId();
    }
    
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getGrade() {
        return grade;
    }

    public int grade() {
        return grade;
    }

    public void setName(String input) {
        name = input;
    }

    public void setId(String input) {
        id = input;
    }

    public void setGrade(int input) {
        grade = input;
    }

    public String toString() {
        return name + " is a " + grade + "th grader. Their id is " + id + ".";
    }

    public boolean equals(Student other) {
        return name.equals(other.name) && id.equals(other.id) && grade == other.grade;
    }

    public String generateId() {
        return generateNum8() + "-" + generateNum9();
    }

    public String generateNum8() {
        return (int) ((Math.random() * 8) + 1) + "" + (int) (Math.random() * 8) 
            + "" + (int) (Math.random() * 8);

    }

    public String generateNum9() {
        return  (int) (Math.random() * 9) + "" + (int) (Math.random() * 9) + "" 
            + (int) (Math.random() * 9) + "" + (int) (Math.random() * 9);
    }

}
