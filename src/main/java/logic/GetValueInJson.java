package main.java.logic;

import com.accelaero.aeropay.core.systemwide.jsonconverter.JSONConverter;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import main.java.dto.RedirectCallBackRequestDTO;
import main.java.dto.RequestDTO;

public class GetValueInJson {
	public static void main(String args[]) {
		
		RequestDTO request = new RequestDTO();
		request.setId("000001");
		request.setName("name");
		request.setDisc("dsc");
    	final RedirectCallBackRequestDTO redirectCallBackRequestDTO = new RedirectCallBackRequestDTO();
		redirectCallBackRequestDTO.setCallbackRequest(JSONConverter.toJson(request));
		
		System.out.println(redirectCallBackRequestDTO.getCallbackRequest());
//		JsonObject jsonObject = new JsonParser().parse(dto.getCallbackRequest()).getAsJsonObject();
		JsonObject jsonObject = new JsonParser().parse(redirectCallBackRequestDTO.getCallbackRequest()).getAsJsonObject();
		System.out.println(">>>>>>>>>id>>>"+jsonObject.get("id").getAsString());
	}
}
