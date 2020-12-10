package week07d4;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LabTest {
    @Test
    public void Contructor1(){
        Lab lab = new Lab("Match");
        assertEquals("Subject info: title='Match', completed=false, completedAt=null", lab.toString());
    }

    @Test
    public void Contructor2(){
        Lab lab = new Lab("Match", LocalDate.of(2020,11,15));
        assertEquals("Subject info: title='Match', completed=true, completedAt=2020-11-15", lab.toString());
    }

    @Test
    public void complete1(){
        Lab lab = new Lab("Match");
        lab.complete(LocalDate.of(2020,11,16));
        assertEquals("Subject info: title='Match', completed=true, completedAt=2020-11-16", lab.toString());
    }

    @Test
    public void complete2(){
        Lab lab = new Lab("Match");
        lab.complete();
        assertEquals("Subject info: title='Match', completed=true, completedAt="+LocalDate.now(), lab.toString());
    }



}