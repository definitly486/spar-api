package b32;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.scango.impl.component.domain.model.product.ScanGoScanMatrixPayload;
import ru.myspar.scango.impl.screens.excisesticker.domain.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ns.iobyxmoadg f15088ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final C0256iobyxmoadg f15087wkgbmnqykc = new C0256iobyxmoadg(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final int f15086eablkybsjg = 8;

    /* JADX INFO: renamed from: b32.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0256iobyxmoadg {
        public /* synthetic */ C0256iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C0256iobyxmoadg() {
        }
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f15089iobyxmoadg;

        static {
            int[] iArr = new int[f22.iobyxmoadg.values().length];
            try {
                iArr[f22.iobyxmoadg.INCREASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f22.iobyxmoadg.DECREASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f15089iobyxmoadg = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(ns.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f15088ppxfxbqfkf = dispatchersProvider;
    }

    private final void vipkmwdibw(State state) {
        double quantity;
        int i13 = zoijcleaow.f15089iobyxmoadg[state.getScanGoAmountMode().ordinal()];
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
        if (zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.iobyxmoadg.f15092iobyxmoadg)) {
            crxdokpmqz(eablkybsjg.iobyxmoadg.f15084iobyxmoadg);
        } else {
            if (!zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.zoijcleaow.f15093iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            vipkmwdibw((State) jlmebxxoox());
        }
    }
}
