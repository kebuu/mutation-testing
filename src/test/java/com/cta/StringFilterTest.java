package com.cta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
class StringFilterTest {

    @InjectMocks private StringFilter someClass;
    @Mock private MetricManager metricManager;

    @Test
    void shouldFilterLargeString() {
        String result = someClass.filter(List.of(), 0);
        Assertions.assertEquals("", result);
    }
}