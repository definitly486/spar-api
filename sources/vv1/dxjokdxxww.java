package vv1;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes6.dex */
public final class dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final tzroggbefp f118101iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final eablkybsjg f118102ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f118103zoijcleaow;

    public dxjokdxxww(tzroggbefp field, boolean z13, eablkybsjg eablkybsjgVar) {
        zdlpuopuiu.btonecajqb(field, "field");
        this.f118101iobyxmoadg = field;
        this.f118103zoijcleaow = z13;
        this.f118102ppxfxbqfkf = eablkybsjgVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxjokdxxww)) {
            return false;
        }
        dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
        return zdlpuopuiu.eablkybsjg(this.f118101iobyxmoadg, dxjokdxxwwVar.f118101iobyxmoadg) && this.f118103zoijcleaow == dxjokdxxwwVar.f118103zoijcleaow && zdlpuopuiu.eablkybsjg(this.f118102ppxfxbqfkf, dxjokdxxwwVar.f118102ppxfxbqfkf);
    }

    public int hashCode() {
        int iHashCode = ((this.f118101iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f118103zoijcleaow)) * 31;
        eablkybsjg eablkybsjgVar = this.f118102ppxfxbqfkf;
        return iHashCode + (eablkybsjgVar == null ? 0 : eablkybsjgVar.hashCode());
    }

    public final boolean iobyxmoadg() {
        return this.f118103zoijcleaow;
    }

    public final tzroggbefp ppxfxbqfkf() {
        return this.f118101iobyxmoadg;
    }

    public String toString() {
        return "TipsInputUiModel(field=" + this.f118101iobyxmoadg + ", clearButtonIsEnabled=" + this.f118103zoijcleaow + ", error=" + this.f118102ppxfxbqfkf + ")";
    }

    public final eablkybsjg zoijcleaow() {
        return this.f118102ppxfxbqfkf;
    }
}
