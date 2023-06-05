public static String findDay(int month, int day, int year) {
Calendar c = Calendar.getInstance();
c.set(year, month-1, day);
SimpleDateFormat f = new SimpleDateFormat("EEEE");
return f.format(c.getTime()).toUpperCase();




}
