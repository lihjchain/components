package com.lawu.excel.util;

/**
 * Excel导入校验异常类
 *
 * @author Leach
 * @since 2016/3/22
 */
public class ExcelImportVerifyException extends Exception {

    private ExcelImportRowResult excelImportRowResult;

    public ExcelImportVerifyException() {
        super();
    }

    public ExcelImportVerifyException(String message) {
        super(message);
    }

    public ExcelImportVerifyException(ExcelImportRowResult excelImportRowResult) {
        super(excelImportRowResult.getMessage());
        this.excelImportRowResult = excelImportRowResult;
    }

    public ExcelImportVerifyException(String message, Throwable cause) {
        super(message, cause);
    }

    public ExcelImportVerifyException(Throwable cause) {
        super(cause);
    }

    public ExcelImportRowResult getExcelImportRowResult() {
        return excelImportRowResult;
    }
}
