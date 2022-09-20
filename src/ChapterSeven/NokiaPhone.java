package ChapterSeven;

public class NokiaPhone {
    public void getPhoneBookOption() {
        System.out.println("");
        System.out.printf("%d. %s%n%d. %s%n%d. %s%n%d. %s%n%d. %s%n%d. %s%n%d. %s%n",
                1, "Search",
                2, "Search No",
                3, "Add name",
                4, "Erase",
                5, "Edit" ,
                6, "Assign tone",
                7, "Options");
    }
    public void getSearchOption() {
        System.out.println("Search option");
        System.out.printf("%d. %s%n%d. %s%n%d. %s%n%d. %s%n%d. %s%n%d. %s%n%d. %s%n%n%s%n",
                1, "Search Contact",
                2, "Search Dialed number",
                3, "Search Missed calls",
                4, "Search Received calls",
                5, "Search Call log" ,
                6, "Search Call History",
                7, "Search Call settings");

    }
    public void getSearchNoOption() {
        System.out.println("Search No option");
        System.out.printf("%d. %s%n%d. %s%n%d. %s%n%d. %s%n%d. %s%n%d. %s%n%d. %s%n%n%s%n",
                1, "Search No Contact",
                2, "Search No Dialed number",
                3, "Search No Missed calls",
                4, "Search No Received calls",
                5, "Search No Call log",
                6, "Search NO Call History",
                7, "Search No Call settings");

    }
    public void getAddNameOption() {
        System.out.println("Add name option");
        System.out.printf("%d. %s%n%d. %s%n",
                1, "Add new name to new Contact",
                2, "Add new name to old contact");
    }

    public void getEditOption() {
        System.out.println("Edit option");
        System.out.printf("%d. %s%n%d. %s%n%n%s%n",
                1, "Edit name to new Contact",
                2, "Edit name of old contact");
    }

    public void getEraseOption() {
        System.out.println("Erase option");
        System.out.printf("%d. %s%n%d. %s%n%n",
                1, "Erase name from new Contact",
                2, "Erase name from old contact");
    }

    public void getAssignToneOption() {
        System.out.println("Tone settings");
        System.out.printf("%d. %s%n%d. %s%n",
                1, "Choose Ringtone",
                2, "Change Ringtone");
    }
    public void getPhoneOptions() {
        System.out.println("Phone options");
        System.out.printf("%d. %s%n%d. %s%n%n",
                1, "Type of view",
                2, "Memory status");
    }

    public void getMessage() {
        System.out.println("Message menu");
        System.out.printf("%d. %s%n%d. %s%n%d. %s%n%d. %s%n%d. %s%n",
                1, "Write messages",
                2, "Inbox",
                3, "Outbox",
                4, "Message settings",
                0, "Menu");
    }

    public void getWriteMessagesOption() {
        System.out.println("Write Message");
        System.out.printf("%d. %s%n%d. %s%n%d. %s%n%d. %s%n",
                1, "Compose new message",
                2, "Make as draft",
                3, "Delete composed message",
                4, "Edit composed message");
    }
    public void getInbox() {
        System.out.println("Inbox");
        System.out.printf("%d. %s%n%d. %s%n%d. %s%n%d. %s%n",
                1, "New messages list",
                2, "Mark message as read",
                3, "Unread message",
                4, "Receive message notifications");
    }
    public void getOutbox() {
        System.out.println("Outbox");
        System.out.printf("%d. %s%n%d. %s%n%d. %s%n%d. %s%n",
                1, "Sent messages List",
                2, "Mark message as sent",
                3, "Unread message",
                4, " Forward messages");
    }
    public void getMessageSettings() {
        System.out.println("Message settings");
        System.out.printf("%d. %s%n%d. %s%n%d. %s%n%d. %s%n",
                1, "Composition settings",
                2, "Outbox settings",
                3, "Inbox settings",
                4, "Select sim1 or sim2 to send message");
    }


