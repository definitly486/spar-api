package gb1;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.material.textview.MaterialTextView;
import gg.wwaezpbzkn;
import java.util.List;
import z41.metgxyhuhe;

/* JADX INFO: loaded from: classes5.dex */
public abstract class lqeggnwhkg {

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
            return Boolean.valueOf(obj instanceof ib1.zoijcleaow);
        }
    }

    public static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f36756zdlpuopuiu = new zoijcleaow();

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
    public static final wwaezpbzkn dxjokdxxww(tg.draadjrbmk draadjrbmkVar, ib1.iobyxmoadg it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        draadjrbmkVar.invoke(it);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow eablkybsjg(final tg.draadjrbmk onDeleteListener) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onDeleteListener, "onDeleteListener");
        return new ef.zoijcleaow(new tg.rgvfuqvkyq() { // from class: gb1.ppxfxbqfkf
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return lqeggnwhkg.gxszxtbevo((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: gb1.wkgbmnqykc
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return lqeggnwhkg.lqeggnwhkg(onDeleteListener, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f36756zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final metgxyhuhe gxszxtbevo(LayoutInflater layoutInflater, ViewGroup root) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(root, "root");
        metgxyhuhe metgxyhuheVarPpxfxbqfkf = metgxyhuhe.ppxfxbqfkf(layoutInflater, root, false);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(metgxyhuheVarPpxfxbqfkf, "inflate(...)");
        return metgxyhuheVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(final tg.draadjrbmk draadjrbmkVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        final metgxyhuhe metgxyhuheVar = (metgxyhuhe) adapterDelegateViewBinding.ppxfxbqfkf();
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: gb1.eablkybsjg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return lqeggnwhkg.nufgyqmvbu(metgxyhuheVar, adapterDelegateViewBinding, draadjrbmkVar, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn nufgyqmvbu(metgxyhuhe metgxyhuheVar, ef.iobyxmoadg iobyxmoadgVar, final tg.draadjrbmk draadjrbmkVar, List it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        MaterialTextView tvEmptyCards = metgxyhuheVar.f128261ppxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(tvEmptyCards, "tvEmptyCards");
        tvEmptyCards.setVisibility(((ib1.zoijcleaow) iobyxmoadgVar.eablkybsjg()).iobyxmoadg().isEmpty() ? 0 : 8);
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(iobyxmoadgVar.wkgbmnqykc());
        flexboxLayoutManager.Y0(1);
        flexboxLayoutManager.X0(0);
        flexboxLayoutManager.Z0(0);
        flexboxLayoutManager.W0(0);
        metgxyhuheVar.f128262zoijcleaow.setLayoutManager(flexboxLayoutManager);
        metgxyhuheVar.f128262zoijcleaow.btonecajqb(new gb1.iobyxmoadg());
        gb1.zoijcleaow zoijcleaowVar = new gb1.zoijcleaow(new tg.draadjrbmk() { // from class: gb1.gxszxtbevo
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return lqeggnwhkg.dxjokdxxww(draadjrbmkVar, (ib1.iobyxmoadg) obj);
            }
        });
        metgxyhuheVar.f128262zoijcleaow.setAdapter(zoijcleaowVar);
        zoijcleaowVar.wkgbmnqykc(((ib1.zoijcleaow) iobyxmoadgVar.eablkybsjg()).iobyxmoadg());
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
