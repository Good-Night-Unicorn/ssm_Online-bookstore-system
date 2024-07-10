package com.service.impl;

import com.dao.BookDAO;
import com.entity.Book;
import com.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("bookService")
public class BookServiceImpl implements BookService {
	@Autowired
	@Resource
	private BookDAO bookDAO;

	@Override // 继承接口的新增 返回值0(失败),1(成功)
	public int insertBook(Book book) {
		return this.bookDAO.insertBook(book);
	}

	@Override // 继承接口的更新 返回值0(失败),1(成功)
	public int updateBook(Book book) {
		return this.bookDAO.updateBook(book);
	}

	@Override // 继承接口的删除 返回值0(失败),1(成功)
	public int deleteBook(String bookid) {
		return this.bookDAO.deleteBook(bookid);
	}

	@Override // 继承接口的查询全部
	public List<Book> getAllBook() {
		return this.bookDAO.getAllBook();
	}

	@Override // 继承接口的查询全部
	public List<Book> getBookByHot() {
		return this.bookDAO.getBookByHot();
	}

	@Override // 继承接口的查询全部
	public List<Book> getBookByNews() {
		return this.bookDAO.getAllBook();
	}

	@Override // 继承接口的查询全部
	public List<Book> getBookByCate(String cateid) {
		return this.bookDAO.getBookByCate(cateid);
	}

	@Override // 继承接口的按条件精确查询
	public List<Book> getBookByCond(Book book) {
		return this.bookDAO.getBookByCond(book);
	}

	@Override // 继承接口的按条件模糊查询
	public List<Book> getBookByLike(Book book) {
		return this.bookDAO.getBookByLike(book);
	}

	@Override // 继承接口的按主键查询 返回Entity实例
	public Book getBookById(String bookid) {
		return this.bookDAO.getBookById(bookid);
	}

}
