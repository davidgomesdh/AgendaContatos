package com.example.davidsantos.agendacontatos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;

public class EditActivity extends AppCompatActivity {

    private ContatoInfo contato;

    private ImageButton foto;
    private EditText nome;
    private EditText ref;
    private EditText email;
    private EditText fone;
    private EditText endereco;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        contato = getIntent().getParcelableExtra("contato");

        foto = findViewById(R.id.fotoContato);
        nome = findViewById(R.id.nomeContato);
        ref = findViewById(R.id.refContato);
        email = findViewById(R.id.emailContato);
        fone = findViewById(R.id.foneContato);
        endereco = findViewById(R.id.endContato);

        nome.setText(contato.getNome());
        ref.setText(contato.getRef());
        email.setText(contato.getEmail());
        fone.setText(contato.getFone());
        endereco.setText(contato.getEnd());
    }
}
