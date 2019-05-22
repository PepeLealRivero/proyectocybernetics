package com.salesianostriana.dam.cyberneticsv1.storage;



public class StorageFileNotFound extends StorageException {

    public StorageFileNotFound(String message) {
        super(message);
    }

    public StorageFileNotFound(String message, Throwable cause) {
        super(message, cause);
    }
}
