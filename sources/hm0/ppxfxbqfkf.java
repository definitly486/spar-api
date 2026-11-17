package hm0;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f40809iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f40810ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final tzroggbefp f40811zoijcleaow;

    public ppxfxbqfkf(int i13, tzroggbefp fieldValue, boolean z13) {
        zdlpuopuiu.btonecajqb(fieldValue, "fieldValue");
        this.f40809iobyxmoadg = i13;
        this.f40811zoijcleaow = fieldValue;
        this.f40810ppxfxbqfkf = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return this.f40809iobyxmoadg == ppxfxbqfkfVar.f40809iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f40811zoijcleaow, ppxfxbqfkfVar.f40811zoijcleaow) && this.f40810ppxfxbqfkf == ppxfxbqfkfVar.f40810ppxfxbqfkf;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f40809iobyxmoadg) * 31) + this.f40811zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f40810ppxfxbqfkf);
    }

    public final tzroggbefp iobyxmoadg() {
        return this.f40811zoijcleaow;
    }

    public final boolean ppxfxbqfkf() {
        return this.f40810ppxfxbqfkf;
    }

    public String toString() {
        return "ShopSearchInputUiModel(placeholderRes=" + this.f40809iobyxmoadg + ", fieldValue=" + this.f40811zoijcleaow + ", isEnabled=" + this.f40810ppxfxbqfkf + ")";
    }

    public final int zoijcleaow() {
        return this.f40809iobyxmoadg;
    }
}
