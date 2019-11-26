public class Person {
    private String name;
    // returns the person's name
    public String getName(){
        return this.name;
    };
    // changes the name property to the passed value
    public void setName(String name){
        this.name = name;
    };
    // prints a message to the console using the person's name
    public void sayHello(){
        System.out.println("Hello, I am " + this.name);
    };
    public Person(String name){
        this.name = name;
    }

    public static void main(String[] args){
        Person dude = new Person("Boomers4Communism");
        dude.setName("Boomer");
        System.out.println(dude.getName());
        dude.sayHello();

        System.out.println("");

        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);

        System.out.println("");

        Person person3 = new Person("John");
        Person person4 = person3;
        System.out.println(person3 == person4);

        System.out.println("");

        Person person5 = new Person("John");
        Person person6 = person1;
        System.out.println(person5.getName());
        System.out.println(person6.getName());
        person6.setName("Jane");
        System.out.println(person5.getName());
        System.out.println(person6.getName());

    }
}
