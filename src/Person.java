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

    public static void main(String[] args){
        Person dude = new Person();
        dude.setName("Boomer");
        System.out.println(dude.getName());
        dude.sayHello();
    }
}
