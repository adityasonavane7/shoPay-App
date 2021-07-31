package com.SGTechnologies.shopay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieDrawable;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import ApplicationCore.appIntro;
import Authentication.loginActivity;

public class loadingScreen extends AppCompatActivity {
    LottieAnimationView loadingAnimation; // Lottie Animations for Loading
    private FirebaseAuth mAuth; //Use Firebase Authentication for App authentication
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_screen);

        loadingAnimation = (LottieAnimationView)findViewById(R.id.loadingAnimation);
        loadingAnimation.setRepeatCount(LottieDrawable.INFINITE);
        loadingAnimation.playAnimation();

        mAuth = FirebaseAuth.getInstance();
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if (currentUser == null){
            Log.d("Login Issue","No Login Found");
            //TODO make Login Screen
            Intent loadLoginScreen = new Intent(loadingScreen.this, appIntro.class);
            startActivity(loadLoginScreen);
            finish();
        }
        else{
            Log.d("Login Success",currentUser.toString());
            //TODO Send User to Dashboard
        }
    }
}