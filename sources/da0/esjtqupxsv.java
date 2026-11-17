package da0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import java.util.List;
import ru.myspar.core.domain.models.ButtonUiModel;
import ru.myspar.core.domain.models.ColorsUiModel;
import ru.myspar.legacy.presentation.view.ProductPriceView;

/* JADX INFO: loaded from: classes4.dex */
public abstract class esjtqupxsv {

    public static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.vdvldrhtss {
        public iobyxmoadg() {
            super(3);
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return iobyxmoadg(obj, (List) obj2, ((Number) obj3).intValue());
        }

        public final Boolean iobyxmoadg(Object obj, List noName_1, int i13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(noName_1, "$noName_1");
            return Boolean.valueOf(obj instanceof yggfygwlhe.wkgbmnqykc);
        }
    }

    public static final class ppxfxbqfkf implements View.OnClickListener {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ ef.iobyxmoadg f27253iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f27254jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f27255yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.jpowsppfya f27256zdlpuopuiu;

        public ppxfxbqfkf(kotlin.jvm.internal.jpowsppfya jpowsppfyaVar, long j13, tg.draadjrbmk draadjrbmkVar, ef.iobyxmoadg iobyxmoadgVar) {
            this.f27256zdlpuopuiu = jpowsppfyaVar;
            this.f27255yggfygwlhe = j13;
            this.f27254jyumaefscl = draadjrbmkVar;
            this.f27253iwizpuwonk = iobyxmoadgVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            kotlin.jvm.internal.jpowsppfya jpowsppfyaVar = this.f27256zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f27255yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(view);
            this.f27254jyumaefscl.invoke(((yggfygwlhe.wkgbmnqykc) this.f27253iwizpuwonk.eablkybsjg()).iobyxmoadg());
        }
    }

    public static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f27257zdlpuopuiu = new zoijcleaow();

