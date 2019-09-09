
import java.util.HashMap;
import java.util.Map;

public class User {
	private Map<String, String> userMap = new HashMap<String, String>();
	private static User user = null;
	
	private User() {
		userMap.put("zhangsan", "11111##zhangsan@sina.com");
		userMap.put("lisi", "22222#lisi@sina.com");
		userMap.put("wangwu", "33333##wangwu@sina.com");
		userMap.put("zhaoliu", "44444##zhaoliu@sina.com");
	}
	
	public static User getInstance() {
		if (user == null) {
			user = new User();
		}
		return user;
	}
	
	public Map<String, String> getUserMap() {
		return userMap;
	}

}
