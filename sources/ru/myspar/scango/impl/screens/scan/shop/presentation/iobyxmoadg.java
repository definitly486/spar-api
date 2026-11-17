package ru.myspar.scango.impl.screens.scan.shop.presentation;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import h40.dxjokdxxww;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import p32.lqeggnwhkg;
import r32.cdpycssgdh;
import ru.myspar.purchases.api.model.PurchasesHistoryArgs;
import ru.myspar.scango.impl.screens.scan.shop.domain.store.State;
import s40.gxszxtbevo;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final d60.iobyxmoadg f103702btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f103703draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final lx1.iobyxmoadg f103704gtknphoqwx;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final draadjrbmk f103705wflxmlrfwp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, d60.iobyxmoadg resourcesManager, lx1.iobyxmoadg purchasesFeatureApi) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        zdlpuopuiu.btonecajqb(purchasesFeatureApi, "purchasesFeatureApi");
        this.f103702btonecajqb = resourcesManager;
        this.f103704gtknphoqwx = purchasesFeatureApi;
        this.f103703draadjrbmk = new draadjrbmk() { // from class: r32.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.scango.impl.screens.scan.shop.presentation.iobyxmoadg.crxdokpmqz((State) obj);
            }
        };
        this.f103705wflxmlrfwp = new draadjrbmk() { // from class: r32.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.scango.impl.screens.scan.shop.presentation.iobyxmoadg.ntlheqmsrt((ru.myspar.scango.impl.screens.scan.shop.presentation.ppxfxbqfkf) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cdpycssgdh crxdokpmqz(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return new cdpycssgdh(state.getFlashButtonVisible(), state.getFlashButtonEnable() ? gxszxtbevo.ic_flash_on : gxszxtbevo.ic_flash_off, state.getIsLoading());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p32.wkgbmnqykc ntlheqmsrt(ppxfxbqfkf ppxfxbqfkfVar) {
        p32.wkgbmnqykc gtknphoqwxVar;
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.iobyxmoadg.f103713iobyxmoadg)) {
            return p32.wkgbmnqykc.iobyxmoadg.f75579iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.vdvldrhtss.f103719iobyxmoadg)) {
            return p32.wkgbmnqykc.vdvldrhtss.f75585iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.C2514ppxfxbqfkf) {
            gtknphoqwxVar = new p32.wkgbmnqykc.ppxfxbqfkf(((ppxfxbqfkf.C2514ppxfxbqfkf) ppxfxbqfkfVar).iobyxmoadg());
        } else if (ppxfxbqfkfVar instanceof ppxfxbqfkf.wkgbmnqykc) {
            gtknphoqwxVar = new p32.wkgbmnqykc.C1664wkgbmnqykc(((ppxfxbqfkf.wkgbmnqykc) ppxfxbqfkfVar).iobyxmoadg());
        } else {
            if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.eablkybsjg.f103710iobyxmoadg)) {
                return p32.wkgbmnqykc.eablkybsjg.f75576iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.gxszxtbevo.f103712iobyxmoadg)) {
                return p32.wkgbmnqykc.gxszxtbevo.f75578iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.lqeggnwhkg.f103714iobyxmoadg)) {
                return p32.wkgbmnqykc.lqeggnwhkg.f75580iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.nufgyqmvbu.f103715iobyxmoadg)) {
                return p32.wkgbmnqykc.nufgyqmvbu.f75581iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.dxjokdxxww.f103709iobyxmoadg)) {
                return p32.wkgbmnqykc.dxjokdxxww.f75575iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.btonecajqb.f103707iobyxmoadg)) {
                return p32.wkgbmnqykc.btonecajqb.f75573iobyxmoadg;
            }
            if (!(ppxfxbqfkfVar instanceof ppxfxbqfkf.gtknphoqwx)) {
                if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.draadjrbmk.f103708iobyxmoadg)) {
                    return p32.wkgbmnqykc.draadjrbmk.f75574iobyxmoadg;
                }
                if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.wflxmlrfwp.f103720iobyxmoadg)) {
                    return p32.wkgbmnqykc.wflxmlrfwp.f75586iobyxmoadg;
                }
                if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.agtfadlqog.f103706iobyxmoadg)) {
                    return p32.wkgbmnqykc.agtfadlqog.f75572iobyxmoadg;
                }
                if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.ojitshcjhn.f103716iobyxmoadg)) {
                    return p32.wkgbmnqykc.ojitshcjhn.f75582iobyxmoadg;
                }
                if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.rgvfuqvkyq.f103718iobyxmoadg)) {
                    return p32.wkgbmnqykc.rgvfuqvkyq.f75584iobyxmoadg;
                }
                if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.zoijcleaow.f103722iobyxmoadg)) {
                    return p32.wkgbmnqykc.zoijcleaow.f75588iobyxmoadg;
                }
                throw new NoWhenBranchMatchedException();
            }
            gtknphoqwxVar = new p32.wkgbmnqykc.gtknphoqwx(((ppxfxbqfkf.gtknphoqwx) ppxfxbqfkfVar).iobyxmoadg());
        }
        return gtknphoqwxVar;
    }

    private final CharSequence sopmlzcsov(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f103702btonecajqb.getString(s12.wkgbmnqykc.scan_and_go_shop_scan_template, str));
        spannableStringBuilder.setSpan(new StyleSpan(1), kcexrzcfyt.ydmasvzmpa(spannableStringBuilder, str, 0, false, 6, null), spannableStringBuilder.length(), 33);
        return SpannableString.valueOf(spannableStringBuilder);
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f103703draadjrbmk;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f103705wflxmlrfwp;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(p32.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof p32.eablkybsjg.wkgbmnqykc) {
            Object objCllcsxoeiz = cllcsxoeiz(new wkgbmnqykc.gtknphoqwx(((p32.eablkybsjg.wkgbmnqykc) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, p32.eablkybsjg.iobyxmoadg.f75529iobyxmoadg)) {
            d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
        } else {
            if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, p32.eablkybsjg.zoijcleaow.f75542iobyxmoadg)) {
                Object objCllcsxoeiz2 = cllcsxoeiz(wkgbmnqykc.iobyxmoadg.f103731iobyxmoadg, gxszxtbevoVar);
                return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, p32.eablkybsjg.ppxfxbqfkf.f75536iobyxmoadg)) {
                Object objCllcsxoeiz3 = cllcsxoeiz(wkgbmnqykc.zoijcleaow.f103739iobyxmoadg, gxszxtbevoVar);
                return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (eablkybsjgVar instanceof p32.eablkybsjg.C1662eablkybsjg) {
                Object objCllcsxoeiz4 = cllcsxoeiz(new wkgbmnqykc.ppxfxbqfkf(((p32.eablkybsjg.C1662eablkybsjg) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                return objCllcsxoeiz4 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz4 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, p32.eablkybsjg.gxszxtbevo.f75528iobyxmoadg)) {
                Object objCllcsxoeiz5 = cllcsxoeiz(wkgbmnqykc.C2515wkgbmnqykc.f103738iobyxmoadg, gxszxtbevoVar);
                return objCllcsxoeiz5 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz5 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (eablkybsjgVar instanceof p32.eablkybsjg.lqeggnwhkg) {
                p32.eablkybsjg.lqeggnwhkg lqeggnwhkgVar = (p32.eablkybsjg.lqeggnwhkg) eablkybsjgVar;
                Object objCllcsxoeiz6 = cllcsxoeiz(new wkgbmnqykc.eablkybsjg(sopmlzcsov(lqeggnwhkgVar.iobyxmoadg()), lqeggnwhkgVar.zoijcleaow()), gxszxtbevoVar);
                return objCllcsxoeiz6 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz6 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, p32.eablkybsjg.nufgyqmvbu.f75533iobyxmoadg)) {
                Object objCllcsxoeiz7 = cllcsxoeiz(wkgbmnqykc.gxszxtbevo.f103730iobyxmoadg, gxszxtbevoVar);
                return objCllcsxoeiz7 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz7 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, p32.eablkybsjg.dxjokdxxww.f75525iobyxmoadg)) {
                Object objCllcsxoeiz8 = cllcsxoeiz(wkgbmnqykc.lqeggnwhkg.f103732iobyxmoadg, gxszxtbevoVar);
                return objCllcsxoeiz8 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz8 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, p32.eablkybsjg.btonecajqb.f75523iobyxmoadg)) {
                Object objCllcsxoeiz9 = cllcsxoeiz(wkgbmnqykc.nufgyqmvbu.f103733iobyxmoadg, gxszxtbevoVar);
                return objCllcsxoeiz9 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz9 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (eablkybsjgVar instanceof p32.eablkybsjg.gtknphoqwx) {
                Object objCllcsxoeiz10 = cllcsxoeiz(new wkgbmnqykc.dxjokdxxww(((p32.eablkybsjg.gtknphoqwx) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                return objCllcsxoeiz10 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz10 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, p32.eablkybsjg.draadjrbmk.f75524iobyxmoadg)) {
                Object objCllcsxoeiz11 = cllcsxoeiz(wkgbmnqykc.btonecajqb.f103724iobyxmoadg, gxszxtbevoVar);
                return objCllcsxoeiz11 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz11 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, p32.eablkybsjg.wflxmlrfwp.f75539iobyxmoadg)) {
                Object objCllcsxoeiz12 = cllcsxoeiz(wkgbmnqykc.draadjrbmk.f103725iobyxmoadg, gxszxtbevoVar);
                return objCllcsxoeiz12 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz12 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (eablkybsjgVar instanceof p32.eablkybsjg.agtfadlqog) {
                Object objCllcsxoeiz13 = cllcsxoeiz(new wkgbmnqykc.wflxmlrfwp(((p32.eablkybsjg.agtfadlqog) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                return objCllcsxoeiz13 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz13 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, p32.eablkybsjg.ojitshcjhn.f75534iobyxmoadg)) {
                Object objCllcsxoeiz14 = cllcsxoeiz(wkgbmnqykc.agtfadlqog.f103723iobyxmoadg, gxszxtbevoVar);
                return objCllcsxoeiz14 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz14 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, p32.eablkybsjg.rgvfuqvkyq.f75537iobyxmoadg)) {
                Object objCllcsxoeiz15 = cllcsxoeiz(wkgbmnqykc.ojitshcjhn.f103734iobyxmoadg, gxszxtbevoVar);
                return objCllcsxoeiz15 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz15 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, p32.eablkybsjg.zdlpuopuiu.f75541iobyxmoadg)) {
                Object objCllcsxoeiz16 = cllcsxoeiz(wkgbmnqykc.rgvfuqvkyq.f103736iobyxmoadg, gxszxtbevoVar);
                return objCllcsxoeiz16 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz16 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (eablkybsjgVar instanceof p32.eablkybsjg.vdvldrhtss) {
                d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f103704gtknphoqwx.dxjokdxxww(new PurchasesHistoryArgs(g10.iobyxmoadg.SHOW_ONLY)));
            } else if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, p32.eablkybsjg.oxmwwwfdhm.f75535iobyxmoadg)) {
                d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(ru.myspar.scango.impl.screens.cart.presentation.zoijcleaow.zoijcleaow());
            } else {
                if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, p32.eablkybsjg.kcexrzcfyt.f75530iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(dxjokdxxww.f39382iobyxmoadg.cqumvgiudr());
            }
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
