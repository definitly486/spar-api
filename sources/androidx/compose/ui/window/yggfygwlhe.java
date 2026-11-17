package androidx.compose.ui.window;

/* JADX INFO: loaded from: classes.dex */
public final class yggfygwlhe {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f7443eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f7444gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f7445iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f7446ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f7447wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f7448zoijcleaow;

    public yggfygwlhe(int i13, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        this.f7445iobyxmoadg = i13;
        this.f7448zoijcleaow = z13;
        this.f7446ppxfxbqfkf = z14;
        this.f7447wkgbmnqykc = z15;
        this.f7443eablkybsjg = z16;
        this.f7444gxszxtbevo = z17;
    }

    public final boolean eablkybsjg() {
        return this.f7448zoijcleaow;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yggfygwlhe)) {
            return false;
        }
        yggfygwlhe yggfygwlheVar = (yggfygwlhe) obj;
        return this.f7445iobyxmoadg == yggfygwlheVar.f7445iobyxmoadg && this.f7448zoijcleaow == yggfygwlheVar.f7448zoijcleaow && this.f7446ppxfxbqfkf == yggfygwlheVar.f7446ppxfxbqfkf && this.f7447wkgbmnqykc == yggfygwlheVar.f7447wkgbmnqykc && this.f7443eablkybsjg == yggfygwlheVar.f7443eablkybsjg && this.f7444gxszxtbevo == yggfygwlheVar.f7444gxszxtbevo;
    }

    public final boolean gxszxtbevo() {
        return this.f7444gxszxtbevo;
    }

    public int hashCode() {
        return (((((((((this.f7445iobyxmoadg * 31) + Boolean.hashCode(this.f7448zoijcleaow)) * 31) + Boolean.hashCode(this.f7446ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f7447wkgbmnqykc)) * 31) + Boolean.hashCode(this.f7443eablkybsjg)) * 31) + Boolean.hashCode(this.f7444gxszxtbevo);
    }

    public final boolean iobyxmoadg() {
        return this.f7446ppxfxbqfkf;
    }

    public final boolean ppxfxbqfkf() {
        return this.f7443eablkybsjg;
    }

    public final int wkgbmnqykc() {
        return this.f7445iobyxmoadg;
    }

    public final boolean zoijcleaow() {
        return this.f7447wkgbmnqykc;
    }

    public /* synthetic */ yggfygwlhe(boolean z13, boolean z14, boolean z15, boolean z16, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? false : z13, (i13 & 2) != 0 ? true : z14, (i13 & 4) != 0 ? true : z15, (i13 & 8) != 0 ? true : z16);
    }

    public yggfygwlhe(boolean z13, boolean z14, boolean z15, boolean z16) {
        this(z13, z14, z15, jyumaefscl.Inherit, true, z16);
    }

    public /* synthetic */ yggfygwlhe(boolean z13, boolean z14, boolean z15, jyumaefscl jyumaefsclVar, boolean z16, boolean z17, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? false : z13, (i13 & 2) != 0 ? true : z14, (i13 & 4) != 0 ? true : z15, (i13 & 8) != 0 ? jyumaefscl.Inherit : jyumaefsclVar, (i13 & 16) != 0 ? true : z16, (i13 & 32) == 0 ? z17 : true);
    }

    public yggfygwlhe(boolean z13, boolean z14, boolean z15, jyumaefscl jyumaefsclVar, boolean z16, boolean z17) {
        this(z13, z14, z15, jyumaefsclVar, z16, z17, false);
    }

    public yggfygwlhe(boolean z13, boolean z14, boolean z15, jyumaefscl jyumaefsclVar, boolean z16, boolean z17, boolean z18) {
        this(ppxfxbqfkf.nufgyqmvbu(z13, jyumaefsclVar, z17), jyumaefsclVar == jyumaefscl.Inherit, z14, z15, z16, z18);
    }
}
