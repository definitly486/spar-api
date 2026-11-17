package ds1;

import com.yandex.mapkit.geometry.Point;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf implements b21.ppxfxbqfkf {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final Point f29439cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final List f29440esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final String f29441iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f29442jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f29443yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f29444zdlpuopuiu;

    public ppxfxbqfkf(String itemId, String address, String shopType, String shopWorkTime, Point point, List shopServices) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(address, "address");
        zdlpuopuiu.btonecajqb(shopType, "shopType");
        zdlpuopuiu.btonecajqb(shopWorkTime, "shopWorkTime");
        zdlpuopuiu.btonecajqb(point, "point");
        zdlpuopuiu.btonecajqb(shopServices, "shopServices");
        this.f29444zdlpuopuiu = itemId;
        this.f29443yggfygwlhe = address;
        this.f29442jyumaefscl = shopType;
        this.f29441iwizpuwonk = shopWorkTime;
        this.f29439cqumvgiudr = point;
        this.f29440esjtqupxsv = shopServices;
    }

    public final List eablkybsjg() {
        return this.f29440esjtqupxsv;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f29444zdlpuopuiu, ppxfxbqfkfVar.f29444zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f29443yggfygwlhe, ppxfxbqfkfVar.f29443yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f29442jyumaefscl, ppxfxbqfkfVar.f29442jyumaefscl) && zdlpuopuiu.eablkybsjg(this.f29441iwizpuwonk, ppxfxbqfkfVar.f29441iwizpuwonk) && zdlpuopuiu.eablkybsjg(this.f29439cqumvgiudr, ppxfxbqfkfVar.f29439cqumvgiudr) && zdlpuopuiu.eablkybsjg(this.f29440esjtqupxsv, ppxfxbqfkfVar.f29440esjtqupxsv);
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f29444zdlpuopuiu;
    }

    public int hashCode() {
        return (((((((((this.f29444zdlpuopuiu.hashCode() * 31) + this.f29443yggfygwlhe.hashCode()) * 31) + this.f29442jyumaefscl.hashCode()) * 31) + this.f29441iwizpuwonk.hashCode()) * 31) + this.f29439cqumvgiudr.hashCode()) * 31) + this.f29440esjtqupxsv.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f29443yggfygwlhe;
    }

    public final String lqeggnwhkg() {
        return this.f29442jyumaefscl;
    }

    public final String nufgyqmvbu() {
        return this.f29441iwizpuwonk;
    }

    public String toString() {
        return "ShopItemUiModel(itemId=" + this.f29444zdlpuopuiu + ", address=" + this.f29443yggfygwlhe + ", shopType=" + this.f29442jyumaefscl + ", shopWorkTime=" + this.f29441iwizpuwonk + ", point=" + this.f29439cqumvgiudr + ", shopServices=" + this.f29440esjtqupxsv + ")";
    }

    public final Point wkgbmnqykc() {
        return this.f29439cqumvgiudr;
    }
}
