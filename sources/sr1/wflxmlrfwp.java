package sr1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class wflxmlrfwp implements gz0.iobyxmoadg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final long f108471cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final long f108472iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f108473jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f108474yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f108475zdlpuopuiu;

    public wflxmlrfwp(String itemId, String image, String title, long j13, long j14) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(image, "image");
        zdlpuopuiu.btonecajqb(title, "title");
        this.f108475zdlpuopuiu = itemId;
        this.f108474yggfygwlhe = image;
        this.f108473jyumaefscl = title;
        this.f108472iwizpuwonk = j13;
        this.f108471cqumvgiudr = j14;
    }

    public final String eablkybsjg() {
        return this.f108473jyumaefscl;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wflxmlrfwp)) {
            return false;
        }
        wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) obj;
        return zdlpuopuiu.eablkybsjg(this.f108475zdlpuopuiu, wflxmlrfwpVar.f108475zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f108474yggfygwlhe, wflxmlrfwpVar.f108474yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f108473jyumaefscl, wflxmlrfwpVar.f108473jyumaefscl) && this.f108472iwizpuwonk == wflxmlrfwpVar.f108472iwizpuwonk && this.f108471cqumvgiudr == wflxmlrfwpVar.f108471cqumvgiudr;
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f108475zdlpuopuiu;
    }

    public int hashCode() {
        return (((((((this.f108475zdlpuopuiu.hashCode() * 31) + this.f108474yggfygwlhe.hashCode()) * 31) + this.f108473jyumaefscl.hashCode()) * 31) + Long.hashCode(this.f108472iwizpuwonk)) * 31) + Long.hashCode(this.f108471cqumvgiudr);
    }

    public final String iobyxmoadg() {
        return this.f108474yggfygwlhe;
    }

    public String toString() {
        return "TimerUiModel(itemId=" + this.f108475zdlpuopuiu + ", image=" + this.f108474yggfygwlhe + ", title=" + this.f108473jyumaefscl + ", parsedSeconds=" + this.f108472iwizpuwonk + ", rawSeconds=" + this.f108471cqumvgiudr + ")";
    }

    public final long wkgbmnqykc() {
        return this.f108472iwizpuwonk;
    }
}
