package com.example.t2008mclientt.service;

import com.example.t2008mclientt.entity.Product;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface ProductService {
    @GET("/api/v1/products")
    public Call<List<Product>> getProducts();

    @GET("/api/v1/products/{id}")
    public  Call<Product> getProductDetail(@Path("id") int id);
    @POST("/api/v1/products")
    public Call<Product> save(@Body Product product);
    @PUT("api/v1/products/{id}")
    public  Call<Product> update(@Body Product product, @Path("id") int id);
    @DELETE("/api/v1/products/{id}")
    public  Call<Boolean> delete(@Path("id") int id);
}
