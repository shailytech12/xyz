final class FinalClass {
    final int num=10;
    final void show(){
        System.out.println("final method inside final class");
    }
}
    public class FinalDemo{
        public static void main(String[] args){
            FinalClass obj= new FinalClass();
            System.out.println("Final variable"+obj.num);
            obj.show();
        }
    }
