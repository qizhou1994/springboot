package com.zq.spboot.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by zq on 2019/2/15.
 */
@Component
public class NeoProperties {
    @Value("${com.zq.spboot.title}")
    private String title;

    @Value("${com.zq.spboot.description}")
    private String description;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
