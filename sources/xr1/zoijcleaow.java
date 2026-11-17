package xr1;

import b21.ppxfxbqfkf;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements ppxfxbqfkf {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final String f123144cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final String f123145esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final String f123146iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f123147jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final String f123148lereixgezr;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f123149yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f123150zdlpuopuiu;

    public zoijcleaow(String itemId, String documentIcon, String documentName, String documentUrl, String documentType, String documentSize, String documentTypeAndSize) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(documentIcon, "documentIcon");
        zdlpuopuiu.btonecajqb(documentName, "documentName");
        zdlpuopuiu.btonecajqb(documentUrl, "documentUrl");
        zdlpuopuiu.btonecajqb(documentType, "documentType");
        zdlpuopuiu.btonecajqb(documentSize, "documentSize");
        zdlpuopuiu.btonecajqb(documentTypeAndSize, "documentTypeAndSize");
        this.f123150zdlpuopuiu = itemId;
        this.f123149yggfygwlhe = documentIcon;
        this.f123147jyumaefscl = documentName;
        this.f123146iwizpuwonk = documentUrl;
        this.f123144cqumvgiudr = documentType;
        this.f123145esjtqupxsv = documentSize;
        this.f123148lereixgezr = documentTypeAndSize;
    }

    public final String eablkybsjg() {
        return this.f123148lereixgezr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f123150zdlpuopuiu, zoijcleaowVar.f123150zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f123149yggfygwlhe, zoijcleaowVar.f123149yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f123147jyumaefscl, zoijcleaowVar.f123147jyumaefscl) && zdlpuopuiu.eablkybsjg(this.f123146iwizpuwonk, zoijcleaowVar.f123146iwizpuwonk) && zdlpuopuiu.eablkybsjg(this.f123144cqumvgiudr, zoijcleaowVar.f123144cqumvgiudr) && zdlpuopuiu.eablkybsjg(this.f123145esjtqupxsv, zoijcleaowVar.f123145esjtqupxsv) && zdlpuopuiu.eablkybsjg(this.f123148lereixgezr, zoijcleaowVar.f123148lereixgezr);
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f123150zdlpuopuiu;
    }

    public int hashCode() {
        return (((((((((((this.f123150zdlpuopuiu.hashCode() * 31) + this.f123149yggfygwlhe.hashCode()) * 31) + this.f123147jyumaefscl.hashCode()) * 31) + this.f123146iwizpuwonk.hashCode()) * 31) + this.f123144cqumvgiudr.hashCode()) * 31) + this.f123145esjtqupxsv.hashCode()) * 31) + this.f123148lereixgezr.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f123149yggfygwlhe;
    }

    public final String lqeggnwhkg() {
        return this.f123146iwizpuwonk;
    }

    public String toString() {
        return "DocumentUiModel(itemId=" + this.f123150zdlpuopuiu + ", documentIcon=" + this.f123149yggfygwlhe + ", documentName=" + this.f123147jyumaefscl + ", documentUrl=" + this.f123146iwizpuwonk + ", documentType=" + this.f123144cqumvgiudr + ", documentSize=" + this.f123145esjtqupxsv + ", documentTypeAndSize=" + this.f123148lereixgezr + ")";
    }

    public final String wkgbmnqykc() {
        return this.f123147jyumaefscl;
    }
}
