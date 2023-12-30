package cn.edu.tongji.dwhivebackend.Entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "format")
public class format {
    @TableId(value = "formatid")
    private String formatid;
    private String format;
}
