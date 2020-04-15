package com.company;

public enum Choice {
    ADD_NEW_VERTEX,
    ADD_NEW_EDGE,
    RUN_KRUSKAL,
    EXIT;

    public static Choice fromValue(Integer ordinal) {
        return values()[ordinal - 1];
    }
}
