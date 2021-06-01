

import java.awt.*;
import java.awt.event.*;

public class InterfaceAccount {
	
	static boolean checkNumber(String passWord) {
	    char ch;
	    boolean numberFlag = false;
	    for(int i=0;i < passWord.trim().length();i++) {
	    	// checks every character
	        ch = passWord.trim().charAt(i);
	        if( Character.isDigit(ch)) { numberFlag = true; }
	        // if the character is a digit, the system allows the string to pass
	        if (numberFlag)
				return true;
	        // stops the loop when the requirement is met
	        // or keeps going and returns an error message specifying that the requirement is not met
	    }
	    return false;
	}
	static boolean checkLowerCase(String passWord) {
		char ch;
		boolean lowerCaseFlag = false;
		for (int i=0; i < passWord.trim().length(); i++) {
			ch = passWord.trim().charAt(i);
			if (Character.isLowerCase(ch)) { lowerCaseFlag = true; }
			// if the character is a lower case letter, the system allows the string to pass
			if (lowerCaseFlag)
				return true;
		}
		return false;
	}
	static boolean checkUpperCase(String passWord) {
		char ch;
		boolean upperCaseFlag = false;
		for (int i=0; i < passWord.trim().length(); i++) {
			ch = passWord.trim().charAt(i);
			if (Character.isUpperCase(ch)) { upperCaseFlag = true; }
			// if the character is a upper case letter, the system allows the string to pass
			if (upperCaseFlag)
				return true;
		}
		return false; 
	}
	
	static boolean checkAlpha(String passWord) {
		char ch;
		boolean alphaFlag = false;
		for (int i=0; i < passWord.trim().length(); i++) {
			ch = passWord.trim().charAt(i);
			if (!Character.isLetterOrDigit(ch)) { alphaFlag = true; }
			// if the character is a non-alphanumeric character, the system allows the string to pass
			if (alphaFlag)
				return true;
		}
		return false; 
	}
	
	InterfaceAccount() {
		String NotSaved = "Your username and password aren't saved.";
		String Saved = "Your username and password are saved below.";
		
		Frame fm = new Frame();
		fm.setTitle("Account Register");
		fm.setBackground(Color.lightGray);
		
		Label lWELCOME = new Label("Welcome to the Account Register App.");
		lWELCOME.setBounds(30,50,1000,30);
		
		Label lASKname = new Label("Please Enter the username you would like to use:");
		lASKname.setBounds(30,85,1000,25);
		final TextField tfASKname = new TextField();
		tfASKname.setBounds(30,110,300,30);
		
		Label lASKpass = new Label("Please Enter the password you would like to use:");
		lASKpass.setBounds(30,160,1000,25);
		final TextField tfASKpass = new TextField();
		tfASKpass.setBounds(30,185,300,30);
		
		Button bsubmit = new Button("SUBMIT");
		bsubmit.setBounds(30,225,50,30);
		Label lclicksubmit = new Label("<<< Click this button to submit your answers.");
		lclicksubmit.setBounds(80,225,1000,30);
		
		Label lSavedNotSaved = new Label(NotSaved);
		lSavedNotSaved.setBounds(30,365,1000,30);
		final TextField tfSHOWusername = new TextField();
		tfSHOWusername.setBounds(30,390,300,30);
		final TextField tfSHOWpassword = new TextField();
		tfSHOWpassword.setBounds(30,420,300,30);
		
		Button bclear = new Button("CLEAR");
		bclear.setBounds(30,480,50,30);
		Label lclickclear = new Label("<<< Click this button to clear results and try again.");
		lclickclear.setBounds(80,480,1000,30);
		
		bsubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName = (tfASKname.getText()).trim();
				String passWord = (tfASKpass.getText()).trim();
				char usernameDigit = userName.charAt(0);
				
				if (!tfASKname.getText().equals(tfSHOWusername.getText()) || !tfASKpass.getText().equals(tfSHOWpassword.getText()) ) {
					if (Character.isDigit(usernameDigit) == false) {
						int passwordLength = passWord.length();
						
						if ( passWord.isEmpty() == false && passwordLength >= 8 && checkLowerCase(passWord) == true && checkUpperCase(passWord) == true && checkNumber(passWord) == true && checkAlpha(passWord) == true && !passWord.contains(userName) )  {
							lSavedNotSaved.setText(Saved);
							tfSHOWusername.setText(userName);
							tfSHOWpassword.setText(passWord);
							
						}
						else if (passWord.isEmpty() == true) { tfASKpass.setText("You entered nothing try again."); }

						else if (passwordLength < 8) { tfASKpass.setText("8 characters or longer."); }

						else if (checkLowerCase(passWord) == false) { tfASKpass.setText("at least 1 lower case letter."); }

						else if (checkUpperCase(passWord) == false) { tfASKpass.setText("at least 1 upper case letter."); }

						else if (checkNumber(passWord) == false) { tfASKpass.setText("at least 1 digit."); }

						else if (checkAlpha(passWord) == false) { tfASKpass.setText("at least 1 non-alphanumeric character."); }

						else if (passWord.contains(userName)) { tfASKpass.setText("can't have username inside it."); }

						else { tfASKpass.setText("You can't use that password."); }
					}
					else if (userName.isEmpty() == true) { tfASKname.setText("You entered nothing try again."); }
					else if (Character.isDigit(usernameDigit) == true) { tfASKname.setText("can't start with a digit"); }
					else { tfASKname.setText("You can't use that username."); }
				}
				else { tfASKname.setText("Please clear the results before trying again."); }
			}
		});
		
		bclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e2) {
				String isclearedornot = tfASKname.getText();
				if (isclearedornot.equals("")) {
					String alreadyClear = "The results have already been cleared.";
					tfASKname.setText(alreadyClear);
				}
				else {
					tfASKname.setText("");
					tfASKpass.setText("");
					tfSHOWusername.setText("");
					tfSHOWpassword.setText("");
					lSavedNotSaved.setText(NotSaved);
				}
			}
		});
		
		fm.addWindowListener((WindowListener) new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				fm.dispose();
			}
		});

		fm.add(lWELCOME);
		fm.add(lASKname);fm.add(tfASKname);
		fm.add(lASKpass);fm.add(tfASKpass);
		fm.add(bsubmit);fm.add(lclicksubmit);
		fm.add(lSavedNotSaved);fm.add(tfSHOWusername);fm.add(tfSHOWpassword);
		fm.add(bclear);fm.add(lclickclear);
		fm.setSize(420,600);
		fm.setLayout(null);
		fm.setVisible(true);
	}
	public static void main(String[] args) {
		InterfaceAccount gui = new InterfaceAccount();
	}
}
