package br.com.alura.loja.http;

import java.util.Map;

//ADAPTER
public interface HttpAdapter {

	void post(String url, Map<String, Object> dados);

}
