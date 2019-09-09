package Bean.tag;

import javax.servlet.jsp.tagext.TagSupport;
import javax.servlet.*;

public class BaseTagSupport extends TagSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected ServletRequest getRequest() {
		return pageContext.getRequest();
	}

}