        public zoijcleaow() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final LayoutInflater invoke(ViewGroup parent) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parent, "parent");
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(layoutInflaterFrom, "from(parent.context)");
            return layoutInflaterFrom;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y90.eablkybsjg eablkybsjg(LayoutInflater layoutInflater, ViewGroup root) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(root, "root");
        y90.eablkybsjg eablkybsjgVarPpxfxbqfkf = y90.eablkybsjg.ppxfxbqfkf(layoutInflater, root, false);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(eablkybsjgVarPpxfxbqfkf, "inflate(...)");
        return eablkybsjgVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn gxszxtbevo(tg.draadjrbmk draadjrbmkVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        y90.eablkybsjg eablkybsjgVar = (y90.eablkybsjg) adapterDelegateViewBinding.ppxfxbqfkf();
        MaterialButton productButton = eablkybsjgVar.f124187ppxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(productButton, "productButton");
        productButton.setOnClickListener(new ppxfxbqfkf(new kotlin.jvm.internal.jpowsppfya(), 400L, draadjrbmkVar, adapterDelegateViewBinding));
        TextView textView = eablkybsjgVar.f124186lqeggnwhkg;
        textView.setPaintFlags(textView.getPaintFlags() | 16);
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: da0.cqumvgiudr
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return esjtqupxsv.lqeggnwhkg(adapterDelegateViewBinding, (List) obj);
            }
        });
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:42:0x015d  */
    public static final gg.wwaezpbzkn lqeggnwhkg(ef.iobyxmoadg iobyxmoadgVar, List it) {
        boolean z13;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        y90.eablkybsjg eablkybsjgVar = (y90.eablkybsjg) iobyxmoadgVar.ppxfxbqfkf();
        ShapeableImageView productImage = eablkybsjgVar.f124188wkgbmnqykc;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(productImage, "productImage");
        c60.wkgbmnqykc.zoijcleaow(productImage, ((yggfygwlhe.wkgbmnqykc) iobyxmoadgVar.eablkybsjg()).iobyxmoadg().getPhotoUrl());
        eablkybsjgVar.f124183eablkybsjg.setText(((yggfygwlhe.wkgbmnqykc) iobyxmoadgVar.eablkybsjg()).iobyxmoadg().getName());
        ProductPriceView productPriceView = eablkybsjgVar.f124184gxszxtbevo;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(productPriceView);
        productPriceView.setVisibility(((yggfygwlhe.wkgbmnqykc) iobyxmoadgVar.eablkybsjg()).iobyxmoadg().getIsProductWithZeroPrice() ? 4 : 0);
        productPriceView.setPrice(((yggfygwlhe.wkgbmnqykc) iobyxmoadgVar.eablkybsjg()).iobyxmoadg().getPrice());
        productPriceView.setMeasure(((yggfygwlhe.wkgbmnqykc) iobyxmoadgVar.eablkybsjg()).iobyxmoadg().getMeasureTypeModel());
        TextView textView = eablkybsjgVar.f124186lqeggnwhkg;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(textView);
        textView.setVisibility(((yggfygwlhe.wkgbmnqykc) iobyxmoadgVar.eablkybsjg()).iobyxmoadg().getIsProductWithZeroPrice() || ((yggfygwlhe.wkgbmnqykc) iobyxmoadgVar.eablkybsjg()).iobyxmoadg().getOldPrice() == null ? 4 : 0);
        Context context = textView.getContext();
        int i13 = q90.gxszxtbevo.old_price_format;
        n30.iobyxmoadg iobyxmoadgVar2 = n30.iobyxmoadg.f68492iobyxmoadg;
        Object oldPrice = ((yggfygwlhe.wkgbmnqykc) iobyxmoadgVar.eablkybsjg()).iobyxmoadg().getOldPrice();
        if (oldPrice == null) {
            oldPrice = 0;
        }
        textView.setText(context.getString(i13, iobyxmoadgVar2.lqeggnwhkg(oldPrice)));
        ColorsUiModel colorsUiModel = ((yggfygwlhe.wkgbmnqykc) iobyxmoadgVar.eablkybsjg()).iobyxmoadg().getColorsUiModel();
        ColorStateList colorStateListOkpsazkaxt = colorsUiModel != null ? colorsUiModel.okpsazkaxt(iobyxmoadgVar.wkgbmnqykc(), ColorsUiModel.iobyxmoadg.PRIMARY) : null;
        MaterialButton materialButton = eablkybsjgVar.f124187ppxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(materialButton);
        materialButton.setVisibility(((yggfygwlhe.wkgbmnqykc) iobyxmoadgVar.eablkybsjg()).iobyxmoadg().getButton() != null ? 0 : 8);
        materialButton.setClickable(((yggfygwlhe.wkgbmnqykc) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc());
        ButtonUiModel button = ((yggfygwlhe.wkgbmnqykc) iobyxmoadgVar.eablkybsjg()).iobyxmoadg().getButton();
        materialButton.setText(button != null ? button.getTitle() : null);
        if (colorStateListOkpsazkaxt != null) {
            materialButton.setStrokeColor(colorStateListOkpsazkaxt);
            materialButton.setTextColor(colorStateListOkpsazkaxt);
        }
        ProgressBar pbLoading = eablkybsjgVar.f124189zoijcleaow;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(pbLoading, "pbLoading");
        if (((yggfygwlhe.wkgbmnqykc) iobyxmoadgVar.eablkybsjg()).eablkybsjg()) {
            MaterialButton productButton = eablkybsjgVar.f124187ppxfxbqfkf;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(productButton, "productButton");
            z13 = productButton.getVisibility() == 0;
        }
        pbLoading.setVisibility(z13 ? 0 : 8);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow wkgbmnqykc(final tg.draadjrbmk actionClickListener) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(actionClickListener, "actionClickListener");
        return new ef.zoijcleaow(new tg.rgvfuqvkyq() { // from class: da0.jyumaefscl
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return esjtqupxsv.eablkybsjg((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: da0.iwizpuwonk
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return esjtqupxsv.gxszxtbevo(actionClickListener, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f27257zdlpuopuiu);
    }
}
