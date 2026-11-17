package ub1;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg extends df.wkgbmnqykc {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final zoijcleaow f113220ppxfxbqfkf = new zoijcleaow(null);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo f113221wkgbmnqykc = new iobyxmoadg();

    public static final class eablkybsjg extends jyumaefscl implements vdvldrhtss {
        public eablkybsjg() {
            super(3);
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return iobyxmoadg(obj, (List) obj2, ((Number) obj3).intValue());
        }

        public final Boolean iobyxmoadg(Object obj, List noName_1, int i13) {
            zdlpuopuiu.btonecajqb(noName_1, "$noName_1");
            return Boolean.valueOf(obj != null ? obj instanceof jt0.zoijcleaow : true);
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final gxszxtbevo f113222zdlpuopuiu = new gxszxtbevo();

        public gxszxtbevo() {
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

    public static final class iobyxmoadg extends androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo {
        iobyxmoadg() {
        }

        @Override // androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
        public boolean zoijcleaow(jt0.zoijcleaow oldItem, jt0.zoijcleaow newItem) {
            zdlpuopuiu.btonecajqb(oldItem, "oldItem");
            zdlpuopuiu.btonecajqb(newItem, "newItem");
            if ((oldItem instanceof wb1.iobyxmoadg) && (newItem instanceof wb1.iobyxmoadg)) {
                return zdlpuopuiu.eablkybsjg(((wb1.iobyxmoadg) oldItem).getItemId(), ((wb1.iobyxmoadg) newItem).getItemId());
            }
            return oldItem == newItem;
        }

        @Override // androidx.recyclerview.widget.nufgyqmvbu.gxszxtbevo
        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public boolean iobyxmoadg(jt0.zoijcleaow oldItem, jt0.zoijcleaow newItem) {
            zdlpuopuiu.btonecajqb(oldItem, "oldItem");
            zdlpuopuiu.btonecajqb(newItem, "newItem");
            return zdlpuopuiu.eablkybsjg(oldItem, newItem);
        }
    }

    public static final class ppxfxbqfkf implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final ppxfxbqfkf f113223zdlpuopuiu = new ppxfxbqfkf();

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final o41.iobyxmoadg invoke(LayoutInflater layoutInflater, ViewGroup root) {
            zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
            zdlpuopuiu.btonecajqb(root, "root");
            o41.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = o41.iobyxmoadg.ppxfxbqfkf(layoutInflater, root, false);
            zdlpuopuiu.dxjokdxxww(iobyxmoadgVarPpxfxbqfkf, "inflate(...)");
            return iobyxmoadgVarPpxfxbqfkf;
        }
    }

    public static final class wkgbmnqykc implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final wkgbmnqykc f113224zdlpuopuiu = new wkgbmnqykc();

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((ef.iobyxmoadg) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(ef.iobyxmoadg adapterDelegateViewBinding) {
            zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
            ((o41.iobyxmoadg) adapterDelegateViewBinding.ppxfxbqfkf()).f72032zoijcleaow.setContent(c31.iobyxmoadg.f18680iobyxmoadg.iobyxmoadg());
        }
    }

    public static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private zoijcleaow() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lqeggnwhkg(tg.draadjrbmk onProductClicked, rgvfuqvkyq onBuyProductClicked) {
        super(f113221wkgbmnqykc);
        zdlpuopuiu.btonecajqb(onProductClicked, "onProductClicked");
        zdlpuopuiu.btonecajqb(onBuyProductClicked, "onBuyProductClicked");
        this.f27903iobyxmoadg.ppxfxbqfkf(ub1.gxszxtbevo.gxszxtbevo(onProductClicked, onBuyProductClicked)).ppxfxbqfkf(new ef.zoijcleaow(ppxfxbqfkf.f113223zdlpuopuiu, new eablkybsjg(), wkgbmnqykc.f113224zdlpuopuiu, gxszxtbevo.f113222zdlpuopuiu));
    }
}
