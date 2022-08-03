package easyexcel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.support.ExcelTypeEnum;
import easyexcel.dto.ExcelStudentDTO;
import easyexcel.listener.ExcelStudentDTOListener;
import org.junit.Test;

/**
 * @Author: Lishenglong
 * @Date: 2022/8/3 11:03
 */
public class ExcelReadTest {
    /**
     * 最简单的读
     */
    @Test
    public void simpleReadXlsx() {

        String fileName = "d:/simpleWrite.xlsx";
        // 这里默认读取第一个sheet
        EasyExcel.read(fileName, ExcelStudentDTO.class, new ExcelStudentDTOListener()).sheet().doRead();
        //调用mapper的save方法 Excel -> 数据库
    }

    @Test
    public void simpleReadXls() {

        String fileName = "d:/simpleWrite.xls";
        EasyExcel.read(fileName, ExcelStudentDTO.class, new ExcelStudentDTOListener()).sheet().doRead();
    }
}
