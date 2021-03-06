package com.example.domain;

public class UsersVO extends ProductVO{	
	private String id;//아이디
	private String u_id;
	private String pass;//비번
	private String name;//이름
	private String nickname;//닉네임
	private String phone;//핸드폰번호
	private String introduce;//자기소개
	private String addr;//주소
	private String email;//이메일
	private String u_image;//이미지
	private int follow;
	private int follower;
	private int position;
	private int point;
	private int cnt;
	
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getU_id() {
		return u_id;
	}
	public void setU_id(String u_id) {
		this.u_id = u_id;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getU_image() {
		return u_image;
	}
	public void setU_image(String u_image) {
		this.u_image = u_image;
	}
	public int getFollow() {
		return follow;
	}
	public void setFollow(int follow) {
		this.follow = follow;
	}
	@Override
	public String toString() {
		return "UsersVO [id=" + id + ", pass=" + pass + ", name=" + name + ", nickname=" + nickname + ", phone=" + phone
				+ ", introduce=" + introduce + ", addr=" + addr + ", email=" + email + ", u_image=" + u_image
				+ ", follow=" + follow + ", follower=" + follower + ", position=" + position + "]";
	}
	public int getFollower() {
		return follower;
	}
	public void setFollower(int follower) {
		this.follower = follower;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
}
