package cn.edu.tongji.dwhivebackend.Service.Impl;
import cn.edu.tongji.dwhivebackend.DTO.MovieDateResult;
import cn.edu.tongji.dwhivebackend.DTO.MoviePageResult;
import cn.edu.tongji.dwhivebackend.Repository.MovieDateRepository;
import cn.edu.tongji.dwhivebackend.Service.MovieDateService;
import cn.edu.tongji.dwhivebackend.Entity.format;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * TODO:此处写HiveServiceImpl类的描述
 *
 * @author shotray
 * @since 2021/12/17 16:47
 */


@Service
public class MovieDateServiceImpl implements MovieDateService {


    @Autowired
    private MovieDateRepository movieDateRepository;

    @Override
    public List<format> getFormatList() {
        return movieDateRepository.getFormatList();
    }

    @Override
    public MoviePageResult getMovieByReleaseYear(int year) {
        return movieDateRepository.getMovieByReleaseYear(year);
    }

    @Override
    public MoviePageResult getMovieByReleaseYearMonth(int year, int month) {
        return movieDateRepository.getMovieByReleaseYearMonth(year,month);
    }

    @Override
    public MoviePageResult getMovieByReleaseYearSeason(int year, int season) {
        return null;
    }

    @Override
    public List<MovieDateResult> getMovieCountByYears(int startYear, int endYear) {
        return null;
    }

    @Override
    public List<MovieDateResult> getMovieCountByMonths(int year) {
        return null;
    }


}

