package com.entity.vo;

import com.entity.YinshijiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 饮食记录
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-03-31 09:23:40
 */
public class YinshijiluVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 封面图片
	 */
	
	private String fengmiantupian;
		
	/**
	 * 早餐
	 */
	
	private String zaocan;
		
	/**
	 * 午餐
	 */
	
	private String wucan;
		
	/**
	 * 晚餐
	 */
	
	private String wancan;
		
	/**
	 * 加餐
	 */
	
	private String jiacan;
		
	/**
	 * 记录时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jilushijian;
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：封面图片
	 */
	 
	public void setFengmiantupian(String fengmiantupian) {
		this.fengmiantupian = fengmiantupian;
	}
	
	/**
	 * 获取：封面图片
	 */
	public String getFengmiantupian() {
		return fengmiantupian;
	}
				
	
	/**
	 * 设置：早餐
	 */
	 
	public void setZaocan(String zaocan) {
		this.zaocan = zaocan;
	}
	
	/**
	 * 获取：早餐
	 */
	public String getZaocan() {
		return zaocan;
	}
				
	
	/**
	 * 设置：午餐
	 */
	 
	public void setWucan(String wucan) {
		this.wucan = wucan;
	}
	
	/**
	 * 获取：午餐
	 */
	public String getWucan() {
		return wucan;
	}
				
	
	/**
	 * 设置：晚餐
	 */
	 
	public void setWancan(String wancan) {
		this.wancan = wancan;
	}
	
	/**
	 * 获取：晚餐
	 */
	public String getWancan() {
		return wancan;
	}
				
	
	/**
	 * 设置：加餐
	 */
	 
	public void setJiacan(String jiacan) {
		this.jiacan = jiacan;
	}
	
	/**
	 * 获取：加餐
	 */
	public String getJiacan() {
		return jiacan;
	}
				
	
	/**
	 * 设置：记录时间
	 */
	 
	public void setJilushijian(Date jilushijian) {
		this.jilushijian = jilushijian;
	}
	
	/**
	 * 获取：记录时间
	 */
	public Date getJilushijian() {
		return jilushijian;
	}
			
}
