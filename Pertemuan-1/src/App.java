public class App {
    public static void main(String[] args) throws Exception {
        Student student1 = new Student();
        student1.setName("Andy");
        student1.setAge(16);
        student1.setGpa(3.78f);
        student1.setAddress("Jl. Kusut 123");
        student1.setPhoneNumber("08127918181");

        Student student2 = new Student("Rayhan", 18, 3.86f, "Jl. Rawa Buntu", "081728100101");

        System.out.println(student1.getName() + " - " + student1.getAge());
        System.out.println(student2.getName() + " - " + student2.getAge());
    }
}
