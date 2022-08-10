package MainPage;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class mainPage extends JFrame {
	
	public mainPage() {
		
		setTitle("포켓몬스터 대전");
		createMenu();
		setSize(600, 450);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	// 메뉴 생성
	public void createMenu() {
		
		JMenuBar mb = new JMenuBar();
		JMenu screenMenu = new JMenu("메뉴");
		JMenuItem [] menuItem = new JMenuItem[7];
		String[] menuName = {"메인 화면", "훈련", "내 포켓몬", "내 기술", "포켓몬 도감", "기술 도감", "가방"};
		MenuActionListener listener = new MenuActionListener();
		
		for(int i = 0; i < menuItem.length; i++) {
			menuItem[i] = new JMenuItem(menuName[i]);
			menuItem[i].addActionListener(listener);
			screenMenu.add(menuItem[i]);
		}
		 
		mb.add(screenMenu);
		setJMenuBar(mb);
		
	}
	
	// 메뉴 리스너
	class MenuActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			switch (cmd) {
			case "메인 화면":
				System.out.println(cmd);
				break;
			case "훈련":
				System.out.println(cmd);
				break;
			case "내 포켓몬": 
				System.out.println(cmd);
				break;
			case "내 기술":
				System.out.println(cmd);
				break;
			case "포켓몬 도감":
				System.out.println(cmd);
				break;
			case "기술 도감":
				System.out.println(cmd);
				break;
			case "가방":
				System.out.println(cmd);
				break;
			}
		}
	}

	public static void main(String[] args) {
		
		mainPage frame = new mainPage();

	}

}