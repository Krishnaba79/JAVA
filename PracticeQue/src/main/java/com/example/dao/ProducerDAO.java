package com.example.dao;

import com.example.model.Producer;
import com.example.util.DatabaseUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProducerDAO {
    public void addProducer(Producer producer) throws SQLException {
        String query = "INSERT INTO producers (name, company_name) VALUES (?, ?)";
        try (Connection connection = DatabaseUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, producer.getName());
            preparedStatement.setString(2, producer.getCompanyName());
            preparedStatement.executeUpdate();
        }
    }

    public List<Producer> getAllProducers() throws SQLException {
        List<Producer> producers = new ArrayList<>();
        String query = "SELECT * FROM producers";
        try (Connection connection = DatabaseUtil.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
            while (resultSet.next()) {
                Producer producer = new Producer();
                producer.setProducerId(resultSet.getInt("producer_id"));
                producer.setName(resultSet.getString("name"));
                producer.setCompanyName(resultSet.getString("company_name"));
                producers.add(producer);
            }
        }
        return producers;
    }

    public void updateProducer(Producer producer) throws SQLException {
        String query = "UPDATE producers SET name = ?, company_name = ? WHERE producer_id = ?";
        try (Connection connection = DatabaseUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, producer.getName());
            preparedStatement.setString(2, producer.getCompanyName());
            preparedStatement.setInt(3, producer.getProducerId());
            preparedStatement.executeUpdate();
        }
    }

    public void deleteProducer(int producerId) throws SQLException {
        String query = "DELETE FROM producers WHERE producer_id = ?";
        try (Connection connection = DatabaseUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, producerId);
            preparedStatement.executeUpdate();
        }
    }
}
