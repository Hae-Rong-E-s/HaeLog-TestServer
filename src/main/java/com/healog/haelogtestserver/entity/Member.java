package com.healog.haelogtestserver.entity;

import com.healog.haelogtestserver.dto.RequestMemberDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Entity
@Setter
@Getter
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    public Member(RequestMemberDto requestMemberDto) {
        this.username = requestMemberDto.getUsername();
        this.password = requestMemberDto.getPassword();
    }
}
