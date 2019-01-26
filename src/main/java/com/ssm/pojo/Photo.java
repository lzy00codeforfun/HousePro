package com.ssm.pojo;

public class Photo {
    public Photo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Photo(Integer photo_id, Integer house_id, String url, String tag) {
		super();
		this.photo_id = photo_id;
		this.house_id = house_id;
		this.url = url;
		this.tag = tag;
	}

	private Integer photo_id;

    private Integer house_id;

    private String url;

    private String tag;

    public Integer getPhoto_id() {
        return photo_id;
    }

    public void setPhoto_id(Integer photo_id) {
        this.photo_id = photo_id;
    }

    public Integer getHouse_id() {
        return house_id;
    }

    public void setHouse_id(Integer house_id) {
        this.house_id = house_id;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

	@Override
	public String toString() {
		return "Photo [photo_id=" + photo_id + ", house_id=" + house_id + ", url=" + url + ", tag=" + tag + "]";
	}
	public String toJSONString() {
		return "{photo_id:" + photo_id + ", house_id:" + house_id + ", url:" + url + ", tag:" + tag + "}";
	}
}