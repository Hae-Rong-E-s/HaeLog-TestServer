package com.healog.haelogtestserver.entity;

import com.healog.haelogtestserver.dto.RequestPostDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Post extends Timestamped {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    public Post(RequestPostDto requestPostDto) {
        super();
        this.username = "작성자";
        this.title = requestPostDto.getTitle();
        this.content = requestPostDto.getContent();
    }

    public void updatePost(RequestPostDto requestPostDto) {
        this.username = "작성자";
        this.title = requestPostDto.getTitle();
        this.content = requestPostDto.getContent();
    }


}
