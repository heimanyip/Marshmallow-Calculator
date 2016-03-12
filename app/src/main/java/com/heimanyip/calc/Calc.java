package com.heimanyip.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.math.BigDecimal;
import java.math.MathContext;

public class Calc extends AppCompatActivity {

    private Button mButton7;
    private Button mButton8;
    private Button mButton9;

    private Button mButton4;
    private Button mButton5;
    private Button mButton6;

    private Button mButton0;
    private Button mButton1;
    private Button mButton2;
    private Button mButton3;

    private Button mButtonAC;
    private Button mButtonDecimal;
    private Button mButtonAddition;
    private Button mButtonSubtraction;
    private Button mButtonMultiplication;
    private Button mButtonDivision;
    private Button mButtonEquals;
    private Button mButtonPlusMinus;
    private Button mButtonSQRT;

    private BigDecimal mNumber1 = new BigDecimal(0);
    private BigDecimal mNumber2 = new BigDecimal(0);
    private String mNumber1AsString = "0";
    private String mNumber2AsString = "0";
    private String mState = "1";
    private String mCurrentNumberAsString = "0";
    private String mOperator;
    private String mLastInput;
    private String textViewNumber;

    private TextView mTextView;

    private Model model = new Model();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        mButton7 = (Button) findViewById(R.id.button7);
        mButton8 = (Button) findViewById(R.id.button8);
        mButton9 = (Button) findViewById(R.id.button9);

        mButton4 = (Button) findViewById(R.id.button4);
        mButton5 = (Button) findViewById(R.id.button5);
        mButton6 = (Button) findViewById(R.id.button6);

        mButton0 = (Button) findViewById(R.id.button0);
        mButton1 = (Button) findViewById(R.id.button1);
        mButton2 = (Button) findViewById(R.id.button2);
        mButton3 = (Button) findViewById(R.id.button3);

        mButtonAC = (Button) findViewById(R.id.buttonAC);
        mButtonDecimal = (Button) findViewById(R.id.buttonDecimal);
        mButtonAddition = (Button) findViewById(R.id.buttonAddition);
        mButtonSubtraction = (Button) findViewById(R.id.buttonSubtraction);
        mButtonMultiplication = (Button) findViewById(R.id.buttonMultiplication);
        mButtonDivision = (Button) findViewById(R.id.buttonDivision);
        mButtonEquals = (Button) findViewById(R.id.buttonEquals);
        mButtonPlusMinus = (Button) findViewById(R.id.buttonPlusMinus);
        mButtonSQRT = (Button) findViewById(R.id.buttonSQRT);


        mTextView = (TextView) findViewById(R.id.textView);
        allClear();
        if (mState.equals("1")) {
            mCurrentNumberAsString = mNumber1AsString;
        } else mCurrentNumberAsString = mNumber2AsString;

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.button0:
                        if (mLastInput.equals("=")) {
                            allClear();
                        }

