//package ChapterSeven;
//
//import java.util.Scanner;
//
//import static ChapterSeven.PhoneBook.menu;
//
//public class PhoneMenu {
//
//
//    private static int service;
//    private static int file;
//    private static int time;
//    private static int remind;
//    private static int calculate;
//    private static int game;
//    private static int divert;
//    private static int set;
//    private static int tune;
//    private static int register;
//    private static int ping;
//    private static int sms;
//    private static int book;
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//            int phoneMenu = 0;
//            int phonebook = 1;
//            int message = 2;
//            int chat = 3;
//            int callRegister = 4;
//            int tones = 5;
//            int settings = 6;
//            int callDivert = 7;
//            int games = 8;
//            int calculator = 9;
//            int reminders = 10;
//            int clock = 11;
//            int profile = 12;
//            int simService = 13;
//            int menu = 0;
//            String display = "No information to display";
//            System.out.printf("%n%34s%n%s%n", "WELCOME TO DEAN'S PHONE MENU", "Press 1 to view menu or any number to exit: ");
//            int start = input.nextInt();
//            if (start == 1) {
//                System.out.printf("%n%s%n%d: %s%n%d: %s%n%d: %s%n%d: %s%n%d: %s%n%d: %s%n%d: %s%n%d: %s%n%d:" +
//                                " %s%n%d: %s%n%d: %s%n%d: %s%n%d: %s%n","**PHONE MENU**", 1, "Phonebook", 2, "Message", 3, "Chat", 4, "Call Register",
//                        5, "Tones", 6, "Settings", 7, "Call Diverts", 8, "Games",9, "Calculator", 10, "Reminders", 11, "Clock", 12, "Profile", 13, "SIM Service");
//                switch (enter()) {
//                    case 0-> {
//                        menu();
//                    }
//                    case 1-> {
//                        phonebook();
//                    }
//                    case 2-> {
//                        message();
//                    }
//                    case 3-> {
//                        chat();
//                    }
//                    case 4-> {
//                        callRegister();
//                    }
//                    case 5-> {
//                        tone();
//                    }
//                    case 6-> {
//                        settings();
//                    }
//                    case 7-> {
//                        callDivert();
//                    }
//                    case 8-> {
//                        games();
//                    }
//                    case 9-> {
//                        calculator();
//                    }
//                    case 10-> {
//                        reminders();
//                    }
//                    case 11-> {
//                        clock();
//                    }
//                    case 12-> {
//                        profile();
//                    }
//                    case 13-> {
//                        simService();
//                    }
//                    default -> {
//                        System.out.println("This is not part of the options.");
//                        menu();
//                    }
//                }
//            }
//        }
//
//    private static void simService() {
//        int simService = service;
//        while (simService = 13);
//        System.out.print("")
//
//    }
//
//    private static void profile() {
//        int profile = file;
//    }
//
//    private static void clock() {
//       int clock = time;
//    }
//
//    private static void reminders() {
//        int reminders = remind;
//    }
//
//    private static void calculator() {
//        int calculator = calculate;
//    }
//
//    private static void games() {
//        int games = game;
//    }
//
//    private static void callDivert() {
//       int callDivert = divert;
//    }
//
//    private static void settings() {
//        int settings = set;
//    }
//
//    private static void tone() {
//        int tone = tune;
//    }
//
//    private static void callRegister() {
//        int callRegister = register;
//    }
//
//    private static void chat() {
//        int chat = ping;
//    }
//
//    private static void message() {
//        int message = sms;
//    }
//
//    private static void phonebook() {
//        int phonebook = book;
//    }
//
//    static int enter() {
//        return 0;
//    }
//
//    public static void setService(int service) {
//        PhoneMenu.service = service;
//    }
//
//    public static void setFile(int file) {
//        PhoneMenu.file = file;
//    }
//
//    public static void setTime(int time) {
//        PhoneMenu.time = time;
//    }
//
//    public static void setRemind(int remind) {
//        PhoneMenu.remind = remind;
//    }
//
//    public static void setCalculate(int calculate) {
//        PhoneMenu.calculate = calculate;
//    }
//
//    public static void setGame(int game) {
//        PhoneMenu.game = game;
//    }
//
//    public static void setDivert(int divert) {
//        PhoneMenu.divert = divert;
//    }
//
//    public static void setSet(int set) {
//        PhoneMenu.set = set;
//    }
//
//    public static void setTune(int tune) {
//        PhoneMenu.tune = tune;
//    }
//
//    public static void setRegister(int register) {
//        PhoneMenu.register = register;
//    }
//
//    public static void setPing(int ping) {
//        PhoneMenu.ping = ping;
//    }
//
//    public static void setSms(int sms) {
//        PhoneMenu.sms = sms;
//    }
//
//    public static void setBook(int book) {
//        PhoneMenu.book = book;
//    }
//}
//
