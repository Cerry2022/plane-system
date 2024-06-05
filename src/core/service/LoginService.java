package core.service;

import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import core.ui.admin.AdminFrame;
import core.database.Database;
import core.first.jpanel.LoginJPanel;
import core.ui.user.UserFrame;
import core.util.Global;
import core.util.Tool;

public class LoginService {
	
	private JFrame jf = null;
	private JTextField jtf_lo_username = LoginJPanel.getJtf_lo_username();
	private JPasswordField jpf_lo_password = LoginJPanel.getJpf_lo_password();
	
	private String username = Tool.getTextValue(jtf_lo_username);
	private String password = Tool.getTextValue(jpf_lo_password);
	private String name;
	public LoginService(JFrame jf) throws ClassNotFoundException, SQLException {
		super();
		this.jf = jf;
		check();
	}
	
	public void check() throws ClassNotFoundException, SQLException {
/*		Database db = new Database();
		ResultSet rs = db.getSelect("select * from user");
		boolean result = true;
		while(rs.next()) {
			//匹配数据库
			if(username.equals(rs.getString("username")) && password.equals(rs.getString("password"))) {
				result = true;
				name = rs.getString("name");
				System.out.println(name);
				rs.last();  //操作完毕立即关掉
				break;
			}
		}*/
		//登录结果
		boolean result = true;
		if(result) {
			JOptionPane.showMessageDialog(jf, "登录成功，正在跳转...");
			Global.getJf1().setVisible(false);
			if(username.equals("admin")) {
				new AdminFrame(name);
			}else {
				new UserFrame(username, name);
			}
		}else {
			JOptionPane.showMessageDialog(jf, "登录失败，用户名或者密码错误！");
			jtf_lo_username.requestFocus();
		}
	}
	
}
