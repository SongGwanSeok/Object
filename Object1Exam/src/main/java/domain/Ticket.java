package main.java.domain;

public class Ticket {

    private final Long fee;

    public Ticket(Long fee) {
        this.fee = fee;
    }

    public Long getFee() {
        return fee;
    }

    public boolean canBuy(Long amount) {
        return fee <= amount;
    }
}
