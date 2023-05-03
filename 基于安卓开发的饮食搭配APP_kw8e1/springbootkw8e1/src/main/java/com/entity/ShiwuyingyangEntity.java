package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 食物营养
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-03-31 09:23:40
 */
@TableName("shiwuyingyang")
public class ShiwuyingyangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShiwuyingyangEntity() {
		
	}
	
	public ShiwuyingyangEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 名称
	 */
					
	private String mingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：名称
	 */
	public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
	}
	/**
	 * 获取：名称
	 */
	public String getMingcheng() {
		return mingcheng;
	}
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