                        if (!mLastInput.equals("") && !mLastInput.equals("+") && !mLastInput.equals("-") && !mLastInput.equals("×") && !mLastInput.equals("÷") && !mLastInput.equals("=")) {
                            mCurrentNumberAsString = mCurrentNumberAsString + "0";
                            mTextView.setText(mCurrentNumberAsString);
                        }
                        mLastInput = "0";
                        break;
                    case R.id.button1:
                        if (mLastInput.equals("=")) {
                            allClear();
                        }
                        if (!mLastInput.equals("") && !mLastInput.equals("+") && !mLastInput.equals("-") && !mLastInput.equals("×") && !mLastInput.equals("÷") && !mLastInput.equals("=")) {
                            mCurrentNumberAsString = mCurrentNumberAsString + "1";
                            mTextView.setText(mCurrentNumberAsString);
                        } else {
                            mCurrentNumberAsString = "1";
                            mTextView.setText(mCurrentNumberAsString);
                        }
                        mLastInput = "1";
                        break;
                    case R.id.button2:
                        if (mLastInput.equals("=")) {
                            allClear();
                        }
                        if (!mLastInput.equals("") && !mLastInput.equals("+") && !mLastInput.equals("-") && !mLastInput.equals("×") && !mLastInput.equals("÷") && !mLastInput.equals("=")) {
                            mCurrentNumberAsString = mCurrentNumberAsString + "2";
                            mTextView.setText(mCurrentNumberAsString);
                        } else {
                            mCurrentNumberAsString = "2";
                            mTextView.setText(mCurrentNumberAsString);
                        }
                        mLastInput = "2";
                        break;
                    case R.id.button3:
                        if (mLastInput.equals("=")) {
                            allClear();
                        }
                        if (!mLastInput.equals("") && !mLastInput.equals("+") && !mLastInput.equals("-") && !mLastInput.equals("×") && !mLastInput.equals("÷") && !mLastInput.equals("=")) {
                            mCurrentNumberAsString = mCurrentNumberAsString + "3";
                            mTextView.setText(mCurrentNumberAsString);
                        } else {
                            mCurrentNumberAsString = "3";
                            mTextView.setText(mCurrentNumberAsString);
                        }
                        mLastInput = "3";
                        break;
                    case R.id.button4:
                        if (mLastInput.equals("=")) {
                            allClear();
                        }
                        if (!mLastInput.equals("") && !mLastInput.equals("+") && !mLastInput.equals("-") && !mLastInput.equals("×") && !mLastInput.equals("÷") && !mLastInput.equals("=")) {
                            mCurrentNumberAsString = mCurrentNumberAsString + "4";
                            mTextView.setText(mCurrentNumberAsString);
                        } else {
                            mCurrentNumberAsString = "4";
                            mTextView.setText(mCurrentNumberAsString);
                        }
                        mLastInput = "4";
                        break;
                    case R.id.button5:
                        if (mLastInput.equals("=")) {
                            allClear();
                        }
                        if (!mLastInput.equals("") && !mLastInput.equals("+") && !mLastInput.equals("-") && !mLastInput.equals("×") && !mLastInput.equals("÷") && !mLastInput.equals("=")) {
                            mCurrentNumberAsString = mCurrentNumberAsString + "5";
                            mTextView.setText(mCurrentNumberAsString);
                        } else {
                            mCurrentNumberAsString = "5";
                            mTextView.setText(mCurrentNumberAsString);
                        }
                        mLastInput = "5";
                        break;
                    case R.id.button6:
                        if (mLastInput.equals("=")) {
                            allClear();
                        }
                        if (!mLastInput.equals("") && !mLastInput.equals("+") && !mLastInput.equals("-") && !mLastInput.equals("×") && !mLastInput.equals("÷") && !mLastInput.equals("=")) {
                            mCurrentNumberAsString = mCurrentNumberAsString + "6";
                            mTextView.setText(mCurrentNumberAsString);
                        } else {
                            mCurrentNumberAsString = "6";
                            mTextView.setText(mCurrentNumberAsString);
                        }
                        mLastInput = "6";
                        break;
                    case R.id.button7:
                        if (mLastInput.equals("=")) {
                            allClear();
                        }
                        if (!mLastInput.equals("") && !mLastInput.equals("+") && !mLastInput.equals("-") && !mLastInput.equals("×") && !mLastInput.equals("÷") && !mLastInput.equals("=")) {
                            mCurrentNumberAsString = mCurrentNumberAsString + "7";
                            mTextView.setText(mCurrentNumberAsString);
                        } else {
                            mCurrentNumberAsString = "7";
                            mTextView.setText(mCurrentNumberAsString);
                        }
                        mLastInput = "7";
                        break;
                    case R.id.button8:
                        if (mLastInput.equals("=")) {
                            allClear();
                        }
                        if (!mLastInput.equals("") && !mLastInput.equals("+") && !mLastInput.equals("-") && !mLastInput.equals("×") && !mLastInput.equals("÷") && !mLastInput.equals("=")) {
                            mCurrentNumberAsString = mCurrentNumberAsString + "8";
                            mTextView.setText(mCurrentNumberAsString);
                        } else {
                            mCurrentNumberAsString = "8";
                            mTextView.setText(mCurrentNumberAsString);
                        }
                        mLastInput = "8";
                        break;
                    case R.id.button9:
                        if (mLastInput.equals("=")) {
                            allClear();
                        }
                        if (!mLastInput.equals("") && !mLastInput.equals("+") && !mLastInput.equals("-") && !mLastInput.equals("×") && !mLastInput.equals("÷") && !mLastInput.equals("=")) {
                            mCurrentNumberAsString = mCurrentNumberAsString + "9";
                            mTextView.setText(mCurrentNumberAsString);
                        } else {
                            mCurrentNumberAsString = "9";
                            mTextView.setText(mCurrentNumberAsString);
                        }
                        mLastInput = "9";
                        break;

                    case R.id.buttonAC:
                        allClear();
                        break;

                    case R.id.buttonDecimal:
                        if (mLastInput.equals("=")) {
                            allClear();
                        }
                        if (!mCurrentNumberAsString.contains(".")) {
                            mCurrentNumberAsString = mCurrentNumberAsString + ".";
                            mTextView.setText(mCurrentNumberAsString);
                        }
                        mLastInput = ".";
                        break;

