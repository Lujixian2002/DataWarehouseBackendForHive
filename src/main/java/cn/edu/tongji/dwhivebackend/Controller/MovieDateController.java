package cn.edu.tongji.dwhivebackend.Controller;

import cn.edu.tongji.dwhivebackend.DTO.MoviePageResult;
import cn.edu.tongji.dwhivebackend.Service.MovieDateService;
import cn.edu.tongji.dwhivebackend.Entity.format;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/hive/movieDate")
public class MovieDateController {


    @Autowired
    private MovieDateService movieDateService;

    @RequestMapping("/getMoviesByYear")
    public ResponseEntity<MoviePageResult> getMoviesByYear(@RequestParam int year) {
        MoviePageResult movies = movieDateService.getMovieByReleaseYear(year);
        return new ResponseEntity<>(movies, HttpStatus.OK);
    }

    @RequestMapping("/getMoviesByYearMonth")
    public ResponseEntity<MoviePageResult> getMoviesByYearMonth(@RequestParam int year,@RequestParam int month) {
        MoviePageResult movies = movieDateService.getMovieByReleaseYearMonth(year,month);
        return new ResponseEntity<>(movies, HttpStatus.OK);
    }

    @RequestMapping("/getFormatList")
    public ResponseEntity<List<format>> getFormatList() {

        List<format> formatList = movieDateService.getFormatList();
        return new ResponseEntity<>(formatList, HttpStatus.OK);
    }


}
