package ru.myspar.scango.impl.screens.amountproduct.dialog.presentation;

import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import r22.lqeggnwhkg;
import ru.myspar.scango.impl.screens.amountproduct.view.ScanGoProductCounter;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc extends zs.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final gtknphoqwx f103167jyumaefscl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        this.f103167jyumaefscl = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: r22.nufgyqmvbu
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.scango.impl.screens.amountproduct.dialog.presentation.wkgbmnqykc.wflxmlrfwp(this.f81487zdlpuopuiu);
            }
        });
        ScanGoProductCounter scanGoProductCounter = ((k22.iobyxmoadg) binding.invoke()).f53573gxszxtbevo;
        scanGoProductCounter.setOnDecreaseAmountClicked(new tg.iobyxmoadg() { // from class: r22.dxjokdxxww
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.scango.impl.screens.amountproduct.dialog.presentation.wkgbmnqykc.gtknphoqwx(this.f81482zdlpuopuiu);
            }
        });
        scanGoProductCounter.setOnIncreaseAmountClicked(new tg.iobyxmoadg() { // from class: r22.btonecajqb
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.scango.impl.screens.amountproduct.dialog.presentation.wkgbmnqykc.draadjrbmk(this.f81481zdlpuopuiu);
            }
        });
    }

    private final l22.zoijcleaow btonecajqb() {
        return (l22.zoijcleaow) this.f103167jyumaefscl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn draadjrbmk(wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.wkgbmnqykc.f103170iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gtknphoqwx(wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.ppxfxbqfkf.f103169iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void ojitshcjhn(boolean z13) {
        if (z13) {
            btonecajqb().show();
        } else {
            btonecajqb().dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l22.zoijcleaow wflxmlrfwp(wkgbmnqykc wkgbmnqykcVar) {
        return new l22.zoijcleaow(wkgbmnqykcVar.wkgbmnqykc());
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(k22.iobyxmoadg binding, lqeggnwhkg model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        ojitshcjhn(model.ppxfxbqfkf());
        MaterialTextView tvFirstMessage = binding.f53575lqeggnwhkg;
        zdlpuopuiu.dxjokdxxww(tvFirstMessage, "tvFirstMessage");
        tvFirstMessage.setVisibility(model.zoijcleaow() ? 0 : 8);
        ShapeableImageView ivProductPic = binding.f53572eablkybsjg.f53637ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(ivProductPic, "ivProductPic");
        c60.wkgbmnqykc.zoijcleaow(ivProductPic, model.iobyxmoadg().getPictureUrl());
        binding.f53573gxszxtbevo.setAmount(model.iobyxmoadg().getQuantity());
        binding.f53572eablkybsjg.f53638wkgbmnqykc.setText(model.iobyxmoadg().getName());
        binding.f53572eablkybsjg.f53633eablkybsjg.setText(model.iobyxmoadg().getTotalPrice());
        binding.f53572eablkybsjg.f53634gxszxtbevo.setText(model.iobyxmoadg().getPricePerUnit());
        binding.f53572eablkybsjg.f53636lqeggnwhkg.setText(model.iobyxmoadg().getAmount());
    }
}
