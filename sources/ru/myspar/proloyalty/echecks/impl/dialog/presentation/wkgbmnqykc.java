package ru.myspar.proloyalty.echecks.impl.dialog.presentation;

import android.view.View;
import android.widget.CompoundButton;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.internal.zdlpuopuiu;
import o71.lqeggnwhkg;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc extends tr0.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final CompoundButton.OnCheckedChangeListener f96051jyumaefscl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: o71.nufgyqmvbu
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z13) {
                ru.myspar.proloyalty.echecks.impl.dialog.presentation.wkgbmnqykc.btonecajqb(this.f72268iobyxmoadg, compoundButton, z13);
            }
        };
        this.f96051jyumaefscl = onCheckedChangeListener;
        m71.iobyxmoadg iobyxmoadgVar = (m71.iobyxmoadg) binding.invoke();
        iobyxmoadgVar.f66452wkgbmnqykc.setOnCheckedChangeListener(onCheckedChangeListener);
        iobyxmoadgVar.f66447eablkybsjg.setOnClickListener(new View.OnClickListener() { // from class: o71.dxjokdxxww
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.proloyalty.echecks.impl.dialog.presentation.wkgbmnqykc.dxjokdxxww(this.f72264zdlpuopuiu, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void btonecajqb(wkgbmnqykc wkgbmnqykcVar, CompoundButton compoundButton, boolean z13) {
        zdlpuopuiu.btonecajqb(compoundButton, "<unused var>");
        wkgbmnqykcVar.ppxfxbqfkf(new zoijcleaow.C2266zoijcleaow(z13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dxjokdxxww(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.iobyxmoadg.f96052iobyxmoadg);
    }

    @Override // tr0.iobyxmoadg
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(m71.iobyxmoadg binding, lqeggnwhkg model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        binding.f66452wkgbmnqykc.setEnabled(model.iobyxmoadg());
        ComposeView clLoading = binding.f66453zoijcleaow;
        zdlpuopuiu.dxjokdxxww(clLoading, "clLoading");
        o31.wkgbmnqykc.nufgyqmvbu(clLoading, model.zoijcleaow());
    }
}
