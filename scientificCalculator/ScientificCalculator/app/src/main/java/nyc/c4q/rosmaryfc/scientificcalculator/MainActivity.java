package nyc.c4q.rosmaryfc.scientificcalculator;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editEquation = (EditText) findViewById(R.id.equation);

        //todo: fix issue where onTouch, keyboard should not display but user can move cursor and add text at desired location
        editEquation.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                int inType = editEquation.getInputType(); // backup input type
                editEquation.setInputType(InputType.TYPE_NULL); // disable soft input
                //editEquation.onTouchEvent(motionEvent); //call native handler
                //editEquation.setInputType(inType); // restore input type
                return true; //consume touch even

                /**
                 * int inType = MyEditor.getInputType(); // backup the input type
                 MyEditor.setInputType(InputType.TYPE_NULL); // disable soft input
                 MyEditor.onTouchEvent(event); // call native handler
                 MyEditor.setInputType(inType); // restore input type
                 return true; // consume touch even
                 */
            }
        });


        //todo: how to add a text to another view by pressing a button and assigning a character to it.

        //Button DEL
        final Button buttonDelete = (Button) findViewById(R.id.delete);
        buttonDelete.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.delete:

                        if(editEquation.length() != 0) {

                            String str = editEquation.getText().toString();
                            String newEditEquation = str.substring(0,(editEquation.length()-1));

                            editEquation.setText(newEditEquation);

                        } else {
                            // do nothing
                        }

                }
            }
        });

        //Button C
        final Button buttonClear = (Button) findViewById(R.id.clear);
        buttonClear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.clear:

                        editEquation.setText("");

                        break;
                }
            }
        });

        //Button 0
        final Button buttonZero = (Button) findViewById(R.id.zero);
        buttonZero.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.zero:

                        Bundle bundle = new Bundle();
                        bundle.putString("btn0", buttonZero.getText().toString());
                        String equationTxt = bundle.getString("btn0");
                        editEquation.append(equationTxt);

                        break;
                }
            }
        });

        //Button 1
        final Button buttonOne = (Button) findViewById(R.id.one);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.one:

                        Bundle bundle = new Bundle();
                        bundle.putString("btn1", buttonOne.getText().toString());
                        String equationTxt = bundle.getString("btn1");
                        editEquation.append(equationTxt);

                        break;
                }
            }
        });

        //Button 2
        final Button buttonTwo = (Button) findViewById(R.id.two);
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.two:

                        Bundle bundle = new Bundle();
                        bundle.putString("btn2", buttonTwo.getText().toString());
                        String equationTxt = bundle.getString("btn2");
                        editEquation.append(equationTxt);

                        break;
                }
            }
        });

        //Button 3
        final Button buttonThree = (Button) findViewById(R.id.three);
        buttonThree.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.three:

                        Bundle bundle = new Bundle();
                        bundle.putString("btn3", buttonThree.getText().toString());
                        String equationTxt = bundle.getString("btn3");
                        editEquation.append(equationTxt);

                        break;
                }
            }
        });

        //Button 4
        final Button buttonFour = (Button) findViewById(R.id.four);
        buttonFour.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.four:

                        Bundle bundle = new Bundle();
                        bundle.putString("btn4", buttonFour.getText().toString());
                        String equationTxt = bundle.getString("btn4");
                        editEquation.append(equationTxt);

                        break;
                }
            }
        });

        //Button 5
        final Button buttonFive = (Button) findViewById(R.id.five);
        buttonFive.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.five:

                        Bundle bundle = new Bundle();
                        bundle.putString("btn5", buttonFive.getText().toString());
                        String equationTxt = bundle.getString("btn5");
                        editEquation.append(equationTxt);

                        break;
                }
            }
        });

        //Button 6
        final Button buttonSix = (Button) findViewById(R.id.six);
        buttonSix.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.six:

                        Bundle bundle = new Bundle();
                        bundle.putString("btn6", buttonSix.getText().toString());
                        String equationTxt = bundle.getString("btn6");
                        editEquation.append(equationTxt);

                        break;
                }
            }
        });

        //Button 7
        final Button buttonSeven = (Button) findViewById(R.id.seven);
        buttonSeven.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.seven:

                        Bundle bundle = new Bundle();
                        bundle.putString("btn7", buttonSeven.getText().toString());
                        String equationTxt = bundle.getString("btn7");
                        editEquation.append(equationTxt);

                        break;
                }
            }
        });

        //Button 8
        final Button buttonEight = (Button) findViewById(R.id.eight);
        buttonEight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.eight:

                        Bundle bundle = new Bundle();
                        bundle.putString("btn8", buttonEight.getText().toString());
                        String equationTxt = bundle.getString("btn8");
                        editEquation.append(equationTxt);

                        break;
                }
            }
        });

        //Button 9
        final Button buttonNine = (Button) findViewById(R.id.nine);
        buttonNine.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.nine:

                        Bundle bundle = new Bundle();
                        bundle.putString("btn9", buttonNine.getText().toString());
                        String equationTxt = bundle.getString("btn9");
                        editEquation.append(equationTxt);

                        break;
                }
            }
        });

        //Button /
        final Button buttonDivide = (Button) findViewById(R.id.divide);
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.divide:

                        Bundle bundle = new Bundle();
                        bundle.putString("btn/", buttonDivide.getText().toString());
                        String equationTxt = bundle.getString("btn/");
                        editEquation.append(equationTxt);

                        break;
                }
            }
        });

        //Button *
        final Button buttonMultiply = (Button) findViewById(R.id.multiply);
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.multiply:

                        Bundle bundle = new Bundle();
                        bundle.putString("btn*", buttonMultiply.getText().toString());
                        String equationTxt = bundle.getString("btn*");
                        editEquation.append(equationTxt);

                        break;
                }
            }
        });

        //Button -
        final Button buttonSubtract = (Button) findViewById(R.id.subtract);
        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.subtract:

                        Bundle bundle = new Bundle();
                        bundle.putString("btn-", buttonSubtract.getText().toString());
                        String equationTxt = bundle.getString("btn-");
                        editEquation.append(equationTxt);

                        break;
                }
            }
        });

        //Button +
        final Button buttonAdd = (Button) findViewById(R.id.add);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.add:

                        Bundle bundle = new Bundle();
                        bundle.putString("btn+", buttonAdd.getText().toString());
                        String equationTxt = bundle.getString("btn+");
                        editEquation.append(equationTxt);

                        break;
                }
            }
        });

        //Button .
        final Button buttonDecimalPoint = (Button) findViewById(R.id.decimal_point);
        buttonDecimalPoint.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.decimal_point:

                        Bundle bundle = new Bundle();
                        bundle.putString("btn.", buttonDecimalPoint.getText().toString());
                        String equationTxt = bundle.getString("btn.");
                        editEquation.append(equationTxt);

                        break;
                }
            }
        });

        //Button (
        final Button buttonOpenParenthesis = (Button) findViewById(R.id.open_parenthesis);
        buttonOpenParenthesis.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.open_parenthesis:

                        Bundle bundle = new Bundle();
                        bundle.putString("btn(", buttonOpenParenthesis.getText().toString());
                        String equationTxt = bundle.getString("btn(");
                        editEquation.append(equationTxt);

                        break;
                }
            }
        });

        //Button )
        final Button buttonCloseParenthesis = (Button) findViewById(R.id.close_parenthesis);
        buttonCloseParenthesis.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.close_parenthesis:

                        Bundle bundle = new Bundle();
                        bundle.putString("btn)", buttonCloseParenthesis.getText().toString());
                        String equationTxt = bundle.getString("btn)");
                        editEquation.append(equationTxt);

                        break;
                }
            }
        });


        //Button %
        final Button buttonPercent = (Button) findViewById(R.id.percent);
        buttonPercent.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.percent:

                        Bundle bundle = new Bundle();
                        bundle.putString("btn%", buttonPercent.getText().toString());
                        String equationTxt = bundle.getString("btn%");
                        editEquation.append(equationTxt);

                        break;
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
