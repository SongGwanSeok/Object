package main.java.domain;

public class Bag {

    private Long amount;
    private Ticket ticket;
    private Invitation invitation;

    public Bag(long amount) {
        this(null, amount);
    }

    public Bag(Invitation invitation, long amount) {
        this.invitation = invitation;
        this.amount = amount;
    }

    public Long hold(Ticket ticket) {
        if (hasInvitation()) {
            setTicket(ticket);
            return 0L;
        }
        if (ticket != null && ticket.canBuy(amount)) {
            setTicket(ticket);
            minusAmount(ticket.getFee());
            return ticket.getFee();
        }
        return 0L;
    }

    public boolean hasTicket() {
        return ticket != null;
    }

    private void minusAmount(Long amount) {
        this.amount -= amount;
    }

    private void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    private boolean hasInvitation() {
        return invitation != null;
    }
}
