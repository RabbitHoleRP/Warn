package br.com.rabbithole.core.enums;

import br.com.rabbithole.WarnUtils;

public enum Warn {
    INSERT_CACHE_ERROR("<red>[%s] Erro ao adicionar jogador ao Cache!".formatted(WarnUtils.getWarn().getPrefix())),
    DELETE_CACHE_ERROR("<red>[%s] Erro ao remover jogador do Cache!".formatted(WarnUtils.getWarn().getPrefix())),
    UPDATE_CACHE_ERROR("<red>[%s] Erro ao atualizar jogador no Cache!".formatted(WarnUtils.getWarn().getPrefix())),
    CHECK_CACHE_ERROR("<red>[%s] Erro ao verificar jogador no Cache!".formatted(WarnUtils.getWarn().getPrefix())),
    GET_CACHE_ERROR("<red>[%s] Erro ao acessar informações do jogador no Cache!".formatted(WarnUtils.getWarn().getPrefix())),
    INSERT_DATABASE_ERROR("<red>[%s] Erro ao inserir jogador no Banco de Dados!".formatted(WarnUtils.getWarn().getPrefix())),
    UPDATE_DATABASE_ERROR("<red>[%s] Erro ao atualizar jogador no Banco de Dados!".formatted(WarnUtils.getWarn().getPrefix())),
    DELETE_DATABASE_ERROR("<red>[%s] Erro ao deletar jogador do Banco de Dados!".formatted(WarnUtils.getWarn().getPrefix()));

    public final String message;

    Warn(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
