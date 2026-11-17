package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
final class lmojexxdyd extends pkzmftpjix implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    static final lmojexxdyd f23683zdlpuopuiu = new lmojexxdyd();

    private lmojexxdyd() {
    }

    private Object readResolve() {
        return f23683zdlpuopuiu;
    }

    @Override // com.google.common.collect.pkzmftpjix, java.util.Comparator
    /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        xa.draadjrbmk.btonecajqb(comparable);
        xa.draadjrbmk.btonecajqb(comparable2);
        return comparable.compareTo(comparable2);
    }

    @Override // com.google.common.collect.pkzmftpjix
    public pkzmftpjix dxjokdxxww() {
        return dsvhmnatus.f23639zdlpuopuiu;
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
