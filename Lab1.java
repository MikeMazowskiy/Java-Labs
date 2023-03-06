class Lab1
{
	  public static void main(String[] args) {
        String firstName = "Nestor";
        String middleName = "Ivanovich";
        String lastName = "Makhno";
        String teacherFirstName = "John";
        String teacherMiddleName = "Ihon";
        String teacherLastName = "Doe";
        String groupCode = "ИВТ/б-12о";

        Date date = new Date();

        int variant = 17;
        int Duration1InMinutes = 45;
        int Duration2InMinutes = 44;
        double DurationInHours = (double)(Duration1InMinutes + Duration2InMinutes)/60;

        String fullName = fullName(lastName, firstName, middleName);
        String fullTeacherName = fullName(teacherLastName, teacherFirstName, teacherMiddleName);

        System.out.println("Прогрумму выполнил: \n" + fullName);
        System.out.println("Дата: " + date);
        System.out.println("Вариант: " + variant);
        System.out.println("Шифр группы: " + groupCode);
        System.out.println("Длительность первой серии в минутах: " + Duration1InMinutes);
        System.out.println("Длительность второй серии в минутах: " + Duration2InMinutes);
        System.out.println("Длительность фильма в часах: " + DurationInHours);
        System.out.println("Проверил: \n" + fullTeacherName);
    }

    public static String fullName(String a, String b, String c) {
        return a + " " + b + " " + c;
    }
}    
