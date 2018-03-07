package se2.se2einzelphase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.StringBuilderPrinter;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Palindrom (View view){

        String palindrom;
        EditText eingabe = (EditText)findViewById(R.id.editTextEingabe);
        TextView ergebnis = (TextView)findViewById(R.id.textViewErgebnis);

        palindrom = (eingabe).getText().toString().toLowerCase();

        //Abfragen um Anforderungen an das Wort zu ueberpruefen
        if(palindrom.length() < 1){
            ergebnis.setText("Kein String wurde eingegeben");
        } else if (palindrom.length() <= 4) {
            ergebnis.setText("Der String muss mindestens 5 Zeichen lang sein!");
        } else if (palindrom.contains(" ")) {
            ergebnis.setText("Der String beinhaltet ein Leerzeichen");
        } else {
            if(isPalindrome(palindrom)==true){
                ergebnis.setText("Das eingegebene Wort ist ein Palindrom");
            } else {
                ergebnis.setText(("Das eingegebene Wort ist KEIN Palindrom"));
            }
        }

    }

    public static boolean isPalindrome(String str){
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}


