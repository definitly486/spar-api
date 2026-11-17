package l92;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f61991iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final dxjokdxxww f61992zoijcleaow;

    public wkgbmnqykc(String title, dxjokdxxww questions) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(questions, "questions");
        this.f61991iobyxmoadg = title;
        this.f61992zoijcleaow = questions;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return zdlpuopuiu.eablkybsjg(this.f61991iobyxmoadg, wkgbmnqykcVar.f61991iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f61992zoijcleaow, wkgbmnqykcVar.f61992zoijcleaow);
    }

    public int hashCode() {
        return (this.f61991iobyxmoadg.hashCode() * 31) + this.f61992zoijcleaow.hashCode();
    }

    public final dxjokdxxww iobyxmoadg() {
        return this.f61992zoijcleaow;
    }

    public String toString() {
        return "FAQItemUiModel(title=" + this.f61991iobyxmoadg + ", questions=" + this.f61992zoijcleaow + ")";
    }

    public final String zoijcleaow() {
        return this.f61991iobyxmoadg;
    }
}
