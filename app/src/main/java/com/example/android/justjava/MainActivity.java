/**
 * Add your package below. Package name can be found in the project's AndroidManifest.xml file.
 * This is the package name our example uses:
 *
 *
 */

package com.example.android.justjava;
import java.text.NumberFormat;
//import android.icu.text.NumberFormat;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.android.justjava.R;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int quantity = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {


        //int numberOfCoffees = 3;
        //display(numberOfCoffees);
        //displayPrice(quantity * 5);
        int price = calculatePrice();
        displayPrice(price);
        displayMessage("Thank You Amigo !");
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int Number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + Number );
    }


    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    public void Increment(View view) {

        quantity = quantity + 1;
        displayQuantity(quantity);
    }

    public void Decrement(View view) {
        quantity = quantity - 1;
        displayQuantity(quantity);
    }

    /**
     * This method displays the given text on the screen.
     */
    public void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.Thanks_view);
        priceTextView.setText(message);
    }


    /**
     * Calculates the price of the order.
     *
     * quantity  is the number of cups of coffee ordered
     */
    private int calculatePrice() {

            return quantity * 5;

        //int price = quantity * 5;
    }
}