package ru.myspar.legacy.presentation.dialogs.emailverify;

import androidx.lifecycle.pkzmftpjix;
import cb0.gxszxtbevo;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import q70.eablkybsjg;
import q70.lqeggnwhkg;
import ru.myspar.domain.feature.emailverify.store.State;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final draadjrbmk f88618btonecajqb;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f88619gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f88618btonecajqb = new draadjrbmk() { // from class: cb0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.legacy.presentation.dialogs.emailverify.iobyxmoadg.sopmlzcsov((State) obj);
            }
        };
        this.f88619gtknphoqwx = new draadjrbmk() { // from class: cb0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.legacy.presentation.dialogs.emailverify.iobyxmoadg.ntlheqmsrt((ru.myspar.legacy.presentation.dialogs.emailverify.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q70.wkgbmnqykc ntlheqmsrt(zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.iobyxmoadg.f88621iobyxmoadg)) {
            return q70.wkgbmnqykc.iobyxmoadg.f78176iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gxszxtbevo sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return new gxszxtbevo(state.getEmail());
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f88618btonecajqb;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f88619gtknphoqwx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.iobyxmoadg.f78171iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objCllcsxoeiz = cllcsxoeiz(ppxfxbqfkf.iobyxmoadg.f88620iobyxmoadg, gxszxtbevoVar);
        return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
    }
}
