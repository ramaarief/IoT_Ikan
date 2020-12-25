package com.example.aplikasi_ikan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.io.IOException;

public class play_music8 extends AppCompatActivity implements View.OnClickListener{

    private ImageView Play, Stop;
    private ImageView back;
    private MediaPlayer mediaPlayer;
    private Integer i;
    //private String[] Item = { "Pilih Interval","0", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", "60" };
    private Integer[] Item = { 0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60 };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_music8);

        Play = findViewById(R.id.play);
        Stop = findViewById(R.id.stop);

        Play.setOnClickListener((View.OnClickListener) this);
        Stop.setOnClickListener(this);

        back = (ImageView) findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent suara1 = new Intent(play_music8.this, MainActivity.class);
                startActivity(suara1);
            }
        });

        final Spinner List = findViewById(R.id.listItem);

        //Inisialiasi Array Adapter dengan memasukkan String Array
        final ArrayAdapter<Integer> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_dropdown_item,Item);

        //Memasukan Adapter pada Spinner
        List.setAdapter(adapter);

        //Mengeset listener untuk mengetahui event/aksi saat item dipilih
        List.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView adapterView, View view, int i, long l) {
                if (List.getSelectedItem().toString().equals("Pilih Interval")) {
                    Toast.makeText(getApplicationContext(), "Silakan " + adapter.getItem(i), Toast.LENGTH_SHORT).show();
                } else if (List.getSelectedItem().toString().equals("0")) {
                    Toast.makeText(getApplicationContext(), "Interval Diset ke - " + adapter.getItem(i), Toast.LENGTH_SHORT).show();
                }
                else if (List.getSelectedItem().toString().equals("5")) {
                    Toast.makeText(getApplicationContext(), "Interval Diset ke - " + adapter.getItem(i), Toast.LENGTH_SHORT).show();
                }
                else if (List.getSelectedItem().toString().equals("10")) {
                    Toast.makeText(getApplicationContext(), "Interval Diset ke - " + adapter.getItem(i), Toast.LENGTH_SHORT).show();
                }
                else if (List.getSelectedItem().toString().equals("15")) {
                    Toast.makeText(getApplicationContext(), "Interval Diset ke - " + adapter.getItem(i), Toast.LENGTH_SHORT).show();
                }
                else if (List.getSelectedItem().toString().equals("20")) {
                    Toast.makeText(getApplicationContext(), "Interval Diset ke - " + adapter.getItem(i), Toast.LENGTH_SHORT).show();
                }
                else if (List.getSelectedItem().toString().equals("25")) {
                    Toast.makeText(getApplicationContext(), "Interval Diset ke - " + adapter.getItem(i), Toast.LENGTH_SHORT).show();
                }
                else if (List.getSelectedItem().toString().equals("30")) {
                    Toast.makeText(getApplicationContext(), "Interval Diset ke - " + adapter.getItem(i), Toast.LENGTH_SHORT).show();
                }
                else if (List.getSelectedItem().toString().equals("35")) {
                    Toast.makeText(getApplicationContext(), "Interval Diset ke - " + adapter.getItem(i), Toast.LENGTH_SHORT).show();
                }
                else if (List.getSelectedItem().toString().equals("40")) {
                    Toast.makeText(getApplicationContext(), "Interval Diset ke - " + adapter.getItem(i), Toast.LENGTH_SHORT).show();
                }
                else if (List.getSelectedItem().toString().equals("45")) {
                    Toast.makeText(getApplicationContext(), "Interval Diset ke - " + adapter.getItem(i), Toast.LENGTH_SHORT).show();
                }
                else if (List.getSelectedItem().toString().equals("50")) {
                    Toast.makeText(getApplicationContext(), "Interval Diset ke - " + adapter.getItem(i), Toast.LENGTH_SHORT).show();
                }
                else if (List.getSelectedItem().toString().equals("55")) {
                    Toast.makeText(getApplicationContext(), "Interval Diset ke - " + adapter.getItem(i), Toast.LENGTH_SHORT).show();
                }
                else if (List.getSelectedItem().toString().equals("60")) {
                    Toast.makeText(getApplicationContext(), "Interval Diset ke - " + adapter.getItem(i), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView adapterView) {

            }
        });

        stateAwal();
    }

    private void stateAwal(){
        Play.setEnabled(true);
        Stop.setEnabled(false);
    }

    //Method untuk memainkan musik
    private void playAudio(){
        final Spinner List = findViewById(R.id.listItem);

        //Menentukan resource audio yang akan dijalankan
        mediaPlayer = MediaPlayer.create(this, R.raw.scianidae3);

        if (List.getSelectedItem().toString().equals("Pilih Interval")) {

        } else if (List.getSelectedItem().toString().equals("0")) {
            //Kondisi Button setelah tombol play di klik
            Play.setEnabled(false);
            Stop.setEnabled(true);

            //Menjalankan Audio / Musik
            try{
                mediaPlayer.prepare();
            }catch (IllegalStateException ex){
                ex.printStackTrace();
            }catch (IOException ex1){
                ex1.printStackTrace();
            }
            mediaPlayer.start();
            //Setelah audio selesai dimainkan maka kondisi Button akan kembali seperti awal
            mediaPlayer.setLooping(true);
        } else if (List.getSelectedItem().toString().equals("5")) {
            //Kondisi Button setelah tombol play di klik
            Play.setEnabled(false);
            Stop.setEnabled(true);

            //Menjalankan Audio / Musik
            try {
                Thread.sleep((Item[1]*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            mediaPlayer.start();
            //Setelah audio selesai dimainkan maka kondisi Button akan kembali seperti awal
            mediaPlayer.setLooping(true);
        } else if (List.getSelectedItem().toString().equals("10")) {
            //Kondisi Button setelah tombol play di klik
            Play.setEnabled(false);
            Stop.setEnabled(true);

            //Menjalankan Audio / Musik
            try {
                Thread.sleep((Item[2]*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            mediaPlayer.start();
            //Setelah audio selesai dimainkan maka kondisi Button akan kembali seperti awal
            mediaPlayer.setLooping(true);
        } else if (List.getSelectedItem().toString().equals("15")) {
            //Kondisi Button setelah tombol play di klik
            Play.setEnabled(false);
            Stop.setEnabled(true);

            //Menjalankan Audio / Musik
            try {
                Thread.sleep((Item[3]*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            mediaPlayer.start();
            //Setelah audio selesai dimainkan maka kondisi Button akan kembali seperti awal
            mediaPlayer.setLooping(true);
        } else if (List.getSelectedItem().toString().equals("20")) {
            //Kondisi Button setelah tombol play di klik
            Play.setEnabled(false);
            Stop.setEnabled(true);

            //Menjalankan Audio / Musik
            try {
                Thread.sleep((Item[4]*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            mediaPlayer.start();
            //Setelah audio selesai dimainkan maka kondisi Button akan kembali seperti awal
            mediaPlayer.setLooping(true);
        } else if (List.getSelectedItem().toString().equals("25")) {
            //Kondisi Button setelah tombol play di klik
            Play.setEnabled(false);
            Stop.setEnabled(true);

            //Menjalankan Audio / Musik
            try {
                Thread.sleep((Item[5]*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            mediaPlayer.start();
            //Setelah audio selesai dimainkan maka kondisi Button akan kembali seperti awal
            mediaPlayer.setLooping(true);
        } else if (List.getSelectedItem().toString().equals("30")) {
            //Kondisi Button setelah tombol play di klik
            Play.setEnabled(false);
            Stop.setEnabled(true);

            //Menjalankan Audio / Musik
            try {
                Thread.sleep((Item[6]*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            mediaPlayer.start();
            //Setelah audio selesai dimainkan maka kondisi Button akan kembali seperti awal
            mediaPlayer.setLooping(true);
        } else if (List.getSelectedItem().toString().equals("35")) {
            //Kondisi Button setelah tombol play di klik
            Play.setEnabled(false);
            Stop.setEnabled(true);

            //Menjalankan Audio / Musik
            try {
                Thread.sleep((Item[7]*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            mediaPlayer.start();
            //Setelah audio selesai dimainkan maka kondisi Button akan kembali seperti awal
            mediaPlayer.setLooping(true);
        } else if (List.getSelectedItem().toString().equals("40")) {
            //Kondisi Button setelah tombol play di klik
            Play.setEnabled(false);
            Stop.setEnabled(true);

            //Menjalankan Audio / Musik
            try {
                Thread.sleep((Item[8]*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            mediaPlayer.start();
            //Setelah audio selesai dimainkan maka kondisi Button akan kembali seperti awal
            mediaPlayer.setLooping(true);
        } else if (List.getSelectedItem().toString().equals("45")) {
            //Kondisi Button setelah tombol play di klik
            Play.setEnabled(false);
            Stop.setEnabled(true);

            //Menjalankan Audio / Musik
            try {
                Thread.sleep((Item[9]*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            mediaPlayer.start();
            //Setelah audio selesai dimainkan maka kondisi Button akan kembali seperti awal
            mediaPlayer.setLooping(true);
        } else if (List.getSelectedItem().toString().equals("50")) {
            //Kondisi Button setelah tombol play di klik
            Play.setEnabled(false);
            Stop.setEnabled(true);

            //Menjalankan Audio / Musik
            try {
                Thread.sleep((Item[10]*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            mediaPlayer.start();
            //Setelah audio selesai dimainkan maka kondisi Button akan kembali seperti awal
            mediaPlayer.setLooping(true);
        } else if (List.getSelectedItem().toString().equals("55")) {
            //Kondisi Button setelah tombol play di klik
            Play.setEnabled(false);
            Stop.setEnabled(true);

            //Menjalankan Audio / Musik
            try {
                Thread.sleep((Item[11]*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            mediaPlayer.start();
            //Setelah audio selesai dimainkan maka kondisi Button akan kembali seperti awal
            mediaPlayer.setLooping(true);
        } else if (List.getSelectedItem().toString().equals("60")) {
            //Kondisi Button setelah tombol play di klik
            Play.setEnabled(false);
            Stop.setEnabled(true);

            //Menjalankan Audio / Musik
            try {
                Thread.sleep((Item[12]*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            mediaPlayer.start();
            //Setelah audio selesai dimainkan maka kondisi Button akan kembali seperti awal
            mediaPlayer.setLooping(true);
        }
    }

    //Method untuk mengakhiri musik
    private void stopAudio(){
        mediaPlayer.stop();
        try {
            //Menyetel audio ke status awal
            mediaPlayer.prepare();
            mediaPlayer.seekTo(0);
        }catch (Throwable t){
            t.printStackTrace();
        }
        stateAwal();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.play:
                playAudio();
                break;
            case R.id.stop:
                stopAudio();
                break;
        }
    }
}