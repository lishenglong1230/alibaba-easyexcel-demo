package easyexcel.dto;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @Author: Lishenglong
 * @Date: 2022/8/3 10:37
 */
@Data
public class ExcelStudentDTO {
    @ExcelProperty("姓名")
    private String name;

    @ExcelProperty("生日")
    private Date birthday;

    @ExcelProperty("薪资")
    private Double salary;
}
