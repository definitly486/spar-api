package ru.myspar.proloyalty.legacy.presentation.screen.promocatalog;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import pa1.gxszxtbevo;
import vk0.lqeggnwhkg;
import z41.esjtqupxsv;

/* JADX INFO: loaded from: classes5.dex */
public final class eablkybsjg extends tr0.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final gtknphoqwx f97078jyumaefscl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eablkybsjg(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        this.f97078jyumaefscl = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: pa1.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.legacy.presentation.screen.promocatalog.eablkybsjg.ojitshcjhn(this.f76278zdlpuopuiu);
            }
        });
        esjtqupxsv esjtqupxsvVar = (esjtqupxsv) binding.invoke();
        ComposeView cvActionBar = esjtqupxsvVar.f127964ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        String string = wkgbmnqykc().getString(lqeggnwhkg.proloyalty_promo_action_products);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        as0.iobyxmoadg.zoijcleaow(cvActionBar, null, string, null, false, new tg.iobyxmoadg() { // from class: pa1.nufgyqmvbu
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.legacy.presentation.screen.promocatalog.eablkybsjg.wflxmlrfwp(this.f76279zdlpuopuiu);
            }
        }, null, null, 109, null);
        esjtqupxsvVar.f127959eablkybsjg.setLayoutManager(new LinearLayoutManager(wkgbmnqykc()));
        esjtqupxsvVar.f127959eablkybsjg.setAdapter(draadjrbmk());
        esjtqupxsvVar.f127960gxszxtbevo.setOnRefreshListener(new SwipeRefreshLayout.btonecajqb() { // from class: pa1.dxjokdxxww
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.btonecajqb
            public final void iobyxmoadg() {
                ru.myspar.proloyalty.legacy.presentation.screen.promocatalog.eablkybsjg.agtfadlqog(this.f76267iobyxmoadg);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void agtfadlqog(eablkybsjg eablkybsjgVar) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.wkgbmnqykc.f97085iobyxmoadg);
    }

    private final qa1.lqeggnwhkg draadjrbmk() {
        return (qa1.lqeggnwhkg) this.f97078jyumaefscl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qa1.lqeggnwhkg ojitshcjhn(final eablkybsjg eablkybsjgVar) {
        return new qa1.lqeggnwhkg(new tg.draadjrbmk() { // from class: pa1.btonecajqb
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.legacy.presentation.screen.promocatalog.eablkybsjg.rgvfuqvkyq(this.f76266zdlpuopuiu, (sa1.iobyxmoadg) obj);
            }
        }, new tg.draadjrbmk() { // from class: pa1.gtknphoqwx
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.legacy.presentation.screen.promocatalog.eablkybsjg.vdvldrhtss(this.f76268zdlpuopuiu, (sa1.iobyxmoadg) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn rgvfuqvkyq(eablkybsjg eablkybsjgVar, sa1.iobyxmoadg it) {
        zdlpuopuiu.btonecajqb(it, "it");
        eablkybsjgVar.ppxfxbqfkf(new ppxfxbqfkf.iobyxmoadg(it));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn vdvldrhtss(eablkybsjg eablkybsjgVar, sa1.iobyxmoadg it) {
        zdlpuopuiu.btonecajqb(it, "it");
        eablkybsjgVar.ppxfxbqfkf(new ppxfxbqfkf.C2291ppxfxbqfkf(it));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wflxmlrfwp(eablkybsjg eablkybsjgVar) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.zoijcleaow.f97086iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // tr0.iobyxmoadg
    /* JADX INFO: renamed from: oxmwwwfdhm, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(esjtqupxsv binding, gxszxtbevo model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        binding.f127958dxjokdxxww.setText(model.zoijcleaow());
        draadjrbmk().wkgbmnqykc(model.iobyxmoadg());
        binding.f127962lqeggnwhkg.setText(model.wkgbmnqykc());
        AppCompatImageView ivPromotionCatalogBalanceStickers = binding.f127965wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(ivPromotionCatalogBalanceStickers, "ivPromotionCatalogBalanceStickers");
        p41.eablkybsjg.zoijcleaow(ivPromotionCatalogBalanceStickers, model.ppxfxbqfkf());
        ConstraintLayout clPromotionCatalogBalanceInfo = binding.f127966zoijcleaow;
        zdlpuopuiu.dxjokdxxww(clPromotionCatalogBalanceInfo, "clPromotionCatalogBalanceInfo");
        clPromotionCatalogBalanceInfo.setVisibility(model.eablkybsjg() ? 0 : 8);
        binding.f127960gxszxtbevo.setRefreshing(model.gxszxtbevo());
    }
}
