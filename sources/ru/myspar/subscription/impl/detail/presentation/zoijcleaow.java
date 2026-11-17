package ru.myspar.subscription.impl.detail.presentation;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import h40.dxjokdxxww;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.auth.api.model.NonAuthorizedPayload;
import ru.myspar.subscription.impl.detail.domain.State;
import tg.draadjrbmk;
import v82.eablkybsjg;
import v82.lqeggnwhkg;
import w82.gxszxtbevo;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final qj0.iobyxmoadg f104446btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f104447draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final ro.iobyxmoadg f104448gtknphoqwx;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final draadjrbmk f104449wflxmlrfwp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(lqeggnwhkg store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, qj0.iobyxmoadg paymentFeatureApi, ro.iobyxmoadg authFeatureApi) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(paymentFeatureApi, "paymentFeatureApi");
        zdlpuopuiu.btonecajqb(authFeatureApi, "authFeatureApi");
        this.f104446btonecajqb = paymentFeatureApi;
        this.f104448gtknphoqwx = authFeatureApi;
        this.f104447draadjrbmk = new draadjrbmk() { // from class: w82.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.subscription.impl.detail.presentation.zoijcleaow.sopmlzcsov((State) obj);
            }
        };
        this.f104449wflxmlrfwp = new draadjrbmk() { // from class: w82.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.subscription.impl.detail.presentation.zoijcleaow.ntlheqmsrt((ru.myspar.subscription.impl.detail.presentation.ppxfxbqfkf) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v82.wkgbmnqykc ntlheqmsrt(ppxfxbqfkf ppxfxbqfkfVar) {
        v82.wkgbmnqykc dxjokdxxwwVar;
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.iobyxmoadg.f104438iobyxmoadg)) {
            return v82.wkgbmnqykc.iobyxmoadg.f116396iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.zoijcleaow.f104444iobyxmoadg)) {
            return v82.wkgbmnqykc.zoijcleaow.f116402iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.wkgbmnqykc) {
            ppxfxbqfkf.wkgbmnqykc wkgbmnqykcVar = (ppxfxbqfkf.wkgbmnqykc) ppxfxbqfkfVar;
            dxjokdxxwwVar = new v82.wkgbmnqykc.C2899wkgbmnqykc(wkgbmnqykcVar.iobyxmoadg(), wkgbmnqykcVar.zoijcleaow());
        } else if (ppxfxbqfkfVar instanceof ppxfxbqfkf.gtknphoqwx) {
            dxjokdxxwwVar = new v82.wkgbmnqykc.gtknphoqwx(((ppxfxbqfkf.gtknphoqwx) ppxfxbqfkfVar).iobyxmoadg());
        } else {
            if (ppxfxbqfkfVar instanceof ppxfxbqfkf.btonecajqb) {
                return v82.wkgbmnqykc.btonecajqb.f116390iobyxmoadg;
            }
            if (ppxfxbqfkfVar instanceof ppxfxbqfkf.gxszxtbevo) {
                return v82.wkgbmnqykc.gxszxtbevo.f116395iobyxmoadg;
            }
            if (ppxfxbqfkfVar instanceof ppxfxbqfkf.lqeggnwhkg) {
                return v82.wkgbmnqykc.lqeggnwhkg.f116397iobyxmoadg;
            }
            if (ppxfxbqfkfVar instanceof ppxfxbqfkf.draadjrbmk) {
                return v82.wkgbmnqykc.draadjrbmk.f116391iobyxmoadg;
            }
            if (ppxfxbqfkfVar instanceof ppxfxbqfkf.C2524ppxfxbqfkf) {
                dxjokdxxwwVar = new v82.wkgbmnqykc.ppxfxbqfkf(((ppxfxbqfkf.C2524ppxfxbqfkf) ppxfxbqfkfVar).iobyxmoadg());
            } else {
                if (!(ppxfxbqfkfVar instanceof ppxfxbqfkf.dxjokdxxww)) {
                    if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.nufgyqmvbu.f104440iobyxmoadg)) {
                        return v82.wkgbmnqykc.nufgyqmvbu.f116398iobyxmoadg;
                    }
                    if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.eablkybsjg.f104435iobyxmoadg)) {
                        return v82.wkgbmnqykc.eablkybsjg.f116393iobyxmoadg;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                dxjokdxxwwVar = new v82.wkgbmnqykc.dxjokdxxww(((ppxfxbqfkf.dxjokdxxww) ppxfxbqfkfVar).iobyxmoadg());
            }
        }
        return dxjokdxxwwVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gxszxtbevo sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return z82.iobyxmoadg.nufgyqmvbu(state);
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f104447draadjrbmk;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f104449wflxmlrfwp;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.iobyxmoadg.f116341iobyxmoadg)) {
            d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
        } else if (eablkybsjgVar instanceof eablkybsjg.ppxfxbqfkf) {
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(dxjokdxxww.f39382iobyxmoadg.jyumaefscl(((eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg()));
        } else {
            if (eablkybsjgVar instanceof eablkybsjg.C2896eablkybsjg) {
                Object objCllcsxoeiz = cllcsxoeiz(new wkgbmnqykc.iobyxmoadg(((eablkybsjg.C2896eablkybsjg) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (eablkybsjgVar instanceof eablkybsjg.wkgbmnqykc) {
                d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f104446btonecajqb.ppxfxbqfkf(((eablkybsjg.wkgbmnqykc) eablkybsjgVar).iobyxmoadg()));
            } else {
                if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.zoijcleaow.f116344iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                d40.iobyxmoadg.f26931iobyxmoadg.kcexrzcfyt().lqeggnwhkg(this.f104448gtknphoqwx.ppxfxbqfkf(new NonAuthorizedPayload(NonAuthorizedPayload.zoijcleaow.BUY, null, 2, null)));
            }
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
