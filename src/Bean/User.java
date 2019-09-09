package Bean;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	private String username = "";
	private String passwd = "";
	Map<String, String> userMap = null;
	Map<String, String> errorsMap = null;
	
	public User() {
		super();
		this.setUsername("");
		this.setPasswd("");
		userMap = new HashMap<String, String>();
		errorsMap = new HashMap<String, String>();
		userMap.put("zhangsan", "123zs");
		userMap.put("lisi", "1234ls");
		userMap.put("wangwu", "1234ww");
		userMap.put("zhengliu", "1234zl");
		userMap.put("zhaoqi", "1234zq");
	}
	
	public boolean isValide() {
		boolean flag = true;
		if (!this.userMap.containsKey(this.username)) {
			flag = false;
			errorsMap.put("username", "用户不存在");
			this.username = "";
		}
		String password = this.userMap.get(this.username);
		if (password == null || !password.equals(this.passwd)) {
			flag = false;
			this.passwd = "";
			errorsMap.put("passwd", "密码错误");
			this.username = "";
		}
		return flag;
	}
	
	public String getErrors(String key) {
		String errorV = this.errorsMap.get(key);
		return errorV == null ? "" : errorV;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
}
