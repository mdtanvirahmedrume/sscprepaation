package com.example.sscp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainFile extends AppCompatActivity {
    ImageView bangla1stpaper,bangla2ndtpaper,englis1stpaper,englis2ndpaper,math,religion,ict,physics,chemistry,
            biology,highermath,accounting,finance,business_entrepreneurship,agricultural_studies,general_science,
            bangladesh_and_global_studies, bangla1, bangla2,mathclick,religionclick,ictclick,physicsclick,chemistryclick,
            biologyclick, highermathclick, accountingclick, financeclick, business_entrepreneurshipclick, agricultural_studiesclick,
            general_scienceclick,bangladesh_and_global_studiesclick,englis1,englis2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_file);

//        Image Icon from Picasso ---------------------------

        bangla1stpaper = findViewById(R.id.bangla1stpaper);
        bangla2ndtpaper = findViewById(R.id.bangla2ndtpaper);
        englis1stpaper = findViewById(R.id.englis1stpaper);
        englis2ndpaper = findViewById(R.id.englis2ndpaper);
        math = findViewById(R.id.math);
        religion = findViewById(R.id.religion);
        ict = findViewById(R.id.ict);
        physics = findViewById(R.id.physics);
        chemistry = findViewById(R.id.chemistry);
        biology = findViewById(R.id.biology);
        highermath = findViewById(R.id.highermath);
        accounting = findViewById(R.id.accounting);
        finance = findViewById(R.id.finance);
        business_entrepreneurship = findViewById(R.id.business_entrepreneurship);
        agricultural_studies = findViewById(R.id.agricultural_studies);
        general_science = findViewById(R.id.general_science);
        bangladesh_and_global_studies = findViewById(R.id.bangladesh_and_global_studies);

//        NextPage cick Relation---------------------------------------------------------------------//
        bangla1 = findViewById(R.id.bangla1);
        bangla2 = findViewById(R.id.bangla2);
        englis1 = findViewById(R.id.englis1);
        englis2 = findViewById(R.id.englis2);
        mathclick = findViewById(R.id.mathclick);
        religionclick = findViewById(R.id.religionclick);
        ictclick = findViewById(R.id.ictclick);
        physicsclick = findViewById(R.id.physicsclick);
        chemistryclick = findViewById(R.id.chemistryclick);
        biologyclick = findViewById(R.id.biologyclick);
        highermathclick = findViewById(R.id.highermathclick);
        accountingclick = findViewById(R.id.accountingclick);
        financeclick = findViewById(R.id.financeclick);
        business_entrepreneurshipclick = findViewById(R.id.business_entrepreneurshipclick);
        agricultural_studiesclick = findViewById(R.id.agricultural_studiesclick);
        general_scienceclick = findViewById(R.id.general_scienceclick);
        bangladesh_and_global_studiesclick = findViewById(R.id.bangladesh_and_global_studiesclick);

//--------------------Image Icon Load from Picasso------------------------------------------------------------------------------------------//

       Picasso.get()
               .load("")
               .placeholder(R.drawable.physics)
               .into(bangla1stpaper);
//
//       Picasso.get()
//               .load("")
//               .placeholder(R.drawable.physics)
//               .into(bangla2ndtpaper);
//
//        Picasso.get()
//                .load("")
//                .placeholder(R.drawable.physics)
//                .into(englis1stpaper);
//
//        Picasso.get()
//                .load("")
//                .placeholder(R.drawable.physics)
//                .into(englis2ndpaper);
//
//        Picasso.get()
//                .load("")
//                .placeholder(R.drawable.physics)
//                .into(math);
//
//        Picasso.get()
//                .load("")
//                .placeholder(R.drawable.physics)
//                .into(religion);
//
//        Picasso.get()
//                .load("")
//                .placeholder(R.drawable.physics)
//                .into(ict);
//
//        Picasso.get()
//                .load("")
//                .placeholder(R.drawable.physics)
//                .into(physics);
//
//        Picasso.get()
//                .load("")
//                .placeholder(R.drawable.physics)
//                .into(chemistry);
//
//        Picasso.get()
//                .load("")
//                .placeholder(R.drawable.physics)
//                .into(biology);
//
//        Picasso.get()
//                .load("")
//                .placeholder(R.drawable.physics)
//                .into(highermath);
//
//        Picasso.get()
//                .load("")
//                .placeholder(R.drawable.physics)
//                .into(accounting);
//
//        Picasso.get()
//                .load("")
//                .placeholder(R.drawable.physics)
//                .into(finance);
//
//        Picasso.get()
//                .load("")
//                .placeholder(R.drawable.physics)
//                .into(business_entrepreneurship);
//
//        Picasso.get()
//                .load("")
//                .placeholder(R.drawable.physics)
//                .into(agricultural_studies);
//
//        Picasso.get()
//                .load("")
//                .placeholder(R.drawable.physics)
//                .into(general_science);
//
//        Picasso.get()
//                .load("")
//                .placeholder(R.drawable.physics)
//                .into(bangladesh_and_global_studies);

//------------------------------------------ Picasso End-------------------------------------------------------

//        ======================================================================================================


//        clcik to Subject Page link ----------------------------------------------



        bangla1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainFile.this, banglafristpaper.class));
            }
        });
        bangla2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainFile.this,banglasecondpaper.class));
            }
        });
        englis1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainFile.this,englishfristpaper.class));
            }
        });
        englis2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainFile.this,englishsecondpaper.class));
            }
        });
        mathclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainFile.this,math.class));
            }
        });
        religionclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainFile.this,religion.class));
            }
        });
        ictclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainFile.this,ict.class));
            }
        });
        physicsclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainFile.this,physics.class));
            }
        });
        chemistryclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainFile.this,chemistry.class));
            }
        });
        biologyclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainFile.this,biology.class));
            }
        });
        highermathclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainFile.this,highermath.class));
            }
        });
        accountingclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainFile.this,accounting.class));
            }
        });
        financeclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainFile.this,finance.class));
            }
        });
        business_entrepreneurshipclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainFile.this,business_entrepreneurship.class));
            }
        });
        agricultural_studiesclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainFile.this,agricultural_studies.class));
            }
        });
        general_scienceclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainFile.this,general_science.class));
            }
        });
        bangladesh_and_global_studiesclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainFile.this,bangladesh_and_global_studies.class));
            }
        });



    }
}