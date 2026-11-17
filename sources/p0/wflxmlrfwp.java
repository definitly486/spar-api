package p0;

import j0.l;
import j0.m;

/* JADX INFO: loaded from: classes.dex */
public final class wflxmlrfwp {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final iobyxmoadg f75315gxszxtbevo = new iobyxmoadg(null);

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final int f75316lqeggnwhkg = 8;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f75317eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final pkzmftpjix f75318iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f75319ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f75320wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f75321zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ wflxmlrfwp(j0.eablkybsjg eablkybsjgVar, long j13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(eablkybsjgVar, j13);
    }

    private final void oxmwwwfdhm(int i13) {
        if (!(i13 >= 0)) {
            q0.iobyxmoadg.iobyxmoadg("Cannot set selectionStart to a negative value: " + i13);
        }
        this.f75321zoijcleaow = i13;
    }

    private final void vdvldrhtss(int i13) {
        if (!(i13 >= 0)) {
            q0.iobyxmoadg.iobyxmoadg("Cannot set selectionEnd to a negative value: " + i13);
        }
        this.f75319ppxfxbqfkf = i13;
    }

    public final void agtfadlqog(int i13, int i14) {
        if (i13 < 0 || i13 > this.f75318iobyxmoadg.zoijcleaow()) {
            throw new IndexOutOfBoundsException("start (" + i13 + ") offset is outside of text region " + this.f75318iobyxmoadg.zoijcleaow());
        }
        if (i14 < 0 || i14 > this.f75318iobyxmoadg.zoijcleaow()) {
            throw new IndexOutOfBoundsException("end (" + i14 + ") offset is outside of text region " + this.f75318iobyxmoadg.zoijcleaow());
        }
        if (i13 < i14) {
            this.f75320wkgbmnqykc = i13;
            this.f75317eablkybsjg = i14;
            return;
        }
        throw new IllegalArgumentException("Do not set reversed or empty range: " + i13 + " > " + i14);
    }

    public final int btonecajqb() {
        return this.f75319ppxfxbqfkf;
    }

    public final boolean draadjrbmk() {
        return this.f75320wkgbmnqykc != -1;
    }

    public final long dxjokdxxww() {
        return m.zoijcleaow(this.f75321zoijcleaow, this.f75319ppxfxbqfkf);
    }

    public final int eablkybsjg() {
        return this.f75317eablkybsjg;
    }

    public final int gtknphoqwx() {
        return this.f75321zoijcleaow;
    }

    public final int gxszxtbevo() {
        return this.f75320wkgbmnqykc;
    }

