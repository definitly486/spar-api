package ki0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class draadjrbmk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f55680iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f55681ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final nufgyqmvbu f55682wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f55683zoijcleaow;

    public draadjrbmk(String networkId, String url, List list, nufgyqmvbu type) {
        zdlpuopuiu.btonecajqb(networkId, "networkId");
        zdlpuopuiu.btonecajqb(url, "url");
        zdlpuopuiu.btonecajqb(type, "type");
        this.f55680iobyxmoadg = networkId;
        this.f55683zoijcleaow = url;
        this.f55681ppxfxbqfkf = list;
        this.f55682wkgbmnqykc = type;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof draadjrbmk)) {
            return false;
        }
        draadjrbmk draadjrbmkVar = (draadjrbmk) obj;
        return zdlpuopuiu.eablkybsjg(this.f55680iobyxmoadg, draadjrbmkVar.f55680iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f55683zoijcleaow, draadjrbmkVar.f55683zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f55681ppxfxbqfkf, draadjrbmkVar.f55681ppxfxbqfkf) && this.f55682wkgbmnqykc == draadjrbmkVar.f55682wkgbmnqykc;
    }

    public int hashCode() {
        int iHashCode = ((this.f55680iobyxmoadg.hashCode() * 31) + this.f55683zoijcleaow.hashCode()) * 31;
        List list = this.f55681ppxfxbqfkf;
        return ((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.f55682wkgbmnqykc.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f55681ppxfxbqfkf;
    }

    public final String ppxfxbqfkf() {
        return this.f55683zoijcleaow;
    }

    public String toString() {
        return "NetworkPayloadUiModel(networkId=" + this.f55680iobyxmoadg + ", url=" + this.f55683zoijcleaow + ", items=" + this.f55681ppxfxbqfkf + ", type=" + this.f55682wkgbmnqykc + ")";
    }

    public final nufgyqmvbu zoijcleaow() {
        return this.f55682wkgbmnqykc;
    }
}
