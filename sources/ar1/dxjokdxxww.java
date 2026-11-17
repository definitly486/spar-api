package ar1;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import z41.crxdokpmqz;

/* JADX INFO: loaded from: classes6.dex */
public abstract class dxjokdxxww {

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
            return Boolean.valueOf(obj instanceof sr1.wkgbmnqykc);
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f14393zdlpuopuiu = new zoijcleaow();

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
    public static final wwaezpbzkn dxjokdxxww(crxdokpmqz crxdokpmqzVar, ef.iobyxmoadg iobyxmoadgVar, List it) {
        zdlpuopuiu.btonecajqb(it, "it");
        crxdokpmqzVar.f127899zoijcleaow.setData(((sr1.wkgbmnqykc) iobyxmoadgVar.eablkybsjg()).eablkybsjg());
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow eablkybsjg(final tg.rgvfuqvkyq onBannerClicked) {
        zdlpuopuiu.btonecajqb(onBannerClicked, "onBannerClicked");
        return new ef.zoijcleaow(new tg.rgvfuqvkyq() { // from class: ar1.eablkybsjg
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return dxjokdxxww.gxszxtbevo((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: ar1.gxszxtbevo
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return dxjokdxxww.lqeggnwhkg(onBannerClicked, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f14393zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final crxdokpmqz gxszxtbevo(LayoutInflater layoutInflater, ViewGroup root) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(root, "root");
        crxdokpmqz crxdokpmqzVarPpxfxbqfkf = crxdokpmqz.ppxfxbqfkf(layoutInflater, root, false);
        zdlpuopuiu.dxjokdxxww(crxdokpmqzVarPpxfxbqfkf, "inflate(...)");
        return crxdokpmqzVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(final tg.rgvfuqvkyq rgvfuqvkyqVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        final crxdokpmqz crxdokpmqzVar = (crxdokpmqz) adapterDelegateViewBinding.ppxfxbqfkf();
        crxdokpmqzVar.f127899zoijcleaow.setListener(new tg.draadjrbmk() { // from class: ar1.lqeggnwhkg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return dxjokdxxww.nufgyqmvbu(rgvfuqvkyqVar, adapterDelegateViewBinding, ((Integer) obj).intValue());
            }
        });
        crxdokpmqzVar.f127899zoijcleaow.setHeaderVisible(false);
        crxdokpmqzVar.f127899zoijcleaow.setInfiniteScrollEnabled(false);
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: ar1.nufgyqmvbu
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return dxjokdxxww.dxjokdxxww(crxdokpmqzVar, adapterDelegateViewBinding, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn nufgyqmvbu(tg.rgvfuqvkyq rgvfuqvkyqVar, ef.iobyxmoadg iobyxmoadgVar, int i13) {
        rgvfuqvkyqVar.invoke(((sr1.wkgbmnqykc) iobyxmoadgVar.eablkybsjg()).getItemId(), ((sr1.wkgbmnqykc) iobyxmoadgVar.eablkybsjg()).lqeggnwhkg().get(i13));
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
