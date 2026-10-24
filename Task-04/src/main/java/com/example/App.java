package com.example;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

public class App {

    public static void main(String[] args) throws IOException {

        int port = Integer.parseInt(
                System.getenv().getOrDefault("PORT", "8080")
        );

        HttpServer server = HttpServer.create(
                new InetSocketAddress("0.0.0.0", port), 0
        );

        server.createContext("/", App::handleRequest);

        server.start();

        System.out.println(
                "Task 4 Java application started on port " + port
        );
    }

    private static void handleRequest(HttpExchange exchange)
            throws IOException {

        String path = exchange.getRequestURI().getPath();

        String response;

        if ("/health".equals(path)) {
            response = """
                    {
                      "status": "UP",
                      "application": "Task 4 Java Docker App"
                    }
                    """;
        } else {
            response = """
                    <!DOCTYPE html>
                    <html lang="en">
                    <head>
                        <meta charset="UTF-8">
                        <meta name="viewport"
                              content="width=device-width, initial-scale=1">
                        <title>Task 4 - Java Docker</title>
                    </head>
                    <body>
                        <h1>Task 4: Java Docker Application</h1>
                        <p>Status: Running successfully!</p>
                        <p>Java 21 | Maven | Docker Multi-Stage Build</p>
                        <p>Security: Non-root container execution</p>
                        <a href="/health">Health Check</a>
                    </body>
                    </html>
                    """;
        }

        byte[] body = response.getBytes(StandardCharsets.UTF_8);

        if ("/health".equals(path)) {
            exchange.getResponseHeaders().set(
                    "Content-Type", "application/json; charset=UTF-8"
            );
        } else {
            exchange.getResponseHeaders().set(
                    "Content-Type", "text/html; charset=UTF-8"
            );
        }

        exchange.getResponseHeaders().set(
                "X-Content-Type-Options", "nosniff"
        );

        exchange.getResponseHeaders().set(
                "Cache-Control", "no-store"
        );

        exchange.sendResponseHeaders(200, body.length);

        try (var output = exchange.getResponseBody()) {
            output.write(body);
        }
    }
}
