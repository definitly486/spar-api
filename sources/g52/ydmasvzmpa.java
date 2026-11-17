package g52;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ydmasvzmpa {

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
            return Boolean.valueOf(obj instanceof t62.wkgbmnqykc);
        }
    }

    public static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f36355zdlpuopuiu = new zoijcleaow();

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
    public static final gg.wwaezpbzkn dxjokdxxww(m60.rlfsiqarku rlfsiqarkuVar, ef.iobyxmoadg iobyxmoadgVar, List it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        rlfsiqarkuVar.f65941zoijcleaow.setData(((t62.wkgbmnqykc) iobyxmoadgVar.eablkybsjg()).eablkybsjg());
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow eablkybsjg(final tg.draadjrbmk onBannerClicked) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onBannerClicked, "onBannerClicked");
        return new ef.zoijcleaow(new tg.rgvfuqvkyq() { // from class: g52.rlfsiqarku
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return ydmasvzmpa.gxszxtbevo((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: g52.czzsidtyhn
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ydmasvzmpa.lqeggnwhkg(onBannerClicked, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f36355zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m60.rlfsiqarku gxszxtbevo(LayoutInflater layoutInflater, ViewGroup root) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(root, "root");
        m60.rlfsiqarku rlfsiqarkuVarPpxfxbqfkf = m60.rlfsiqarku.ppxfxbqfkf(layoutInflater, root, false);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(rlfsiqarkuVarPpxfxbqfkf, "inflate(...)");
        return rlfsiqarkuVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn lqeggnwhkg(final tg.draadjrbmk draadjrbmkVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        final m60.rlfsiqarku rlfsiqarkuVar = (m60.rlfsiqarku) adapterDelegateViewBinding.ppxfxbqfkf();
        rlfsiqarkuVar.f65941zoijcleaow.setListener(new tg.draadjrbmk() { // from class: g52.uwvvkdfqfp
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ydmasvzmpa.nufgyqmvbu(draadjrbmkVar, adapterDelegateViewBinding, ((Integer) obj).intValue());
            }
        });
        rlfsiqarkuVar.f65941zoijcleaow.setHeaderVisible(false);
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: g52.yfnezrywwk
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ydmasvzmpa.dxjokdxxww(rlfsiqarkuVar, adapterDelegateViewBinding, (List) obj);
            }
        });
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn nufgyqmvbu(tg.draadjrbmk draadjrbmkVar, ef.iobyxmoadg iobyxmoadgVar, int i13) {
        draadjrbmkVar.invoke(((t62.wkgbmnqykc) iobyxmoadgVar.eablkybsjg()).lqeggnwhkg().get(i13));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
