package nyc.c4q.rosmaryfc.scientificcalculator;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.udojava.evalex.Expression;

import java.math.BigDecimal;


public class MainActivity extends Activity {

    private Expression expression;
    private boolean expressionIsEvaluated;

    private String answerForBtnAns;
    //protected String input_expression_txt = "";

    public boolean previousCharIsOperator(String expression) {






        if(expression.length() >= 1){
            char previous_Char = expression.charAt(expression.length()-1);
            if(previous_Char == '/' || previous_Char == '*' || previous_Char == '-' || previous_Char == '.' || previous_Char == '+' || previous_Char == '%'|| previous_Char == '('){
                return true;
            }
        }
        return false;
    }






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //todo: fix issue where onTouch, keyboard should not display but user can move cursor and add text at desired location
        final EditText input_expression = (EditText) findViewById(R.id.input_expression);

        input_expression.setInputType(InputType.TYPE_NULL);
        if (android.os.Build.VERSION.SDK_INT >= 11) {
            input_expression.setRawInputType(InputType.TYPE_CLASS_TEXT);
            input_expression.setTextIsSelectable(true);
        }

        final TextView input_answer = (TextView) findViewById(R.id.input_answer);


        expressionIsEvaluated = false;

        answerForBtnAns = "";



        //Button =
        final Button buttonEqual = (Button) findViewById(R.id.equal);
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                expression = new Expression(input_expression.getText().toString());
                try {
                    BigDecimal response = expression.eval();
                    input_answer.setText(response.toPlainString());


                    answerForBtnAns = response.toPlainString();



                    //input_expression_txt = "";




                } catch (Exception exception) {
                    Toast.makeText(MainActivity.this, "Error:" + exception.getMessage(), Toast.LENGTH_LONG).show();
                }

