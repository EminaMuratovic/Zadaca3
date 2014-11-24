public class Horoskop {
	public static void main(String[] args) {
		int mjesec, dan;
		do {
			System.out.println("Your day of birth? ");
			dan = TextIO.getInt();
			System.out.println("Your month of birth? ");
			mjesec = TextIO.getInt();
		} while (mjesec > 12 || dan < 0 || mjesec < 0);
		if (mjesec == 1 && dan > 20) {
			if (dan > 31) {
				System.out.println("There is no " + dan + " day in February.");
				do {
					System.out.println("Your day of birth? ");
					dan = TextIO.getInt();
					System.out.println("Your month of birth? ");
					mjesec = TextIO.getInt();
				} while (mjesec > 12 || dan < 0 || mjesec < 0);
			} else
				System.out.println("You are Aquarius!");
		}
		if (mjesec == 1 && dan < 19)
			System.out.println("You are Capricorn!");
		if (mjesec == 2 && dan < 18)
			System.out.println("You are Aquarius!");
		if (mjesec == 2 && dan > 20) {
			if (dan > 29) {
				System.out.println("There is no " + dan + " day in February.");
				do {
					System.out.println("Your day of birth? ");
					dan = TextIO.getInt();
					System.out.println("Your month of birth? ");
					mjesec = TextIO.getInt();
				} while (mjesec > 12 || dan < 0 || mjesec < 0);
			} else
				System.out.println("You are Pisces!");
		}
		if (mjesec == 3 && dan < 20) {
			System.out.println("You are Pisces!");
			do {
				System.out.println("Your day of birth? ");
				dan = TextIO.getInt();
				System.out.println("Your month of birth? ");
				mjesec = TextIO.getInt();
			} while (mjesec > 12 || dan < 0 || mjesec < 0);
		}
		if (mjesec == 3 && dan > 21) {
			if (dan > 31) {
				System.out.println("There is no " + dan + " day in Mart.");
				do {
					System.out.println("Your day of birth? ");
					dan = TextIO.getInt();
					System.out.println("Your month of birth? ");
					mjesec = TextIO.getInt();
				} while (mjesec > 12 || dan < 0 || mjesec < 0);
			} else
				System.out.println("You are Aries!");
		}
		if (mjesec == 4 && dan < 19)
			System.out.println("You are Aries!");
		if (mjesec == 4 && dan > 20) {
			if (dan > 30) {
				System.out.println("There is no " + dan + " day in April.");
				do {
					System.out.println("Your day of birth? ");
					dan = TextIO.getInt();
					System.out.println("Your month of birth? ");
					mjesec = TextIO.getInt();
				} while (mjesec > 12 || dan < 0 || mjesec < 0);
			} else
				System.out.println("You are Taurus!");
		}
		if (mjesec == 5 && dan < 20)
			System.out.println("You are Taurus!");
		if (mjesec == 5 && dan > 21) {
			if (dan > 31) {
				System.out.println("There is no " + dan + " day in May.");
				do {
					System.out.println("Your day of birth? ");
					dan = TextIO.getInt();
					System.out.println("Your month of birth? ");
					mjesec = TextIO.getInt();
				} while (mjesec > 12 || dan < 0 || mjesec < 0);
			} else
				System.out.println("You are Gemini!");
		}
		if (mjesec == 6 && dan < 20)
			System.out.println("You are Gemini!");
		if (mjesec == 6 && dan > 21) {
			if (dan > 30) {
				System.out.println("There is no " + dan + " day in June.");
				do {
					System.out.println("Your day of birth? ");
					dan = TextIO.getInt();
					System.out.println("Your month of birth? ");
					mjesec = TextIO.getInt();
				} while (mjesec > 12 || dan < 0 || mjesec < 0);
			} else
				System.out.println("You are Cancer!");
		}
		if (mjesec == 7 && dan < 22)
			System.out.println("You are Cancer!");
		if (mjesec == 7 && dan > 23) {
			if (dan > 31) {
				System.out.println("There is no " + dan + " day in July.");
				do {
					System.out.println("Your day of birth? ");
					dan = TextIO.getInt();
					System.out.println("Your month of birth? ");
					mjesec = TextIO.getInt();
				} while (mjesec > 12 || dan < 0 || mjesec < 0);
			} else
				System.out.println("You are Leo!");
		}
		if (mjesec == 8 && dan < 22)
			System.out.println("You are Leo!");
		if (mjesec == 8 && dan > 23) {
			if (dan > 31) {
				System.out.println("There is no " + dan + " day in August.");
				do {
					System.out.println("Your day of birth? ");
					dan = TextIO.getInt();
					System.out.println("Your month of birth? ");
					mjesec = TextIO.getInt();
				} while (mjesec > 12 || dan < 0 || mjesec < 0);
			} else
				System.out.println("You are Virgo!");
		}
		if (mjesec == 9 && dan < 22)
			System.out.println("You are Virgo!");
		if (mjesec == 9 && dan > 23) {
			if (dan > 30) {
				System.out
						.println("There is no " + dan + " day in Semptember.");
				do {
					System.out.println("Your day of birth? ");
					dan = TextIO.getInt();
					System.out.println("Your month of birth? ");
					mjesec = TextIO.getInt();
				} while (mjesec > 12 || dan < 0 || mjesec < 0);
			} else
				System.out.println("You are Libra!");
		}
		if (mjesec == 10 && dan < 22)
			System.out.println("You are Libra!");
		if (mjesec == 10 && dan > 21) {
			if (dan > 31) {
				System.out.println("There is no " + dan + " day in October.");
				do {
					System.out.println("Your day of birth? ");
					dan = TextIO.getInt();
					System.out.println("Your month of birth? ");
					mjesec = TextIO.getInt();
				} while (mjesec > 12 || dan < 0 || mjesec < 0);
			} else
				System.out.println("You are Scorpio!");
		}
		if (mjesec == 11 && dan < 21)
			System.out.println("You are Scorpio!");
		if (mjesec == 11 && dan > 22) {
			if (dan > 30) {
				System.out.println("There is no " + dan + " day in November.");
				do {
					System.out.println("Your day of birth? ");
					dan = TextIO.getInt();
					System.out.println("Your month of birth? ");
					mjesec = TextIO.getInt();
				} while (mjesec > 12 || dan < 0 || mjesec < 0);
			} else
				System.out.println("You are Sagittarius!");
		}
		if (mjesec == 12 && dan < 21)
			System.out.println("You are Sagittarius!");
		if (mjesec == 12 && dan > 22) {
			if (dan > 31) {
				System.out.println("There is no " + dan + " day in December.");
				do {
					System.out.println("Your day of birth? ");
					dan = TextIO.getInt();
					System.out.println("Your month of birth? ");
					mjesec = TextIO.getInt();
				} while (mjesec > 12 || dan < 0 || mjesec < 0);
			} else
				System.out.println("You are Aquarius!");
		}
	}

}
