package lesson12_api;

public class StringEx2 {
	public static void main(String[] args) {
		String str = "a";
		str += "b";
		String str2 = "1" + "2" + "3";
		
		// "a" "b" "ab" "1" "2" "12" "3" "123"
		
		str = "";
		StringBuffer sb = new StringBuffer("");
//		sb.append("e");
//		System.out.println(sb);
		long start = System.currentTimeMillis();
		for(int i = 0; i < 1000_000 ; i++) {
//			str += "0";
			sb.append("0");
		
		}
		long end = System.currentTimeMillis();
		str = sb.toString();
		sb = new StringBuffer(str);
		System.out.println(sb.length() + " ::: " + (end - start) + "ms");
//		System.out.println(str.length() + " ::: " + (end - start) + "ms");
		
		// 성능 향상 목적 : cache, hash, buffer-예비공간 
		
		String s= "abcde"; // "abc123de"
		s = s.substring(0, 3) + "123" + s.substring(3);
		System.out.println(s);
		
//		System.out.println(s);
//		System.out.println(s.replace("c", ""));
		
		sb = new StringBuffer(s);
		sb.insert(3, "123");
		sb.deleteCharAt(sb.indexOf("c"));
		System.out.println(sb);
		
//	    StringBuffer : Thread Safe 
//		StringBuilder : Thread Unsafe 빌더가 버퍼에 비해 근소 우위 
//		ArrayList : Thread Safe
//		Vector : Thread Unsafe
		
		
		
		
	}


}
