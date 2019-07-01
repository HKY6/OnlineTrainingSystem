package com.iqiaoxu.train.news.service.Impl;

import com.iqiaoxu.train.news.dao.NewsMapper;
import com.iqiaoxu.train.news.entity.News;
import com.iqiaoxu.train.news.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 游由
 * @version 0.0.1
 * @since 0.0.1
 * create time 2019/7/1 11:11
 */
@Service
public class NewsServiceImpl implements INewsService {
    @Autowired
    private NewsMapper newsMapper;

    @Override
    public List<News> getNews(int pageNum, int pageSize) {
        int end = pageNum * pageSize;
        int start = end - pageSize;
        return newsMapper.selectNewsByPage(start,end);
    }

    @Override
    public News addNews(News news) {
        return newsMapper.insertNews(news);
    }

    @Override
    public News getNews(int id) {
        return newsMapper.selectNewsById(id);
    }

    @Override
    public News modifyNews(News news) {
        return newsMapper.updateNews(news);
    }
}
