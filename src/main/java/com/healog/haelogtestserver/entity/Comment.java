package com.healog.haelogtestserver.entity;

import com.healog.haelogtestserver.dto.RequestCommentDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Comment extends Timestamped {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String comment;

    @Column(nullable = false)
    String username;

    @ManyToOne(fetch = FetchType.LAZY)
    private Post post;

//    @OneToMany
//    @Builder.Default
//    @JoinColumn(name = "commentId")
//    private List<Comment> commentList = new ArrayList<>();

//    public void addComment(Comment comment) {
//        this.commentList.add(comment);
//    }

    public void update(String comment) {
        this.comment = comment;
    }

    public Comment(RequestCommentDto requestCommentDto, Post post) {
        this.username = "댓글 작성자";
        this.comment = requestCommentDto.getComment();
        this.post = post;
    }

}
