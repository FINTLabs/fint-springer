package no.fint.springer;

public enum Resources {
    EMPLOYEECODE,
    EMPLOYMENTTYPE,
    FUNCTIONCODE,
    HOURSPERWEEKCODE,
    PERSONALRESOURCECATEGORY,
    RESPONSIBILITYCODE,
    EMPLOYEE,
    EMPLOYMENT,
    HUMAN,
    ORGANISATION;

    public static final String EMPLOYEECODES_VALUE = "employeecodes";
    public static final String EMPLOYMENTTYPES_VALUE = "employmenttypes";
    public static final String FUNCTIONCODES_VALUE = "functioncodes";
    public static final String HOURSPERWEEKCODES_VALUE = "hoursperweekcodes";
    public static final String PERSONALRESOURCECATEGORIES_VALUE = "personalresourcecategories";
    public static final String RESPONSIBILITYCODES_VALUE = "responsibilitycodes";

    public static final String EMPLOYEES_VALUE = "employees";
    public static final String EMPLOYMENTS_VALUE = "employments";
    public static final String HUMANS_VALUE = "humans";
    public static final String ORGANISATIONS_VALUE = "organisations";

    static {
        EMPLOYEECODE.collectionName = EMPLOYEECODES_VALUE;
        EMPLOYMENTTYPE.collectionName = EMPLOYMENTTYPES_VALUE;
        FUNCTIONCODE.collectionName = FUNCTIONCODES_VALUE;
        HOURSPERWEEKCODE.collectionName = HOURSPERWEEKCODES_VALUE;
        PERSONALRESOURCECATEGORY.collectionName = PERSONALRESOURCECATEGORIES_VALUE;
        RESPONSIBILITYCODE.collectionName = RESPONSIBILITYCODES_VALUE;
        EMPLOYEE.collectionName = EMPLOYEES_VALUE;
        EMPLOYMENT.collectionName = EMPLOYMENTS_VALUE;
        HUMAN.collectionName = HUMANS_VALUE;
        ORGANISATION.collectionName = ORGANISATIONS_VALUE;
    }

    private String collectionName;

    public String getCollectionName() {
        return collectionName;
    }
}
