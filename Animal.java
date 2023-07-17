public abstract class Animal {
    private int legs;

    public Animal(int legs) {
        this.legs = legs;
    }
    public Animal() {
    }

    public void walk(){
        System.out.println("the animal walks.");
    }

    public void eat(){
        System.out.println("the animal eats.");
    }

}
