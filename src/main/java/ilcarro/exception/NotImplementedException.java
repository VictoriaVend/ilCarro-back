package ilcarro.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

/**
 * @author NikolayMalikhin on 04.12.2019.
 */
public class NotImplementedException extends ResponseStatusException {
    public NotImplementedException() {
        super(HttpStatus.NOT_IMPLEMENTED);
    }
}