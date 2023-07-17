public class Fish extends Animal implements Pet{
    private String name;
    public Fish(){
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
        System.out.println("the fish plays bubbles.");
    }

    public void walk(){
        System.out.println("the fish can not walk.");
    }

    public void eat(){
        System.out.println("the cat eats fish food.");
    }

}
