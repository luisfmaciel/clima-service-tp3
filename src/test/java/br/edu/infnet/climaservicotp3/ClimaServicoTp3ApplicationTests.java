package br.edu.infnet.climaservicotp3;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class ClimaServicoTp3ApplicationTests {

    @Test
    void contextLoads() {
    }

}
