package e62;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements o00.iobyxmoadg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final List f30624yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f30625zdlpuopuiu;

    public iobyxmoadg(String itemId, List documents) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(documents, "documents");
        this.f30625zdlpuopuiu = itemId;
        this.f30624yggfygwlhe = documents;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f30625zdlpuopuiu, iobyxmoadgVar.f30625zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f30624yggfygwlhe, iobyxmoadgVar.f30624yggfygwlhe);
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f30625zdlpuopuiu;
    }

    public int hashCode() {
        return (this.f30625zdlpuopuiu.hashCode() * 31) + this.f30624yggfygwlhe.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f30624yggfygwlhe;
    }

    public String toString() {
        return "DocumentSpecialBannerUiModel(itemId=" + this.f30625zdlpuopuiu + ", documents=" + this.f30624yggfygwlhe + ")";
    }
}
