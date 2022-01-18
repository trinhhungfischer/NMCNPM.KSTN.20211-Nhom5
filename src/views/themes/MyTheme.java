package views.themes;

import com.formdev.flatlaf.FlatLightLaf;

public class MyTheme
	extends FlatLightLaf
{
	public static final String NAME = "MyTheme";

	public static boolean setup() {
		return setup( new MyTheme() );
	}

	public static void installLafInfo() {
		installLafInfo( NAME, MyTheme.class );
	}

	@Override
	public String getName() {
		return NAME;
	}
}
