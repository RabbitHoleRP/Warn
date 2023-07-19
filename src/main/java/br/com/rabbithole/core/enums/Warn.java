package br.com.rabbithole.core.enums;

/**
 * @author Felipe Ros
 * @Usage Enum de Avisos predefinidos.
 * @since 1.0.0
 * @version 1.0.1
 */
public enum Warn {
    INSERT_CACHE_ERROR("Erro ao adicionar jogador ao Cache!"),
    DELETE_CACHE_ERROR("Erro ao remover jogador do Cache!"),
    UPDATE_CACHE_ERROR("[%s] Erro ao atualizar jogador no Cache!"),
    CHECK_CACHE_ERROR("[%s] Erro ao verificar jogador no Cache!"),
    GET_CACHE_ERROR("[%s] Erro ao acessar informações do jogador no Cache!"),
    INSERT_DATABASE_ERROR("[%s] Erro ao inserir jogador no Banco de Dados!"),
    UPDATE_DATABASE_ERROR("[%s] Erro ao atualizar jogador no Banco de Dados!"),
    DELETE_DATABASE_ERROR("[%s] Erro ao deletar jogador do Banco de Dados!");

    public final String message;

    Warn(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
