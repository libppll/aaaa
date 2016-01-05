package com.hta.book.service;

import java.sql.SQLException;
import java.util.List;

import com.hta.board.repository.BoardDto;
import com.hta.book.repository.BookDto;


public interface BookService {

		//å �߰�
		public void bookinput(BookDto dto) throws SQLException;
		//��ü ��¸���Ʈ
		public List getList() throws SQLException;
		//å����
		public BookDto findBynum(int book_num);
		//���ó�¥�� ���
		public List todayList() throws SQLException;
		//����
		public void bookdelete(int book_num);
		//����
		public void updatebook(BookDto dto);
		//���ǰ˻�
		public List bookrental();
		
		public List samelist(String book_title);
		
}