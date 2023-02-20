package br.com.rabbithole;

import br.com.rabbithole.core.WarnExecutor;

public class WarnUtils {
    private static WarnExecutor warn;

    public static void warnInitializer(String prefix) {
        warn = new WarnExecutor(prefix);
        warn.sendWarn("<green>Instância de WarnLib iniciada em Projeto: "+prefix);
    }

    public static WarnExecutor getWarn() {
        return warn;
    }
}