package com.hta.book.service;

import java.sql.SQLException;
import java.util.List;

import com.hta.member.repository.Member;
import com.hta.board.repository.BoardDto;
import com.hta.book.repository.BookDto;
import com.hta.exception.IdPasswordNotMachingException;

import mybatis.BoardManager;
import mybatis.BookManager;
import mybatis.MemberManager;

public class BookServiceImpl implements BookService {

	public void bookinput(BookDto dto) throws SQLException {
		BookManager.bookinput(dto);
		// TODO Auto-generated method stub
	
		
	}
	// å ����Ʈ ��ü �����ֱ�
	public List getList() throws SQLException{
		return BookManager.getList();
		
	}
	// �� �԰�¥ ���ò��� �����ֱ�
	public List todayList() throws SQLException{
		return BookManager.todayList();
		
	}
	//�� ����
	public BookDto findBynum(int book_num) {
		BookDto dto = new BookManager().finBynum(book_num);
		return dto;
	}
	
	//�ۻ���
	public void bookdelete(int book_num) {
	
		BookManager.deletebook(book_num);
	}
	//�� ����
	public void updatebook(BookDto dto) {
		BookManager.updatebook(dto);
		
	}
	//å ���ǰ˻�
	public List bookrental() {
		
		return BookManager.bookrental();
	}
	public List samelist(String book_title) {
		System.out.println(book_title);
		return BookManager.samelist(book_title);
	}

}