                expressionIsEvaluated = true;

            }
        });


        //Button DEL
        final Button buttonDelete = (Button) findViewById(R.id.delete);
        buttonDelete.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if(expressionIsEvaluated){
                    input_expression.setText(input_answer.getText().toString());
                    input_answer.setText("");
                    expressionIsEvaluated = false;




                } else {
                    if (input_expression.length() != 0) {

                        String str = input_expression.getText().toString();
                        String newEditEquation = str.substring(0, (input_expression.length() - 1));

                        input_expression.setText(newEditEquation);

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

                input_expression.setText("");
                input_answer.setText("");

            }

        });

        //Button 0
        final Button buttonZero = (Button) findViewById(R.id.zero);
        buttonZero.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (expressionIsEvaluated) {
                    input_expression.setText("");
                    input_answer.setText("");
                    expressionIsEvaluated = false;
                }

                String equationTxt = buttonZero.getText().toString();
                input_expression.append(equationTxt);

            }
        });

        //Button 1
        final Button buttonOne = (Button) findViewById(R.id.one);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (expressionIsEvaluated) {
                    input_expression.setText("");
                    input_answer.setText("");
                    expressionIsEvaluated = false;
                }

                String equationTxt = buttonOne.getText().toString();
                input_expression.append(equationTxt);

            }
        });

        //Button 2
        final Button buttonTwo = (Button) findViewById(R.id.two);
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (expressionIsEvaluated) {
                    input_expression.setText("");
                    input_answer.setText("");
                    expressionIsEvaluated = false;
                }

                String equationTxt = buttonTwo.getText().toString();
                input_expression.append(equationTxt);

            }
        });

        //Button 3
        final Button buttonThree = (Button) findViewById(R.id.three);
        buttonThree.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (expressionIsEvaluated) {
                    input_expression.setText("");
                    input_answer.setText("");
                    expressionIsEvaluated = false;
                }

                String equationTxt = buttonThree.getText().toString();
                input_expression.append(equationTxt);

            }
        });

        //Button 4
        final Button buttonFour = (Button) findViewById(R.id.four);
        buttonFour.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (expressionIsEvaluated) {
                    input_expression.setText("");
                    input_answer.setText("");
                    expressionIsEvaluated = false;
                }

                String equationTxt = buttonFour.getText().toString();
                input_expression.append(equationTxt);

            }
        });

        //Button 5
        final Button buttonFive = (Button) findViewById(R.id.five);
        buttonFive.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (expressionIsEvaluated) {
                    input_expression.setText("");
                    input_answer.setText("");
                    expressionIsEvaluated = false;
                }

                String equationTxt = buttonFive.getText().toString();
                input_expression.append(equationTxt);

            }
        });

        //Button 6
        final Button buttonSix = (Button) findViewById(R.id.six);
        buttonSix.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (expressionIsEvaluated) {
                    input_expression.setText("");
                    input_answer.setText("");
                    expressionIsEvaluated = false;
                }

                String equationTxt = buttonSix.getText().toString();
                input_expression.append(equationTxt);

            }
        });

        //Button 7
        final Button buttonSeven = (Button) findViewById(R.id.seven);
        buttonSeven.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (expressionIsEvaluated) {
                    input_expression.setText("");
                    input_answer.setText("");
                    expressionIsEvaluated = false;
                }

                String equationTxt = buttonSeven.getText().toString();
                input_expression.append(equationTxt);

            }
        });

        //Button 8
        final Button buttonEight = (Button) findViewById(R.id.eight);
        buttonEight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (expressionIsEvaluated) {
                    input_expression.setText("");
                    input_answer.setText("");
                    expressionIsEvaluated = false;
                }

                String equationTxt = buttonEight.getText().toString();
                input_expression.append(equationTxt);

            }
        });

        //Button 9
        final Button buttonNine = (Button) findViewById(R.id.nine);
        buttonNine.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (expressionIsEvaluated) {
                    input_expression.setText("");
                    input_answer.setText("");
                    expressionIsEvaluated = false;
                }

                String equationTxt = buttonNine.getText().toString();
                input_expression.append(equationTxt);

            }
        });

        //Button /
        final Button buttonDivide = (Button) findViewById(R.id.divide);
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (expressionIsEvaluated) {
                    input_expression.setText("");
                    input_answer.setText("");
                    expressionIsEvaluated = false;
                }

                String inputExpStr = input_expression.getText().toString();

                if(inputExpStr.length() == 0 || previousCharIsOperator(inputExpStr)) {



                    return;
                } else {
                    String equationTxt = buttonDivide.getText().toString();
                    input_expression.append(equationTxt);
                }


            }
        });

        //Button *
        final Button buttonMultiply = (Button) findViewById(R.id.multiply);
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (expressionIsEvaluated) {
                    input_expression.setText("");
                    expressionIsEvaluated = false;
                }

                String inputExpStr = input_expression.getText().toString();

                if(inputExpStr.length() == 0 || previousCharIsOperator(inputExpStr)) {



                    return;
                } else {
                    String equationTxt = buttonMultiply.getText().toString();
                    input_expression.append(equationTxt);
                }

            }
        });

        //Button -
        final Button buttonSubtract = (Button) findViewById(R.id.subtract);
        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (expressionIsEvaluated) {
                    input_expression.setText("");
                    input_answer.setText("");
                    expressionIsEvaluated = false;
                }

                String inputExpStr = input_expression.getText().toString();

                if(inputExpStr.length() == 0 || previousCharIsOperator(inputExpStr)) {



                    return;
                }else {
                    String equationTxt = buttonSubtract.getText().toString();
                    input_expression.append(equationTxt);
                }
            }
        });

        //Button +
        final Button buttonAdd = (Button) findViewById(R.id.add);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (expressionIsEvaluated) {
                    input_expression.setText("");
                    input_answer.setText("");
                    expressionIsEvaluated = false;
                }

                String inputExpStr = input_expression.getText().toString();

                if(inputExpStr.length() == 0 || previousCharIsOperator(inputExpStr)) {



                    return;
                }else {
                    String equationTxt = buttonAdd.getText().toString();
                    input_expression.append(equationTxt);
                }
            }
        });


        //Todo: fix decimal so that after operand it will be able to add another decimal again. && will only contain one decimal per num
        //Button .
        final Button buttonDecimalPoint = (Button) findViewById(R.id.decimal_point);
        buttonDecimalPoint.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (expressionIsEvaluated) {
                    input_expression.setText("");
                    input_answer.setText("");
                    expressionIsEvaluated = false;
                }

                String inputExpStr = input_expression.getText().toString();

                //adds 0 before .
                if(inputExpStr.length() >= 2 ) { // does not add . if last two chars are 0.
                    if(inputExpStr.substring(inputExpStr.length()-2, inputExpStr.length()-1) == "0.") {
                        return;
                    }

                } else if(inputExpStr.length() == 0 || previousCharIsOperator(inputExpStr)) { //adds 0. if last char is + - * / % (



                    input_expression.append("0.");
                } else {
                    String equationTxt = buttonDecimalPoint.getText().toString();
                    input_expression.append(equationTxt);
                }

            }
        });

        //Button (
        final Button buttonOpenParenthesis = (Button) findViewById(R.id.open_parenthesis);
        buttonOpenParenthesis.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (expressionIsEvaluated) {
                    input_expression.setText("");
                    input_answer.setText("");
                    expressionIsEvaluated = false;
                }

                String equationTxt = buttonOpenParenthesis.getText().toString();
                input_expression.append(equationTxt);

            }
        });

        //Button )
        final Button buttonCloseParenthesis = (Button) findViewById(R.id.close_parenthesis);
        buttonCloseParenthesis.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (expressionIsEvaluated) {
                    input_expression.setText("");
                    input_answer.setText("");
                    expressionIsEvaluated = false;
                }

                String equationTxt = buttonCloseParenthesis.getText().toString();
                input_expression.append(equationTxt);

            }
        });

        //todo: configure button
        //Button %
        final Button buttonPercent = (Button) findViewById(R.id.percent);
        buttonPercent.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

