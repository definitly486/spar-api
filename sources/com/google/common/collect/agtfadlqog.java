package com.google.common.collect;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
final class agtfadlqog extends pkzmftpjix implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    final Comparator[] f23596zdlpuopuiu;

    agtfadlqog(Comparator comparator, Comparator comparator2) {
        this.f23596zdlpuopuiu = new Comparator[]{comparator, comparator2};
    }

    @Override // com.google.common.collect.pkzmftpjix, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        int i13 = 0;
        while (true) {
            Comparator[] comparatorArr = this.f23596zdlpuopuiu;
            if (i13 >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i13].compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            i13++;
        }
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agtfadlqog) {
            return Arrays.equals(this.f23596zdlpuopuiu, ((agtfadlqog) obj).f23596zdlpuopuiu);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f23596zdlpuopuiu);
    }

    public String toString() {
        return "Ordering.compound(" + Arrays.toString(this.f23596zdlpuopuiu) + ")";
    }
}
