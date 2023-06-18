package org.example;

import org.example.service.JettyServer;

public class Main {
    public static void main(String[] args) throws Exception {
        JettyServer jettyServer = new JettyServer();
        jettyServer.start();
    }

}