<<<<<<< HEAD
                if (expressionIsEvaluated) {
                    input_expression.setText("");
                    input_answer.setText("");
                    expressionIsEvaluated = false;
                }










                input_expression.append("/100");

            }
        });


        //Landscape buttons --------------------------------------

        if (getResources().getConfiguration().orientation ==
                Configuration.ORIENTATION_LANDSCAPE) {
            //Button pi
            final Button buttonPi = (Button) findViewById(R.id.pi);
            buttonPi.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    String equationTxt = buttonPi.getText().toString();
                    input_expression.append(equationTxt);

                }
            });

        }




          //ButtonSquare Root
        if (getResources().getConfiguration().orientation ==
                Configuration.ORIENTATION_LANDSCAPE) {
            //Button square root
            final Button buttonSqrt = (Button) findViewById(R.id.square_root);
            buttonSqrt.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    String equationTxt = buttonSqrt.getText().toString();

                    input_expression.append(equationTxt);

                }
            });

        }
        if (getResources().getConfiguration().orientation ==
                Configuration.ORIENTATION_LANDSCAPE) {
            //Button COS
            final Button buttonCos = (Button) findViewById(R.id.cos);
            buttonCos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    String equationTxt = buttonCos.getText().toString();
                    input_expression.append(equationTxt);

                }
            });

        }

        if (getResources().getConfiguration().orientation ==
                Configuration.ORIENTATION_LANDSCAPE) {
            //Button SIN
            final Button buttonSin = (Button) findViewById(R.id.sine);
            buttonSin.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    String equationTxt = buttonSin.getText().toString();
                    input_expression.append(equationTxt);

                }
            });

        }
        if (getResources().getConfiguration().orientation ==
                Configuration.ORIENTATION_LANDSCAPE) {
            //Button TAN
            final Button buttonTan = (Button) findViewById(R.id.tan);
            buttonTan.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    String equationTxt = buttonTan.getText().toString();
                    input_expression.append(equationTxt);

                }
            });

        }

        if (getResources().getConfiguration().orientation ==
                Configuration.ORIENTATION_LANDSCAPE) {
            //Button Degree
            final Button buttonDeg = (Button) findViewById(R.id.degree);
            buttonDeg.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    String equationTxt = buttonDeg.getText().toString();
                    input_expression.append(equationTxt);


                }
            });






        }

        if (getResources().getConfiguration().orientation ==
                Configuration.ORIENTATION_LANDSCAPE) {
            //Button Radians
            final Button buttonRad = (Button) findViewById(R.id.radian);
            buttonRad.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    String equationTxt = buttonRad.getText().toString();
                    input_expression.append(equationTxt);


                }
            });

        }


















        if (getResources().getConfiguration().orientation ==

                Configuration.ORIENTATION_LANDSCAPE) {
            //Button Log10
            final Button buttonLog= (Button) findViewById(R.id.log10);
            buttonLog.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    String equationTxt = buttonLog.getText().toString();
                    input_expression.append(equationTxt);

                }
            });

        }

        if (getResources().getConfiguration().orientation ==
                Configuration.ORIENTATION_LANDSCAPE) {
            //Button ^
            final Button buttonCarat = (Button) findViewById(R.id.exponent);
            buttonCarat.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    String equationTxt = buttonCarat.getText().toString();
                    input_expression.append("^");

                }
            });

        }

        if (getResources().getConfiguration().orientation ==
                Configuration.ORIENTATION_LANDSCAPE) {
            //Button LN
            final Button buttonLN = (Button) findViewById(R.id.LOG);
            buttonLN.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    String equationTxt = buttonLN.getText().toString();
                    input_expression.append(equationTxt);

                }
            });

        }

        if (getResources().getConfiguration().orientation ==
                Configuration.ORIENTATION_LANDSCAPE) {
            //Button abs
            final Button buttonAbs = (Button) findViewById(R.id.abs);
            buttonAbs.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    String equationTxt = buttonAbs.getText().toString();
                    input_expression.append(equationTxt);

                }
            });

        }

        if (getResources().getConfiguration().orientation ==
                Configuration.ORIENTATION_LANDSCAPE) {

            //Button ANS
            final Button buttonAns = (Button) findViewById(R.id.answer);
            buttonAns.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    if (expressionIsEvaluated) {
                        input_expression.setText("");
                        input_answer.setText("");
                        expressionIsEvaluated = false;
                    }
                    String expString = input_expression.getText().toString();

                    if (answerForBtnAns.length() == 0) {
                        return;
                    } else if (expString.length() >= 1) {
                        if (expString.substring(((expString.length() - answerForBtnAns.length())), (expString.length())).equals(answerForBtnAns)) {
                            input_expression.append("*" + answerForBtnAns);
                        }
                    } else if (answerForBtnAns.length() != 0) {
                        input_expression.append(answerForBtnAns);
                    }
                }
            });




            //Button EXP
            final Button buttonExp = (Button) findViewById(R.id.exp);
            buttonExp.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    String equationTxt = buttonExp.getText().toString();
                    input_expression.append("*10^");

                }
            });

        }

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



