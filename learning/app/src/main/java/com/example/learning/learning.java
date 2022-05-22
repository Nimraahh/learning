package com.example.learning;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class learning extends AppCompatActivity {
    Button btn;
    EditText enter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning);
        btn = (Button) findViewById(R.id.button3);
        enter=(EditText)findViewById(R.id.edit);

        btn.setOnClickListener(view -> {
            String str=enter.getText().toString().trim();
            switch (str) {
                case "a":
                case "A": {
                    Intent intent = new Intent(learning.this, display.class);


                    intent.putExtra("img", R.drawable.a);
                    intent.putExtra("strName", "A for Aeroplane");


                    startActivity(intent);
                    break;
                }
                case "b":
                case "B": {
                    Intent intent = new Intent(learning.this, display.class);

                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("img", R.drawable.b);

                    intent.putExtra("strName", "B for Balloons");
                    startActivity(intent);
                    break;
                }
                case "c":
                case "C": {
                    Intent intent = new Intent(learning.this, display.class);

                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("img", R.drawable.c);
                    intent.putExtra("strName", "C for Camel");

                    startActivity(intent);
                    break;
                }
                case "d":
                case "D": {
                    Intent intent = new Intent(learning.this, display.class);

                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("img", R.drawable.d);
                    intent.putExtra("strName", "D for Dog");

                    startActivity(intent);
                    break;
                }
                case "e":
                case "E": {
                    Intent intent = new Intent(learning.this, display.class);

                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("img", R.drawable.e);
                    intent.putExtra("strName", "E for Eggs");

                    startActivity(intent);
                    break;
                }
                case "f":
                case "F": {
                    Intent intent = new Intent(learning.this, display.class);

                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("img", R.drawable.f);
                    intent.putExtra("strName", "F for Fairy");

                    startActivity(intent);
                    break;
                }
                case "g":
                case "G": {
                    Intent intent = new Intent(learning.this, display.class);

                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("img", R.drawable.g);
                    intent.putExtra("strName", "G for Goat");

                    startActivity(intent);
                    break;
                }
                case "h":
                case "H": {
                    Intent intent = new Intent(learning.this, display.class);

                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("img", R.drawable.h);
                    intent.putExtra("strName", "H for Hen");

                    startActivity(intent);
                    break;
                }
                case "i":
                case "I": {
                    Intent intent = new Intent(learning.this, display.class);

                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("img", R.drawable.i);
                    intent.putExtra("strName", "I for Ink Pot");

                    startActivity(intent);
                    break;
                }
                case "j":
                case "J": {
                    Intent intent = new Intent(learning.this, display.class);

                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("img", R.drawable.j);
                    intent.putExtra("strName", "J for Joker");

                    startActivity(intent);
                    break;
                }
                case "k":
                case "K": {
                    Intent intent = new Intent(learning.this, display.class);

                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("img", R.drawable.k);
                    intent.putExtra("strName", "K for King");

                    startActivity(intent);
                    break;
                }
                case "l":
                case "L": {
                    Intent intent = new Intent(learning.this, display.class);

                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("img", R.drawable.L);
                    intent.putExtra("strName", "L for Leopard");

                    startActivity(intent);
                    break;
                }
                case "m":
                case "M": {
                    Intent intent = new Intent(learning.this, display.class);

                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("img", R.drawable.m);
                    intent.putExtra("strName", "M for Mice");

                    startActivity(intent);
                    break;
                }
                case "n":
                case "N": {
                    Intent intent = new Intent(learning.this, display.class);

                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("img", R.drawable.n);
                    intent.putExtra("strName", "N for Nail");

                    startActivity(intent);
                    break;
                }
                case "o":
                case "O": {
                    Intent intent = new Intent(learning.this, display.class);

                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("img", R.drawable.o);
                    intent.putExtra("strName", "O for Octopus");

                    startActivity(intent);
                    break;
                }
                case "p":
                case "P": {
                    Intent intent = new Intent(learning.this, display.class);

                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("img", R.drawable.p);
                    intent.putExtra("strName", "P for Pizza");

                    startActivity(intent);
                    break;
                }
                case "q":
                case "Q": {
                    Intent intent = new Intent(learning.this, display.class);

                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("img", R.drawable.q);
                    intent.putExtra("strName", "Q for Quil");

                    startActivity(intent);
                    break;
                }
                case "r":
                case "R": {
                    Intent intent = new Intent(learning.this, display.class);

                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("img", R.drawable.r);
                    intent.putExtra("strName", "R for Rose");

                    startActivity(intent);
                    break;
                }
                case "s":
                case "S": {
                    Intent intent = new Intent(learning.this, display.class);

                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("img", R.drawable.s);
                    intent.putExtra("strName", "S for Swans");

                    startActivity(intent);
                    break;
                }
                case "t":
                case "T": {
                    Intent intent = new Intent(learning.this, display.class);

                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("img", R.drawable.t);
                    intent.putExtra("strName", "T for Tree");

                    startActivity(intent);
                    break;
                }
                case "u":
                case "U": {
                    Intent intent = new Intent(learning.this, display.class);

                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("img", R.drawable.u);
                    intent.putExtra("strName", "U for Umbrella");

                    startActivity(intent);
                    break;
                }
                case "v":
                case "V": {
                    Intent intent = new Intent(learning.this, display.class);

                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("img", R.drawable.v);
                    intent.putExtra("strName", "V for Vase");

                    startActivity(intent);
                    break;
                }
                case "w":
                case "W": {
                    Intent intent = new Intent(learning.this, display.class);

                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("img", R.drawable.w);
                    intent.putExtra("strName", "W for Whales");

                    startActivity(intent);
                    break;
                }
                case "x":
                case "X": {
                    Intent intent = new Intent(learning.this, display.class);

                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("img", R.drawable.x);
                    intent.putExtra("strName", "X for Xmas Tree");

                    startActivity(intent);
                    break;
                }
                case "y":
                case "Y": {
                    Intent intent = new Intent(learning.this, display.class);

                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("img", R.drawable.y);
                    intent.putExtra("strName", "Y for Yarns");

                    startActivity(intent);
                    break;
                }
                case "z":
                case "Z": {
                    Intent intent = new Intent(learning.this, display.class);

                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("img", R.drawable.z);
                    intent.putExtra("strName", "Z for Zoo");

                    startActivity(intent);
                    break;
                }
            }

        });
    }}
