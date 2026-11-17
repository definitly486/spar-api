package kq;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class eablkybsjg implements btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f60351iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f60352ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f60353zoijcleaow;

    public eablkybsjg(String title, boolean z13, boolean z14) {
        zdlpuopuiu.btonecajqb(title, "title");
        this.f60351iobyxmoadg = title;
        this.f60353zoijcleaow = z13;
        this.f60352ppxfxbqfkf = z14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eablkybsjg)) {
            return false;
        }
        eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
        return zdlpuopuiu.eablkybsjg(this.f60351iobyxmoadg, eablkybsjgVar.f60351iobyxmoadg) && this.f60353zoijcleaow == eablkybsjgVar.f60353zoijcleaow && this.f60352ppxfxbqfkf == eablkybsjgVar.f60352ppxfxbqfkf;
    }

    @Override // kq.btonecajqb
    public Object getId() {
        return this.f60351iobyxmoadg;
    }

    @Override // kq.btonecajqb
    public gtknphoqwx getType() {
        return gtknphoqwx.PRODUCT_TITLE;
    }

    public int hashCode() {
        return (((this.f60351iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f60353zoijcleaow)) * 31) + Boolean.hashCode(this.f60352ppxfxbqfkf);
    }

    public final String iobyxmoadg() {
        return this.f60351iobyxmoadg;
    }

    public final boolean ppxfxbqfkf() {
        return this.f60352ppxfxbqfkf;
    }

    public String toString() {
        return "CartProductTitleUiModel(title=" + this.f60351iobyxmoadg + ", isFirst=" + this.f60353zoijcleaow + ", isLast=" + this.f60352ppxfxbqfkf + ")";
    }

    public final boolean zoijcleaow() {
        return this.f60353zoijcleaow;
    }
}
