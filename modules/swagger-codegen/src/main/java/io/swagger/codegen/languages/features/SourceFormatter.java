package io.swagger.codegen.languages.features;

/**
 * Implement this interface in your codegen if you like to format the generated source code.
 */
public interface SourceFormatter {

    /**
     * Formats the generated source code.
     */
    String formatSource(String source);
}
