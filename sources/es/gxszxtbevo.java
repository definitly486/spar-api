package es;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.metgxyhuhe;
import ru.myspar.legacy.presentation.view.banners.BannerPromoLayoutView;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gxszxtbevo {

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
            return Boolean.valueOf(obj instanceof draadjrbmk.iobyxmoadg);
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f31869zdlpuopuiu = new zoijcleaow();

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
    public static final wwaezpbzkn dxjokdxxww(ef.iobyxmoadg iobyxmoadgVar, List it) {
        zdlpuopuiu.btonecajqb(it, "it");
        ((metgxyhuhe) iobyxmoadgVar.ppxfxbqfkf()).f65795zoijcleaow.setData(((draadjrbmk.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).iobyxmoadg().ppxfxbqfkf());
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow eablkybsjg(final tg.draadjrbmk listener) {
        zdlpuopuiu.btonecajqb(listener, "listener");
        return new ef.zoijcleaow(new tg.rgvfuqvkyq() { // from class: es.zoijcleaow
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return gxszxtbevo.gxszxtbevo((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: es.ppxfxbqfkf
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return gxszxtbevo.lqeggnwhkg(listener, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f31869zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final metgxyhuhe gxszxtbevo(LayoutInflater layoutInflater, ViewGroup root) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(root, "root");
        metgxyhuhe metgxyhuheVarPpxfxbqfkf = metgxyhuhe.ppxfxbqfkf(layoutInflater, root, false);
        zdlpuopuiu.dxjokdxxww(metgxyhuheVarPpxfxbqfkf, "inflate(...)");
        return metgxyhuheVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(final tg.draadjrbmk draadjrbmkVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        BannerPromoLayoutView bannerPromoLayoutView = ((metgxyhuhe) adapterDelegateViewBinding.ppxfxbqfkf()).f65795zoijcleaow;
        bannerPromoLayoutView.setInfiniteScrollEnabled(false);
        bannerPromoLayoutView.setListener(new tg.draadjrbmk() { // from class: es.wkgbmnqykc
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return gxszxtbevo.nufgyqmvbu(draadjrbmkVar, adapterDelegateViewBinding, ((Integer) obj).intValue());
            }
        });
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: es.eablkybsjg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return gxszxtbevo.dxjokdxxww(adapterDelegateViewBinding, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn nufgyqmvbu(tg.draadjrbmk draadjrbmkVar, ef.iobyxmoadg iobyxmoadgVar, int i13) {
        draadjrbmkVar.invoke(((nb0.eablkybsjg) ((draadjrbmk.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).iobyxmoadg().wkgbmnqykc().get(i13)).getId());
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
