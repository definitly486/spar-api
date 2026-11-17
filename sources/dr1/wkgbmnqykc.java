package dr1;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
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
            return Boolean.valueOf(obj instanceof is1.iobyxmoadg);
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f29369zdlpuopuiu = new zoijcleaow();

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
    public static final uq1.jyumaefscl eablkybsjg(LayoutInflater layoutInflater, ViewGroup root) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(root, "root");
        uq1.jyumaefscl jyumaefsclVarPpxfxbqfkf = uq1.jyumaefscl.ppxfxbqfkf(layoutInflater, root, false);
        zdlpuopuiu.dxjokdxxww(jyumaefsclVarPpxfxbqfkf, "inflate(...)");
        return jyumaefsclVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gxszxtbevo(draadjrbmk draadjrbmkVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        final uq1.jyumaefscl jyumaefsclVar = (uq1.jyumaefscl) adapterDelegateViewBinding.ppxfxbqfkf();
        jyumaefsclVar.f114178zoijcleaow.setOnPromoClickListener(draadjrbmkVar);
        adapterDelegateViewBinding.zoijcleaow(new draadjrbmk() { // from class: dr1.ppxfxbqfkf
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return wkgbmnqykc.lqeggnwhkg(jyumaefsclVar, adapterDelegateViewBinding, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(uq1.jyumaefscl jyumaefsclVar, ef.iobyxmoadg iobyxmoadgVar, List it) {
        zdlpuopuiu.btonecajqb(it, "it");
        jyumaefsclVar.f114178zoijcleaow.setData((is1.iobyxmoadg) iobyxmoadgVar.eablkybsjg());
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow wkgbmnqykc(final draadjrbmk onPromoClicked) {
        zdlpuopuiu.btonecajqb(onPromoClicked, "onPromoClicked");
        return new ef.zoijcleaow(new rgvfuqvkyq() { // from class: dr1.iobyxmoadg
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return wkgbmnqykc.eablkybsjg((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new draadjrbmk() { // from class: dr1.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return wkgbmnqykc.gxszxtbevo(onPromoClicked, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f29369zdlpuopuiu);
    }
}
