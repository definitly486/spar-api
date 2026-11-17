package ru.myspar.proloyalty.echecks.impl.screen.presentation;

import android.view.View;
import android.widget.CompoundButton;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import b31.btonecajqb;
import com.bumptech.glide.wflxmlrfwp;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import l71.eablkybsjg;
import q71.gxszxtbevo;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc extends tr0.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final gtknphoqwx f96081jyumaefscl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        this.f96081jyumaefscl = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: q71.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.echecks.impl.screen.presentation.wkgbmnqykc.agtfadlqog(this.f78182zdlpuopuiu);
            }
        });
        m71.zoijcleaow zoijcleaowVar = (m71.zoijcleaow) binding.invoke();
        ConstraintLayout root = zoijcleaowVar.getRoot();
        zdlpuopuiu.dxjokdxxww(root, "getRoot(...)");
        float fGtknphoqwx = gtknphoqwx(root);
        ((wflxmlrfwp) com.bumptech.glide.zoijcleaow.yggfygwlhe(zoijcleaowVar.f66462wkgbmnqykc).vdvldrhtss(Integer.valueOf(btonecajqb.echecks_onboarding)).oipsdeybqn(new com.bumptech.glide.load.resource.bitmap.zdlpuopuiu(0.0f, 0.0f, fGtknphoqwx, fGtknphoqwx))).wizcaqwiak(zoijcleaowVar.f66462wkgbmnqykc);
        ComposeView cvActionBar = zoijcleaowVar.f66461ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        String string = wkgbmnqykc().getString(eablkybsjg.proloyalty_title_get_echecks);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        as0.iobyxmoadg.zoijcleaow(cvActionBar, null, string, null, false, new tg.iobyxmoadg() { // from class: q71.nufgyqmvbu
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.echecks.impl.screen.presentation.wkgbmnqykc.wflxmlrfwp(this.f78183zdlpuopuiu);
            }
        }, null, null, 109, null);
        zoijcleaowVar.f66456eablkybsjg.setOnCheckedChangeListener(btonecajqb());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CompoundButton.OnCheckedChangeListener agtfadlqog(final wkgbmnqykc wkgbmnqykcVar) {
        return new CompoundButton.OnCheckedChangeListener() { // from class: q71.dxjokdxxww
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z13) {
                ru.myspar.proloyalty.echecks.impl.screen.presentation.wkgbmnqykc.ojitshcjhn(this.f78177iobyxmoadg, compoundButton, z13);
            }
        };
    }

    private final CompoundButton.OnCheckedChangeListener btonecajqb() {
        return (CompoundButton.OnCheckedChangeListener) this.f96081jyumaefscl.getValue();
    }

    private final void draadjrbmk(m71.zoijcleaow zoijcleaowVar, boolean z13) {
        zoijcleaowVar.f66456eablkybsjg.setOnCheckedChangeListener(null);
        zoijcleaowVar.f66456eablkybsjg.setChecked(z13);
        zoijcleaowVar.f66456eablkybsjg.setOnCheckedChangeListener(btonecajqb());
    }

    private final float gtknphoqwx(View view) {
        return view.getResources().getDimension(b31.eablkybsjg.echecks_onboarding_radius);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ojitshcjhn(wkgbmnqykc wkgbmnqykcVar, CompoundButton compoundButton, boolean z13) {
        zdlpuopuiu.btonecajqb(compoundButton, "<unused var>");
        wkgbmnqykcVar.rgvfuqvkyq(z13);
    }

    private final void rgvfuqvkyq(boolean z13) {
        ppxfxbqfkf(new zoijcleaow.C2267zoijcleaow(z13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wflxmlrfwp(wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.iobyxmoadg.f96082iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // tr0.iobyxmoadg
    /* JADX INFO: renamed from: vdvldrhtss, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(m71.zoijcleaow binding, gxszxtbevo model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        ComposeView clLoading = binding.f66463zoijcleaow;
        zdlpuopuiu.dxjokdxxww(clLoading, "clLoading");
        o31.wkgbmnqykc.nufgyqmvbu(clLoading, model.wkgbmnqykc());
        if (binding.f66456eablkybsjg.isChecked() != model.zoijcleaow()) {
            draadjrbmk(binding, model.zoijcleaow());
        }
        binding.f66456eablkybsjg.setEnabled(model.ppxfxbqfkf());
        binding.f66459lqeggnwhkg.setText(model.iobyxmoadg());
    }
}
