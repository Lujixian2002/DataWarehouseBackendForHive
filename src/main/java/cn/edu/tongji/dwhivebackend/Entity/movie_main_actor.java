package cn.edu.tongji.dwhivebackend.Entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "movie_main_actor")
public class movie_main_actor {
    private String movieID;
    private String actorID;
}
