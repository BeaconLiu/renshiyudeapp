<template>
	<div class="addEdit-block" :style='{"padding":"30px 0"}' style="width: 100%;">
		<el-form
			:style='{"width":"90%","padding":"30px","boxShadow":"0px 4px 10px 0px rgba(0,0,0,0.3020)","margin":"0 auto","borderRadius":"6px","background":"rgba(255, 255, 255, .8)"}'
			class="add-update-preview"
			ref="ruleForm"
			:model="ruleForm"
			:rules="rules"
			label-width="140px"
		>
			<template >
				<el-form-item :style='{"width":"50%","margin":"0 0 20px 0","display":"inline-block"}' class="input" v-if="type!='info'"  label="用户账号" prop="yonghuzhanghao">
					<el-input v-model="ruleForm.yonghuzhanghao" placeholder="用户账号" clearable  :readonly="ro.yonghuzhanghao"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"50%","margin":"0 0 20px 0","display":"inline-block"}' v-else class="input" label="用户账号" prop="yonghuzhanghao">
					<el-input v-model="ruleForm.yonghuzhanghao" placeholder="用户账号" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"50%","margin":"0 0 20px 0","display":"inline-block"}' class="input" v-if="type!='info'"  label="用户姓名" prop="yonghuxingming">
					<el-input v-model="ruleForm.yonghuxingming" placeholder="用户姓名" clearable  :readonly="ro.yonghuxingming"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"50%","margin":"0 0 20px 0","display":"inline-block"}' v-else class="input" label="用户姓名" prop="yonghuxingming">
					<el-input v-model="ruleForm.yonghuxingming" placeholder="用户姓名" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"50%","margin":"0 0 20px 0","display":"inline-block"}' class="upload" v-if="type!='info' && !ro.fenxitupian" label="分析图片" prop="fenxitupian">
					<file-upload
						tip="点击上传分析图片"
						action="file/upload"
						:limit="3"
						:multiple="true"
						:fileUrls="ruleForm.fenxitupian?ruleForm.fenxitupian:''"
						@change="fenxitupianUploadChange"
					></file-upload>
				</el-form-item>
				<el-form-item :style='{"width":"50%","margin":"0 0 20px 0","display":"inline-block"}' class="upload" v-else-if="ruleForm.fenxitupian" label="分析图片" prop="fenxitupian">
					<img v-if="ruleForm.fenxitupian.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.fenxitupian.split(',')[0]" width="100" height="100">
					<img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.fenxitupian.split(',')" :src="$base.url+item" width="100" height="100">
				</el-form-item>
				<el-form-item :style='{"width":"50%","margin":"0 0 20px 0","display":"inline-block"}' class="input" v-if="type!='info'"  label="记录时间" prop="jilushijian">
					<el-input v-model="ruleForm.jilushijian" placeholder="记录时间" clearable  :readonly="ro.jilushijian"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"50%","margin":"0 0 20px 0","display":"inline-block"}' v-else class="input" label="记录时间" prop="jilushijian">
					<el-input v-model="ruleForm.jilushijian" placeholder="记录时间" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"50%","margin":"0 0 20px 0","display":"inline-block"}' class="date" v-if="type!='info'" label="分析时间" prop="fenxishijian">
					<el-date-picker
						format="yyyy 年 MM 月 dd 日"
						value-format="yyyy-MM-dd"
						v-model="ruleForm.fenxishijian" 
						type="date"
						:readonly="ro.fenxishijian"
						placeholder="分析时间"
					></el-date-picker> 
				</el-form-item>
				<el-form-item :style='{"width":"50%","margin":"0 0 20px 0","display":"inline-block"}' class="input" v-else-if="ruleForm.fenxishijian" label="分析时间" prop="fenxishijian">
					<el-input v-model="ruleForm.fenxishijian" placeholder="分析时间" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"50%","margin":"0 0 20px 0","display":"inline-block"}' class="input" v-if="type!='info'"  label="当日摄入" prop="dangrisheru">
					<el-input v-model="ruleForm.dangrisheru" placeholder="当日摄入" clearable  :readonly="ro.dangrisheru"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"50%","margin":"0 0 20px 0","display":"inline-block"}' v-else class="input" label="当日摄入" prop="dangrisheru">
					<el-input v-model="ruleForm.dangrisheru" placeholder="当日摄入" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"50%","margin":"0 0 20px 0","display":"inline-block"}' class="input" v-if="type!='info'"  label="还可摄入" prop="haikesheru">
					<el-input v-model="ruleForm.haikesheru" placeholder="还可摄入" clearable  :readonly="ro.haikesheru"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"50%","margin":"0 0 20px 0","display":"inline-block"}' v-else class="input" label="还可摄入" prop="haikesheru">
					<el-input v-model="ruleForm.haikesheru" placeholder="还可摄入" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"50%","margin":"0 0 20px 0","display":"inline-block"}' class="input" v-if="type!='info'"  label="脂肪" prop="zhifang">
					<el-input v-model="ruleForm.zhifang" placeholder="脂肪" clearable  :readonly="ro.zhifang"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"50%","margin":"0 0 20px 0","display":"inline-block"}' v-else class="input" label="脂肪" prop="zhifang">
					<el-input v-model="ruleForm.zhifang" placeholder="脂肪" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"50%","margin":"0 0 20px 0","display":"inline-block"}' class="input" v-if="type!='info'"  label="蛋白质" prop="danbaizhi">
					<el-input v-model="ruleForm.danbaizhi" placeholder="蛋白质" clearable  :readonly="ro.danbaizhi"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"50%","margin":"0 0 20px 0","display":"inline-block"}' v-else class="input" label="蛋白质" prop="danbaizhi">
					<el-input v-model="ruleForm.danbaizhi" placeholder="蛋白质" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"50%","margin":"0 0 20px 0","display":"inline-block"}' class="input" v-if="type!='info'"  label="碳水化合物" prop="tanshuihuahewu">
					<el-input v-model="ruleForm.tanshuihuahewu" placeholder="碳水化合物" clearable  :readonly="ro.tanshuihuahewu"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"50%","margin":"0 0 20px 0","display":"inline-block"}' v-else class="input" label="碳水化合物" prop="tanshuihuahewu">
					<el-input v-model="ruleForm.tanshuihuahewu" placeholder="碳水化合物" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"50%","margin":"0 0 20px 0","display":"inline-block"}' class="input" v-if="type!='info'"  label="缺乏" prop="quefa">
					<el-input v-model="ruleForm.quefa" placeholder="缺乏" clearable  :readonly="ro.quefa"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"50%","margin":"0 0 20px 0","display":"inline-block"}' v-else class="input" label="缺乏" prop="quefa">
					<el-input v-model="ruleForm.quefa" placeholder="缺乏" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"50%","margin":"0 0 20px 0","display":"inline-block"}' class="input" v-if="type!='info'"  label="减少" prop="jianshao">
					<el-input v-model="ruleForm.jianshao" placeholder="减少" clearable  :readonly="ro.jianshao"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"50%","margin":"0 0 20px 0","display":"inline-block"}' v-else class="input" label="减少" prop="jianshao">
					<el-input v-model="ruleForm.jianshao" placeholder="减少" readonly></el-input>
				</el-form-item>
			</template>
			<el-form-item :style='{"padding":"0","margin":"0"}' class="btn">
				<el-button :style='{"border":"0","cursor":"pointer","padding":"0","margin":"0 20px 0 0","outline":"none","color":"rgba(255, 255, 255, 1)","borderRadius":"4px","background":"rgba(160, 190, 220, 1)","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}'  v-if="type!='info'" type="primary" class="btn-success" @click="onSubmit">提交</el-button>
				<el-button :style='{"border":"1px solid rgba(160, 190, 220, 1)","cursor":"pointer","padding":"0","margin":"0","outline":"none","color":"rgba(160, 190, 220, 1)","borderRadius":"4px","background":"rgba(255, 255, 255, 1)","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}' v-if="type!='info'" class="btn-close" @click="back()">取消</el-button>
				<el-button :style='{"border":"1px solid rgba(160, 190, 220, 1)","cursor":"pointer","padding":"0","margin":"0","outline":"none","color":"rgba(160, 190, 220, 1)","borderRadius":"4px","background":"rgba(255, 255, 255, 1)","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}' v-if="type=='info'" class="btn-close" @click="back()">返回</el-button>
			</el-form-item>
		</el-form>
    

  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isPhone, isMobile,isURL,checkIdCard } from "@/utils/validate";
