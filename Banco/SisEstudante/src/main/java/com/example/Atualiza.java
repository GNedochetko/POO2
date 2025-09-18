package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class Atualiza {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/Curso";
        String usuario = "postgres";
        String senha = "123456";

        String sql = "UPDATE estudante SET nome = ? WHERE estudante_id = ?";

        try (Connection connection = DriverManager.getConnection(url, usuario, senha);
             PreparedStatement statement = connection.prepareStatement(sql)) {

            System.out.println("Conexao realizada com sucesso!");

            statement.setString(1, "Vitor Andre");
            statement.setInt(2, 1);

            statement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erro na operacao com o banco de dados!");
            System.out.println("Detalhes: " + e.getMessage());
        }
    }
}