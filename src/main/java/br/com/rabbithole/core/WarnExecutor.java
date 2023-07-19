package br.com.rabbithole.core;

import br.com.rabbithole.core.enums.Level;
import br.com.rabbithole.core.enums.Warn;
import br.com.rabbithole.utils.StringUtils;
import org.bukkit.Bukkit;
import org.jetbrains.annotations.NotNull;

/**
 * @author Felipe Ros
 * @Usage Classe de Execução dos Avisos requisitados.
 * @since 1.0.0
 * @version 1.1.0
 */
public class WarnExecutor {
    /**
     * @Usage Prefixo de execução do Projeto
     */
    private final @NotNull  String prefix;

    /**
     * @Usage Construtor da classe de execução dos Avisos.
     * @param prefix String de definição do prefixo de execução do Projeto.
     */
    public WarnExecutor(@NotNull String prefix) {
        this.prefix = prefix;
    }

    /**
     * @Usage Utilizado para enviar um Aviso predefinido.
     * @param warn {@link Warn} tipo de aviso que será enviado.
     */
    @Deprecated
    public void sendWarn(@NotNull  Warn warn) {
        Bukkit.getConsoleSender().sendMessage(StringUtils.formatString(warn.getMessage().formatted(getPrefix())));
    }

    /**
     * @Usage Utilizado para enviar um Aviso predefinido com Nível de prioridade.
     * @param level {@link Level} Nível de prioridade do Aviso.
     * @param warn {@link Warn} Tipo de aviso que será enviado.
     */
    public void sendWarn(@NotNull Level level, @NotNull  Warn warn) {
        Bukkit.getConsoleSender().sendMessage(StringUtils.formatString(level.getMessageFormat().formatted(this.getPrefix()) + warn.getMessage()));
    }

    /**
     * @Usage Utilizado para enviar um Aviso customizado.
     * @param message Mensagem que será enviada.
     */
    public void sendWarn(@NotNull  String message) {
        Bukkit.getConsoleSender().sendMessage(StringUtils.formatString("[%s] ".formatted(getPrefix()) + message));
    }

    /**
     * @Usage Utilizado para enviar um Aviso customizado com Nível de prioridade.
     * @param level {@link Level} Nível de prioridade do Aviso.
     * @param message Mensagem que será enviada.
     */
    public void sendWarn(@NotNull Level level, @NotNull String message) {
        Bukkit.getConsoleSender().sendMessage(StringUtils.formatString(level.getMessageFormat().formatted(this.getPrefix()) + message));
    }

    public @NotNull String getPrefix() {
        return prefix;
    }
}
