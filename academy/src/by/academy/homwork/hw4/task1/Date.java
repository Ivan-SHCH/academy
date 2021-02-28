package by.academy.homwork.hw4.task1;

import java.time.DateTimeException;

import by.academy.homwork.hw4.task1.enumday.DayOfWeek;

public class Date {
	private Year year;
	private Month month;
	private Day day;

	public Year getYear() {
		return year;
	}

	public Month getMonth() {
		return month;
	}

	public Day getDay() {
		return day;
	}

	public Date() {
		super();
	}

	public Date(Year year, Month month, Day day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	class Year {
		int year;

		public int getYear() {
			return year;
		}

		public Year() {
			super();
		}

		public Year(int year) {
			this.year = year;
		}

		/**
		 * Метод определяющие год на високосность.
		 */
		public boolean leapYear() {
			if (getYear() % 4 == 0 && (getYear() % 100 != 0 || getYear() % 400 == 0)) {
				return true;
			}
			return false;
		}
	}

	class Month {
		int month;

		public int getMonth() {
			return month;
		}

		public void setMonth(int month) {
			this.month = month;
		}

		public Month() {
			super();
		}

		public Month(int month) {
			this.month = month;
		}
	}

	class Day {
		int day;

		public int getDay() {
			return day;
		}

		public void setDay(int day) {
			this.day = day;
		}

		public Day() {
			super();
		}

		public Day(int day) {
			this.day = day;
		}
	}

	/**
	 * Метод создания даты.
	 */
	public void create(Year year, Month month, Day day) {
		if (month.getMonth() < 1 || month.getMonth() > 12) {
			throw new DateTimeException("Invalid month '" + month.getMonth() + " " + month + "'");
		}
		if (day.getDay() > 28) {
			int dom = 31;
			switch (month.getMonth()) {
			case 2:
				dom = (year.leapYear() ? 29 : 28);
				break;
			case 4:
				dom = 30;
			case 6:
				dom = 30;
			case 9:
				dom = 30;
			case 11:
				dom = 30;
				break;
			}
			if (day.getDay() > dom) {
				if (day.getDay() == 29) {
					throw new DateTimeException("Invalid date 'February 29' as '" + year + "' is not a leap year");
				} else {
					throw new DateTimeException("Invalid date '" + month.getMonth() + " " + day + "'");
				}
			}

		}
		this.year = year;
		this.month = month;
		this.day = day;
	}

	/**
	 * Метод перечисления дня недели. (Актуален, только если первое число в месяце
	 * является понедельником).
	 */
	public String printDay(Day day) {
		int dayweek = day.getDay() % 7;
		String en = null;
		switch (dayweek) {
		case 0:
			en = DayOfWeek.SUNDAY.toString();
			break;
		case 1:
			en = DayOfWeek.MONDAY.toString();
			break;
		case 2:
			en = DayOfWeek.TUESDAY.toString();
			break;
		case 3:
			en = DayOfWeek.WEDNESDAY.toString();
			break;
		case 4:
			en = DayOfWeek.THURSDAY.toString();
			break;
		case 5:
			en = DayOfWeek.FRIDAY.toString();
			break;
		case 6:
			en = DayOfWeek.SATURDAY.toString();
			break;

		}
		return en;
	}

	@Override
	public String toString() {
		int yearValue = year.getYear();
		int monthValue = month.getMonth();
		String en = printDay(getDay());
		int dayValue = day.getDay();
		int absYear = Math.abs(yearValue);
		StringBuilder buf = new StringBuilder(10);
		buf.append(dayValue < 10 ? "0" : "").append(dayValue).append("(" + en + ")")
				.append(monthValue < 10 ? "-0" : "-").append(monthValue + "-");
		if (absYear < 1000) {
			if (yearValue < 0) {
				return buf.append(yearValue - 10000).deleteCharAt(1).toString();
			} else {
				return buf.append(yearValue + 10000).deleteCharAt(0).toString();
			}
		} else {
			if (yearValue > 9999) {
				return buf.append('+').toString();
			}
			return buf.append(yearValue).toString();
		}
	}
}
