package i02;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.rate.rate_order.api.models.RateOrderPayload;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc implements draadjrbmk {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final d60.iobyxmoadg f41627zdlpuopuiu;

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f41628iobyxmoadg;

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
            f41628iobyxmoadg = iArr;
        }
    }

    public wkgbmnqykc(d60.iobyxmoadg resourcesManager) {
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f41627zdlpuopuiu = resourcesManager;
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public j02.wkgbmnqykc invoke(RateOrderPayload.ppxfxbqfkf rateType) {
        int i13;
        zdlpuopuiu.btonecajqb(rateType, "rateType");
        d60.iobyxmoadg iobyxmoadgVar = this.f41627zdlpuopuiu;
        int i14 = iobyxmoadg.f41628iobyxmoadg[rateType.ordinal()];
        if (i14 == 1) {
            i13 = e02.ppxfxbqfkf.cancel_order_success_title;
        } else {
            if (i14 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = e02.ppxfxbqfkf.rate_order_success_title;
        }
        return new j02.wkgbmnqykc(iobyxmoadgVar.getString(i13));
    }
}
