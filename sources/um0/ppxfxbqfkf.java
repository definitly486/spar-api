package um0;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.ads.impl.domain.promocode.store.State;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final tg.draadjrbmk f113953btonecajqb;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final tg.draadjrbmk f113954gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(nm0.lqeggnwhkg store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f113953btonecajqb = new tg.draadjrbmk() { // from class: um0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ppxfxbqfkf.sopmlzcsov((State) obj);
            }
        };
        this.f113954gtknphoqwx = new tg.draadjrbmk() { // from class: um0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ppxfxbqfkf.ntlheqmsrt((nufgyqmvbu) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nm0.wkgbmnqykc ntlheqmsrt(nufgyqmvbu nufgyqmvbuVar) {
        zdlpuopuiu.btonecajqb(nufgyqmvbuVar, "<this>");
        if (nufgyqmvbuVar instanceof nufgyqmvbu.iobyxmoadg) {
            return nm0.wkgbmnqykc.zoijcleaow.f70344iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dxjokdxxww sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return new dxjokdxxww(state.getTitle(), state.getSubtitle(), state.getSubtitleText(), state.getText(), state.getPromoCode());
    }

    @Override // pr0.zoijcleaow
    protected tg.draadjrbmk esjtqupxsv() {
        return this.f113953btonecajqb;
    }

    @Override // pr0.zoijcleaow
    protected tg.draadjrbmk iwizpuwonk() {
        return this.f113954gtknphoqwx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(nm0.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (!(eablkybsjgVar instanceof nm0.eablkybsjg.iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objCllcsxoeiz = cllcsxoeiz(btonecajqb.iobyxmoadg.f113944iobyxmoadg, gxszxtbevoVar);
        return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
    }
}
