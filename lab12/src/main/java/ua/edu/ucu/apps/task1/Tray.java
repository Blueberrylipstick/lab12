package ua.edu.ucu.apps.task1;

public abstract class Tray {
    private int denomination;
    private Tray next;

    public Tray(int denom) {
        this.denomination = denom;
    }

    public Tray setNext(Tray tray) {
        this.next = tray;
        return this;
    }

    public void process(int amount) {
        if (next != null) {
            next.process(amount % denomination);
        } else if (amount%denomination > 0) {
            throw new IllegalArgumentException();
        }
        System.out.println("You need to take " + amount/denomination + " of " + denomination);
    }
}
