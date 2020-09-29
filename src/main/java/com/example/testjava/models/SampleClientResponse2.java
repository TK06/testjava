package com.example.testjava.models;

import java.util.Map;

public class SampleClientResponse2 {
	// A simple HTTP Request & Response Service.「https://httpbin.org」を使用
	// 　URLに対してパラメータを追加したリクエストを送信すると、
	// 　クライアントのIPアドレスやユーザーエージェント、送信されたパラメータなどの情報がJSONデータとして返してくれる
	// HTTP Methods Testing different HTTP verbsのPOSTのResponse bodyに合わせた形

	private Map<String, String> args;
	private String data;
	private Map<String, String> files;
	private Map<String, String> form;
	private Map<String, String> headers;
	private Map<String, String> json;
	private String origin;
	private String url;

	// args（値のgetter/setter）
	public Map<String, String> getArgs() {
        return args;
    }
    public void setArgs(Map<String, String> args) {
        this.args = args;
    }

	// data（値のgetter/setter）
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}

	// files（値のgetter/setter）
	public Map<String, String> getFiles() {
        return files;
    }
    public void setFiles(Map<String, String> files) {
        this.files = files;
    }

	// files（値のgetter/setter）
	public Map<String, String> getForm() {
        return form;
    }
    public void setForm(Map<String, String> form) {
        this.form = form;
    }

	// headers（値のgetter/setter）
	public Map<String, String> getHeaders() {
        return headers;
    }
    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

	// json（値のgetter/setter）
	public Map<String, String> getJson() {
		return json;
	}
	public void setJson(Map<String, String> json) {
		this.json = json;
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