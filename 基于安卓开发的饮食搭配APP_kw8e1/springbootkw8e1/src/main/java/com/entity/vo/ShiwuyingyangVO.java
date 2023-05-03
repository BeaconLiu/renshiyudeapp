package com.entity.vo;

import com.entity.ShiwuyingyangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 食物营养
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-03-31 09:23:40
 */
public class ShiwuyingyangVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 食物分类
	 */
	
	private String shiwufenlei;
		
	/**
	 * 成分含量
	 */
	
	private String chengfenhanliang;
		
	/**
	 * 碳水化合物
	 */
	
	private String tanshuihuahewu;
		
	/**
	 * 脂肪
	 */
	
	private String zhifang;
		
	/**
	 * 蛋白质
	 */
	
	private String danbaizhi;
		
	/**
	 * 热量
	 */
	
	private String reliang;
		
	/**
	 * 食物简介
	 */
	
	private String shiwujianjie;
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：食物分类
	 */
	 
	public void setShiwufenlei(String shiwufenlei) {
		this.shiwufenlei = shiwufenlei;
	}
	
	/**
	 * 获取：食物分类
	 */
	public String getShiwufenlei() {
		return shiwufenlei;
	}
				
	
	/**
	 * 设置：成分含量
	 */
	 
	public void setChengfenhanliang(String chengfenhanliang) {
		this.chengfenhanliang = chengfenhanliang;
	}
	
	/**
	 * 获取：成分含量
	 */
	public String getChengfenhanliang() {
		return chengfenhanliang;
	}
				
	
	/**
	 * 设置：碳水化合物
	 */
	 
	public void setTanshuihuahewu(String tanshuihuahewu) {
		this.tanshuihuahewu = tanshuihuahewu;
	}
	
	/**
	 * 获取：碳水化合物
	 */
	public String getTanshuihuahewu() {
		return tanshuihuahewu;
	}
				
	
	/**
	 * 设置：脂肪
	 */
	 
	public void setZhifang(String zhifang) {
		this.zhifang = zhifang;
	}
	
	/**
	 * 获取：脂肪
	 */
	public String getZhifang() {
		return zhifang;
	}
				
	
	/**
	 * 设置：蛋白质
	 */
	 
	public void setDanbaizhi(String danbaizhi) {
		this.danbaizhi = danbaizhi;
	}
	
	/**
	 * 获取：蛋白质
	 */
	public String getDanbaizhi() {
		return danbaizhi;
	}
				
	
	/**
	 * 设置：热量
	 */
	 
	public void setReliang(String reliang) {
		this.reliang = reliang;
	}
	
	/**
	 * 获取：热量
	 */
	public String getReliang() {
		return reliang;
	}
				
	
	/**
	 * 设置：食物简介
	 */
	 
	public void setShiwujianjie(String shiwujianjie) {
		this.shiwujianjie = shiwujianjie;
	}
	
	/**
	 * 获取：食物简介
	 */
	public String getShiwujianjie() {
		return shiwujianjie;
	}
			
}
