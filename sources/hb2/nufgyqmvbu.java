package hb2;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f40016iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f40017zoijcleaow;

    public nufgyqmvbu(String orderId, String trackingUrl) {
        zdlpuopuiu.btonecajqb(orderId, "orderId");
        zdlpuopuiu.btonecajqb(trackingUrl, "trackingUrl");
        this.f40016iobyxmoadg = orderId;
        this.f40017zoijcleaow = trackingUrl;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return zdlpuopuiu.eablkybsjg(this.f40016iobyxmoadg, nufgyqmvbuVar.f40016iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f40017zoijcleaow, nufgyqmvbuVar.f40017zoijcleaow);
    }

    public int hashCode() {
        return (this.f40016iobyxmoadg.hashCode() * 31) + this.f40017zoijcleaow.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f40017zoijcleaow;
    }

    public String toString() {
        return "Model(orderId=" + this.f40016iobyxmoadg + ", trackingUrl=" + this.f40017zoijcleaow + ")";
    }
}
