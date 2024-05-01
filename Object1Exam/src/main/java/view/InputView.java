package main.java.view;

import java.util.Scanner;

public class InputView {

    private final Scanner scanner;

    public InputView() {
        scanner = new Scanner(System.in);
    }

    public Long scanTicketCount() {
        return Long.parseLong(scanner.nextLine());
    }

    public Long scanTicketFee() {
        return Long.parseLong(scanner.nextLine());
    }

    public String scanInvitationWhen() {
        return scanner.nextLine();
    }

}
