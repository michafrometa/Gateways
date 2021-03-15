package com.cemisoft.gateways.domain;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GatewayTest {

    @Test
    @DisplayName("Equals Verifier")
    void equalsVerifier() {
        EqualsVerifier.forClass(Gateway.class)
                .suppress(Warning.ALL_FIELDS_SHOULD_BE_USED)
                .suppress(Warning.STRICT_INHERITANCE)
                .suppress(Warning.NONFINAL_FIELDS)
                .suppress(Warning.INHERITED_DIRECTLY_FROM_OBJECT)
                .verify();
    }
}
