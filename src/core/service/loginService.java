package core.service;

import core.database.Database;
import core.ui.admin.AdminFrame;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import static app.Main.*;


public class loginService {
	
	private JFrame jf;
	
	private final String username;
	private final String password;
	private String name;
	public loginService(JFrame jf) throws ClassNotFoundException, SQLException {
		super();
		this.jf = jf;
		username = loginJPanel.getUserName();
		password = loginJPanel.getPassword();
		check();
	}
	
	public void check() throws ClassNotFoundException, SQLException {
		Database db = new Database();
		String query = "SELECT * FROM userinfo WHERE name = ? AND password = ?";
		PreparedStatement ps = db.getConnection().prepareStatement(query);
		ps.setString(1, username);
		ps.setString(2, password);

		ResultSet rs = ps.executeQuery();
		boolean result = false;  // 修改默认值为 false

		if (rs.next()) {
			result = true;
			name = rs.getString("name");
			System.out.println(name);
		}

		// 使用完，关闭连接
		rs.close();
		ps.close();

		//登录结果

		if(result) {
			JOptionPane.showMessageDialog(jf, "登录成功，正在跳转...");
			if(username.equals("admin")) {
				//new AdminFrame(name);
				adminFrame = new AdminFrame();
				loginJFrame.dispose();
			}else {
				System.out.println("普通用户登录成功");
				//new UserFrame(username, name);
			}
		}else {
			JOptionPane.showMessageDialog(jf, "登录失败，用户名或者密码错误！");
		}
	}
	
}
