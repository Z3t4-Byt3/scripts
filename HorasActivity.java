package usuario.app.bancodehoras;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;


public class HorasActivity extends AppCompatActivity {

    Button bttela2, bttelaprincipal,btcalendario;
    int day_x,month_x,year_x;
    static final int DILOG_ID = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horas);
        CarregarTelaPrincipal();

    }

    public void CarregarTelaPrincipal() {
        setContentView(R.layout.activity_horas);
        bttela2 = (Button) findViewById(R.id.bttela2);
        bttela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarregarTela2();
                showDialogOnButtonClick();
            }
        });
    }

    public void CarregarTela2() {
        setContentView(R.layout.tela2);
        bttelaprincipal = (Button) findViewById(R.id.bttelaprincipal);
        bttelaprincipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarregarTelaPrincipal();

            }
        });




    }
    //meu codigo

    public void showDialogOnButtonClick(){
        btcalendario = (Button) findViewById(R.id.btcalendario);

        btcalendario.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        showDialog(DILOG_ID);

                    }
                });

    }
    @Override
    protected Dialog onCreateDialog(int id){
        if (id == DILOG_ID)
            return new DatePickerDialog(this, dpickerListner,day_x,month_x,year_x);
        return null;


    }
    private DatePickerDialog.OnDateSetListener dpickerListner
            = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
            day_x = dayOfMonth;
            month_x = monthOfYear;
            year_x = year;
            Toast.makeText(HorasActivity.this,day_x  + "/" + month_x + "/" + year_x, Toast.LENGTH_LONG).show();
        }
    };

}

