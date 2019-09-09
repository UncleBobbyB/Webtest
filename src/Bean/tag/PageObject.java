package Bean.tag;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

public class PageObject {

	private final int DEFAULT_PAGE_SIZE = 10;
	private final int DEFAULT_CUR_SIZE = 1;
	private List data;
	private int dataCount;
	private int pageSize;
	private int pageCount;
	private int curPage;
	

	public void reqProperty(HttpServletRequest request) {
		String curPage = null, pageSize = null, dataCount = null;
		curPage = request.getParameter("curPage");
		if (curPage != null && curPage != "") {
			try {
				this.curPage = Integer.valueOf(curPage).intValue();
			} catch (NumberFormatException ex) {
				ex.printStackTrace();
			}
		}
		
		pageSize = request.getParameter("pageSize");
		if (pageSize != null && pageSize != "") {
			try {
				this.pageSize = Integer.valueOf(pageSize).intValue();
			} catch (NumberFormatException ex) {
				ex.printStackTrace();
			}
		}
		
		dataCount = request.getParameter("dataCount");
		if (dataCount != null && dataCount != "") {
			try {
				this.dataCount = Integer.valueOf(dataCount).intValue();
			} catch (NumberFormatException ex) {
				ex.printStackTrace();
			}
		}
	}
	
	public int getBeginPoint() {
		return (getCurPage() - 1) * getPageSize();
	}
	
	public static PageObject getInstance(HttpServletRequest request) {
		PageObject pageObject = new PageObject();
		pageObject.reqProperty(request);
		return pageObject;
	}
	
	public int getDataCount() {
		return dataCount;
	}
	public void setDataCount(int dataCount) {
		this.dataCount = dataCount;
	}
	public int getPageSize() {
		if (pageSize < 1) {
			pageSize = DEFAULT_PAGE_SIZE;
		}
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPageCount() {
		if (dataCount > 0) {
			pageCount = dataCount % pageSize == 0 ? (dataCount / pageSize) : (dataCount / pageSize + 1);
		}
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public List getData() {
		return data;
	}
	public void setData(List data) {
		this.data = data;
	}
	public int getCurPage() {
		if (curPage < DEFAULT_CUR_SIZE) {
			curPage = DEFAULT_CUR_SIZE;
		}
		return curPage;
	}
	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}
}
