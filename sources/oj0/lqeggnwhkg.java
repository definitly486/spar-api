package oj0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lqeggnwhkg {

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
            return Boolean.valueOf(obj instanceof pj0.iobyxmoadg);
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f72987zdlpuopuiu = new zoijcleaow();

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
    public static final wwaezpbzkn dxjokdxxww(ef.iobyxmoadg iobyxmoadgVar, List it) {
        zdlpuopuiu.btonecajqb(it, "it");
        lj0.zoijcleaow zoijcleaowVar = (lj0.zoijcleaow) iobyxmoadgVar.ppxfxbqfkf();
        com.bumptech.glide.zoijcleaow.zdlpuopuiu(iobyxmoadgVar.wkgbmnqykc()).eablkybsjg().ageimvtcrz(((pj0.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).iobyxmoadg()).wizcaqwiak(zoijcleaowVar.f62699zoijcleaow);
        zoijcleaowVar.f62698wkgbmnqykc.setText(((pj0.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).zoijcleaow());
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow eablkybsjg(final draadjrbmk listener) {
        zdlpuopuiu.btonecajqb(listener, "listener");
        return new ef.zoijcleaow(new rgvfuqvkyq() { // from class: oj0.ppxfxbqfkf
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return lqeggnwhkg.gxszxtbevo((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new draadjrbmk() { // from class: oj0.wkgbmnqykc
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return lqeggnwhkg.lqeggnwhkg(listener, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f72987zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lj0.zoijcleaow gxszxtbevo(LayoutInflater layoutInflater, ViewGroup root) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(root, "root");
        lj0.zoijcleaow zoijcleaowVarPpxfxbqfkf = lj0.zoijcleaow.ppxfxbqfkf(layoutInflater, root, false);
        zdlpuopuiu.dxjokdxxww(zoijcleaowVarPpxfxbqfkf, "inflate(...)");
        return zoijcleaowVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(final draadjrbmk draadjrbmkVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        adapterDelegateViewBinding.itemView.setOnClickListener(new View.OnClickListener() { // from class: oj0.eablkybsjg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lqeggnwhkg.nufgyqmvbu(adapterDelegateViewBinding, draadjrbmkVar, view);
            }
        });
        adapterDelegateViewBinding.zoijcleaow(new draadjrbmk() { // from class: oj0.gxszxtbevo
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return lqeggnwhkg.dxjokdxxww(adapterDelegateViewBinding, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nufgyqmvbu(ef.iobyxmoadg iobyxmoadgVar, draadjrbmk draadjrbmkVar, View view) {
        if (iobyxmoadgVar.getBindingAdapterPosition() != -1) {
            draadjrbmkVar.invoke(Integer.valueOf(iobyxmoadgVar.getBindingAdapterPosition()));
        }
    }
}
