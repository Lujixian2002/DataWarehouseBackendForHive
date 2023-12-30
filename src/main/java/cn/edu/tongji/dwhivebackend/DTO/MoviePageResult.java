package cn.edu.tongji.dwhivebackend.DTO;

import cn.edu.tongji.dwhivebackend.Entity.movie;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MoviePageResult {
    private List<movie> movies;
    private int totalRows;
}
