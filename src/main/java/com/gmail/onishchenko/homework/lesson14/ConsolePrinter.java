package com.gmail.onishchenko.homework.lesson14;

public class ConsolePrinter implements Printer {
    public static class Message {
        private String sender;
        private String text;

        public Message(String sender, String text) {
            this.sender = sender;
            this.text = text;
        }

        public String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }

    @Override
    public void print(Message message) {
        if (isEmpty(message.sender) && isEmpty(message.text)) {
            Printer anonymousPrinter = new Printer() {
                @Override
                public void print(Message message) {
                    System.out.println("Empty message from anonymous is being processed...");
                }
            };
            anonymousPrinter.print(message);
        } if (isEmpty(message.sender)) {
            System.out.println("Anonymous sent a message: '" + message.text + "'");
        } else {
            System.out.println("User " + message.sender + " sent a message: '" + message.text + "'");
        }
    }

    private boolean isEmpty(String line) {
        return line == null || line.isEmpty();
    }
}
