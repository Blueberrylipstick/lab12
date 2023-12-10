package ua.edu.ucu.apps.task1;

public class ATM {
    private Tray firstTray;

    public ATM() {
        this.firstTray = new Tray500().setNext(new Tray200().setNext(new Tray100()
        .setNext(new Tray50().setNext(new Tray50().setNext(new Tray20()
        .setNext(new Tray10().setNext(new Tray5())))))));
    }

    public void process(int amount) {
        firstTray.process(amount);
    }
}
