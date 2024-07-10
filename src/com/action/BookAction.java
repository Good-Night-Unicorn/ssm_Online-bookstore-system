package com.action;

import com.entity.Book;
import com.entity.Cate;

import com.service.BookService;
import com.service.CateService;
import com.util.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

//定义为控制器
@Controller
// 设置路径
@RequestMapping(value = "/book", produces = "text/plain;charset=utf-8")
public class BookAction extends BaseAction {
	// 注入Service 由于标签的存在 所以不需要getter setter
	@Autowired
	@Resource
	private BookService bookService;
	@Autowired
	@Resource
	private CateService cateService;

	// 准备添加数据
	@RequestMapping("createBook.action")
	public String createBook() {
		List<Cate> cateList = this.cateService.getAllCate();
		this.getRequest().setAttribute("cateList", cateList);
		return "admin/addbook";
	}

	// 添加数据
	@RequestMapping("addBook.action")
	public String addBook(Book book) {
		System.out.println(book.toString());
		System.out.println("ssss");
		book.setHits("0");
		book.setSellnum("0");
		this.bookService.insertBook(book);
		return "redirect:/book/createBook.action";
	}

	// 通过主键删除数据
	@RequestMapping("deleteBook.action")
	public String deleteBook(String id) {
		this.bookService.deleteBook(id);
		return "redirect:/book/getAllBook.action";
	}

	// 批量删除数据
	@RequestMapping("deleteBookByIds.action")
	public String deleteBookByIds() {
		String[] ids = this.getRequest().getParameterValues("bookid");
		for (String bookid : ids) {
			this.bookService.deleteBook(bookid);
		}
		return "redirect:/book/getAllBook.action";
	}

	// 更新数据
	@RequestMapping("updateBook.action")
	public String updateBook(Book book) {
		this.bookService.updateBook(book);
		return "redirect:/book/getAllBook.action";
	}

	// 显示全部数据
	@RequestMapping("getAllBook.action")
	public String getAllBook(String number) {
		List<Book> bookList = this.bookService.getAllBook();
		PageHelper.getPage(bookList, "book", null, null, 10, number, this.getRequest(), null);
		return "admin/listbook";
	}

	// 按条件查询数据 (模糊查询)
	@RequestMapping("queryBookByCond.action")
	public String queryBookByCond(String cond, String name, String number) {

		Book book = new Book();
		if (cond != null) {
			if ("bookname".equals(cond)) {
				book.setBookname(name);
			}
			if ("image".equals(cond)) {
				book.setImage(name);
			}
			if ("cateid".equals(cond)) {
				book.setCateid(name);
			}
			if ("price".equals(cond)) {
				book.setPrice(name);
			}
			if ("recommend".equals(cond)) {
				book.setRecommend(name);
			}

			if ("hits".equals(cond)) {
				book.setHits(name);
			}
			if ("sellnum".equals(cond)) {
				book.setSellnum(name);
			}
			if ("contents".equals(cond)) {
				book.setContents(name);
			}
		}

		List<String> nameList = new ArrayList<String>();
		List<String> valueList = new ArrayList<String>();
		nameList.add(cond);
		valueList.add(name);
		PageHelper.getPage(this.bookService.getBookByLike(book), "book", nameList, valueList, 10, number, this.getRequest(), "query");
		name = null;
		cond = null;
		return "admin/querybook";
	}

	// 按主键查询数据
	@RequestMapping("getBookById.action")
	public String getBookById(String id) {
		Book book = this.bookService.getBookById(id);
		this.getRequest().setAttribute("book", book);
		List<Cate> cateList = this.cateService.getAllCate();
		this.getRequest().setAttribute("cateList", cateList);
		return "admin/editbook";
	}
	public BookService getBookService() {
		return bookService;
	}

	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}

}
