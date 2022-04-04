package vn.com.greenwich.apprentalz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvId = findViewById(R.id.tvid);
        TextView tvName = findViewById(R.id.tvname);
        TextView tvAddress = findViewById(R.id.tvaddress);
        TextView tvType = findViewById(R.id.tvtype);
        TextView tvBedroom = findViewById(R.id.tvbed);
        TextView tvTime = findViewById(R.id.tvtime);
        TextView tvDate = findViewById(R.id.tvdate);
        TextView tvPrice = findViewById(R.id.tvprice);
        TextView tvFurniture = findViewById(R.id.tvfurniture);
        TextView tvNote = findViewById(R.id.tvnote);
        TextView tvReporter = findViewById(R.id.tvreporter);



        String IdProperty = "",
                NameProperty= "",
                AddressProperty= "",
                TypeProperty= "",
                BedroomProperty= "",
                TimeProperty= "",
                DateProperty= "",
                MonthProperty= "",
                FurnitureProperty="",
                NoteProperty="",
                ReporterProperty="" ;
        Intent intent = getIntent();

        IdProperty = intent.getStringExtra("IdProperty");
        NameProperty = intent.getStringExtra("NameProperty");
        AddressProperty = intent.getStringExtra("AddressProperty");
        TypeProperty = intent.getStringExtra("TypeProperty");
        BedroomProperty = intent.getStringExtra("BedroomProperty");
        TimeProperty = intent.getStringExtra("TimeProperty");
        DateProperty = intent.getStringExtra("DateProperty");
        MonthProperty = intent.getStringExtra("MonthProperty");
        FurnitureProperty = intent.getStringExtra("FurnitureProperty");
        NoteProperty = intent.getStringExtra("NoteProperty");
        ReporterProperty = intent.getStringExtra("ReporterProperty");

        tvId.setText(IdProperty);
        tvName.setText(NameProperty);
        tvAddress.setText(AddressProperty);
        tvType.setText(TypeProperty);
        tvBedroom.setText(BedroomProperty);
        tvTime.setText(TimeProperty);
        tvDate.setText(DateProperty);
        tvPrice.setText(MonthProperty);
        tvFurniture.setText(FurnitureProperty);
        tvNote.setText(NoteProperty);
        tvReporter.setText(ReporterProperty);



    }
}