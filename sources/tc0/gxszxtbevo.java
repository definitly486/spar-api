package tc0;

import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Group;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import gg.wwaezpbzkn;
import i1.nufgyqmvbu;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.tzroggbefp;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.opjhrmiecq;
import pm.dxjokdxxww;
import ru.myspar.common.view.counter.model.Price;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes4.dex */
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
            return Boolean.valueOf(obj instanceof vc0.iobyxmoadg);
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f110248zdlpuopuiu = new zoijcleaow();

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
    public static final void btonecajqb(ef.iobyxmoadg iobyxmoadgVar, draadjrbmk draadjrbmkVar, View view) {
        if (iobyxmoadgVar.getBindingAdapterPosition() != -1) {
            draadjrbmkVar.invoke(iobyxmoadgVar.eablkybsjg());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dxjokdxxww(ef.iobyxmoadg iobyxmoadgVar, draadjrbmk draadjrbmkVar, View view) {
        if (iobyxmoadgVar.getBindingAdapterPosition() != -1) {
            draadjrbmkVar.invoke(iobyxmoadgVar.eablkybsjg());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gtknphoqwx(ef.iobyxmoadg iobyxmoadgVar, List it) {
        zdlpuopuiu.btonecajqb(it, "it");
        opjhrmiecq opjhrmiecqVar = (opjhrmiecq) iobyxmoadgVar.ppxfxbqfkf();
        String string = iobyxmoadgVar.wkgbmnqykc().getString(dxjokdxxww.format_forward_slash, ((vc0.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).zdlpuopuiu());
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        Price priceRgvfuqvkyq = ((vc0.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).rgvfuqvkyq();
        Typeface typefaceCreate = Typeface.create(nufgyqmvbu.dxjokdxxww(iobyxmoadgVar.wkgbmnqykc(), s40.lqeggnwhkg.cera_round_bold), 0);
        zdlpuopuiu.dxjokdxxww(typefaceCreate, "create(...)");
        CharSequence charSequencePpxfxbqfkf = priceRgvfuqvkyq.ppxfxbqfkf(string, typefaceCreate);
        int color = Color.parseColor(((vc0.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).eablkybsjg());
        long jArgb = ((long) Color.argb(65, Color.red(color), Color.green(color), Color.blue(color))) & 4294967295L;
        MaterialTextView tvPromotionNoStickerHeader = opjhrmiecqVar.f65857eablkybsjg;
        zdlpuopuiu.dxjokdxxww(tvPromotionNoStickerHeader, "tvPromotionNoStickerHeader");
        tvPromotionNoStickerHeader.setVisibility(((vc0.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).oxmwwwfdhm() ? 0 : 8);
        MaterialTextView tvPromotionNoStickerHeader2 = opjhrmiecqVar.f65857eablkybsjg;
        zdlpuopuiu.dxjokdxxww(tvPromotionNoStickerHeader2, "tvPromotionNoStickerHeader");
        tzroggbefp tzroggbefpVar = tzroggbefp.f60034iobyxmoadg;
        String str = String.format("#%06X", Arrays.copyOf(new Object[]{Long.valueOf(jArgb)}, 1));
        zdlpuopuiu.dxjokdxxww(str, "format(...)");
        c60.lqeggnwhkg.ppxfxbqfkf(tvPromotionNoStickerHeader2, str);
        opjhrmiecqVar.f65860lqeggnwhkg.setText(((vc0.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).btonecajqb());
        Group groupPrice = opjhrmiecqVar.f65862ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(groupPrice, "groupPrice");
        groupPrice.setVisibility(((vc0.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).draadjrbmk() ? 0 : 8);
        opjhrmiecqVar.f65861nufgyqmvbu.setText(charSequencePpxfxbqfkf);
        opjhrmiecqVar.f65858gxszxtbevo.setText(((vc0.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).gtknphoqwx());
        MaterialTextView materialTextView = opjhrmiecqVar.f65858gxszxtbevo;
        materialTextView.setPaintFlags(materialTextView.getPaintFlags() | 16);
        ShapeableImageView ivPromotionProduct = opjhrmiecqVar.f65863wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(ivPromotionProduct, "ivPromotionProduct");
        c60.wkgbmnqykc.zoijcleaow(ivPromotionProduct, ((vc0.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).wflxmlrfwp());
        opjhrmiecqVar.f65856dxjokdxxww.setText(((vc0.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).vdvldrhtss());
        MaterialButton materialButton = ((opjhrmiecq) iobyxmoadgVar.ppxfxbqfkf()).f65864zoijcleaow;
        zdlpuopuiu.lqeggnwhkg(materialButton);
        c60.lqeggnwhkg.eablkybsjg(materialButton, ((vc0.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).eablkybsjg(), ((vc0.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).eablkybsjg());
        materialButton.setEnabled(((vc0.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).lqeggnwhkg());
        materialButton.setText(((vc0.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).nufgyqmvbu());
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow gxszxtbevo(final draadjrbmk onActivateClicked, final draadjrbmk onItemClicked) {
        zdlpuopuiu.btonecajqb(onActivateClicked, "onActivateClicked");
        zdlpuopuiu.btonecajqb(onItemClicked, "onItemClicked");
        return new ef.zoijcleaow(new rgvfuqvkyq() { // from class: tc0.iobyxmoadg
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return gxszxtbevo.lqeggnwhkg((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new draadjrbmk() { // from class: tc0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return gxszxtbevo.nufgyqmvbu(onItemClicked, onActivateClicked, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f110248zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final opjhrmiecq lqeggnwhkg(LayoutInflater layoutInflater, ViewGroup root) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(root, "root");
        opjhrmiecq opjhrmiecqVarPpxfxbqfkf = opjhrmiecq.ppxfxbqfkf(layoutInflater, root, false);
        zdlpuopuiu.dxjokdxxww(opjhrmiecqVarPpxfxbqfkf, "inflate(...)");
        return opjhrmiecqVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn nufgyqmvbu(final draadjrbmk draadjrbmkVar, final draadjrbmk draadjrbmkVar2, final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        ((opjhrmiecq) adapterDelegateViewBinding.ppxfxbqfkf()).getRoot().setOnClickListener(new View.OnClickListener() { // from class: tc0.ppxfxbqfkf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gxszxtbevo.dxjokdxxww(adapterDelegateViewBinding, draadjrbmkVar, view);
            }
        });
        ((opjhrmiecq) adapterDelegateViewBinding.ppxfxbqfkf()).f65864zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: tc0.wkgbmnqykc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gxszxtbevo.btonecajqb(adapterDelegateViewBinding, draadjrbmkVar2, view);
            }
        });
        adapterDelegateViewBinding.zoijcleaow(new draadjrbmk() { // from class: tc0.eablkybsjg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return gxszxtbevo.gtknphoqwx(adapterDelegateViewBinding, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
