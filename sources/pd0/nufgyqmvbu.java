package pd0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.flexbox.FlexboxLayoutManager;
import gg.wwaezpbzkn;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.tbqsvytpvh;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes4.dex */
public abstract class nufgyqmvbu {

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
            return Boolean.valueOf(obj instanceof rb0.zoijcleaow);
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f76428zdlpuopuiu = new zoijcleaow();

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
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                if (it.next() instanceof pd0.iobyxmoadg.C1690iobyxmoadg) {
                    dxjokdxxww(iobyxmoadgVar, (rb0.zoijcleaow) iobyxmoadgVar.eablkybsjg());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn draadjrbmk(ef.iobyxmoadg iobyxmoadgVar, List payloads) {
        zdlpuopuiu.btonecajqb(payloads, "payloads");
        if (payloads.isEmpty()) {
            nufgyqmvbu(iobyxmoadgVar, (rb0.zoijcleaow) iobyxmoadgVar.eablkybsjg());
        } else {
            btonecajqb(iobyxmoadgVar, payloads);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private static final void dxjokdxxww(ef.iobyxmoadg iobyxmoadgVar, rb0.zoijcleaow zoijcleaowVar) {
        tbqsvytpvh tbqsvytpvhVar = (tbqsvytpvh) iobyxmoadgVar.ppxfxbqfkf();
        if (zoijcleaowVar.btonecajqb()) {
            tbqsvytpvhVar.f65993zoijcleaow.setCardBackgroundColor(c60.zoijcleaow.ppxfxbqfkf(iobyxmoadgVar.wkgbmnqykc(), zoijcleaowVar.nufgyqmvbu().lqeggnwhkg()));
            tbqsvytpvhVar.f65991ppxfxbqfkf.setColorFilter(c60.zoijcleaow.ppxfxbqfkf(iobyxmoadgVar.wkgbmnqykc(), da.zoijcleaow.colorOnPrimary));
            tbqsvytpvhVar.f65992wkgbmnqykc.setTextColor(c60.zoijcleaow.ppxfxbqfkf(iobyxmoadgVar.wkgbmnqykc(), da.zoijcleaow.colorOnPrimary));
        } else {
            tbqsvytpvhVar.f65993zoijcleaow.setCardBackgroundColor(c60.zoijcleaow.ppxfxbqfkf(iobyxmoadgVar.wkgbmnqykc(), da.zoijcleaow.colorSurface));
            tbqsvytpvhVar.f65991ppxfxbqfkf.setColorFilter(c60.zoijcleaow.ppxfxbqfkf(iobyxmoadgVar.wkgbmnqykc(), zoijcleaowVar.nufgyqmvbu().wkgbmnqykc()));
            tbqsvytpvhVar.f65992wkgbmnqykc.setTextColor(c60.zoijcleaow.ppxfxbqfkf(iobyxmoadgVar.wkgbmnqykc(), da.zoijcleaow.colorOnSurface));
        }
    }

    public static final df.zoijcleaow eablkybsjg(final draadjrbmk listener) {
        zdlpuopuiu.btonecajqb(listener, "listener");
        return new ef.zoijcleaow(new rgvfuqvkyq() { // from class: pd0.wkgbmnqykc
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return nufgyqmvbu.gxszxtbevo((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new draadjrbmk() { // from class: pd0.eablkybsjg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return nufgyqmvbu.lqeggnwhkg(listener, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f76428zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gtknphoqwx(ef.iobyxmoadg iobyxmoadgVar, draadjrbmk draadjrbmkVar, View view) {
        if (iobyxmoadgVar.getBindingAdapterPosition() != -1) {
            draadjrbmkVar.invoke(Integer.valueOf(iobyxmoadgVar.getBindingAdapterPosition()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tbqsvytpvh gxszxtbevo(LayoutInflater layoutInflater, ViewGroup root) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(root, "root");
        tbqsvytpvh tbqsvytpvhVarPpxfxbqfkf = tbqsvytpvh.ppxfxbqfkf(layoutInflater, root, false);
        zdlpuopuiu.dxjokdxxww(tbqsvytpvhVarPpxfxbqfkf, "inflate(...)");
        return tbqsvytpvhVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(final draadjrbmk draadjrbmkVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        ((tbqsvytpvh) adapterDelegateViewBinding.ppxfxbqfkf()).f65993zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: pd0.gxszxtbevo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nufgyqmvbu.gtknphoqwx(adapterDelegateViewBinding, draadjrbmkVar, view);
            }
        });
        adapterDelegateViewBinding.zoijcleaow(new draadjrbmk() { // from class: pd0.lqeggnwhkg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return nufgyqmvbu.draadjrbmk(adapterDelegateViewBinding, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private static final void nufgyqmvbu(ef.iobyxmoadg iobyxmoadgVar, rb0.zoijcleaow zoijcleaowVar) {
        tbqsvytpvh tbqsvytpvhVar = (tbqsvytpvh) iobyxmoadgVar.ppxfxbqfkf();
        ViewGroup.LayoutParams layoutParams = ((tbqsvytpvh) iobyxmoadgVar.ppxfxbqfkf()).f65993zoijcleaow.getLayoutParams();
        if (layoutParams instanceof FlexboxLayoutManager.LayoutParams) {
            int i13 = iobyxmoadgVar.wkgbmnqykc().getResources().getDisplayMetrics().widthPixels;
            FlexboxLayoutManager.LayoutParams layoutParams2 = (FlexboxLayoutManager.LayoutParams) layoutParams;
            layoutParams2.lqeggnwhkg(zoijcleaowVar.eablkybsjg());
            if (zoijcleaowVar.eablkybsjg() != 1.0f) {
                layoutParams2.v(i13 / 2);
            }
        }
        AppCompatImageView ivIcon = tbqsvytpvhVar.f65991ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(ivIcon, "ivIcon");
        ivIcon.setVisibility(0);
        AppCompatImageView ivIcon2 = tbqsvytpvhVar.f65991ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(ivIcon2, "ivIcon");
        c60.wkgbmnqykc.lqeggnwhkg(ivIcon2, zoijcleaowVar.lqeggnwhkg());
        tbqsvytpvhVar.f65992wkgbmnqykc.setText(zoijcleaowVar.getItemId());
        dxjokdxxww(iobyxmoadgVar, zoijcleaowVar);
    }
}
