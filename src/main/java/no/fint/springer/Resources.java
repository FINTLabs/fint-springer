package no.fint.springer;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Resources {
    public static final String EMPLOYEECODES = "employeecodes";
    public static final String EMPLOYMENTTYPES = "employmenttypes";
    public static final String FUNCTIONCODES = "functioncodes";
    public static final String HOURSPERWEEKCODES = "hoursperweekcodes";
    public static final String PERSONALRESOURCECATEGORIES = "personalresourcecategories";
    public static final String RESPONSIBILITYCODES = "responsibilitycodes";

    public static final String EMPLOYEES = "employees";
    public static final String EMPLOYMENTS = "employments";
    public static final String HUMANS = "humans";
    public static final String ORGANISATIONS = "organisations";

    public static List<String> constants() {
        Field[] fields = Resources.class.getDeclaredFields();
        return Arrays.stream(fields).filter(field -> Modifier.isStatic(field.getModifiers())).map(Field::getName).collect(Collectors.toList());
    }
}
