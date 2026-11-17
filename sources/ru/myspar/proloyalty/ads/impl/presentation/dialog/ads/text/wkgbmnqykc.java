package ru.myspar.proloyalty.ads.impl.presentation.dialog.ads.text;

import android.view.View;
import com.google.android.material.button.MaterialButton;
import kotlin.jvm.internal.zdlpuopuiu;
import pm0.lqeggnwhkg;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc extends tr0.iobyxmoadg implements d8.zoijcleaow {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        ((km0.wkgbmnqykc) binding.invoke()).f59837zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: pm0.nufgyqmvbu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.proloyalty.ads.impl.presentation.dialog.ads.text.wkgbmnqykc.nufgyqmvbu(this.f76993zdlpuopuiu, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nufgyqmvbu(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.C2144zoijcleaow.f92148iobyxmoadg);
    }

    @Override // tr0.iobyxmoadg
    /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(km0.wkgbmnqykc binding, lqeggnwhkg model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        binding.f59833eablkybsjg.setData(new l91.zoijcleaow(model.eablkybsjg(), model.zoijcleaow(), model.ppxfxbqfkf(), model.wkgbmnqykc()));
        String strIobyxmoadg = model.iobyxmoadg();
        if (strIobyxmoadg != null) {
            binding.f59837zoijcleaow.setText(strIobyxmoadg);
        }
        MaterialButton btnGoTo = binding.f59837zoijcleaow;
        zdlpuopuiu.dxjokdxxww(btnGoTo, "btnGoTo");
        String strIobyxmoadg2 = model.iobyxmoadg();
        btnGoTo.setVisibility(strIobyxmoadg2 != null && strIobyxmoadg2.length() > 0 ? 0 : 8);
    }
}
