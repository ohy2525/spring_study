package hello.itemservice.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity  //테이블과 매핑되어 관리
public class Item {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) //DB 에서 값을 증가시키는 전략
    private Long id;

    @Column(name = "item_name", length = 10)  //없어도 자동으로 됨
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
