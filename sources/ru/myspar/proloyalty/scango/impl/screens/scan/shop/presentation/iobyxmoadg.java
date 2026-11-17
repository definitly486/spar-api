package ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import androidx.lifecycle.pkzmftpjix;
import b31.gxszxtbevo;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lp1.lqeggnwhkg;
import m21.dxjokdxxww;
import mj.kcexrzcfyt;
import np1.cdpycssgdh;
import ru.myspar.proloyalty.purchases.api.model.PurchasesHistoryArgs;
import ru.myspar.proloyalty.scango.impl.screens.scan.shop.domain.store.State;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final q41.iobyxmoadg f101045btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f101046draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final ri1.iobyxmoadg f101047gtknphoqwx;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final draadjrbmk f101048wflxmlrfwp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, q41.iobyxmoadg resourcesManager, ri1.iobyxmoadg purchasesFeatureApi) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        zdlpuopuiu.btonecajqb(purchasesFeatureApi, "purchasesFeatureApi");
        this.f101045btonecajqb = resourcesManager;
        this.f101047gtknphoqwx = purchasesFeatureApi;
        this.f101046draadjrbmk = new draadjrbmk() { // from class: np1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.iobyxmoadg.crxdokpmqz((State) obj);
            }
        };
        this.f101048wflxmlrfwp = new draadjrbmk() { // from class: np1.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.iobyxmoadg.ntlheqmsrt((ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.ppxfxbqfkf) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cdpycssgdh crxdokpmqz(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return new cdpycssgdh(state.getFlashButtonVisible(), state.getFlashButtonEnable() ? gxszxtbevo.ic_flash_on : gxszxtbevo.ic_flash_off, state.getIsLoading());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lp1.wkgbmnqykc ntlheqmsrt(ppxfxbqfkf ppxfxbqfkfVar) {
        lp1.wkgbmnqykc gtknphoqwxVar;
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.iobyxmoadg.f101056iobyxmoadg)) {
            return lp1.wkgbmnqykc.iobyxmoadg.f63835iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.vdvldrhtss.f101062iobyxmoadg)) {
            return lp1.wkgbmnqykc.vdvldrhtss.f63841iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.C2435ppxfxbqfkf) {
            gtknphoqwxVar = new lp1.wkgbmnqykc.ppxfxbqfkf(((ppxfxbqfkf.C2435ppxfxbqfkf) ppxfxbqfkfVar).iobyxmoadg());
        } else if (ppxfxbqfkfVar instanceof ppxfxbqfkf.wkgbmnqykc) {
            gtknphoqwxVar = new lp1.wkgbmnqykc.C1311wkgbmnqykc(((ppxfxbqfkf.wkgbmnqykc) ppxfxbqfkfVar).iobyxmoadg());
        } else {
            if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.eablkybsjg.f101053iobyxmoadg)) {
                return lp1.wkgbmnqykc.eablkybsjg.f63832iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.gxszxtbevo.f101055iobyxmoadg)) {
                return lp1.wkgbmnqykc.gxszxtbevo.f63834iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.lqeggnwhkg.f101057iobyxmoadg)) {
                return lp1.wkgbmnqykc.lqeggnwhkg.f63836iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.nufgyqmvbu.f101058iobyxmoadg)) {
                return lp1.wkgbmnqykc.nufgyqmvbu.f63837iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.dxjokdxxww.f101052iobyxmoadg)) {
                return lp1.wkgbmnqykc.dxjokdxxww.f63831iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.btonecajqb.f101050iobyxmoadg)) {
                return lp1.wkgbmnqykc.btonecajqb.f63829iobyxmoadg;
            }
            if (!(ppxfxbqfkfVar instanceof ppxfxbqfkf.gtknphoqwx)) {
                if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.draadjrbmk.f101051iobyxmoadg)) {
                    return lp1.wkgbmnqykc.draadjrbmk.f63830iobyxmoadg;
                }
                if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.wflxmlrfwp.f101063iobyxmoadg)) {
                    return lp1.wkgbmnqykc.wflxmlrfwp.f63842iobyxmoadg;
                }
                if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.agtfadlqog.f101049iobyxmoadg)) {
                    return lp1.wkgbmnqykc.agtfadlqog.f63828iobyxmoadg;
                }
                if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.ojitshcjhn.f101059iobyxmoadg)) {
                    return lp1.wkgbmnqykc.ojitshcjhn.f63838iobyxmoadg;
                }
                if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.rgvfuqvkyq.f101061iobyxmoadg)) {
                    return lp1.wkgbmnqykc.rgvfuqvkyq.f63840iobyxmoadg;
                }
                if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.zoijcleaow.f101065iobyxmoadg)) {
                    return lp1.wkgbmnqykc.zoijcleaow.f63844iobyxmoadg;
                }
                throw new NoWhenBranchMatchedException();
            }
            gtknphoqwxVar = new lp1.wkgbmnqykc.gtknphoqwx(((ppxfxbqfkf.gtknphoqwx) ppxfxbqfkfVar).iobyxmoadg());
        }
        return gtknphoqwxVar;
    }

    private final CharSequence sopmlzcsov(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f101045btonecajqb.getString(on1.wkgbmnqykc.proloyalty_scan_and_go_shop_scan_template, str));
        spannableStringBuilder.setSpan(new StyleSpan(1), kcexrzcfyt.ydmasvzmpa(spannableStringBuilder, str, 0, false, 6, null), spannableStringBuilder.length(), 33);
        return SpannableString.valueOf(spannableStringBuilder);
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f101046draadjrbmk;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f101048wflxmlrfwp;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(lp1.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof lp1.eablkybsjg.wkgbmnqykc) {
            Object objCllcsxoeiz = cllcsxoeiz(new wkgbmnqykc.gtknphoqwx(((lp1.eablkybsjg.wkgbmnqykc) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, lp1.eablkybsjg.iobyxmoadg.f63785iobyxmoadg)) {
            i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
        } else {
            if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, lp1.eablkybsjg.zoijcleaow.f63798iobyxmoadg)) {
                Object objCllcsxoeiz2 = cllcsxoeiz(wkgbmnqykc.iobyxmoadg.f101074iobyxmoadg, gxszxtbevoVar);
                return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, lp1.eablkybsjg.ppxfxbqfkf.f63792iobyxmoadg)) {
                Object objCllcsxoeiz3 = cllcsxoeiz(wkgbmnqykc.zoijcleaow.f101082iobyxmoadg, gxszxtbevoVar);
                return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (eablkybsjgVar instanceof lp1.eablkybsjg.C1309eablkybsjg) {
                Object objCllcsxoeiz4 = cllcsxoeiz(new wkgbmnqykc.ppxfxbqfkf(((lp1.eablkybsjg.C1309eablkybsjg) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                return objCllcsxoeiz4 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz4 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, lp1.eablkybsjg.gxszxtbevo.f63784iobyxmoadg)) {
                Object objCllcsxoeiz5 = cllcsxoeiz(wkgbmnqykc.C2436wkgbmnqykc.f101081iobyxmoadg, gxszxtbevoVar);
                return objCllcsxoeiz5 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz5 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (eablkybsjgVar instanceof lp1.eablkybsjg.lqeggnwhkg) {
                lp1.eablkybsjg.lqeggnwhkg lqeggnwhkgVar = (lp1.eablkybsjg.lqeggnwhkg) eablkybsjgVar;
                Object objCllcsxoeiz6 = cllcsxoeiz(new wkgbmnqykc.eablkybsjg(sopmlzcsov(lqeggnwhkgVar.iobyxmoadg()), lqeggnwhkgVar.zoijcleaow()), gxszxtbevoVar);
                return objCllcsxoeiz6 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz6 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, lp1.eablkybsjg.nufgyqmvbu.f63789iobyxmoadg)) {
                Object objCllcsxoeiz7 = cllcsxoeiz(wkgbmnqykc.gxszxtbevo.f101073iobyxmoadg, gxszxtbevoVar);
                return objCllcsxoeiz7 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz7 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, lp1.eablkybsjg.dxjokdxxww.f63781iobyxmoadg)) {
                Object objCllcsxoeiz8 = cllcsxoeiz(wkgbmnqykc.lqeggnwhkg.f101075iobyxmoadg, gxszxtbevoVar);
                return objCllcsxoeiz8 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz8 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, lp1.eablkybsjg.btonecajqb.f63779iobyxmoadg)) {
                Object objCllcsxoeiz9 = cllcsxoeiz(wkgbmnqykc.nufgyqmvbu.f101076iobyxmoadg, gxszxtbevoVar);
                return objCllcsxoeiz9 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz9 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (eablkybsjgVar instanceof lp1.eablkybsjg.gtknphoqwx) {
                Object objCllcsxoeiz10 = cllcsxoeiz(new wkgbmnqykc.dxjokdxxww(((lp1.eablkybsjg.gtknphoqwx) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                return objCllcsxoeiz10 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz10 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, lp1.eablkybsjg.draadjrbmk.f63780iobyxmoadg)) {
                Object objCllcsxoeiz11 = cllcsxoeiz(wkgbmnqykc.btonecajqb.f101067iobyxmoadg, gxszxtbevoVar);
                return objCllcsxoeiz11 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz11 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, lp1.eablkybsjg.wflxmlrfwp.f63795iobyxmoadg)) {
                Object objCllcsxoeiz12 = cllcsxoeiz(wkgbmnqykc.draadjrbmk.f101068iobyxmoadg, gxszxtbevoVar);
                return objCllcsxoeiz12 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz12 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (eablkybsjgVar instanceof lp1.eablkybsjg.agtfadlqog) {
                Object objCllcsxoeiz13 = cllcsxoeiz(new wkgbmnqykc.wflxmlrfwp(((lp1.eablkybsjg.agtfadlqog) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                return objCllcsxoeiz13 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz13 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, lp1.eablkybsjg.ojitshcjhn.f63790iobyxmoadg)) {
                Object objCllcsxoeiz14 = cllcsxoeiz(wkgbmnqykc.agtfadlqog.f101066iobyxmoadg, gxszxtbevoVar);
                return objCllcsxoeiz14 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz14 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, lp1.eablkybsjg.rgvfuqvkyq.f63793iobyxmoadg)) {
                Object objCllcsxoeiz15 = cllcsxoeiz(wkgbmnqykc.ojitshcjhn.f101077iobyxmoadg, gxszxtbevoVar);
                return objCllcsxoeiz15 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz15 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, lp1.eablkybsjg.zdlpuopuiu.f63797iobyxmoadg)) {
                Object objCllcsxoeiz16 = cllcsxoeiz(wkgbmnqykc.rgvfuqvkyq.f101079iobyxmoadg, gxszxtbevoVar);
                return objCllcsxoeiz16 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz16 : wwaezpbzkn.f37140iobyxmoadg;
            }
            if (eablkybsjgVar instanceof lp1.eablkybsjg.vdvldrhtss) {
                i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f101047gtknphoqwx.ppxfxbqfkf(new PurchasesHistoryArgs(wz0.iobyxmoadg.SHOW_ONLY)));
            } else if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, lp1.eablkybsjg.oxmwwwfdhm.f63791iobyxmoadg)) {
                i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(ru.myspar.proloyalty.scango.impl.screens.cart.presentation.zoijcleaow.zoijcleaow());
            } else {
                if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, lp1.eablkybsjg.kcexrzcfyt.f63786iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(dxjokdxxww.f64969iobyxmoadg.cqumvgiudr());
            }
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
