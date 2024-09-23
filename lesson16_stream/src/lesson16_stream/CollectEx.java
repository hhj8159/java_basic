package lesson16_stream;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectEx {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(3,1,2,4,1,2,3,4,1,5,1,2,3,4);
		
//		List<Integer> list = 
//		stream
//		.distinct()
//		.sorted((a, b) -> b - a)
//		.collect(Collectors.toList());
//		System.out.println(list);
//		.forEach(System.out::println);
		
		List<String> list = 
		stream
		.distinct()
		.sorted((a, b) -> b - a)
		.map(i -> i.toString())
		.collect(Collectors.toList());		
		System.out.println(list);
		
		Stream.concat(list.stream(), list.stream()).forEach(System.out::println);
		
		
	}
}
