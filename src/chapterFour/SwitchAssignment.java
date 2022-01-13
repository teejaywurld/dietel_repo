package chapterFour;

import java.util.Scanner;

public class SwitchAssignment {
        public static void main(String[] args) {
            String menu = """
                For Phone book, Press 1
                For Messages, Press 2
                For Chat, Press 3
                For Call register, Pres 4
                For Tones, Press 5
                For Settings, Press 6
                For Call divert, Press 7
                For Games, Press 8
                For Calculator, Press 9
                For Reminders, Press 10
                For Clock, Press 11
                For Profiles, Press 12
                For SIM services, Press 13
                """;
            System.out.println(menu);
            Scanner scanner = new Scanner(System.in);
            int userChoice = scanner.nextInt();
            switch (userChoice) {
                case 1:
                    System.out.println("Phonebook Menu");
                    System.out.println("1. Search");
                    System.out.println("2. Service Nos ");
                    System.out.println("3. Add name");
                    System.out.println("4. Erase");
                    System.out.println("5. Edit");
                    System.out.println("6. Assign tone");
                    System.out.println("7. Send b'card");
                    System.out.println("8. Options: For more options");
                    System.out.println("Enter '1' or '2' for more information");
                    int Options = scanner.nextInt();
                    switch (Options) {
                        case 1:
                            System.out.println("1. Type of view");
                            break;
                        case 2:
                            System.out.println("2. Memory status");
                            break;
                    }

                    System.out.println("9. Speed dials");
                    System.out.println("10. Voice tags");

                case 2:
                    System.out.println("Message menu");
                    System.out.println("1. Write messages");
                    System.out.println("2. Inbox");
                    System.out.println("3. Outbox");
                    System.out.println("4. Picture messages");
                    System.out.println("5. Templates");
                    System.out.println("6. Smileys");
                    System.out.println("7. Message settings");
                    System.out.println("Press 1 or 2 to Set");
                    int Set = scanner.nextInt();
                    switch (Set) {
                        case 1:
                            System.out.println("1. Set 1");
                    }

                    System.out.println("Select Option");
                    int Set1 = scanner.nextInt();
                    switch (Set1) {
                        case 1:
                            System.out.println("1. Message centre number");
                            break;
                        case 2:
                            System.out.println("2. Message sent as");
                            break;
                        case 3:
                            System.out.println("3. Message validity");
                            break;
                    }
                    System.out.println("For more options, Press 2");
                    int Common = scanner.nextInt();
                    switch (Common) {
                        case 1:
                            System.out.println("2. Common");
                    }

                    switch (Common) {
                        case 1:
                            System.out.println("1. Delivery reports");
                            break;
                        case 2:
                            System.out.println("2. Reply via same centre");
                            break;
                        case 3:
                            System.out.println("3. Character support");
                    }

                    System.out.println("8. Info service");
                    System.out.println("9. Voice mailbox number");
                    System.out.println("10. Service command editor");

                case 3:
                    System.out.println("3. Chat");

                case 4:
                    System.out.println("4. Call register");
                    System.out.println("Press '1' or '2' or '3' or '4' or '5' for options");
                    int Callregister = scanner.nextInt();
                    switch (Callregister) {
                        case 1:
                            System.out.println("1. Missed calls");
                            break;
                        case 2:
                            System.out.println("2. Received calls");
                            break;
                        case 3:
                            System.out.println("3. Dialled numbers");
                            break;
                        case 4:
                            System.out.println("4. Erase recent call lists");
                            break;
                        case 5:
                            System.out.println("5. Show call duration");
                            String duration = """
                                1. Last call duration
                                2. All calls' duration
                                3. Receievd calls' duration
                                4. Dialled calls' duration
                                5. Clear timers
                                """;
                            System.out.println(duration);
                            break;
                    }
                case 6:
                    System.out.println("6. Show call costs");
                    String costs = """
                                1. Last call cost
                                2. All calls' cost
                                3. Clear counters
                                """;
                    System.out.println(costs);
                case 7:
                    System.out.println("7. Call cost settings");
                    String settings = """
                                1. Call cost limit
                                2. Show costs in
                                """;
                    System.out.println(settings);
                case 8:
                    System.out.println("8. Prepaid credit");

            }
            System.out.println("5. Tones");
            String Tones = """
                        1. Ringing tone
                        2. Ringing volume
                        3. Incoming call alert
                        4. Composer
                        5. Message alert tone
                        6. Keypad tones
                        7. Warning and game tones
                        8. Vibrating alert
                        9. Screen saver
                        """;
            System.out.println(Tones);

            System.out.println("6. Settings");
            int Settings = scanner.nextInt();
            switch (Settings){
                case 1:
                    System.out.println("1. Call settings");
                    String settings = """
                            1. Automatic redial
                            2. Speed dialling
                            3. Call waiting options
                            4. Own number sending
                            5. Phone in use
                            6. Automatic answer
                            """;
                    System.out.println(settings);
            }
            System.out.println("2. Phone settings");
            String Phone = """
                        1. Language
                        2. Cell info display
                        3. Welcome note
                        4. Network selection
                        5. Lights
                        6. Confirm SIM service actions
                        """;
            System.out.println(Phone);

            System.out.println("3. Security settings");
            String Security = """
                1. PIN code request
                2. Call baring service
                3. Fixed dialling
                4. Closed user group
                5. Phone security
                6. Change access codes
                """;
            System.out.println(Security);

            System.out.println("4. Restore factory settings");

            System.out.println("7. Call divert");

            System.out.println("8. Games");

            System.out.println("9. Calculator");

            System.out.println("10. Reminders");

            System.out.println("11. Clock");
            int Clock = scanner.nextInt();
            switch (Clock){
                case 1:
                    System.out.println("1. Alarm clock");
                    break;
                case 2:
                    System.out.println("2. Clock settings");
                    break;
                case 3:
                    System.out.println("3. Date setting");
                    break;
                case 4:
                    System.out.println("4. Stopwatch");
                    break;
                case 5:
                    System.out.println("5. Countdown timer");
                    break;
                case 6:
                    System.out.println("6. Auto update of date and time");
                    break;
            }

            System.out.println("12. Profiles");

            System.out.println("13. SIM services");


        }

    }
