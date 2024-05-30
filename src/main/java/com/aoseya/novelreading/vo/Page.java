package com.aoseya.novelreading.vo;

import com.aoseya.novelreading.factory.PageService;
import lombok.Builder;
import lombok.Data;

/**
 * @description: 抽象页面
 * @author: aoseya
 * @date: 2024/5/29 14:41
 */
public abstract class Page implements PageService {
    @Override
    public PageService miniInit() {
        return null;
    }
}
