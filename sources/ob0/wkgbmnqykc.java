package ob0;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.shop.ShopService;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc implements draadjrbmk {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f72537zdlpuopuiu;

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f72538iobyxmoadg;

        static {
            int[] iArr = new int[rb0.iobyxmoadg.values().length];
            try {
                iArr[rb0.iobyxmoadg.f82479iwizpuwonk.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[rb0.iobyxmoadg.f82477cqumvgiudr.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f72538iobyxmoadg = iArr;
        }
    }

    public wkgbmnqykc(d60.iobyxmoadg resourcesManager) {
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f72537zdlpuopuiu = resourcesManager.getString(rb0.iobyxmoadg.f82479iwizpuwonk.nufgyqmvbu());
    }

    private final rb0.zoijcleaow eablkybsjg(ShopService shopService) {
        rb0.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadg(shopService.getName());
        return new rb0.zoijcleaow(shopService.getName(), shopService.getIcon(), shopService.getPic(), iobyxmoadgVarIobyxmoadg, shopService.getIsChecked(), ppxfxbqfkf(iobyxmoadgVarIobyxmoadg), 0.0f, 64, null);
    }

    private final rb0.iobyxmoadg iobyxmoadg(String str) {
        return zdlpuopuiu.eablkybsjg(str, this.f72537zdlpuopuiu) ? rb0.iobyxmoadg.f82479iwizpuwonk : rb0.iobyxmoadg.f82477cqumvgiudr;
    }

    private final boolean ppxfxbqfkf(rb0.iobyxmoadg iobyxmoadgVar) {
        int i13 = iobyxmoadg.f72538iobyxmoadg[iobyxmoadgVar.ordinal()];
        if (i13 == 1) {
            return true;
        }
        if (i13 == 2) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public List invoke(List shopServices) {
        zdlpuopuiu.btonecajqb(shopServices, "shopServices");
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(shopServices, 10));
        Iterator it = shopServices.iterator();
        while (it.hasNext()) {
            arrayList.add(eablkybsjg((ShopService) it.next()));
        }
        return arrayList;
    }
}
