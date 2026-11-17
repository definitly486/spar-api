package yl;

/* JADX INFO: loaded from: classes3.dex */
public class vdvldrhtss {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final vdvldrhtss f125805ppxfxbqfkf = new vdvldrhtss(false, false);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final vdvldrhtss f125806wkgbmnqykc = new vdvldrhtss(true, true);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f125807iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f125808zoijcleaow;

    public vdvldrhtss(boolean z13, boolean z14) {
        this.f125807iobyxmoadg = z13;
        this.f125808zoijcleaow = z14;
    }

    static String iobyxmoadg(String str) {
        return wl.gxszxtbevo.zoijcleaow(str);
    }

    public boolean eablkybsjg() {
        return this.f125808zoijcleaow;
    }

    public boolean gxszxtbevo() {
        return this.f125807iobyxmoadg;
    }

    xl.zoijcleaow ppxfxbqfkf(xl.zoijcleaow zoijcleaowVar) {
        if (zoijcleaowVar != null && !this.f125808zoijcleaow) {
            zoijcleaowVar.lereixgezr();
        }
        return zoijcleaowVar;
    }

    public String wkgbmnqykc(String str) {
        String strTrim = str.trim();
        return !this.f125807iobyxmoadg ? wl.gxszxtbevo.iobyxmoadg(strTrim) : strTrim;
    }

    public String zoijcleaow(String str) {
        String strTrim = str.trim();
        return !this.f125808zoijcleaow ? wl.gxszxtbevo.iobyxmoadg(strTrim) : strTrim;
    }

    vdvldrhtss(vdvldrhtss vdvldrhtssVar) {
        this(vdvldrhtssVar.f125807iobyxmoadg, vdvldrhtssVar.f125808zoijcleaow);
    }
}
