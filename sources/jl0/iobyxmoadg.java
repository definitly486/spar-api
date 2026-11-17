package jl0;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f51687iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f51688ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final tzroggbefp f51689zoijcleaow;

    public iobyxmoadg(int i13, tzroggbefp fieldValue, boolean z13) {
        zdlpuopuiu.btonecajqb(fieldValue, "fieldValue");
        this.f51687iobyxmoadg = i13;
        this.f51689zoijcleaow = fieldValue;
        this.f51688ppxfxbqfkf = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return this.f51687iobyxmoadg == iobyxmoadgVar.f51687iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f51689zoijcleaow, iobyxmoadgVar.f51689zoijcleaow) && this.f51688ppxfxbqfkf == iobyxmoadgVar.f51688ppxfxbqfkf;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f51687iobyxmoadg) * 31) + this.f51689zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f51688ppxfxbqfkf);
    }

    public final tzroggbefp iobyxmoadg() {
        return this.f51689zoijcleaow;
    }

    public final boolean ppxfxbqfkf() {
        return this.f51688ppxfxbqfkf;
    }

    public String toString() {
        return "AddressSearchInputUiModel(placeholderRes=" + this.f51687iobyxmoadg + ", fieldValue=" + this.f51689zoijcleaow + ", isEnabled=" + this.f51688ppxfxbqfkf + ")";
    }

    public final int zoijcleaow() {
        return this.f51687iobyxmoadg;
    }
}
