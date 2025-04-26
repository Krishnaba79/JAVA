package com.example.controller;

import com.example.dao.ProducerDAO;
import com.example.model.Producer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/producers")
public class ProducerServlet extends HttpServlet {
    private ProducerDAO producerDAO;

    @Override
    public void init() {
        producerDAO = new ProducerDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "list";
        }

        try {
            switch (action) {
                case "new":
                    showNewForm(request, response);
                    break;
                case "insert":
                    insertProducer(request, response);
                    break;
                case "delete":
                    deleteProducer(request, response);
                    break;
                case "edit":
                    showEditForm(request, response);
                    break;
                case "update":
                    updateProducer(request, response);
                    break;
                default:
                    listProducers(request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }

    private void listProducers(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        List<Producer> listProducers = producerDAO.getAllProducers();
        request.setAttribute("listProducers", listProducers);
        request.getRequestDispatcher("/views/viewProducers.jsp").forward(request, response);
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/views/addProducer.jsp").forward(request, response);
    }

    private void insertProducer(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        String name = request.getParameter("name");
        String companyName = request.getParameter("companyName");
        Producer producer = new Producer();
        producer.setName(name);
        producer.setCompanyName(companyName);
        producerDAO.addProducer(producer);
        response.sendRedirect("producers?action=list");
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        int producerId = Integer.parseInt(request.getParameter("producerId"));
        Producer existingProducer = producerDAO.getAllProducers().stream().filter(p -> p.getProducerId() == producerId).findFirst().orElse(null);
        request.setAttribute("producer", existingProducer);
        request.getRequestDispatcher("/views/addProducer.jsp").forward(request, response);
    }

    private void updateProducer(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        int producerId = Integer.parseInt(request.getParameter("producerId"));
        String name = request.getParameter("name");
        String companyName = request.getParameter("companyName");

        Producer producer = new Producer();
        producer.setProducerId(producerId);
        producer.setName(name);
        producer.setCompanyName(companyName);

        producerDAO.updateProducer(producer);
        response.sendRedirect("producers?action=list");
    }

    private void deleteProducer(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        int producerId = Integer.parseInt(request.getParameter("producerId"));
        producerDAO.deleteProducer(producerId);
        response.sendRedirect("producers?action=list");
    }
}
