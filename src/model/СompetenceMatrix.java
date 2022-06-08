package model;
import javafx.beans.property.SimpleStringProperty;

public class ÑompetenceMatrix {
//    public ÑompetenceMatrix() {
//
//    }
private SimpleStringProperty ÑMDepartment;
private SimpleStringProperty ÑMIndex;
private SimpleStringProperty ÑMNameDiscipline;
    private SimpleStringProperty ÑMUK1;
    private SimpleStringProperty ÑMUK2;
    private SimpleStringProperty ÑMUK3;
    private SimpleStringProperty ÑMUK4;
    private SimpleStringProperty ÑMOPK1;
    private SimpleStringProperty ÑMOPK2;
    private SimpleStringProperty ÑMOPK3;
    private SimpleStringProperty ÑMOPK4;
    private SimpleStringProperty ÑMOPK5;



    /**
     * Âîçâğàùàåò íàçâàíèÿ êàôåäğû
     * @param ÑMDepartment
     * @return ÑMDepartment
     */
    public String getÑMDepartment() {
        return ÑMDepartment.get();
    }
    /**
     * Ñòàâèò íàçâàíèå êàôåäğû
     * @param ÑMDepartment
     * @return ÑMDepartment
     */
    public void setÑMDepartment(String ÑMDepartment) {
        this.ÑMDepartment = new SimpleStringProperty (ÑMDepartment);
    }
    /**
     * Âîçâğàùàåò èíäåêñ
     * @param ÑMIndex
     * @return ÑMIndex
     */
    public String getÑMIndex() {
        return ÑMIndex.get();
    }
    /**
     * Ñòàâèò èíäåêñ
     * @param ÑMIndex
     * @return ÑMIndex
     */

    public void setÑMIndex(String ÑMIndex) {
        this.ÑMIndex = new SimpleStringProperty(ÑMIndex);
    }
    /**
     * Âîçâğàùàåò íàçâàíèå äèñöèïëèíû
     * @param ÑMNameDiscipline
     * @return ÑMNameDiscipline
     */
    public String getÑMNameDiscipline() {
        return ÑMNameDiscipline.get();
    }
    /**
     * Ñòàâèò íàçâàíèå äèñöèïëèíû
     * @param ÑMNameDiscipline
     * @return ÑMNameDiscipline
     */

