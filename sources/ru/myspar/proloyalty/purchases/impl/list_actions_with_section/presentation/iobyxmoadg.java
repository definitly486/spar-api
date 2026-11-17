package ru.myspar.proloyalty.purchases.impl.list_actions_with_section.presentation;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import hj1.eablkybsjg;
import hj1.lqeggnwhkg;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ru.myspar.proloyalty.purchases.impl.list_actions_with_section.domain.store.State;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final draadjrbmk f99648btonecajqb;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f99649gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f99648btonecajqb = new draadjrbmk() { // from class: ij1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.purchases.impl.list_actions_with_section.presentation.iobyxmoadg.sopmlzcsov((State) obj);
            }
        };
        this.f99649gtknphoqwx = new draadjrbmk() { // from class: ij1.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.purchases.impl.list_actions_with_section.presentation.iobyxmoadg.ntlheqmsrt((ru.myspar.proloyalty.purchases.impl.list_actions_with_section.presentation.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hj1.wkgbmnqykc ntlheqmsrt(zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.C2388zoijcleaow.f99654iobyxmoadg)) {
            return hj1.wkgbmnqykc.zoijcleaow.f40482iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.iobyxmoadg.f99653iobyxmoadg)) {
            return hj1.wkgbmnqykc.iobyxmoadg.f40481iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ij1.lqeggnwhkg sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return new ij1.lqeggnwhkg(state.getSection());
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f99648btonecajqb;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f99649gtknphoqwx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof eablkybsjg.zoijcleaow) {
            Object objCllcsxoeiz = cllcsxoeiz(new ppxfxbqfkf.zoijcleaow(((eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!(eablkybsjgVar instanceof eablkybsjg.iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objCllcsxoeiz2 = cllcsxoeiz(new ppxfxbqfkf.iobyxmoadg(((eablkybsjg.iobyxmoadg) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
        return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
    }
}
