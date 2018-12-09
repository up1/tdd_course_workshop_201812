public class DemoAbstract {
    public static void main() {
        Process1 p = new Process1();
        p.exeute();
    }
}

class Process1 extends Process {
    void step1() { }
    void step2() { }
}

abstract class Process {
    abstract void step1();
    abstract void step2();
    void exeute() {
        step1();
        step2();
    }
}

