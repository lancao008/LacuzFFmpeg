package com.lacuz.ffmpeg;

/**
 * 添加特效类
 *
 */

public class VideoSpecialEffects {

	private String picPath;//图片路径
	private int picX;//图片x的位置
	private int picY;//图片y的位置
	private float picWidth;//图片的宽
	private float picHeight;//图片的高
	private boolean isAnimation;//是否是动图

	private String picFilter;//图片滤镜

	public VideoSpecialEffects(String picPath, int picX, int picY, float picWidth, float picHeight, boolean isAnimation) {
		this.picPath = picPath;
		this.picX = picX;
		this.picY = picY;
		this.picWidth = picWidth;
		this.picHeight = picHeight;
		this.isAnimation = isAnimation;
	}

	public String getPicPath() {
		return picPath;
	}

	public int getPicX() {
		return picX;
	}

	public int getPicY() {
		return picY;
	}

	public float getPicWidth() {
		return picWidth;
	}

	public float getPicHeight() {
		return picHeight;
	}

	public boolean isAnimation() {
		return isAnimation;
	}

	public String getPicFilter() {
		return picFilter == null ? "" : (picFilter + ",");
	}

	public void setPicFilter(String picFilter) {
		this.picFilter = picFilter;
	}
}
