package zl1;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.rate.rate_order.api.models.RateOrderPayload;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc implements draadjrbmk {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final q41.iobyxmoadg f130385zdlpuopuiu;

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f130386iobyxmoadg;

        static {
            int[] iArr = new int[RateOrderPayload.ppxfxbqfkf.values().length];
            try {
                iArr[RateOrderPayload.ppxfxbqfkf.CANCEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RateOrderPayload.ppxfxbqfkf.ACTUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f130386iobyxmoadg = iArr;
        }
    }

    public wkgbmnqykc(q41.iobyxmoadg resourcesManager) {
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f130385zdlpuopuiu = resourcesManager;
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public am1.wkgbmnqykc invoke(RateOrderPayload.ppxfxbqfkf rateType) {
        int i13;
        zdlpuopuiu.btonecajqb(rateType, "rateType");
        q41.iobyxmoadg iobyxmoadgVar = this.f130385zdlpuopuiu;
        int i14 = iobyxmoadg.f130386iobyxmoadg[rateType.ordinal()];
        if (i14 == 1) {
            i13 = vl1.ppxfxbqfkf.proloyalty_cancel_order_success_title;
        } else {
            if (i14 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = vl1.ppxfxbqfkf.proloyalty_rate_order_success_title;
        }
        return new am1.wkgbmnqykc(iobyxmoadgVar.getString(i13));
    }
}
