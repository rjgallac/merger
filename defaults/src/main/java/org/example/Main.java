package org.example;

import org.example.service.JettyServer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        JettyServer jettyServer = new JettyServer();
        jettyServer.start();
    }
}