package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
class kcexrzcfyt extends eablkybsjg implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    final Object f23671yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    final Object f23672zdlpuopuiu;

    kcexrzcfyt(Object obj, Object obj2) {
        this.f23672zdlpuopuiu = obj;
        this.f23671yggfygwlhe = obj2;
    }

    @Override // com.google.common.collect.eablkybsjg, java.util.Map.Entry
    public final Object getKey() {
        return this.f23672zdlpuopuiu;
    }

    @Override // com.google.common.collect.eablkybsjg, java.util.Map.Entry
    public final Object getValue() {
        return this.f23671yggfygwlhe;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
