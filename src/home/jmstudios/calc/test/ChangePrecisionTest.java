package home.jmstudios.calc.test;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;
import home.jmstudios.calc.Main;
import home.jmstudios.calc.R;

import com.robotium.solo.Solo;

public class ChangePrecisionTest extends ActivityInstrumentationTestCase2<Main>{
	private Solo solo;
	public ChangePrecisionTest() {

        super("home.jmstudios.calc", Main.class);

        }

        

    public void setUp() throws Exception {

        this.solo=new Solo(getInstrumentation(), getActivity());

           }

           

    public void testUI() throws Exception {
    	solo.sendKey(Solo.MENU);
    	solo.clickOnText("Settings");
    	solo.clickOnText("Precision");
    	solo.clearEditText(0);
    	solo.enterText(0, "5");
    	solo.clickOnText("OK");
    	solo.goBack();
    	solo.clickOnButton("1");
    	solo.clickOnButton("/");
    	solo.clickOnButton("3");
    	solo.clickOnButton("=");
    	EditText myEditText = (android.widget.EditText) solo.getView(R.id.editText1);
        assertEquals(0.33333, Float.parseFloat(myEditText.getText().toString()), 0);

    }
}
