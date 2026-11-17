package androidx.compose.ui.window;

/* JADX INFO: loaded from: classes.dex */
public final class draadjrbmk {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f7359eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final String f7360gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f7361iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final jyumaefscl f7362ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f7363wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f7364zoijcleaow;

    public draadjrbmk(boolean z13, boolean z14, jyumaefscl jyumaefsclVar, boolean z15, boolean z16, String str) {
        this.f7361iobyxmoadg = z13;
        this.f7364zoijcleaow = z14;
        this.f7362ppxfxbqfkf = jyumaefsclVar;
        this.f7363wkgbmnqykc = z15;
        this.f7359eablkybsjg = z16;
        this.f7360gxszxtbevo = str;
    }

    public final boolean eablkybsjg() {
        return this.f7363wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof draadjrbmk)) {
            return false;
        }
        draadjrbmk draadjrbmkVar = (draadjrbmk) obj;
        return this.f7361iobyxmoadg == draadjrbmkVar.f7361iobyxmoadg && this.f7364zoijcleaow == draadjrbmkVar.f7364zoijcleaow && this.f7362ppxfxbqfkf == draadjrbmkVar.f7362ppxfxbqfkf && this.f7363wkgbmnqykc == draadjrbmkVar.f7363wkgbmnqykc && this.f7359eablkybsjg == draadjrbmkVar.f7359eablkybsjg;
    }

    public final String gxszxtbevo() {
        return this.f7360gxszxtbevo;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.f7361iobyxmoadg) * 31) + Boolean.hashCode(this.f7364zoijcleaow)) * 31) + this.f7362ppxfxbqfkf.hashCode()) * 31) + Boolean.hashCode(this.f7363wkgbmnqykc)) * 31) + Boolean.hashCode(this.f7359eablkybsjg);
    }

    public final boolean iobyxmoadg() {
        return this.f7359eablkybsjg;
    }

    public final boolean ppxfxbqfkf() {
        return this.f7364zoijcleaow;
    }

    public final jyumaefscl wkgbmnqykc() {
        return this.f7362ppxfxbqfkf;
    }

    public final boolean zoijcleaow() {
        return this.f7361iobyxmoadg;
    }

    public /* synthetic */ draadjrbmk(boolean z13, boolean z14, jyumaefscl jyumaefsclVar, boolean z15, boolean z16, String str, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? true : z13, (i13 & 2) != 0 ? true : z14, (i13 & 4) != 0 ? jyumaefscl.Inherit : jyumaefsclVar, (i13 & 8) != 0 ? true : z15, (i13 & 16) == 0 ? z16 : true, (i13 & 32) != 0 ? "" : str);
    }

    public /* synthetic */ draadjrbmk(boolean z13, boolean z14, boolean z15, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? true : z13, (i13 & 2) != 0 ? true : z14, (i13 & 4) != 0 ? true : z15);
    }

    public draadjrbmk(boolean z13, boolean z14, boolean z15) {
        this(z13, z14, jyumaefscl.Inherit, z15, true, null, 32, null);
    }
}
