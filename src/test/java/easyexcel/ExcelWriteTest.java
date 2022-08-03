package easyexcel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.support.ExcelTypeEnum;
import easyexcel.dto.ExcelStudentDTO;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author: Lishenglong
 * @Date: 2022/8/3 10:38
 */
public class ExcelWriteTest {

    @Test
    public void simpleWriteXlsx() {
        String fileName = "d:/simpleWrite.xlsx"; //需要提前新建目录
        // 这里 需要指定写用哪个class去写，然后写到第一个sheet，名字为模板 然后文件流会自动关闭
        EasyExcel.write(fileName, ExcelStudentDTO.class).sheet("模板").doWrite(data());
    }

    @Test
    public void simpleWriteXls() {

        String fileName = "d:/excel/simpleWrite.xls";
        // 如果这里想使用03 则 传入excelType参数即可
        EasyExcel.write(fileName, ExcelStudentDTO.class).excelType(ExcelTypeEnum.XLS).sheet("模板").doWrite(data());
    }

    //辅助方法
    private List<ExcelStudentDTO> data(){
        List<ExcelStudentDTO> list = new ArrayList<>();

        //算上标题，最多可写65536行(xls) 100000+行(xlsx)
        //超出：java.lang.IllegalArgumentException: Invalid row number (65536) outside allowable range (0..65535)
        for (int i = 0; i < 10; i++) {
            ExcelStudentDTO data = new ExcelStudentDTO();
            data.setName("Helen" + i);
            data.setBirthday(new Date());
            data.setSalary(123456.1234);
            list.add(data);
        }

        return list;
    }
}
