package test.java;

import model.—ompetenceMatrix;
import org.junit.jupiter.api.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static org.junit.jupiter.api.Assertions.*;

class —ompetenceMatrixTest {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before IImageTest.class");
    }

    @AfterClass
    public  static void afterClass() {
        System.out.println("After IImageTest.class");}
    @Test
    void get—MDepartment( ) throws Exception{
        —ompetenceMatrix competenceMatrix = new —ompetenceMatrix("","","","","","","","","","","","");
        competenceMatrix.set—MNameDiscipline("Õ‡Á‚‡ÌËÂ Í‡ÙÂ‰˚");
        System.out.println(competenceMatrix.get—MDepartment());
    }


    @Test
    void get—MIndex() throws Exception{
        —ompetenceMatrix competenceMatrix = new —ompetenceMatrix("","","","","","","","","","","","");
        competenceMatrix.set—MIndex("»Ì‰ÂÍÒ");
        System.out.println(competenceMatrix.get—MIndex());

    }

    @Test
    void get—MNameDiscipline() throws Exception{
            —ompetenceMatrix competenceMatrix = new —ompetenceMatrix("","","","","","","","","","","","");
            competenceMatrix.set—MNameDiscipline("Õ‡Á‚‡ÌËÂ ‰ËÒˆËÎËÌ˚");
            System.out.println(competenceMatrix.get—MNameDiscipline());
    }



    @Test
    void get—MUK1() throws Exception{
        —ompetenceMatrix competenceMatrix = new —ompetenceMatrix("","","","","","","","","","","","");
        competenceMatrix.set—MUK1("” -1");
        System.out.println(competenceMatrix.get—MUK1());
    }


    @Test
    void get—MUK2() throws Exception{
        —ompetenceMatrix competenceMatrix = new —ompetenceMatrix("","","","","","","","","","","","");
        competenceMatrix.set—MUK2("” -2");
        System.out.println(competenceMatrix.get—MUK2());}



    @Test
    void get—MUK3() throws Exception{
        —ompetenceMatrix competenceMatrix = new —ompetenceMatrix("","","","","","","","","","","","");
        competenceMatrix.set—MUK3("” -3");
        System.out.println(competenceMatrix.get—MUK3());}



    @Test
    void get—MUK4() throws Exception{
        —ompetenceMatrix competenceMatrix = new —ompetenceMatrix("","","","","","","","","","","","");
        competenceMatrix.set—MUK4("” -4");
        System.out.println(competenceMatrix.get—MUK4());}


    @Test
    void get—MOPK1() throws Exception{
        —ompetenceMatrix competenceMatrix = new —ompetenceMatrix("","","","","","","","","","","","");
        competenceMatrix.set—MOPK1("Œœ -1");
        System.out.println(competenceMatrix.get—MOPK1());}



    @Test
    void get—MOPK2()  throws Exception{
        —ompetenceMatrix competenceMatrix = new —ompetenceMatrix("","","","","","","","","","","","");
        competenceMatrix.set—MOPK2("Œœ -2");
        System.out.println(competenceMatrix.get—MOPK2());}



    @Test
    void get—MOPK3()  throws Exception{
        —ompetenceMatrix competenceMatrix = new —ompetenceMatrix("","","","","","","","","","","","");
        competenceMatrix.set—MOPK3("Œœ -3");
        System.out.println(competenceMatrix.get—MOPK3());}



    @Test
    void get—MOPK4()  throws Exception{
        —ompetenceMatrix competenceMatrix = new —ompetenceMatrix("","","","","","","","","","","","");
        competenceMatrix.set—MOPK4("Œœ -4");
        System.out.println(competenceMatrix.get—MOPK4());}


    @Test
    void get—MOPK5()  throws Exception{
        —ompetenceMatrix competenceMatrix = new —ompetenceMatrix("","","","","","","","","","","","");
        competenceMatrix.set—MOPK5("Œœ -5");
        System.out.println(competenceMatrix.get—MOPK5());}


}