package org.example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Log {

    public static  final Logger logging= LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        logging.info("Program Started");
        logging.warn("There Is A Warning");
        logging.error("There Is A Error");

        System.out.println("Hello world!");
        logging.info("Program Completed");
    }
}