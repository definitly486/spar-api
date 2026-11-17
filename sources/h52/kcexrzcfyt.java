package h52;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.xrmfcynszj;

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
            return Boolean.valueOf(obj instanceof z52.btonecajqb);
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f39497zdlpuopuiu = new zoijcleaow();

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
    public static final wwaezpbzkn dxjokdxxww(ta0.eablkybsjg eablkybsjgVar, ef.iobyxmoadg iobyxmoadgVar, List it) {
        zdlpuopuiu.btonecajqb(it, "it");
        eablkybsjgVar.wkgbmnqykc(((z52.btonecajqb) iobyxmoadgVar.eablkybsjg()).eablkybsjg());
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow eablkybsjg(final tg.rgvfuqvkyq onBannerClicked) {
        zdlpuopuiu.btonecajqb(onBannerClicked, "onBannerClicked");
        return new ef.zoijcleaow(new tg.rgvfuqvkyq() { // from class: h52.ojitshcjhn
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return kcexrzcfyt.gxszxtbevo((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: h52.rgvfuqvkyq
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return kcexrzcfyt.lqeggnwhkg(onBannerClicked, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f39497zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xrmfcynszj gxszxtbevo(LayoutInflater layoutInflater, ViewGroup root) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(root, "root");
        xrmfcynszj xrmfcynszjVarPpxfxbqfkf = xrmfcynszj.ppxfxbqfkf(layoutInflater, root, false);
        zdlpuopuiu.dxjokdxxww(xrmfcynszjVarPpxfxbqfkf, "inflate(...)");
        return xrmfcynszjVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(final tg.rgvfuqvkyq rgvfuqvkyqVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        final ta0.eablkybsjg eablkybsjgVar = new ta0.eablkybsjg(new tg.rgvfuqvkyq() { // from class: h52.vdvldrhtss
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return kcexrzcfyt.nufgyqmvbu(rgvfuqvkyqVar, adapterDelegateViewBinding, (nb0.gxszxtbevo) obj, ((Integer) obj2).intValue());
            }
        });
        RecyclerView recyclerView = ((xrmfcynszj) adapterDelegateViewBinding.ppxfxbqfkf()).f66104ppxfxbqfkf;
        zdlpuopuiu.lqeggnwhkg(recyclerView);
        e60.zoijcleaow.ppxfxbqfkf(recyclerView, eablkybsjgVar, adapterDelegateViewBinding.ppxfxbqfkf());
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        new t40.dxjokdxxww(0, 1, null).attachToRecyclerView(recyclerView);
        int dimensionPixelSize = recyclerView.getContext().getResources().getDimensionPixelSize(s40.eablkybsjg.content_margin_4);
        recyclerView.btonecajqb(new t40.nufgyqmvbu(dimensionPixelSize, 0, dimensionPixelSize, 0, 0, 0, false, false, 250, null));
        ProgressBar pbLoading = ((xrmfcynszj) adapterDelegateViewBinding.ppxfxbqfkf()).f66105zoijcleaow;
        zdlpuopuiu.dxjokdxxww(pbLoading, "pbLoading");
        pbLoading.setVisibility(8);
        RecyclerView rvButtons = ((xrmfcynszj) adapterDelegateViewBinding.ppxfxbqfkf()).f66104ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(rvButtons, "rvButtons");
        rvButtons.setVisibility(0);
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: h52.oxmwwwfdhm
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return kcexrzcfyt.dxjokdxxww(eablkybsjgVar, adapterDelegateViewBinding, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn nufgyqmvbu(tg.rgvfuqvkyq rgvfuqvkyqVar, ef.iobyxmoadg iobyxmoadgVar, nb0.gxszxtbevo gxszxtbevoVar, int i13) {
        zdlpuopuiu.btonecajqb(gxszxtbevoVar, "<unused var>");
        rgvfuqvkyqVar.invoke(((z52.btonecajqb) iobyxmoadgVar.eablkybsjg()).getItemId(), ((z52.btonecajqb) iobyxmoadgVar.eablkybsjg()).lqeggnwhkg().get(i13));
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
