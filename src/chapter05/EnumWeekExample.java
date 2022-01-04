package chapter05;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class EnumWeekExample {
	public static void main(String[] args) {
		Week today = null;
		// 오늘 날짜 정보 가져오기
		LocalDate now = LocalDate.now();
		DayOfWeek week = now.getDayOfWeek();
		switch (week) {
		case SUNDAY:
			today = Week.SUNDAY;
			break;
		case MONDAY:
			today = Week.MONDAY;
			break;
		case TUESDAY:
			today = Week.TUESDAY;
			break;
		case WEDNESDAY:
			today = Week.WEDNESDAY;
			break;
		case THURSDAY:
			today = Week.THURSDAY;
			break;
		case FRIDAY:
			today = Week.FRIDAY;
			break;
		case SATURDAY:
			today = Week.SATURDAY;
			break;
		default:
			break;
		}
		
		System.out.println("오늘 요일: " + today.getName() + "요일");
		if (today == Week.SUNDAY) {
			System.err.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 공부를 합니다.");
		}
	}
}
