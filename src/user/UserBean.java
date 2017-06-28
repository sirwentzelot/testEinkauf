package user;

import javax.enterprise.inject.Model;

/**
 * Session Bean implementation class UserBean
 */
@Model
public class UserBean {
	
	private String name;
	private String pw;
	
    /**
     * Default constructor. 
     */
    public UserBean() {
        // TODO Auto-generated constructor stub
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
    
 
}
