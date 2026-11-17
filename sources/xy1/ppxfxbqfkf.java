package xy1;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.ui.model.MainTab;
import ru.myspar.purchases.impl.specific_success_retry.domain.store.SpecificPurchaseSuccessRetryStore$State;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final draadjrbmk f123411btonecajqb;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f123412gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(wy1.gxszxtbevo store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f123411btonecajqb = new draadjrbmk() { // from class: xy1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ppxfxbqfkf.sopmlzcsov((SpecificPurchaseSuccessRetryStore$State) obj);
            }
        };
        this.f123412gtknphoqwx = new draadjrbmk() { // from class: xy1.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ppxfxbqfkf.ntlheqmsrt((nufgyqmvbu) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wy1.ppxfxbqfkf ntlheqmsrt(nufgyqmvbu nufgyqmvbuVar) {
        zdlpuopuiu.btonecajqb(nufgyqmvbuVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(nufgyqmvbuVar, nufgyqmvbu.iobyxmoadg.f123410iobyxmoadg)) {
            return wy1.ppxfxbqfkf.iobyxmoadg.f120733iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dxjokdxxww sopmlzcsov(SpecificPurchaseSuccessRetryStore$State specificPurchaseSuccessRetryStore$State) {
        zdlpuopuiu.btonecajqb(specificPurchaseSuccessRetryStore$State, "<this>");
        return dxjokdxxww.f123408iobyxmoadg;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f123411btonecajqb;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f123412gtknphoqwx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(wy1.wkgbmnqykc wkgbmnqykcVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (!zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wy1.wkgbmnqykc.iobyxmoadg.f120734iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        d40.iobyxmoadg iobyxmoadgVar = d40.iobyxmoadg.f26931iobyxmoadg;
        iobyxmoadgVar.kcexrzcfyt().eablkybsjg(null);
        d40.iobyxmoadg.iozdgvuglv(iobyxmoadgVar, MainTab.CART, false, 2, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
