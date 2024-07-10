package com.dao;

import com.entity.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("bookDAO") // Repository标签定义数据库连接的访问 Spring中直接
public interface BookDAO {

	/**
	 * bookDAO 接口 可以按名称直接调用book.xml配置文件的SQL语句
	 */

	// 插入数据 调用entity包book.xml里的insertbook配置 返回值0(失败),1(成功)
	public int insertBook(Book book);
	// 更新数据 调用entity包book.xml里的updatebook配置 返回值0(失败),1(成功)
	public int updateBook(Book book);

	// 删除数据 调用entity包book.xml里的deletebook配置 返回值0(失败),1(成功)
	public int deleteBook(String bookid);

	// 查询全部数据 调用entity包book.xml里的getAllbook配置 返回List类型的数据
	public List<Book> getAllBook();

	public List<Book> getBookByHot();

	public List<Book> getBookByNews();

	public List<Book> getBookByCate(String cateid);

	// 按照book类里面的值精确查询 调用entity包book.xml里的getbookByCond配置 返回List类型的数据
	public List<Book> getBookByCond(Book book);

	// 按照book类里面的值模糊查询 调用entity包book.xml里的getbookByLike配置 返回List类型的数据
	public List<Book> getBookByLike(Book book);

	// 按主键查询表返回单一的book实例 调用entity包book.xml里的getbookById配置
	public Book getBookById(String bookid);

}
