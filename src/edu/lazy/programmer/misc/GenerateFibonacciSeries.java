package edu.lazy.programmer.misc;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class GenerateFibonacciSeries {

	public static void main(String[] args) {
		//System.out.println(LocalDateTime.now());
		//System.out.println(generateSeriesOldWay(50));
		System.out.println(LocalDateTime.now());
		System.out.println(generateSeriesNewWay(50));
		System.out.println(LocalDateTime.now());

	}

	private static Long generateSeriesOldWay(int n) {
		if (n < 1)
			return 0L;
		if (n <= 3)
			return 1L;
		return generateSeriesOldWay(n - 1) + generateSeriesOldWay(n - 2);

	}

	private static Long generateSeriesNewWay(int n) {
		List<Long> series = new ArrayList<>();
		Long prev = 0L;
		Long next = 1L;
		Long result = null;
		if (n == 1) {
			series.add(prev);
			return prev;
		} else if (n == 2) {
			series.add(prev);
			series.add(next);
			return next;
		} else if (n > 2) {
			for (int i = 3; i <= n; i++) {
				result = prev + next;
				Long tmp = next;
				next = prev + next;
				prev = tmp;
				series.add(result);
			}
		} else {
			System.out.println("Please Enter Term Number >0");
			return -1L;
		}
		System.out.println(series);
		return result;
	}

}
