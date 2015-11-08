package home.jmstudios.calc.test;

import android.graphics.Point;
import android.test.ActivityInstrumentationTestCase2;
import android.view.Display;
import home.jmstudios.calc.Main;
import home.jmstudios.calc.R;
import android.widget.EditText;

import com.robotium.solo.Solo;

public class TrigonometricFunctionsTest extends ActivityInstrumentationTestCase2<Main>{
	private Solo solo;
	public TrigonometricFunctionsTest() {

        super("home.jmstudios.calc", Main.class);

        }

        

    public void setUp() throws Exception {

        this.solo=new Solo(getInstrumentation(), getActivity());

           }

           

    public void testUI() throws Exception {
    	/*Display display = solo.getCurrentActivity().getWindowManager().getDefaultDisplay();
    	Point size = new Point();
    	display.getSize(size);
        int width = size.x;
        int height = size.y;
        float yStart = height ;
        float yEnd = height / 2;
        solo.drag(width / 2, width / 2, yStart, yEnd, 10);
        */
    	solo.setSlidingDrawer(0,Solo.OPENED);
        solo.clickOnButton("sin");
        solo.setSlidingDrawer(0,Solo.CLOSED);
        solo.clickOnButton("9");
        solo.clickOnButton("0");
        solo.clickOnButton("=");
        EditText myEditText = (android.widget.EditText) solo.getView(R.id.editText1);
         assertEquals(1, Float.parseFloat(myEditText.getText().toString()), 0);

    }
}
