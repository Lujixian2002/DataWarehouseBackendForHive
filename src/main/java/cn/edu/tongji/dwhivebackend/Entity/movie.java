package cn.edu.tongji.dwhivebackend.Entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "movie")
public class movie {
    private String movieid;
    private String title;
    private Double moviescore;
    private Date releasedate;
    private int year;
    private int month;
    private int day;
    private int week;
    private int commentnum;
    private Double ratingscore;
}
