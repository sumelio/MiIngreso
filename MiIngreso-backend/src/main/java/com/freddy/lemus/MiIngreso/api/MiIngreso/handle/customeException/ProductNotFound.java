package com.freddy.lemus.MiIngreso.api.MiIngreso.handle.customeException;


/**
 * ProductNotFound Exception
 *
 * @since 1.0.0
 * @version 1.0.0
 * @author <a href="sumel124@gmail.com">Freddy Lemus</a>
 *
 */
public class ProductNotFound extends RuntimeException {

    public ProductNotFound(String message) {
        super(message);
    }
}