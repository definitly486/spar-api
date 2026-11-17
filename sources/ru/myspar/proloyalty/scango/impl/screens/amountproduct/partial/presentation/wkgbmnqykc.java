package ru.myspar.proloyalty.scango.impl.screens.amountproduct.partial.presentation;

import gg.wwaezpbzkn;
import go1.gxszxtbevo;
import kotlin.jvm.internal.zdlpuopuiu;
import po1.nufgyqmvbu;
import ru.myspar.proloyalty.scango.impl.screens.amountproduct.view.ScanGoProductCounter;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc extends tr0.iobyxmoadg implements d8.zoijcleaow {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        ScanGoProductCounter scanGoProductCounter = ((gxszxtbevo) binding.invoke()).f38034gxszxtbevo;
        scanGoProductCounter.setOnDecreaseAmountClicked(new tg.iobyxmoadg() { // from class: po1.dxjokdxxww
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.scango.impl.screens.amountproduct.partial.presentation.wkgbmnqykc.dxjokdxxww(this.f77051zdlpuopuiu);
            }
        });
        scanGoProductCounter.setOnIncreaseAmountClicked(new tg.iobyxmoadg() { // from class: po1.btonecajqb
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.scango.impl.screens.amountproduct.partial.presentation.wkgbmnqykc.btonecajqb(this.f77050zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn btonecajqb(wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.wkgbmnqykc.f100572iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn dxjokdxxww(wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.ppxfxbqfkf.f100571iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // tr0.iobyxmoadg
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(gxszxtbevo binding, nufgyqmvbu model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        ppxfxbqfkf(new zoijcleaow.eablkybsjg(model.lqeggnwhkg()));
        com.bumptech.glide.zoijcleaow.zdlpuopuiu(wkgbmnqykc()).kcexrzcfyt(model.ppxfxbqfkf()).wizcaqwiak(binding.f38033eablkybsjg.f38104ppxfxbqfkf);
        binding.f38034gxszxtbevo.setAmount(model.eablkybsjg());
        binding.f38033eablkybsjg.f38105wkgbmnqykc.setText(model.zoijcleaow());
        binding.f38033eablkybsjg.f38100eablkybsjg.setText(model.gxszxtbevo());
        binding.f38033eablkybsjg.f38101gxszxtbevo.setText(model.wkgbmnqykc());
        binding.f38033eablkybsjg.f38103lqeggnwhkg.setText(model.iobyxmoadg());
    }
}
