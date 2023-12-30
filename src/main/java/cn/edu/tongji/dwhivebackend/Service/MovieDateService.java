package cn.edu.tongji.dwhivebackend.Service;

import cn.edu.tongji.dwhivebackend.DTO.MovieDateResult;
import cn.edu.tongji.dwhivebackend.DTO.MoviePageResult;
import cn.edu.tongji.dwhivebackend.Entity.format;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public interface MovieDateService {

    List<format> getFormatList();
    MoviePageResult getMovieByReleaseYear(int year);
//
    MoviePageResult getMovieByReleaseYearMonth(int year,int month);

    MoviePageResult getMovieByReleaseYearSeason(int year,int season);

    List<MovieDateResult> getMovieCountByYears(int startYear,int endYear);

    List<MovieDateResult> getMovieCountByMonths(int year);
}

