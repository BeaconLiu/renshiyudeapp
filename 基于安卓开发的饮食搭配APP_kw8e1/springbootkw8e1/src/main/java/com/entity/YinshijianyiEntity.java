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
 * 饮食建议
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-03-31 09:23:40
 */
@TableName("yinshijianyi")
public class YinshijianyiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YinshijianyiEntity() {
		
	}
	
	public YinshijianyiEntity(T t) {
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
	 * 分析图片
	 */
					
	private String fenxitupian;
	
	/**
	 * 记录时间
	 */
					
	private String jilushijian;
	
	/**
	 * 分析时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date fenxishijian;
	
	/**
	 * 当日摄入
	 */
					
	private String dangrisheru;
	
	/**
	 * 还可摄入
	 */
					
	private String haikesheru;
	
	/**
	 * 脂肪
	 */
					
	private String zhifang;
	
	/**
	 * 蛋白质
	 */
					
	private String danbaizhi;
	
	/**
	 * 碳水化合物
	 */
					
	private String tanshuihuahewu;
	
	/**
	 * 缺乏
	 */
					
	private String quefa;
	
	/**
	 * 减少
	 */
					
	private String jianshao;
	
	
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
	 * 设置：分析图片
	 */
	public void setFenxitupian(String fenxitupian) {
		this.fenxitupian = fenxitupian;
	}
	/**
	 * 获取：分析图片
	 */
	public String getFenxitupian() {
		return fenxitupian;
	}
	/**
	 * 设置：记录时间
	 */
	public void setJilushijian(String jilushijian) {
		this.jilushijian = jilushijian;
	}
	/**
	 * 获取：记录时间
	 */
	public String getJilushijian() {
		return jilushijian;
	}
	/**
	 * 设置：分析时间
	 */
	public void setFenxishijian(Date fenxishijian) {
		this.fenxishijian = fenxishijian;
	}
	/**
	 * 获取：分析时间
	 */
	public Date getFenxishijian() {
		return fenxishijian;
	}
	/**
	 * 设置：当日摄入
	 */
	public void setDangrisheru(String dangrisheru) {
		this.dangrisheru = dangrisheru;
	}
	/**
	 * 获取：当日摄入
	 */
	public String getDangrisheru() {
		return dangrisheru;
	}
	/**
	 * 设置：还可摄入
	 */
	public void setHaikesheru(String haikesheru) {
		this.haikesheru = haikesheru;
	}
	/**
	 * 获取：还可摄入
	 */
	public String getHaikesheru() {
		return haikesheru;
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
	 * 设置：缺乏
	 */
	public void setQuefa(String quefa) {
		this.quefa = quefa;
	}
	/**
	 * 获取：缺乏
	 */
	public String getQuefa() {
		return quefa;
	}
	/**
	 * 设置：减少
	 */
	public void setJianshao(String jianshao) {
		this.jianshao = jianshao;
	}
	/**
	 * 获取：减少
	 */
	public String getJianshao() {
		return jianshao;
	}

}
