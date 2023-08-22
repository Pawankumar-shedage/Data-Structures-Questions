package Strings;

import java.util.Scanner;

public class UsernameCreater {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String email = sc.next();
		
		String username = "";
		
		int i=0; 
		while(i<email.length())
		{
			if(email.charAt(i) == '@')
			{
				break; //get out of the loop;
			}
			else {
				username += email.charAt(i);
			}
			i++;
		}
		
		System.out.println("Username :"+username);
		
		String domain = "";
		
		for(int k=0; k<email.length(); k++)
		{
			//extractin substring:
			if(email.charAt(k) == '@')
				domain += email.substring(i);
		}
		
		System.out.println("Domain :" + domain);
		
		sc.close();
	}
}
