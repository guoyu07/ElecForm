package com.gs.util;

import java.io.IOException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.methods.PostMethod;

import com.google.gson.Gson;
import com.gs.model.Elec;

public class ElecDataCommiter {
	public boolean commit(Elec e) throws HttpException, IOException {
		HttpClient hc = new HttpClient();
		PostMethod p = new PostMethod(
				"http://202.206.64.193/ElecWebService/CommitService");
		Gson g = new Gson();
		p.setParameter("json", g.toJson(e));
		hc.executeMethod(p);
		int code = p.getStatusCode();
		return code == 200 ? true : false;
	}
}
