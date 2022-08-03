package easyexcel.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import easyexcel.dto.ExcelStudentDTO;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: Lishenglong
 * @Date: 2022/8/3 10:59
 */
@Slf4j
public class ExcelStudentDTOListener extends AnalysisEventListener<ExcelStudentDTO> {

    /**
     * 这个每一条数据解析都会来调用
     */
    @Override
    public void invoke(ExcelStudentDTO data, AnalysisContext context) {
        log.info("解析到一条数据:{}", data);

    }

    /**
     * 所有数据解析完成了 都会来调用
     */
    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        log.info("所有数据解析完成！");
    }
}
