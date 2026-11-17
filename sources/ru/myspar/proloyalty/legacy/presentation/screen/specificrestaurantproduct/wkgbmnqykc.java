package ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurantproduct;

import android.os.SystemClock;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import b31.gxszxtbevo;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.jpowsppfya;
import kotlin.jvm.internal.zdlpuopuiu;
import p41.dxjokdxxww;
import p41.eablkybsjg;
import ru.myspar.proloyalty.legacy.presentation.view.BuyButtonNew;
import ru.myspar.proloyalty.legacy.presentation.view.ProductParameterViewNew;
import tg.draadjrbmk;
import xb1.lqeggnwhkg;
import z41.hcddaimhww;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc extends tr0.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private static final iobyxmoadg f97541jyumaefscl = new iobyxmoadg(null);

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public static final class zoijcleaow implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ wkgbmnqykc f97542jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f97543yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f97544zdlpuopuiu;

        public zoijcleaow(jpowsppfya jpowsppfyaVar, long j13, wkgbmnqykc wkgbmnqykcVar) {
            this.f97544zdlpuopuiu = jpowsppfyaVar;
            this.f97543yggfygwlhe = j13;
            this.f97542jyumaefscl = wkgbmnqykcVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f97544zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f97543yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f97542jyumaefscl.ppxfxbqfkf(ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurantproduct.zoijcleaow.ppxfxbqfkf.f97546iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        hcddaimhww hcddaimhwwVar = (hcddaimhww) binding.invoke();
        hcddaimhwwVar.f128063nufgyqmvbu.setMinHeight((int) (((double) dxjokdxxww.zoijcleaow(wkgbmnqykc()).heightPixels) * Math.abs(0.5d)));
        BuyButtonNew btnBuy = hcddaimhwwVar.f128052eablkybsjg;
        zdlpuopuiu.dxjokdxxww(btnBuy, "btnBuy");
        btnBuy.setOnClickListener(new zoijcleaow(new jpowsppfya(), 400L, this));
        hcddaimhwwVar.f128051dxjokdxxww.setOnCountChangeListener(new draadjrbmk() { // from class: xb1.nufgyqmvbu
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurantproduct.wkgbmnqykc.nufgyqmvbu(this.f122014zdlpuopuiu, ((Double) obj).doubleValue());
            }
        });
        MaterialTextView materialTextView = hcddaimhwwVar.f128049cqumvgiudr;
        materialTextView.setPaintFlags(materialTextView.getPaintFlags() | 16);
    }

    private final void draadjrbmk(ProductParameterViewNew productParameterViewNew, int i13, double d13, boolean z13) {
        productParameterViewNew.setVisibility(z13 ? 0 : 8);
        productParameterViewNew.setValue(wkgbmnqykc().getString(i13, t11.iobyxmoadg.f109303iobyxmoadg.eablkybsjg(Double.valueOf(d13))));
    }

    private final void dxjokdxxww(hcddaimhww hcddaimhwwVar, String str) {
        ShapeableImageView ivPhoto = hcddaimhwwVar.f128064ojitshcjhn;
        zdlpuopuiu.dxjokdxxww(ivPhoto, "ivPhoto");
        eablkybsjg.zoijcleaow(ivPhoto, str);
    }

    private final void gtknphoqwx(hcddaimhww hcddaimhwwVar) {
        hcddaimhwwVar.f128064ojitshcjhn.setImageResource(gxszxtbevo.placeholder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn nufgyqmvbu(wkgbmnqykc wkgbmnqykcVar, double d13) {
        wkgbmnqykcVar.ppxfxbqfkf(new ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurantproduct.zoijcleaow.iobyxmoadg(d13));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void wflxmlrfwp(hcddaimhww hcddaimhwwVar, String str) {
        if (str == null || str.length() == 0) {
            gtknphoqwx(hcddaimhwwVar);
        } else {
            dxjokdxxww(hcddaimhwwVar, str);
        }
    }

    @Override // tr0.iobyxmoadg
    /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(hcddaimhww binding, lqeggnwhkg model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        ComposeView clLoading = binding.f128062lqeggnwhkg;
        zdlpuopuiu.dxjokdxxww(clLoading, "clLoading");
        o31.wkgbmnqykc.nufgyqmvbu(clLoading, model.jyumaefscl());
        ConstraintLayout clControlContainer = binding.f128055gxszxtbevo;
        zdlpuopuiu.dxjokdxxww(clControlContainer, "clControlContainer");
        clControlContainer.setVisibility(model.ojitshcjhn() ? 0 : 8);
        NestedScrollView productScrollContainer = binding.f128073yggfygwlhe;
        zdlpuopuiu.dxjokdxxww(productScrollContainer, "productScrollContainer");
        productScrollContainer.setVisibility(model.ojitshcjhn() ? 0 : 8);
        wflxmlrfwp(binding, model.draadjrbmk());
        binding.f128058iwizpuwonk.setText(model.gtknphoqwx());
        MaterialTextView tvDescription = binding.f128059jyumaefscl;
        zdlpuopuiu.dxjokdxxww(tvDescription, "tvDescription");
        tvDescription.setVisibility(model.eablkybsjg() ? 0 : 8);
        binding.f128059jyumaefscl.setText(model.wkgbmnqykc());
        MaterialTextView tvWeightPerUnit = binding.f128072yadqdtsiqt;
        zdlpuopuiu.dxjokdxxww(tvWeightPerUnit, "tvWeightPerUnit");
        tvWeightPerUnit.setVisibility(model.yggfygwlhe() ? 0 : 8);
        binding.f128072yadqdtsiqt.setText(model.zdlpuopuiu());
        binding.f128053esjtqupxsv.setText(model.agtfadlqog());
        binding.f128066pmvmpeiblj.setText(model.wflxmlrfwp());
        binding.f128076zynmafqrjb.setText(model.kcexrzcfyt());
        binding.f128048cdpycssgdh.setText(model.oxmwwwfdhm());
        ProductParameterViewNew ppvEnergy = binding.f128069vdvldrhtss;
        zdlpuopuiu.dxjokdxxww(ppvEnergy, "ppvEnergy");
        draadjrbmk(ppvEnergy, vk0.lqeggnwhkg.proloyalty_nutrients_in_kilocalories_format, model.lqeggnwhkg(), model.nufgyqmvbu());
        ProductParameterViewNew ppvProteins = binding.f128060kcexrzcfyt;
        zdlpuopuiu.dxjokdxxww(ppvProteins, "ppvProteins");
        draadjrbmk(ppvProteins, vk0.lqeggnwhkg.proloyalty_nutrients_per_grams_format, model.rgvfuqvkyq(), model.vdvldrhtss());
        ProductParameterViewNew ppvFats = binding.f128065oxmwwwfdhm;
        zdlpuopuiu.dxjokdxxww(ppvFats, "ppvFats");
        draadjrbmk(ppvFats, vk0.lqeggnwhkg.proloyalty_nutrients_per_grams_format, model.dxjokdxxww(), model.btonecajqb());
        ProductParameterViewNew ppvCarbs = binding.f128068rgvfuqvkyq;
        zdlpuopuiu.dxjokdxxww(ppvCarbs, "ppvCarbs");
        draadjrbmk(ppvCarbs, vk0.lqeggnwhkg.proloyalty_nutrients_per_grams_format, model.zoijcleaow(), model.ppxfxbqfkf());
        binding.f128051dxjokdxxww.pmvmpeiblj(model.gxszxtbevo());
        binding.f128052eablkybsjg.setButtonState(model.iobyxmoadg());
    }
}
