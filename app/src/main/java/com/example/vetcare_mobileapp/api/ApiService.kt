package com.example.vetcare_mobileapp.api

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

data class RegisterRequest(
    val firstName: String,
    val lastName: String,
    val email: String,
    val password: String
)

data class LoginRequest(
    val email: String,
    val password: String
)

data class LoginResponse(
    val id: Int,
    val firstName: String,
    val lastName: String,
    val email: String,
    val token: String
)

interface ApiService {
    @Headers("Content-Type: application/json")
    @POST("api/v1/users/register")
    fun registerUser(@Body request: RegisterRequest): Call<Void>

    @Headers("Content-Type: application/json")
    @POST("api/v1/users/login")
    fun loginUser(@Body request: LoginRequest): Call<LoginResponse>

}