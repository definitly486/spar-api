package ru.myspar.legacy.presentation.screen.specificrestaurantproduct;

import android.os.SystemClock;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import be0.lqeggnwhkg;
import c60.nufgyqmvbu;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.jpowsppfya;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.tzroggbefp;
import pm.dxjokdxxww;
import ru.myspar.legacy.presentation.view.BuyButtonNew;
import ru.myspar.legacy.presentation.view.ProductParameterViewNew;
import s40.gxszxtbevo;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc extends zs.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private static final iobyxmoadg f89911jyumaefscl = new iobyxmoadg(null);

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public static final class zoijcleaow implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ wkgbmnqykc f89912jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f89913yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f89914zdlpuopuiu;

        public zoijcleaow(jpowsppfya jpowsppfyaVar, long j13, wkgbmnqykc wkgbmnqykcVar) {
            this.f89914zdlpuopuiu = jpowsppfyaVar;
            this.f89913yggfygwlhe = j13;
            this.f89912jyumaefscl = wkgbmnqykcVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f89914zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f89913yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f89912jyumaefscl.ppxfxbqfkf(ru.myspar.legacy.presentation.screen.specificrestaurantproduct.zoijcleaow.ppxfxbqfkf.f89916iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        tzroggbefp tzroggbefpVar = (tzroggbefp) binding.invoke();
        tzroggbefpVar.f66011nufgyqmvbu.setMinHeight((int) (((double) nufgyqmvbu.zoijcleaow(wkgbmnqykc()).heightPixels) * Math.abs(0.5d)));
        BuyButtonNew btnBuy = tzroggbefpVar.f66000eablkybsjg;
        zdlpuopuiu.dxjokdxxww(btnBuy, "btnBuy");
        btnBuy.setOnClickListener(new zoijcleaow(new jpowsppfya(), 400L, this));
        tzroggbefpVar.f65999dxjokdxxww.setOnCountChangeListener(new draadjrbmk() { // from class: be0.nufgyqmvbu
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.legacy.presentation.screen.specificrestaurantproduct.wkgbmnqykc.nufgyqmvbu(this.f15891zdlpuopuiu, ((Double) obj).doubleValue());
            }
        });
        MaterialTextView materialTextView = tzroggbefpVar.f65997cqumvgiudr;
        materialTextView.setPaintFlags(materialTextView.getPaintFlags() | 16);
    }

    private final void draadjrbmk(ProductParameterViewNew productParameterViewNew, int i13, double d13, boolean z13) {
        productParameterViewNew.setVisibility(z13 ? 0 : 8);
        productParameterViewNew.setValue(wkgbmnqykc().getString(i13, n30.iobyxmoadg.f68492iobyxmoadg.eablkybsjg(Double.valueOf(d13))));
    }

    private final void dxjokdxxww(tzroggbefp tzroggbefpVar, String str) {
        ShapeableImageView ivPhoto = tzroggbefpVar.f66012ojitshcjhn;
        zdlpuopuiu.dxjokdxxww(ivPhoto, "ivPhoto");
        c60.wkgbmnqykc.zoijcleaow(ivPhoto, str);
    }

    private final void gtknphoqwx(tzroggbefp tzroggbefpVar) {
        tzroggbefpVar.f66012ojitshcjhn.setImageResource(gxszxtbevo.placeholder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn nufgyqmvbu(wkgbmnqykc wkgbmnqykcVar, double d13) {
        wkgbmnqykcVar.ppxfxbqfkf(new ru.myspar.legacy.presentation.screen.specificrestaurantproduct.zoijcleaow.iobyxmoadg(d13));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void wflxmlrfwp(tzroggbefp tzroggbefpVar, String str) {
        if (str == null || str.length() == 0) {
            gtknphoqwx(tzroggbefpVar);
        } else {
            dxjokdxxww(tzroggbefpVar, str);
        }
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(tzroggbefp binding, lqeggnwhkg model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        ComposeView clLoading = binding.f66010lqeggnwhkg;
        zdlpuopuiu.dxjokdxxww(clLoading, "clLoading");
        e50.wkgbmnqykc.nufgyqmvbu(clLoading, model.jyumaefscl());
        ConstraintLayout clControlContainer = binding.f66003gxszxtbevo;
        zdlpuopuiu.dxjokdxxww(clControlContainer, "clControlContainer");
        clControlContainer.setVisibility(model.ojitshcjhn() ? 0 : 8);
        NestedScrollView productScrollContainer = binding.f66021yggfygwlhe;
        zdlpuopuiu.dxjokdxxww(productScrollContainer, "productScrollContainer");
        productScrollContainer.setVisibility(model.ojitshcjhn() ? 0 : 8);
        wflxmlrfwp(binding, model.draadjrbmk());
        binding.f66006iwizpuwonk.setText(model.gtknphoqwx());
        MaterialTextView tvDescription = binding.f66007jyumaefscl;
        zdlpuopuiu.dxjokdxxww(tvDescription, "tvDescription");
        tvDescription.setVisibility(model.eablkybsjg() ? 0 : 8);
        binding.f66007jyumaefscl.setText(model.wkgbmnqykc());
        MaterialTextView tvWeightPerUnit = binding.f66020yadqdtsiqt;
        zdlpuopuiu.dxjokdxxww(tvWeightPerUnit, "tvWeightPerUnit");
        tvWeightPerUnit.setVisibility(model.yggfygwlhe() ? 0 : 8);
        binding.f66020yadqdtsiqt.setText(model.zdlpuopuiu());
        binding.f66001esjtqupxsv.setText(model.agtfadlqog());
        binding.f66014pmvmpeiblj.setText(model.wflxmlrfwp());
        binding.f66024zynmafqrjb.setText(model.kcexrzcfyt());
        binding.f65996cdpycssgdh.setText(model.oxmwwwfdhm());
        ProductParameterViewNew ppvEnergy = binding.f66017vdvldrhtss;
        zdlpuopuiu.dxjokdxxww(ppvEnergy, "ppvEnergy");
        draadjrbmk(ppvEnergy, dxjokdxxww.nutrients_in_kilocalories_format, model.lqeggnwhkg(), model.nufgyqmvbu());
        ProductParameterViewNew ppvProteins = binding.f66008kcexrzcfyt;
        zdlpuopuiu.dxjokdxxww(ppvProteins, "ppvProteins");
        draadjrbmk(ppvProteins, dxjokdxxww.nutrients_per_grams_format, model.rgvfuqvkyq(), model.vdvldrhtss());
        ProductParameterViewNew ppvFats = binding.f66013oxmwwwfdhm;
        zdlpuopuiu.dxjokdxxww(ppvFats, "ppvFats");
        draadjrbmk(ppvFats, dxjokdxxww.nutrients_per_grams_format, model.dxjokdxxww(), model.btonecajqb());
        ProductParameterViewNew ppvCarbs = binding.f66016rgvfuqvkyq;
        zdlpuopuiu.dxjokdxxww(ppvCarbs, "ppvCarbs");
        draadjrbmk(ppvCarbs, dxjokdxxww.nutrients_per_grams_format, model.zoijcleaow(), model.ppxfxbqfkf());
        binding.f65999dxjokdxxww.pmvmpeiblj(model.gxszxtbevo());
        binding.f66000eablkybsjg.setButtonState(model.iobyxmoadg());
    }
}
