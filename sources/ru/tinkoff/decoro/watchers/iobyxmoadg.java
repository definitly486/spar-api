package ru.tinkoff.decoro.watchers;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f104862eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private boolean f104863gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private int f104864iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f104865ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f104866wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f104867zoijcleaow;

    public void btonecajqb(int i13) {
        this.f104865ppxfxbqfkf -= this.f104867zoijcleaow;
        this.f104864iobyxmoadg += i13;
        this.f104866wkgbmnqykc &= -2;
    }

    public boolean dxjokdxxww() {
        return this.f104863gxszxtbevo;
    }

    public int eablkybsjg() {
        return this.f104865ppxfxbqfkf;
    }

    public void gtknphoqwx(int i13) {
        this.f104862eablkybsjg = i13;
    }

    public int gxszxtbevo() {
        return this.f104864iobyxmoadg;
    }

    public void iobyxmoadg(int i13, int i14, int i15) {
        int i16;
        this.f104864iobyxmoadg = i13;
        boolean z13 = false;
        this.f104865ppxfxbqfkf = 0;
        this.f104866wkgbmnqykc = 0;
        this.f104867zoijcleaow = 0;
        this.f104862eablkybsjg = -1;
        if (i15 > 0) {
            this.f104866wkgbmnqykc = 1;
            this.f104867zoijcleaow = i15;
        }
        if (i14 > 0) {
            this.f104866wkgbmnqykc |= 2;
            this.f104865ppxfxbqfkf = i14;
        }
        int i17 = this.f104867zoijcleaow;
        if (i17 > 0 && (i16 = this.f104865ppxfxbqfkf) > 0 && i17 < i16) {
            z13 = true;
        }
        this.f104863gxszxtbevo = z13;
    }

    public boolean lqeggnwhkg() {
        return (this.f104866wkgbmnqykc & 1) == 1;
    }

    public boolean nufgyqmvbu() {
        return (this.f104866wkgbmnqykc & 2) == 2;
    }

    public int ppxfxbqfkf() {
        return this.f104864iobyxmoadg + this.f104867zoijcleaow;
    }

    public String toString() {
        String str;
        int i13 = this.f104866wkgbmnqykc;
        if ((i13 & 3) == 3) {
            str = "both";
        } else if ((i13 & 1) == 1) {
            str = "insert";
        } else if ((i13 & 2) == 2) {
            str = "remove";
        } else {
            str = i13 == 0 ? DevicePublicKeyStringDef.NONE : null;
        }
        if (str != null) {
            return String.format(Locale.getDefault(), "[ DiffMeasures type=%s, diffStartPosition=%d, diffInsertLength=%d, diffRemoveLength=%d, cursor: %d ]", str, Integer.valueOf(this.f104864iobyxmoadg), Integer.valueOf(this.f104867zoijcleaow), Integer.valueOf(this.f104865ppxfxbqfkf), Integer.valueOf(this.f104862eablkybsjg));
        }
        throw new IllegalStateException("unknown behaviour for diffType " + this.f104866wkgbmnqykc);
    }

    public int wkgbmnqykc() {
        return (this.f104864iobyxmoadg + this.f104865ppxfxbqfkf) - 1;
    }

    public int zoijcleaow() {
        return this.f104862eablkybsjg;
    }
}
