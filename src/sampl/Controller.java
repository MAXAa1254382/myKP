package sampl;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.HBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import model.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;
import java.util.ResourceBundle;

public class Controller implements Initializable {



    public ArrayList <IImage> a=new ArrayList<IImage>();
    public Canvas can;
    public int temp;
    public TableView <—ompetenceMatrix> tableview = new TableView <—ompetenceMatrix>();
    public TableColumn <—ompetenceMatrix, String> tablColDepartment;
    public TableColumn <—ompetenceMatrix, String> tablColIndex;
    public TableColumn <—ompetenceMatrix, String> tablColNameDiscipline;
    public TableColumn <—ompetenceMatrix, String> tablColUK1;
    public TableColumn <—ompetenceMatrix, String> tablColUK2;
    public TableColumn <—ompetenceMatrix, String> tablColUK3;
    public TableColumn <—ompetenceMatrix, String> tablColUK4;
    public TableColumn <—ompetenceMatrix, String> tablColOPK1;
    public TableColumn <—ompetenceMatrix, String> tablColOPK2;
    public TableColumn <—ompetenceMatrix, String> tablColOPK3;
    public TableColumn <—ompetenceMatrix, String> tablColOPK4;
    public TableColumn <—ompetenceMatrix, String> tablColOPK5;


