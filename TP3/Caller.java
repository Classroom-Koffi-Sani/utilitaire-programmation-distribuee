package TP3;

class Caller implements Runnable {
    String msg;
    Callme cible;
    Thread th;
    public Caller(Callme cib, String ch) {
        cible = cib;
        msg = ch;
        th = new Thread(this);
        th.start();
    }

    public void run() {
        cible.call(msg);
    }
}// class Caller