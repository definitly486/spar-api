package c32;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.scango.impl.screens.excisesticker.domain.store.State;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final tg.draadjrbmk f18710btonecajqb;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final tg.draadjrbmk f18711gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lqeggnwhkg(b32.lqeggnwhkg store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f18710btonecajqb = new tg.draadjrbmk() { // from class: c32.eablkybsjg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return lqeggnwhkg.sopmlzcsov((State) obj);
            }
        };
        this.f18711gtknphoqwx = new tg.draadjrbmk() { // from class: c32.gxszxtbevo
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return lqeggnwhkg.ntlheqmsrt((gtknphoqwx) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b32.wkgbmnqykc ntlheqmsrt(gtknphoqwx gtknphoqwxVar) {
        zdlpuopuiu.btonecajqb(gtknphoqwxVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(gtknphoqwxVar, gtknphoqwx.iobyxmoadg.f18707iobyxmoadg)) {
            return b32.wkgbmnqykc.iobyxmoadg.f15092iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(gtknphoqwxVar, gtknphoqwx.zoijcleaow.f18708iobyxmoadg)) {
            return b32.wkgbmnqykc.zoijcleaow.f15093iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final draadjrbmk sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return new draadjrbmk(state.getIsRemove(), state.getIsWeightProduct());
    }

    @Override // ws.zoijcleaow
    protected tg.draadjrbmk esjtqupxsv() {
        return this.f18710btonecajqb;
    }

    @Override // ws.zoijcleaow
    protected tg.draadjrbmk iwizpuwonk() {
        return this.f18711gtknphoqwx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(b32.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof b32.eablkybsjg.zoijcleaow) {
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(ru.myspar.scango.impl.screens.scan.matrix.presentation.iobyxmoadg.zoijcleaow(((b32.eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg()));
            Object objCllcsxoeiz = cllcsxoeiz(wflxmlrfwp.iobyxmoadg.f18714iobyxmoadg, gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, b32.eablkybsjg.iobyxmoadg.f15084iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objCllcsxoeiz2 = cllcsxoeiz(wflxmlrfwp.iobyxmoadg.f18714iobyxmoadg, gxszxtbevoVar);
        return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
    }
}
