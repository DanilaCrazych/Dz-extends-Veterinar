public class cat extends Animal{
    String name;

    public cat(String name, String food, String location) {
        super(food, location);
        this.name = name;
    }

    @Override
    public void makeNoise(){
        System.out.println("мяукает");
    }

    @Override
    public void  eat(){
        System.out.println("Кушает");
    }
}
