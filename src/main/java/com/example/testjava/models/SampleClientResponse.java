package com.example.testjava.models;

import java.util.Map;

public class SampleClientResponse {
	// A simple HTTP Request & Response Service.「https://httpbin.org」を使用
	// 　URLに対してパラメータを追加したリクエストを送信すると、
	// 　クライアントのIPアドレスやユーザーエージェント、送信されたパラメータなどの情報がJSONデータとして返してくれる
	// HTTP Methods Testing different HTTP verbsのGETのResponse bodyに合わせた形

	private Map<String, String> args;
	private Map<String, String> headers;
	private String origin;
	private String url;

	// args（値のgetter/setter）
	public Map<String, String> getArgs() {
        return args;
    }
    public void setArgs(Map<String, String> args) {
        this.args = args;
    }

	// headers（値のgetter/setter）
	public Map<String, String> getHeaders() {
        return headers;
    }
    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

	// origin（値のgetter/setter）
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	// url（値のgetter/setter）
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}