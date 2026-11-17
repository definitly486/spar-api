package yo1;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.scango.impl.screens.excisesticker.domain.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final tg.draadjrbmk f126029btonecajqb;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final tg.draadjrbmk f126030gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lqeggnwhkg(xo1.lqeggnwhkg store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f126029btonecajqb = new tg.draadjrbmk() { // from class: yo1.eablkybsjg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return lqeggnwhkg.sopmlzcsov((State) obj);
            }
        };
        this.f126030gtknphoqwx = new tg.draadjrbmk() { // from class: yo1.gxszxtbevo
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return lqeggnwhkg.ntlheqmsrt((gtknphoqwx) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xo1.wkgbmnqykc ntlheqmsrt(gtknphoqwx gtknphoqwxVar) {
        zdlpuopuiu.btonecajqb(gtknphoqwxVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(gtknphoqwxVar, gtknphoqwx.iobyxmoadg.f126026iobyxmoadg)) {
            return xo1.wkgbmnqykc.iobyxmoadg.f122971iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(gtknphoqwxVar, gtknphoqwx.zoijcleaow.f126027iobyxmoadg)) {
            return xo1.wkgbmnqykc.zoijcleaow.f122972iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final draadjrbmk sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return new draadjrbmk(state.getIsRemove(), state.getIsWeightProduct());
    }

    @Override // pr0.zoijcleaow
    protected tg.draadjrbmk esjtqupxsv() {
        return this.f126029btonecajqb;
    }

    @Override // pr0.zoijcleaow
    protected tg.draadjrbmk iwizpuwonk() {
        return this.f126030gtknphoqwx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(xo1.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof xo1.eablkybsjg.zoijcleaow) {
            i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.iobyxmoadg.zoijcleaow(((xo1.eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg()));
            Object objCllcsxoeiz = cllcsxoeiz(wflxmlrfwp.iobyxmoadg.f126033iobyxmoadg, gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, xo1.eablkybsjg.iobyxmoadg.f122963iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objCllcsxoeiz2 = cllcsxoeiz(wflxmlrfwp.iobyxmoadg.f126033iobyxmoadg, gxszxtbevoVar);
        return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
    }
}
