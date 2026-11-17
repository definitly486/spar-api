package ym;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f125922iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f125923ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final tzroggbefp f125924zoijcleaow;

    public iobyxmoadg(int i13, tzroggbefp fieldValue, boolean z13) {
        zdlpuopuiu.btonecajqb(fieldValue, "fieldValue");
        this.f125922iobyxmoadg = i13;
        this.f125924zoijcleaow = fieldValue;
        this.f125923ppxfxbqfkf = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return this.f125922iobyxmoadg == iobyxmoadgVar.f125922iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f125924zoijcleaow, iobyxmoadgVar.f125924zoijcleaow) && this.f125923ppxfxbqfkf == iobyxmoadgVar.f125923ppxfxbqfkf;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f125922iobyxmoadg) * 31) + this.f125924zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f125923ppxfxbqfkf);
    }

    public final tzroggbefp iobyxmoadg() {
        return this.f125924zoijcleaow;
    }

    public final boolean ppxfxbqfkf() {
        return this.f125923ppxfxbqfkf;
    }

    public String toString() {
        return "AddressSearchInputUiModel(placeholderRes=" + this.f125922iobyxmoadg + ", fieldValue=" + this.f125924zoijcleaow + ", isEnabled=" + this.f125923ppxfxbqfkf + ")";
    }

    public final int zoijcleaow() {
        return this.f125922iobyxmoadg;
    }
}
