package com.CCconverter.soap;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.CCconverter.bus.CCconverterlmpl;
import com.CCconverter.model.CCconvert;
import com.CCconverter.model.CCconvert;

@WebService
public class CCconverterService {
	CCconverterlmpl cc = new CCconverterlmpl();
	
	@WebMethod
	public ArrayList<CCconvert> getCurrencyResult (String denomination) {
		return cc.getCurrencyResult(denomination);
	}
}
