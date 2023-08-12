package com.example.apiintegrationusingretrofitinspringboot.thirdpartyinterface;

import com.example.apiintegrationusingretrofitinspringboot.entity.Product;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface RetrofitAPI {

   @GET(value="/api/products/findAll")
    Call<List<Product>> getAllProducts();

    @POST(value="/api/products/insert")
    Call<Product> insertProduct(@Body Product product);

    @PUT(value="/api/products/update/{id}")
    Call<Product> updateProduct(@Body Product product ,@Path("id") Integer id);

    @DELETE(value="/api/products/delete/{id}")
    Call<Product> deleteProduct(@Path("id") Integer id);
}
