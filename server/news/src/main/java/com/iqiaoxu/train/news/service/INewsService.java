package com.iqiaoxu.train.news.service;

import com.iqiaoxu.train.news.entity.News;

import java.util.List;

/**
 * @author 游由
 * @version 0.0.1
 * @since 0.0.1
 * create time 2019/7/1 11:10
 */
public interface INewsService {
    List<News> getNews(int pageNum, int pageSize);

    News addNews(News news);

    News getNews(int id);

    News modifyNews(News news);
}
