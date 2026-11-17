package dq0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc implements jt0.ppxfxbqfkf {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f29327yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final List f29328zdlpuopuiu;

    public wkgbmnqykc(List features) {
        zdlpuopuiu.btonecajqb(features, "features");
        this.f29328zdlpuopuiu = features;
        String name = wkgbmnqykc.class.getName();
        zdlpuopuiu.dxjokdxxww(name, "getName(...)");
        this.f29327yggfygwlhe = name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f29328zdlpuopuiu, ((wkgbmnqykc) obj).f29328zdlpuopuiu);
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f29327yggfygwlhe;
    }

    public int hashCode() {
        return this.f29328zdlpuopuiu.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f29328zdlpuopuiu;
    }

    public String toString() {
        return "Features(features=" + this.f29328zdlpuopuiu + ")";
    }
}
