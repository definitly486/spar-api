package com.google.common.primitives;

import java.io.Serializable;
import java.util.Arrays;
import xa.draadjrbmk;

/* JADX INFO: loaded from: classes2.dex */
public final class eablkybsjg implements Serializable {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private static final eablkybsjg f23767iwizpuwonk = new eablkybsjg(new int[0]);

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final int f23768jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final transient int f23769yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int[] f23770zdlpuopuiu;

    private eablkybsjg(int[] iArr) {
        this(iArr, 0, iArr.length);
    }

    public static eablkybsjg btonecajqb() {
        return f23767iwizpuwonk;
    }

    public static eablkybsjg iobyxmoadg(int[] iArr) {
        return iArr.length == 0 ? f23767iwizpuwonk : new eablkybsjg(Arrays.copyOf(iArr, iArr.length));
    }

    private boolean nufgyqmvbu() {
        return this.f23769yggfygwlhe > 0 || this.f23768jyumaefscl < this.f23770zdlpuopuiu.length;
    }

    public eablkybsjg agtfadlqog() {
        return nufgyqmvbu() ? new eablkybsjg(draadjrbmk()) : this;
    }

    public int[] draadjrbmk() {
        return Arrays.copyOfRange(this.f23770zdlpuopuiu, this.f23769yggfygwlhe, this.f23768jyumaefscl);
    }

    public int dxjokdxxww() {
        return this.f23768jyumaefscl - this.f23769yggfygwlhe;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eablkybsjg)) {
            return false;
        }
        eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
        if (dxjokdxxww() != eablkybsjgVar.dxjokdxxww()) {
            return false;
        }
        for (int i13 = 0; i13 < dxjokdxxww(); i13++) {
            if (wkgbmnqykc(i13) != eablkybsjgVar.wkgbmnqykc(i13)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int iNufgyqmvbu = 1;
        for (int i13 = this.f23769yggfygwlhe; i13 < this.f23768jyumaefscl; i13++) {
            iNufgyqmvbu = (iNufgyqmvbu * 31) + gxszxtbevo.nufgyqmvbu(this.f23770zdlpuopuiu[i13]);
        }
        return iNufgyqmvbu;
    }

    public boolean lqeggnwhkg() {
        return this.f23768jyumaefscl == this.f23769yggfygwlhe;
    }

    Object readResolve() {
        return lqeggnwhkg() ? f23767iwizpuwonk : this;
    }

    public String toString() {
        if (lqeggnwhkg()) {
            return "[]";
        }
        StringBuilder sb3 = new StringBuilder(dxjokdxxww() * 5);
        sb3.append('[');
        sb3.append(this.f23770zdlpuopuiu[this.f23769yggfygwlhe]);
        int i13 = this.f23769yggfygwlhe;
        while (true) {
            i13++;
            if (i13 >= this.f23768jyumaefscl) {
                sb3.append(']');
                return sb3.toString();
            }
            sb3.append(", ");
            sb3.append(this.f23770zdlpuopuiu[i13]);
        }
    }

    public int wkgbmnqykc(int i13) {
        draadjrbmk.nufgyqmvbu(i13, dxjokdxxww());
        return this.f23770zdlpuopuiu[this.f23769yggfygwlhe + i13];
    }

    Object writeReplace() {
        return agtfadlqog();
    }

    private eablkybsjg(int[] iArr, int i13, int i14) {
        this.f23770zdlpuopuiu = iArr;
        this.f23769yggfygwlhe = i13;
        this.f23768jyumaefscl = i14;
    }
}
