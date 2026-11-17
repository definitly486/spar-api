package xo1;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.scango.impl.component.domain.model.product.ScanGoScanMatrixPayload;
import ru.myspar.proloyalty.scango.impl.screens.excisesticker.domain.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final dr0.iobyxmoadg f122967ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final C3103iobyxmoadg f122966wkgbmnqykc = new C3103iobyxmoadg(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final int f122965eablkybsjg = 8;

    /* JADX INFO: renamed from: xo1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C3103iobyxmoadg {
        public /* synthetic */ C3103iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C3103iobyxmoadg() {
        }
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f122968iobyxmoadg;

        static {
            int[] iArr = new int[bo1.iobyxmoadg.values().length];
            try {
                iArr[bo1.iobyxmoadg.INCREASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[bo1.iobyxmoadg.DECREASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f122968iobyxmoadg = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(dr0.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f122967ppxfxbqfkf = dispatchersProvider;
    }

    private final void vipkmwdibw(State state) {
        double quantity;
        int i13 = zoijcleaow.f122968iobyxmoadg[state.getScanGoAmountMode().ordinal()];
        if (i13 == 1) {
            quantity = state.getProduct().getQuantity() + 1.0d;
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            quantity = state.getProduct().getQuantity() - 1.0d;
        }
        crxdokpmqz(new eablkybsjg.zoijcleaow(new ScanGoScanMatrixPayload(state.getProduct().getArticle(), quantity, state.getScanGoAmountMode(), null, 8, null)));
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: ribwqtqdhb, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(wkgbmnqykc intent) {
        zdlpuopuiu.btonecajqb(intent, "intent");
        if (zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.iobyxmoadg.f122971iobyxmoadg)) {
            crxdokpmqz(eablkybsjg.iobyxmoadg.f122963iobyxmoadg);
        } else {
            if (!zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.zoijcleaow.f122972iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            vipkmwdibw((State) jlmebxxoox());
        }
    }
}
