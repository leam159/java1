package kr.co.tjoeun.java1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.media.audiofx.DynamicsProcessing;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import kr.co.tjoeun.java1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding =null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

binding.OkBtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        Log.d("버튼클릭","입력 버튼 눌림");

        String input = binding.inputEdt.getText().toString();
        binding.resultTxt.setText(input);
        binding.inputEdt.setText("");
    }
});

        }

    }

