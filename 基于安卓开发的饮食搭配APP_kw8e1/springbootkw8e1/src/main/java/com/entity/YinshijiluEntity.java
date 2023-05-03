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
 * 饮食记录
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-03-31 09:23:40
 */
@TableName("yinshijilu")
public class YinshijiluEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YinshijiluEntity() {
		
	}
	
	public YinshijiluEntity(T t) {
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
	 * 用户账号
	 */
					
	private String yonghuzhanghao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date jilushijian;
	
	
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
	 * 设置：用户账号
	 */
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
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
