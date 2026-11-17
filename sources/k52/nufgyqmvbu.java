package k52;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import b52.yggfygwlhe;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes6.dex */
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
            return Boolean.valueOf(obj instanceof p62.wkgbmnqykc);
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f53883zdlpuopuiu = new zoijcleaow();

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
    public static final yggfygwlhe eablkybsjg(LayoutInflater layoutInflater, ViewGroup root) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(root, "root");
        yggfygwlhe yggfygwlheVarPpxfxbqfkf = yggfygwlhe.ppxfxbqfkf(layoutInflater, root, false);
        zdlpuopuiu.dxjokdxxww(yggfygwlheVarPpxfxbqfkf, "inflate(...)");
        return yggfygwlheVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gxszxtbevo(draadjrbmk draadjrbmkVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        final yggfygwlhe yggfygwlheVar = (yggfygwlhe) adapterDelegateViewBinding.ppxfxbqfkf();
        yggfygwlheVar.f15348zoijcleaow.setListener(draadjrbmkVar);
        adapterDelegateViewBinding.zoijcleaow(new draadjrbmk() { // from class: k52.lqeggnwhkg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return nufgyqmvbu.lqeggnwhkg(yggfygwlheVar, adapterDelegateViewBinding, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(yggfygwlhe yggfygwlheVar, ef.iobyxmoadg iobyxmoadgVar, List it) {
        zdlpuopuiu.btonecajqb(it, "it");
        yggfygwlheVar.f15348zoijcleaow.setData((p62.wkgbmnqykc) iobyxmoadgVar.eablkybsjg());
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow wkgbmnqykc(final draadjrbmk onProductClicked) {
        zdlpuopuiu.btonecajqb(onProductClicked, "onProductClicked");
        return new ef.zoijcleaow(new rgvfuqvkyq() { // from class: k52.eablkybsjg
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return nufgyqmvbu.eablkybsjg((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new draadjrbmk() { // from class: k52.gxszxtbevo
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return nufgyqmvbu.gxszxtbevo(onProductClicked, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f53883zdlpuopuiu);
    }
}
