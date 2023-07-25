package PP_Klausurvorbereitung;

public class Klausur05 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        a.x();
        System.out.println();
        b.x();
        System.out.println();
        c.x();
        System.out.println();

        A aa = new B(); aa.x();
        System.out.println();
        //B bb = new A(); -> not working because A is not a B
        A aaa = new C(); aaa.x();
        System.out.println();
        B bbb = new C(); bbb.x();
        System.out.println();
    }
}

class A {
    public void x() { y(); z(); }
    public void y() { System.out.println("A.y "); }
    public void z() { System.out.println("A.z "); }
}

class B extends A {
    public void y() { System.out.println("B.y "); }
    public void z() { super.z(); }
}

class C extends B {
    public void x() { super.y(); this.z(); }
    public void y() { System.out.println("C.y "); }
}