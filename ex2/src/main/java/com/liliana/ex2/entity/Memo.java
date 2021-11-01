package com.liliana.ex2.entity;

import lombok.*;

import javax.persistence.*;

@Entity //반드시 추가. 해당 클래스가 엔티티를 위한 클래스이며, 해당 클래스의 인스턴스들이 JPA로 관리되는 엔티티 객체라는 것을 의미
@Table(name="tbl_memo") //엔티티 클래스를 어떤 테이블로 생성할 것인지
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Memo {

    @Id //primary key에 대한 특정 필드로 지정
    @GeneratedValue(strategy =GenerationType.IDENTITY) //자동으로 생성되는 번호 auto increment
    private Long mno;

    @Column(length = 200, nullable = false)
    private String memoText;
}
