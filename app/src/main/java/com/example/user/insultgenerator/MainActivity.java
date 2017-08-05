package com.example.user.insultgenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String [] insultCol1 = new String[] {"Ancient","Rotten","Stinky","Lame","Dimwitted","Funky","Crazy old","Steamy","Drizzly","Grizzly","Squirty","Uptight","Hairy","Husky","Arrogant","Nippy","Chunky","smelly","Drolling","spanish"};
    String [] insultCol2 = new String[] {"Hiney","Poop","Toot","Wedgie","Stool","Fudge","Bum","Potty","Dookie","Pudding","Sphincter","rock","Booger","Feces","Snot","Crust","Badonk-a","Crud","Sludge","Tool","Alien"};
    String [] insultCol3 = new String[] {"Squeegee","Turtle","Cabbage","Bomb","Sniffer","Binkie","Stump","Nugget","Whistle","Twig","Knuckle","Burger","Hot Dog","Loaf","Freckle","Soldier","Kernal","Shingle","Warrior","elbow"};






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView generate = (TextView) findViewById(R.id.generate);


        generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                generateInsult();
            }

        });


    }

   public void generateInsult(){

       Random rand = new Random();
       int rand_insultCol1 =rand.nextInt(insultCol1.length);
       int rand_insultCol2=rand.nextInt(insultCol2.length);
       int rand_insultCol3=rand.nextInt(insultCol3.length);
       String insult = "you "+insultCol1[rand_insultCol1]+" "+insultCol2[rand_insultCol2]+" "+insultCol3[rand_insultCol3];

       TextView insults = (TextView) findViewById(R.id.inslults);
       insults.setText(insult);
   }
   
}
