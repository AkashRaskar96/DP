package com.adt.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;
@Component("biProcessor")
public class BookItemProcessor implements ItemProcessor<String, String> {

	@Override
	public String process(String item) throws Exception {
		System.out.println("BookItemProcessor.process()");
		String bookWithTitle=null;
		if(item.equalsIgnoreCase("CRJ"))
			bookWithTitle=item+" by HarbatShild";
		else if(item.equalsIgnoreCase("TIJ"))
			bookWithTitle=item+" by BrusAkel";
		else if(item.equalsIgnoreCase("BBJ"))
			bookWithTitle=item+" by Nageshwarrao";
		else if(item.equalsIgnoreCase("HFJ"))
			bookWithTitle=item+" by Katsira";
		else if(item.equalsIgnoreCase("WBJ"))
			bookWithTitle=item+" by UA";
		else if(item.equalsIgnoreCase("SIJ"))
			bookWithTitle=item+" by UA";
		else
			bookWithTitle=item; 
		return bookWithTitle;
	}
}
