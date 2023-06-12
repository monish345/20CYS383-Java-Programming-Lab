package com.amrita.cys21045;

interface FileTransferListener {
    void onFileSent(String filename);

    void onFileSaved(String filename);
}
