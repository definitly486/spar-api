package kr1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import gg.wwaezpbzkn;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.tzroggbefp;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;
import ru.myspar.proloyalty.legacy.presentation.view.ProductPriceView;
import ru.myspar.proloyalty.services.crash_logger.api.CrashlyticsKey;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;
import z41.okpsazkaxt;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends jyumaefscl implements vdvldrhtss {
        public iobyxmoadg() {
            super(3);
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return iobyxmoadg(obj, (List) obj2, ((Number) obj3).intValue());
        }

        public final Boolean iobyxmoadg(Object obj, List noName_1, int i13) {
            zdlpuopuiu.btonecajqb(noName_1, "$noName_1");
            return Boolean.valueOf(obj instanceof is1.ppxfxbqfkf);
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f60464zdlpuopuiu = new zoijcleaow();

        public zoijcleaow() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final LayoutInflater invoke(ViewGroup parent) {
            zdlpuopuiu.btonecajqb(parent, "parent");
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
            zdlpuopuiu.dxjokdxxww(layoutInflaterFrom, "from(parent.context)");
            return layoutInflaterFrom;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final wwaezpbzkn dxjokdxxww(ef.iobyxmoadg iobyxmoadgVar, List it) {
        Integer num;
        ColorStateList colorStateListV;
        ColorsUiModel colorsUiModelEablkybsjg;
        ColorsUiModel colorsUiModelEablkybsjg2;
        zdlpuopuiu.btonecajqb(it, "it");
        okpsazkaxt okpsazkaxtVar = (okpsazkaxt) iobyxmoadgVar.ppxfxbqfkf();
        ShapeableImageView ivPhoto = okpsazkaxtVar.f128301eablkybsjg;
        zdlpuopuiu.dxjokdxxww(ivPhoto, "ivPhoto");
        p41.eablkybsjg.ppxfxbqfkf(ivPhoto, ((is1.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).nufgyqmvbu(), b31.gxszxtbevo.placeholder);
        okpsazkaxtVar.f128305nufgyqmvbu.setText(((is1.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).dxjokdxxww());
        ProductPriceView tvPrice = okpsazkaxtVar.f128299btonecajqb;
        zdlpuopuiu.dxjokdxxww(tvPrice, "tvPrice");
        tvPrice.setVisibility((((is1.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).gtknphoqwx() != null) != false ? 0 : 8);
        Double dGtknphoqwx = ((is1.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).gtknphoqwx();
        if (dGtknphoqwx != null) {
            okpsazkaxtVar.f128299btonecajqb.setPrice(dGtknphoqwx.doubleValue());
            okpsazkaxtVar.f128299btonecajqb.setUnitAndEnabled(((is1.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).wflxmlrfwp());
        }
        MaterialTextView tvDescription = okpsazkaxtVar.f128304lqeggnwhkg;
        zdlpuopuiu.dxjokdxxww(tvDescription, "tvDescription");
        tvDescription.setVisibility((((is1.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).lqeggnwhkg().length() > 0) != false ? 0 : 8);
        okpsazkaxtVar.f128304lqeggnwhkg.setText(((is1.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).lqeggnwhkg());
        if (((is1.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).btonecajqb() == null) {
            MaterialTextView tvCurrencyOldPrice = okpsazkaxtVar.f128302gxszxtbevo;
            zdlpuopuiu.dxjokdxxww(tvCurrencyOldPrice, "tvCurrencyOldPrice");
            tvCurrencyOldPrice.setVisibility(8);
            MaterialTextView tvOldPrice = okpsazkaxtVar.f128300dxjokdxxww;
            zdlpuopuiu.dxjokdxxww(tvOldPrice, "tvOldPrice");
            tvOldPrice.setVisibility(8);
        } else {
            MaterialTextView tvCurrencyOldPrice2 = okpsazkaxtVar.f128302gxszxtbevo;
            zdlpuopuiu.dxjokdxxww(tvCurrencyOldPrice2, "tvCurrencyOldPrice");
            tvCurrencyOldPrice2.setVisibility(0);
            MaterialTextView tvOldPrice2 = okpsazkaxtVar.f128300dxjokdxxww;
            zdlpuopuiu.dxjokdxxww(tvOldPrice2, "tvOldPrice");
            tvOldPrice2.setVisibility(0);
            MaterialTextView materialTextView = okpsazkaxtVar.f128300dxjokdxxww;
            materialTextView.setPaintFlags(materialTextView.getPaintFlags() | 16);
            MaterialTextView materialTextView2 = okpsazkaxtVar.f128300dxjokdxxww;
            tzroggbefp tzroggbefpVar = tzroggbefp.f60034iobyxmoadg;
            String str = String.format("%.2f", Arrays.copyOf(new Object[]{((is1.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).btonecajqb()}, 1));
            zdlpuopuiu.dxjokdxxww(str, "format(...)");
            materialTextView2.setText(str);
        }
        MaterialButton btnAction = okpsazkaxtVar.f128308zoijcleaow;
        zdlpuopuiu.dxjokdxxww(btnAction, "btnAction");
        btnAction.setVisibility(((is1.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc() != null ? 0 : 8);
        is1.zoijcleaow zoijcleaowVarWkgbmnqykc = ((is1.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc();
        if (zoijcleaowVarWkgbmnqykc != null) {
            MaterialButton materialButton = okpsazkaxtVar.f128308zoijcleaow;
            materialButton.setText(zoijcleaowVarWkgbmnqykc.eablkybsjg());
            okpsazkaxtVar.f128308zoijcleaow.setEnabled(((is1.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).iobyxmoadg());
            ColorStateList colorStateList = null;
            numValueOf = null;
            numValueOf = null;
            numValueOf = null;
            Integer numValueOf = null;
            try {
                String strIobyxmoadg = zoijcleaowVarWkgbmnqykc.iobyxmoadg();
                if (strIobyxmoadg != null && strIobyxmoadg.length() != 0) {
                    colorStateListV = ColorStateList.valueOf(Color.parseColor(zoijcleaowVarWkgbmnqykc.iobyxmoadg()));
                } else if (((is1.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).eablkybsjg() == null || (colorsUiModelEablkybsjg = ((is1.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).eablkybsjg()) == null) {
                    colorStateListV = null;
                } else {
                    Context context = materialButton.getContext();
                    zdlpuopuiu.dxjokdxxww(context, "getContext(...)");
                    colorStateListV = colorsUiModelEablkybsjg.V(context, ColorsUiModel.iobyxmoadg.PRIMARY);
                }
                try {
                    String strIobyxmoadg2 = zoijcleaowVarWkgbmnqykc.iobyxmoadg();
                    if (strIobyxmoadg2 != null && strIobyxmoadg2.length() != 0) {
                        String strZoijcleaow = zoijcleaowVarWkgbmnqykc.zoijcleaow();
                        if (strZoijcleaow != null) {
                            numValueOf = Integer.valueOf(Color.parseColor(strZoijcleaow));
                        }
                    } else if (((is1.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).eablkybsjg() != null && (colorsUiModelEablkybsjg2 = ((is1.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).eablkybsjg()) != null) {
                        Context context2 = materialButton.getContext();
                        zdlpuopuiu.dxjokdxxww(context2, "getContext(...)");
                        numValueOf = Integer.valueOf(colorsUiModelEablkybsjg2.xrmfcynszj(context2, ColorsUiModel.iobyxmoadg.ON_PRIMARY));
                    }
                    wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                } catch (Throwable th2) {
                    th = th2;
                    num = numValueOf;
                    colorStateList = colorStateListV;
                    kr0.wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo(th, new CrashlyticsKey[0]);
                    colorStateListV = colorStateList;
                    numValueOf = num;
                }
            } catch (Throwable th3) {
                th = th3;
                num = null;
            }
            if (colorStateListV != null) {
                materialButton.setBackgroundTintList(colorStateListV);
            }
            if (numValueOf != null) {
                materialButton.setTextColor(numValueOf.intValue());
            }
            zdlpuopuiu.lqeggnwhkg(materialButton);
            p41.dxjokdxxww.gtknphoqwx(materialButton, materialButton.isEnabled(), 0, 0, 6, null);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow eablkybsjg(final tg.draadjrbmk onPromoClicked) {
        zdlpuopuiu.btonecajqb(onPromoClicked, "onPromoClicked");
        return new ef.zoijcleaow(new rgvfuqvkyq() { // from class: kr1.zoijcleaow
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return gxszxtbevo.gxszxtbevo((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: kr1.ppxfxbqfkf
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return gxszxtbevo.lqeggnwhkg(onPromoClicked, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f60464zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final okpsazkaxt gxszxtbevo(LayoutInflater layoutInflater, ViewGroup root) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(root, "root");
        okpsazkaxt okpsazkaxtVarPpxfxbqfkf = okpsazkaxt.ppxfxbqfkf(layoutInflater, root, false);
        zdlpuopuiu.dxjokdxxww(okpsazkaxtVarPpxfxbqfkf, "inflate(...)");
        return okpsazkaxtVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(final tg.draadjrbmk draadjrbmkVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        ((okpsazkaxt) adapterDelegateViewBinding.ppxfxbqfkf()).f128308zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: kr1.wkgbmnqykc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gxszxtbevo.nufgyqmvbu(adapterDelegateViewBinding, draadjrbmkVar, view);
            }
        });
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: kr1.eablkybsjg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return gxszxtbevo.dxjokdxxww(adapterDelegateViewBinding, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nufgyqmvbu(ef.iobyxmoadg iobyxmoadgVar, tg.draadjrbmk draadjrbmkVar, View view) {
        if (iobyxmoadgVar.getBindingAdapterPosition() != -1) {
            draadjrbmkVar.invoke(iobyxmoadgVar.eablkybsjg());
        }
    }
}
