package jr1;

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
public abstract class btonecajqb {

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
            return Boolean.valueOf(obj instanceof gs1.zoijcleaow);
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f52230zdlpuopuiu = new zoijcleaow();

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
    public static final uq1.zdlpuopuiu eablkybsjg(LayoutInflater layoutInflater, ViewGroup root) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(root, "root");
        uq1.zdlpuopuiu zdlpuopuiuVarPpxfxbqfkf = uq1.zdlpuopuiu.ppxfxbqfkf(layoutInflater, root, false);
        zdlpuopuiu.dxjokdxxww(zdlpuopuiuVarPpxfxbqfkf, "inflate(...)");
        return zdlpuopuiuVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gxszxtbevo(final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        final uq1.zdlpuopuiu zdlpuopuiuVar = (uq1.zdlpuopuiu) adapterDelegateViewBinding.ppxfxbqfkf();
        adapterDelegateViewBinding.zoijcleaow(new draadjrbmk() { // from class: jr1.dxjokdxxww
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return btonecajqb.lqeggnwhkg(zdlpuopuiuVar, adapterDelegateViewBinding, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(uq1.zdlpuopuiu zdlpuopuiuVar, ef.iobyxmoadg iobyxmoadgVar, List it) {
        zdlpuopuiu.btonecajqb(it, "it");
        zdlpuopuiuVar.f114211zoijcleaow.setData(((gs1.zoijcleaow) iobyxmoadgVar.eablkybsjg()).iobyxmoadg());
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow wkgbmnqykc() {
        return new ef.zoijcleaow(new rgvfuqvkyq() { // from class: jr1.lqeggnwhkg
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return btonecajqb.eablkybsjg((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new draadjrbmk() { // from class: jr1.nufgyqmvbu
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return btonecajqb.gxszxtbevo((ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f52230zdlpuopuiu);
    }
}
