package com.gmail.onishchenko.homework.lesson14;

public class PrinterRunner {
    public static void main(String[] args) {
        ConsolePrinter.Message[] messages = {
                new ConsolePrinter.Message("Santa", "Ho-ho-ho"),
                new ConsolePrinter.Message("", "hidden message"),
                new ConsolePrinter.Message(null, "Hello)"),
                new ConsolePrinter.Message(null, ""),
                new ConsolePrinter.Message("Peter Parker", "I'm a photograph")};
        ConsolePrinter printer = new ConsolePrinter();

        for (ConsolePrinter.Message message : messages) {
            printer.print(message);
        }
    }
}
