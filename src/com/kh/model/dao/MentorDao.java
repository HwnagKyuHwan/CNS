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

public class MentorDao {
	
	public MentorDao() {}
	
public void fileSave(ArrayList<Mentor>  list) {
		
		
		ObjectOutputStream oos = null;
		
//		Mentor mentor = new Mentor();
		try {
			
//			list.add(mentor);
			
			
			oos = new ObjectOutputStream(new FileOutputStream("MentorFile.txt",true));
			
			oos.writeObject(list);
			
			oos.flush();
			
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
	}

public ArrayList<Mentor> FileOpen() {
	
	ObjectInputStream ois = null;
	ArrayList<Mentor> list = null;
	
	
	try {
		ois = new ObjectInputStream(new FileInputStream("MentorFile.txt"));
		
		list = (ArrayList<Mentor>)ois.readObject();
		
		
		
		
		
		
	} catch (FileNotFoundException e) {
		System.out.println("파일이 없습니다.");
		
	} catch (IOException e) {
		
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
	
		e.printStackTrace();
	}finally {
		if(ois != null) {
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
