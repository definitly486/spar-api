package ru.myspar.ads.impl.presentation.dialog.ads.text;

import android.view.View;
import com.google.android.material.button.MaterialButton;
import fo.lqeggnwhkg;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class wkgbmnqykc extends zs.iobyxmoadg implements d8.zoijcleaow {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        ((zn.wkgbmnqykc) binding.invoke()).f130470zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: fo.nufgyqmvbu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.ads.impl.presentation.dialog.ads.text.wkgbmnqykc.nufgyqmvbu(this.f34491zdlpuopuiu, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nufgyqmvbu(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.C1900zoijcleaow.f84123iobyxmoadg);
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(zn.wkgbmnqykc binding, lqeggnwhkg model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        binding.f130466eablkybsjg.setData(new mb0.zoijcleaow(model.eablkybsjg(), model.zoijcleaow(), model.ppxfxbqfkf(), model.wkgbmnqykc()));
        String strIobyxmoadg = model.iobyxmoadg();
        if (strIobyxmoadg != null) {
            binding.f130470zoijcleaow.setText(strIobyxmoadg);
        }
        MaterialButton btnGoTo = binding.f130470zoijcleaow;
        zdlpuopuiu.dxjokdxxww(btnGoTo, "btnGoTo");
        String strIobyxmoadg2 = model.iobyxmoadg();
        btnGoTo.setVisibility(strIobyxmoadg2 != null && strIobyxmoadg2.length() > 0 ? 0 : 8);
    }
}
