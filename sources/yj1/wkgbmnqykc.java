package yj1;

import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.imageview.ShapeableImageView;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.jpowsppfya;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;
import z41.stevsuqkhv;

/* JADX INFO: loaded from: classes6.dex */
public abstract class wkgbmnqykc {

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
            return Boolean.valueOf(obj instanceof si1.iobyxmoadg.C2611iobyxmoadg);
        }
    }

    public static final class ppxfxbqfkf implements View.OnClickListener {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ vdvldrhtss f125529iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ef.iobyxmoadg f125530jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f125531yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f125532zdlpuopuiu;

        public ppxfxbqfkf(jpowsppfya jpowsppfyaVar, long j13, ef.iobyxmoadg iobyxmoadgVar, vdvldrhtss vdvldrhtssVar) {
            this.f125532zdlpuopuiu = jpowsppfyaVar;
            this.f125531yggfygwlhe = j13;
            this.f125530jyumaefscl = iobyxmoadgVar;
            this.f125529iwizpuwonk = vdvldrhtssVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f125532zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f125531yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            if (this.f125530jyumaefscl.getBindingAdapterPosition() != -1) {
                this.f125529iwizpuwonk.invoke(this.f125530jyumaefscl.eablkybsjg(), Double.valueOf(((si1.iobyxmoadg.C2611iobyxmoadg) this.f125530jyumaefscl.eablkybsjg()).zoijcleaow() ? 0.0d : ((si1.iobyxmoadg.C2611iobyxmoadg) this.f125530jyumaefscl.eablkybsjg()).dxjokdxxww()), ((si1.iobyxmoadg.C2611iobyxmoadg) this.f125530jyumaefscl.eablkybsjg()).gxszxtbevo().getCurrentMeasure());
            }
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f125533zdlpuopuiu = new zoijcleaow();

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

    private static final void btonecajqb(ef.iobyxmoadg iobyxmoadgVar, List list) {
        for (Object obj : list) {
            zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
            for (Object obj2 : (List) obj) {
                if (obj2 instanceof btonecajqb.zoijcleaow) {
                    dxjokdxxww(iobyxmoadgVar);
                }
                if (obj2 instanceof btonecajqb.iobyxmoadg) {
                    nufgyqmvbu(iobyxmoadgVar);
                }
            }
        }
    }

    private static final void dxjokdxxww(ef.iobyxmoadg iobyxmoadgVar) {
        ((stevsuqkhv) iobyxmoadgVar.ppxfxbqfkf()).f128391eablkybsjg.setImageResource(((si1.iobyxmoadg.C2611iobyxmoadg) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc() ? b31.gxszxtbevo.ic_heart : b31.gxszxtbevo.ic_heart_off);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final stevsuqkhv eablkybsjg(LayoutInflater layoutInflater, ViewGroup root) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(root, "root");
        stevsuqkhv stevsuqkhvVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(layoutInflater, root, false);
        zdlpuopuiu.dxjokdxxww(stevsuqkhvVarPpxfxbqfkf, "inflate(...)");
        return stevsuqkhvVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gtknphoqwx(ef.iobyxmoadg iobyxmoadgVar, List payloads) {
        zdlpuopuiu.btonecajqb(payloads, "payloads");
        if (payloads.isEmpty()) {
            lqeggnwhkg(iobyxmoadgVar);
        } else {
            btonecajqb(iobyxmoadgVar, payloads);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gxszxtbevo(vdvldrhtss vdvldrhtssVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        AppCompatImageView ivAddToCart = ((stevsuqkhv) adapterDelegateViewBinding.ppxfxbqfkf()).f128399wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(ivAddToCart, "ivAddToCart");
        ivAddToCart.setOnClickListener(new ppxfxbqfkf(new jpowsppfya(), 400L, adapterDelegateViewBinding, vdvldrhtssVar));
        adapterDelegateViewBinding.zoijcleaow(new draadjrbmk() { // from class: yj1.ppxfxbqfkf
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return wkgbmnqykc.gtknphoqwx(adapterDelegateViewBinding, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private static final void lqeggnwhkg(ef.iobyxmoadg iobyxmoadgVar) {
        stevsuqkhv stevsuqkhvVar = (stevsuqkhv) iobyxmoadgVar.ppxfxbqfkf();
        ShapeableImageView ivPhoto = stevsuqkhvVar.f128393gxszxtbevo;
        zdlpuopuiu.dxjokdxxww(ivPhoto, "ivPhoto");
        p41.eablkybsjg.ppxfxbqfkf(ivPhoto, ((si1.iobyxmoadg.C2611iobyxmoadg) iobyxmoadgVar.eablkybsjg()).lqeggnwhkg(), b31.gxszxtbevo.placeholder);
        stevsuqkhvVar.f128390dxjokdxxww.setText(((si1.iobyxmoadg.C2611iobyxmoadg) iobyxmoadgVar.eablkybsjg()).ppxfxbqfkf());
        stevsuqkhvVar.f128388btonecajqb.setText(((si1.iobyxmoadg.C2611iobyxmoadg) iobyxmoadgVar.eablkybsjg()).nufgyqmvbu());
        stevsuqkhvVar.f128396nufgyqmvbu.setText(((si1.iobyxmoadg.C2611iobyxmoadg) iobyxmoadgVar.eablkybsjg()).gxszxtbevo().getCurrentMeasure().getValue());
        stevsuqkhvVar.f128392gtknphoqwx.setText(((si1.iobyxmoadg.C2611iobyxmoadg) iobyxmoadgVar.eablkybsjg()).btonecajqb());
        stevsuqkhvVar.f128398wflxmlrfwp.setText(((si1.iobyxmoadg.C2611iobyxmoadg) iobyxmoadgVar.eablkybsjg()).gtknphoqwx());
        AppCompatImageView ivAddToCart = stevsuqkhvVar.f128399wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(ivAddToCart, "ivAddToCart");
        ivAddToCart.setVisibility(!((si1.iobyxmoadg.C2611iobyxmoadg) iobyxmoadgVar.eablkybsjg()).eablkybsjg() ? 4 : 0);
        dxjokdxxww(iobyxmoadgVar);
        nufgyqmvbu(iobyxmoadgVar);
    }

    private static final void nufgyqmvbu(ef.iobyxmoadg iobyxmoadgVar) {
        ((stevsuqkhv) iobyxmoadgVar.ppxfxbqfkf()).f128399wkgbmnqykc.setImageResource(((si1.iobyxmoadg.C2611iobyxmoadg) iobyxmoadgVar.eablkybsjg()).zoijcleaow() ? b31.gxszxtbevo.ic_check_done_my_purchases : b31.gxszxtbevo.ic_basket_primary);
    }

    public static final df.zoijcleaow wkgbmnqykc(final vdvldrhtss onAddToCartClicked) {
        zdlpuopuiu.btonecajqb(onAddToCartClicked, "onAddToCartClicked");
        return new ef.zoijcleaow(new rgvfuqvkyq() { // from class: yj1.iobyxmoadg
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return wkgbmnqykc.eablkybsjg((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new draadjrbmk() { // from class: yj1.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return wkgbmnqykc.gxszxtbevo(onAddToCartClicked, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f125533zdlpuopuiu);
    }
}
