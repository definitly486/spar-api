package ru.myspar.ads.impl.presentation.dialog.productday;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import gg.wwaezpbzkn;
import go.lqeggnwhkg;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import ru.myspar.common.view.hint.model.HintUiModel;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes3.dex */
public final class wkgbmnqykc extends zs.iobyxmoadg implements d8.zoijcleaow {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f84154iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final /* synthetic */ int[] f84155zoijcleaow;

        static {
            int[] iArr = new int[io.iobyxmoadg.EnumC1046iobyxmoadg.values().length];
            try {
                iArr[io.iobyxmoadg.EnumC1046iobyxmoadg.RUB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f84154iobyxmoadg = iArr;
            int[] iArr2 = new int[io.iobyxmoadg.zoijcleaow.values().length];
            try {
                iArr2[io.iobyxmoadg.zoijcleaow.AMOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[io.iobyxmoadg.zoijcleaow.WEIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[io.iobyxmoadg.zoijcleaow.WEIGHT_PER_100.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[io.iobyxmoadg.zoijcleaow.UNDEFINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            f84155zoijcleaow = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        ((zn.zoijcleaow) binding.invoke()).f130488wkgbmnqykc.setOnClickListener(new View.OnClickListener() { // from class: go.dxjokdxxww
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.ads.impl.presentation.dialog.productday.wkgbmnqykc.dxjokdxxww(this.f37983zdlpuopuiu, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn agtfadlqog(wkgbmnqykc wkgbmnqykcVar, HintUiModel it) {
        zdlpuopuiu.btonecajqb(it, "it");
        wkgbmnqykcVar.ppxfxbqfkf(new zoijcleaow.C1903zoijcleaow(it));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void draadjrbmk(zn.zoijcleaow zoijcleaowVar, io.iobyxmoadg.zoijcleaow zoijcleaowVar2, double d13) {
        String string;
        int i13 = iobyxmoadg.f84155zoijcleaow[zoijcleaowVar2.ordinal()];
        if (i13 == 1) {
            string = wkgbmnqykc().getString(yn.wkgbmnqykc.ads_product_measured_amount_value, Double.valueOf(d13));
        } else if (i13 == 2 || i13 == 3) {
            string = wkgbmnqykc().getString(yn.wkgbmnqykc.ads_product_measured_weight_value, Double.valueOf(d13));
        } else {
            if (i13 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            string = wkgbmnqykc().getString(yn.wkgbmnqykc.undefined);
        }
        zdlpuopuiu.lqeggnwhkg(string);
        zoijcleaowVar.f130487wflxmlrfwp.setText(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dxjokdxxww(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.iobyxmoadg.f84156iobyxmoadg);
    }

    private final void gtknphoqwx(zn.zoijcleaow zoijcleaowVar, double d13) {
        String strLqeggnwhkg = n30.iobyxmoadg.f68492iobyxmoadg.lqeggnwhkg(Double.valueOf(d13));
        int iYdmasvzmpa = kcexrzcfyt.ydmasvzmpa(strLqeggnwhkg, StringUtils.COMMA, 0, false, 6, null);
        MaterialTextView materialTextView = zoijcleaowVar.f130486vdvldrhtss;
        String strSubstring = strLqeggnwhkg.substring(0, iYdmasvzmpa);
        zdlpuopuiu.dxjokdxxww(strSubstring, "substring(...)");
        materialTextView.setText(strSubstring);
        MaterialTextView materialTextView2 = zoijcleaowVar.f130483oxmwwwfdhm;
        String strSubstring2 = strLqeggnwhkg.substring(iYdmasvzmpa + 1);
        zdlpuopuiu.dxjokdxxww(strSubstring2, "substring(...)");
        materialTextView2.setText(strSubstring2);
    }

    private final void wflxmlrfwp(zn.zoijcleaow zoijcleaowVar, List list) {
        ComposeView composeView = zoijcleaowVar.f130480lqeggnwhkg;
        zdlpuopuiu.lqeggnwhkg(composeView);
        composeView.setVisibility(!list.isEmpty() ? 0 : 8);
        st.wkgbmnqykc.ppxfxbqfkf(composeView, list, HintUiModel.iobyxmoadg.BIG, null, new draadjrbmk() { // from class: go.nufgyqmvbu
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.ads.impl.presentation.dialog.productday.wkgbmnqykc.agtfadlqog(this.f37992zdlpuopuiu, (HintUiModel) obj);
            }
        }, 4, null);
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(zn.zoijcleaow binding, lqeggnwhkg model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        ShapeableImageView ivProductPhoto = binding.f130473draadjrbmk;
        zdlpuopuiu.dxjokdxxww(ivProductPhoto, "ivProductPhoto");
        c60.wkgbmnqykc.zoijcleaow(ivProductPhoto, model.zoijcleaow().dxjokdxxww());
        wflxmlrfwp(binding, model.zoijcleaow().wkgbmnqykc());
        draadjrbmk(binding, model.zoijcleaow().eablkybsjg(), model.zoijcleaow().iobyxmoadg());
        gtknphoqwx(binding, model.zoijcleaow().lqeggnwhkg());
        binding.f130489zdlpuopuiu.setData(new mb0.zoijcleaow(model.gxszxtbevo(), model.ppxfxbqfkf(), model.wkgbmnqykc(), model.eablkybsjg()));
        String strIobyxmoadg = model.iobyxmoadg();
        if (strIobyxmoadg != null) {
            binding.f130488wkgbmnqykc.setText(strIobyxmoadg);
        }
        MaterialTextView tvDiscountAmount = binding.f130482ojitshcjhn;
        zdlpuopuiu.dxjokdxxww(tvDiscountAmount, "tvDiscountAmount");
        tvDiscountAmount.setVisibility(model.zoijcleaow().ppxfxbqfkf() > 0 ? 0 : 8);
        binding.f130482ojitshcjhn.setText(wkgbmnqykc().getString(yn.wkgbmnqykc.ads_discount_amount, Integer.valueOf(model.zoijcleaow().ppxfxbqfkf())));
        binding.f130479kcexrzcfyt.setText(model.zoijcleaow().nufgyqmvbu());
        MaterialTextView materialTextView = binding.f130471agtfadlqog;
        if (iobyxmoadg.f84154iobyxmoadg[model.zoijcleaow().zoijcleaow().ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        materialTextView.setText(wkgbmnqykc().getString(yn.wkgbmnqykc.rouble));
        MaterialTextView tvOldPrice = binding.f130485rgvfuqvkyq;
        zdlpuopuiu.dxjokdxxww(tvOldPrice, "tvOldPrice");
        tvOldPrice.setVisibility(model.zoijcleaow().gxszxtbevo() != null ? 0 : 8);
        MaterialTextView materialTextView2 = binding.f130485rgvfuqvkyq;
        materialTextView2.setPaintFlags(materialTextView2.getPaintFlags() | 16);
        binding.f130485rgvfuqvkyq.setText(wkgbmnqykc().getString(yn.wkgbmnqykc.ads_old_product_price, model.zoijcleaow().gxszxtbevo()));
        ConstraintLayout clRoot = binding.f130475eablkybsjg;
        zdlpuopuiu.dxjokdxxww(clRoot, "clRoot");
        clRoot.setVisibility(model.lqeggnwhkg() ? 0 : 8);
    }
}
