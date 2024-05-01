package main.java.controller;

import java.time.LocalDate;
import java.time.Month;
import main.java.domain.Audience;
import main.java.domain.Bag;
import main.java.domain.Invitation;
import main.java.domain.Theater;
import main.java.domain.TicketOffice;
import main.java.domain.TicketSeller;
import main.java.view.InputView;
import main.java.view.OutputView;

public class EntranceController {

    private final InputView inputView;
    private final OutputView outputView;

    public EntranceController() {
        inputView = new InputView();
        outputView = new OutputView();
    }


    public void run() {
        Theater theater = createTheater();
        Audience audience = initAudienceWithoutInvitation();

        theater.enter(audience);
        checkTicket(audience);
    }

    private Theater createTheater() {
        outputView.printGetTicketCount();
        Long ticketCount = inputView.scanTicketCount();
        outputView.printGetTicketFee();
        Long ticketFee = inputView.scanTicketFee();
        TicketOffice ticketOffice = new TicketOffice(ticketCount, ticketFee);
        TicketSeller ticketSeller = new TicketSeller(ticketOffice);
        return new Theater(ticketSeller);
    }

    private Audience createAudience() {
        outputView.printAudiencePossession();
        String when = inputView.scanInvitationWhen();
        return null;
    }

    private Audience initAudienceWithInvitation() {
        LocalDate visitDate = LocalDate.of(2024, Month.MAY, 10);
        Invitation invitation = new Invitation(visitDate);
        return new Audience(new Bag(invitation, 0L));
    }

    private Audience initAudienceWithoutInvitation() {
        return new Audience(new Bag(30000L));
    }

    private void checkTicket(Audience audience) {
        outputView.printAudienceHasTicket(audience.hasTicket());
    }

}
