package cn.edu.tongji.dwhivebackend.Entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "movie_format")
public class movie_format {
    private String formatID;
    private String movieID;
}
