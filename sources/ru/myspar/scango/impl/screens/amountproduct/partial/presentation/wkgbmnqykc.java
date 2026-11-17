package ru.myspar.scango.impl.screens.amountproduct.partial.presentation;

import gg.wwaezpbzkn;
import k22.gxszxtbevo;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.scango.impl.screens.amountproduct.view.ScanGoProductCounter;
import t22.nufgyqmvbu;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc extends zs.iobyxmoadg implements d8.zoijcleaow {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        ScanGoProductCounter scanGoProductCounter = ((gxszxtbevo) binding.invoke()).f53567gxszxtbevo;
        scanGoProductCounter.setOnDecreaseAmountClicked(new tg.iobyxmoadg() { // from class: t22.dxjokdxxww
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.scango.impl.screens.amountproduct.partial.presentation.wkgbmnqykc.dxjokdxxww(this.f109336zdlpuopuiu);
            }
        });
        scanGoProductCounter.setOnIncreaseAmountClicked(new tg.iobyxmoadg() { // from class: t22.btonecajqb
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.scango.impl.screens.amountproduct.partial.presentation.wkgbmnqykc.btonecajqb(this.f109335zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn btonecajqb(wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.wkgbmnqykc.f103228iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn dxjokdxxww(wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.ppxfxbqfkf.f103227iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(gxszxtbevo binding, nufgyqmvbu model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        ppxfxbqfkf(new zoijcleaow.eablkybsjg(model.lqeggnwhkg()));
        com.bumptech.glide.zoijcleaow.zdlpuopuiu(wkgbmnqykc()).kcexrzcfyt(model.ppxfxbqfkf()).wizcaqwiak(binding.f53566eablkybsjg.f53637ppxfxbqfkf);
        binding.f53567gxszxtbevo.setAmount(model.eablkybsjg());
        binding.f53566eablkybsjg.f53638wkgbmnqykc.setText(model.zoijcleaow());
        binding.f53566eablkybsjg.f53633eablkybsjg.setText(model.gxszxtbevo());
        binding.f53566eablkybsjg.f53634gxszxtbevo.setText(model.wkgbmnqykc());
        binding.f53566eablkybsjg.f53636lqeggnwhkg.setText(model.iobyxmoadg());
    }
}
