package br.com.rabbithole.utils;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.jetbrains.annotations.NotNull;

/**
 * @author Felipe Ros
 * @Usage Métodos de formatação de Mensagens.
 * @since 1.0.0
 * @version 1.0.0
 */
public class StringUtils {

    /**
     * @param input String que será convertida para Component (Adventure)
     * @return Component — Component (Adventure) convertido
     */
    public static Component formatString(@NotNull String input) {
        return MiniMessage.miniMessage().deserialize(input);
    }
}
