package com.cta;

import java.util.List;
import java.util.logging.Logger;

public record StringFilter(MetricManager metricManager) {

    private static final Logger LOG = Logger.getAnonymousLogger();

    public String filter(List<String> strings, int maxStringSize) {
        LOG.info("calling filter method");

        List<String> filteredStrings = strings.stream()
            .filter(string -> string.length() <= maxStringSize)
            .toList();

        int filteredString = strings.size() - filteredStrings.size();

        return String.join(" ", filteredStrings);
    }
}
