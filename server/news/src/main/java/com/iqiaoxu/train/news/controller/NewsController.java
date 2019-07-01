package com.iqiaoxu.train.news.controller;

import com.iqiaoxu.train.news.entity.News;
import com.iqiaoxu.train.news.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 游由
 * @version 0.0.1
 * @since 0.0.1
 * create time 2019/7/1 11:09
 */
@RestController
@RequestMapping("/news")
public class NewsController {
    @Autowired
    private INewsService newsService;

    @GetMapping
    public List<News> getNews(@RequestParam("pageNum")int pageNum, @RequestParam("pageSize") int pageSize){
        return newsService.getNews(pageNum,pageSize);
    }

    @PostMapping
    public News addNews(News news){
        return newsService.addNews(news);
    }

    @GetMapping("{id}")
    public News getNews(@PathVariable("id")int id){
        return newsService.getNews(id);
    }

    @PutMapping(value = "{id}")
    public News modifyNews(@PathVariable("id")int id,News news){
        news.setId(id);
        return newsService.modifyNews(news);
    }


}
