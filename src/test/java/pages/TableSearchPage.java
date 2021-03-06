package pages;

public class TableSearchPage
{
    private static final String  TEXTBOX_SEARCH = "//input[@type='search']";
    private static final String  TABLE_EMPLOYEE_DETAILS = "//table[@id='example']";

    public static String getTextboxSearch() {
        return TEXTBOX_SEARCH;
    }

    public static String getTableEmployeeDetails() {
        return TABLE_EMPLOYEE_DETAILS;
    }
}
