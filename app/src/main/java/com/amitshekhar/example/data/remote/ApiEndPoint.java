package com.amitshekhar.example.data.remote;

/**
 * Created by amitshekhar on 13/01/17.
 */

public final class ApiEndPoint {

    private static final String BASE_URL = "https://fierce-cove-29863.herokuapp.com";
    public static final String GET_DATA = BASE_URL + "/getAllUsers/{pageNumber}";
}
