package domain.almacen;

import domain.almacen.ids.AlmacenId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlmacenTest {

    @Test
    public void onCreateTest(){
        var almacenId = AlmacenId.of("asdert");
        Almacen almacen = new Almacen(almacenId);

        Assertions.assertEquals(almacenId, almacen.almacenId);

    }

}