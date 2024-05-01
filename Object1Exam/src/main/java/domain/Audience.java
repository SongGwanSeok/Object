package main.java.domain;

public class Audience {

    private final Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Long buy(Ticket ticket) {
        return bag.hold(ticket);
    }

    public boolean hasTicket() {
        return bag.hasTicket();
    }
}
