package ub1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.legacy.presentation.view.product.RestaurantProductView;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;
import z41.kegysxyocb;

/* JADX INFO: loaded from: classes5.dex */
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
            return Boolean.valueOf(obj instanceof wb1.iobyxmoadg);
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f113219zdlpuopuiu = new zoijcleaow();

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
        dxjokdxxww(iobyxmoadgVar, (wb1.iobyxmoadg) iobyxmoadgVar.eablkybsjg());
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private static final void dxjokdxxww(ef.iobyxmoadg iobyxmoadgVar, wb1.iobyxmoadg iobyxmoadgVar2) {
        RestaurantProductView restaurantProductView = ((kegysxyocb) iobyxmoadgVar.ppxfxbqfkf()).f128221zoijcleaow;
        restaurantProductView.setProduct(iobyxmoadgVar2);
        bc1.zoijcleaow zoijcleaowVarWkgbmnqykc = iobyxmoadgVar2.wkgbmnqykc();
        if (zoijcleaowVarWkgbmnqykc == null) {
            zoijcleaowVarWkgbmnqykc = bc1.zoijcleaow.READY;
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
        return new ef.zoijcleaow(new rgvfuqvkyq() { // from class: ub1.iobyxmoadg
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return gxszxtbevo.lqeggnwhkg((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: ub1.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return gxszxtbevo.nufgyqmvbu(onProductClicked, onBuyProductClicked, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f113219zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kegysxyocb lqeggnwhkg(LayoutInflater layoutInflater, ViewGroup root) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(root, "root");
        kegysxyocb kegysxyocbVarPpxfxbqfkf = kegysxyocb.ppxfxbqfkf(layoutInflater, root, false);
        zdlpuopuiu.dxjokdxxww(kegysxyocbVarPpxfxbqfkf, "inflate(...)");
        return kegysxyocbVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn nufgyqmvbu(final tg.draadjrbmk draadjrbmkVar, final rgvfuqvkyq rgvfuqvkyqVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        ((kegysxyocb) adapterDelegateViewBinding.ppxfxbqfkf()).f128220ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: ub1.ppxfxbqfkf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gxszxtbevo.btonecajqb(adapterDelegateViewBinding, draadjrbmkVar, view);
            }
        });
        ((kegysxyocb) adapterDelegateViewBinding.ppxfxbqfkf()).f128221zoijcleaow.setOnBuyButtonClicked(new tg.draadjrbmk() { // from class: ub1.wkgbmnqykc
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return gxszxtbevo.gtknphoqwx(adapterDelegateViewBinding, rgvfuqvkyqVar, ((Double) obj).doubleValue());
            }
        });
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: ub1.eablkybsjg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return gxszxtbevo.draadjrbmk(adapterDelegateViewBinding, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
