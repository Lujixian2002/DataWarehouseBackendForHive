package cn.edu.tongji.dwhivebackend.Repository;

import cn.edu.tongji.dwhivebackend.DTO.MoviePageResult;
import cn.edu.tongji.dwhivebackend.Entity.format;
import cn.edu.tongji.dwhivebackend.Entity.movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class MovieDateRepository {
//现在就是所有的都要写一个私有映射类
    @Autowired
    private JdbcTemplate jdbcTemplate;
//要用到的类的映射类
    private static class movieRowMapper implements RowMapper<movie> {

        @Override
        public movie mapRow(ResultSet rs, int rowNum) throws SQLException {
            movie entity = new movie();
            entity.setMovieid(rs.getString("movieid"));
            entity.setTitle(rs.getString("title"));
            entity.setCommentnum(rs.getInt("commentnum"));
            entity.setMoviescore(rs.getDouble("moviescore"));
            entity.setRatingscore(rs.getDouble("ratingscore"));
            entity.setDay(rs.getInt("day"));
            entity.setMonth(rs.getInt("month"));
            entity.setYear(rs.getInt("year"));
            entity.setReleasedate(rs.getDate("releasedate"));
            return entity;
        }

    }
//    测试
    private static class formatRowMapper implements RowMapper<format> {
        @Override
        public format mapRow(ResultSet rs, int rowNum) throws SQLException {
            format entity = new format();
            entity.setFormat(rs.getString("format"));
            entity.setFormatid(rs.getString("formatid"));
            return entity;
        }

    }
    public List<format> getFormatList() {
        String selectSql = "SELECT * FROM format";
        return jdbcTemplate.query(selectSql, new formatRowMapper());
    }

//    获取某年数据

    public MoviePageResult getMovieByReleaseYear(int year) {
//        String countSql = "SELECT COUNT(*) FROM movie WHERE year = ?";
//        int totalRows = jdbcTemplate.query(countSql, Integer.class, year);

        int totalRows = 1;
        String selectSql = "SELECT * FROM movie WHERE year = ?";
        List<movie> movies = jdbcTemplate.query(selectSql, new movieRowMapper(),year);

        return new MoviePageResult(movies, totalRows);
    }

    public MoviePageResult getMovieByReleaseYearMonth(int year,int month) {
//        String countSql = "SELECT COUNT(*) FROM movie WHERE year = ? AND month = ?";
//        int totalRows = jdbcTemplate.query(countSql, Integer.class, year,month);

        int totalRows = 1;
        String selectSql = "SELECT * FROM movie WHERE year = ? AND month = ?";
        List<movie> movies = jdbcTemplate.query(selectSql, new movieRowMapper(),year,month);

        return new MoviePageResult(movies, totalRows);
    }

//    public MoviePageResult


}

