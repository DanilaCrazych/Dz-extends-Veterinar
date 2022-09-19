public class horse extends Animal{
    String name;

    public horse(String name, String food, String location) {
        super(food, location);
        this.name = name;
    }

    @Override
    public void makeNoise(){
        System.out.println("Игого");
    }

    @Override
    public void  eat(){
        System.out.println("Кушает");
    }
}
