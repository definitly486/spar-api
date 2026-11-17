package nt0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements jt0.zoijcleaow {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f71000jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f71001yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f71002zdlpuopuiu;

    public iobyxmoadg(String id2, String imageUrl, String adv) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(imageUrl, "imageUrl");
        zdlpuopuiu.btonecajqb(adv, "adv");
        this.f71002zdlpuopuiu = id2;
        this.f71001yggfygwlhe = imageUrl;
        this.f71000jyumaefscl = adv;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f71002zdlpuopuiu, iobyxmoadgVar.f71002zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f71001yggfygwlhe, iobyxmoadgVar.f71001yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f71000jyumaefscl, iobyxmoadgVar.f71000jyumaefscl);
    }

    public int hashCode() {
        return (((this.f71002zdlpuopuiu.hashCode() * 31) + this.f71001yggfygwlhe.hashCode()) * 31) + this.f71000jyumaefscl.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f71000jyumaefscl;
    }

    public final int ppxfxbqfkf() {
        return hashCode();
    }

    public String toString() {
        return "PromoBannerSection(id=" + this.f71002zdlpuopuiu + ", imageUrl=" + this.f71001yggfygwlhe + ", adv=" + this.f71000jyumaefscl + ")";
    }

    public final String zoijcleaow() {
        return this.f71001yggfygwlhe;
    }
}
