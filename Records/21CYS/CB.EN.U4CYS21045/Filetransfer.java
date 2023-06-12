package com.amrita.cys21045;

abstract class FileTransfer {
    abstract void saveFile(byte[] fileData, String filename);

    void sendFile(String filename) {
        System.out.println("Sending file: " + filename);
    }
}