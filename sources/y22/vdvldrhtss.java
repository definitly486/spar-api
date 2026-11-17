package y22;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class vdvldrhtss {

    public static final class iobyxmoadg extends jyumaefscl implements tg.vdvldrhtss {
        public iobyxmoadg() {
            super(3);
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return iobyxmoadg(obj, (List) obj2, ((Number) obj3).intValue());
        }

        public final Boolean iobyxmoadg(Object obj, List noName_1, int i13) {
            zdlpuopuiu.btonecajqb(noName_1, "$noName_1");
            return Boolean.valueOf(obj instanceof u22.zoijcleaow);
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f123655zdlpuopuiu = new zoijcleaow();

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
    public static final k22.wflxmlrfwp eablkybsjg(LayoutInflater layoutInflater, ViewGroup root) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(root, "root");
        k22.wflxmlrfwp wflxmlrfwpVarPpxfxbqfkf = k22.wflxmlrfwp.ppxfxbqfkf(layoutInflater, root, false);
        zdlpuopuiu.dxjokdxxww(wflxmlrfwpVarPpxfxbqfkf, "inflate(...)");
        return wflxmlrfwpVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gxszxtbevo(final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: y22.rgvfuqvkyq
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return vdvldrhtss.lqeggnwhkg(adapterDelegateViewBinding, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(ef.iobyxmoadg iobyxmoadgVar, List it) {
        zdlpuopuiu.btonecajqb(it, "it");
        k22.wflxmlrfwp wflxmlrfwpVar = (k22.wflxmlrfwp) iobyxmoadgVar.ppxfxbqfkf();
        wflxmlrfwpVar.getRoot().setTag(u22.iobyxmoadg.f112529iobyxmoadg);
        wflxmlrfwpVar.f53637ppxfxbqfkf.setImageResource(((u22.zoijcleaow) iobyxmoadgVar.eablkybsjg()).ppxfxbqfkf());
        wflxmlrfwpVar.f53638wkgbmnqykc.setText(((u22.zoijcleaow) iobyxmoadgVar.eablkybsjg()).zoijcleaow());
        wflxmlrfwpVar.f53633eablkybsjg.setText(((u22.zoijcleaow) iobyxmoadgVar.eablkybsjg()).eablkybsjg());
        wflxmlrfwpVar.f53634gxszxtbevo.setText(((u22.zoijcleaow) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc());
        wflxmlrfwpVar.f53636lqeggnwhkg.setText(((u22.zoijcleaow) iobyxmoadgVar.eablkybsjg()).iobyxmoadg());
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow wkgbmnqykc() {
        return new ef.zoijcleaow(new tg.rgvfuqvkyq() { // from class: y22.agtfadlqog
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return vdvldrhtss.eablkybsjg((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: y22.ojitshcjhn
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return vdvldrhtss.gxszxtbevo((ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f123655zdlpuopuiu);
    }
}
