package ru.myspar.proloyalty.echecks.impl.screen.presentation;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import p71.eablkybsjg;
import p71.lqeggnwhkg;
import q71.gxszxtbevo;
import ru.myspar.proloyalty.echecks.impl.screen.domain.store.State;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final draadjrbmk f96077btonecajqb;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f96078gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f96077btonecajqb = new draadjrbmk() { // from class: q71.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.echecks.impl.screen.presentation.iobyxmoadg.sopmlzcsov((State) obj);
            }
        };
        this.f96078gtknphoqwx = new draadjrbmk() { // from class: q71.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.echecks.impl.screen.presentation.iobyxmoadg.ntlheqmsrt((ru.myspar.proloyalty.echecks.impl.screen.presentation.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p71.wkgbmnqykc ntlheqmsrt(zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.iobyxmoadg.f96082iobyxmoadg)) {
            return p71.wkgbmnqykc.iobyxmoadg.f75948iobyxmoadg;
        }
        if (zoijcleaowVar instanceof zoijcleaow.C2267zoijcleaow) {
            return new p71.wkgbmnqykc.zoijcleaow(((zoijcleaow.C2267zoijcleaow) zoijcleaowVar).iobyxmoadg());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gxszxtbevo sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return new gxszxtbevo(state.getEmail(), state.getIsLoading(), state.getIsEmailEnabled(), state.getIsCheckedButton());
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f96077btonecajqb;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f96078gtknphoqwx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof eablkybsjg.ppxfxbqfkf) {
            Object objCllcsxoeiz = cllcsxoeiz(new ppxfxbqfkf.zoijcleaow(((eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof eablkybsjg.zoijcleaow) {
            Object objCllcsxoeiz2 = cllcsxoeiz(new ppxfxbqfkf.iobyxmoadg(((eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.iobyxmoadg.f75912iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
