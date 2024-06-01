public class ex1 {


        public static void main(String[] args) {
            A obj1 = new D();
            obj1.f();
            ((B)obj1).f(0);
            ((C)obj1).f(0);

        }
    }
    class A{
        protected  int i;
        public void f(){
            System.out.println("fA");
        }
    }

    class B extends A{
        public void f(){
            System.out.println("fB");
            f(0);
        }
        public int f(int i){
            System.out.println("fiB");
            return 0;
        }
    }
    class C extends B{ }

    class D extends B{
        public void f(){
            super.f();
            System.out.println("fD");

        }
        public int f(int i){
            System.out.println("fiD");
            return 0;
        }
    }
