package vn.com.greenwich.apprentalz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TestActivity extends AppCompatActivity {
EditText ss1;
EditText ss2;
EditText ss3;
EditText ss4;
EditText ss5;
EditText ss6;
EditText ss7;
EditText ss8;
EditText ss9;
EditText ss10;
EditText ss11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

//        String btn
        Toast.makeText(this, "ABC", Toast.LENGTH_LONG).show();

        Button btnCreate = findViewById(R.id.btnCreateProperty);
//        btnCreate.setText();
        btnCreate.setOnClickListener(btnCreate_Click);
    }

    private View.OnClickListener btnCreate_Click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Boolean isValid = true;
            TextView tvErr = findViewById(R.id.tvErr);
            TextView edIdProperty = findViewById(R.id.edIdProperty);
            TextView edNameProperty = findViewById(R.id.edNameProperty);
            TextView edAddressProperty = findViewById(R.id.edAddressProperty);
            TextView edTypeProperty = findViewById(R.id.edTypeProperty);
            TextView edBedroomProperty = findViewById(R.id.edBedroomProperty);
            TextView edTimeProperty = findViewById(R.id.edTimeProperty);
            TextView edDateProperty = findViewById(R.id.edDateProperty);
            TextView edMonthProperty = findViewById(R.id.edMonthProperty);
            TextView edFurnitureProperty = findViewById(R.id.edFurnitureProperty);
            TextView edNoteProperty = findViewById(R.id.edNoteProperty);
            TextView edReporterProperty = findViewById(R.id.edReporterProperty);

            String error = "";

            String IdProperty = edIdProperty.getText().toString();
            String NameProperty = edNameProperty.getText().toString();
            String AddressProperty = edAddressProperty.getText().toString();
            String TypeProperty = edTypeProperty.getText().toString();
            String BedroomProperty = edBedroomProperty.getText().toString();
            String TimeProperty = edTimeProperty.getText().toString();
            String DateProperty = edDateProperty.getText().toString();
            String MonthProperty = edMonthProperty.getText().toString();
            String FurnitureProperty = edFurnitureProperty.getText().toString();
            String NoteProperty = edNoteProperty.getText().toString();
            String ReporterProperty = edReporterProperty.getText().toString();
            ss1=findViewById(R.id.edIdProperty);
            ss2=findViewById(R.id.edNameProperty);
            ss3=findViewById(R.id.edAddressProperty);
            ss4=findViewById(R.id.edTypeProperty);
            ss5=findViewById(R.id.edBedroomProperty);
            ss6=findViewById(R.id.edTimeProperty);
            ss7=findViewById(R.id.edDateProperty);
            ss8=findViewById(R.id.edMonthProperty);
            ss9=findViewById(R.id.edFurnitureProperty);
            ss10=findViewById(R.id.edNoteProperty);
            ss11=findViewById(R.id.edReporterProperty);
            if(ss1.getText().toString().equals(""))
            {
                ss1.setError("Enter ID");
            }
            if(ss2.getText().toString().equals(""))
            {
                ss2.setError("Enter Name Property");
            }
            if(ss3.getText().toString().equals(""))
            {
                ss3.setError("Enter Address");
            }
            if(ss4.getText().toString().equals(""))
            {
                ss4.setError("Enter Type Property");
            }
            if(ss5.getText().toString().equals(""))
            {
                ss5.setError("Enter Bedroom");
            }
            if(ss6.getText().toString().equals(""))
            {
                ss6.setError("Enter Time");
            }
            if(ss7.getText().toString().equals(""))
            {
                ss7.setError("Enter Date");
            }
            if(ss8.getText().toString().equals(""))
            {
                ss8.setError("Enter Month");
            }
            if(ss9.getText().toString().equals(""))
            {
                ss9.setError("Enter Furniture");
            }
            if(ss10.getText().toString().equals(""))
            {
                ss10.setError("Enter Note");
            }
            if(ss11.getText().toString().equals(""))
            {
                ss11.setError("Enter Reporter");
            }

            if (TextUtils.isEmpty(IdProperty)){
                isValid = false;
                error += "* IdProperty Cannot be blank.\n";
            }

            if (TextUtils.isEmpty(NameProperty)){
                isValid = false;
                error += "* Name Property Cannot be blank.\n";
            }

            if (TextUtils.isEmpty(AddressProperty)){
                isValid = false;
                error += "* Address Property Cannot be blank.\n";
            }

            if (TextUtils.isEmpty(TypeProperty)){
                isValid = false;
                error += "* Type Property Cannot be blank.\n";
            }

            if (TextUtils.isEmpty(BedroomProperty)){
                isValid = false;
                error += "* Bedroom Property Cannot be blank.\n";
            }

            if (TextUtils.isEmpty(TimeProperty)){
                isValid = false;
                error += "* Time Property Cannot be blank.\n";
            }

            if (TextUtils.isEmpty(DateProperty)){
                isValid = false;
                error += "* Date Property Cannot be blank.\n";
            }

            if (TextUtils.isEmpty(MonthProperty)){
                isValid = false;
                error += "* Month Property Cannot be blank.\n";
            }

            if (TextUtils.isEmpty(FurnitureProperty)){
                isValid = false;
                error += "* Furniture Property Cannot be blank.\n";
            }
            if (TextUtils.isEmpty(NoteProperty)){
                isValid = false;
                error += "* NoteProperty Cannot be blank.\n";
            }
            if (TextUtils.isEmpty(ReporterProperty)){
                isValid = false;
                error += "* ReporterProperty Cannot be blank.\n";
            }

            tvErr.setText(error);

            if(isValid){
                Toast.makeText(view.getContext(),
                        IdProperty +"-"+
                                NameProperty+"-"+
                                AddressProperty+"-"+
                                TypeProperty+"-"+
                                BedroomProperty+"-"+
                                TimeProperty+"-"+
                                DateProperty+"-"+
                                MonthProperty+"-"+
                                FurnitureProperty+"-"+
                                NoteProperty+"-"+
                                ReporterProperty, Toast.LENGTH_LONG).show();

                Log.w("Test Activity","This is a warning log");

                Intent mainActivity = new Intent(view.getContext(), MainActivity.class);

                mainActivity.putExtra("IdProperty",IdProperty);
                mainActivity.putExtra("NameProperty",NameProperty);
                mainActivity.putExtra("AddressProperty",AddressProperty);
                mainActivity.putExtra("TypeProperty",TypeProperty);
                mainActivity.putExtra("BedroomProperty",BedroomProperty);
                mainActivity.putExtra("TimeProperty",TimeProperty);
                mainActivity.putExtra("DateProperty",DateProperty);
                mainActivity.putExtra("MonthProperty",MonthProperty);
                mainActivity.putExtra("FurnitureProperty",FurnitureProperty);
                mainActivity.putExtra("NoteProperty",NoteProperty);
                mainActivity.putExtra("ReporterProperty",ReporterProperty);

                startActivity(mainActivity);
                finish();
            }else {
                tvErr.setText(error);
                Log.e("Test Activity","This is error log");
            }
        }
    };
}