export default {
	data() {
		let self = this
		var validateIdCard = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!checkIdCard(value)) {
				callback(new Error("请输入正确的身份证号码"));
			} else {
				callback();
			}
		};
		var validateUrl = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isURL(value)) {
				callback(new Error("请输入正确的URL地址"));
			} else {
				callback();
			}
		};
		var validateMobile = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isMobile(value)) {
				callback(new Error("请输入正确的手机号码"));
			} else {
				callback();
			}
		};
		var validatePhone = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isPhone(value)) {
				callback(new Error("请输入正确的电话号码"));
			} else {
				callback();
			}
		};
		var validateEmail = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isEmail(value)) {
				callback(new Error("请输入正确的邮箱地址"));
			} else {
				callback();
			}
		};
		var validateNumber = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isNumber(value)) {
				callback(new Error("请输入数字"));
			} else {
				callback();
			}
		};
		var validateIntNumber = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isIntNumer(value)) {
				callback(new Error("请输入整数"));
			} else {
				callback();
			}
		};
		return {
			id: '',
			type: '',
			
			
			ro:{
				yonghuzhanghao : false,
				yonghuxingming : false,
				fenxitupian : false,
				jilushijian : false,
				fenxishijian : false,
				dangrisheru : false,
				haikesheru : false,
				zhifang : false,
				danbaizhi : false,
				tanshuihuahewu : false,
				quefa : false,
				jianshao : false,
			},
			
			
			ruleForm: {
				yonghuzhanghao: '',
				yonghuxingming: '',
				fenxitupian: '',
				jilushijian: '',
				fenxishijian: '',
				dangrisheru: '',
				haikesheru: '',
				zhifang: '',
				danbaizhi: '',
				tanshuihuahewu: '',
				quefa: '',
				jianshao: '',
			},
		
			
			rules: {
				yonghuzhanghao: [
				],
				yonghuxingming: [
				],
				fenxitupian: [
				],
				jilushijian: [
				],
				fenxishijian: [
				],
				dangrisheru: [
				],
				haikesheru: [
				],
				zhifang: [
				],
				danbaizhi: [
				],
				tanshuihuahewu: [
				],
				quefa: [
				],
				jianshao: [
				],
			}
		};
	},
	props: ["parent"],
	computed: {



	},
    components: {
    },
	created() {
		this.ruleForm.fenxishijian = this.getCurDate()
	},
	methods: {
		
		// 下载
		download(file){
			window.open(`${file}`)
		},
		// 初始化
		init(id,type) {
			if (id) {
				this.id = id;
				this.type = type;
			}
			if(this.type=='info'||this.type=='else'){
				this.info(id);
			}else if(this.type=='logistics'){
				this.logistics=false;
				this.info(id);
			}else if(this.type=='cross'){
				var obj = this.$storage.getObj('crossObj');
				for (var o in obj){
						if(o=='yonghuzhanghao'){
							this.ruleForm.yonghuzhanghao = obj[o];
							this.ro.yonghuzhanghao = true;
							continue;
						}
						if(o=='yonghuxingming'){
							this.ruleForm.yonghuxingming = obj[o];
							this.ro.yonghuxingming = true;
							continue;
						}
						if(o=='fenxitupian'){
							this.ruleForm.fenxitupian = obj[o];
							this.ro.fenxitupian = true;
							continue;
						}
						if(o=='jilushijian'){
							this.ruleForm.jilushijian = obj[o];
							this.ro.jilushijian = true;
							continue;
						}
						if(o=='fenxishijian'){
							this.ruleForm.fenxishijian = obj[o];
							this.ro.fenxishijian = true;
							continue;
						}
						if(o=='dangrisheru'){
							this.ruleForm.dangrisheru = obj[o];
							this.ro.dangrisheru = true;
							continue;
						}
						if(o=='haikesheru'){
							this.ruleForm.haikesheru = obj[o];
							this.ro.haikesheru = true;
							continue;
						}
						if(o=='zhifang'){
							this.ruleForm.zhifang = obj[o];
							this.ro.zhifang = true;
							continue;
						}
						if(o=='danbaizhi'){
							this.ruleForm.danbaizhi = obj[o];
							this.ro.danbaizhi = true;
							continue;
						}
						if(o=='tanshuihuahewu'){
							this.ruleForm.tanshuihuahewu = obj[o];
							this.ro.tanshuihuahewu = true;
							continue;
						}
						if(o=='quefa'){
							this.ruleForm.quefa = obj[o];
							this.ro.quefa = true;
							continue;
						}
						if(o=='jianshao'){
							this.ruleForm.jianshao = obj[o];
							this.ro.jianshao = true;
							continue;
						}
				}
				












			}
			
			
			// 获取用户信息
			this.$http({
				url: `${this.$storage.get('sessionTable')}/session`,
				method: "get"
			}).then(({ data }) => {
				if (data && data.code === 0) {
					
					var json = data.data;
				} else {
					this.$message.error(data.msg);
				}
			});
			
			
		},
    // 多级联动参数

    info(id) {
      this.$http({
        url: `yinshijianyi/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
        this.ruleForm = data.data;
        //解决前台上传图片后台不显示的问题
        let reg=new RegExp('../../../upload','g')//g代表全部
        } else {
          this.$message.error(data.msg);
        }
      });
    },


    // 提交
    onSubmit() {






	if(this.ruleForm.fenxitupian!=null) {
		this.ruleForm.fenxitupian = this.ruleForm.fenxitupian.replace(new RegExp(this.$base.url,"g"),"");
	}



















var objcross = this.$storage.getObj('crossObj');

      //更新跨表属性
       var crossuserid;
       var crossrefid;
       var crossoptnum;
       if(this.type=='cross'){
                var statusColumnName = this.$storage.get('statusColumnName');
                var statusColumnValue = this.$storage.get('statusColumnValue');
                if(statusColumnName!='') {
                        var obj = this.$storage.getObj('crossObj');
                       if(statusColumnName && !statusColumnName.startsWith("[")) {
                               for (var o in obj){
                                 if(o==statusColumnName){
                                   obj[o] = statusColumnValue;
                                 }
                               }
                               var table = this.$storage.get('crossTable');
                             this.$http({
                                 url: `${table}/update`,
                                 method: "post",
                                 data: obj
                               }).then(({ data }) => {});
                       } else {
                               crossuserid=this.$storage.get('userid');
                               crossrefid=obj['id'];
                               crossoptnum=this.$storage.get('statusColumnName');
                               crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
                        }
                }
        }
       this.$refs["ruleForm"].validate(valid => {
         if (valid) {
		 if(crossrefid && crossuserid) {
			 this.ruleForm.crossuserid = crossuserid;
			 this.ruleForm.crossrefid = crossrefid;
			let params = { 
				page: 1, 
				limit: 10, 
				crossuserid:this.ruleForm.crossuserid,
				crossrefid:this.ruleForm.crossrefid,
			} 
			this.$http({ 
				url: "yinshijianyi/page", 
				method: "get", 
				params: params 
			}).then(({ 
				data 
			}) => { 
				if (data && data.code === 0) { 
				       if(data.data.total>=crossoptnum) {
					     this.$message.error(this.$storage.get('tips'));
					       return false;
				       } else {
					 this.$http({
					   url: `yinshijianyi/${!this.ruleForm.id ? "save" : "update"}`,
					   method: "post",
					   data: this.ruleForm
					 }).then(({ data }) => {
					   if (data && data.code === 0) {
					     this.$message({
					       message: "操作成功",
					       type: "success",
					       duration: 1500,
					       onClose: () => {
						 this.parent.showFlag = true;
						 this.parent.addOrUpdateFlag = false;
						 this.parent.yinshijianyiCrossAddOrUpdateFlag = false;
						 this.parent.search();
						 this.parent.contentStyleChange();
					       }
					     });
					   } else {
					     this.$message.error(data.msg);
					   }
					 });

				       }
				} else { 
				} 
			});
		 } else {
			 this.$http({
			   url: `yinshijianyi/${!this.ruleForm.id ? "save" : "update"}`,
			   method: "post",
			   data: this.ruleForm
			 }).then(({ data }) => {
			   if (data && data.code === 0) {
			     this.$message({
			       message: "操作成功",
			       type: "success",
			       duration: 1500,
			       onClose: () => {
				 this.parent.showFlag = true;
				 this.parent.addOrUpdateFlag = false;
				 this.parent.yinshijianyiCrossAddOrUpdateFlag = false;
				 this.parent.search();
				 this.parent.contentStyleChange();
			       }
			     });
			   } else {
			     this.$message.error(data.msg);
			   }
			 });
		 }
         }
       });
    },
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    // 返回
    back() {
      this.parent.showFlag = true;
      this.parent.addOrUpdateFlag = false;
      this.parent.yinshijianyiCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
    fenxitupianUploadChange(fileUrls) {
	    this.ruleForm.fenxitupian = fileUrls;
    },
  }
};
</script>
<style lang="scss" scoped>
	.amap-wrapper {
		width: 100%;
		height: 500px;
	}
	
	.search-box {
		position: absolute;
	}
	
	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__label {
	  	  padding: 0 10px 0 0;
	  	  color: #333;
	  	  font-weight: 500;
	  	  width: 140px;
	  	  font-size: 14px;
	  	  line-height: 40px;
	  	  text-align: right;
	  	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
	  margin-left: 140px;
	}
	
	.add-update-preview .el-input /deep/ .el-input__inner {
	  	  border: 2px solid #797979;
	  	  border-radius: 4px;
	  	  padding: 0 12px;
	  	  outline: none;
	  	  color: #797979;
	  	  width: 300px;
	  	  font-size: 14px;
	  	  height: 40px;
	  	}
	
	.add-update-preview .el-select /deep/ .el-input__inner {
	  	  border: 2px solid #797979;
	  	  border-radius: 4px;
	  	  padding: 0 10px;
	  	  outline: none;
	  	  color: #797979;
	  	  width: 200px;
	  	  font-size: 14px;
	  	  height: 40px;
	  	}
	
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
	  	  border: 2px solid #797979;
	  	  border-radius: 4px;
	  	  padding: 0 10px 0 30px;
	  	  outline: none;
	  	  color: #797979;
	  	  width: 200px;
	  	  font-size: 14px;
	  	  height: 40px;
	  	}
	
	.add-update-preview /deep/ .el-upload--picture-card {
		background: transparent;
		border: 0;
		border-radius: 0;
		width: auto;
		height: auto;
		line-height: initial;
		vertical-align: middle;
	}
	
	.add-update-preview /deep/ .upload .upload-img {
	  	  border: 2px dashed #797979;
	  	  cursor: pointer;
	  	  border-radius: 6px;
	  	  color: #797979;
	  	  width: 150px;
	  	  font-size: 32px;
	  	  line-height: 150px;
	  	  text-align: center;
	  	  height: 150px;
	  	}
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
	  	  border: 2px dashed #797979;
	  	  cursor: pointer;
	  	  border-radius: 6px;
	  	  color: #797979;
	  	  width: 150px;
	  	  font-size: 32px;
	  	  line-height: 150px;
	  	  text-align: center;
	  	  height: 150px;
	  	}
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
	  	  border: 2px dashed #797979;
	  	  cursor: pointer;
	  	  border-radius: 6px;
	  	  color: #797979;
	  	  width: 150px;
	  	  font-size: 32px;
	  	  line-height: 150px;
	  	  text-align: center;
	  	  height: 150px;
	  	}
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
	  	  border: 2px solid #797979;
	  	  border-radius: 4px;
	  	  padding: 12px;
	  	  outline: none;
	  	  color: #797979;
	  	  width: 400px;
	  	  font-size: 14px;
	  	  height: 120px;
	  	}
</style>
