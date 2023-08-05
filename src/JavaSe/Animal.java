package JavaSe;

class Animal{
    public String name;
    public int age;
    public Animal(String name,int age){
        this.age = age;
        this.name = name;
    }
    public void eat(){
        System.out.println(name+"正在吃东西");
    }
}


class Dog extends Animal{
    public Dog(String name,int age){
        super(name,age);
    }
    public void eat(){
        System.out.println(name+"吃骨头");
    }
    public void bark(){
        System.out.println(name+"汪汪汪~");
    }
}

class Cat extends Animal{
    public Cat(String name,int age) {
        super(name,age);
    }

    public void eat(){
        System.out.println(name+"吃鱼");
    }
    public void mew(){
        System.out.println(name+"喵喵喵~");
    }
}

