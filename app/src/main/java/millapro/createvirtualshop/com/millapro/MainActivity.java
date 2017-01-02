package millapro.createvirtualshop.com.millapro;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.createvirtualshop.millapro.MillaMoveFreeView;
import com.createvirtualshop.millapro.MillaViewFreeCallback;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FloatingActionButton fab=(FloatingActionButton)findViewById(R.id.fab);
        MillaMoveFreeView millaMoveFreeView=new MillaMoveFreeView(this, new MillaViewFreeCallback() {
            @Override
            public View Millasingleclick() {
                Toast.makeText(MainActivity.this,"fab click occured",Toast.LENGTH_SHORT).show();
                return null;
            }

            @Override
            public View MillaMoving() {
                return null;
            }
        });
        millaMoveFreeView.makeviewfree(fab);
    }
}