    public final void iobyxmoadg() {
        this.f75320wkgbmnqykc = -1;
        this.f75317eablkybsjg = -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final j0.eablkybsjg kcexrzcfyt() {
        return new j0.eablkybsjg(toString(), null, 2, 0 == true ? 1 : 0);
    }

    public final int lqeggnwhkg() {
        int i13 = this.f75321zoijcleaow;
        int i14 = this.f75319ppxfxbqfkf;
        if (i13 == i14) {
            return i14;
        }
        return -1;
    }

    public final int nufgyqmvbu() {
        return this.f75318iobyxmoadg.zoijcleaow();
    }

    public final void ojitshcjhn(int i13) {
        rgvfuqvkyq(i13, i13);
    }

    public final char ppxfxbqfkf(int i13) {
        return this.f75318iobyxmoadg.iobyxmoadg(i13);
    }

    public final void rgvfuqvkyq(int i13, int i14) {
        if (i13 < 0 || i13 > this.f75318iobyxmoadg.zoijcleaow()) {
            throw new IndexOutOfBoundsException("start (" + i13 + ") offset is outside of text region " + this.f75318iobyxmoadg.zoijcleaow());
        }
        if (i14 < 0 || i14 > this.f75318iobyxmoadg.zoijcleaow()) {
            throw new IndexOutOfBoundsException("end (" + i14 + ") offset is outside of text region " + this.f75318iobyxmoadg.zoijcleaow());
        }
        if (i13 <= i14) {
            oxmwwwfdhm(i13);
            vdvldrhtss(i14);
            return;
        }
        throw new IllegalArgumentException("Do not set reversed range: " + i13 + " > " + i14);
    }

    public String toString() {
        return this.f75318iobyxmoadg.toString();
    }

    public final void wflxmlrfwp(int i13, int i14, String str) {
        if (i13 < 0 || i13 > this.f75318iobyxmoadg.zoijcleaow()) {
            throw new IndexOutOfBoundsException("start (" + i13 + ") offset is outside of text region " + this.f75318iobyxmoadg.zoijcleaow());
        }
        if (i14 < 0 || i14 > this.f75318iobyxmoadg.zoijcleaow()) {
            throw new IndexOutOfBoundsException("end (" + i14 + ") offset is outside of text region " + this.f75318iobyxmoadg.zoijcleaow());
        }
        if (i13 <= i14) {
            this.f75318iobyxmoadg.ppxfxbqfkf(i13, i14, str);
            oxmwwwfdhm(str.length() + i13);
            vdvldrhtss(i13 + str.length());
            this.f75320wkgbmnqykc = -1;
            this.f75317eablkybsjg = -1;
            return;
        }
        throw new IllegalArgumentException("Do not set reversed range: " + i13 + " > " + i14);
    }

    public final l wkgbmnqykc() {
        if (draadjrbmk()) {
            return l.zoijcleaow(m.zoijcleaow(this.f75320wkgbmnqykc, this.f75317eablkybsjg));
        }
        return null;
    }

    public final void zoijcleaow(int i13, int i14) {
        long jZoijcleaow = m.zoijcleaow(i13, i14);
        this.f75318iobyxmoadg.ppxfxbqfkf(i13, i14, "");
        long jIobyxmoadg = agtfadlqog.iobyxmoadg(m.zoijcleaow(this.f75321zoijcleaow, this.f75319ppxfxbqfkf), jZoijcleaow);
        oxmwwwfdhm(l.draadjrbmk(jIobyxmoadg));
        vdvldrhtss(l.gtknphoqwx(jIobyxmoadg));
        if (draadjrbmk()) {
            long jIobyxmoadg2 = agtfadlqog.iobyxmoadg(m.zoijcleaow(this.f75320wkgbmnqykc, this.f75317eablkybsjg), jZoijcleaow);
            if (l.nufgyqmvbu(jIobyxmoadg2)) {
                iobyxmoadg();
            } else {
                this.f75320wkgbmnqykc = l.draadjrbmk(jIobyxmoadg2);
                this.f75317eablkybsjg = l.gtknphoqwx(jIobyxmoadg2);
            }
        }
    }

    private wflxmlrfwp(j0.eablkybsjg eablkybsjgVar, long j13) {
        this.f75318iobyxmoadg = new pkzmftpjix(eablkybsjgVar.btonecajqb());
        this.f75321zoijcleaow = l.draadjrbmk(j13);
        this.f75319ppxfxbqfkf = l.gtknphoqwx(j13);
        this.f75320wkgbmnqykc = -1;
        this.f75317eablkybsjg = -1;
        int iDraadjrbmk = l.draadjrbmk(j13);
        int iGtknphoqwx = l.gtknphoqwx(j13);
        if (iDraadjrbmk < 0 || iDraadjrbmk > eablkybsjgVar.length()) {
            throw new IndexOutOfBoundsException("start (" + iDraadjrbmk + ") offset is outside of text region " + eablkybsjgVar.length());
        }
        if (iGtknphoqwx < 0 || iGtknphoqwx > eablkybsjgVar.length()) {
            throw new IndexOutOfBoundsException("end (" + iGtknphoqwx + ") offset is outside of text region " + eablkybsjgVar.length());
        }
        if (iDraadjrbmk <= iGtknphoqwx) {
            return;
        }
        throw new IllegalArgumentException("Do not set reversed range: " + iDraadjrbmk + " > " + iGtknphoqwx);
    }
}
