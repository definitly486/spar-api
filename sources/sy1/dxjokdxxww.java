package sy1;

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
import ru.myspar.core.models.measure_type.MeasureType;
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
            return Boolean.valueOf(obj instanceof mx1.iobyxmoadg.zoijcleaow);
        }
    }

    public static final class ppxfxbqfkf implements View.OnClickListener {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ vdvldrhtss f108745iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ef.iobyxmoadg f108746jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f108747yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f108748zdlpuopuiu;

        public ppxfxbqfkf(jpowsppfya jpowsppfyaVar, long j13, ef.iobyxmoadg iobyxmoadgVar, vdvldrhtss vdvldrhtssVar) {
            this.f108748zdlpuopuiu = jpowsppfyaVar;
            this.f108747yggfygwlhe = j13;
            this.f108746jyumaefscl = iobyxmoadgVar;
            this.f108745iwizpuwonk = vdvldrhtssVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f108748zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f108747yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            if (this.f108746jyumaefscl.getBindingAdapterPosition() != -1) {
                this.f108745iwizpuwonk.invoke(this.f108746jyumaefscl.eablkybsjg(), Double.valueOf(((mx1.iobyxmoadg.zoijcleaow) this.f108746jyumaefscl.eablkybsjg()).zoijcleaow() ? 0.0d : ((mx1.iobyxmoadg.zoijcleaow) this.f108746jyumaefscl.eablkybsjg()).gtknphoqwx()), ((mx1.iobyxmoadg.zoijcleaow) this.f108746jyumaefscl.eablkybsjg()).nufgyqmvbu().getCurrentMeasure());
            }
        }
    }

    public static final class wkgbmnqykc implements View.OnClickListener {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ draadjrbmk f108749iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ef.iobyxmoadg f108750jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f108751yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f108752zdlpuopuiu;

        public wkgbmnqykc(jpowsppfya jpowsppfyaVar, long j13, ef.iobyxmoadg iobyxmoadgVar, draadjrbmk draadjrbmkVar) {
            this.f108752zdlpuopuiu = jpowsppfyaVar;
            this.f108751yggfygwlhe = j13;
            this.f108750jyumaefscl = iobyxmoadgVar;
            this.f108749iwizpuwonk = draadjrbmkVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            draadjrbmk draadjrbmkVar;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f108752zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f108751yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            if (this.f108750jyumaefscl.getBindingAdapterPosition() == -1 || (draadjrbmkVar = this.f108749iwizpuwonk) == null) {
                return;
            }
            draadjrbmkVar.invoke(this.f108750jyumaefscl.eablkybsjg());
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f108753zdlpuopuiu = new zoijcleaow();

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
        ((sx1.nufgyqmvbu) iobyxmoadgVar.ppxfxbqfkf()).f108670gxszxtbevo.setImageResource(((mx1.iobyxmoadg.zoijcleaow) iobyxmoadgVar.eablkybsjg()).eablkybsjg() ? s40.gxszxtbevo.ic_heart : s40.gxszxtbevo.ic_heart_off);
    }

    private static final void draadjrbmk(final ef.iobyxmoadg iobyxmoadgVar, final rgvfuqvkyq rgvfuqvkyqVar, int i13) {
        ComposeView cvRatingBar = ((sx1.nufgyqmvbu) iobyxmoadgVar.ppxfxbqfkf()).f108675wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(cvRatingBar, "cvRatingBar");
        wu.wkgbmnqykc.iobyxmoadg(cvRatingBar, i13, new draadjrbmk() { // from class: sy1.nufgyqmvbu
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return dxjokdxxww.wflxmlrfwp(rgvfuqvkyqVar, iobyxmoadgVar, ((Integer) obj).intValue());
            }
        });
    }

    private static final void dxjokdxxww(ef.iobyxmoadg iobyxmoadgVar) {
        ((sx1.nufgyqmvbu) iobyxmoadgVar.ppxfxbqfkf()).f108668eablkybsjg.setImageResource(((mx1.iobyxmoadg.zoijcleaow) iobyxmoadgVar.eablkybsjg()).zoijcleaow() ? s40.gxszxtbevo.ic_check_done_my_purchases : s40.gxszxtbevo.ic_basket_14);
    }

    public static final df.zoijcleaow eablkybsjg(final vdvldrhtss onAddToCartClicked, final rgvfuqvkyq onSetRatingClicked, final draadjrbmk draadjrbmkVar) {
        zdlpuopuiu.btonecajqb(onAddToCartClicked, "onAddToCartClicked");
        zdlpuopuiu.btonecajqb(onSetRatingClicked, "onSetRatingClicked");
        return new ef.zoijcleaow(new rgvfuqvkyq() { // from class: sy1.eablkybsjg
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return dxjokdxxww.gxszxtbevo((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new draadjrbmk() { // from class: sy1.gxszxtbevo
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return dxjokdxxww.lqeggnwhkg(onAddToCartClicked, draadjrbmkVar, onSetRatingClicked, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f108753zdlpuopuiu);
    }

    private static final void gtknphoqwx(ef.iobyxmoadg iobyxmoadgVar, ts.iobyxmoadg iobyxmoadgVar2) {
        int i13;
        int i14;
        MeasureType currentMeasure = ((mx1.iobyxmoadg.zoijcleaow) iobyxmoadgVar.eablkybsjg()).nufgyqmvbu().getCurrentMeasure();
        if (currentMeasure instanceof MeasureType.WEIGHT) {
            i13 = nx1.nufgyqmvbu.weight_format;
        } else {
            if (!(currentMeasure instanceof MeasureType.AMOUNT)) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = nx1.nufgyqmvbu.measure_amount_format;
        }
        String strGxszxtbevo = iobyxmoadgVar.gxszxtbevo(i13, iobyxmoadgVar2.iobyxmoadg());
        MeasureType currentMeasure2 = ((mx1.iobyxmoadg.zoijcleaow) iobyxmoadgVar.eablkybsjg()).nufgyqmvbu().getCurrentMeasure();
        if (currentMeasure2 instanceof MeasureType.WEIGHT) {
            i14 = nx1.nufgyqmvbu.price_per_wight_format;
        } else {
            if (!(currentMeasure2 instanceof MeasureType.AMOUNT)) {
                throw new NoWhenBranchMatchedException();
            }
            i14 = nx1.nufgyqmvbu.price_per_amount_format;
        }
        ((sx1.nufgyqmvbu) iobyxmoadgVar.ppxfxbqfkf()).f108667dxjokdxxww.setText(iobyxmoadgVar.gxszxtbevo(nx1.nufgyqmvbu.purchase_price_format, strGxszxtbevo, iobyxmoadgVar.gxszxtbevo(i14, iobyxmoadgVar2.zoijcleaow(), iobyxmoadgVar2.ppxfxbqfkf())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sx1.nufgyqmvbu gxszxtbevo(LayoutInflater layoutInflater, ViewGroup root) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(root, "root");
        sx1.nufgyqmvbu nufgyqmvbuVarPpxfxbqfkf = sx1.nufgyqmvbu.ppxfxbqfkf(layoutInflater, root, false);
        zdlpuopuiu.dxjokdxxww(nufgyqmvbuVarPpxfxbqfkf, "inflate(...)");
        return nufgyqmvbuVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(vdvldrhtss vdvldrhtssVar, draadjrbmk draadjrbmkVar, final rgvfuqvkyq rgvfuqvkyqVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        ImageView ivAddToCart = ((sx1.nufgyqmvbu) adapterDelegateViewBinding.ppxfxbqfkf()).f108668eablkybsjg;
        zdlpuopuiu.dxjokdxxww(ivAddToCart, "ivAddToCart");
        ivAddToCart.setOnClickListener(new ppxfxbqfkf(new jpowsppfya(), 400L, adapterDelegateViewBinding, vdvldrhtssVar));
        View itemView = adapterDelegateViewBinding.itemView;
        zdlpuopuiu.dxjokdxxww(itemView, "itemView");
        itemView.setOnClickListener(new wkgbmnqykc(new jpowsppfya(), 400L, adapterDelegateViewBinding, draadjrbmkVar));
        adapterDelegateViewBinding.zoijcleaow(new draadjrbmk() { // from class: sy1.lqeggnwhkg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return dxjokdxxww.ojitshcjhn(adapterDelegateViewBinding, rgvfuqvkyqVar, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private static final void nufgyqmvbu(ef.iobyxmoadg iobyxmoadgVar, rgvfuqvkyq rgvfuqvkyqVar) {
        sx1.nufgyqmvbu nufgyqmvbuVar = (sx1.nufgyqmvbu) iobyxmoadgVar.ppxfxbqfkf();
        ShapeableImageView ivPhoto = nufgyqmvbuVar.f108672lqeggnwhkg;
        zdlpuopuiu.dxjokdxxww(ivPhoto, "ivPhoto");
        c60.wkgbmnqykc.ppxfxbqfkf(ivPhoto, ((mx1.iobyxmoadg.zoijcleaow) iobyxmoadgVar.eablkybsjg()).dxjokdxxww(), s40.gxszxtbevo.placeholder);
        nufgyqmvbuVar.f108673nufgyqmvbu.setText(((mx1.iobyxmoadg.zoijcleaow) iobyxmoadgVar.eablkybsjg()).ppxfxbqfkf());
        nufgyqmvbuVar.f108665btonecajqb.setText(((mx1.iobyxmoadg.zoijcleaow) iobyxmoadgVar.eablkybsjg()).draadjrbmk());
        nufgyqmvbuVar.f108666draadjrbmk.setText(((mx1.iobyxmoadg.zoijcleaow) iobyxmoadgVar.eablkybsjg()).wflxmlrfwp());
        ImageView ivAddToCart = nufgyqmvbuVar.f108668eablkybsjg;
        zdlpuopuiu.dxjokdxxww(ivAddToCart, "ivAddToCart");
        ivAddToCart.setVisibility(!((mx1.iobyxmoadg.zoijcleaow) iobyxmoadgVar.eablkybsjg()).lqeggnwhkg() ? 4 : 0);
        gtknphoqwx(iobyxmoadgVar, ((mx1.iobyxmoadg.zoijcleaow) iobyxmoadgVar.eablkybsjg()).btonecajqb());
        btonecajqb(iobyxmoadgVar);
        dxjokdxxww(iobyxmoadgVar);
        draadjrbmk(iobyxmoadgVar, rgvfuqvkyqVar, ((mx1.iobyxmoadg.zoijcleaow) iobyxmoadgVar.eablkybsjg()).agtfadlqog());
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
