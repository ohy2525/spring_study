package hello.jdbc.domain;

import lombok.Data;

@Data
public class Member {

    private String memberID;
    private int money;

    public Member() {
    }

    public Member(String memberID, int money) {
        this.memberID = memberID;
        this.money = money;
    }
}
