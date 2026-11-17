package ru.myspar.sbp_recurring.impl.presentation;

import androidx.recyclerview.widget.RecyclerView;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import n12.lqeggnwhkg;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc extends zs.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final o12.iobyxmoadg f103089jyumaefscl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        o12.iobyxmoadg iobyxmoadgVar = new o12.iobyxmoadg(new draadjrbmk() { // from class: n12.nufgyqmvbu
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.sbp_recurring.impl.presentation.wkgbmnqykc.btonecajqb(this.f68438zdlpuopuiu, (p12.iobyxmoadg.C1655iobyxmoadg) obj);
            }
        }, new tg.iobyxmoadg() { // from class: n12.dxjokdxxww
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.sbp_recurring.impl.presentation.wkgbmnqykc.gtknphoqwx(this.f68433zdlpuopuiu);
            }
        }, new tg.iobyxmoadg() { // from class: n12.btonecajqb
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.sbp_recurring.impl.presentation.wkgbmnqykc.draadjrbmk(this.f68432zdlpuopuiu);
            }
        });
        this.f103089jyumaefscl = iobyxmoadgVar;
        l12.zoijcleaow zoijcleaowVar = (l12.zoijcleaow) binding.invoke();
        RecyclerView rvBankingApps = zoijcleaowVar.f61353zoijcleaow;
        zdlpuopuiu.dxjokdxxww(rvBankingApps, "rvBankingApps");
        e60.zoijcleaow.ppxfxbqfkf(rvBankingApps, iobyxmoadgVar, zoijcleaowVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn btonecajqb(wkgbmnqykc wkgbmnqykcVar, p12.iobyxmoadg.C1655iobyxmoadg it) {
        zdlpuopuiu.btonecajqb(it, "it");
        wkgbmnqykcVar.ppxfxbqfkf(new zoijcleaow.C2494zoijcleaow(it.wkgbmnqykc()));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn draadjrbmk(wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.iobyxmoadg.f103090iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gtknphoqwx(wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.ppxfxbqfkf.f103091iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(l12.zoijcleaow binding, lqeggnwhkg model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        binding.f61352wkgbmnqykc.setText(model.ppxfxbqfkf());
        binding.f61351ppxfxbqfkf.setText(model.zoijcleaow());
        this.f103089jyumaefscl.wkgbmnqykc(model.iobyxmoadg());
    }
}
