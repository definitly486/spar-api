package fv1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f35189iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f35190ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f35191zoijcleaow;

    public iobyxmoadg(String title, String icon, int i13) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(icon, "icon");
        this.f35189iobyxmoadg = title;
        this.f35191zoijcleaow = icon;
        this.f35190ppxfxbqfkf = i13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f35189iobyxmoadg, iobyxmoadgVar.f35189iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f35191zoijcleaow, iobyxmoadgVar.f35191zoijcleaow) && this.f35190ppxfxbqfkf == iobyxmoadgVar.f35190ppxfxbqfkf;
    }

    public int hashCode() {
        return (((this.f35189iobyxmoadg.hashCode() * 31) + this.f35191zoijcleaow.hashCode()) * 31) + Integer.hashCode(this.f35190ppxfxbqfkf);
    }

    public final int iobyxmoadg() {
        return this.f35190ppxfxbqfkf;
    }

    public final String ppxfxbqfkf() {
        return this.f35189iobyxmoadg;
    }

    public String toString() {
        return "ActionButtonUiModel(title=" + this.f35189iobyxmoadg + ", icon=" + this.f35191zoijcleaow + ", badgeCount=" + this.f35190ppxfxbqfkf + ")";
    }

    public final String zoijcleaow() {
        return this.f35191zoijcleaow;
    }
}
