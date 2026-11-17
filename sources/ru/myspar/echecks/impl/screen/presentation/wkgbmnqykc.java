package ru.myspar.echecks.impl.screen.presentation;

import android.view.View;
import android.widget.CompoundButton;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.wflxmlrfwp;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import gg.wwaezpbzkn;
import h90.eablkybsjg;
import kotlin.jvm.internal.zdlpuopuiu;
import m90.gxszxtbevo;
import s40.btonecajqb;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc extends zs.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final gtknphoqwx f88259jyumaefscl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        this.f88259jyumaefscl = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: m90.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.echecks.impl.screen.presentation.wkgbmnqykc.agtfadlqog(this.f66589zdlpuopuiu);
            }
        });
        i90.zoijcleaow zoijcleaowVar = (i90.zoijcleaow) binding.invoke();
        ConstraintLayout root = zoijcleaowVar.getRoot();
        zdlpuopuiu.dxjokdxxww(root, "getRoot(...)");
        float fGtknphoqwx = gtknphoqwx(root);
        ((wflxmlrfwp) com.bumptech.glide.zoijcleaow.yggfygwlhe(zoijcleaowVar.f42143wkgbmnqykc).vdvldrhtss(Integer.valueOf(btonecajqb.echecks_onboarding)).oipsdeybqn(new com.bumptech.glide.load.resource.bitmap.zdlpuopuiu(0.0f, 0.0f, fGtknphoqwx, fGtknphoqwx))).wizcaqwiak(zoijcleaowVar.f42143wkgbmnqykc);
        ComposeView cvActionBar = zoijcleaowVar.f42142ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        String string = wkgbmnqykc().getString(eablkybsjg.title_get_echecks);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        gt.iobyxmoadg.zoijcleaow(cvActionBar, null, string, null, false, new tg.iobyxmoadg() { // from class: m90.nufgyqmvbu
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.echecks.impl.screen.presentation.wkgbmnqykc.wflxmlrfwp(this.f66590zdlpuopuiu);
            }
        }, null, null, 109, null);
        zoijcleaowVar.f42137eablkybsjg.setOnCheckedChangeListener(btonecajqb());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CompoundButton.OnCheckedChangeListener agtfadlqog(final wkgbmnqykc wkgbmnqykcVar) {
        return new CompoundButton.OnCheckedChangeListener() { // from class: m90.dxjokdxxww
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z13) {
                ru.myspar.echecks.impl.screen.presentation.wkgbmnqykc.ojitshcjhn(this.f66584iobyxmoadg, compoundButton, z13);
            }
        };
    }

    private final CompoundButton.OnCheckedChangeListener btonecajqb() {
        return (CompoundButton.OnCheckedChangeListener) this.f88259jyumaefscl.getValue();
    }

    private final void draadjrbmk(i90.zoijcleaow zoijcleaowVar, boolean z13) {
        zoijcleaowVar.f42137eablkybsjg.setOnCheckedChangeListener(null);
        zoijcleaowVar.f42137eablkybsjg.setChecked(z13);
        zoijcleaowVar.f42137eablkybsjg.setOnCheckedChangeListener(btonecajqb());
    }

    private final float gtknphoqwx(View view) {
        return view.getResources().getDimension(s40.eablkybsjg.echecks_onboarding_radius);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ojitshcjhn(wkgbmnqykc wkgbmnqykcVar, CompoundButton compoundButton, boolean z13) {
        zdlpuopuiu.btonecajqb(compoundButton, "<unused var>");
        wkgbmnqykcVar.rgvfuqvkyq(z13);
    }

    private final void rgvfuqvkyq(boolean z13) {
        ppxfxbqfkf(new zoijcleaow.C2023zoijcleaow(z13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wflxmlrfwp(wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.iobyxmoadg.f88260iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: vdvldrhtss, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(i90.zoijcleaow binding, gxszxtbevo model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        ComposeView clLoading = binding.f42144zoijcleaow;
        zdlpuopuiu.dxjokdxxww(clLoading, "clLoading");
        e50.wkgbmnqykc.nufgyqmvbu(clLoading, model.wkgbmnqykc());
        if (binding.f42137eablkybsjg.isChecked() != model.zoijcleaow()) {
            draadjrbmk(binding, model.zoijcleaow());
        }
        binding.f42137eablkybsjg.setEnabled(model.ppxfxbqfkf());
        binding.f42140lqeggnwhkg.setText(model.iobyxmoadg());
    }
}
