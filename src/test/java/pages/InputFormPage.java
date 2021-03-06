package pages;

public class InputFormPage
{
  private static final String  TEXTBOX_FIRST_NAME = "//input[@name='first_name']";
  private static final String  TEXTBOX_LAST_NAME = "//input[@name='last_name']";
  private static final String  TEXTBOX_EMAIL = "//input[@name='email']";
  private static final String  TEXTBOX_PHONE = "//input[@name='phone']";
  private static final String  TEXTBOX_ADDRESS = "//input[@name='address']";
  private static final String  TEXTBOX_CITY = "//input[@name='city']";
  private static final String  DROPDOWN_STATE = "//select[@name='state']";
  private static final String  TEXTBOX_ZIPCODE = "//input[@name='zip']";
  private static final String  TEXTBOX_WEBSITE = "//input[@name='website']";
  private static final String  RADIO_BUTTON_HOSTING_YES = "//input[@value='yes']";
  private static final String  TEXTBOX_PROJECT_DESCRIPTION = "//textarea[@name='comment']";
  private static final String  BUTTON_SEND = "//button[@type='submit']";

    public static String getTextboxFirstName() {
        return TEXTBOX_FIRST_NAME;
    }

    public static String getTextboxLastName() {
        return TEXTBOX_LAST_NAME;
    }

    public static String getTextboxEmail() {
        return TEXTBOX_EMAIL;
    }

    public static String getTextboxPhone() {
        return TEXTBOX_PHONE;
    }

    public static String getTextboxAddress() {
        return TEXTBOX_ADDRESS;
    }

    public static String getTextboxCity() {
        return TEXTBOX_CITY;
    }

    public static String getDropdownState() {
        return DROPDOWN_STATE;
    }

    public static String getTextboxZipcode() {
        return TEXTBOX_ZIPCODE;
    }

    public static String getTextboxWebsite() {
        return TEXTBOX_WEBSITE;
    }

    public static String getRadioButtonHostingYes() {
        return RADIO_BUTTON_HOSTING_YES;
    }

    public static String getTextboxProjectDescription() {
        return TEXTBOX_PROJECT_DESCRIPTION;
    }

    public static String getButtonSend() {
        return BUTTON_SEND;
    }
}
