/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

package com.example.kunj.justjava;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*In Android the visual design is created in xml . And each Activity is associated to a design
setContentView(R.layout.main)
R means Resource
layout means design
main is the xml you have created under res->layout->main.xml
Whenever you want to change your current Look of an Activity or when you move from one Activity to another . The other Activity must have a design to show . So we call this method in onCreate and this is the second statement to set the design
*/
    }

    int numberOfCoffees = 0;
    String message2 = "Thank you!";
    String message1 = "Price: ";

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        display(numberOfCoffees);
        displayMessage(message1, message2,numberOfCoffees);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayMessage(String message1, String message2,int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message1 + NumberFormat.getCurrencyInstance().format(number*5) +"\n"+ message2);
    }

    public void increment(View view) {
        int quantity = ++numberOfCoffees;
        display(quantity);
    }

    public void decrement(View view) {
        int quantity = --numberOfCoffees;
        display(quantity);
    }
}
