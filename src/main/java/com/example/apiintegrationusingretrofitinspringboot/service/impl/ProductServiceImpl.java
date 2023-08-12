package com.example.apiintegrationusingretrofitinspringboot.service.impl;

import com.example.apiintegrationusingretrofitinspringboot.entity.Product;
import com.example.apiintegrationusingretrofitinspringboot.service.ProductService;
import com.example.apiintegrationusingretrofitinspringboot.thirdpartyinterface.RetrofitAPI;
import com.example.apiintegrationusingretrofitinspringboot.util.RetrofitUtil;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {

     private Retrofit retrofit;

     private RetrofitAPI retrofitAPI;
    public ProductServiceImpl(){
        retrofit  = RetrofitUtil.getRetrofit();
        retrofitAPI = retrofit.create(RetrofitAPI.class);
    }


    @Override
    public List<Product> getAllProducts() {
     List<Product>  productResponse  = new ArrayList<>();
        Call<List<Product>>  response  = retrofitAPI.getAllProducts();

        try {
                  Response<List<Product>> finalResponse =  response.execute();

                  if(finalResponse.isSuccessful() && finalResponse.body()  !=null) {
                    productResponse = finalResponse.body();
                  }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return productResponse;
    }

    @Override
    public Product insert(Product product) {
        Product productResponse   = null;
        Call<Product>  response  = retrofitAPI.insertProduct(product);

        try {
            Response<Product> finalResponse =  response.execute();

            if(finalResponse.isSuccessful() && finalResponse.body()  !=null) {
                productResponse = finalResponse.body();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return productResponse;
    }

    @Override
    public Product update(Product product, Integer id) {
        Product productResponse   = null;
        Call<Product>  response  = retrofitAPI.updateProduct(product , id);

        try {
            Response<Product> finalResponse =  response.execute();

            if(finalResponse.isSuccessful() && finalResponse.body()  !=null) {
                productResponse = finalResponse.body();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return productResponse;
    }

    @Override
    public Product delete(Integer id) {
        Product productResponse   = null;
        Call<Product>  response  = retrofitAPI.deleteProduct(id);

        try {
            Response<Product> finalResponse =  response.execute();

            if(finalResponse.isSuccessful() && finalResponse.body()  !=null) {
                productResponse = finalResponse.body();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return productResponse;
    }
}
