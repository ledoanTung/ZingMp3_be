package com.website.ZingMp3_be.entity;

import lombok.Data;

@Data
public class Track {
    private Long index;
    private String link;
    private String title;
    private Long startOffset;
    private Long endOffset;
    private Long duration;
    private String artist;
}
