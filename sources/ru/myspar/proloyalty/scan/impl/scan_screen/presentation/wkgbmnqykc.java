package ru.myspar.proloyalty.scan.impl.scan_screen.presentation;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import b31.gxszxtbevo;
import com.google.android.material.textview.MaterialTextView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ln1.jyumaefscl;
import ln1.kcexrzcfyt;
import vk0.lqeggnwhkg;
import z41.yadqdtsiqt;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc extends tr0.iobyxmoadg implements d8.zoijcleaow {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f100429iobyxmoadg;

        static {
            int[] iArr = new int[in1.iobyxmoadg.values().length];
            try {
                iArr[in1.iobyxmoadg.Product.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[in1.iobyxmoadg.ActivationCard.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f100429iobyxmoadg = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        yadqdtsiqt yadqdtsiqtVar = (yadqdtsiqt) binding.invoke();
        ComposeView cvActionBar = yadqdtsiqtVar.f128490wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        jyumaefscl.zoijcleaow(cvActionBar);
        yadqdtsiqtVar.f128491zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: ln1.zdlpuopuiu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.proloyalty.scan.impl.scan_screen.presentation.wkgbmnqykc.dxjokdxxww(this.f63699zdlpuopuiu, view);
            }
        });
        yadqdtsiqtVar.f128489ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: ln1.yggfygwlhe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.proloyalty.scan.impl.scan_screen.presentation.wkgbmnqykc.btonecajqb(this.f63698zdlpuopuiu, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void btonecajqb(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.lqeggnwhkg.f100433iobyxmoadg);
    }

    private final void draadjrbmk(yadqdtsiqt yadqdtsiqtVar, boolean z13) {
        yadqdtsiqtVar.f128489ppxfxbqfkf.setImageResource(z13 ? gxszxtbevo.ic_flash_on : gxszxtbevo.ic_flash_off);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dxjokdxxww(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.iobyxmoadg.f100432iobyxmoadg);
    }

    @Override // tr0.iobyxmoadg
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(yadqdtsiqt binding, kcexrzcfyt model) {
        String string;
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        AppCompatImageView btnToggleFlash = binding.f128489ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(btnToggleFlash, "btnToggleFlash");
        btnToggleFlash.setVisibility(model.ppxfxbqfkf() ? 0 : 8);
        MaterialTextView materialTextView = binding.f128488lqeggnwhkg;
        int i13 = iobyxmoadg.f100429iobyxmoadg[model.iobyxmoadg().ordinal()];
        if (i13 == 1) {
            string = wkgbmnqykc().getString(lqeggnwhkg.proloyalty_scan_and_go_product_scan_instruction);
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            string = wkgbmnqykc().getString(lqeggnwhkg.proloyalty_scan_card_title);
        }
        materialTextView.setText(string);
        draadjrbmk(binding, model.zoijcleaow());
    }
}
