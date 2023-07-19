package br.com.rabbithole.core.enums;

/**
 * @author Felipe Ros
 * @Usage Enum de Níveis de Avisos.
 * @since 1.1.0
 * @version 1.0.0
 */
public enum Level {
    INFO("<white>INFO [%s]:"),
    WARN("<yellow>WARN [%s]:"),
    ERROR("<red>ERROR [%s]:"),
    DEBUG("<aqua>DEBUG [%s]:");

    public final String messageFormat;

    Level(String messageFormat) {
        this.messageFormat = messageFormat;
    }

    public String getMessageFormat() {
        return messageFormat;
    }
}
