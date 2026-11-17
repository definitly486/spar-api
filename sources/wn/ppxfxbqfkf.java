package wn;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes3.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f120263iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f120264ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final tzroggbefp f120265zoijcleaow;

    public ppxfxbqfkf(int i13, tzroggbefp fieldValue, boolean z13) {
        zdlpuopuiu.btonecajqb(fieldValue, "fieldValue");
        this.f120263iobyxmoadg = i13;
        this.f120265zoijcleaow = fieldValue;
        this.f120264ppxfxbqfkf = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return this.f120263iobyxmoadg == ppxfxbqfkfVar.f120263iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f120265zoijcleaow, ppxfxbqfkfVar.f120265zoijcleaow) && this.f120264ppxfxbqfkf == ppxfxbqfkfVar.f120264ppxfxbqfkf;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f120263iobyxmoadg) * 31) + this.f120265zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f120264ppxfxbqfkf);
    }

    public final tzroggbefp iobyxmoadg() {
        return this.f120265zoijcleaow;
    }

    public final boolean ppxfxbqfkf() {
        return this.f120264ppxfxbqfkf;
    }

    public String toString() {
        return "ShopSearchInputUiModel(placeholderRes=" + this.f120263iobyxmoadg + ", fieldValue=" + this.f120265zoijcleaow + ", isEnabled=" + this.f120264ppxfxbqfkf + ")";
    }

    public final int zoijcleaow() {
        return this.f120263iobyxmoadg;
    }
}
