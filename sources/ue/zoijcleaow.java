package ue;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* JADX INFO: loaded from: classes2.dex */
final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iobyxmoadg f113508iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int[] f113509zoijcleaow;

    zoijcleaow(iobyxmoadg iobyxmoadgVar, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f113508iobyxmoadg = iobyxmoadgVar;
        int length = iArr.length;
        int i13 = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.f113509zoijcleaow = iArr;
            return;
        }
        while (i13 < length && iArr[i13] == 0) {
            i13++;
        }
        if (i13 == length) {
            this.f113509zoijcleaow = new int[]{0};
            return;
        }
        int[] iArr2 = new int[length - i13];
        this.f113509zoijcleaow = iArr2;
        System.arraycopy(iArr, i13, iArr2, 0, iArr2.length);
    }

    int eablkybsjg() {
        return this.f113509zoijcleaow.length - 1;
    }

    boolean gxszxtbevo() {
        return this.f113509zoijcleaow[0] == 0;
    }

    zoijcleaow iobyxmoadg(zoijcleaow zoijcleaowVar) {
        if (!this.f113508iobyxmoadg.equals(zoijcleaowVar.f113508iobyxmoadg)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (gxszxtbevo()) {
            return zoijcleaowVar;
        }
        if (zoijcleaowVar.gxszxtbevo()) {
            return this;
        }
        int[] iArr = this.f113509zoijcleaow;
        int[] iArr2 = zoijcleaowVar.f113509zoijcleaow;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i13 = length; i13 < iArr.length; i13++) {
            iArr3[i13] = iobyxmoadg.iobyxmoadg(iArr2[i13 - length], iArr[i13]);
        }
        return new zoijcleaow(this.f113508iobyxmoadg, iArr3);
    }

    zoijcleaow lqeggnwhkg(zoijcleaow zoijcleaowVar) {
        if (!this.f113508iobyxmoadg.equals(zoijcleaowVar.f113508iobyxmoadg)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (gxszxtbevo() || zoijcleaowVar.gxszxtbevo()) {
            return this.f113508iobyxmoadg.eablkybsjg();
        }
        int[] iArr = this.f113509zoijcleaow;
        int length = iArr.length;
        int[] iArr2 = zoijcleaowVar.f113509zoijcleaow;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = iArr[i13];
            for (int i15 = 0; i15 < length2; i15++) {
                int i16 = i13 + i15;
                iArr3[i16] = iobyxmoadg.iobyxmoadg(iArr3[i16], this.f113508iobyxmoadg.nufgyqmvbu(i14, iArr2[i15]));
            }
        }
        return new zoijcleaow(this.f113508iobyxmoadg, iArr3);
    }

    zoijcleaow nufgyqmvbu(int i13, int i14) {
        if (i13 < 0) {
            throw new IllegalArgumentException();
        }
        if (i14 == 0) {
            return this.f113508iobyxmoadg.eablkybsjg();
        }
        int length = this.f113509zoijcleaow.length;
        int[] iArr = new int[i13 + length];
        for (int i15 = 0; i15 < length; i15++) {
            iArr[i15] = this.f113508iobyxmoadg.nufgyqmvbu(this.f113509zoijcleaow[i15], i14);
        }
        return new zoijcleaow(this.f113508iobyxmoadg, iArr);
    }

    int ppxfxbqfkf(int i13) {
        int[] iArr = this.f113509zoijcleaow;
        return iArr[(iArr.length - 1) - i13];
    }

    public String toString() {
        if (gxszxtbevo()) {
            return CommonUrlParts.Values.FALSE_INTEGER;
        }
        StringBuilder sb3 = new StringBuilder(eablkybsjg() * 8);
        for (int iEablkybsjg = eablkybsjg(); iEablkybsjg >= 0; iEablkybsjg--) {
            int iPpxfxbqfkf = ppxfxbqfkf(iEablkybsjg);
            if (iPpxfxbqfkf != 0) {
                if (iPpxfxbqfkf < 0) {
                    if (iEablkybsjg == eablkybsjg()) {
                        sb3.append("-");
                    } else {
                        sb3.append(" - ");
                    }
                    iPpxfxbqfkf = -iPpxfxbqfkf;
                } else if (sb3.length() > 0) {
                    sb3.append(" + ");
                }
                if (iEablkybsjg == 0 || iPpxfxbqfkf != 1) {
                    int iLqeggnwhkg = this.f113508iobyxmoadg.lqeggnwhkg(iPpxfxbqfkf);
                    if (iLqeggnwhkg == 0) {
                        sb3.append('1');
                    } else if (iLqeggnwhkg == 1) {
                        sb3.append('a');
                    } else {
                        sb3.append("a^");
                        sb3.append(iLqeggnwhkg);
                    }
                }
                if (iEablkybsjg != 0) {
                    if (iEablkybsjg == 1) {
                        sb3.append('x');
                    } else {
                        sb3.append("x^");
                        sb3.append(iEablkybsjg);
                    }
                }
            }
        }
        return sb3.toString();
    }

    int[] wkgbmnqykc() {
        return this.f113509zoijcleaow;
    }

    zoijcleaow[] zoijcleaow(zoijcleaow zoijcleaowVar) {
        if (!this.f113508iobyxmoadg.equals(zoijcleaowVar.f113508iobyxmoadg)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (zoijcleaowVar.gxszxtbevo()) {
            throw new IllegalArgumentException("Divide by 0");
        }
        zoijcleaow zoijcleaowVarEablkybsjg = this.f113508iobyxmoadg.eablkybsjg();
        int iGxszxtbevo = this.f113508iobyxmoadg.gxszxtbevo(zoijcleaowVar.ppxfxbqfkf(zoijcleaowVar.eablkybsjg()));
        zoijcleaow zoijcleaowVarIobyxmoadg = this;
        while (zoijcleaowVarIobyxmoadg.eablkybsjg() >= zoijcleaowVar.eablkybsjg() && !zoijcleaowVarIobyxmoadg.gxszxtbevo()) {
            int iEablkybsjg = zoijcleaowVarIobyxmoadg.eablkybsjg() - zoijcleaowVar.eablkybsjg();
            int iNufgyqmvbu = this.f113508iobyxmoadg.nufgyqmvbu(zoijcleaowVarIobyxmoadg.ppxfxbqfkf(zoijcleaowVarIobyxmoadg.eablkybsjg()), iGxszxtbevo);
            zoijcleaow zoijcleaowVarNufgyqmvbu = zoijcleaowVar.nufgyqmvbu(iEablkybsjg, iNufgyqmvbu);
            zoijcleaowVarEablkybsjg = zoijcleaowVarEablkybsjg.iobyxmoadg(this.f113508iobyxmoadg.zoijcleaow(iEablkybsjg, iNufgyqmvbu));
            zoijcleaowVarIobyxmoadg = zoijcleaowVarIobyxmoadg.iobyxmoadg(zoijcleaowVarNufgyqmvbu);
        }
        return new zoijcleaow[]{zoijcleaowVarEablkybsjg, zoijcleaowVarIobyxmoadg};
    }
}
