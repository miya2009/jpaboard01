package org.pgm.jpademo.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReplyEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rno;
    private Long bno;
    private String content;
    private String writer;
    @Transient
    private String memo;
}
