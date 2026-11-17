package ib1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc implements b21.ppxfxbqfkf {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f42340zdlpuopuiu;

    public wkgbmnqykc(String itemId) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        this.f42340zdlpuopuiu = itemId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f42340zdlpuopuiu, ((wkgbmnqykc) obj).f42340zdlpuopuiu);
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f42340zdlpuopuiu;
    }

    public int hashCode() {
        return this.f42340zdlpuopuiu.hashCode();
    }

    public String toString() {
        return "SubtitleItemUiModel(itemId=" + this.f42340zdlpuopuiu + ")";
    }
}
