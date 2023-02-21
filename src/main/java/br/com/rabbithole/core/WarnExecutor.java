package br.com.rabbithole.core;

import br.com.rabbithole.core.enums.Warn;
import br.com.rabbithole.utils.StringUtils;
import org.bukkit.Bukkit;

public class WarnExecutor {
    private String prefix;

    public WarnExecutor(String prefix) {
        this.prefix = prefix;
    }

    public void sendWarn(Warn warn) {
        Bukkit.getConsoleSender().sendMessage(StringUtils.formatString(warn.getMessage().formatted(getPrefix())));
    }

    public void sendWarn(String msg) {
        Bukkit.getConsoleSender().sendMessage(StringUtils.formatString("[%s] ".formatted(getPrefix()) + msg));
    }

    public String getPrefix() {
        return prefix;
    }
}
