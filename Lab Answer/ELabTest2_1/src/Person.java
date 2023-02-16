public class Person {
    private String name;
    private int age;
    private String gender;
    private String occupation;
    private String[] occupation_list = {"doctocar", "nurses", "teacher", "police"};
    private boolean frontliner;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(String name, int age, String gender, String occupation) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.occupation = occupation;
        
    }
    
    
}