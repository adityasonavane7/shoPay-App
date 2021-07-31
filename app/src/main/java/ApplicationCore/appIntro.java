package ApplicationCore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import com.SGTechnologies.shopay.R;
import com.github.appintro.AppIntro;
import com.github.appintro.AppIntroFragment;

import android.content.Intent;
import android.os.Bundle;

import Authentication.loginActivity;

public class appIntro extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addAppIntro();
    }


    protected void addAppIntro(){
        addSlide(AppIntroFragment.newInstance("Shopay","Shopay is an app to help with all your payment needs",
                R.drawable.ic_launcher_foreground, ContextCompat.getColor(getApplicationContext(),R.color.themeDark)));

        addSlide(AppIntroFragment.newInstance("Shopay","Shopay is an app to help with all your payment needs",
                R.drawable.ic_launcher_foreground, ContextCompat.getColor(getApplicationContext(),R.color.themeDarkest)));
    }
    @Override
    protected void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        Intent loginScreenLoader = new Intent(appIntro.this, loginActivity.class);
        startActivity(loginScreenLoader);
        finish();
    }

    @Override
    protected void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        Intent loginScreenLoader = new Intent(appIntro.this, loginActivity.class);
        startActivity(loginScreenLoader);
        finish();
    }
}