package pr;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc implements pu.ppxfxbqfkf {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f77173yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final List f77174zdlpuopuiu;

    public wkgbmnqykc(List features) {
        zdlpuopuiu.btonecajqb(features, "features");
        this.f77174zdlpuopuiu = features;
        String name = wkgbmnqykc.class.getName();
        zdlpuopuiu.dxjokdxxww(name, "getName(...)");
        this.f77173yggfygwlhe = name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f77174zdlpuopuiu, ((wkgbmnqykc) obj).f77174zdlpuopuiu);
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f77173yggfygwlhe;
    }

    public int hashCode() {
        return this.f77174zdlpuopuiu.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f77174zdlpuopuiu;
    }

    public String toString() {
        return "Features(features=" + this.f77174zdlpuopuiu + ")";
    }
}
