package com.kh.controller;

import java.util.ArrayList;

import com.kh.model.dao.MenteeDao;
import com.kh.model.dao.MentorDao;
import com.kh.model.vo.Mentee;
import com.kh.model.vo.Mentor;
import java.util.ArrayList;

public class UserManager {

	private MenteeDao menteeDao = new MenteeDao();
	private MentorDao mentorDao = new MentorDao();

	public void insertMentee(Mentee m) {

		
		  int no = 0;
		  
		  ArrayList<Mentee> list = menteeDao.FileOpen();
		  
		  if (list == null) { list = new ArrayList<Mentee>();
		  
		  no++; } else { no = list.get(list.size() - 1).getUserNo() + 1;
		 
		  }
		  
		  m.setUserNo(no);
		 
		
		
		 list.add(m);

		menteeDao.fileSave(list);

	}

	public void insertMentor(Mentor m) {
		int no = 0;

		ArrayList<Mentor> list = mentorDao.FileOpen();

		if (list == null) {
			list = new ArrayList<Mentor>();

			no++;
		} else {
			no = list.get(list.size() - 1).getUserNo() + 1;

		}

		m.setUserNo(no);

		list.add(m);

		mentorDao.fileSave(list);

	}

}
