package com.cta;

import java.util.List;

public class SomeClass {

    private final MetricManager metricManager;

    public SomeClass(MetricManager metricManager) {
        this.metricManager = metricManager;
    }

    public String someMethod(List<String> strings, int maxStringSize) {
        List<String> filteredStrings = strings.stream()
            .filter(string -> string.length() <= maxStringSize)
            .toList();

        int filteredString = strings.size() - filteredStrings.size();
        metricManager.record("filtered.string", filteredString);

        return String.join(" ", filteredStrings);
    }
}
