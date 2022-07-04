package main.java.logic;

import java.util.Collections;
import java.util.List;

import com.accelaero.aeropay.core.constants.NumberConstants;
import com.accelaero.aeropay.core.exception.ErrorCodes;
import com.accelaero.aeropay.core.exception.ServiceRuntimeException;
import com.accelaero.aeropay.core.logic.refund.rules.base.RegexMatcher;
import com.accelaero.aeropay.core.systemwide.Empty;
import com.accelaero.aeropay.core.v2.dto.authorize.CreditCardPaymentAuthorizeRequestDTO;
import com.accelaero.aeropay.core.v2.dto.common.CashpaymentPriceDetailsDTO;
import com.accelaero.aeropay.core.v2.dto.common.PaxDetailsDTO;
import com.accelaero.aeropay.core.v2.dto.common.PaxRecordDTO;
import com.accelaero.aeropay.core.v2.enums.PaxType;

public class demo {
	public static void main(String args[]) {
		System.out.println("working...");
		final CreditCardPaymentAuthorizeRequestDTO dto = new CreditCardPaymentAuthorizeRequestDTO();
		dto.setAliasName("reqDto.getAliasName()");
        CashpaymentPriceDetailsDTO priceDetails = new CashpaymentPriceDetailsDTO();
        priceDetails.setPaymentCurrency("LKR");
        dto.setPriceDetails(priceDetails);
        
        final PaxDetailsDTO paxDetailsDTO = new PaxDetailsDTO();
        paxDetailsDTO.setPaxType(PaxType.ADT);
        paxDetailsDTO.setPaxRPH("paxRPH");
        paxDetailsDTO.setAccompaniedAdultRPH("accompaniedAdultRPH");
        paxDetailsDTO.setLoyaltyId("loyaltyId");
        
        final PaxRecordDTO paxRecord = new PaxRecordDTO();
        paxRecord.setPnr("pnr");
        paxRecord.setPaxName("paxName");
        paxRecord.setPaxNationality("");
        paxDetailsDTO.setPaxRecord(paxRecord);
        
        dto.setPaxDetails(Collections.singletonList(paxDetailsDTO));
        		
        String xxx = setUniqueTransactionIDforTicket("1000", "100000000000000000000000000000000000");
        System.out.println(xxx);

	}


	public static String setUniqueTransactionIDforTicket(String referenceId, String documentNumber) {
		String uniqueTransactionIDforTicket = referenceId + documentNumber;
		int uniqueTransactionIDforTicketLimit = 36;
		if (uniqueTransactionIDforTicket.length() > uniqueTransactionIDforTicketLimit) {
			uniqueTransactionIDforTicket = referenceId
					+ documentNumber.substring(uniqueTransactionIDforTicket.length() - uniqueTransactionIDforTicketLimit);
			System.out.println("========"+uniqueTransactionIDforTicket);
		}
		return uniqueTransactionIDforTicket;
	}
}




