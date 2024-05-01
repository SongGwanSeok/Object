package main.java.domain;

import java.util.ArrayList;
import java.util.List;

public class TicketOffice {

    private Long amount;
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Long count, Long ticketFee) {
        amount = 0L;
        for (int i = 0; i < count; i++) {
            tickets.add(new Ticket(ticketFee));
        }
    }

    public void sellTicketTo(Audience audience) {
        plusAmount(audience.buy(getTicket()));
    }

    private Ticket getTicket() {
        if (tickets.isEmpty()) {
            return null;
        }
        return tickets.remove(0);
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
