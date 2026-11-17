package r52;

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
import m60.oipsdeybqn;
import ru.myspar.core.domain.models.ColorsUiModel;
import ru.myspar.legacy.presentation.view.ProductPriceView;
import ru.myspar.services.crash_logger.api.CrashlyticsKey;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

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
            return Boolean.valueOf(obj instanceof p62.ppxfxbqfkf);
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f81823zdlpuopuiu = new zoijcleaow();

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
        ColorStateList colorStateListOkpsazkaxt;
        ColorsUiModel colorsUiModelEablkybsjg;
        ColorsUiModel colorsUiModelEablkybsjg2;
        zdlpuopuiu.btonecajqb(it, "it");
        oipsdeybqn oipsdeybqnVar = (oipsdeybqn) iobyxmoadgVar.ppxfxbqfkf();
        ShapeableImageView ivProductPhoto = oipsdeybqnVar.f65840ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(ivProductPhoto, "ivProductPhoto");
        c60.wkgbmnqykc.ppxfxbqfkf(ivProductPhoto, ((p62.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).nufgyqmvbu(), s40.gxszxtbevo.placeholder);
        oipsdeybqnVar.f65839lqeggnwhkg.setText(((p62.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).dxjokdxxww());
        ProductPriceView tvProductPrice = oipsdeybqnVar.f65837gxszxtbevo;
        zdlpuopuiu.dxjokdxxww(tvProductPrice, "tvProductPrice");
        tvProductPrice.setVisibility((((p62.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).gtknphoqwx() != null) != false ? 0 : 8);
        Double dGtknphoqwx = ((p62.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).gtknphoqwx();
        if (dGtknphoqwx != null) {
            oipsdeybqnVar.f65837gxszxtbevo.setPrice(dGtknphoqwx.doubleValue());
            oipsdeybqnVar.f65837gxszxtbevo.setUnitAndEnabled(((p62.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).wflxmlrfwp());
        }
        MaterialTextView tvOldPrice = oipsdeybqnVar.f65836eablkybsjg;
        zdlpuopuiu.dxjokdxxww(tvOldPrice, "tvOldPrice");
        tvOldPrice.setVisibility((((p62.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).btonecajqb() != null) != false ? 0 : 8);
        oipsdeybqnVar.f65836eablkybsjg.setPaintFlags(oipsdeybqnVar.f65842zoijcleaow.getPaintFlags() | 16);
        Double dBtonecajqb = ((p62.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).btonecajqb();
        if (dBtonecajqb != null) {
            double dDoubleValue = dBtonecajqb.doubleValue();
            MaterialTextView materialTextView = oipsdeybqnVar.f65836eablkybsjg;
            tzroggbefp tzroggbefpVar = tzroggbefp.f60034iobyxmoadg;
            String str = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue)}, 1));
            zdlpuopuiu.dxjokdxxww(str, "format(...)");
            materialTextView.setText(str);
        }
        MaterialTextView tvCurrencyOldPrice = oipsdeybqnVar.f65841wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(tvCurrencyOldPrice, "tvCurrencyOldPrice");
        tvCurrencyOldPrice.setVisibility((((p62.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).btonecajqb() != null) != false ? 0 : 8);
        MaterialButton btnAction = oipsdeybqnVar.f65842zoijcleaow;
        zdlpuopuiu.dxjokdxxww(btnAction, "btnAction");
        btnAction.setVisibility(((p62.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc() != null ? 0 : 8);
        p62.zoijcleaow zoijcleaowVarWkgbmnqykc = ((p62.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc();
        if (zoijcleaowVarWkgbmnqykc != null) {
            MaterialButton materialButton = oipsdeybqnVar.f65842zoijcleaow;
            materialButton.setText(zoijcleaowVarWkgbmnqykc.eablkybsjg());
            oipsdeybqnVar.f65842zoijcleaow.setEnabled(((p62.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).iobyxmoadg());
            ColorStateList colorStateList = null;
            numValueOf = null;
            numValueOf = null;
            Integer numValueOf = null;
            try {
                String strIobyxmoadg = zoijcleaowVarWkgbmnqykc.iobyxmoadg();
                if (strIobyxmoadg != null && strIobyxmoadg.length() != 0) {
                    colorStateListOkpsazkaxt = ColorStateList.valueOf(Color.parseColor(zoijcleaowVarWkgbmnqykc.iobyxmoadg()));
                } else if (((p62.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).eablkybsjg() == null || (colorsUiModelEablkybsjg = ((p62.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).eablkybsjg()) == null) {
                    colorStateListOkpsazkaxt = null;
                } else {
                    Context context = materialButton.getContext();
                    zdlpuopuiu.dxjokdxxww(context, "getContext(...)");
                    colorStateListOkpsazkaxt = colorsUiModelEablkybsjg.okpsazkaxt(context, ColorsUiModel.iobyxmoadg.PRIMARY);
                }
                try {
                    String strIobyxmoadg2 = zoijcleaowVarWkgbmnqykc.iobyxmoadg();
                    if (strIobyxmoadg2 != null && strIobyxmoadg2.length() != 0) {
                        numValueOf = Integer.valueOf(Color.parseColor(zoijcleaowVarWkgbmnqykc.zoijcleaow()));
                    } else if (((p62.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).eablkybsjg() != null && (colorsUiModelEablkybsjg2 = ((p62.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).eablkybsjg()) != null) {
                        Context context2 = materialButton.getContext();
                        zdlpuopuiu.dxjokdxxww(context2, "getContext(...)");
                        numValueOf = Integer.valueOf(colorsUiModelEablkybsjg2.wypolnanlu(context2, ColorsUiModel.iobyxmoadg.ON_PRIMARY));
                    }
                    wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                } catch (Throwable th2) {
                    th = th2;
                    num = numValueOf;
                    colorStateList = colorStateListOkpsazkaxt;
                    rs.wkgbmnqykc.f83693iobyxmoadg.gxszxtbevo(th, new CrashlyticsKey[0]);
                    colorStateListOkpsazkaxt = colorStateList;
                    numValueOf = num;
                }
            } catch (Throwable th3) {
                th = th3;
                num = null;
            }
            if (colorStateListOkpsazkaxt != null) {
                materialButton.setBackgroundTintList(colorStateListOkpsazkaxt);
            }
            if (numValueOf != null) {
                materialButton.setTextColor(numValueOf.intValue());
            }
            zdlpuopuiu.lqeggnwhkg(materialButton);
            c60.nufgyqmvbu.gtknphoqwx(materialButton, materialButton.isEnabled(), 0, 0, 6, null);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow eablkybsjg(final tg.draadjrbmk onProductClicked) {
        zdlpuopuiu.btonecajqb(onProductClicked, "onProductClicked");
        return new ef.zoijcleaow(new rgvfuqvkyq() { // from class: r52.dxjokdxxww
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return wflxmlrfwp.gxszxtbevo((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: r52.btonecajqb
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return wflxmlrfwp.lqeggnwhkg(onProductClicked, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f81823zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oipsdeybqn gxszxtbevo(LayoutInflater layoutInflater, ViewGroup root) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(root, "root");
        oipsdeybqn oipsdeybqnVarPpxfxbqfkf = oipsdeybqn.ppxfxbqfkf(layoutInflater, root, false);
        zdlpuopuiu.dxjokdxxww(oipsdeybqnVarPpxfxbqfkf, "inflate(...)");
        return oipsdeybqnVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(final tg.draadjrbmk draadjrbmkVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        ((oipsdeybqn) adapterDelegateViewBinding.ppxfxbqfkf()).f65842zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: r52.gtknphoqwx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wflxmlrfwp.nufgyqmvbu(adapterDelegateViewBinding, draadjrbmkVar, view);
            }
        });
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: r52.draadjrbmk
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
