public class Cat extends Animal implements Pet{
    private String name;
    public Cat(int legs) {
        super(legs);
    }
    public Cat(String name){
        this.name = name;
    }
    public Cat(){
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("the cat plays ball.");
    }

    public void eat(){
        System.out.println("the cat eats mice.");
    }

}
