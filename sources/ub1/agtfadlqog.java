package ub1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurant.models.RestaurantSectionUiModel;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;
import z41.bfopjjpdmp;

/* JADX INFO: loaded from: classes5.dex */
public abstract class agtfadlqog {

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
            return Boolean.valueOf(obj instanceof RestaurantSectionUiModel);
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f113214zdlpuopuiu = new zoijcleaow();

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
        ((bfopjjpdmp) iobyxmoadgVar.ppxfxbqfkf()).f127837zoijcleaow.setTitle(((RestaurantSectionUiModel) iobyxmoadgVar.eablkybsjg()).getName());
        ((bfopjjpdmp) iobyxmoadgVar.ppxfxbqfkf()).f127837zoijcleaow.setChecked(((RestaurantSectionUiModel) iobyxmoadgVar.eablkybsjg()).getIsChecked());
        iobyxmoadgVar.itemView.setClickable(!((RestaurantSectionUiModel) iobyxmoadgVar.eablkybsjg()).getIsChecked());
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow eablkybsjg(final tg.draadjrbmk listener) {
        zdlpuopuiu.btonecajqb(listener, "listener");
        return new ef.zoijcleaow(new rgvfuqvkyq() { // from class: ub1.btonecajqb
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return agtfadlqog.gxszxtbevo((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: ub1.gtknphoqwx
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return agtfadlqog.lqeggnwhkg(listener, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f113214zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bfopjjpdmp gxszxtbevo(LayoutInflater layoutInflater, ViewGroup root) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(root, "root");
        bfopjjpdmp bfopjjpdmpVarPpxfxbqfkf = bfopjjpdmp.ppxfxbqfkf(layoutInflater, root, false);
        zdlpuopuiu.dxjokdxxww(bfopjjpdmpVarPpxfxbqfkf, "inflate(...)");
        return bfopjjpdmpVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(final tg.draadjrbmk draadjrbmkVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        adapterDelegateViewBinding.itemView.setOnClickListener(new View.OnClickListener() { // from class: ub1.draadjrbmk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                agtfadlqog.nufgyqmvbu(adapterDelegateViewBinding, draadjrbmkVar, view);
            }
        });
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: ub1.wflxmlrfwp
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return agtfadlqog.dxjokdxxww(adapterDelegateViewBinding, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nufgyqmvbu(ef.iobyxmoadg iobyxmoadgVar, tg.draadjrbmk draadjrbmkVar, View view) {
        if (iobyxmoadgVar.getAbsoluteAdapterPosition() != -1) {
            draadjrbmkVar.invoke(Integer.valueOf(iobyxmoadgVar.getAbsoluteAdapterPosition()));
        }
    }
}
