package ld0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc implements w30.ppxfxbqfkf {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f62143zdlpuopuiu;

    public wkgbmnqykc(String itemId) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        this.f62143zdlpuopuiu = itemId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f62143zdlpuopuiu, ((wkgbmnqykc) obj).f62143zdlpuopuiu);
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f62143zdlpuopuiu;
    }

    public int hashCode() {
        return this.f62143zdlpuopuiu.hashCode();
    }

    public String toString() {
        return "SubtitleItemUiModel(itemId=" + this.f62143zdlpuopuiu + ")";
    }
}
