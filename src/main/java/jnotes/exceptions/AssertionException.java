package jnotes.exceptions;

public class AssertionException extends RuntimeException{

    public AssertionException(String msg){
        super("An issue had occurred running an assertion: " + msg);
    }

}
