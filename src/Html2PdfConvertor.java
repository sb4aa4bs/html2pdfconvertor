import java.awt.image.RenderedImage;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

import javax.imageio.ImageIO;

//import org.apache.commons.codec.binary.Base64;

/*import org.w3c.dom.Document;
import org.xhtmlrenderer.pdf.ITextRenderer;
import org.xhtmlrenderer.resource.XMLResource;

import com.lowagie.text.Image;
import com.lowagie.text.PageSize;
import com.lowagie.text.pdf.PdfWriter;
*/

import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class Html2PdfConvertor {

	public static void main(String[] args) {
		// generatePDFFS();
		// genPDF();
		try {
			//png2Pdf();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static String imgToBase64String(final RenderedImage img, final String formatName) {
	    final ByteArrayOutputStream os = new ByteArrayOutputStream();
	    try {
	        ImageIO.write(img, formatName, Base64.getEncoder().wrap(os));
	        return os.toString(StandardCharsets.ISO_8859_1.name());
	    } catch (final IOException ioe) {
	        throw new UncheckedIOException(ioe);
	    }
	}

	public static void png2Pdf() throws Exception {
		System.out.println("Html2PdfConvertor :::: png2Pdf() :::: Starting");
		Document document = new Document(PageSize.A4, 20, 20, 20, 20);
		PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\prokarma\\png2pdf.pdf"));
		document.open();
		// URL imageurl = new URL("");
		Image image = Image.getInstance(
				"C:\\Work\\SOURCES\\TMOSan\\eservice-mytmo_uitest\\eservice_mytmo_tests\\target\\test-classes\\screenshots\\Billing.png");
		image.scalePercent(30);
		document.add(new Paragraph("Image 1"));
		document.add(image);
		document.addTitle("Image 1");
		document.addSubject("Image 1");
		image = Image.getInstance(
				"C:\\Work\\SOURCES\\TMOSan\\eservice-mytmo_uitest\\eservice_mytmo_tests\\target\\test-classes\\screenshots\\Billing.png");
		image.scalePercent(30);
		document.add(new Paragraph("Image 2"));
		document.add(image);
		document.addTitle("Image 2");
		document.addSubject("Image 2");
		document.close();
		System.out.println("Html2PdfConvertor :::: png2Pdf() :::: Ending");
	}

	public static void generatePDFFS() {
		/*
		 * File htmlFile = new File(
		 * "C:\\Work\\SOURCES\\TMOSan\\eservice-mytmo_uitest\\eservice_mytmo_tests\\test-output\\emailable-report.html"
		 * ); BufferedReader br = null; FileReader fr = null; String
		 * completeHTML = ""; try { fr = new FileReader(htmlFile); br = new
		 * BufferedReader(fr); String sCurrentLine; while ((sCurrentLine =
		 * br.readLine()) != null) { completeHTML += sCurrentLine; } } catch
		 * (Exception ex) { ex.printStackTrace(); } finally {
		 * System.out.println("HTML Read :::: " + completeHTML); } // if you
		 * have html source in hand, use it to generate document object Document
		 * document = XMLResource.load(new
		 * ByteArrayInputStream(completeHTML.getBytes())).getDocument();
		 * 
		 * ITextRenderer renderer = new ITextRenderer();
		 * renderer.setDocument(document, null);
		 * 
		 * renderer.layout();
		 * 
		 * String fileNameWithPath =
		 * "C:\\Users\\prokarma\\" + "PDF-XhtmlRendered.pdf"; try {
		 * FileOutputStream fos = new FileOutputStream(fileNameWithPath);
		 * renderer.createPDF(fos); fos.close(); } catch (Exception ex) {
		 * ex.printStackTrace(); } System.out.println("File 1: '" +
		 * fileNameWithPath + "' created.");
		 */}

	public static void genPDF() {
		/*
		 * File htmlFile = new File("C:/TEMP/ExtentHTML.html"); BufferedReader
		 * br = null; FileReader fr = null; String completeHTML = ""; try { fr =
		 * new FileReader(htmlFile); br = new BufferedReader(fr); String
		 * sCurrentLine; while ((sCurrentLine = br.readLine()) != null) {
		 * completeHTML += sCurrentLine; } } catch (Exception ex) {
		 * ex.printStackTrace(); } finally {
		 * System.out.println("HTML Read :::: " + completeHTML); } ITextRenderer
		 * renderer = new ITextRenderer();
		 * 
		 * // if you have html source in hand, use it to generate document
		 * object renderer.setDocumentFromString(completeHTML);
		 * renderer.layout();
		 * 
		 * String fileNameWithPath =
		 * "C:\\Users\\prokarma\\" + "PDF-FromHtmlString.pdf"; try {
		 * 
		 * FileOutputStream fos = new FileOutputStream(fileNameWithPath);
		 * renderer.createPDF(fos); fos.close(); } catch (Exception ex) {
		 * System.out.println("File 2: '" + fileNameWithPath + "' created."); }
		 */}

	public static void generatePDFiText() {
		/*
		 * try { File htmlFile = new File(
		 * "C:\\Work\\SOURCES\\TMOSan\\eservice-mytmo_uitest\\eservice_mytmo_tests\\test-output\\Extent.html"
		 * ); BufferedReader br = null; FileReader fr = null; String
		 * completeHTML = ""; try { fr = new FileReader(htmlFile); br = new
		 * BufferedReader(fr); String sCurrentLine; while ((sCurrentLine =
		 * br.readLine()) != null) { completeHTML += sCurrentLine; } } catch
		 * (Exception ex) { ex.printStackTrace(); } finally {
		 * System.out.println("HTML Read :::: " + completeHTML); } OutputStream
		 * file = new FileOutputStream(new
		 * File("C:\\users\\prokarma\\Test.pdf")); Document document = new
		 * Document(); PdfWriter writer = PdfWriter.getInstance(document, file);
		 * document.open(); InputStream is = new
		 * ByteArrayInputStream(completeHTML.getBytes());
		 * XMLWorkerHelper.getInstance().parseXHtml(writer, document, is);
		 * document.close(); file.close(); } catch (Exception e) {
		 * e.printStackTrace(); }
		 */
	}

}
