package com.example.t2008mclientt.controller;

import com.example.t2008mclientt.entity.Product;
import com.example.t2008mclientt.retrofit.RetrofitServiceGenerator;
import com.example.t2008mclientt.service.ProductService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class GetProductServlet extends HttpServlet {

    ProductService productService;

    public  GetProductServlet(){
        productService = RetrofitServiceGenerator.createService(ProductService.class);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Product> products = productService.getProducts().execute().body();
        req.setAttribute("products", products);
        req.getRequestDispatcher("/products.jsp").forward(req, resp);
    }
}
