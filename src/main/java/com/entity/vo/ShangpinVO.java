package com.entity.vo;

import com.entity.ShangpinEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 商品
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shangpin")
public class ShangpinVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 商家
     */

    @TableField(value = "shangjia_id")
    private Integer shangjiaId;


    /**
     * 商品名称
     */

    @TableField(value = "shangpin_name")
    private String shangpinName;


    /**
     * 商品编号
     */

    @TableField(value = "shangpin_uuid_number")
    private String shangpinUuidNumber;


    /**
     * 商品照片
     */

    @TableField(value = "shangpin_photo")
    private String shangpinPhoto;


    /**
     * 商品类型
     */

    @TableField(value = "shangpin_types")
    private Integer shangpinTypes;


    /**
     * 商品库存
     */

    @TableField(value = "shangpin_kucun_number")
    private Integer shangpinKucunNumber;


    /**
     * 商品原价
     */

    @TableField(value = "shangpin_old_money")
    private Double shangpinOldMoney;


    /**
     * 现价
     */

    @TableField(value = "shangpin_new_money")
    private Double shangpinNewMoney;


    /**
     * 商品热度
     */

    @TableField(value = "shangpin_clicknum")
    private Integer shangpinClicknum;


    /**
     * 赞
     */

    @TableField(value = "zan_number")
    private Integer zanNumber;


    /**
     * 踩
     */

    @TableField(value = "cai_number")
    private Integer caiNumber;


    /**
     * 商品介绍
     */

    @TableField(value = "shangpin_content")
    private String shangpinContent;


    /**
     * 是否上架
     */

    @TableField(value = "shangxia_types")
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */

    @TableField(value = "shangpin_delete")
    private Integer shangpinDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：商家
	 */
    public Integer getShangjiaId() {
        return shangjiaId;
    }


    /**
	 * 获取：商家
	 */

    public void setShangjiaId(Integer shangjiaId) {
        this.shangjiaId = shangjiaId;
    }
    /**
	 * 设置：商品名称
	 */
    public String getShangpinName() {
        return shangpinName;
    }


    /**
	 * 获取：商品名称
	 */

    public void setShangpinName(String shangpinName) {
        this.shangpinName = shangpinName;
    }
    /**
	 * 设置：商品编号
	 */
    public String getShangpinUuidNumber() {
        return shangpinUuidNumber;
    }


    /**
	 * 获取：商品编号
	 */

    public void setShangpinUuidNumber(String shangpinUuidNumber) {
        this.shangpinUuidNumber = shangpinUuidNumber;
    }
    /**
	 * 设置：商品照片
	 */
    public String getShangpinPhoto() {
        return shangpinPhoto;
    }


    /**
	 * 获取：商品照片
	 */

    public void setShangpinPhoto(String shangpinPhoto) {
        this.shangpinPhoto = shangpinPhoto;
    }
    /**
	 * 设置：商品类型
	 */
    public Integer getShangpinTypes() {
        return shangpinTypes;
    }


    /**
	 * 获取：商品类型
	 */

    public void setShangpinTypes(Integer shangpinTypes) {
        this.shangpinTypes = shangpinTypes;
    }
    /**
	 * 设置：商品库存
	 */
    public Integer getShangpinKucunNumber() {
        return shangpinKucunNumber;
    }


    /**
	 * 获取：商品库存
	 */

    public void setShangpinKucunNumber(Integer shangpinKucunNumber) {
        this.shangpinKucunNumber = shangpinKucunNumber;
    }
    /**
	 * 设置：商品原价
	 */
    public Double getShangpinOldMoney() {
        return shangpinOldMoney;
    }


    /**
	 * 获取：商品原价
	 */

    public void setShangpinOldMoney(Double shangpinOldMoney) {
        this.shangpinOldMoney = shangpinOldMoney;
    }
    /**
	 * 设置：现价
	 */
    public Double getShangpinNewMoney() {
        return shangpinNewMoney;
    }


    /**
	 * 获取：现价
	 */

    public void setShangpinNewMoney(Double shangpinNewMoney) {
        this.shangpinNewMoney = shangpinNewMoney;
    }
    /**
	 * 设置：商品热度
	 */
    public Integer getShangpinClicknum() {
        return shangpinClicknum;
    }


    /**
	 * 获取：商品热度
	 */

    public void setShangpinClicknum(Integer shangpinClicknum) {
        this.shangpinClicknum = shangpinClicknum;
    }
    /**
	 * 设置：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }


    /**
	 * 获取：赞
	 */

    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 设置：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }


    /**
	 * 获取：踩
	 */

    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 设置：商品介绍
	 */
    public String getShangpinContent() {
        return shangpinContent;
    }


    /**
	 * 获取：商品介绍
	 */

    public void setShangpinContent(String shangpinContent) {
        this.shangpinContent = shangpinContent;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getShangpinDelete() {
        return shangpinDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setShangpinDelete(Integer shangpinDelete) {
        this.shangpinDelete = shangpinDelete;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
