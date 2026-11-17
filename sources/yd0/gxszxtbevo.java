package yd0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.vipkmwdibw;
import ru.myspar.legacy.presentation.view.product.RestaurantProductView;
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
            return Boolean.valueOf(obj instanceof ae0.iobyxmoadg);
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f124360zdlpuopuiu = new zoijcleaow();

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
    public static final void btonecajqb(ef.iobyxmoadg iobyxmoadgVar, tg.draadjrbmk draadjrbmkVar, View view) {
        if (iobyxmoadgVar.getBindingAdapterPosition() != -1) {
            draadjrbmkVar.invoke(iobyxmoadgVar.eablkybsjg());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn draadjrbmk(ef.iobyxmoadg iobyxmoadgVar, List it) {
        zdlpuopuiu.btonecajqb(it, "it");
        dxjokdxxww(iobyxmoadgVar, (ae0.iobyxmoadg) iobyxmoadgVar.eablkybsjg());
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private static final void dxjokdxxww(ef.iobyxmoadg iobyxmoadgVar, ae0.iobyxmoadg iobyxmoadgVar2) {
        RestaurantProductView restaurantProductView = ((vipkmwdibw) iobyxmoadgVar.ppxfxbqfkf()).f66047zoijcleaow;
        restaurantProductView.setProduct(iobyxmoadgVar2);
        ge0.zoijcleaow zoijcleaowVarWkgbmnqykc = iobyxmoadgVar2.wkgbmnqykc();
        if (zoijcleaowVarWkgbmnqykc == null) {
            zoijcleaowVarWkgbmnqykc = ge0.zoijcleaow.READY;
        }
        restaurantProductView.setBuyButtonState(zoijcleaowVarWkgbmnqykc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gtknphoqwx(ef.iobyxmoadg iobyxmoadgVar, rgvfuqvkyq rgvfuqvkyqVar, double d13) {
        if (iobyxmoadgVar.getBindingAdapterPosition() != -1) {
            rgvfuqvkyqVar.invoke(iobyxmoadgVar.eablkybsjg(), Double.valueOf(d13));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow gxszxtbevo(final tg.draadjrbmk onProductClicked, final rgvfuqvkyq onBuyProductClicked) {
        zdlpuopuiu.btonecajqb(onProductClicked, "onProductClicked");
        zdlpuopuiu.btonecajqb(onBuyProductClicked, "onBuyProductClicked");
        return new ef.zoijcleaow(new rgvfuqvkyq() { // from class: yd0.iobyxmoadg
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return gxszxtbevo.lqeggnwhkg((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: yd0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return gxszxtbevo.nufgyqmvbu(onProductClicked, onBuyProductClicked, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f124360zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vipkmwdibw lqeggnwhkg(LayoutInflater layoutInflater, ViewGroup root) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(root, "root");
        vipkmwdibw vipkmwdibwVarPpxfxbqfkf = vipkmwdibw.ppxfxbqfkf(layoutInflater, root, false);
        zdlpuopuiu.dxjokdxxww(vipkmwdibwVarPpxfxbqfkf, "inflate(...)");
        return vipkmwdibwVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn nufgyqmvbu(final tg.draadjrbmk draadjrbmkVar, final rgvfuqvkyq rgvfuqvkyqVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        ((vipkmwdibw) adapterDelegateViewBinding.ppxfxbqfkf()).f66046ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: yd0.ppxfxbqfkf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gxszxtbevo.btonecajqb(adapterDelegateViewBinding, draadjrbmkVar, view);
            }
        });
        ((vipkmwdibw) adapterDelegateViewBinding.ppxfxbqfkf()).f66047zoijcleaow.setOnBuyButtonClicked(new tg.draadjrbmk() { // from class: yd0.wkgbmnqykc
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return gxszxtbevo.gtknphoqwx(adapterDelegateViewBinding, rgvfuqvkyqVar, ((Double) obj).doubleValue());
            }
        });
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: yd0.eablkybsjg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return gxszxtbevo.draadjrbmk(adapterDelegateViewBinding, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
