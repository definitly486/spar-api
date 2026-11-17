package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
final class dsvhmnatus extends pkzmftpjix implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    static final dsvhmnatus f23639zdlpuopuiu = new dsvhmnatus();

    private dsvhmnatus() {
    }

    private Object readResolve() {
        return f23639zdlpuopuiu;
    }

    @Override // com.google.common.collect.pkzmftpjix, java.util.Comparator
    /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        xa.draadjrbmk.btonecajqb(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    @Override // com.google.common.collect.pkzmftpjix
    public pkzmftpjix dxjokdxxww() {
        return pkzmftpjix.lqeggnwhkg();
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
