package zuoix.com.zoomed.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

import zuoix.com.zoomed.BaseApplication;
import zuoix.com.zoomed.CommandModel;
import zuoix.com.zoomed.R;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        BaseApplication.instance.onCreate();
        BaseApplication.getInstance().firstGenerationCommand.add(new CommandModel("Hello ","Command hello", getResources().getDrawable( R.drawable.default_command)));
        BaseApplication.getInstance().firstGenerationCommand.add(new CommandModel("Hello1 ","Command hello",getResources().getDrawable( R.drawable.default_command)));
        BaseApplication.getInstance().firstGenerationCommand.add(new CommandModel("Hello2 ","Command hello",getResources().getDrawable( R.drawable.default_command)));
        BaseApplication.getInstance().firstGenerationCommand.add(new CommandModel("Hello3 ","Command hello",getResources().getDrawable( R.drawable.default_command)));
        BaseApplication.getInstance().firstGenerationCommand.add(new CommandModel("Hello4 ","Command hello",getResources().getDrawable( R.drawable.default_command)));
        BaseApplication.getInstance().firstGenerationCommand.add(new CommandModel("Hello5 ","Command hello",getResources().getDrawable( R.drawable.default_command)));
        BaseApplication.getInstance().firstGenerationCommand.add(new CommandModel("Hello6 ","Command hello",getResources().getDrawable( R.drawable.default_command)));
        BaseApplication.getInstance().firstGenerationCommand.add(new CommandModel("Hello7 ","Command hello",getResources().getDrawable( R.drawable.default_command)));

        BaseApplication.getInstance().firstGenerationCommand.add(new CommandModel("Hello ","Command hello",getResources().getDrawable( R.drawable.default_command)));
        BaseApplication.getInstance().firstGenerationCommand.add(new CommandModel("Hello1 ","Command hello",getResources().getDrawable( R.drawable.default_command)));
        BaseApplication.getInstance().firstGenerationCommand.add(new CommandModel("Hello2 ","Command hello",getResources().getDrawable( R.drawable.default_command)));
        BaseApplication.getInstance().firstGenerationCommand.add(new CommandModel("Hello3 ","Command hello",getResources().getDrawable( R.drawable.default_command)));
        BaseApplication.getInstance().firstGenerationCommand.add(new CommandModel("Hello4 ","Command hello",getResources().getDrawable( R.drawable.default_command)));
        BaseApplication.getInstance().firstGenerationCommand.add(new CommandModel("Hello5 ","Command hello",getResources().getDrawable( R.drawable.default_command)));
        BaseApplication.getInstance().firstGenerationCommand.add(new CommandModel("Hello6 ","Command hello",getResources().getDrawable( R.drawable.default_command)));
        BaseApplication.getInstance().firstGenerationCommand.add(new CommandModel("Hello7 ","Command hello",getResources().getDrawable( R.drawable.default_command)));

        //second generation
        BaseApplication.getInstance().secondGenerationCommand.add(new CommandModel("bigginner 1","",getResources().getDrawable( R.drawable.default_command)));
        BaseApplication.getInstance().secondGenerationCommand.add(new CommandModel("bigginner 2","",getResources().getDrawable( R.drawable.default_command)));
        BaseApplication.getInstance().secondGenerationCommand.add(new CommandModel("bigginner 3","",getResources().getDrawable( R.drawable.default_command)));
        BaseApplication.getInstance().secondGenerationCommand.add(new CommandModel("bigginner 4","",getResources().getDrawable( R.drawable.default_command)));
        BaseApplication.getInstance().secondGenerationCommand.add(new CommandModel("bigginner 5","",getResources().getDrawable( R.drawable.default_command)));
        BaseApplication.getInstance().secondGenerationCommand.add(new CommandModel("bigginner 6","",getResources().getDrawable( R.drawable.default_command)));
        BaseApplication.getInstance().secondGenerationCommand.add(new CommandModel("bigginnerb7","",getResources().getDrawable( R.drawable.default_command)));

        //third generation
        BaseApplication.getInstance().thirdGenerationCommand.add(new CommandModel("generation 1","",getResources().getDrawable( R.drawable.default_command)));
        BaseApplication.getInstance().thirdGenerationCommand.add(new CommandModel("generation 2","",getResources().getDrawable( R.drawable.default_command)));
        BaseApplication.getInstance().thirdGenerationCommand.add(new CommandModel("generation fffffffffff","",getResources().getDrawable( R.drawable.default_command)));
        BaseApplication.getInstance().thirdGenerationCommand.add(new CommandModel("generation 3","",getResources().getDrawable( R.drawable.default_command)));
        BaseApplication.getInstance().thirdGenerationCommand.add(new CommandModel("generation 4","",getResources().getDrawable( R.drawable.default_command)));
        BaseApplication.getInstance().thirdGenerationCommand.add(new CommandModel("generationv5","",getResources().getDrawable( R.drawable.default_command)));
        BaseApplication.getInstance().thirdGenerationCommand.add(new CommandModel("generation 6","",getResources().getDrawable( R.drawable.default_command)));


        new Thread(){
            @Override
            public void run() {
                super.run();
                try {
                    sleep(3000);
                    startActivity(new Intent(SplashScreen.this, MainActivity.class));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }.start();


    }
}
