package com.cta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
class SomeClassTest {

    @InjectMocks private SomeClass someClass;
    @Mock private MetricManager metricManager;

    @Test
    void shouldFilterLargeString() {
        String result = someClass.someMethod(List.of(), 0);
        Assertions.assertEquals("", result);
    }
}