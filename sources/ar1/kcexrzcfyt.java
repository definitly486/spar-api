package ar1;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import z41.sopmlzcsov;

/* JADX INFO: loaded from: classes6.dex */
public abstract class kcexrzcfyt {

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
            return Boolean.valueOf(obj instanceof sr1.btonecajqb);
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f14396zdlpuopuiu = new zoijcleaow();

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
    public static final wwaezpbzkn dxjokdxxww(u81.eablkybsjg eablkybsjgVar, ef.iobyxmoadg iobyxmoadgVar, List it) {
        zdlpuopuiu.btonecajqb(it, "it");
        eablkybsjgVar.wkgbmnqykc(((sr1.btonecajqb) iobyxmoadgVar.eablkybsjg()).eablkybsjg());
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow eablkybsjg(final tg.rgvfuqvkyq onBannerClicked) {
        zdlpuopuiu.btonecajqb(onBannerClicked, "onBannerClicked");
        return new ef.zoijcleaow(new tg.rgvfuqvkyq() { // from class: ar1.ojitshcjhn
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return kcexrzcfyt.gxszxtbevo((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: ar1.rgvfuqvkyq
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return kcexrzcfyt.lqeggnwhkg(onBannerClicked, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f14396zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sopmlzcsov gxszxtbevo(LayoutInflater layoutInflater, ViewGroup root) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(root, "root");
        sopmlzcsov sopmlzcsovVarPpxfxbqfkf = sopmlzcsov.ppxfxbqfkf(layoutInflater, root, false);
        zdlpuopuiu.dxjokdxxww(sopmlzcsovVarPpxfxbqfkf, "inflate(...)");
        return sopmlzcsovVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(final tg.rgvfuqvkyq rgvfuqvkyqVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        final u81.eablkybsjg eablkybsjgVar = new u81.eablkybsjg(new tg.rgvfuqvkyq() { // from class: ar1.vdvldrhtss
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return kcexrzcfyt.nufgyqmvbu(rgvfuqvkyqVar, adapterDelegateViewBinding, (m91.nufgyqmvbu) obj, ((Integer) obj2).intValue());
            }
        });
        RecyclerView recyclerView = ((sopmlzcsov) adapterDelegateViewBinding.ppxfxbqfkf()).f128386ppxfxbqfkf;
        zdlpuopuiu.lqeggnwhkg(recyclerView);
        r41.zoijcleaow.ppxfxbqfkf(recyclerView, eablkybsjgVar, adapterDelegateViewBinding.ppxfxbqfkf());
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        new c31.dxjokdxxww(0, 1, null).attachToRecyclerView(recyclerView);
        int dimensionPixelSize = recyclerView.getContext().getResources().getDimensionPixelSize(b31.eablkybsjg.content_margin_4);
        recyclerView.btonecajqb(new c31.nufgyqmvbu(dimensionPixelSize, 0, dimensionPixelSize, 0, 0, 0, false, false, 250, null));
        ProgressBar pbLoading = ((sopmlzcsov) adapterDelegateViewBinding.ppxfxbqfkf()).f128387zoijcleaow;
        zdlpuopuiu.dxjokdxxww(pbLoading, "pbLoading");
        pbLoading.setVisibility(8);
        RecyclerView rvButtons = ((sopmlzcsov) adapterDelegateViewBinding.ppxfxbqfkf()).f128386ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(rvButtons, "rvButtons");
        rvButtons.setVisibility(0);
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: ar1.oxmwwwfdhm
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return kcexrzcfyt.dxjokdxxww(eablkybsjgVar, adapterDelegateViewBinding, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn nufgyqmvbu(tg.rgvfuqvkyq rgvfuqvkyqVar, ef.iobyxmoadg iobyxmoadgVar, m91.nufgyqmvbu nufgyqmvbuVar, int i13) {
        zdlpuopuiu.btonecajqb(nufgyqmvbuVar, "<unused var>");
        rgvfuqvkyqVar.invoke(((sr1.btonecajqb) iobyxmoadgVar.eablkybsjg()).getItemId(), ((sr1.btonecajqb) iobyxmoadgVar.eablkybsjg()).lqeggnwhkg().get(i13));
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
