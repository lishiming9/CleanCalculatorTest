package home.jmstudios.calc.test;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;
import home.jmstudios.calc.Main;
import home.jmstudios.calc.R;

import com.robotium.solo.Solo;

public class BasicCalculationTest extends ActivityInstrumentationTestCase2<Main>{
	private Solo solo;
	public BasicCalculationTest() {

        super("home.jmstudios.calc", Main.class);

        }

        

    public void setUp() throws Exception {

        this.solo=new Solo(getInstrumentation(), getActivity());

           }

           

    public void testUI() throws Exception {
    	solo.clickOnButton("7");
    	solo.clickOnButton("*");
    	solo.clickOnButton("8");
    	solo.clickOnButton("=");
    	solo.clickOnButton("+");
    	solo.clickOnButton("3");
    	solo.clickOnButton("=");
    	EditText myEditText = (android.widget.EditText) solo.getView(R.id.editText1);
        assertEquals(59, Float.parseFloat(myEditText.getText().toString()), 0);

    }
}
