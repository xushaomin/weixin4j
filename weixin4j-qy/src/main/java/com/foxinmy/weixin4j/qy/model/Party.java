package com.foxinmy.weixin4j.qy.model;

import java.io.Serializable;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 部门对象
 * 
 * @className Party
 * @author jy
 * @date 2014年11月18日
 * @since JDK 1.7
 * @see <a
 *      href="http://qydev.weixin.qq.com/wiki/index.php?title=%E7%AE%A1%E7%90%86%E9%83%A8%E9%97%A8">管理部门说明</a>
 */
public class Party implements Serializable {

	private static final long serialVersionUID = -2567893218591084288L;
	/**
	 * 部门ID,指定时必须大于1,不指定时则自动生成.
	 */
	private int id;
	/**
	 * 部门名称。长度限制为1~64个字符
	 */
	private String name;
	/**
	 * 父亲部门id。根部门id为1
	 */
	@JSONField(name = "parentid")
	private int parentId;
	/**
	 * 在父部门中的次序。从1开始，数字越大排序越靠后
	 */
	private int order;

	protected Party() {

	}

	public Party(String name) {
		this.name = name;
	}

	public Party(int id, String name, int parentId) {
		this.id = id;
		this.name = name;
		this.parentId = parentId;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getParentId() {
		return parentId;
	}

	public int getOrder() {
		return order;
	}

	// ---------- setter 应该全部去掉

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "Party [id=" + id + ", name=" + name + ", parentId=" + parentId
				+ ", order=" + order + "]";
	}
}
