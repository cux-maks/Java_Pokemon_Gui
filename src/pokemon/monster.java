package pokemon;

public class monster {
	int hp = 15;
	int atk, dfs, s_atk, s_dfs, speed, accuracy, evasion, critical;
	
	void Set_Hp(int a) { hp = a; }
	void Set_Atk(int a) { atk = a; }
	void Set_S_Atk(int a) { dfs = a; }
	void Set_Dfs(int a) { s_atk = a; }
	void Set_S_Dfs(int a) { s_dfs = a; }
	void Set_Speed(int a) { speed = a; }
	void Set_Accuracy(int a) { accuracy = a; }
	void Set_Evasion(int a) { evasion = a; }
	void Set_Critical(int a) { critical = a; }

	void Up_Hp() { hp++; }
	void Up_Atk() { atk++; }
	void Up_S_Atk() { dfs++; }
	void Up_Dfs() { s_atk++; }
	void Up_S_Dfs() { s_dfs++; }
	void Up_Speed() { speed++; }
	void Up_Accuracy() { accuracy++; }
	void Up_Evasion() { evasion++; }
	void Up_Critical() { critical++; }
	
	void RankUp_Atk() { atk += 30; }
	void RankUp_S_Atk() { s_atk += 30; }
	void RankUp_Dfs() { dfs += 30; }
	void RankUp_S_Dfs() { s_dfs += 30; }
	void RankUp_Speed() { speed += 30; }
	void RankUp_Accuracy() { accuracy += 30; }
	void RankUp_Evasion() { evasion += 30; }
	void RankUp_Critical() { critical += 30; }
	
	
}
