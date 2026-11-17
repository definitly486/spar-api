package by1;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.purchases.impl.list_actions_with_section.domain.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: by1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public /* synthetic */ class C0318iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f17368iobyxmoadg;

        static {
            int[] iArr = new int[az1.iobyxmoadg.values().length];
            try {
                iArr[az1.iobyxmoadg.TO_BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[az1.iobyxmoadg.BOUGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f17368iobyxmoadg = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(ns.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
    }

    private final az1.iobyxmoadg vipkmwdibw(az1.iobyxmoadg iobyxmoadgVar) {
        int i13 = C0318iobyxmoadg.f17368iobyxmoadg[iobyxmoadgVar.ordinal()];
        if (i13 == 1) {
            return az1.iobyxmoadg.BOUGHT;
        }
        if (i13 == 2) {
            return az1.iobyxmoadg.TO_BUY;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: ribwqtqdhb, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(wkgbmnqykc intent) {
        zdlpuopuiu.btonecajqb(intent, "intent");
        if (zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.iobyxmoadg.f17372iobyxmoadg)) {
            crxdokpmqz(new eablkybsjg.iobyxmoadg(((State) jlmebxxoox()).getSection()));
        } else {
            if (!zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.zoijcleaow.f17373iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            crxdokpmqz(new eablkybsjg.zoijcleaow(vipkmwdibw(((State) jlmebxxoox()).getSection())));
        }
    }
}
