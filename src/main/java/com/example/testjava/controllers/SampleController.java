package com.example.testjava.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.testjava.clients.SampleClient;
import com.example.testjava.models.SampleClientResponse;
import com.example.testjava.models.SampleClientResponse2;
import com.example.testjava.models.SampleModel;


/**
 * JSON や XML などを返す WebAPI 用の Controller（@RestController）
 * @author systemi
 */
@RestController
@RequestMapping("/")
public class SampleController {

//	/**
//	 * READ　 GETメソッド
//	 * 文字列を返す
//	 *   アクセスURL：http://localhost:8080/get/hello
//	 *   curlコマンド：curl -X GET localhost:8080/get/hello
//	 * @return
//	 */
//	@RequestMapping(value="get/hello", method = RequestMethod.GET)
//	public String helloWorld() {
//		return "Hello World!";
//	}

	/**
	 * READ　GETメソッド
	 * JSONを返す
	 *   アクセスURL：http://localhost:8080/get/hellojson
	 *   curlコマンド：curl -X GET localhost:8080/get/hellojson
	 * @return
	 */
	@RequestMapping(value="get/hellojson", method = RequestMethod.GET)
	public SampleModel helloWorldForJson() {
		SampleModel sampleModel = new SampleModel();
		sampleModel.setMasseageNo("001");
		sampleModel.setMesseage("Hello World!");

		// JSON文字列に変換されレスポンスが送られる（SpringBootにはJacksonがデフォルトで内蔵されており、オブジェクトをレスポンスとして返すだけでJSON化される）
		return sampleModel;	// {"masseageNo":"001","messeage":"Hello World!"}
	}

//	/**
//	 * READ　GETメソッド（URLパスパラメータ、URLにクエリーパラメータ）
//	 * JSONを返す
//	 *   アクセスURL：http://localhost:8080/get/hellojson/{メッセージ番号}?masseage=xxxx
//	 *   curlコマンド：curl -X GET localhost:8080/get/hellojson/{メッセージ番号}?masseage=xxxx
//	 *   例：http://localhost:8080/get/hellojson/001?masseage=Hello%20World!
//	 *         Hello World!→URIエスケープ→Hello%20World!
//	 * @return
//	 */
//	@RequestMapping(value="get/hellojson/{masseageNo}", method = RequestMethod.GET)
//	public SampleModel helloWorldForParam(@PathVariable("masseageNo") String masseageNo, @RequestParam(name = "masseage", required=true) String masseage) {
//		SampleModel sampleModel = new SampleModel();
//		sampleModel.setMasseageNo(masseageNo);
//		sampleModel.setMesseage(masseage);
//		// JSON文字列に変換されレスポンスが送られる（SpringBootにはJacksonがデフォルトで内蔵されており、オブジェクトをレスポンスとして返すだけでJSON化される）
//		return sampleModel;	// http://localhost:8080/get/hellojson/001?masseage=Hello%20World!　→　{"masseageNo":"001","messeage":"Hello World!"}
//	}
//
//	/**
//	 * HTTPステータスやレスポンスヘッダを指定する（戻り値をResponseEntityにする）
//	 *   アクセスURL：http://localhost:8080/get/responseEntity
//	 *   curlコマンド：curl -X GET localhost:8080/get/responseEntity
//	 * @return
//	 */
//	@RequestMapping("get/responseEntity")
//	public ResponseEntity<SampleModel> responseEntity() {
//		HttpHeaders headers = new HttpHeaders();
//		headers.add("Sample", "Sample-Value");
//		HttpStatus status = HttpStatus.OK;
//
//		SampleModel sampleModel = new SampleModel();
//		sampleModel.setMasseageNo("001");
//		sampleModel.setMesseage("Hello World!");
//
//		return new ResponseEntity<>(sampleModel, headers, status);
//	}
//
	/**
	 * クライアント（Get）からのレスポンス結果を取得
	 * JSONを返す
	 *   アクセスURL：http://localhost:8080/get/sampleclient
	 *   curlコマンド：curl -X GET localhost:8080/get/sampleclient
	 * @return
	 */
	@RequestMapping(value="get/sampleclient", method = RequestMethod.GET)
	public SampleClientResponse clientForGet() {
		SampleClient sampleClient = new SampleClient();
		SampleClientResponse result = sampleClient.responseForGet();

		return result;
	}

	/**
	 * クライアント（Post）からのレスポンス結果を取得
	 * JSONを返す
	 *   アクセスURL：http://localhost:8080/get/sampleclient2
	 *   curlコマンド：curl -X GET localhost:8080/get/sampleclient2
	 * @return
	 */
	@RequestMapping(value="get/sampleclient2", method = RequestMethod.GET)
	public SampleClientResponse2 clientForPost() {
		SampleClient sampleClient = new SampleClient();
		SampleClientResponse2 result = sampleClient.responseForPost();

		return result;
	}
}