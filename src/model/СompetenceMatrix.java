package model;
import javafx.beans.property.SimpleStringProperty;

public class �ompetenceMatrix {
//    public �ompetenceMatrix() {
//
//    }
private SimpleStringProperty �MDepartment;
private SimpleStringProperty �MIndex;
private SimpleStringProperty �MNameDiscipline;
    private SimpleStringProperty �MUK1;
    private SimpleStringProperty �MUK2;
    private SimpleStringProperty �MUK3;
    private SimpleStringProperty �MUK4;
    private SimpleStringProperty �MOPK1;
    private SimpleStringProperty �MOPK2;
    private SimpleStringProperty �MOPK3;
    private SimpleStringProperty �MOPK4;
    private SimpleStringProperty �MOPK5;



    /**
     * ���������� �������� �������
     * @param �MDepartment
     * @return �MDepartment
     */
    public String get�MDepartment() {
        return �MDepartment.get();
    }
    /**
     * ������ �������� �������
     * @param �MDepartment
     * @return �MDepartment
     */
    public void set�MDepartment(String �MDepartment) {
        this.�MDepartment = new SimpleStringProperty (�MDepartment);
    }
    /**
     * ���������� ������
     * @param �MIndex
     * @return �MIndex
     */
    public String get�MIndex() {
        return �MIndex.get();
    }
    /**
     * ������ ������
     * @param �MIndex
     * @return �MIndex
     */

    public void set�MIndex(String �MIndex) {
        this.�MIndex = new SimpleStringProperty(�MIndex);
    }
    /**
     * ���������� �������� ����������
     * @param �MNameDiscipline
     * @return �MNameDiscipline
     */
    public String get�MNameDiscipline() {
        return �MNameDiscipline.get();
    }
    /**
     * ������ �������� ����������
     * @param �MNameDiscipline
     * @return �MNameDiscipline
     */

    public void set�MNameDiscipline(String �MNameDiscipline) {
        this.�MNameDiscipline =new SimpleStringProperty(�MNameDiscipline) ;
    }
    /**
     * ���������� ��-1
     * @param �MUK1
     * @return �MUK1
     */
    public String get�MUK1() {
        return �MUK1.get();
    }
    /**
     * ������ ��-1
     * @param �MUK1
     * @return �MUK1
     */
    public void set�MUK1(String �MUK1) {
        this.�MUK1 =new SimpleStringProperty(�MUK1) ;
    }
    /**
     * ���������� ��-2
     * @param �MUK2
     * @return �MUK2
     */
    public String get�MUK2() {
        return �MUK2.get();
    }
    /**
     * ������ ��-2
     * @param �MUK2
     * @return �MUK2
     */
    public void set�MUK2(String �MUK2) {
        this.�MUK2 =new SimpleStringProperty(�MUK2) ;
    }
    /**
     * ���������� ��-3
     * @param �MUK3
     * @return �MUK3
     */
    public String get�MUK3() {
        return �MUK3.get();
    }
    /**
     * ������ ��-3
     * @param �MUK3
     * @return �MUK3
     */
    public void set�MUK3(String �MUK3) {
        this.�MUK3 = new SimpleStringProperty(�MUK3);
    }
    /**
     * ���������� ��-4
     * @param �MUK4
     * @return �MUK4
     */
    public String get�MUK4() {
        return �MUK4.get();
    }
    /**
     * ������ ��-4
     * @param �MUK4
     * @return �MUK4
     */
    public void set�MUK4(String �MUK4) {
        this.�MUK4 = new SimpleStringProperty( �MUK4);
    }
    /**
     * ���������� ���-1
     * @param �MOPK1
     * @return �MOPK1
     */
    public String get�MOPK1() {
        return �MOPK1.get();
    }
    /**
     * ������ ���-1
     * @param �MOPK1
     * @return �MOPK1
     */
    public void set�MOPK1(String �MOPK1) {
        this.�MOPK1 =  new SimpleStringProperty(�MOPK1);
    }
    /**
     * ���������� ���-2
     * @param �MOPK2
     * @return �MOPK2
     */
    public String get�MOPK2() {
        return �MOPK2.get();
    }
    /**
     * ������ ���-2
     * @param �MOPK2
     * @return �MOPK2
     */
    public void set�MOPK2(String �MOPK2) {
        this.�MOPK2 = new SimpleStringProperty( �MOPK2);
    }
    /**
     * ���������� ���-3
     * @param �MOPK3
     * @return �MOPK3
     */
    public String get�MOPK3() {
        return �MOPK3.get();
    }
    /**
     * ������ ���-3
     * @param �MOPK3
     * @return �MOPK3
     */
    public void set�MOPK3(String �MOPK3) {
        this.�MOPK3 = new SimpleStringProperty( �MOPK3);
    }
    /**
     * ���������� ���-4
     * @param �MOPK4
     * @return �MOPK4
     */
    public String get�MOPK4() {
        return �MOPK4.get();
    }
    /**
     * ������ ���-4
     * @param �MOPK4
     * @return �MOPK4
     */
    public void set�MOPK4(String �MOPK4) {
        this.�MOPK4 =  new SimpleStringProperty(�MOPK4);
    }
    /**
     * ���������� ���-5
     * @param �MOPK5
     * @return �MOPK5
     */
    public String get�MOPK5() {
        return �MOPK5.get();
    }
    /**
     * ������ ���-5
     * @param �MOPK5
     * @return �MOPK5
     */
    public void set�MOPK5(String �MOPK5) {
        this.�MOPK5 = new SimpleStringProperty( �MOPK5);
    }




    public �ompetenceMatrix(String �MDepartment, String �MIndex, String �MNameDiscipline, String �MUK1, String �MUK2, String �MUK3, String �MUK4, String �MOPK1, String �MOPK2, String �MOPK3, String �MOPK4, String �MOPK5) {
        this.�MDepartment = new SimpleStringProperty(�MDepartment) ;
        this.�MIndex =  new SimpleStringProperty(�MIndex) ;
        this.�MNameDiscipline = new SimpleStringProperty(�MNameDiscipline);
        this.�MUK1 =new SimpleStringProperty(�MUK1) ;
        this.�MUK2 = new SimpleStringProperty(�MUK2);
        this.�MUK3 =new SimpleStringProperty(�MUK3);
        this.�MUK4 =new SimpleStringProperty(�MUK4);
        this.�MOPK1 = new SimpleStringProperty(�MOPK1);
        this.�MOPK2 = new SimpleStringProperty(�MOPK2);
        this.�MOPK3 = new SimpleStringProperty(�MOPK3);
        this.�MOPK4 = new SimpleStringProperty(�MOPK4);
        this.�MOPK5 = new SimpleStringProperty(�MOPK5);

    }



}
