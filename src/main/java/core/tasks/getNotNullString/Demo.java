package main.java.core.tasks.getNotNullString;

public class Demo {
	public static void main(String args[]) {

		ContactInfo contactInfo = new ContactInfo();
		IpgRequestDTO ipgRequestDTO = new IpgRequestDTO();
		
		contactInfo.setMobileNo("mobileNo");
		contactInfo.setPhoneNo("phoneNo");
		contactInfo.setMobileCountry("mobileCountry");
		contactInfo.setMobileArea("mobileArea");
		contactInfo.setPhoneCountry("phoneCountry");
		contactInfo.setPhoneArea("phoneArea");

		if (contactInfo.getMobileNo() != null && contactInfo.getPhoneNo() != null) {

			ipgRequestDTO.setContactMobileNumber(StringUtil.getNotNullString(
					contactInfo.getMobileCountry() + contactInfo.getMobileArea() + contactInfo.getMobileNo()));

			ipgRequestDTO.setContactPhoneNumber(StringUtil
					.getNotNullString(
							contactInfo.getPhoneCountry() + contactInfo.getPhoneArea() + contactInfo.getPhoneNo()));
			
			System.out.println("contactMobileNumber - "+ipgRequestDTO.contactMobileNumber);
			System.out.println("contactPhoneNumber - "+ipgRequestDTO.contactPhoneNumber);
		}
	}

}
