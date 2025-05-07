package lecture.ch15.exercise;

public class Student {
    private int studentId;
    private String name;
    private String email;
    private String github;

    public Student(int studentId, String name,  String email,String github) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.github = github;
    }

    public String getEmail() {
        return email;
    }

    public String getGithub() {
        return github;
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

//    @Override
//    public int compTo(Fruit o1, Fruit o2) {
//        if (o1.getPrice() < o2.getPrice()){
//            return -1;  // o1이 o2보다 앞에 오게 함
//        }else if (o1.getPrice() > o2.getPrice()){
//            return 1;  //o1이 o2보다 뒤에 오게 함
//        }
//        else return 0;
//    }
}
