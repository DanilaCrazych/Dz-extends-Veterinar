public class Main {
    public static void main(String[] msi){
        veterinarian veterinarian = new veterinarian();
        Animal[] animals = new Animal[3];
        animals[0] = new dog ("Собака", "Мясо", "Вальер");
        animals[1] = new cat ("Кот", "Sheba", "Дом");
        animals[2] = new horse ("Лошадь", "Яблоки", "Зоопарк");

        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }
    }
}