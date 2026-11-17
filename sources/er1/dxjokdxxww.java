package er1;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;
import z41.oipsdeybqn;

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
            return Boolean.valueOf(obj instanceof ks1.zoijcleaow);
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f31840zdlpuopuiu = new zoijcleaow();

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
    public static final oipsdeybqn eablkybsjg(LayoutInflater layoutInflater, ViewGroup root) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(root, "root");
        oipsdeybqn oipsdeybqnVarPpxfxbqfkf = oipsdeybqn.ppxfxbqfkf(layoutInflater, root, false);
        zdlpuopuiu.dxjokdxxww(oipsdeybqnVarPpxfxbqfkf, "inflate(...)");
        return oipsdeybqnVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gxszxtbevo(draadjrbmk draadjrbmkVar, RecyclerView.jyumaefscl jyumaefsclVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        final er1.iobyxmoadg iobyxmoadgVar = new er1.iobyxmoadg(draadjrbmkVar);
        RecyclerView root = ((oipsdeybqn) adapterDelegateViewBinding.ppxfxbqfkf()).getRoot();
        root.setRecycledViewPool(jyumaefsclVar);
        zdlpuopuiu.lqeggnwhkg(root);
        r41.zoijcleaow.ppxfxbqfkf(root, iobyxmoadgVar, adapterDelegateViewBinding.ppxfxbqfkf());
        root.setLayoutManager(new LinearLayoutManager(root.getContext(), 0, false));
        int dimensionPixelSize = root.getContext().getResources().getDimensionPixelSize(b31.eablkybsjg.content_margin_8);
        root.btonecajqb(new c31.nufgyqmvbu(dimensionPixelSize, 0, dimensionPixelSize, 0, 0, 0, false, false, 250, null));
        adapterDelegateViewBinding.zoijcleaow(new draadjrbmk() { // from class: er1.nufgyqmvbu
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return dxjokdxxww.lqeggnwhkg(iobyxmoadgVar, adapterDelegateViewBinding, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(er1.iobyxmoadg iobyxmoadgVar, ef.iobyxmoadg iobyxmoadgVar2, List it) {
        zdlpuopuiu.btonecajqb(it, "it");
        iobyxmoadgVar.wkgbmnqykc(((ks1.zoijcleaow) iobyxmoadgVar2.eablkybsjg()).iobyxmoadg());
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow wkgbmnqykc(final draadjrbmk onCardClicked, final RecyclerView.jyumaefscl recycledViewPool) {
        zdlpuopuiu.btonecajqb(onCardClicked, "onCardClicked");
        zdlpuopuiu.btonecajqb(recycledViewPool, "recycledViewPool");
        return new ef.zoijcleaow(new rgvfuqvkyq() { // from class: er1.gxszxtbevo
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return dxjokdxxww.eablkybsjg((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new draadjrbmk() { // from class: er1.lqeggnwhkg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return dxjokdxxww.gxszxtbevo(onCardClicked, recycledViewPool, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f31840zdlpuopuiu);
    }
}
