package e62;

import kotlin.jvm.internal.zdlpuopuiu;
import w30.ppxfxbqfkf;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements ppxfxbqfkf {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final String f30626cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final String f30627esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final String f30628iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f30629jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final String f30630lereixgezr;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f30631yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f30632zdlpuopuiu;

    public zoijcleaow(String itemId, String documentIcon, String documentName, String documentUrl, String documentType, String documentSize, String documentTypeAndSize) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(documentIcon, "documentIcon");
        zdlpuopuiu.btonecajqb(documentName, "documentName");
        zdlpuopuiu.btonecajqb(documentUrl, "documentUrl");
        zdlpuopuiu.btonecajqb(documentType, "documentType");
        zdlpuopuiu.btonecajqb(documentSize, "documentSize");
        zdlpuopuiu.btonecajqb(documentTypeAndSize, "documentTypeAndSize");
        this.f30632zdlpuopuiu = itemId;
        this.f30631yggfygwlhe = documentIcon;
        this.f30629jyumaefscl = documentName;
        this.f30628iwizpuwonk = documentUrl;
        this.f30626cqumvgiudr = documentType;
        this.f30627esjtqupxsv = documentSize;
        this.f30630lereixgezr = documentTypeAndSize;
    }

    public final String eablkybsjg() {
        return this.f30630lereixgezr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f30632zdlpuopuiu, zoijcleaowVar.f30632zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f30631yggfygwlhe, zoijcleaowVar.f30631yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f30629jyumaefscl, zoijcleaowVar.f30629jyumaefscl) && zdlpuopuiu.eablkybsjg(this.f30628iwizpuwonk, zoijcleaowVar.f30628iwizpuwonk) && zdlpuopuiu.eablkybsjg(this.f30626cqumvgiudr, zoijcleaowVar.f30626cqumvgiudr) && zdlpuopuiu.eablkybsjg(this.f30627esjtqupxsv, zoijcleaowVar.f30627esjtqupxsv) && zdlpuopuiu.eablkybsjg(this.f30630lereixgezr, zoijcleaowVar.f30630lereixgezr);
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f30632zdlpuopuiu;
    }

    public int hashCode() {
        return (((((((((((this.f30632zdlpuopuiu.hashCode() * 31) + this.f30631yggfygwlhe.hashCode()) * 31) + this.f30629jyumaefscl.hashCode()) * 31) + this.f30628iwizpuwonk.hashCode()) * 31) + this.f30626cqumvgiudr.hashCode()) * 31) + this.f30627esjtqupxsv.hashCode()) * 31) + this.f30630lereixgezr.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f30631yggfygwlhe;
    }

    public final String lqeggnwhkg() {
        return this.f30628iwizpuwonk;
    }

    public String toString() {
        return "DocumentUiModel(itemId=" + this.f30632zdlpuopuiu + ", documentIcon=" + this.f30631yggfygwlhe + ", documentName=" + this.f30629jyumaefscl + ", documentUrl=" + this.f30628iwizpuwonk + ", documentType=" + this.f30626cqumvgiudr + ", documentSize=" + this.f30627esjtqupxsv + ", documentTypeAndSize=" + this.f30630lereixgezr + ")";
    }

    public final String wkgbmnqykc() {
        return this.f30629jyumaefscl;
    }
}
