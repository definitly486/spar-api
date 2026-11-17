package mr1;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.material.divider.MaterialDivider;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;
import z41.opjhrmiecq;

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
            return Boolean.valueOf(obj instanceof ls1.iobyxmoadg);
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f67869zdlpuopuiu = new zoijcleaow();

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
    public static final opjhrmiecq eablkybsjg(LayoutInflater layoutInflater, ViewGroup root) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(root, "root");
        opjhrmiecq opjhrmiecqVarPpxfxbqfkf = opjhrmiecq.ppxfxbqfkf(layoutInflater, root, false);
        zdlpuopuiu.dxjokdxxww(opjhrmiecqVarPpxfxbqfkf, "inflate(...)");
        return opjhrmiecqVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gxszxtbevo(final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        adapterDelegateViewBinding.zoijcleaow(new draadjrbmk() { // from class: mr1.nufgyqmvbu
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return dxjokdxxww.lqeggnwhkg(adapterDelegateViewBinding, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(ef.iobyxmoadg iobyxmoadgVar, List it) {
        zdlpuopuiu.btonecajqb(it, "it");
        opjhrmiecq opjhrmiecqVar = (opjhrmiecq) iobyxmoadgVar.ppxfxbqfkf();
        opjhrmiecqVar.f128310ppxfxbqfkf.setText(((ls1.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).iobyxmoadg());
        opjhrmiecqVar.f128310ppxfxbqfkf.setTypeface(null, ((ls1.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).zoijcleaow());
        MaterialDivider divider = opjhrmiecqVar.f128311zoijcleaow;
        zdlpuopuiu.dxjokdxxww(divider, "divider");
        divider.setVisibility(!((ls1.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).ppxfxbqfkf() ? 0 : 8);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow wkgbmnqykc() {
        return new ef.zoijcleaow(new rgvfuqvkyq() { // from class: mr1.gxszxtbevo
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return dxjokdxxww.eablkybsjg((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new draadjrbmk() { // from class: mr1.lqeggnwhkg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return dxjokdxxww.gxszxtbevo((ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f67869zdlpuopuiu);
    }
}
