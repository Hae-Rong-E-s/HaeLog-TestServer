package com.healog.haelogtestserver.entity;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

public class Post {

    @OneToMany(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "postId")
    private List<Comment> commentList = new ArrayList<>();

    // 연관관계 편의 메서드
    public void addComment(Comment comment) {
        this.commentList.add(comment);
    }

}
