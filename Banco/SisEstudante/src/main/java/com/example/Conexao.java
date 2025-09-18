package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/Curso";
        String usuario = "postgres";
        String senha = "123456";
        try (Connection connection = DriverManager.getConnection(url, usuario, senha)) {
            System.out.println("Conex�o realizada com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados!");
            System.out.println("Detalhes do erro: " + e.getMessage());
        }
    }
}
