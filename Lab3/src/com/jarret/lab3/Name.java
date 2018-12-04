package com.jarret.lab3;

public class Name
{
	private String first = "", middle = "", last = "";

	public Name(String first, String middle, String last)
	{
		this.first = first;
		this.middle = middle;
		this.last = last;

	}

	// returns the first name
	public String getFirst()
	{
		return this.first;
	}

	// returns the middle name
	public String getMiddle()
	{
		return this.middle;
	}

	// returns the last name
	public String getLast()
	{
		return this.last;
	}

	// returns a string containing the person’s full name in order, e.g., “Mary Jane
	// Smith”.
	public String firstMiddleLast()
	{
		String retStr = "";
		retStr += this.first + " ";
		retStr += this.middle + " ";
		retStr += this.last;
		return retStr;
	}

	// returns a string containing the person’s full name with the last name first
	// followed by a comma, e.g., “Smith, Mary Jane”.
	public String lastFirstMiddle()
	{
		String retStr = "";
		retStr += this.last + ", ";
		retStr += this.first + " ";
		retStr += this.middle;
		return retStr;

	}

	// returns true if this name is the same as otherName. Comparisons should not be
	// case sensitive. (Hint: There is a String method equalsIgnoreCase that is just
	// like the String method equals except it does not consider case in doing its
	// comparison.)
	public boolean equals(Name otherName)
	{
		boolean a, b, c;
		a = this.first.equalsIgnoreCase(otherName.first);
		b = this.middle.equalsIgnoreCase(otherName.middle);
		c = this.last.equalsIgnoreCase(otherName.last);
		return (a && b && c);
	}

	// returns the person’s initials (a 3-character string). The initials should be
	// all in upper case, regardless of what case the name was entered in. (Hint:
	// Instead of using charAt, use the substring method of String to get a string
	// containing only the first letter—then you can upcase this one-letter string.
	// See Figure 3.1 in the text for a description of the substring method.)
	public String initials()
	{
		String initials = "";

		initials += this.first.substring(0, 1).toUpperCase();
		initials += this.middle.substring(0, 1).toUpperCase();
		initials += this.last.substring(0, 1).toUpperCase();

		return initials;
	}

	// returns the total number of characters in the full name, not including
	// spaces.
	public int length()
	{
		String fullNoSpace = "";

		fullNoSpace += this.first;
		fullNoSpace += this.middle;
		fullNoSpace += this.last;

		return fullNoSpace.length();

	}
}
