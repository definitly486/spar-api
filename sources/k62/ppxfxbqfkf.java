package k62;

import com.yandex.mapkit.geometry.Point;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf implements w30.ppxfxbqfkf {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final Point f53939cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final List f53940esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final String f53941iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f53942jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f53943yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f53944zdlpuopuiu;

    public ppxfxbqfkf(String itemId, String address, String shopType, String shopWorkTime, Point point, List shopServices) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(address, "address");
        zdlpuopuiu.btonecajqb(shopType, "shopType");
        zdlpuopuiu.btonecajqb(shopWorkTime, "shopWorkTime");
        zdlpuopuiu.btonecajqb(point, "point");
        zdlpuopuiu.btonecajqb(shopServices, "shopServices");
        this.f53944zdlpuopuiu = itemId;
        this.f53943yggfygwlhe = address;
        this.f53942jyumaefscl = shopType;
        this.f53941iwizpuwonk = shopWorkTime;
        this.f53939cqumvgiudr = point;
        this.f53940esjtqupxsv = shopServices;
    }

    public final List eablkybsjg() {
        return this.f53940esjtqupxsv;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f53944zdlpuopuiu, ppxfxbqfkfVar.f53944zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f53943yggfygwlhe, ppxfxbqfkfVar.f53943yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f53942jyumaefscl, ppxfxbqfkfVar.f53942jyumaefscl) && zdlpuopuiu.eablkybsjg(this.f53941iwizpuwonk, ppxfxbqfkfVar.f53941iwizpuwonk) && zdlpuopuiu.eablkybsjg(this.f53939cqumvgiudr, ppxfxbqfkfVar.f53939cqumvgiudr) && zdlpuopuiu.eablkybsjg(this.f53940esjtqupxsv, ppxfxbqfkfVar.f53940esjtqupxsv);
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f53944zdlpuopuiu;
    }

    public int hashCode() {
        return (((((((((this.f53944zdlpuopuiu.hashCode() * 31) + this.f53943yggfygwlhe.hashCode()) * 31) + this.f53942jyumaefscl.hashCode()) * 31) + this.f53941iwizpuwonk.hashCode()) * 31) + this.f53939cqumvgiudr.hashCode()) * 31) + this.f53940esjtqupxsv.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f53943yggfygwlhe;
    }

    public final String lqeggnwhkg() {
        return this.f53942jyumaefscl;
    }

    public final String nufgyqmvbu() {
        return this.f53941iwizpuwonk;
    }

    public String toString() {
        return "ShopItemUiModel(itemId=" + this.f53944zdlpuopuiu + ", address=" + this.f53943yggfygwlhe + ", shopType=" + this.f53942jyumaefscl + ", shopWorkTime=" + this.f53941iwizpuwonk + ", point=" + this.f53939cqumvgiudr + ", shopServices=" + this.f53940esjtqupxsv + ")";
    }

    public final Point wkgbmnqykc() {
        return this.f53939cqumvgiudr;
    }
}
