package g52;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class nufgyqmvbu {

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
            return Boolean.valueOf(obj instanceof e62.iobyxmoadg);
        }
    }

    public static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f36300zdlpuopuiu = new zoijcleaow();

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
    public static final b52.gxszxtbevo eablkybsjg(LayoutInflater layoutInflater, ViewGroup root) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(root, "root");
        b52.gxszxtbevo gxszxtbevoVarPpxfxbqfkf = b52.gxszxtbevo.ppxfxbqfkf(layoutInflater, root, false);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(gxszxtbevoVarPpxfxbqfkf, "inflate(...)");
        return gxszxtbevoVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn gxszxtbevo(tg.draadjrbmk draadjrbmkVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        final b52.gxszxtbevo gxszxtbevoVar = (b52.gxszxtbevo) adapterDelegateViewBinding.ppxfxbqfkf();
        gxszxtbevoVar.f15305zoijcleaow.setListener(draadjrbmkVar);
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: g52.lqeggnwhkg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return nufgyqmvbu.lqeggnwhkg(gxszxtbevoVar, adapterDelegateViewBinding, (List) obj);
            }
        });
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn lqeggnwhkg(b52.gxszxtbevo gxszxtbevoVar, ef.iobyxmoadg iobyxmoadgVar, List it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        gxszxtbevoVar.f15305zoijcleaow.setData(((e62.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).iobyxmoadg());
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow wkgbmnqykc(final tg.draadjrbmk listener) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(listener, "listener");
        return new ef.zoijcleaow(new tg.rgvfuqvkyq() { // from class: g52.eablkybsjg
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return nufgyqmvbu.eablkybsjg((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: g52.gxszxtbevo
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return nufgyqmvbu.gxszxtbevo(listener, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f36300zdlpuopuiu);
    }
}
