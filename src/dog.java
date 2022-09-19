public class dog extends Animal{
    String name;

    public dog(String name, String food, String location) {
        super(food, location);
        this.name = name;
    }

    @Override
    public void makeNoise(){
        System.out.println("Лает");
    }

    @Override
    public void  eat(){
        System.out.println("Хавает");
    }
}