    public void setÑMNameDiscipline(String ÑMNameDiscipline) {
        this.ÑMNameDiscipline =new SimpleStringProperty(ÑMNameDiscipline) ;
    }
    /**
     * Âîçâğàùàåò ÓÊ-1
     * @param ÑMUK1
     * @return ÑMUK1
     */
    public String getÑMUK1() {
        return ÑMUK1.get();
    }
    /**
     * Ñòàâèò ÓÊ-1
     * @param ÑMUK1
     * @return ÑMUK1
     */
    public void setÑMUK1(String ÑMUK1) {
        this.ÑMUK1 =new SimpleStringProperty(ÑMUK1) ;
    }
    /**
     * Âîçâğàùàåò ÓÊ-2
     * @param ÑMUK2
     * @return ÑMUK2
     */
    public String getÑMUK2() {
        return ÑMUK2.get();
    }
    /**
     * Ñòàâèò ÓÊ-2
     * @param ÑMUK2
     * @return ÑMUK2
     */
    public void setÑMUK2(String ÑMUK2) {
        this.ÑMUK2 =new SimpleStringProperty(ÑMUK2) ;
    }
    /**
     * Âîçâğàùàåò ÓÊ-3
     * @param ÑMUK3
     * @return ÑMUK3
     */
    public String getÑMUK3() {
        return ÑMUK3.get();
    }
    /**
     * Ñòàâèò ÓÊ-3
     * @param ÑMUK3
     * @return ÑMUK3
     */
    public void setÑMUK3(String ÑMUK3) {
        this.ÑMUK3 = new SimpleStringProperty(ÑMUK3);
    }
    /**
     * Âîçâğàùàåò ÓÊ-4
     * @param ÑMUK4
     * @return ÑMUK4
     */
    public String getÑMUK4() {
        return ÑMUK4.get();
    }
    /**
     * Ñòàâèò ÓÊ-4
     * @param ÑMUK4
     * @return ÑMUK4
     */
    public void setÑMUK4(String ÑMUK4) {
        this.ÑMUK4 = new SimpleStringProperty( ÑMUK4);
    }
    /**
     * Âîçâğàùàåò ÎÏÊ-1
     * @param ÑMOPK1
     * @return ÑMOPK1
     */
    public String getÑMOPK1() {
        return ÑMOPK1.get();
    }
    /**
     * Ñòàâèò ÎÏÊ-1
     * @param ÑMOPK1
     * @return ÑMOPK1
     */
    public void setÑMOPK1(String ÑMOPK1) {
        this.ÑMOPK1 =  new SimpleStringProperty(ÑMOPK1);
    }
    /**
     * Âîçâğàùàåò ÎÏÊ-2
     * @param ÑMOPK2
     * @return ÑMOPK2
     */
    public String getÑMOPK2() {
        return ÑMOPK2.get();
    }
    /**
     * Ñòàâèò ÎÏÊ-2
     * @param ÑMOPK2
     * @return ÑMOPK2
     */
    public void setÑMOPK2(String ÑMOPK2) {
        this.ÑMOPK2 = new SimpleStringProperty( ÑMOPK2);
    }
    /**
     * Âîçâğàùàåò ÎÏÊ-3
     * @param ÑMOPK3
     * @return ÑMOPK3
     */
    public String getÑMOPK3() {
        return ÑMOPK3.get();
    }
    /**
     * Ñòàâèò ÎÏÊ-3
     * @param ÑMOPK3
     * @return ÑMOPK3
     */
    public void setÑMOPK3(String ÑMOPK3) {
        this.ÑMOPK3 = new SimpleStringProperty( ÑMOPK3);
    }
    /**
     * Âîçâğàùàåò ÎÏÊ-4
     * @param ÑMOPK4
     * @return ÑMOPK4
     */
    public String getÑMOPK4() {
        return ÑMOPK4.get();
    }
    /**
     * Ñòàâèò ÎÏÊ-4
     * @param ÑMOPK4
     * @return ÑMOPK4
     */
    public void setÑMOPK4(String ÑMOPK4) {
        this.ÑMOPK4 =  new SimpleStringProperty(ÑMOPK4);
    }
    /**
     * Âîçâğàùàåò ÎÏÊ-5
     * @param ÑMOPK5
     * @return ÑMOPK5
     */
    public String getÑMOPK5() {
        return ÑMOPK5.get();
    }
    /**
     * Ñòàâèò ÎÏÊ-5
     * @param ÑMOPK5
     * @return ÑMOPK5
     */
    public void setÑMOPK5(String ÑMOPK5) {
        this.ÑMOPK5 = new SimpleStringProperty( ÑMOPK5);
    }




    public ÑompetenceMatrix(String ÑMDepartment, String ÑMIndex, String ÑMNameDiscipline, String ÑMUK1, String ÑMUK2, String ÑMUK3, String ÑMUK4, String ÑMOPK1, String ÑMOPK2, String ÑMOPK3, String ÑMOPK4, String ÑMOPK5) {
        this.ÑMDepartment = new SimpleStringProperty(ÑMDepartment) ;
        this.ÑMIndex =  new SimpleStringProperty(ÑMIndex) ;
        this.ÑMNameDiscipline = new SimpleStringProperty(ÑMNameDiscipline);
        this.ÑMUK1 =new SimpleStringProperty(ÑMUK1) ;
        this.ÑMUK2 = new SimpleStringProperty(ÑMUK2);
        this.ÑMUK3 =new SimpleStringProperty(ÑMUK3);
        this.ÑMUK4 =new SimpleStringProperty(ÑMUK4);
        this.ÑMOPK1 = new SimpleStringProperty(ÑMOPK1);
        this.ÑMOPK2 = new SimpleStringProperty(ÑMOPK2);
        this.ÑMOPK3 = new SimpleStringProperty(ÑMOPK3);
        this.ÑMOPK4 = new SimpleStringProperty(ÑMOPK4);
        this.ÑMOPK5 = new SimpleStringProperty(ÑMOPK5);

    }



}
