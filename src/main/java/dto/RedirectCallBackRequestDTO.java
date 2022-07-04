package main.java.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RedirectCallBackRequestDTO {

    private String paResponse;
    private String referenceId;
    private String md;
    private String gatewayName;
    private String callbackRequest;
    private String payload;
    private String type;
    private String resultCode;
    private String paymentReferenceId;
}
