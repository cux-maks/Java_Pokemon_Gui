package MainPage;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;

public class mainPage extends JFrame {
	
	public mainPage() {
		
		setTitle("포켓몬스터 대전");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createMenu();
		
		Container contentPane = getContentPane();
		contentPane.setLayout(null);
		
		JPanel listpan = new JPanel();
		String[] listStr= {"이상해씨", "파이리", "꼬부기", "치코리타", "브케인", "리아코", "나무지기", "아차모", "물짱이", "모부기", "불꽃숭이", "팽도리", "주리비얀", "뚜꾸리", "수댕이"};
		JList myList= new JList(listStr);
		
		JLabel name = new JLabel();
		name.setText("이름: ");
		name.setLocation(100, 10);
		name.setSize(100, 30);
		
		JLabel exp = new JLabel();
		exp.setText("설명: ");
		exp.setLocation(100, 30);
		exp.setSize(getPreferredSize());
		
		myList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		myList.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
		myList.setFixedCellHeight(25);
		add(BorderLayout.CENTER, myList);
		myList.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				if(!e.getValueIsAdjusting()) {
					int cmd = myList.getSelectedIndex();
					switch(cmd) {
					case 0:
						// System.out.println("이상해씨: 태어날 때 부터 등에 있는 이상한 씨앗과 함께 성장하며 자란다. 이상해씨는 며칠동안 굶어도 이상이 없는데, 그 이유는 씨앗에 영양분이 가득해 진화하기 전 까지 등에 자라는 씨앗에서 영양분을 얻을 수 있기 때문이다.");
						name.setText("이름: 이상해씨 (풀, 독)");
						name.setLocation(100, 10);
						name.setSize(150, 30);
						exp.setText("<html><body>설명: 태어날 때 부터 등에 있는 이상한 씨앗과 함께 성장하며 자란다.이상해씨는 며칠동안 굶어도 이상이 없는데,<br>그 이유는 씨앗에 영양분이 가득해 진화하기 전 까지 등에 자라는 씨앗에서 영양분을 얻을 수 있기 때문이다.</body></html>");
						exp.setLocation(100, 30);
						exp.setSize(700, 50);
						break;
					case 1:
						//System.out.println("파이리");
						name.setText("이름: 파이리 (불)");
						name.setLocation(100, 10);
						name.setSize(150, 30);
						exp.setText("<html><body>설명: 뜨거운 것을 좋아하는 성격이다.<br>꼬리에 있는 불꽆은 생명을 나타내는 표시로 건강하면 강한 불꽃이 나오고 건강하지 않으면 약한 불꽃이 나온다.<br>꼬리의 불꽃은 기분을 나타내기도 하는데, 즐거우면 불꽃이 살랑살랑 흔들리고 화나면 맹렬하게 불타오른다.</body></html>");
						exp.setLocation(100, 30);
						exp.setSize(700, 70);
						break;
					case 2:
						//System.out.println("꼬부기");
						name.setText("이름: 꼬부기 (물)");
						name.setLocation(100, 10);
						name.setSize(150, 30);
						exp.setText("<html><body>설명: 꼬마 거북이 포켓몬. 딱딱한 등껍질은 여러모로 쓸모가 많다.<br> 일단 몸을 지키는 것도 있지만 반격을 할 때 더 효과가 좋다고 한다.<br>그리고 위험해지면 등껍질 안에서 물을 내뿜을 수도 있다.</body></html>");
						exp.setLocation(100, 30);
						exp.setSize(700, 70);
						break;
					case 3:
						//System.out.println("치코리타");
						name.setText("이름: 치코리타 (풀)");
						name.setLocation(100, 10);
						name.setSize(150, 30);
						exp.setText("<html><body>설명: 없음<br></body></html>");
						exp.setLocation(100, 30);
						exp.setSize(700, 45);
						break;
					case 4:
						// System.out.println("브케인");
						name.setText("이름: 브케인 (불)");
						name.setLocation(100, 10);
						name.setSize(150, 30);
						exp.setText("<html><body>설명: 없음<br></body></html>");
						exp.setLocation(100, 30);
						exp.setSize(700, 45);
						break;
					case 5:
						//System.out.println("리아코");
						name.setText("이름: 리아코 (물)");
						name.setLocation(100, 10);
						name.setSize(150, 30);
						exp.setText("<html><body>설명: 움직이는 것은 무조건 물어뜯는 습성.<br>강력한 턱을 갖고 있어 뭐든지 깨물어 부순다.<br>트레이너도 주의가 필요하다.</body></html>");
						exp.setLocation(100, 30);
						exp.setSize(700, 70);
						break;
					case 6:
						// System.out.println("나무지기");
						name.setText("이름: 나무지기 (풀)");
						name.setLocation(100, 10);
						name.setSize(150, 30);
						exp.setText("<html><body>설명: 벽과 천장에 붙어 자유롭게 다닐 수 있다.<br>이름 그대로 밀림의 나무를 지킨다.</body></html>");
						exp.setLocation(100, 30);
						exp.setSize(700, 45);
						break;
					case 7:
						// System.out.println("아차모");
						name.setText("이름: 아차모 (불)");
						name.setLocation(100, 10);
						name.setSize(150, 30);
						exp.setText("<html><body>설명: 없음<br></body></html>");
						exp.setLocation(100, 30);
						exp.setSize(700, 45);
						break;
					case 8:
						//System.out.println("물짱이");
						name.setText("이름: 물짱이 (물)");
						name.setLocation(100, 10);
						name.setSize(150, 30);
						exp.setText("<html><body>설명: 없음<br></body></html>");
						exp.setLocation(100, 30);
						exp.setSize(700, 45);
						break;
					case 9:
						//System.out.println("모부기");
						name.setText("이름: 모부기 (풀)");
						name.setLocation(100, 10);
						name.setSize(150, 30);
						exp.setText("<html><body>설명: 없음<br></body></html>");
						exp.setLocation(100, 30);
						exp.setSize(700, 45);
						break;
					case 10:
						//System.out.println("불꽃숭이");
						name.setText("이름: 불꽃숭이 (불)");
						name.setLocation(100, 10);
						name.setSize(150, 30);
						exp.setText("<html><body>설명: 없음<br></body></html>");
						exp.setLocation(100, 30);
						exp.setSize(700, 45);
						break;
					case 11:
						//System.out.println("팽도리");
						name.setText("이름: 팽도리 (물)");
						name.setLocation(100, 10);
						name.setSize(150, 30);
						exp.setText("<html><body>설명: 없음<br></body></html>");
						exp.setLocation(100, 30);
						exp.setSize(700, 45);
						break;
					case 12:
						//System.out.println("주리비얀");
						name.setText("이름: 주리비얀 (풀)");
						name.setLocation(100, 10);
						name.setSize(150, 30);
						exp.setText("<html><body>설명: 없음<br></body></html>");
						exp.setLocation(100, 30);
						exp.setSize(700, 45);
						break;
					case 13:
						//System.out.println("뚜꾸리");
						name.setText("이름: 뚜꾸리 (불)");
						name.setLocation(100, 10);
						name.setSize(150, 30);
						exp.setText("<html><body>설명: 없음<br></body></html>");
						exp.setLocation(100, 30);
						exp.setSize(700, 45);
						break;
					case 14:
						//System.out.println("수댕이");
						name.setText("이름: 수댕이 (물)");
						name.setLocation(100, 10);
						name.setSize(150, 30);
						exp.setText("<html><body>설명: 없음<br></body></html>");
						exp.setLocation(100, 30);
						exp.setSize(700, 45);
						break;
					}
				}
			}
		});
		
		
		listpan.setLocation(1, 1);
		listpan.setSize(60, 400);
		listpan.add(myList);
		this.add(name);
		this.add(exp);
		this.add(listpan);
		this.pack();
		
		setSize(900, 450);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	// 메뉴 생성
	public void createMenu() {
		
		JMenuBar mb = new JMenuBar();
		JMenu screenMenu = new JMenu("메뉴");
		JMenuItem[] menuItem = new JMenuItem[7];
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