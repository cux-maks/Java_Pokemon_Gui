package pokemon;

public class Charmander extends monster {

	public Charmander() {
		int Munchkin =  (int)((Math.random()*10000)%100);
		if(Munchkin == 1) {
			super.Set_Hp(3000);
			super.Set_Atk(99999);
			super.Set_Dfs(99999);
			super.Set_S_Atk(99999);
			super.Set_S_Dfs(99999);
			super.Set_Critical(100);
			super.Set_Accuracy(100);
			super.Set_Evasion(100);
			super.Set_Speed(3000);
			
		}
	}
	
}
