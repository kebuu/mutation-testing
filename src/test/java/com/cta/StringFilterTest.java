package com.cta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
class StringFilterTest {

    @InjectMocks private StringFilter someClass;
    @Mock private MetricManager metricManager;

    @Test
    void shouldFilterLargeString_wrong() {
        String result = someClass.filter(List.of(), 0);
        Assertions.assertEquals("", result);
    }

//    @Test
//    void shouldFilterLargeString_good() {
//        String result = someClass.filter(List.of("Hello", "my", "World"), 3);
//        Assertions.assertEquals("my", result);
//
//        Mockito.verify(metricManager).record("filtered.string", 2);
//    }
}