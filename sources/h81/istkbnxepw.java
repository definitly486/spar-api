package h81;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class istkbnxepw {

    public static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.vdvldrhtss {
        public iobyxmoadg() {
            super(3);
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return iobyxmoadg(obj, (List) obj2, ((Number) obj3).intValue());
        }

        public final Boolean iobyxmoadg(Object obj, List noName_1, int i13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(noName_1, "$noName_1");
            return Boolean.valueOf(obj instanceof yggfygwlhe.eablkybsjg);
        }
    }

    public static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f39863zdlpuopuiu = new zoijcleaow();

        public zoijcleaow() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final LayoutInflater invoke(ViewGroup parent) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parent, "parent");
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(layoutInflaterFrom, "from(parent.context)");
            return layoutInflaterFrom;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c81.gxszxtbevo eablkybsjg(LayoutInflater layoutInflater, ViewGroup root) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(root, "root");
        c81.gxszxtbevo gxszxtbevoVarPpxfxbqfkf = c81.gxszxtbevo.ppxfxbqfkf(layoutInflater, root, false);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(gxszxtbevoVarPpxfxbqfkf, "inflate(...)");
        return gxszxtbevoVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn gxszxtbevo(final ef.iobyxmoadg adapterDelegateViewBinding) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: h81.zynmafqrjb
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return istkbnxepw.lqeggnwhkg(adapterDelegateViewBinding, (List) obj);
            }
        });
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn lqeggnwhkg(ef.iobyxmoadg iobyxmoadgVar, List it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        ImageView puzzleImage = ((c81.gxszxtbevo) iobyxmoadgVar.ppxfxbqfkf()).f19233zoijcleaow;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(puzzleImage, "puzzleImage");
        p41.eablkybsjg.zoijcleaow(puzzleImage, ((yggfygwlhe.eablkybsjg) iobyxmoadgVar.eablkybsjg()).iobyxmoadg());
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow wkgbmnqykc() {
        return new ef.zoijcleaow(new tg.rgvfuqvkyq() { // from class: h81.lereixgezr
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return istkbnxepw.eablkybsjg((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: h81.pmvmpeiblj
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return istkbnxepw.gxszxtbevo((ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f39863zdlpuopuiu);
    }
}