    @FXML
    private TextField textD ;
    @FXML
    private TextField textI ;
    @FXML
    private TextField  textN;
    @FXML
    private TextField  textUK1;
    @FXML
    private TextField  textUK2;
    @FXML
    private TextField  textUK3;
    @FXML
    private TextField  textUK4;
    @FXML
    private TextField   textOPK1;
    @FXML
    private TextField   textOPK2;
    @FXML
    private TextField   textOPK3;
    @FXML
    private TextField   textOPK4;
    @FXML
    private TextField   textOPK5;
    private ObservableList<String> competence= FXCollections.observableArrayList("+", "-");
     @FXML
    public HBox hvoxAdd;
    private ObservableList<—ompetenceMatrix> observableList;
    //private Button RefreshButton;
    private File fileObject;
    private Stage primaryStage;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tablColDepartment.setCellValueFactory( new PropertyValueFactory <>( "—MDepartment" ) );
        tablColIndex.setCellValueFactory( new PropertyValueFactory <>( "—MIndex" ) );
        tablColNameDiscipline.setCellValueFactory( new PropertyValueFactory <>( "—MNameDiscipline" ) );
        tablColUK1.setCellValueFactory( new PropertyValueFactory <>( "—MUK1" ) );
        tablColUK2.setCellValueFactory( new PropertyValueFactory <>( "—MUK2" ) );
        tablColUK3.setCellValueFactory( new PropertyValueFactory <>( "—MUK3" ) );
        tablColUK4.setCellValueFactory( new PropertyValueFactory <>( "—MUK4" ) );
        tablColOPK1.setCellValueFactory( new PropertyValueFactory <>( "—MOPK1" ) );
        tablColOPK2.setCellValueFactory( new PropertyValueFactory <>( "—MOPK2" ) );
        tablColOPK3.setCellValueFactory( new PropertyValueFactory <>( "—MOPK3" ) );
        tablColOPK4.setCellValueFactory( new PropertyValueFactory <>( "—MOPK4" ) );
        tablColOPK5.setCellValueFactory( new PropertyValueFactory <>( "—MOPK5" ) );
//tableview.setItems(observableList  );
        a.add(new OKImage());
        a.add(new ErrorImage());


//    tableview.setEditable(true);
//        new SimpleimageFactory().createIImage(2);

    }
   public XSSFWorkbook workbook;
    @FXML
    public void onAimport(ActionEvent actionEvent) throws Exception {

        Node source = (Node) actionEvent.getSource();
        Stage PrimaryStage = (Stage) source.getScene().getWindow();
        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter xlsxfilter = new FileChooser.ExtensionFilter("xlsx files(*.xlsx)", "*.xlsx");
        fileChooser.getExtensionFilters().add(xlsxfilter);
        fileChooser.getExtensionFilters().addAll(xlsxfilter);
        fileChooser.setTitle("¬˚·Ó Ù‡ÈÎ‡");
        fileObject = fileChooser.showOpenDialog(PrimaryStage);
        if (fileObject != null) {
            String putkfailu = fileObject.getPath();}
        GraphicsContext gr = can.getGraphicsContext2D();
       // String filename = "C:\\Users\\Amin\\Desktop\\6 ÒÂÏÂÒÚ\\“ÂıÌÓÎÓ„ËË ÔÓ„‡ÏÏËÓ‚‡ÌËˇ\\ œ\\src\\resources\\3.xlsx";
        observableList = FXCollections.observableArrayList();
        FileInputStream fis = null;
       —ompetenceMatrix temp;
        try {
            fis = new FileInputStream( fileObject );
            workbook = new XSSFWorkbook( fis );
            XSSFSheet sheet = workbook.getSheet( "Matrix" );
            Iterator <Row> rowIterator = sheet.iterator();
            int i = 0;
            int j = -1;
            String[] value = new String[10000];
            //List <String> colnames = new ArrayList <String>();
            while (rowIterator.hasNext()) {
                XSSFRow row = (XSSFRow) rowIterator.next();
                Iterator <Cell> cellIterator = row.cellIterator();
//               String  value=" ",value2= "", value3= " ";
                while (cellIterator.hasNext()) {
                    XSSFCell cell = (XSSFCell) cellIterator.next();
                    //    for(int i=0;i< cell.getStringCellValue().length();  i++) {
                    if (!(cell.getStringCellValue() == null)) {
                        value[i] = cell.getStringCellValue();
                    }
                    i++;
                }
                temp = new —ompetenceMatrix( value[++j], value[++j], value[++j], value[++j], value[++j], value[++j], value[++j], value[++j], value[++j], value[++j], value[++j], value[++j] );
                observableList.add( temp );
            }
            tableview.setItems( observableList );
            int k = 0;
              a.get(k).draw(can.getGraphicsContext2D());
         new SimpleimageFactory().createIImage( 1 );
        }

        catch (IOException e) {
            int k = 1;
            a.get(k).draw(can.getGraphicsContext2D());
            new SimpleimageFactory().createIImage( 2 );
            e.printStackTrace();

       }
      fis.close();
    }


    public void onsoxp(ActionEvent actionEvent) throws IOException {

        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter xlsxfilter = new FileChooser.ExtensionFilter( "xlsx files(*.xlsx)", "*.xlsx");
        fileChooser.getExtensionFilters().add(xlsxfilter);
        File file = fileChooser.showSaveDialog(primaryStage);
        if(file != null){
            XSSFWorkbook workbook1 = new XSSFWorkbook();
            XSSFSheet spreadsheet = workbook1.createSheet("Matrix");
            XSSFRow row = spreadsheet.createRow(0);
//
//            for (int j = 0; j < tableview.getColumns().size(); j++) {
//                row.createCell(j).setCellValue(tableview.getColumns().get(j).getText());
//                 }
        for (int i = 0; i < tableview.getItems().size(); i++) {
            row = spreadsheet.createRow(i );
            for (int j = 0; j < tableview.getColumns().size(); j++) {
                if(tableview.getColumns().get(j).getCellData(i) != null) {
                    row.createCell(j).setCellValue(tableview.getColumns().get(j).getCellData(i).toString());
                }
                else {
                    row.createCell(j).setCellValue("");
                }
            }
        }

        FileOutputStream fileOut = new FileOutputStream(file.getAbsolutePath());
            workbook1.write(fileOut);
        fileOut.close();
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("œÓ‰Ú‚ÂÊ‰ÂÌËÂ");
        alert.setHeaderText(String.format("—Óı‡ÌÂÌ!"));
    }

    }

    public void onAdd(ActionEvent actionEvent) {

      //  ObservableList <—ompetenceMatrix> observableList2 = FXCollections.observableArrayList();
//        textD.setPromptText(" ‡ÙÂ‰‡");
        if((textD.getText()==null) ||  (textI.getText()==null) ||(textN.getText()==null) ||(textUK1.getText()==null) ||(textUK2.getText()==null) ||(textUK3.getText()==null) ||(textUK4.getText()==null) ||(textOPK1.getText()==null) ||(textOPK2.getText()==null) ||(textOPK3.getText()==null) ||(textOPK4.getText()==null) ||(textOPK5.getText()==null)       ) {
            Alert alert = new Alert( Alert.AlertType.INFORMATION );
            alert.setTitle( "Test Connection" );
            // alert.setHeaderText("Results:");
            alert.setContentText( "Œ¯Ë·Í‡ ÒÓı‡ÌÂÌËˇ ‰‡ÌÌ˚ı! ÕÂÓ·ıÓ‰ËÏÓ ÔÓ‚ÂËÚ¸ ‚ÒÂ ÎË ÔÓÎˇ Á‡ÔÓÎÌÂÌ˚!" );

            alert.showAndWait();
        }

        else{
textD.setMaxWidth( tablColDepartment.getPrefWidth() );

tablColDepartment.setCellFactory( TextFieldTableCell.<—ompetenceMatrix>forTableColumn() );
            tablColDepartment.setOnEditCommit( (TableColumn.CellEditEvent<—ompetenceMatrix,String> t)-> {((—ompetenceMatrix) t.getTableView().getItems().get(
                                t.getTablePosition().getRow() )
                        ).set—MDepartment( t.getNewValue() );
                    } );



            textI.setMaxWidth( tablColIndex.getPrefWidth() );

            tablColIndex.setCellFactory( TextFieldTableCell. <—ompetenceMatrix>forTableColumn() );
            tablColIndex.setOnEditCommit(
                    (TableColumn.CellEditEvent <—ompetenceMatrix, String> t) -> {
                        ((—ompetenceMatrix) t.getTableView().getItems().get(
                                t.getTablePosition().getRow() )
                        ).set—MIndex( t.getNewValue() );
                    } );

            textN.setMaxWidth( tablColNameDiscipline.getPrefWidth() );


            tablColNameDiscipline.setCellFactory( TextFieldTableCell. <—ompetenceMatrix>forTableColumn() );
            tablColNameDiscipline.setOnEditCommit(
                    (TableColumn.CellEditEvent <—ompetenceMatrix, String> t) -> {
                        ((—ompetenceMatrix) t.getTableView().getItems().get(
                                t.getTablePosition().getRow() )
                        ).set—MNameDiscipline( t.getNewValue() );
                    } );

            //  cmbYESNo.setOnAction( event -> tablColUK1.setText( (String) cmbYESNo.getValue() ));
            // cmbYESNo.setMaxWidth( tablColUK1.getPrefWidth() );


            textUK1.setMaxWidth( tablColUK1.getPrefWidth() );


            tablColUK1.setCellFactory( TextFieldTableCell. <—ompetenceMatrix>forTableColumn() );
            tablColUK1.setOnEditCommit(
                    (TableColumn.CellEditEvent <—ompetenceMatrix, String> t) -> {
                        ((—ompetenceMatrix) t.getTableView().getItems().get(
                                t.getTablePosition().getRow() )
                        ).set—MUK1( t.getNewValue() );
                    } );

            textUK2.setMaxWidth( tablColUK2.getPrefWidth() );

            tablColUK2.setCellFactory( TextFieldTableCell. <—ompetenceMatrix>forTableColumn() );
            tablColUK2.setOnEditCommit(
                    (TableColumn.CellEditEvent <—ompetenceMatrix, String> t) -> {
                        ((—ompetenceMatrix) t.getTableView().getItems().get(
                                t.getTablePosition().getRow() )
                        ).set—MUK2( t.getNewValue() );
                    } );

            textUK3.setMaxWidth( tablColUK3.getPrefWidth() );

            tablColUK3.setCellFactory( TextFieldTableCell. <—ompetenceMatrix>forTableColumn() );
            tablColUK3.setOnEditCommit(
                    (TableColumn.CellEditEvent <—ompetenceMatrix, String> t) -> {
                        ((—ompetenceMatrix) t.getTableView().getItems().get(
                                t.getTablePosition().getRow() )
                        ).set—MUK3( t.getNewValue() );
                    } );

            textUK4.setMaxWidth( tablColUK4.getPrefWidth() );

            tablColUK4.setCellFactory( TextFieldTableCell. <—ompetenceMatrix>forTableColumn() );
            tablColUK4.setOnEditCommit(
                    (TableColumn.CellEditEvent <—ompetenceMatrix, String> t) -> {
                        ((—ompetenceMatrix) t.getTableView().getItems().get(
                                t.getTablePosition().getRow() )
                        ).set—MUK4( t.getNewValue() );
                    } );


            textOPK1.setMaxWidth( tablColOPK1.getPrefWidth() );

            tablColOPK1.setCellFactory( TextFieldTableCell. <—ompetenceMatrix>forTableColumn() );
            tablColOPK1.setOnEditCommit(
                    (TableColumn.CellEditEvent <—ompetenceMatrix, String> t) -> {
                        ((—ompetenceMatrix) t.getTableView().getItems().get(
                                t.getTablePosition().getRow() )
                        ).set—MOPK1( t.getNewValue() );
                    } );

            textOPK2.setMaxWidth( tablColOPK2.getPrefWidth() );

            tablColOPK2.setCellFactory( TextFieldTableCell. <—ompetenceMatrix>forTableColumn() );
            tablColOPK2.setOnEditCommit(
                    (TableColumn.CellEditEvent <—ompetenceMatrix, String> t) -> {
                        ((—ompetenceMatrix) t.getTableView().getItems().get(
                                t.getTablePosition().getRow() )
                        ).set—MOPK2( t.getNewValue() );
                    } );

            textOPK3.setMaxWidth( tablColOPK3.getPrefWidth() );

            tablColOPK3.setCellFactory( TextFieldTableCell. <—ompetenceMatrix>forTableColumn() );
            tablColOPK3.setOnEditCommit(
                    (TableColumn.CellEditEvent <—ompetenceMatrix, String> t) -> {
                        ((—ompetenceMatrix) t.getTableView().getItems().get(
                                t.getTablePosition().getRow() )
                        ).set—MOPK3( t.getNewValue() );
                    } );

            textOPK4.setMaxWidth( tablColOPK4.getPrefWidth() );

            tablColOPK4.setCellFactory( TextFieldTableCell. <—ompetenceMatrix>forTableColumn() );
            tablColOPK4.setOnEditCommit(
                    (TableColumn.CellEditEvent <—ompetenceMatrix, String> t) -> {
                        ((—ompetenceMatrix) t.getTableView().getItems().get(
                                t.getTablePosition().getRow() )
                        ).set—MOPK4( t.getNewValue() );
                    } );

            textOPK5.setMaxWidth( tablColOPK5.getPrefWidth() );

            tablColOPK5.setCellFactory( TextFieldTableCell. <—ompetenceMatrix>forTableColumn() );
            tablColOPK5.setOnEditCommit(
                    (TableColumn.CellEditEvent <—ompetenceMatrix, String> t) -> {
                        ((—ompetenceMatrix) t.getTableView().getItems().get(
                                t.getTablePosition().getRow() )
                        ).set—MOPK5( t.getNewValue() );

                    } );
            observableList.add( new —ompetenceMatrix( textD.getText(), textI.getText(), textN.getText(), textUK1.getText(), textUK2.getText(), textUK3.getText(), textUK4.getText(), textOPK1.getText(), textOPK2.getText(), textOPK3.getText(), textOPK4.getText(), textOPK5.getText() ) );
            tableview.setItems( observableList );}

        tableview.setEditable(true);
    }


    public void onDeleteClick(ActionEvent actionEvent) {

        —ompetenceMatrix ÒompetenceMatrix = (—ompetenceMatrix) this.tableview.getSelectionModel().getSelectedItem();

        // ‚˚‰‡ÂÏ ÔÓ‰Ú‚ÂÊ‰‡˛˘ÂÂ ÒÓÓ·˘ÂÌËÂ
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("œÓ‰Ú‚ÂÊ‰ÂÌËÂ");
        alert.setHeaderText(String.format("“Ó˜ÌÓ Û‰‡ÎËÚ¸ %s?", ÒompetenceMatrix.get—MNameDiscipline()));

        // ÂÒÎË ÔÓÎ¸ÁÓ‚‡ÚÂÎ¸ Ì‡Ê‡Î OK
        Optional <ButtonType> option = alert.showAndWait();
        if (option.get() == ButtonType.OK) {
            // Û‰‡ÎˇÂÏ ÒÚÓÍÛ ËÁ Ú‡·ÎËˆ˚
            this.tableview.getItems().remove(ÒompetenceMatrix);
        }

    }


}

