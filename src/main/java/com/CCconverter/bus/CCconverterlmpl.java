package com.CCconverter.bus;

import com.CCconverter.model.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.xml.transform.Result;
import com.CCconverter.model.*;


public class CCconverterlmpl {
	private Map<String, ArrayList> currenciesMap = new HashMap<>();
	private ArrayList<CCconvert> list;
	
	public CCconverterlmpl() {
		CCconvert currencyMalaysia0= new CCconvert( "EURO", 0.21);
		CCconvert currencyMalaysia1 = new CCconvert( "KWD", 0.073);
		CCconvert currencyMalaysia2 = new CCconvert( "GBP", 0.19);
		
		list = new ArrayList<>();
		list.add(currencyMalaysia0);
		list.add(currencyMalaysia1);
		list.add(currencyMalaysia2);
		currenciesMap.put("RM", list);
		
		CCconvert currencyKuwait0= new CCconvert( "EURO", 2.90);
		CCconvert currencyKuwait1 = new CCconvert( "RM", 13.74);
		CCconvert currencyKuwait2 = new CCconvert( "GBP", 2.58);
		
		list = new ArrayList<>();
		list.add(currencyKuwait0);
		list.add(currencyKuwait1);
		list.add(currencyKuwait2);
		currenciesMap.put("KWD", list);
		
		CCconvert currencyEuro0= new CCconvert( "GBP", 0.89);
		CCconvert currencyEuro1 = new CCconvert( "RM", 4.74);
		CCconvert currencyEuro2 = new CCconvert( "KWD", 0.35);
		
		list = new ArrayList<>();
		list.add(currencyEuro0);
		list.add(currencyEuro1);
		list.add(currencyEuro2);
		currenciesMap.put("EURO", list);
		
		
	}
	
	public ArrayList getCurrencyResult (String denomination) {
		return currenciesMap.get(denomination);
	}


}
