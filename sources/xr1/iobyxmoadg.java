package xr1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements gz0.iobyxmoadg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final List f123142yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f123143zdlpuopuiu;

    public iobyxmoadg(String itemId, List documents) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(documents, "documents");
        this.f123143zdlpuopuiu = itemId;
        this.f123142yggfygwlhe = documents;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f123143zdlpuopuiu, iobyxmoadgVar.f123143zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f123142yggfygwlhe, iobyxmoadgVar.f123142yggfygwlhe);
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f123143zdlpuopuiu;
    }

    public int hashCode() {
        return (this.f123143zdlpuopuiu.hashCode() * 31) + this.f123142yggfygwlhe.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f123142yggfygwlhe;
    }

    public String toString() {
        return "DocumentSpecialBannerUiModel(itemId=" + this.f123143zdlpuopuiu + ", documents=" + this.f123142yggfygwlhe + ")";
    }
}
