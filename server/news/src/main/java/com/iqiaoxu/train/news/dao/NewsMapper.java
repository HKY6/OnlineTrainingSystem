package com.iqiaoxu.train.news.dao;

import com.iqiaoxu.train.news.entity.News;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 游由
 * @version 0.0.1
 * @since 0.0.1
 * create time 2019/7/1 11:11
 */
@Mapper
public interface NewsMapper {

    News insertNews(News news);
    News updateNews(News news);
    News selectNewsById(int id);
    List<News> selectNewsByPage(int start, int end);
}
