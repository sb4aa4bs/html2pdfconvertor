import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.OutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;

public class Html2PdfConvertor {

	public static void main(String[] args) {
		try {
			File htmlFile = new File(
					"C:\\Work\\SOURCES\\TMOSan\\eservice-mytmo_uitest\\eservice_mytmo_tests\\test-output\\Extent.html");
			BufferedReader br = null;
			FileReader fr = null;
			String completeHTML = "";
			try {
				fr = new FileReader(htmlFile);
				br = new BufferedReader(fr);
				String sCurrentLine;
				while ((sCurrentLine = br.readLine()) != null) {
					completeHTML += sCurrentLine;
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			} finally {
				System.out.println("HTML Read :::: " + completeHTML);
			}
			OutputStream file = new FileOutputStream(new File("C:\\users\\prokarma\\Test.pdf"));
			Document document = new Document();
			PdfWriter writer = PdfWriter.getInstance(document, file);
			document.open();
			InputStream is = new ByteArrayInputStream(completeHTML.getBytes());
			XMLWorkerHelper.getInstance().parseXHtml(writer, document, is);
			document.close();
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
