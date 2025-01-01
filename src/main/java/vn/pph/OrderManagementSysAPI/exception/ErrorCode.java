package vn.pph.OrderManagementSysAPI.exception;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public enum ErrorCode {
    PRODUCT_NOT_FOUND(1100, "Product not found", HttpStatus.BAD_REQUEST),
    PRODUCT_EXITED(1101, "Product already exited", HttpStatus.BAD_REQUEST)
    ;
    int code;
    String message;
    HttpStatus statusCode;
    ErrorCode(int code, String message, HttpStatus statusCode) {
        this.code = code;
        this.message = message;
        this.statusCode = statusCode;
    }
}
