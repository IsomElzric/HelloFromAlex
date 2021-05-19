package turner;

public class Person implements Greeter{

    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String sayHello() {
        return String.format("Hello, my name is %s", this.name);
    }
}
