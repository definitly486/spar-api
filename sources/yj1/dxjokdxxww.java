package yj1;

import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.material.imageview.ShapeableImageView;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.jpowsppfya;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.models.measure_type.MeasureType;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes6.dex */
public abstract class dxjokdxxww {

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
            return Boolean.valueOf(obj instanceof si1.iobyxmoadg.zoijcleaow);
        }
    }

    public static final class ppxfxbqfkf implements View.OnClickListener {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ vdvldrhtss f125510iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ef.iobyxmoadg f125511jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f125512yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f125513zdlpuopuiu;

        public ppxfxbqfkf(jpowsppfya jpowsppfyaVar, long j13, ef.iobyxmoadg iobyxmoadgVar, vdvldrhtss vdvldrhtssVar) {
            this.f125513zdlpuopuiu = jpowsppfyaVar;
            this.f125512yggfygwlhe = j13;
            this.f125511jyumaefscl = iobyxmoadgVar;
            this.f125510iwizpuwonk = vdvldrhtssVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f125513zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f125512yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            if (this.f125511jyumaefscl.getBindingAdapterPosition() != -1) {
                this.f125510iwizpuwonk.invoke(this.f125511jyumaefscl.eablkybsjg(), Double.valueOf(((si1.iobyxmoadg.zoijcleaow) this.f125511jyumaefscl.eablkybsjg()).zoijcleaow() ? 0.0d : ((si1.iobyxmoadg.zoijcleaow) this.f125511jyumaefscl.eablkybsjg()).dxjokdxxww()), ((si1.iobyxmoadg.zoijcleaow) this.f125511jyumaefscl.eablkybsjg()).gxszxtbevo().getCurrentMeasure());
            }
        }
    }

    public static final class wkgbmnqykc implements View.OnClickListener {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ draadjrbmk f125514iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ef.iobyxmoadg f125515jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f125516yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f125517zdlpuopuiu;

        public wkgbmnqykc(jpowsppfya jpowsppfyaVar, long j13, ef.iobyxmoadg iobyxmoadgVar, draadjrbmk draadjrbmkVar) {
            this.f125517zdlpuopuiu = jpowsppfyaVar;
            this.f125516yggfygwlhe = j13;
            this.f125515jyumaefscl = iobyxmoadgVar;
            this.f125514iwizpuwonk = draadjrbmkVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            draadjrbmk draadjrbmkVar;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f125517zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f125516yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            if (this.f125515jyumaefscl.getBindingAdapterPosition() == -1 || (draadjrbmkVar = this.f125514iwizpuwonk) == null) {
                return;
            }
            draadjrbmkVar.invoke(this.f125515jyumaefscl.eablkybsjg());
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f125518zdlpuopuiu = new zoijcleaow();

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

    private static final void agtfadlqog(ef.iobyxmoadg iobyxmoadgVar, rgvfuqvkyq rgvfuqvkyqVar, List list) {
        for (Object obj : list) {
            zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
            for (Object obj2 : (List) obj) {
                if (obj2 instanceof btonecajqb.zoijcleaow) {
                    btonecajqb(iobyxmoadgVar);
                }
                if (obj2 instanceof btonecajqb.iobyxmoadg) {
                    dxjokdxxww(iobyxmoadgVar);
                }
            }
        }
    }

    private static final void btonecajqb(ef.iobyxmoadg iobyxmoadgVar) {
        ((yi1.nufgyqmvbu) iobyxmoadgVar.ppxfxbqfkf()).f125441gxszxtbevo.setImageResource(((si1.iobyxmoadg.zoijcleaow) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc() ? b31.gxszxtbevo.ic_heart : b31.gxszxtbevo.ic_heart_off);
    }

    private static final void draadjrbmk(final ef.iobyxmoadg iobyxmoadgVar, final rgvfuqvkyq rgvfuqvkyqVar, int i13) {
        ComposeView cvRatingBar = ((yi1.nufgyqmvbu) iobyxmoadgVar.ppxfxbqfkf()).f125446wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(cvRatingBar, "cvRatingBar");
        qt0.wkgbmnqykc.iobyxmoadg(cvRatingBar, i13, new draadjrbmk() { // from class: yj1.nufgyqmvbu
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return dxjokdxxww.wflxmlrfwp(rgvfuqvkyqVar, iobyxmoadgVar, ((Integer) obj).intValue());
            }
        });
    }

    private static final void dxjokdxxww(ef.iobyxmoadg iobyxmoadgVar) {
        ((yi1.nufgyqmvbu) iobyxmoadgVar.ppxfxbqfkf()).f125439eablkybsjg.setImageResource(((si1.iobyxmoadg.zoijcleaow) iobyxmoadgVar.eablkybsjg()).zoijcleaow() ? b31.gxszxtbevo.ic_check_done_my_purchases : b31.gxszxtbevo.ic_basket_14);
    }

    public static final df.zoijcleaow eablkybsjg(final vdvldrhtss onAddToCartClicked, final rgvfuqvkyq onSetRatingClicked, final draadjrbmk draadjrbmkVar) {
        zdlpuopuiu.btonecajqb(onAddToCartClicked, "onAddToCartClicked");
        zdlpuopuiu.btonecajqb(onSetRatingClicked, "onSetRatingClicked");
        return new ef.zoijcleaow(new rgvfuqvkyq() { // from class: yj1.eablkybsjg
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return dxjokdxxww.gxszxtbevo((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new draadjrbmk() { // from class: yj1.gxszxtbevo
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return dxjokdxxww.lqeggnwhkg(onAddToCartClicked, draadjrbmkVar, onSetRatingClicked, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f125518zdlpuopuiu);
    }

    private static final void gtknphoqwx(ef.iobyxmoadg iobyxmoadgVar, mr0.iobyxmoadg iobyxmoadgVar2) {
        int i13;
        int i14;
        MeasureType currentMeasure = ((si1.iobyxmoadg.zoijcleaow) iobyxmoadgVar.eablkybsjg()).gxszxtbevo().getCurrentMeasure();
        if (currentMeasure instanceof MeasureType.WEIGHT) {
            i13 = ti1.nufgyqmvbu.proloyalty_weight_format;
        } else {
            if (!(currentMeasure instanceof MeasureType.AMOUNT)) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = ti1.nufgyqmvbu.proloyalty_measure_amount_format;
        }
        String strGxszxtbevo = iobyxmoadgVar.gxszxtbevo(i13, iobyxmoadgVar2.iobyxmoadg());
        MeasureType currentMeasure2 = ((si1.iobyxmoadg.zoijcleaow) iobyxmoadgVar.eablkybsjg()).gxszxtbevo().getCurrentMeasure();
        if (currentMeasure2 instanceof MeasureType.WEIGHT) {
            i14 = ti1.nufgyqmvbu.proloyalty_price_per_wight_format;
        } else {
            if (!(currentMeasure2 instanceof MeasureType.AMOUNT)) {
                throw new NoWhenBranchMatchedException();
            }
            i14 = ti1.nufgyqmvbu.proloyalty_price_per_amount_format;
        }
        ((yi1.nufgyqmvbu) iobyxmoadgVar.ppxfxbqfkf()).f125438dxjokdxxww.setText(iobyxmoadgVar.gxszxtbevo(ti1.nufgyqmvbu.proloyalty_purchase_price_format, strGxszxtbevo, iobyxmoadgVar.gxszxtbevo(i14, iobyxmoadgVar2.zoijcleaow(), iobyxmoadgVar2.ppxfxbqfkf())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yi1.nufgyqmvbu gxszxtbevo(LayoutInflater layoutInflater, ViewGroup root) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(root, "root");
        yi1.nufgyqmvbu nufgyqmvbuVarPpxfxbqfkf = yi1.nufgyqmvbu.ppxfxbqfkf(layoutInflater, root, false);
        zdlpuopuiu.dxjokdxxww(nufgyqmvbuVarPpxfxbqfkf, "inflate(...)");
        return nufgyqmvbuVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(vdvldrhtss vdvldrhtssVar, draadjrbmk draadjrbmkVar, final rgvfuqvkyq rgvfuqvkyqVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        ImageView ivAddToCart = ((yi1.nufgyqmvbu) adapterDelegateViewBinding.ppxfxbqfkf()).f125439eablkybsjg;
        zdlpuopuiu.dxjokdxxww(ivAddToCart, "ivAddToCart");
        ivAddToCart.setOnClickListener(new ppxfxbqfkf(new jpowsppfya(), 400L, adapterDelegateViewBinding, vdvldrhtssVar));
        View itemView = adapterDelegateViewBinding.itemView;
        zdlpuopuiu.dxjokdxxww(itemView, "itemView");
        itemView.setOnClickListener(new wkgbmnqykc(new jpowsppfya(), 400L, adapterDelegateViewBinding, draadjrbmkVar));
        adapterDelegateViewBinding.zoijcleaow(new draadjrbmk() { // from class: yj1.lqeggnwhkg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return dxjokdxxww.ojitshcjhn(adapterDelegateViewBinding, rgvfuqvkyqVar, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private static final void nufgyqmvbu(ef.iobyxmoadg iobyxmoadgVar, rgvfuqvkyq rgvfuqvkyqVar) {
        yi1.nufgyqmvbu nufgyqmvbuVar = (yi1.nufgyqmvbu) iobyxmoadgVar.ppxfxbqfkf();
        ShapeableImageView ivPhoto = nufgyqmvbuVar.f125443lqeggnwhkg;
        zdlpuopuiu.dxjokdxxww(ivPhoto, "ivPhoto");
        p41.eablkybsjg.ppxfxbqfkf(ivPhoto, ((si1.iobyxmoadg.zoijcleaow) iobyxmoadgVar.eablkybsjg()).lqeggnwhkg(), b31.gxszxtbevo.placeholder);
        nufgyqmvbuVar.f125444nufgyqmvbu.setText(((si1.iobyxmoadg.zoijcleaow) iobyxmoadgVar.eablkybsjg()).ppxfxbqfkf());
        nufgyqmvbuVar.f125436btonecajqb.setText(((si1.iobyxmoadg.zoijcleaow) iobyxmoadgVar.eablkybsjg()).btonecajqb());
        nufgyqmvbuVar.f125437draadjrbmk.setText(((si1.iobyxmoadg.zoijcleaow) iobyxmoadgVar.eablkybsjg()).gtknphoqwx());
        ImageView ivAddToCart = nufgyqmvbuVar.f125439eablkybsjg;
        zdlpuopuiu.dxjokdxxww(ivAddToCart, "ivAddToCart");
        ivAddToCart.setVisibility(!((si1.iobyxmoadg.zoijcleaow) iobyxmoadgVar.eablkybsjg()).eablkybsjg() ? 4 : 0);
        gtknphoqwx(iobyxmoadgVar, ((si1.iobyxmoadg.zoijcleaow) iobyxmoadgVar.eablkybsjg()).nufgyqmvbu());
        btonecajqb(iobyxmoadgVar);
        dxjokdxxww(iobyxmoadgVar);
        draadjrbmk(iobyxmoadgVar, rgvfuqvkyqVar, ((si1.iobyxmoadg.zoijcleaow) iobyxmoadgVar.eablkybsjg()).draadjrbmk());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ojitshcjhn(ef.iobyxmoadg iobyxmoadgVar, rgvfuqvkyq rgvfuqvkyqVar, List payloads) {
        zdlpuopuiu.btonecajqb(payloads, "payloads");
        if (payloads.isEmpty()) {
            nufgyqmvbu(iobyxmoadgVar, rgvfuqvkyqVar);
        } else {
            agtfadlqog(iobyxmoadgVar, rgvfuqvkyqVar, payloads);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wflxmlrfwp(rgvfuqvkyq rgvfuqvkyqVar, ef.iobyxmoadg iobyxmoadgVar, int i13) {
        rgvfuqvkyqVar.invoke(iobyxmoadgVar.eablkybsjg(), Integer.valueOf(i13));
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
