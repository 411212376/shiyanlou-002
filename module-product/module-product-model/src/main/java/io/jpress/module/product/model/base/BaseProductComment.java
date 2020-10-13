package io.jpress.module.product.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JPress, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseProductComment<M extends BaseProductComment<M>> extends JbootModel<M> implements IBean {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
	public void setId(java.lang.Long id) {
		set("id", id);
	}

    /**
     * 主键ID
     */
	public java.lang.Long getId() {
		return getLong("id");
	}

    /**
     * 回复的评论ID
     */
	public void setPid(java.lang.Long pid) {
		set("pid", pid);
	}

    /**
     * 回复的评论ID
     */
	public java.lang.Long getPid() {
		return getLong("pid");
	}

    /**
     * 评论的产品ID
     */
	public void setProductId(java.lang.Long productId) {
		set("product_id", productId);
	}

    /**
     * 评论的产品ID
     */
	public java.lang.Long getProductId() {
		return getLong("product_id");
	}

    /**
     * 评论的用户ID
     */
	public void setUserId(java.lang.Long userId) {
		set("user_id", userId);
	}

    /**
     * 评论的用户ID
     */
	public java.lang.Long getUserId() {
		return getLong("user_id");
	}

    /**
     * 评论的作者
     */
	public void setAuthor(java.lang.String author) {
		set("author", author);
	}

    /**
     * 评论的作者
     */
	public java.lang.String getAuthor() {
		return getStr("author");
	}

    /**
     * 评论的内容
     */
	public void setContent(java.lang.String content) {
		set("content", content);
	}

    /**
     * 评论的内容
     */
	public java.lang.String getContent() {
		return getStr("content");
	}

    /**
     * 评论的回复数量
     */
	public void setReplyCount(java.lang.Long replyCount) {
		set("reply_count", replyCount);
	}

    /**
     * 评论的回复数量
     */
	public java.lang.Long getReplyCount() {
		return getLong("reply_count");
	}

    /**
     * 排序编号，常用语置顶等
     */
	public void setOrderNumber(java.lang.Integer orderNumber) {
		set("order_number", orderNumber);
	}

    /**
     * 排序编号，常用语置顶等
     */
	public java.lang.Integer getOrderNumber() {
		return getInt("order_number");
	}

    /**
     * “顶”的数量
     */
	public void setVoteUp(java.lang.Long voteUp) {
		set("vote_up", voteUp);
	}

    /**
     * “顶”的数量
     */
	public java.lang.Long getVoteUp() {
		return getLong("vote_up");
	}

    /**
     * “踩”的数量
     */
	public void setVoteDown(java.lang.Long voteDown) {
		set("vote_down", voteDown);
	}

    /**
     * “踩”的数量
     */
	public java.lang.Long getVoteDown() {
		return getLong("vote_down");
	}

    /**
     * 评论的状态
     */
	public void setStatus(java.lang.Integer status) {
		set("status", status);
	}

    /**
     * 评论的状态
     */
	public java.lang.Integer getStatus() {
		return getInt("status");
	}

    /**
     * 评论的时间
     */
	public void setCreated(java.util.Date created) {
		set("created", created);
	}

    /**
     * 评论的时间
     */
	public java.util.Date getCreated() {
		return get("created");
	}

}