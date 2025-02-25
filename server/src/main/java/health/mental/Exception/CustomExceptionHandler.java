package health.mental.Exception;

import health.mental.domain.User.UserRole;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Arrays;
import java.util.List;

@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex) {
        String message = ex.getCause().getMessage(); // Obtém a mensagem de erro original
        System.out.println(message);

        if (message.contains("UserRole")) {

            String errorMessage = "{\"error\": \"Invalid Role, Roles Available: " + Arrays.toString(UserRole.values()) +"\"}";
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
        }


        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Bad request. Please check your request data.");
    }
}

