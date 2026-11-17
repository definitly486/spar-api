package la1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatCheckBox;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import p41.dxjokdxxww;
import ru.myspar.proloyalty.legacy.presentation.screen.filtersall.models.FilterValueUiModel;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;
import z41.wypolnanlu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class eablkybsjg {

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
            return Boolean.valueOf(obj instanceof FilterValueUiModel);
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f61996zdlpuopuiu = new zoijcleaow();

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
        AppCompatCheckBox appCompatCheckBox = ((wypolnanlu) iobyxmoadgVar.ppxfxbqfkf()).f128469zoijcleaow;
        appCompatCheckBox.setText(((FilterValueUiModel) iobyxmoadgVar.eablkybsjg()).getName());
        appCompatCheckBox.setChecked(((FilterValueUiModel) iobyxmoadgVar.eablkybsjg()).getChecked());
        if (!((FilterValueUiModel) iobyxmoadgVar.eablkybsjg()).getDisabled() || ((FilterValueUiModel) iobyxmoadgVar.eablkybsjg()).getChecked()) {
            appCompatCheckBox.setEnabled(true);
            zdlpuopuiu.lqeggnwhkg(appCompatCheckBox);
            dxjokdxxww.gtknphoqwx(appCompatCheckBox, true, 0, 0, 6, null);
        } else {
            appCompatCheckBox.setEnabled(false);
            zdlpuopuiu.lqeggnwhkg(appCompatCheckBox);
            dxjokdxxww.gtknphoqwx(appCompatCheckBox, false, 0, 0, 6, null);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow eablkybsjg(final draadjrbmk filterChangeCallback) {
        zdlpuopuiu.btonecajqb(filterChangeCallback, "filterChangeCallback");
        return new ef.zoijcleaow(new rgvfuqvkyq() { // from class: la1.iobyxmoadg
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return eablkybsjg.gxszxtbevo((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new draadjrbmk() { // from class: la1.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return eablkybsjg.lqeggnwhkg(filterChangeCallback, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f61996zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wypolnanlu gxszxtbevo(LayoutInflater layoutInflater, ViewGroup root) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(root, "root");
        wypolnanlu wypolnanluVarPpxfxbqfkf = wypolnanlu.ppxfxbqfkf(layoutInflater, root, false);
        zdlpuopuiu.dxjokdxxww(wypolnanluVarPpxfxbqfkf, "inflate(...)");
        return wypolnanluVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(final draadjrbmk draadjrbmkVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        ((wypolnanlu) adapterDelegateViewBinding.ppxfxbqfkf()).f128469zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: la1.ppxfxbqfkf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                eablkybsjg.nufgyqmvbu(adapterDelegateViewBinding, draadjrbmkVar, view);
            }
        });
        adapterDelegateViewBinding.zoijcleaow(new draadjrbmk() { // from class: la1.wkgbmnqykc
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return eablkybsjg.dxjokdxxww(adapterDelegateViewBinding, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nufgyqmvbu(ef.iobyxmoadg iobyxmoadgVar, draadjrbmk draadjrbmkVar, View view) {
        if (iobyxmoadgVar.getBindingAdapterPosition() != -1) {
            draadjrbmkVar.invoke(iobyxmoadgVar.eablkybsjg());
        }
    }
}
