package ex1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f32300iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f32301ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f32302zoijcleaow;

    public nufgyqmvbu(String orderId, String trackingUrl, String str) {
        zdlpuopuiu.btonecajqb(orderId, "orderId");
        zdlpuopuiu.btonecajqb(trackingUrl, "trackingUrl");
        this.f32300iobyxmoadg = orderId;
        this.f32302zoijcleaow = trackingUrl;
        this.f32301ppxfxbqfkf = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return zdlpuopuiu.eablkybsjg(this.f32300iobyxmoadg, nufgyqmvbuVar.f32300iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f32302zoijcleaow, nufgyqmvbuVar.f32302zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f32301ppxfxbqfkf, nufgyqmvbuVar.f32301ppxfxbqfkf);
    }

    public int hashCode() {
        int iHashCode = ((this.f32300iobyxmoadg.hashCode() * 31) + this.f32302zoijcleaow.hashCode()) * 31;
        String str = this.f32301ppxfxbqfkf;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String iobyxmoadg() {
        return this.f32301ppxfxbqfkf;
    }

    public String toString() {
        return "Model(orderId=" + this.f32300iobyxmoadg + ", trackingUrl=" + this.f32302zoijcleaow + ", token=" + this.f32301ppxfxbqfkf + ")";
    }

    public final String zoijcleaow() {
        return this.f32302zoijcleaow;
    }
}
