package p52;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import b52.oxmwwwfdhm;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes6.dex */
public abstract class eablkybsjg {

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
            return Boolean.valueOf(obj instanceof k62.iobyxmoadg);
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f75688zdlpuopuiu = new zoijcleaow();

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
    public static final wwaezpbzkn dxjokdxxww(oxmwwwfdhm oxmwwwfdhmVar, ef.iobyxmoadg iobyxmoadgVar, List it) {
        zdlpuopuiu.btonecajqb(it, "it");
        oxmwwwfdhmVar.f15332zoijcleaow.setData((k62.iobyxmoadg) iobyxmoadgVar.eablkybsjg());
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow eablkybsjg(final tg.draadjrbmk showOnMapClickListener, final tg.draadjrbmk pinClickListener) {
        zdlpuopuiu.btonecajqb(showOnMapClickListener, "showOnMapClickListener");
        zdlpuopuiu.btonecajqb(pinClickListener, "pinClickListener");
        return new ef.zoijcleaow(new rgvfuqvkyq() { // from class: p52.iobyxmoadg
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return eablkybsjg.gxszxtbevo((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: p52.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return eablkybsjg.lqeggnwhkg(pinClickListener, showOnMapClickListener, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f75688zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oxmwwwfdhm gxszxtbevo(LayoutInflater layoutInflater, ViewGroup root) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(root, "root");
        oxmwwwfdhm oxmwwwfdhmVarPpxfxbqfkf = oxmwwwfdhm.ppxfxbqfkf(layoutInflater, root, false);
        zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarPpxfxbqfkf, "inflate(...)");
        return oxmwwwfdhmVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(tg.draadjrbmk draadjrbmkVar, final tg.draadjrbmk draadjrbmkVar2, final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        final oxmwwwfdhm oxmwwwfdhmVar = (oxmwwwfdhm) adapterDelegateViewBinding.ppxfxbqfkf();
        oxmwwwfdhmVar.f15332zoijcleaow.yggfygwlhe(new tg.iobyxmoadg() { // from class: p52.ppxfxbqfkf
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return eablkybsjg.nufgyqmvbu(draadjrbmkVar2, adapterDelegateViewBinding);
            }
        }, draadjrbmkVar);
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: p52.wkgbmnqykc
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return eablkybsjg.dxjokdxxww(oxmwwwfdhmVar, adapterDelegateViewBinding, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn nufgyqmvbu(tg.draadjrbmk draadjrbmkVar, ef.iobyxmoadg iobyxmoadgVar) {
        draadjrbmkVar.invoke(((k62.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).getItemId());
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
