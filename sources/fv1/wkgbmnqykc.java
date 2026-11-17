package fv1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f35195iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final dxjokdxxww f35196zoijcleaow;

    public wkgbmnqykc(String title, dxjokdxxww questions) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(questions, "questions");
        this.f35195iobyxmoadg = title;
        this.f35196zoijcleaow = questions;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return zdlpuopuiu.eablkybsjg(this.f35195iobyxmoadg, wkgbmnqykcVar.f35195iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f35196zoijcleaow, wkgbmnqykcVar.f35196zoijcleaow);
    }

    public int hashCode() {
        return (this.f35195iobyxmoadg.hashCode() * 31) + this.f35196zoijcleaow.hashCode();
    }

    public final dxjokdxxww iobyxmoadg() {
        return this.f35196zoijcleaow;
    }

    public String toString() {
        return "FAQItemUiModel(title=" + this.f35195iobyxmoadg + ", questions=" + this.f35196zoijcleaow + ")";
    }

    public final String zoijcleaow() {
        return this.f35195iobyxmoadg;
    }
}
