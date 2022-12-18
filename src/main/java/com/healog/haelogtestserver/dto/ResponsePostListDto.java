package com.healog.haelogtestserver.dto;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class ResponsePostListDto {
    private List<ResponsePostDto> responsePostListDto = new ArrayList<>();

    public void addPost(ResponsePostDto responsePostDto) {
        responsePostListDto.add(responsePostDto);
    }
}
