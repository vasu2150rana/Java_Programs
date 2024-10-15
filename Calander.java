import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Calander {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter year (e.g., 2024): ");
                int year = scanner.nextInt();

                System.out.print("Enter month (1-12): ");
                int month = scanner.nextInt();
                displayCalendar(year, month);
        }

        public static void displayCalendar(int year, int month) {
                month -= 1;
                GregorianCalendar calendar = new GregorianCalendar(year, month, 1);
                int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
                int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
                System.out.println("\n   Calendar for " + calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, java.util.Locale.getDefault()) + " " + year);
                System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
                for (int i = 1; i < firstDayOfWeek; i++) {
                        System.out.print("    ");
                }
                for (int day = 1; day <= daysInMonth; day++) {
                        System.out.printf("%4d", day);
                        if ((day + firstDayOfWeek - 1) % 7 == 0) {
                                System.out.println();
                        }
                }
                System.out.println();
        }
}import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter year (e.g., 2024): ");
                int year = scanner.nextInt();

                System.out.print("Enter month (1-12): ");
                int month = scanner.nextInt();
                displayCalendar(year, month);
        }

        public static void displayCalendar(int year, int month) {
                month -= 1;
                GregorianCalendar calendar = new GregorianCalendar(year, month, 1);
                int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
                int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
                System.out.println("\n   Calendar for " + calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, java.util.Locale.getDefault()) + " " + year);
                System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
                for (int i = 1; i < firstDayOfWeek; i++) {
                        System.out.print("    ");
                }
                for (int day = 1; day <= daysInMonth; day++) {
                        System.out.printf("%4d", day);
                        if ((day + firstDayOfWeek - 1) % 7 == 0) {
                                System.out.println();
                        }
                }
                System.out.println();
        }
}
