package z52;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class wflxmlrfwp implements o00.iobyxmoadg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final long f129162cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final long f129163iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f129164jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f129165yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f129166zdlpuopuiu;

    public wflxmlrfwp(String itemId, String image, String title, long j13, long j14) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(image, "image");
        zdlpuopuiu.btonecajqb(title, "title");
        this.f129166zdlpuopuiu = itemId;
        this.f129165yggfygwlhe = image;
        this.f129164jyumaefscl = title;
        this.f129163iwizpuwonk = j13;
        this.f129162cqumvgiudr = j14;
    }

    public final String eablkybsjg() {
        return this.f129164jyumaefscl;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wflxmlrfwp)) {
            return false;
        }
        wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) obj;
        return zdlpuopuiu.eablkybsjg(this.f129166zdlpuopuiu, wflxmlrfwpVar.f129166zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f129165yggfygwlhe, wflxmlrfwpVar.f129165yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f129164jyumaefscl, wflxmlrfwpVar.f129164jyumaefscl) && this.f129163iwizpuwonk == wflxmlrfwpVar.f129163iwizpuwonk && this.f129162cqumvgiudr == wflxmlrfwpVar.f129162cqumvgiudr;
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f129166zdlpuopuiu;
    }

    public int hashCode() {
        return (((((((this.f129166zdlpuopuiu.hashCode() * 31) + this.f129165yggfygwlhe.hashCode()) * 31) + this.f129164jyumaefscl.hashCode()) * 31) + Long.hashCode(this.f129163iwizpuwonk)) * 31) + Long.hashCode(this.f129162cqumvgiudr);
    }

    public final String iobyxmoadg() {
        return this.f129165yggfygwlhe;
    }

    public String toString() {
        return "TimerUiModel(itemId=" + this.f129166zdlpuopuiu + ", image=" + this.f129165yggfygwlhe + ", title=" + this.f129164jyumaefscl + ", parsedSeconds=" + this.f129163iwizpuwonk + ", rawSeconds=" + this.f129162cqumvgiudr + ")";
    }

    public final long wkgbmnqykc() {
        return this.f129163iwizpuwonk;
    }
}
