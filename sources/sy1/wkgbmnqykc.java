package sy1;

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
import m60.ribwqtqdhb;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

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
            return Boolean.valueOf(obj instanceof mx1.iobyxmoadg.C1458iobyxmoadg);
        }
    }

    public static final class ppxfxbqfkf implements View.OnClickListener {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ vdvldrhtss f108764iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ef.iobyxmoadg f108765jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f108766yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f108767zdlpuopuiu;

        public ppxfxbqfkf(jpowsppfya jpowsppfyaVar, long j13, ef.iobyxmoadg iobyxmoadgVar, vdvldrhtss vdvldrhtssVar) {
            this.f108767zdlpuopuiu = jpowsppfyaVar;
            this.f108766yggfygwlhe = j13;
            this.f108765jyumaefscl = iobyxmoadgVar;
            this.f108764iwizpuwonk = vdvldrhtssVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f108767zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f108766yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            if (this.f108765jyumaefscl.getBindingAdapterPosition() != -1) {
                this.f108764iwizpuwonk.invoke(this.f108765jyumaefscl.eablkybsjg(), Double.valueOf(((mx1.iobyxmoadg.C1458iobyxmoadg) this.f108765jyumaefscl.eablkybsjg()).zoijcleaow() ? 0.0d : ((mx1.iobyxmoadg.C1458iobyxmoadg) this.f108765jyumaefscl.eablkybsjg()).gtknphoqwx()), ((mx1.iobyxmoadg.C1458iobyxmoadg) this.f108765jyumaefscl.eablkybsjg()).nufgyqmvbu().getCurrentMeasure());
            }
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f108768zdlpuopuiu = new zoijcleaow();

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
        ((ribwqtqdhb) iobyxmoadgVar.ppxfxbqfkf()).f65930eablkybsjg.setImageResource(((mx1.iobyxmoadg.C1458iobyxmoadg) iobyxmoadgVar.eablkybsjg()).eablkybsjg() ? s40.gxszxtbevo.ic_heart : s40.gxszxtbevo.ic_heart_off);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ribwqtqdhb eablkybsjg(LayoutInflater layoutInflater, ViewGroup root) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(root, "root");
        ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = ribwqtqdhb.ppxfxbqfkf(layoutInflater, root, false);
        zdlpuopuiu.dxjokdxxww(ribwqtqdhbVarPpxfxbqfkf, "inflate(...)");
        return ribwqtqdhbVarPpxfxbqfkf;
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
        AppCompatImageView ivAddToCart = ((ribwqtqdhb) adapterDelegateViewBinding.ppxfxbqfkf()).f65938wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(ivAddToCart, "ivAddToCart");
        ivAddToCart.setOnClickListener(new ppxfxbqfkf(new jpowsppfya(), 400L, adapterDelegateViewBinding, vdvldrhtssVar));
        adapterDelegateViewBinding.zoijcleaow(new draadjrbmk() { // from class: sy1.ppxfxbqfkf
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return wkgbmnqykc.gtknphoqwx(adapterDelegateViewBinding, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private static final void lqeggnwhkg(ef.iobyxmoadg iobyxmoadgVar) {
        ribwqtqdhb ribwqtqdhbVar = (ribwqtqdhb) iobyxmoadgVar.ppxfxbqfkf();
        ShapeableImageView ivPhoto = ribwqtqdhbVar.f65932gxszxtbevo;
        zdlpuopuiu.dxjokdxxww(ivPhoto, "ivPhoto");
        c60.wkgbmnqykc.ppxfxbqfkf(ivPhoto, ((mx1.iobyxmoadg.C1458iobyxmoadg) iobyxmoadgVar.eablkybsjg()).dxjokdxxww(), s40.gxszxtbevo.placeholder);
        ribwqtqdhbVar.f65929dxjokdxxww.setText(((mx1.iobyxmoadg.C1458iobyxmoadg) iobyxmoadgVar.eablkybsjg()).ppxfxbqfkf());
        ribwqtqdhbVar.f65927btonecajqb.setText(((mx1.iobyxmoadg.C1458iobyxmoadg) iobyxmoadgVar.eablkybsjg()).btonecajqb());
        ribwqtqdhbVar.f65935nufgyqmvbu.setText(((mx1.iobyxmoadg.C1458iobyxmoadg) iobyxmoadgVar.eablkybsjg()).nufgyqmvbu().getCurrentMeasure().getValue());
        ribwqtqdhbVar.f65931gtknphoqwx.setText(((mx1.iobyxmoadg.C1458iobyxmoadg) iobyxmoadgVar.eablkybsjg()).draadjrbmk());
        ribwqtqdhbVar.f65937wflxmlrfwp.setText(((mx1.iobyxmoadg.C1458iobyxmoadg) iobyxmoadgVar.eablkybsjg()).wflxmlrfwp());
        AppCompatImageView ivAddToCart = ribwqtqdhbVar.f65938wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(ivAddToCart, "ivAddToCart");
        ivAddToCart.setVisibility(!((mx1.iobyxmoadg.C1458iobyxmoadg) iobyxmoadgVar.eablkybsjg()).lqeggnwhkg() ? 4 : 0);
        dxjokdxxww(iobyxmoadgVar);
        nufgyqmvbu(iobyxmoadgVar);
    }

    private static final void nufgyqmvbu(ef.iobyxmoadg iobyxmoadgVar) {
        ((ribwqtqdhb) iobyxmoadgVar.ppxfxbqfkf()).f65938wkgbmnqykc.setImageResource(((mx1.iobyxmoadg.C1458iobyxmoadg) iobyxmoadgVar.eablkybsjg()).zoijcleaow() ? s40.gxszxtbevo.ic_check_done_my_purchases : s40.gxszxtbevo.ic_basket_primary);
    }

    public static final df.zoijcleaow wkgbmnqykc(final vdvldrhtss onAddToCartClicked) {
        zdlpuopuiu.btonecajqb(onAddToCartClicked, "onAddToCartClicked");
        return new ef.zoijcleaow(new rgvfuqvkyq() { // from class: sy1.iobyxmoadg
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return wkgbmnqykc.eablkybsjg((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new draadjrbmk() { // from class: sy1.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return wkgbmnqykc.gxszxtbevo(onAddToCartClicked, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f108768zdlpuopuiu);
    }
}
