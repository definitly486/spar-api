package ru.myspar.proloyalty.ads.impl.presentation.dialog.productday;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import gg.wwaezpbzkn;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import p41.eablkybsjg;
import qm0.lqeggnwhkg;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc extends tr0.iobyxmoadg implements d8.zoijcleaow {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f92179iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final /* synthetic */ int[] f92180zoijcleaow;

        static {
            int[] iArr = new int[sm0.iobyxmoadg.EnumC2645iobyxmoadg.values().length];
            try {
                iArr[sm0.iobyxmoadg.EnumC2645iobyxmoadg.RUB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f92179iobyxmoadg = iArr;
            int[] iArr2 = new int[sm0.iobyxmoadg.zoijcleaow.values().length];
            try {
                iArr2[sm0.iobyxmoadg.zoijcleaow.AMOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[sm0.iobyxmoadg.zoijcleaow.WEIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[sm0.iobyxmoadg.zoijcleaow.WEIGHT_PER_100.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[sm0.iobyxmoadg.zoijcleaow.UNDEFINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            f92180zoijcleaow = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        ((km0.zoijcleaow) binding.invoke()).f59855wkgbmnqykc.setOnClickListener(new View.OnClickListener() { // from class: qm0.dxjokdxxww
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.proloyalty.ads.impl.presentation.dialog.productday.wkgbmnqykc.dxjokdxxww(this.f79178zdlpuopuiu, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn agtfadlqog(wkgbmnqykc wkgbmnqykcVar, HintUiModel it) {
        zdlpuopuiu.btonecajqb(it, "it");
        wkgbmnqykcVar.ppxfxbqfkf(new zoijcleaow.C2147zoijcleaow(it));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void draadjrbmk(km0.zoijcleaow zoijcleaowVar, sm0.iobyxmoadg.zoijcleaow zoijcleaowVar2, double d13) {
        String string;
        int i13 = iobyxmoadg.f92180zoijcleaow[zoijcleaowVar2.ordinal()];
        if (i13 == 1) {
            string = wkgbmnqykc().getString(jm0.wkgbmnqykc.proloyalty_ads_product_measured_amount_value, Double.valueOf(d13));
        } else if (i13 == 2 || i13 == 3) {
            string = wkgbmnqykc().getString(jm0.wkgbmnqykc.proloyalty_ads_product_measured_weight_value, Double.valueOf(d13));
        } else {
            if (i13 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            string = wkgbmnqykc().getString(jm0.wkgbmnqykc.proloyalty_undefined);
        }
        zdlpuopuiu.lqeggnwhkg(string);
        zoijcleaowVar.f59854wflxmlrfwp.setText(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dxjokdxxww(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.iobyxmoadg.f92181iobyxmoadg);
    }

    private final void gtknphoqwx(km0.zoijcleaow zoijcleaowVar, double d13) {
        String strLqeggnwhkg = t11.iobyxmoadg.f109303iobyxmoadg.lqeggnwhkg(Double.valueOf(d13));
        int iYdmasvzmpa = kcexrzcfyt.ydmasvzmpa(strLqeggnwhkg, StringUtils.COMMA, 0, false, 6, null);
        MaterialTextView materialTextView = zoijcleaowVar.f59853vdvldrhtss;
        String strSubstring = strLqeggnwhkg.substring(0, iYdmasvzmpa);
        zdlpuopuiu.dxjokdxxww(strSubstring, "substring(...)");
        materialTextView.setText(strSubstring);
        MaterialTextView materialTextView2 = zoijcleaowVar.f59850oxmwwwfdhm;
        String strSubstring2 = strLqeggnwhkg.substring(iYdmasvzmpa + 1);
        zdlpuopuiu.dxjokdxxww(strSubstring2, "substring(...)");
        materialTextView2.setText(strSubstring2);
    }

    private final void wflxmlrfwp(km0.zoijcleaow zoijcleaowVar, List list) {
        ComposeView composeView = zoijcleaowVar.f59847lqeggnwhkg;
        zdlpuopuiu.lqeggnwhkg(composeView);
        composeView.setVisibility(!list.isEmpty() ? 0 : 8);
        ms0.wkgbmnqykc.ppxfxbqfkf(composeView, list, HintUiModel.iobyxmoadg.BIG, null, new draadjrbmk() { // from class: qm0.nufgyqmvbu
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.ads.impl.presentation.dialog.productday.wkgbmnqykc.agtfadlqog(this.f79188zdlpuopuiu, (HintUiModel) obj);
            }
        }, 4, null);
    }

    @Override // tr0.iobyxmoadg
    /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(km0.zoijcleaow binding, lqeggnwhkg model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        ShapeableImageView ivProductPhoto = binding.f59840draadjrbmk;
        zdlpuopuiu.dxjokdxxww(ivProductPhoto, "ivProductPhoto");
        eablkybsjg.zoijcleaow(ivProductPhoto, model.zoijcleaow().dxjokdxxww());
        wflxmlrfwp(binding, model.zoijcleaow().wkgbmnqykc());
        draadjrbmk(binding, model.zoijcleaow().eablkybsjg(), model.zoijcleaow().iobyxmoadg());
        gtknphoqwx(binding, model.zoijcleaow().lqeggnwhkg());
        binding.f59856zdlpuopuiu.setData(new l91.zoijcleaow(model.gxszxtbevo(), model.ppxfxbqfkf(), model.wkgbmnqykc(), model.eablkybsjg()));
        String strIobyxmoadg = model.iobyxmoadg();
        if (strIobyxmoadg != null) {
            binding.f59855wkgbmnqykc.setText(strIobyxmoadg);
        }
        MaterialTextView tvDiscountAmount = binding.f59849ojitshcjhn;
        zdlpuopuiu.dxjokdxxww(tvDiscountAmount, "tvDiscountAmount");
        tvDiscountAmount.setVisibility(model.zoijcleaow().ppxfxbqfkf() > 0 ? 0 : 8);
        binding.f59849ojitshcjhn.setText(wkgbmnqykc().getString(jm0.wkgbmnqykc.proloyalty_ads_discount_amount, Integer.valueOf(model.zoijcleaow().ppxfxbqfkf())));
        binding.f59846kcexrzcfyt.setText(model.zoijcleaow().nufgyqmvbu());
        MaterialTextView materialTextView = binding.f59838agtfadlqog;
        if (iobyxmoadg.f92179iobyxmoadg[model.zoijcleaow().zoijcleaow().ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        materialTextView.setText(wkgbmnqykc().getString(jm0.wkgbmnqykc.proloyalty_rouble));
        MaterialTextView tvOldPrice = binding.f59852rgvfuqvkyq;
        zdlpuopuiu.dxjokdxxww(tvOldPrice, "tvOldPrice");
        tvOldPrice.setVisibility(model.zoijcleaow().gxszxtbevo() != null ? 0 : 8);
        MaterialTextView materialTextView2 = binding.f59852rgvfuqvkyq;
        materialTextView2.setPaintFlags(materialTextView2.getPaintFlags() | 16);
        binding.f59852rgvfuqvkyq.setText(wkgbmnqykc().getString(jm0.wkgbmnqykc.proloyalty_ads_old_product_price, model.zoijcleaow().gxszxtbevo()));
        ConstraintLayout clRoot = binding.f59842eablkybsjg;
        zdlpuopuiu.dxjokdxxww(clRoot, "clRoot");
        clRoot.setVisibility(model.lqeggnwhkg() ? 0 : 8);
    }
}
