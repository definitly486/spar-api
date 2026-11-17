package p52;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ojitshcjhn {

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
            return Boolean.valueOf(obj instanceof k62.ppxfxbqfkf);
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f75689zdlpuopuiu = new zoijcleaow();

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
    public static final b52.iobyxmoadg eablkybsjg(LayoutInflater layoutInflater, ViewGroup root) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(root, "root");
        b52.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = b52.iobyxmoadg.ppxfxbqfkf(layoutInflater, root, false);
        zdlpuopuiu.dxjokdxxww(iobyxmoadgVarPpxfxbqfkf, "inflate(...)");
        return iobyxmoadgVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gxszxtbevo(final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: p52.agtfadlqog
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ojitshcjhn.lqeggnwhkg(adapterDelegateViewBinding, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(ef.iobyxmoadg iobyxmoadgVar, List it) {
        zdlpuopuiu.btonecajqb(it, "it");
        b52.iobyxmoadg iobyxmoadgVar2 = (b52.iobyxmoadg) iobyxmoadgVar.ppxfxbqfkf();
        iobyxmoadgVar2.f15310zoijcleaow.setText(((k62.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).iobyxmoadg());
        iobyxmoadgVar2.f15309wkgbmnqykc.setText(((k62.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).nufgyqmvbu());
        iobyxmoadgVar2.f15308ppxfxbqfkf.setText(((k62.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).lqeggnwhkg());
        iobyxmoadgVar2.f15306eablkybsjg.setData(((k62.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).eablkybsjg());
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow wkgbmnqykc() {
        return new ef.zoijcleaow(new rgvfuqvkyq() { // from class: p52.draadjrbmk
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return ojitshcjhn.eablkybsjg((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: p52.wflxmlrfwp
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ojitshcjhn.gxszxtbevo((ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f75689zdlpuopuiu);
    }
}
