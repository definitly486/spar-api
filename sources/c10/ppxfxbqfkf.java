package c10;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f18469iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f18470ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f18471zoijcleaow;

    public ppxfxbqfkf(String code, String title, boolean z13) {
        zdlpuopuiu.btonecajqb(code, "code");
        zdlpuopuiu.btonecajqb(title, "title");
        this.f18469iobyxmoadg = code;
        this.f18471zoijcleaow = title;
        this.f18470ppxfxbqfkf = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f18469iobyxmoadg, ppxfxbqfkfVar.f18469iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f18471zoijcleaow, ppxfxbqfkfVar.f18471zoijcleaow) && this.f18470ppxfxbqfkf == ppxfxbqfkfVar.f18470ppxfxbqfkf;
    }

    public int hashCode() {
        return (((this.f18469iobyxmoadg.hashCode() * 31) + this.f18471zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f18470ppxfxbqfkf);
    }

    public final String iobyxmoadg() {
        return this.f18469iobyxmoadg;
    }

    public final boolean ppxfxbqfkf() {
        return this.f18470ppxfxbqfkf;
    }

    public String toString() {
        return "OrderReason(code=" + this.f18469iobyxmoadg + ", title=" + this.f18471zoijcleaow + ", isOwn=" + this.f18470ppxfxbqfkf + ")";
    }

    public final String zoijcleaow() {
        return this.f18471zoijcleaow;
    }
}
