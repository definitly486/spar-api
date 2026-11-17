package ru.myspar.webview_screen.impl.chatorder.presentation;

import androidx.lifecycle.pkzmftpjix;
import bb2.agtfadlqog;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.webview_screen.impl.chatorder.domain.store.State;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final draadjrbmk f104733btonecajqb;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f104734gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(ab2.gxszxtbevo store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f104733btonecajqb = new draadjrbmk() { // from class: bb2.wkgbmnqykc
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.webview_screen.impl.chatorder.presentation.zoijcleaow.sopmlzcsov((State) obj);
            }
        };
        this.f104734gtknphoqwx = new draadjrbmk() { // from class: bb2.eablkybsjg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.webview_screen.impl.chatorder.presentation.zoijcleaow.ntlheqmsrt((ru.myspar.webview_screen.impl.chatorder.presentation.wkgbmnqykc) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab2.wkgbmnqykc ntlheqmsrt(wkgbmnqykc wkgbmnqykcVar) {
        zdlpuopuiu.btonecajqb(wkgbmnqykcVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.zoijcleaow.f104732iobyxmoadg)) {
            return ab2.wkgbmnqykc.iobyxmoadg.f1311iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.ppxfxbqfkf.f104731iobyxmoadg)) {
            return ab2.wkgbmnqykc.ppxfxbqfkf.f1312iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.iobyxmoadg.f104730iobyxmoadg)) {
            return ab2.wkgbmnqykc.zoijcleaow.f1313iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final agtfadlqog sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return new agtfadlqog(state.getUrl(), state.getIsChatOrderEnabled());
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f104733btonecajqb;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f104734gtknphoqwx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(ab2.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, ab2.eablkybsjg.iobyxmoadg.f1294iobyxmoadg)) {
            d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, ab2.eablkybsjg.ppxfxbqfkf.f1295iobyxmoadg)) {
            Object objCllcsxoeiz = cllcsxoeiz(eablkybsjg.zoijcleaow.f104719iobyxmoadg, gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof ab2.eablkybsjg.wkgbmnqykc) {
            Object objCllcsxoeiz2 = cllcsxoeiz(new eablkybsjg.ppxfxbqfkf(((ab2.eablkybsjg.wkgbmnqykc) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, ab2.eablkybsjg.zoijcleaow.f1297iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objCllcsxoeiz3 = cllcsxoeiz(eablkybsjg.iobyxmoadg.f104717iobyxmoadg, gxszxtbevoVar);
        return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
    }
}
