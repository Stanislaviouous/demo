package api;


import model.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import service.NewsService;

import java.util.List;

@RestController
@Controller
public class NewsController {

    @Autowired
    NewsService newsService;

    @GetMapping("new")
    public @ResponseBody
    List<News> getAllNews(){

        return newsService.getAllNews();
    }
}
