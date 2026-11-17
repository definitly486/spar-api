package ru.myspar.proloyalty.webview_screen.impl.chatorder.presentation;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.webview_screen.impl.chatorder.domain.store.State;
import tg.draadjrbmk;
import zw1.agtfadlqog;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final draadjrbmk f102090btonecajqb;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f102091gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(yw1.gxszxtbevo store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f102090btonecajqb = new draadjrbmk() { // from class: zw1.wkgbmnqykc
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.webview_screen.impl.chatorder.presentation.zoijcleaow.sopmlzcsov((State) obj);
            }
        };
        this.f102091gtknphoqwx = new draadjrbmk() { // from class: zw1.eablkybsjg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.webview_screen.impl.chatorder.presentation.zoijcleaow.ntlheqmsrt((ru.myspar.proloyalty.webview_screen.impl.chatorder.presentation.wkgbmnqykc) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yw1.wkgbmnqykc ntlheqmsrt(wkgbmnqykc wkgbmnqykcVar) {
        zdlpuopuiu.btonecajqb(wkgbmnqykcVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.zoijcleaow.f102089iobyxmoadg)) {
            return yw1.wkgbmnqykc.iobyxmoadg.f126836iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.ppxfxbqfkf.f102088iobyxmoadg)) {
            return yw1.wkgbmnqykc.ppxfxbqfkf.f126837iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.iobyxmoadg.f102087iobyxmoadg)) {
            return yw1.wkgbmnqykc.zoijcleaow.f126838iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final agtfadlqog sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return new agtfadlqog(state.getUrl(), state.getIsChatOrderEnabled(), state.getToken());
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f102090btonecajqb;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f102091gtknphoqwx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(yw1.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, yw1.eablkybsjg.iobyxmoadg.f126812iobyxmoadg)) {
            i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, yw1.eablkybsjg.ppxfxbqfkf.f126813iobyxmoadg)) {
            Object objCllcsxoeiz = cllcsxoeiz(eablkybsjg.zoijcleaow.f102076iobyxmoadg, gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof yw1.eablkybsjg.wkgbmnqykc) {
            Object objCllcsxoeiz2 = cllcsxoeiz(new eablkybsjg.ppxfxbqfkf(((yw1.eablkybsjg.wkgbmnqykc) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, yw1.eablkybsjg.zoijcleaow.f126815iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objCllcsxoeiz3 = cllcsxoeiz(eablkybsjg.iobyxmoadg.f102074iobyxmoadg, gxszxtbevoVar);
        return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
    }
}
