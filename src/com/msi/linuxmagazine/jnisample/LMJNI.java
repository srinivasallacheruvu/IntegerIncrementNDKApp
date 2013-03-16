package com.msi.linuxmagazine.jnisample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LMJNI extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		Button btnGetString = (Button) this.findViewById(R.id.btnGetString);
		btnGetString.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {
				TextView label = (TextView) findViewById(R.id.TheLabel);
				label.setText(stringFromJNI()); // calling a JNI function here!
			}
		});

		Button btnAddNumber = (Button) this.findViewById(R.id.btnAddNumber);
		btnAddNumber.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {
				TextView numberField = (TextView) findViewById(R.id.number);
				int operand = Integer
						.parseInt(numberField.getText().toString());
				int answer = incrementFromJNI(operand); // calling a JNI
														// function here!
				numberField.setText("" + answer);
			}
		});
	}

	// declare the externally provided methods
	public native String stringFromJNI();

	public native int incrementFromJNI(int number);

	static {
		// load our JNI library. Note, leave off the "lib" and the ".so"
		System.loadLibrary("linuxmagazine");
	}
}