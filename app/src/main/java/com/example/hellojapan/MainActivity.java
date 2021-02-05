package com.example.hellojapan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.Color;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Hiragana layout
        LinearLayout hiraLayout = findViewById(R.id.LinearLayoutHira);
        hiraLayout.setPadding(30 , 0 , 10 , 200);

        // Generate hiragana rows
        LinearLayout row1 = new LinearLayout(this);
        LinearLayout row2 = new LinearLayout(this);
        LinearLayout row3 = new LinearLayout(this);
        LinearLayout row4 = new LinearLayout(this);
        LinearLayout row5 = new LinearLayout(this);
        LinearLayout row6 = new LinearLayout(this);
        LinearLayout row7 = new LinearLayout(this);
        LinearLayout row8 = new LinearLayout(this);
        LinearLayout row9 = new LinearLayout(this);
        LinearLayout row10 = new LinearLayout(this);
        LinearLayout row11 = new LinearLayout(this);

        hiraLayout.addView(row1);
        hiraLayout.addView(row2);
        hiraLayout.addView(row3);
        hiraLayout.addView(row4);
        hiraLayout.addView(row5);
        hiraLayout.addView(row6);
        hiraLayout.addView(row7);
        hiraLayout.addView(row8);
        hiraLayout.addView(row9);
        hiraLayout.addView(row10);
        hiraLayout.addView(row11);

        // Generate hiragana characters
        ArrayList<Character> tempRowCharacters = new ArrayList<>();

        tempRowCharacters.add(new Character(R.drawable.b11h, R.raw.a_akira));
        tempRowCharacters.add(new Character(R.drawable.b12h, R.raw.i_akira));
        tempRowCharacters.add(new Character(R.drawable.b13h, R.raw.u_akira));
        tempRowCharacters.add(new Character(R.drawable.b14h, R.raw.e_akira));
        tempRowCharacters.add(new Character(R.drawable.b15h, R.raw.o_akira));
        for (Character character : tempRowCharacters) {
            row1.addView(character.toImageButton(this));
        }

        tempRowCharacters = new ArrayList<>();
        tempRowCharacters.add(new Character(R.drawable.b21h, R.raw.ka_akira));
        tempRowCharacters.add(new Character(R.drawable.b22h, R.raw.ki_akira));
        tempRowCharacters.add(new Character(R.drawable.b23h, R.raw.ku_akira));
        tempRowCharacters.add(new Character(R.drawable.b24h, R.raw.ke_akira));
        tempRowCharacters.add(new Character(R.drawable.b25h, R.raw.ko_akira));
        for (Character character : tempRowCharacters) {
            row2.addView(character.toImageButton(this));
        }

        tempRowCharacters = new ArrayList<>();
        tempRowCharacters.add(new Character(R.drawable.b31h, R.raw.sa_akira));
        tempRowCharacters.add(new Character(R.drawable.b32h, R.raw.shi_akira));
        tempRowCharacters.add(new Character(R.drawable.b33h, R.raw.su_akira));
        tempRowCharacters.add(new Character(R.drawable.b34h, R.raw.se_akira));
        tempRowCharacters.add(new Character(R.drawable.b35h, R.raw.so_akira));
        for (Character character : tempRowCharacters) {
            row3.addView(character.toImageButton(this));
        }

        tempRowCharacters = new ArrayList<>();
        tempRowCharacters.add(new Character(R.drawable.b41h, R.raw.ta_akira));
        tempRowCharacters.add(new Character(R.drawable.b42h, R.raw.chi_akira));
        tempRowCharacters.add(new Character(R.drawable.b43h, R.raw.tsu_akira));
        tempRowCharacters.add(new Character(R.drawable.b44h, R.raw.te_akira));
        tempRowCharacters.add(new Character(R.drawable.b45h, R.raw.to_akira));
        for (Character character : tempRowCharacters) {
            row4.addView(character.toImageButton(this));
        }

        tempRowCharacters = new ArrayList<>();
        tempRowCharacters.add(new Character(R.drawable.b51h, R.raw.na_akira));
        tempRowCharacters.add(new Character(R.drawable.b52h, R.raw.ni_akira));
        tempRowCharacters.add(new Character(R.drawable.b53h, R.raw.nu_akira));
        tempRowCharacters.add(new Character(R.drawable.b54h, R.raw.ne_akira));
        tempRowCharacters.add(new Character(R.drawable.b55h, R.raw.no_akira));
        for (Character character : tempRowCharacters) {
            row5.addView(character.toImageButton(this));
        }

        tempRowCharacters = new ArrayList<>();
        tempRowCharacters.add(new Character(R.drawable.b61h, R.raw.ha_akira));
        tempRowCharacters.add(new Character(R.drawable.b62h, R.raw.hi_akira));
        tempRowCharacters.add(new Character(R.drawable.b63h, R.raw.fu_akira));
        tempRowCharacters.add(new Character(R.drawable.b64h, R.raw.he_akira));
        tempRowCharacters.add(new Character(R.drawable.b65h, R.raw.ho_akira));
        for (Character character : tempRowCharacters) {
            row6.addView(character.toImageButton(this));
        }

        tempRowCharacters = new ArrayList<>();
        tempRowCharacters.add(new Character(R.drawable.b71h, R.raw.ma_akira));
        tempRowCharacters.add(new Character(R.drawable.b72h, R.raw.mi_akira));
        tempRowCharacters.add(new Character(R.drawable.b73h, R.raw.mu_akira));
        tempRowCharacters.add(new Character(R.drawable.b74h, R.raw.me_akira));
        tempRowCharacters.add(new Character(R.drawable.b75h, R.raw.mo_akira));
        for (Character character : tempRowCharacters) {
            row7.addView(character.toImageButton(this));
        }

        tempRowCharacters = new ArrayList<>();
        tempRowCharacters.add(new Character(R.drawable.b81h, R.raw.ya_akira));
        tempRowCharacters.add(new Character(R.drawable.empty, Character.SILENT_SOUND));
        tempRowCharacters.add(new Character(R.drawable.b83h, R.raw.yu_akira));
        tempRowCharacters.add(new Character(R.drawable.empty, Character.SILENT_SOUND));
        tempRowCharacters.add(new Character(R.drawable.b85h, R.raw.yo_akira));
        for (Character character : tempRowCharacters) {
            row8.addView(character.toImageButton(this));
        }

        tempRowCharacters = new ArrayList<>();
        tempRowCharacters.add(new Character(R.drawable.b91h, R.raw.ra_akira));
        tempRowCharacters.add(new Character(R.drawable.b92h, R.raw.ri_akira));
        tempRowCharacters.add(new Character(R.drawable.b93h, R.raw.ru_akira));
        tempRowCharacters.add(new Character(R.drawable.b94h, R.raw.re_akira));
        tempRowCharacters.add(new Character(R.drawable.b95h, R.raw.ro_akira));
        for (Character character : tempRowCharacters) {
            row9.addView(character.toImageButton(this));
        }

        tempRowCharacters = new ArrayList<>();
        tempRowCharacters.add(new Character(R.drawable.b101h, R.raw.wa_akira));
        tempRowCharacters.add(new Character(R.drawable.empty, Character.SILENT_SOUND));
        tempRowCharacters.add(new Character(R.drawable.empty, Character.SILENT_SOUND));
        tempRowCharacters.add(new Character(R.drawable.empty, Character.SILENT_SOUND));
        tempRowCharacters.add(new Character(R.drawable.b105h, R.raw.wo_akira));
        for (Character character : tempRowCharacters) {
            row10.addView(character.toImageButton(this));
        }

        tempRowCharacters = new ArrayList<>();
        tempRowCharacters.add(new Character(R.drawable.b111h, R.raw.n_akira));
        tempRowCharacters.add(new Character(R.drawable.empty, Character.SILENT_SOUND));
        tempRowCharacters.add(new Character(R.drawable.empty, Character.SILENT_SOUND));
        tempRowCharacters.add(new Character(R.drawable.empty, Character.SILENT_SOUND));
        tempRowCharacters.add(new Character(R.drawable.empty, Character.SILENT_SOUND));
        for (Character character : tempRowCharacters) {
            row11.addView(character.toImageButton(this));
        }

        // Katakana layout
        LinearLayout kataLayout = findViewById(R.id.LinearLayoutKata);
        kataLayout.setPadding(30 , 0 , 10 , 150);

        // Generate katakana rows
        LinearLayout rowK1 = new LinearLayout(this);
        LinearLayout rowK2 = new LinearLayout(this);
        LinearLayout rowK3 = new LinearLayout(this);
        LinearLayout rowK4 = new LinearLayout(this);
        LinearLayout rowK5 = new LinearLayout(this);
        LinearLayout rowK6 = new LinearLayout(this);
        LinearLayout rowK7 = new LinearLayout(this);
        LinearLayout rowK8 = new LinearLayout(this);
        LinearLayout rowK9 = new LinearLayout(this);
        LinearLayout rowK10 = new LinearLayout(this);
        LinearLayout rowK11 = new LinearLayout(this);

        kataLayout.addView(rowK1);
        kataLayout.addView(rowK2);
        kataLayout.addView(rowK3);
        kataLayout.addView(rowK4);
        kataLayout.addView(rowK5);
        kataLayout.addView(rowK6);
        kataLayout.addView(rowK7);
        kataLayout.addView(rowK8);
        kataLayout.addView(rowK9);
        kataLayout.addView(rowK10);
        kataLayout.addView(rowK11);

        // Generate katakana characters
        tempRowCharacters = new ArrayList<>();
        tempRowCharacters.add(new Character(R.drawable.b11k, R.raw.a_akira));
        tempRowCharacters.add(new Character(R.drawable.b12k, R.raw.i_akira));
        tempRowCharacters.add(new Character(R.drawable.b13k, R.raw.u_akira));
        tempRowCharacters.add(new Character(R.drawable.b14k, R.raw.e_akira));
        tempRowCharacters.add(new Character(R.drawable.b15k, R.raw.o_akira));
        for (Character character : tempRowCharacters) {
            rowK1.addView(character.toImageButton(this));
        }

        tempRowCharacters = new ArrayList<>();
        tempRowCharacters.add(new Character(R.drawable.b21k, R.raw.ka_akira));
        tempRowCharacters.add(new Character(R.drawable.b22k, R.raw.ki_akira));
        tempRowCharacters.add(new Character(R.drawable.b23k, R.raw.ku_akira));
        tempRowCharacters.add(new Character(R.drawable.b24k, R.raw.ke_akira));
        tempRowCharacters.add(new Character(R.drawable.b25k, R.raw.ko_akira));
        for (Character character : tempRowCharacters) {
            rowK2.addView(character.toImageButton(this));
        }

        tempRowCharacters = new ArrayList<>();
        tempRowCharacters.add(new Character(R.drawable.b31k, R.raw.sa_akira));
        tempRowCharacters.add(new Character(R.drawable.b32k, R.raw.shi_akira));
        tempRowCharacters.add(new Character(R.drawable.b33k, R.raw.su_akira));
        tempRowCharacters.add(new Character(R.drawable.b34k, R.raw.se_akira));
        tempRowCharacters.add(new Character(R.drawable.b35k, R.raw.so_akira));
        for (Character character : tempRowCharacters) {
            rowK3.addView(character.toImageButton(this));
        }

        tempRowCharacters = new ArrayList<>();
        tempRowCharacters.add(new Character(R.drawable.b41k, R.raw.ta_akira));
        tempRowCharacters.add(new Character(R.drawable.b42k, R.raw.chi_akira));
        tempRowCharacters.add(new Character(R.drawable.b43k, R.raw.tsu_akira));
        tempRowCharacters.add(new Character(R.drawable.b44k, R.raw.te_akira));
        tempRowCharacters.add(new Character(R.drawable.b45k, R.raw.to_akira));
        for (Character character : tempRowCharacters) {
            rowK4.addView(character.toImageButton(this));
        }

        tempRowCharacters = new ArrayList<>();
        tempRowCharacters.add(new Character(R.drawable.b51k, R.raw.na_akira));
        tempRowCharacters.add(new Character(R.drawable.b52k, R.raw.ni_akira));
        tempRowCharacters.add(new Character(R.drawable.b53k, R.raw.nu_akira));
        tempRowCharacters.add(new Character(R.drawable.b54k, R.raw.ne_akira));
        tempRowCharacters.add(new Character(R.drawable.b55k, R.raw.no_akira));
        for (Character character : tempRowCharacters) {
            rowK5.addView(character.toImageButton(this));
        }

        tempRowCharacters = new ArrayList<>();
        tempRowCharacters.add(new Character(R.drawable.b61k, R.raw.ha_akira));
        tempRowCharacters.add(new Character(R.drawable.b62k, R.raw.hi_akira));
        tempRowCharacters.add(new Character(R.drawable.b63k, R.raw.fu_akira));
        tempRowCharacters.add(new Character(R.drawable.b64k, R.raw.he_akira));
        tempRowCharacters.add(new Character(R.drawable.b65k, R.raw.ho_akira));
        for (Character character : tempRowCharacters) {
            rowK6.addView(character.toImageButton(this));
        }

        tempRowCharacters = new ArrayList<>();
        tempRowCharacters.add(new Character(R.drawable.b71k, R.raw.ma_akira));
        tempRowCharacters.add(new Character(R.drawable.b72k, R.raw.mi_akira));
        tempRowCharacters.add(new Character(R.drawable.b73k, R.raw.mu_akira));
        tempRowCharacters.add(new Character(R.drawable.b74k, R.raw.me_akira));
        tempRowCharacters.add(new Character(R.drawable.b75k, R.raw.mo_akira));
        for (Character character : tempRowCharacters) {
            rowK7.addView(character.toImageButton(this));
        }

        tempRowCharacters = new ArrayList<>();
        tempRowCharacters.add(new Character(R.drawable.b81k, R.raw.ya_akira));
        tempRowCharacters.add(new Character(R.drawable.empty, Character.SILENT_SOUND));
        tempRowCharacters.add(new Character(R.drawable.b83k, R.raw.yu_akira));
        tempRowCharacters.add(new Character(R.drawable.empty, Character.SILENT_SOUND));
        tempRowCharacters.add(new Character(R.drawable.b85k, R.raw.yo_akira));
        for (Character character : tempRowCharacters) {
            rowK8.addView(character.toImageButton(this));
        }

        tempRowCharacters = new ArrayList<>();
        tempRowCharacters.add(new Character(R.drawable.b91k, R.raw.ra_akira));
        tempRowCharacters.add(new Character(R.drawable.b92k, R.raw.ri_akira));
        tempRowCharacters.add(new Character(R.drawable.b93k, R.raw.ru_akira));
        tempRowCharacters.add(new Character(R.drawable.b94k, R.raw.re_akira));
        tempRowCharacters.add(new Character(R.drawable.b95k, R.raw.ro_akira));
        for (Character character : tempRowCharacters) {
            rowK9.addView(character.toImageButton(this));
        }

        tempRowCharacters = new ArrayList<>();
        tempRowCharacters.add(new Character(R.drawable.b101k, R.raw.wa_akira));
        tempRowCharacters.add(new Character(R.drawable.empty, Character.SILENT_SOUND));
        tempRowCharacters.add(new Character(R.drawable.empty, Character.SILENT_SOUND));
        tempRowCharacters.add(new Character(R.drawable.empty, Character.SILENT_SOUND));
        tempRowCharacters.add(new Character(R.drawable.b105k, R.raw.wo_akira));
        for (Character character : tempRowCharacters) {
            rowK10.addView(character.toImageButton(this));
        }

        tempRowCharacters = new ArrayList<>();
        tempRowCharacters.add(new Character(R.drawable.b111k, R.raw.n_akira));
        tempRowCharacters.add(new Character(R.drawable.empty, Character.SILENT_SOUND));
        tempRowCharacters.add(new Character(R.drawable.empty, Character.SILENT_SOUND));
        tempRowCharacters.add(new Character(R.drawable.empty, Character.SILENT_SOUND));
        tempRowCharacters.add(new Character(R.drawable.empty, Character.SILENT_SOUND));
        for (Character character : tempRowCharacters) {
            rowK11.addView(character.toImageButton(this));
        }
    }

    public void onBottomAction(View view) {
        LinearLayout hiraLayout = findViewById(R.id.LinearLayoutHira);
        LinearLayout kataLayout = findViewById(R.id.LinearLayoutKata);
        TextView title = findViewById(R.id.title);

        switch (view.getId()) {
            case R.id.buttonkata:
                kataLayout.setVisibility(View.VISIBLE);
                hiraLayout.setVisibility(View.GONE);
                title.setText("Katakana");
                Button buttonKata = findViewById(R.id.buttonkata);
                Button buttonHira = findViewById(R.id.buttonHira);

                buttonKata.setBackgroundColor(Color.rgb(95, 74, 139));
                buttonHira.setBackgroundColor(Color.rgb(224, 209, 183));
                return;
            case R.id.buttonHira:
                kataLayout.setVisibility(View.GONE);
                hiraLayout.setVisibility(View.VISIBLE);
                title.setText("Hiragana");
                Button buttonKatakana = findViewById(R.id.buttonkata);
                Button buttonHiragana = findViewById(R.id.buttonHira);

                buttonHiragana.setBackgroundColor(Color.rgb(95, 74, 139));
                buttonKatakana.setBackgroundColor(Color.rgb(224, 209, 183));
                return;
        }
    }
}

class Character {
    int imageId;
    int soundId; // 0 = no sound

    final static int SILENT_SOUND = 0;

    public Character(int imageId, int soundId) {
        this.imageId = imageId;
        this.soundId = soundId;
    }

    public ImageButton toImageButton(AppCompatActivity context) {
        ImageButton button = new ImageButton(context);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(205, 220);
        button.setImageResource(this.imageId);
        button.setLayoutParams(params);
        button.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int soundId = this.soundId;

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (soundId == Character.SILENT_SOUND) {
                    return;
                }
                MediaPlayer player = MediaPlayer.create(context, soundId);
                player.start();
            }
        });
        return button;
    }
}

