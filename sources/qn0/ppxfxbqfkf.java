package qn0;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.auth.impl.domain.deleteaccountfinish.store.State;
import ru.myspar.proloyalty.core.ui.model.MainTab;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final tg.draadjrbmk f79219btonecajqb;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final tg.draadjrbmk f79220gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(gn0.lqeggnwhkg store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f79219btonecajqb = new tg.draadjrbmk() { // from class: qn0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ppxfxbqfkf.sopmlzcsov((State) obj);
            }
        };
        this.f79220gtknphoqwx = new tg.draadjrbmk() { // from class: qn0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ppxfxbqfkf.ntlheqmsrt((nufgyqmvbu) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gn0.wkgbmnqykc ntlheqmsrt(nufgyqmvbu nufgyqmvbuVar) {
        zdlpuopuiu.btonecajqb(nufgyqmvbuVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(nufgyqmvbuVar, nufgyqmvbu.iobyxmoadg.f79218iobyxmoadg)) {
            return gn0.wkgbmnqykc.iobyxmoadg.f37975iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dxjokdxxww sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return dxjokdxxww.f79215iobyxmoadg;
    }

    @Override // pr0.zoijcleaow
    protected tg.draadjrbmk esjtqupxsv() {
        return this.f79219btonecajqb;
    }

    @Override // pr0.zoijcleaow
    protected tg.draadjrbmk iwizpuwonk() {
        return this.f79220gtknphoqwx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(gn0.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (!(eablkybsjgVar instanceof gn0.eablkybsjg.iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objZynmafqrjb = i21.iobyxmoadg.f41720iobyxmoadg.zynmafqrjb(MainTab.MY_SPAR, gxszxtbevoVar);
        return objZynmafqrjb == mg.zoijcleaow.gxszxtbevo() ? objZynmafqrjb : wwaezpbzkn.f37140iobyxmoadg;
    }
}
