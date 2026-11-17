package ru.myspar.proloyalty.ads.impl.presentation.image;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lm0.eablkybsjg;
import lm0.lqeggnwhkg;
import lm0.wkgbmnqykc;
import m21.dxjokdxxww;
import ru.myspar.proloyalty.ads.impl.domain.image.store.State;
import tg.draadjrbmk;
import tm0.gxszxtbevo;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final draadjrbmk f92203btonecajqb;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f92204gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f92203btonecajqb = new draadjrbmk() { // from class: tm0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.ads.impl.presentation.image.iobyxmoadg.sopmlzcsov((State) obj);
            }
        };
        this.f92204gtknphoqwx = new draadjrbmk() { // from class: tm0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.ads.impl.presentation.image.iobyxmoadg.ntlheqmsrt((gxszxtbevo) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wkgbmnqykc ntlheqmsrt(gxszxtbevo gxszxtbevoVar) {
        zdlpuopuiu.btonecajqb(gxszxtbevoVar, "<this>");
        if (gxszxtbevoVar instanceof gxszxtbevo.iobyxmoadg) {
            return wkgbmnqykc.zoijcleaow.f63610iobyxmoadg;
        }
        if (gxszxtbevoVar instanceof gxszxtbevo.zoijcleaow) {
            return wkgbmnqykc.ppxfxbqfkf.f63609iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tm0.lqeggnwhkg sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return new tm0.lqeggnwhkg(state.getTitle(), state.getSubtitle(), state.getSubtitleText(), state.getText(), state.getButtonText(), state.getImageLink());
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f92203btonecajqb;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f92204gtknphoqwx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof eablkybsjg.iobyxmoadg) {
            Object objCllcsxoeiz = cllcsxoeiz(zoijcleaow.iobyxmoadg.f92205iobyxmoadg, gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof eablkybsjg.zoijcleaow) {
            Object objCllcsxoeiz2 = cllcsxoeiz(zoijcleaow.C2148zoijcleaow.f92206iobyxmoadg, gxszxtbevoVar);
            return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!(eablkybsjgVar instanceof eablkybsjg.ppxfxbqfkf)) {
            throw new NoWhenBranchMatchedException();
        }
        i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().eablkybsjg(dxjokdxxww.f64969iobyxmoadg.jyumaefscl(((eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg()));
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
