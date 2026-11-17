package ru.myspar.legacy.presentation.screen.promocatalog;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.lmojexxdyd;
import pm.dxjokdxxww;
import sc0.gxszxtbevo;
import tc0.lqeggnwhkg;

/* JADX INFO: loaded from: classes4.dex */
public final class eablkybsjg extends zs.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final gtknphoqwx f89399jyumaefscl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eablkybsjg(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        this.f89399jyumaefscl = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: sc0.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.legacy.presentation.screen.promocatalog.eablkybsjg.ojitshcjhn(this.f105990zdlpuopuiu);
            }
        });
        lmojexxdyd lmojexxdydVar = (lmojexxdyd) binding.invoke();
        ComposeView cvActionBar = lmojexxdydVar.f65766ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        String string = wkgbmnqykc().getString(dxjokdxxww.promo_action_products);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        gt.iobyxmoadg.zoijcleaow(cvActionBar, null, string, null, false, new tg.iobyxmoadg() { // from class: sc0.nufgyqmvbu
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.legacy.presentation.screen.promocatalog.eablkybsjg.wflxmlrfwp(this.f105991zdlpuopuiu);
            }
        }, null, null, 109, null);
        lmojexxdydVar.f65761eablkybsjg.setLayoutManager(new LinearLayoutManager(wkgbmnqykc()));
        lmojexxdydVar.f65761eablkybsjg.setAdapter(draadjrbmk());
        lmojexxdydVar.f65762gxszxtbevo.setOnRefreshListener(new SwipeRefreshLayout.btonecajqb() { // from class: sc0.dxjokdxxww
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.btonecajqb
            public final void iobyxmoadg() {
                ru.myspar.legacy.presentation.screen.promocatalog.eablkybsjg.agtfadlqog(this.f105979iobyxmoadg);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void agtfadlqog(eablkybsjg eablkybsjgVar) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.wkgbmnqykc.f89406iobyxmoadg);
    }

    private final lqeggnwhkg draadjrbmk() {
        return (lqeggnwhkg) this.f89399jyumaefscl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lqeggnwhkg ojitshcjhn(final eablkybsjg eablkybsjgVar) {
        return new lqeggnwhkg(new tg.draadjrbmk() { // from class: sc0.btonecajqb
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.legacy.presentation.screen.promocatalog.eablkybsjg.rgvfuqvkyq(this.f105978zdlpuopuiu, (vc0.iobyxmoadg) obj);
            }
        }, new tg.draadjrbmk() { // from class: sc0.gtknphoqwx
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.legacy.presentation.screen.promocatalog.eablkybsjg.vdvldrhtss(this.f105980zdlpuopuiu, (vc0.iobyxmoadg) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn rgvfuqvkyq(eablkybsjg eablkybsjgVar, vc0.iobyxmoadg it) {
        zdlpuopuiu.btonecajqb(it, "it");
        eablkybsjgVar.ppxfxbqfkf(new ppxfxbqfkf.iobyxmoadg(it));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn vdvldrhtss(eablkybsjg eablkybsjgVar, vc0.iobyxmoadg it) {
        zdlpuopuiu.btonecajqb(it, "it");
        eablkybsjgVar.ppxfxbqfkf(new ppxfxbqfkf.C2048ppxfxbqfkf(it));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wflxmlrfwp(eablkybsjg eablkybsjgVar) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.zoijcleaow.f89407iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: oxmwwwfdhm, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(lmojexxdyd binding, gxszxtbevo model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        binding.f65760dxjokdxxww.setText(model.zoijcleaow());
        draadjrbmk().wkgbmnqykc(model.iobyxmoadg());
        binding.f65764lqeggnwhkg.setText(model.wkgbmnqykc());
        AppCompatImageView ivPromotionCatalogBalanceStickers = binding.f65767wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(ivPromotionCatalogBalanceStickers, "ivPromotionCatalogBalanceStickers");
        c60.wkgbmnqykc.zoijcleaow(ivPromotionCatalogBalanceStickers, model.ppxfxbqfkf());
        ConstraintLayout clPromotionCatalogBalanceInfo = binding.f65768zoijcleaow;
        zdlpuopuiu.dxjokdxxww(clPromotionCatalogBalanceInfo, "clPromotionCatalogBalanceInfo");
        clPromotionCatalogBalanceInfo.setVisibility(model.eablkybsjg() ? 0 : 8);
        binding.f65762gxszxtbevo.setRefreshing(model.gxszxtbevo());
    }
}
