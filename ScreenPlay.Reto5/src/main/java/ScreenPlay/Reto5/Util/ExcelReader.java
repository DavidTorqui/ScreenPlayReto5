package ScreenPlay.Reto5.Util;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
public class ExcelReader {
    private static XSSFSheet ExcelWSheet;
    private static XSSFWorkbook ExcelWBook;
    private static XSSFCell Cell;
    //private static XSSFRow Row;
 
    public static void setExcelFile(String Path,String SheetName) throws Exception {
            try {
                    FileInputStream ExcelFile = new FileInputStream(Path);
                    ExcelWBook = new XSSFWorkbook(ExcelFile);
                    ExcelWSheet = ExcelWBook.getSheet(SheetName);
            } catch (Exception e){
              throw (e);
            }
    }
    
    @SuppressWarnings("deprecation")
    public static String getCellData(int RowNum, int ColNum) throws Exception{
        String CellData = "";
        try{
            Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
            /*Consultar el tipo de Celda: (0 = numérico, 1 = String)
            Cell.getCellType();  */
            if (Cell.getCellType()==1){ CellData = Cell.getStringCellValue(); }
            if (Cell.getCellType()==0){ CellData = Cell.getRawValue(); }
            return CellData;
            }catch (Exception e){
            return "";
            }
    }
    
    public static int ContarFilas() throws Exception 
    {
        int NumFilas = ExcelWSheet.getLastRowNum();
        return NumFilas;
    }
    
    public static void setCellData(int RowNum, int ColNum, String TextObtenido) {
        try {
            ExcelWSheet.getRow(RowNum).createCell(ColNum).setCellValue(TextObtenido);
            ExcelWSheet.getRow(RowNum).getCell(ColNum).setCellValue(TextObtenido);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    public static void SaveData(String Path) throws IOException {
        try {
            FileOutputStream ExcelFileOut = new FileOutputStream(Path);
            ExcelWBook.write(ExcelFileOut);
        }
        catch (Exception e)
        { System.out.println(e.getMessage()); }
    }
    
    public static void CerrarBook() throws IOException {
        ExcelWBook.close();
    }
    
    public static void escribeResultSetEnExcel(String nombreHoja, ResultSet rs, String ruta) throws SQLException, IOException
    {
        Workbook libro = new XSSFWorkbook();     
        Sheet hoja = libro.createSheet(nombreHoja);
 
Row fila = hoja.createRow(0); 
         for(int i = 0; i < rs.getMetaData().getColumnCount(); i++)
         {
             Cell celda = fila.createCell(i);
             celda.setCellValue(rs.getMetaData().getColumnName(i+1));
         }
        int numFila=1;
         while(rs.next())
         {
            Row fila2 = hoja.createRow(numFila);
             for (int i=0; i<rs.getMetaData().getColumnCount();i++)
             {
                 Cell celda= fila2.createCell(i);
                 celda.setCellValue(rs.getString(i+1).toString());
             }
             numFila++;
         }
         FileOutputStream fileOut = new FileOutputStream(ruta);
         libro.write(fileOut);
         fileOut.close();
         libro.close();
    }
    
    public static void escribeInfoEnExcel(String nombreHoja, String info, String ruta, int numnCol, int numFila) throws IOException
    {
         Workbook libro = new XSSFWorkbook();     
         Sheet hoja = libro.createSheet(nombreHoja);
         Row fila =hoja.createRow(numFila-1);
         Cell celda =fila.createCell(numnCol-1);
         celda.setCellValue(info);
         FileOutputStream fileOut = new FileOutputStream(ruta);
         libro.write(fileOut);
         fileOut.close();
         libro.close();
     }
    
    
    public static void escribeInfoEnExcel2(String ruta, String nombreHoja, String info, int numnCol, int numFila) throws IOException
    {
        FileInputStream ExcelFile = new FileInputStream(ruta);
        ExcelWBook = new XSSFWorkbook(ExcelFile);
        ExcelWSheet = ExcelWBook.getSheet(nombreHoja);
        Row fila =ExcelWSheet.createRow(numFila-1);
        Cell celda =fila.createCell(numnCol-1);
        celda.setCellValue(info);
        FileOutputStream fileOut = new FileOutputStream(ruta);
        ExcelWBook.write(fileOut);
        fileOut.close();
        ExcelWBook.close();
    }
   
    public static void crearLibroYHoja(String ruta, String nombreHoja) throws IOException
    {
         Workbook libro = new XSSFWorkbook();    
         libro.createSheet(nombreHoja);
         FileOutputStream fileOut = new FileOutputStream(ruta);
         libro.write(fileOut);
         fileOut.close();
         libro.close();
    }
}
