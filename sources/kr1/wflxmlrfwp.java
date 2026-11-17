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
import z41.jhduphickx;

/* JADX INFO: loaded from: classes6.dex */
public abstract class wflxmlrfwp {

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
        public static final zoijcleaow f60470zdlpuopuiu = new zoijcleaow();

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
        jhduphickx jhduphickxVar = (jhduphickx) iobyxmoadgVar.ppxfxbqfkf();
        ShapeableImageView ivProductPhoto = jhduphickxVar.f128152ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(ivProductPhoto, "ivProductPhoto");
        p41.eablkybsjg.ppxfxbqfkf(ivProductPhoto, ((is1.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).nufgyqmvbu(), b31.gxszxtbevo.placeholder);
        jhduphickxVar.f128151lqeggnwhkg.setText(((is1.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).dxjokdxxww());
        ProductPriceView tvProductPrice = jhduphickxVar.f128149gxszxtbevo;
        zdlpuopuiu.dxjokdxxww(tvProductPrice, "tvProductPrice");
        tvProductPrice.setVisibility((((is1.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).gtknphoqwx() != null) != false ? 0 : 8);
        Double dGtknphoqwx = ((is1.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).gtknphoqwx();
        if (dGtknphoqwx != null) {
            jhduphickxVar.f128149gxszxtbevo.setPrice(dGtknphoqwx.doubleValue());
            jhduphickxVar.f128149gxszxtbevo.setUnitAndEnabled(((is1.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).wflxmlrfwp());
        }
        MaterialTextView tvOldPrice = jhduphickxVar.f128148eablkybsjg;
        zdlpuopuiu.dxjokdxxww(tvOldPrice, "tvOldPrice");
        tvOldPrice.setVisibility((((is1.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).btonecajqb() != null) != false ? 0 : 8);
        jhduphickxVar.f128148eablkybsjg.setPaintFlags(jhduphickxVar.f128154zoijcleaow.getPaintFlags() | 16);
        Double dBtonecajqb = ((is1.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).btonecajqb();
        if (dBtonecajqb != null) {
            double dDoubleValue = dBtonecajqb.doubleValue();
            MaterialTextView materialTextView = jhduphickxVar.f128148eablkybsjg;
            tzroggbefp tzroggbefpVar = tzroggbefp.f60034iobyxmoadg;
            String str = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue)}, 1));
            zdlpuopuiu.dxjokdxxww(str, "format(...)");
            materialTextView.setText(str);
        }
        MaterialTextView tvCurrencyOldPrice = jhduphickxVar.f128153wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(tvCurrencyOldPrice, "tvCurrencyOldPrice");
        tvCurrencyOldPrice.setVisibility((((is1.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).btonecajqb() != null) != false ? 0 : 8);
        MaterialButton btnAction = jhduphickxVar.f128154zoijcleaow;
        zdlpuopuiu.dxjokdxxww(btnAction, "btnAction");
        btnAction.setVisibility(((is1.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc() != null ? 0 : 8);
        is1.zoijcleaow zoijcleaowVarWkgbmnqykc = ((is1.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc();
        if (zoijcleaowVarWkgbmnqykc != null) {
            MaterialButton materialButton = jhduphickxVar.f128154zoijcleaow;
            materialButton.setText(zoijcleaowVarWkgbmnqykc.eablkybsjg());
            jhduphickxVar.f128154zoijcleaow.setEnabled(((is1.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).iobyxmoadg());
            ColorStateList colorStateList = null;
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
                        numValueOf = Integer.valueOf(Color.parseColor(zoijcleaowVarWkgbmnqykc.zoijcleaow()));
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

    public static final df.zoijcleaow eablkybsjg(final tg.draadjrbmk onProductClicked) {
        zdlpuopuiu.btonecajqb(onProductClicked, "onProductClicked");
        return new ef.zoijcleaow(new rgvfuqvkyq() { // from class: kr1.dxjokdxxww
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return wflxmlrfwp.gxszxtbevo((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: kr1.btonecajqb
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return wflxmlrfwp.lqeggnwhkg(onProductClicked, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f60470zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jhduphickx gxszxtbevo(LayoutInflater layoutInflater, ViewGroup root) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(root, "root");
        jhduphickx jhduphickxVarPpxfxbqfkf = jhduphickx.ppxfxbqfkf(layoutInflater, root, false);
        zdlpuopuiu.dxjokdxxww(jhduphickxVarPpxfxbqfkf, "inflate(...)");
        return jhduphickxVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(final tg.draadjrbmk draadjrbmkVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        ((jhduphickx) adapterDelegateViewBinding.ppxfxbqfkf()).f128154zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: kr1.gtknphoqwx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wflxmlrfwp.nufgyqmvbu(adapterDelegateViewBinding, draadjrbmkVar, view);
            }
        });
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: kr1.draadjrbmk
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return wflxmlrfwp.dxjokdxxww(adapterDelegateViewBinding, (List) obj);
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
