package n91;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.shop.ShopService;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc implements draadjrbmk {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f69382zdlpuopuiu;

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f69383iobyxmoadg;

        static {
            int[] iArr = new int[q91.iobyxmoadg.values().length];
            try {
                iArr[q91.iobyxmoadg.f78340iwizpuwonk.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q91.iobyxmoadg.f78338cqumvgiudr.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f69383iobyxmoadg = iArr;
        }
    }

    public wkgbmnqykc(q41.iobyxmoadg resourcesManager) {
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f69382zdlpuopuiu = resourcesManager.getString(q91.iobyxmoadg.f78340iwizpuwonk.nufgyqmvbu());
    }

    private final q91.zoijcleaow eablkybsjg(ShopService shopService) {
        q91.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadg(shopService.getName());
        return new q91.zoijcleaow(shopService.getName(), shopService.getIcon(), shopService.getPic(), iobyxmoadgVarIobyxmoadg, shopService.getIsChecked(), ppxfxbqfkf(iobyxmoadgVarIobyxmoadg), 0.0f, 64, null);
    }

    private final q91.iobyxmoadg iobyxmoadg(String str) {
        return zdlpuopuiu.eablkybsjg(str, this.f69382zdlpuopuiu) ? q91.iobyxmoadg.f78340iwizpuwonk : q91.iobyxmoadg.f78338cqumvgiudr;
    }

    private final boolean ppxfxbqfkf(q91.iobyxmoadg iobyxmoadgVar) {
        int i13 = iobyxmoadg.f69383iobyxmoadg[iobyxmoadgVar.ordinal()];
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
