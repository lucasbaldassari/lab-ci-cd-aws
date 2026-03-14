package com.lucasbaldassari.app;

import org.junit.jupiter.api.Test;
import com.lucasbaldassari.app.service.DefaultService;
import static org.assertj.core.api.Assertions.assertThat;

class DefaultServiceTest {

    private final DefaultService defaultService = new DefaultService();

    @Test
    void shouldReturnIndexStringFromService() {
        String result = defaultService.getIndexString();
        assertThat(result).isEqualTo("index");
    }

}
