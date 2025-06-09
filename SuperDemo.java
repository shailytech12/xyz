class Animal{
    String name="Animal";
    void speak(){
        System.out.println("Animal speaks");
    }
}
class Dog extends Animal{
    String name="Dog";
    void printname(){
        System.out.println(super.name);
    }
    void speaks(){
        super.speak();
        System.out.println("Dog barks");

    }
}
public  class SuperDemo{
    public static void main(String[] args){
        Dog d=new Dog();
        d.printname();
        d.speak();
    }
}