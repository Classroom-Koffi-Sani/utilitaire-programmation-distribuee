package TP4;
// Programme non synchronise
class Callme {
    void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            System.out.println("Interrompue");
        }
        System.out.println("]");
    }
}// class Callme