    public void getCallRegister() {
        System.out.println("Call register");
        System.out.printf("%d. %s%n%d. %s%n%d. %s%n%d. %s%n",
                1, "Call history",
                2, "Dialed contacts",
                3, "Add Favourite contacts",
                4, "Delete call logs");
    }

    public void getCallLogs() {
        System.out.println("Call logs");
        System.out.printf("%d. %s%n%d. %s%n%d. %s%n%d. %s%n",
                1, "Accounts",
                2, "Labels",
                3, "Switch sim",
                4, "Call center");
    }

    public void getRecent() {
        System.out.println("Recent");
        System.out.printf("%d. %s%n%d. %s%n%d. %s%n%d. %s%n",
                1, "Search options",
                2, "Today",
                3, "Yesterday",
                4, "Older");
    }

    public void getContacts() {
        System.out.println("Contacts");
        System.out.printf("%d. %s%n%d. %s%n%d. %s%n%d. %s%n",
                1, "Search options",
                2, "My profile",
                3, "Edit profile",
                4, "Create new contact");
    }

    public void getProfile() {
        System.out.println("Profile");
        System.out.printf("%d. %s%n%d. %s%n%d. %s%n%d. %s%n",
                1, "Create new contact account",
                2, "Dialed contacts",
                3, "Add Favourite contacts",
                4, "Delete call logs");
    }

    public void getSoundStatus() {
        System.out.println("Sound status");
        System.out.printf("%d. %s%n%d. %s%n%d. %s%n%d. %s%n",
                1, "Do not disturb",
                2, "Default notification sound",
                3, "Vibrate for calls",
                4, "Sound enhancement");
    }

    public void getRingTone() {
        System.out.println("Ring tone");
        System.out.printf("%d. %s%n%d. %s%n%d. %s%n%d. %s%n",
                1, "Phone ring tone 1",
                2, "Phone ring tone 2",
                3, "Increasing incoming ring tone",
                4, "Ring volume");
    }

    public void getMyPhone() {
        System.out.println("My Phone");
        System.out.printf("%d. %s%n%d. %s%n%d. %s%n%d. %s%n",
                1, "Device name",
                2, "Model",
                3, "Phone version",
                4, "Sim status");
    }

    public void getMobileNetwork() {
        System.out.println("Mobile network");
        System.out.printf("%d. %s%n%d. %s%n%d. %s%n%d. %s%n",
                1, "Mobile data",
                2, "Allow calls",
                3, "SMS messages",
                4, "Data settings & Data usage");
    }

    public void getWifiSetting() {
        System.out.println("Wifi settings");
        System.out.printf("%d. %s%n%d. %s%n%d. %s%n%d. %s%n",
                1, "Switch on/off wifi",
                2, "Wifi smart comm",
                3, "Saved networks",
                4, "Wifi data usage");
    }

    public void getDisplay() {
        System.out.println("Display and Brightness");
        System.out.printf("%d. %s%n%d. %s%n%d. %s%n%d. %s%n",
                1, "Wallpaper",
                2, "Font size",
                3, "Lock screen",
                4, "Screen timeout");
    }

    public void Storage() {
        System.out.println("Storage");
        System.out.printf("%d. %s%n%d. %s%n%d. %s%n",
                1, "RAM",
                2, "Internal shared storage",
                3, "Low storage management");
    }

    public void Security() {
        System.out.println("Security");
        System.out.printf("%d. %s%n%d. %s%n%d. %s%n%d. %s%n",
                1, "Fingerprint",
                2, "Password/Pattern",
                3, "Screen lock",
                4, "Smart lock");
    }

    public void getSetting() {
        System.out.println("Setting");
        System.out.printf("%d. %s%n%d. %s%n%d. %s%n%d. %s%n%d. %s%n,%d. %s%n",
                1, "My Phone",
                2, "Mobile Network",
                3, "Wifi Setting",
                4, "Display",
                5, "Storage",
                6, "Security"

        );
    }
}
