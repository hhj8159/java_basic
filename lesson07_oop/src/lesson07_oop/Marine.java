package lesson07_oop;

public class Marine {
		// 최대체력 모든 마린의 최대체력이 40이기에 static이 붙어야 한다
		static int maxHp = 40;		
		// 체력 각 마린마다 현재 체력은 달라질 수 있기에  static은 붙지 않는다
		int hp = 40; 
		// 공격력
		static int att = 6;
		// 방어력
		static int def;	
}
