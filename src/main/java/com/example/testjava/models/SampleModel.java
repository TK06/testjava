package com.example.testjava.models;


public class SampleModel {

	// メッセージ番号
	private String masseageNo;
	// メッセージ
	private String messeage;

	/**
	 * メッセージ番号取得
	 * @return
	 */
	public String getMasseageNo() {
		return masseageNo;
	}
	/**
	 * メッセージ番号設定
	 * @param messeage メッセージ文字列
	 */
	public void setMasseageNo(String masseageNo) {
		this.masseageNo = masseageNo;
	}

	/**
	 * メッセージ取得
	 * @return
	 */
	public String getMesseage() {
		return messeage;
	}
	/**
	 * メッセージ設定
	 * @param messeage メッセージ文字列
	 */
	public void setMesseage(String messeage) {
		this.messeage = messeage;
	}
}