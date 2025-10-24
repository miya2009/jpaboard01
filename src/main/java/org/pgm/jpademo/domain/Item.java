package org.pgm.jpademo.domain;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false, length = 50)
    private String itemNm;

    @Column(name = "price", nullable=false)
    @ColumnDefault(value = "1000")
    private int price;

    //@Column(nullable = false)
    //@ColumnDefault(value="10")
    @Column(columnDefinition = "int default 10 not null")
    private int stockNumber;
    @Lob
    @Column(nullable = false)
    private String itemDetail;

    @Enumerated(EnumType.STRING) //ORDINAL :0,1,2, STRING : 판매중,판매완료, 입고대기
    private ItemSellStatus itemSellStatus;

    @CreationTimestamp
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime regTime;

    @UpdateTimestamp
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateTime;

    @Transient
    private String memo;
    @Transient
    private String remark;
}
