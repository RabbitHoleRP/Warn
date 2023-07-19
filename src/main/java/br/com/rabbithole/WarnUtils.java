package br.com.rabbithole;

import br.com.rabbithole.core.WarnExecutor;
import org.jetbrains.annotations.NotNull;

/**
 * @author Felipe Ros
 * @Usage Classe de acesso a Biblioteca.
 * @since 1.0.0
 * @version 1.0.0
 */
public class WarnUtils {
    private static WarnExecutor warn;

    /**
     * @Usage Construtor da classe de acesso a Biblioteca.
     * @param prefix - String de definição do prefixo de execução do Projeto.
     */
    public WarnUtils(@NotNull String prefix) {
        warn = new WarnExecutor(prefix);
        warn.sendWarn("<green>Instância de WarnLib iniciada em Projeto: "+prefix);
    }

    /**
     * @Usage Utilizado para acessar a instância de Execução.
     * @return Warn - Retorna o objeto da Instância de Execução.
     */
    public WarnExecutor getWarn() {
        return warn;
    }
}