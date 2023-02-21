package br.com.rabbithole;

import br.com.rabbithole.core.WarnExecutor;

public class WarnUtils {
    private static WarnExecutor warn;

    public WarnUtils() {
    }

    public void warnInitializer(String prefix) {
        warn = new WarnExecutor(prefix);
        warn.sendWarn("<green>Instância de WarnLib iniciada em Projeto: "+prefix);
    }

    public WarnExecutor getWarn() {
        return warn;
    }
}