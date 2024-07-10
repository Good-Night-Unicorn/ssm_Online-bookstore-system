package com.service;

import com.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookService")
public interface BookService {
	// 插入数据 调用bookDAO里的insertbook配置
	public int insertBook(Book book);

	// 更新数据 调用bookDAO里的updatebook配置
	public int updateBook(Book book);

	// 删除数据 调用bookDAO里的deletebook配置
	public int deleteBook(String bookid);

	// 查询全部数据 调用bookDAO里的getAllbook配置
	public List<Book> getAllBook();

	public List<Book> getBookByHot();

	public List<Book> getBookByNews();

	public List<Book> getBookByCate(String cateid);

	// 按照book类里面的字段名称精确查询 调用bookDAO里的getbookByCond配置
	public List<Book> getBookByCond(Book book);

	// 按照book类里面的字段名称模糊查询 调用bookDAO里的getbookByLike配置
	public List<Book> getBookByLike(Book book);

	// 按主键查询表返回单一的book实例 调用bookDAO里的getbookById配置
	public Book getBookById(String bookid);

}
