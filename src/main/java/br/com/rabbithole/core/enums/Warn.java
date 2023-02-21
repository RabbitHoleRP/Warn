package br.com.rabbithole.core.enums;

import br.com.rabbithole.WarnUtils;

public enum Warn {
    INSERT_CACHE_ERROR("<red>[%s] Erro ao adicionar jogador ao Cache!"),
    DELETE_CACHE_ERROR("<red>[%s] Erro ao remover jogador do Cache!"),
    UPDATE_CACHE_ERROR("<red>[%s] Erro ao atualizar jogador no Cache!"),
    CHECK_CACHE_ERROR("<red>[%s] Erro ao verificar jogador no Cache!"),
    GET_CACHE_ERROR("<red>[%s] Erro ao acessar informações do jogador no Cache!"),
    INSERT_DATABASE_ERROR("<red>[%s] Erro ao inserir jogador no Banco de Dados!"),
    UPDATE_DATABASE_ERROR("<red>[%s] Erro ao atualizar jogador no Banco de Dados!"),
    DELETE_DATABASE_ERROR("<red>[%s] Erro ao deletar jogador do Banco de Dados!");

    public final String message;

    Warn(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
