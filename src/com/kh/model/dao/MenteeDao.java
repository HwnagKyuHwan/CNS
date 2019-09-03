package com.kh.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.kh.model.vo.Mentee;
import com.kh.model.vo.Mentor;

public class MenteeDao {

	public MenteeDao() {
	}

	public void fileSave(ArrayList<Mentee>  list ) {

		
		ObjectOutputStream oos = null;

//		Mentee mentee1 = new Mentee("user01", "pw01", "pw01", "황규환", "mentee", "sc", "sc", "as");
	
		

		
		  try {
		  
//		  list.add(mentee1);
		  
		  
		  
	
		 
		  
		  
		  oos = new ObjectOutputStream(new FileOutputStream("MenteeFile.txt",true));
		  System.out.println("멘티");
		  
		  oos.writeObject(list);
		  
		  
		  
		  oos.flush(); 
		  } catch (FileNotFoundException e) {
		  
		  e.printStackTrace(); } 
		  catch (IOException e) {
		  
		  e.printStackTrace(); }
		  finally { 
			  try {
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  
			  
			  }
		 

	}

	public ArrayList<Mentee> FileOpen() {

		ObjectInputStream ois = null;
		ArrayList<Mentee> list =  null;
		
		

		try {
			ois = new ObjectInputStream(new FileInputStream("MenteeFile.txt"));

			list = (ArrayList<Mentee>) ois.readObject();

			

		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");

		} catch (IOException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	
return list;
	}

}
