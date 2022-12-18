package com.healog.haelogtestserver.entity;

import com.healog.haelogtestserver.dto.RequestPostDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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

    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "post")
    private List<Comment> commentList = new ArrayList<>();

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

    // 연관관계 편의 메서드
    public void addComment(Comment comment) {
        this.commentList.add(comment);
    }

}
