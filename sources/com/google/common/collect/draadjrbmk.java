package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
final class draadjrbmk extends pkzmftpjix implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    final Comparator f23638zdlpuopuiu;

    draadjrbmk(Comparator comparator) {
        this.f23638zdlpuopuiu = (Comparator) xa.draadjrbmk.btonecajqb(comparator);
    }

    @Override // com.google.common.collect.pkzmftpjix, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f23638zdlpuopuiu.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof draadjrbmk) {
            return this.f23638zdlpuopuiu.equals(((draadjrbmk) obj).f23638zdlpuopuiu);
        }
        return false;
    }

    public int hashCode() {
        return this.f23638zdlpuopuiu.hashCode();
    }

    public String toString() {
        return this.f23638zdlpuopuiu.toString();
    }
}
