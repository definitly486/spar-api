package ru.myspar.ads.impl.presentation.dialog.ads.text;

import androidx.lifecycle.pkzmftpjix;
import eo.eablkybsjg;
import eo.lqeggnwhkg;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ru.myspar.ads.impl.domain.text.store.State;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final draadjrbmk f84118btonecajqb;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f84119gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f84118btonecajqb = new draadjrbmk() { // from class: fo.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.ads.impl.presentation.dialog.ads.text.iobyxmoadg.sopmlzcsov((State) obj);
            }
        };
        this.f84119gtknphoqwx = new draadjrbmk() { // from class: fo.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.ads.impl.presentation.dialog.ads.text.iobyxmoadg.ntlheqmsrt((ru.myspar.ads.impl.presentation.dialog.ads.text.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final eo.wkgbmnqykc ntlheqmsrt(zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.iobyxmoadg.f84122iobyxmoadg)) {
            return eo.wkgbmnqykc.iobyxmoadg.f31635iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.C1900zoijcleaow.f84123iobyxmoadg)) {
            return eo.wkgbmnqykc.zoijcleaow.f31636iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fo.lqeggnwhkg sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return new fo.lqeggnwhkg(state.getTitle(), state.getSubtitle(), state.getSubtitleText(), state.getText(), state.getButtonText());
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f84118btonecajqb;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f84119gtknphoqwx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.zoijcleaow.f31632iobyxmoadg)) {
            Object objCllcsxoeiz = cllcsxoeiz(ppxfxbqfkf.zoijcleaow.f84121iobyxmoadg, gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.iobyxmoadg.f31631iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objCllcsxoeiz2 = cllcsxoeiz(ppxfxbqfkf.iobyxmoadg.f84120iobyxmoadg, gxszxtbevoVar);
        return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
    }
}
