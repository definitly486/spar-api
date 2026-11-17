package h4;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class draadjrbmk extends dxjokdxxww {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final int[] f39341eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final int[] f39342gxszxtbevo;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final int f39343ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final int f39344wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final int f39345zoijcleaow;

    public draadjrbmk(int i13, int i14, int i15, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f39345zoijcleaow = i13;
        this.f39343ppxfxbqfkf = i14;
        this.f39344wkgbmnqykc = i15;
        this.f39341eablkybsjg = iArr;
        this.f39342gxszxtbevo = iArr2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || draadjrbmk.class != obj.getClass()) {
            return false;
        }
        draadjrbmk draadjrbmkVar = (draadjrbmk) obj;
        return this.f39345zoijcleaow == draadjrbmkVar.f39345zoijcleaow && this.f39343ppxfxbqfkf == draadjrbmkVar.f39343ppxfxbqfkf && this.f39344wkgbmnqykc == draadjrbmkVar.f39344wkgbmnqykc && Arrays.equals(this.f39341eablkybsjg, draadjrbmkVar.f39341eablkybsjg) && Arrays.equals(this.f39342gxszxtbevo, draadjrbmkVar.f39342gxszxtbevo);
    }

    public int hashCode() {
        return ((((((((527 + this.f39345zoijcleaow) * 31) + this.f39343ppxfxbqfkf) * 31) + this.f39344wkgbmnqykc) * 31) + Arrays.hashCode(this.f39341eablkybsjg)) * 31) + Arrays.hashCode(this.f39342gxszxtbevo);
    }
}
