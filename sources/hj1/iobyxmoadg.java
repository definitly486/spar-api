package hj1;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.purchases.impl.list_actions_with_section.domain.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: hj1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public /* synthetic */ class C0937iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f40477iobyxmoadg;

        static {
            int[] iArr = new int[gk1.iobyxmoadg.values().length];
            try {
                iArr[gk1.iobyxmoadg.TO_BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gk1.iobyxmoadg.BOUGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f40477iobyxmoadg = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(dr0.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
    }

    private final gk1.iobyxmoadg vipkmwdibw(gk1.iobyxmoadg iobyxmoadgVar) {
        int i13 = C0937iobyxmoadg.f40477iobyxmoadg[iobyxmoadgVar.ordinal()];
        if (i13 == 1) {
            return gk1.iobyxmoadg.BOUGHT;
        }
        if (i13 == 2) {
            return gk1.iobyxmoadg.TO_BUY;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: ribwqtqdhb, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(wkgbmnqykc intent) {
        zdlpuopuiu.btonecajqb(intent, "intent");
        if (zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.iobyxmoadg.f40481iobyxmoadg)) {
            crxdokpmqz(new eablkybsjg.iobyxmoadg(((State) jlmebxxoox()).getSection()));
        } else {
            if (!zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.zoijcleaow.f40482iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            crxdokpmqz(new eablkybsjg.zoijcleaow(vipkmwdibw(((State) jlmebxxoox()).getSection())));
        }
    }
}
