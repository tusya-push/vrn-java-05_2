package ru.dataart.academy.java.exceptions;

public class OutOfIntRangeException extends RuntimeException {

    public OutOfIntRangeException(long l) {
        super(l + " is out of int range [-2147483648,  2147483647]");
    }

}
