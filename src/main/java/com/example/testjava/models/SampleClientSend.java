package com.example.testjava.models;

public class SampleClientSend {
	// A simple HTTP Request & Response Service.「https://httpbin.org」を使用
	// 　URLに対してパラメータを追加したリクエストを送信すると、
	// 　クライアントのIPアドレスやユーザーエージェント、送信されたパラメータなどの情報がJSONデータとして返してくれる
	// HTTP Methods Testing different HTTP verbsのPOSTにリクエストする（idとname）

	private String id;
	private String name;

	// id（値のgetter/setter）
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	// name（値のgetter/setter）
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}