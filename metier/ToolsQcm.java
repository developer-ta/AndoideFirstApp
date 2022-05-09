package fr.doranco.qcmapp.metier;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.Gravity;
import android.widget.TextView;
import android.widget.Toast;

import fr.doranco.qcmapp.MainActivity;

public class ToolsQcm {
    public static boolean isValidatedChar(char ch) {
        return true;

    }

    public static boolean isValidatedEnter(boolean colorChageger) {
        return colorChageger;

    }

    public final static void alertMegNoValide(Context context,int x,int y) {
        Toast toast = Toast.makeText(
                context, "entrez des lettre valide", Toast.LENGTH_SHORT);

        toast.setGravity(Gravity.TOP,  x, y);
        TextView textView =toast.getView().findViewById(android.R.id.message);
        textView.setTextSize(20);
        textView.setTextColor(Color.WHITE);
        toast.getView().getBackground().setColorFilter(Color.rgb(255, 0, 0), PorterDuff.Mode.SRC_IN);
        toast.show();

    }
}
