package ru.myspar.echecks.impl.dialog.presentation;

import android.view.View;
import android.widget.CompoundButton;
import androidx.compose.ui.platform.ComposeView;
import k90.lqeggnwhkg;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc extends zs.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final CompoundButton.OnCheckedChangeListener f88229jyumaefscl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: k90.nufgyqmvbu
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z13) {
                ru.myspar.echecks.impl.dialog.presentation.wkgbmnqykc.btonecajqb(this.f54209iobyxmoadg, compoundButton, z13);
            }
        };
        this.f88229jyumaefscl = onCheckedChangeListener;
        i90.iobyxmoadg iobyxmoadgVar = (i90.iobyxmoadg) binding.invoke();
        iobyxmoadgVar.f42133wkgbmnqykc.setOnCheckedChangeListener(onCheckedChangeListener);
        iobyxmoadgVar.f42128eablkybsjg.setOnClickListener(new View.OnClickListener() { // from class: k90.dxjokdxxww
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.echecks.impl.dialog.presentation.wkgbmnqykc.dxjokdxxww(this.f54205zdlpuopuiu, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void btonecajqb(wkgbmnqykc wkgbmnqykcVar, CompoundButton compoundButton, boolean z13) {
        zdlpuopuiu.btonecajqb(compoundButton, "<unused var>");
        wkgbmnqykcVar.ppxfxbqfkf(new zoijcleaow.C2022zoijcleaow(z13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dxjokdxxww(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.iobyxmoadg.f88230iobyxmoadg);
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(i90.iobyxmoadg binding, lqeggnwhkg model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        binding.f42133wkgbmnqykc.setEnabled(model.iobyxmoadg());
        ComposeView clLoading = binding.f42134zoijcleaow;
        zdlpuopuiu.dxjokdxxww(clLoading, "clLoading");
        e50.wkgbmnqykc.nufgyqmvbu(clLoading, model.zoijcleaow());
    }
}
