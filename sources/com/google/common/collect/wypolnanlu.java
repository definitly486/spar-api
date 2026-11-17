package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
final class wypolnanlu extends pkzmftpjix implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    final pkzmftpjix f23731zdlpuopuiu;

    wypolnanlu(pkzmftpjix pkzmftpjixVar) {
        this.f23731zdlpuopuiu = (pkzmftpjix) xa.draadjrbmk.btonecajqb(pkzmftpjixVar);
    }

    @Override // com.google.common.collect.pkzmftpjix, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f23731zdlpuopuiu.compare(obj2, obj);
    }

    @Override // com.google.common.collect.pkzmftpjix
    public pkzmftpjix dxjokdxxww() {
        return this.f23731zdlpuopuiu;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wypolnanlu) {
            return this.f23731zdlpuopuiu.equals(((wypolnanlu) obj).f23731zdlpuopuiu);
        }
        return false;
    }

    public int hashCode() {
        return -this.f23731zdlpuopuiu.hashCode();
    }

    public String toString() {
        return this.f23731zdlpuopuiu + ".reverse()";
    }
}
