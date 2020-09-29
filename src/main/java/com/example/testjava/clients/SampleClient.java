package com.example.testjava.clients;

import java.net.URI;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import com.example.testjava.models.SampleClientResponse;
import com.example.testjava.models.SampleClientResponse2;
import com.example.testjava.models.SampleClientSend;

public class SampleClient {

	public SampleClientResponse responseForGet() {
		// A simple HTTP Request & Response Service.「https://httpbin.org」を使用
		// 　URLに対してパラメータを追加したリクエストを送信すると、
		// 　クライアントのIPアドレスやユーザーエージェント、送信されたパラメータなどの情報がJSONデータとして返してくれる
		// HTTP Methods Testing different HTTP verbsのGETにリクエストする

		String code = "001";
		String name = "sample";
		SampleClientResponse receiveJson = null;

		try {
			URI uri = new URI("https://httpbin.org/get?code="+ code +"&name="+ name);
			// クライアント作成
			RestTemplate client = new RestTemplate(new SimpleClientHttpRequestFactory());

			// リクエスト作成 GET
			RequestEntity<?> req = new RequestEntity<>(HttpMethod.GET, uri);

			//リクエスト実行
			ResponseEntity<SampleClientResponse> res = client.exchange(req, SampleClientResponse.class);// （第二引数は受信したボディの変換先の型）

			// HTTPステータスコード判定
			if (res.getStatusCodeValue() == HttpStatus.OK.value()) {
				// 正常終了時（HTTPステータスコード200の場合）
				// レスポンスのbody取得
				receiveJson = res.getBody();
			} else {
				System.out.println("error");
				System.out.println(res.getStatusCodeValue());
				throw new Exception("httpステータスコードが"+ res.getStatusCodeValue() +"です");
			}
		} catch (Exception e) {
			System.out.printf(e.getMessage());
		}
		return receiveJson;
	}


	public SampleClientResponse2 responseForPost() {
		// A simple HTTP Request & Response Service.「https://httpbin.org」を使用
		// 　URLに対してパラメータを追加したリクエストを送信すると、
		// 　クライアントのIPアドレスやユーザーエージェント、送信されたパラメータなどの情報がJSONデータとして返してくれる
		// HTTP Methods Testing different HTTP verbsのPOSTにJSONリクエストする（idとname）

		SampleClientResponse2 receiveJson = null;

		try {
			URI uri = new URI("https://httpbin.org/post");
			// クライアント作成
			RestTemplate client = new RestTemplate(new SimpleClientHttpRequestFactory());

			//ヘッダ作成
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON_UTF8);// Jsonのリクエストの際、Json系のヘッダを指定

			// リクエスト作成 POST
			SampleClientSend sendJson = new SampleClientSend();
			sendJson.setId("1");
			sendJson.setName("sendName");
			RequestEntity<?> req = new RequestEntity<>(sendJson, headers, HttpMethod.POST, uri);

			//リクエスト実行
			ResponseEntity<SampleClientResponse2> res = client.exchange(req, SampleClientResponse2.class);// （第二引数は受信したボディの変換先の型）

			// HTTPステータスコード判定
			if (res.getStatusCodeValue() == HttpStatus.OK.value()) {
				// 正常終了時（HTTPステータスコード200の場合）
				// レスポンスのbody取得
				receiveJson = res.getBody();
			} else {
				System.out.println("error");
				System.out.println(res.getStatusCodeValue());
				throw new Exception("httpステータスコードが"+ res.getStatusCodeValue() +"です");
			}
		} catch (Exception e) {
			System.out.printf(e.getMessage());
		}
		return receiveJson;
	}
}