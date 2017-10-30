package com.cadit;

import java.io.*;

import com.lowagie.text.DocumentException;
import com.lowagie.text.pdf.AcroFields;
import com.lowagie.text.pdf.PRTokeniser;
import com.lowagie.text.pdf.PdfReader;
import com.lowagie.text.pdf.parser.PdfTextExtractor;





/**
 * Hello world!
 *
 */
public class App 
{

    
	public static void main( String[] args ) throws IOException, DocumentException
    {
    	
    	InputStream pdfInputStream = new FileInputStream("C:\\temp\\source_edt.pdf");
    	PdfReader reader = new PdfReader( pdfInputStream);
    	
    	
    	PdfTextExtractor extractor = new PdfTextExtractor(reader);
//        Document document = new com.lowagie.text.Document();
        
        OutputStream outputStream = new FileOutputStream("c:\\temp\\dest.pdf");
        
//        PdfCopy pdfCopy = new PdfCopy(document,  outputStream);
//        document.open();    	

//    	PdfStamper stamper = new PdfStamper(reader, outputStream);
    	AcroFields form1 = reader.getAcroFields();
    	
//		String field = form1.getField("untitled1");
    	
		
		for(Object key : form1.getFields().keySet())
		{
			System.out.println( key.toString() + " = " + form1.getField(key.toString()));
		}
    	
    	loop:
        for (int i = 1; i <= reader.getNumberOfPages(); i++) 
        {
//        	PdfImportedPage page = pdfCopy.getImportedPage(reader, i);    
        	
        	
//        		String content = extractor.getTextFromPage(i);
        		

	        PRTokeniser tokenizer = new PRTokeniser(reader.getPageContent(i));
	        
//	        tokenizer.checkPdfHeader();
	        while (tokenizer.nextToken())
	        {
	        	int ttype = tokenizer.getTokenType();
	        	String value = tokenizer.getStringValue();
	        	
	            if (ttype == PRTokeniser.TK_STRING) {
//	            	System.out.println(value);
	            	if("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvcccc".equals(value))
	            	{
	            		System.out.println("Trovato!");
	            		break loop;
	            	}
	            }
	        }

        }
        reader.close();
    }
    
	
	
  
    
}
