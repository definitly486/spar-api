package jd0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import gg.wwaezpbzkn;
import java.util.List;
import m60.zeieaojujs;

/* JADX INFO: loaded from: classes4.dex */
public abstract class iwizpuwonk {

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
            return Boolean.valueOf(obj instanceof ld0.wkgbmnqykc);
        }
    }

    public static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f51131zdlpuopuiu = new zoijcleaow();

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
    public static final wwaezpbzkn eablkybsjg(ef.iobyxmoadg adapterDelegateViewBinding) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow ppxfxbqfkf() {
        return new ef.zoijcleaow(new tg.rgvfuqvkyq() { // from class: jd0.yggfygwlhe
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return iwizpuwonk.wkgbmnqykc((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: jd0.jyumaefscl
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return iwizpuwonk.eablkybsjg((ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f51131zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zeieaojujs wkgbmnqykc(LayoutInflater layoutInflater, ViewGroup root) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(root, "root");
        zeieaojujs zeieaojujsVarPpxfxbqfkf = zeieaojujs.ppxfxbqfkf(layoutInflater, root, false);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(zeieaojujsVarPpxfxbqfkf, "inflate(...)");
        return zeieaojujsVarPpxfxbqfkf;
    }
}
