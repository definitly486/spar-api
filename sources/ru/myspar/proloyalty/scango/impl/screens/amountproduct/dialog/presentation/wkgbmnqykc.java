package ru.myspar.proloyalty.scango.impl.screens.amountproduct.dialog.presentation;

import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import no1.lqeggnwhkg;
import p41.eablkybsjg;
import ru.myspar.proloyalty.scango.impl.screens.amountproduct.view.ScanGoProductCounter;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc extends tr0.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final gtknphoqwx f100511jyumaefscl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        this.f100511jyumaefscl = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: no1.nufgyqmvbu
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.scango.impl.screens.amountproduct.dialog.presentation.wkgbmnqykc.wflxmlrfwp(this.f70474zdlpuopuiu);
            }
        });
        ScanGoProductCounter scanGoProductCounter = ((go1.iobyxmoadg) binding.invoke()).f38040gxszxtbevo;
        scanGoProductCounter.setOnDecreaseAmountClicked(new tg.iobyxmoadg() { // from class: no1.dxjokdxxww
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.scango.impl.screens.amountproduct.dialog.presentation.wkgbmnqykc.gtknphoqwx(this.f70469zdlpuopuiu);
            }
        });
        scanGoProductCounter.setOnIncreaseAmountClicked(new tg.iobyxmoadg() { // from class: no1.btonecajqb
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.scango.impl.screens.amountproduct.dialog.presentation.wkgbmnqykc.draadjrbmk(this.f70468zdlpuopuiu);
            }
        });
    }

    private final ho1.zoijcleaow btonecajqb() {
        return (ho1.zoijcleaow) this.f100511jyumaefscl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn draadjrbmk(wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.wkgbmnqykc.f100514iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gtknphoqwx(wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.ppxfxbqfkf.f100513iobyxmoadg);
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
    public static final ho1.zoijcleaow wflxmlrfwp(wkgbmnqykc wkgbmnqykcVar) {
        return new ho1.zoijcleaow(wkgbmnqykcVar.wkgbmnqykc());
    }

    @Override // tr0.iobyxmoadg
    /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(go1.iobyxmoadg binding, lqeggnwhkg model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        ojitshcjhn(model.ppxfxbqfkf());
        MaterialTextView tvFirstMessage = binding.f38042lqeggnwhkg;
        zdlpuopuiu.dxjokdxxww(tvFirstMessage, "tvFirstMessage");
        tvFirstMessage.setVisibility(model.zoijcleaow() ? 0 : 8);
        ShapeableImageView ivProductPic = binding.f38039eablkybsjg.f38104ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(ivProductPic, "ivProductPic");
        eablkybsjg.zoijcleaow(ivProductPic, model.iobyxmoadg().getPictureUrl());
        binding.f38040gxszxtbevo.setAmount(model.iobyxmoadg().getQuantity());
        binding.f38039eablkybsjg.f38105wkgbmnqykc.setText(model.iobyxmoadg().getName());
        binding.f38039eablkybsjg.f38100eablkybsjg.setText(model.iobyxmoadg().getTotalPrice());
        binding.f38039eablkybsjg.f38101gxszxtbevo.setText(model.iobyxmoadg().getPricePerUnit());
        binding.f38039eablkybsjg.f38103lqeggnwhkg.setText(model.iobyxmoadg().getAmount());
    }
}
