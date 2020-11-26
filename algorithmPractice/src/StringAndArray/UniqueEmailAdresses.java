package StringAndArray;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAdresses {

	public static void main(String[] args) {
		String[] emails = {"test.email+alex@leetcode.com",
		           "test.e.mail+bob.cathy@leetcode.com",
		           "testemail+david@lee.tcode.com"};
		//target: 2
		System.out.println(numUniqueEmails(emails));
	}//main() END
	
	
	private static int numUniqueEmails(String[] emails) {
		Set<String> processedEmails = new HashSet<String>();
		
		for(String email : emails) {
			String[] emailAt = email.split("\\@");
			String[] emailPlus = emailAt[0].split("\\+");
			String[] emailDot = emailPlus[0].split("\\.");
			
			StringBuilder emailID = new StringBuilder();
			for(String emailParts : emailDot) {
				emailID.append(emailParts);
			}//inner for END
			emailID.append("@"+emailAt[1]);
			
			processedEmails.add(emailID.toString());
		}//for END
		
		return processedEmails.size();
	}//numUniqueEmails() END
	
	
}//UniqueEmailAdresses END
