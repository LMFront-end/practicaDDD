package domain.almacen;

import domain.almacen.ids.AlmacenId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.matchers.JUnitMatchers;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class AlmacenTest {

    @Test
    void almacenTest(){
        var almacenId = AlmacenId.of("asdert");
        Almacen almacen = new Almacen(almacenId);

        Assertions.assertEquals(almacenId, almacen.almacenId);

    }

}