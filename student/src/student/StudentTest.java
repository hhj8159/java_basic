package student;

// clone    Deep Copy(깊은 복사) , Shallow Copy(얕은 복사) 단차원

public class StudentTest {
	public static void main(String[] args) {
//		StudentUtils.next("이름", String.class, new Predicate<String>() {
//
//			@Override
//			public boolean test(String t) {
//				// TODO Auto-generated method stub
//				return t.matches("^[가-힣]{2,4}");
//			}
//			
//		}, "한글로 2~4글자로 입력하세요");
//		StudentUtils.next("이름", String.class,t -> t.matches("^[가-힣]{2,4}"), "한글로 2~4글자로 입력하세요");
		int i = StudentUtils.next("숫자", Integer.class,t -> t < 0 , "0보다 큰값");
		System.out.println(i);
	}
}