package lesson16_stream;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStream {
	public static void main(String[] args) {
		IntStream is = IntStream.rangeClosed(1, 5);
		is.forEach(System.out::println);
		
//		is = IntStream.rangeClosed(1, 45);
		List<Integer> list = IntStream.rangeClosed(1, 45).boxed().collect(Collectors.toList());
		Collections.shuffle(list);
		System.out.println(list.subList(0, 6));
		
		LongStream ls = new Random().longs(6, 1, 46).sorted();
		ls.forEach(System.out::println);
		
		is = "가나다라ABCD".chars();
		is.forEach(s -> System.out.println((char)s));
		
		
//		IntBinaryOperator ibo = (x, y) -> Math.max(x, y);
		IntBinaryOperator ibo = Math::max;
		
//		Function<String, Integer> f = s -> Integer.parseInt(s);
		Function<String, Integer> f = Integer::parseInt;
		
//		BinaryOperator<String> bo = (x, y) -> x.concat(y);
		BinaryOperator<String> bo = String::concat;
		System.out.println("a".concat("b"));
		
//		Function<String, Exception> f2 = s -> new Exception(s);
		Function<String, Exception> f2 = Exception::new;
		
//		Comparator<String> com = (x, y) -> x.compareTo(y);
		Comparator<String> com = String::compareTo;
		
		
		
	}
}
