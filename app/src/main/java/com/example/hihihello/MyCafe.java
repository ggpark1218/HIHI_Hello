package com.example.hihihello;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MyCafe extends AppCompatActivity {

    EditText et;
    EditText et2;
    EditText et3;
    TextView tv;
    TextView tv2;
    TextView tv3;
    CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_cafe);

        et = findViewById(R.id.et_Americano);
        et2 = findViewById(R.id.et_latte);
        et3 = findViewById(R.id.et_moca);
        tv = findViewById(R.id.tv_num);
        tv2 = findViewById(R.id.tv_discount);
        tv3 = findViewById(R.id.tv_all);
        checkBox = findViewById(R.id.checkBox);

    }


    public void onCoffeeCal(View view) {
        //1.et에서 개 가져오기
        String Ame = et.getText().toString();
        String Lat = et2.getText().toString();
        String Moc = et3.getText().toString();

        int numAme = Integer.parseInt(Ame);
        int numLat = Integer.parseInt(Lat);
        int numMoc = Integer.parseInt(Moc);

        //2. 개수 합쳐서 텍스트뷰에 표시
        int num = numAme + numLat + numMoc;
        tv.setText("주문개수: " + num);

        //3. 개 * 가격 = 금액 합
        int sum = numAme * 1000 + numLat * 1500 + numMoc * 1700;

        //4. 할인 10%?
        int discount=0;
        int all=0;

        if(checkBox.isChecked()){
            all = sum * 9/10;
            discount = sum - all;

        }else{
            discount = 0;
            all = sum;
        }
        tv2.setText("할인금액: " + discount);
        //5. 총 금액
        tv3.setText("결제금액: " + all);

    }
}