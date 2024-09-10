package lesson09_interface_starcraft;

//public class SCV extends GroundUnit implements Repairable{
//	void repair(Repairable u) {
//		
//	}
//}

public class SCV extends GroundUnit implements Repairable{
	void repair(Unit u) {
		if(!(u instanceof Repairable)) {
			System.out.println("수리 불가 대상");
			return;
		}
		//수리 실행 로직
		
	}
}
