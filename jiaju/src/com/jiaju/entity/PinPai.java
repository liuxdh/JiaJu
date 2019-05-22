package com.jiaju.entity;

public class PinPai {
 private int pinaiId;
 private String pinpai;
public int getPinaiId() {
	return pinaiId;
}
public void setPinaiId(int pinaiId) {
	this.pinaiId = pinaiId;
}
public String getPinpai() {
	return pinpai;
}
public void setPinpai(String pinpai) {
	this.pinpai = pinpai;
}
public PinPai(int pinaiId, String pinpai) {
	super();
	this.pinaiId = pinaiId;
	this.pinpai = pinpai;
}
public PinPai() {
	super();
}
@Override
public String toString() {
	return "pinpai [pinaiId=" + pinaiId + ", pinpai=" + pinpai + "]";
}
 
}
