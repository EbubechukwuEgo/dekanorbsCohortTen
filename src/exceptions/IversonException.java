package exceptions;

import java.io.IOException;

public class IversonException extends RuntimeException {

    public IversonException(String message, IOException e){
        super(message, e);
    }
}
