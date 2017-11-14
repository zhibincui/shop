package com.shop.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sun.activation.registries.MailcapFile;


/**
 * 
 * @Description: Excel 导入
 * @see: ExcelController 此处填写需要参考的类
 * @version 2017年7月31日 下午4:50:13 
 * @author zhibin.cui
 */
@Controller
@RequestMapping("excel")
public class ExcelController {
	private static Logger logger = LoggerFactory.getLogger(ExcelController.class);
	
	/**
	 * 
	 * @Description  跳转导入页面
	 * @return
	 * @see 需要参考的类或方法
	 */
	@RequestMapping("toExcelImport")
	public String toExcelImport(){
		return "poi/excelImport";
	}
	
	/**
	 * 
	 * @Description  导入excel内容
	 * @param importExcel
	 * @see 需要参考的类或方法
	 */
	@RequestMapping("readeExcel")
	public void readeExcel(MailcapFile importExcel ){
		
	}

}
