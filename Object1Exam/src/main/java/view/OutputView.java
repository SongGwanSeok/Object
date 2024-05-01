package main.java.view;

public class OutputView {

    public void printGetTicketCount() {
        System.out.println("극장에 몇개의 티켓이 있는지를 숫자로 작성하세요.");
    }

    public void printGetTicketFee() {
        System.out.println("극장의 티켓 가격을 입력하세요.");
    }

    public void printAudienceHasTicket(boolean audienceHasTicket) {
        System.out.println(audienceHasTicket);
    }

    public void printAudiencePossession() {
        System.out.println("관객은 초대장을 가지고 입장하나요? 가지고 입장한다면 날짜를 작성하고 없다면 enter를 눌러주세요.");
    }
}
