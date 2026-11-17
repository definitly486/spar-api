package dk1;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.ui.model.MainTab;
import ru.myspar.proloyalty.purchases.impl.specific_success_retry.domain.store.SpecificPurchaseSuccessRetryStore$State;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final draadjrbmk f29119btonecajqb;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f29120gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(ck1.gxszxtbevo store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f29119btonecajqb = new draadjrbmk() { // from class: dk1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ppxfxbqfkf.sopmlzcsov((SpecificPurchaseSuccessRetryStore$State) obj);
            }
        };
        this.f29120gtknphoqwx = new draadjrbmk() { // from class: dk1.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ppxfxbqfkf.ntlheqmsrt((nufgyqmvbu) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ck1.ppxfxbqfkf ntlheqmsrt(nufgyqmvbu nufgyqmvbuVar) {
        zdlpuopuiu.btonecajqb(nufgyqmvbuVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(nufgyqmvbuVar, nufgyqmvbu.iobyxmoadg.f29118iobyxmoadg)) {
            return ck1.ppxfxbqfkf.iobyxmoadg.f19961iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dxjokdxxww sopmlzcsov(SpecificPurchaseSuccessRetryStore$State specificPurchaseSuccessRetryStore$State) {
        zdlpuopuiu.btonecajqb(specificPurchaseSuccessRetryStore$State, "<this>");
        return dxjokdxxww.f29116iobyxmoadg;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f29119btonecajqb;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f29120gtknphoqwx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(ck1.wkgbmnqykc wkgbmnqykcVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (!zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ck1.wkgbmnqykc.iobyxmoadg.f19962iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        i21.iobyxmoadg iobyxmoadgVar = i21.iobyxmoadg.f41720iobyxmoadg;
        iobyxmoadgVar.kcexrzcfyt().eablkybsjg(null);
        i21.iobyxmoadg.iozdgvuglv(iobyxmoadgVar, MainTab.CART, false, 2, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