                    case R.id.buttonAddition:
                        mOperator = "+";
                        operatorClicked("+");
                        mOperator = "+";
                        mLastInput = "+";
                        break;

                    case R.id.buttonSubtraction:
                        mOperator = "-";
                        operatorClicked("-");
                        mOperator = "-";
                        mLastInput = "-";
                        break;

                    case R.id.buttonMultiplication:
                        mOperator = "×";
                        operatorClicked("×");
                        mOperator = "×";
                        mLastInput = "×";
                        break;

                    case R.id.buttonDivision:
                        mOperator = "÷";
                        operatorClicked("÷");
                        mOperator = "÷";
                        mLastInput = "÷";
                        break;

                    case R.id.buttonEquals:
                        result();
                        mLastInput = "=";
                        break;

                    case R.id.buttonPlusMinus:
                        if (mLastInput.equals("+") || mLastInput.equals("-") || mLastInput.equals("×") || mLastInput.equals("÷")) {
                            mTextView.setText("0");
                        }

                        textViewNumber = mTextView.getText().toString().replaceAll(",", "");
                        mCurrentNumberAsString = model.invert(new BigDecimal(textViewNumber)).toString();
                        mTextView.setText(mCurrentNumberAsString);

                        break;

                    case R.id.buttonSQRT:
                        if (mCurrentNumberAsString.contains("-") || mTextView.getText().toString().contains("-")) {

                        } else {
                            mCurrentNumberAsString = model.sqrt(new BigDecimal(mCurrentNumberAsString)).toString();
                            mTextView.setText(mCurrentNumberAsString);
                        }
                        break;

                }
            }
        };

        mButton7.setOnClickListener(listener);
        mButton8.setOnClickListener(listener);
        mButton9.setOnClickListener(listener);

        mButton4.setOnClickListener(listener);
        mButton5.setOnClickListener(listener);
        mButton6.setOnClickListener(listener);

        mButton0.setOnClickListener(listener);
        mButton1.setOnClickListener(listener);
        mButton2.setOnClickListener(listener);
        mButton3.setOnClickListener(listener);

        mButtonAC.setOnClickListener(listener);
        mButtonDecimal.setOnClickListener(listener);

        mButtonAddition.setOnClickListener(listener);
        mButtonSubtraction.setOnClickListener(listener);
        mButtonMultiplication.setOnClickListener(listener);
        mButtonDivision.setOnClickListener(listener);
        mButtonEquals.setOnClickListener(listener);
        mButtonPlusMinus.setOnClickListener(listener);
        mButtonSQRT.setOnClickListener(listener);


    }

    private void allClear() {
        mTextView.setText("0");
        mState = "1";
        mNumber1 = BigDecimal.ZERO;
        mNumber2 = BigDecimal.ZERO;
        mNumber1AsString = "0";
        mNumber2AsString = "0";
        mCurrentNumberAsString = "0";
        mLastInput = "";
        mOperator = null;

        //debug
        System.out.println("ALL CLEAR");
        System.out.println("--------------------------------------------");
    }


    private void operatorClicked(String operator) {
        if (!operator.equals("=") && mState.equals("1")) {
            mCurrentNumberAsString = mCurrentNumberAsString.replaceAll(",", "");
            mNumber1 = new BigDecimal(mCurrentNumberAsString);
            mCurrentNumberAsString = "0";
        }

        if (!operator.equals("=") && mState.equals("2") && !mLastInput.equals("+") && !mLastInput.equals("-") && !mLastInput.equals("×") && !mLastInput.equals("÷") && !mLastInput.equals("=")) {
            mCurrentNumberAsString = mCurrentNumberAsString.replaceAll(",", "");
            mNumber2 = new BigDecimal(mCurrentNumberAsString);
            mNumber1 = model.calculate(mNumber1, mNumber2, operator);
            mTextView.setText(mNumber1.toString());
            mNumber2 = BigDecimal.ZERO;
            mNumber2AsString = "0";


        }
        mState = "2";
    }

    private void result() {
        if (mState.equals("2") && !mLastInput.equals("=")) {
            System.out.println(mNumber1);
            System.out.println(mOperator);
            mCurrentNumberAsString = mCurrentNumberAsString.replaceAll(",", "");
            mNumber2 = new BigDecimal(mCurrentNumberAsString);
            System.out.println(mNumber2);
            mNumber1 = model.calculate(mNumber1, mNumber2, mOperator);
            mTextView.setText(mNumber1.toString());
            mNumber2 = BigDecimal.ZERO;
            mNumber2AsString = "0";
        }

    }
}
//BigDecimal result = model.calculate(mNumber1, mNumber2, mOperator);