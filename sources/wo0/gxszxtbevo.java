package wo0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class gxszxtbevo implements gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f120311iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f120312ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f120313zoijcleaow;

    public gxszxtbevo(String title, boolean z13, boolean z14) {
        zdlpuopuiu.btonecajqb(title, "title");
        this.f120311iobyxmoadg = title;
        this.f120313zoijcleaow = z13;
        this.f120312ppxfxbqfkf = z14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return zdlpuopuiu.eablkybsjg(this.f120311iobyxmoadg, gxszxtbevoVar.f120311iobyxmoadg) && this.f120313zoijcleaow == gxszxtbevoVar.f120313zoijcleaow && this.f120312ppxfxbqfkf == gxszxtbevoVar.f120312ppxfxbqfkf;
    }

    @Override // wo0.gtknphoqwx
    public Object getId() {
        return this.f120311iobyxmoadg;
    }

    @Override // wo0.gtknphoqwx
    public draadjrbmk getType() {
        return draadjrbmk.PRODUCT_TITLE;
    }

    public int hashCode() {
        return (((this.f120311iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f120313zoijcleaow)) * 31) + Boolean.hashCode(this.f120312ppxfxbqfkf);
    }

    public final String iobyxmoadg() {
        return this.f120311iobyxmoadg;
    }

    public final boolean ppxfxbqfkf() {
        return this.f120312ppxfxbqfkf;
    }

    public String toString() {
        return "CartProductTitleUiModel(title=" + this.f120311iobyxmoadg + ", isFirst=" + this.f120313zoijcleaow + ", isLast=" + this.f120312ppxfxbqfkf + ")";
    }

    public final boolean zoijcleaow() {
        return this.f120313zoijcleaow;
    }
}
