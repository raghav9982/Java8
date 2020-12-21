package demo.streams;

import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		 Stream<String> language = Stream.of("java", "python", "node", null, "ruby", null, "php");

		 Predicate<String> res1 = val -> Objects.nonNull(val);
		 Predicate<String> res2 = val -> val.length() > 4;
			List<String> result = language
				//	.filter(Objects::nonNull/* val -> Objects.nonNull(val) && val.length()>4 */)
					.filter(res1.and(res2))
	        		.map(String::toUpperCase)
	        		.collect(Collectors.toList());

	        result.forEach(System.out::println);

	}
}
