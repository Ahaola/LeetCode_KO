package JavaSe;

public class Test1 {
    public static void func(Animal animal) {
        animal.eat();
    }

    public static void main(String[] args) {
        Cat cat = new Cat("加菲猫",5);
        Dog dog = new Dog("旺财",6);
        func(cat);
        func(dog);
    }
}

