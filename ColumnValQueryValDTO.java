package com.regex.expr;

import java.util.Comparator;

public class ColumnValQueryValDTO {
private String columnVal;
public ColumnValQueryValDTO(String columnVal, String queryVal) {
	super();
	this.columnVal = columnVal;
	this.queryVal = queryVal;
}
private String queryVal;
public String getColumnVal() {
	return columnVal;
}
public void setColumnVal(String columnVal) {
	this.columnVal = columnVal;
}
public String getQueryVal() {
	return queryVal;
}
public void setQueryVal(String queryVal) {
	this.queryVal = queryVal;
}


}

class Sortbyroll implements Comparator<ColumnValQueryValDTO>
{
    // Used for sorting in ascending order of
    // roll number
    public int compare(ColumnValQueryValDTO a, ColumnValQueryValDTO b)
    {
        return a.getColumnVal().compareTo(b.getColumnVal());
    }
}