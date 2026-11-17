package wa0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.crxdokpmqz;
import ru.myspar.core.domain.models.comboset.ComboSetProduct;
import ru.myspar.legacy.presentation.view.ComboSetCardItemView;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes4.dex */
public abstract class nufgyqmvbu {

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
            return Boolean.valueOf(obj instanceof qu.iobyxmoadg);
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f119158zdlpuopuiu = new zoijcleaow();

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
    public static final wwaezpbzkn btonecajqb(ef.iobyxmoadg iobyxmoadgVar, rgvfuqvkyq rgvfuqvkyqVar, ComboSetProduct product, mo.zoijcleaow analyticsData) {
        zdlpuopuiu.btonecajqb(product, "product");
        zdlpuopuiu.btonecajqb(analyticsData, "analyticsData");
        if (iobyxmoadgVar.getAdapterPosition() != -1) {
            rgvfuqvkyqVar.invoke(product, analyticsData);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn draadjrbmk(ef.iobyxmoadg iobyxmoadgVar, draadjrbmk draadjrbmkVar, qu.iobyxmoadg it) {
        zdlpuopuiu.btonecajqb(it, "it");
        if (iobyxmoadgVar.getAdapterPosition() != -1) {
            draadjrbmkVar.invoke(iobyxmoadgVar.eablkybsjg());
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn dxjokdxxww(final rgvfuqvkyq rgvfuqvkyqVar, final draadjrbmk draadjrbmkVar, final draadjrbmk draadjrbmkVar2, final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        ComboSetCardItemView root = ((crxdokpmqz) adapterDelegateViewBinding.ppxfxbqfkf()).getRoot();
        root.setActionClickedCardProductCombo(new rgvfuqvkyq() { // from class: wa0.wkgbmnqykc
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return nufgyqmvbu.btonecajqb(adapterDelegateViewBinding, rgvfuqvkyqVar, (ComboSetProduct) obj, (mo.zoijcleaow) obj2);
            }
        });
        root.setActionClickedBtnShowAllCombo(new draadjrbmk() { // from class: wa0.eablkybsjg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return nufgyqmvbu.gtknphoqwx(adapterDelegateViewBinding, draadjrbmkVar, (qu.iobyxmoadg) obj);
            }
        });
        root.setActionClickedBtnAddComboToCart(new draadjrbmk() { // from class: wa0.gxszxtbevo
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return nufgyqmvbu.draadjrbmk(adapterDelegateViewBinding, draadjrbmkVar2, (qu.iobyxmoadg) obj);
            }
        });
        adapterDelegateViewBinding.zoijcleaow(new draadjrbmk() { // from class: wa0.lqeggnwhkg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return nufgyqmvbu.wflxmlrfwp(adapterDelegateViewBinding, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gtknphoqwx(ef.iobyxmoadg iobyxmoadgVar, draadjrbmk draadjrbmkVar, qu.iobyxmoadg it) {
        zdlpuopuiu.btonecajqb(it, "it");
        if (iobyxmoadgVar.getAdapterPosition() != -1) {
            draadjrbmkVar.invoke(it);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow lqeggnwhkg(final rgvfuqvkyq onClickCardProductCombo, final draadjrbmk onClickBtnShowAllCombo, final draadjrbmk onClickBtnAddComboToCart) {
        zdlpuopuiu.btonecajqb(onClickCardProductCombo, "onClickCardProductCombo");
        zdlpuopuiu.btonecajqb(onClickBtnShowAllCombo, "onClickBtnShowAllCombo");
        zdlpuopuiu.btonecajqb(onClickBtnAddComboToCart, "onClickBtnAddComboToCart");
        return new ef.zoijcleaow(new rgvfuqvkyq() { // from class: wa0.zoijcleaow
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return nufgyqmvbu.nufgyqmvbu((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new draadjrbmk() { // from class: wa0.ppxfxbqfkf
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return nufgyqmvbu.dxjokdxxww(onClickCardProductCombo, onClickBtnShowAllCombo, onClickBtnAddComboToCart, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f119158zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final crxdokpmqz nufgyqmvbu(LayoutInflater layoutInflater, ViewGroup parent) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(parent, "parent");
        crxdokpmqz crxdokpmqzVarPpxfxbqfkf = crxdokpmqz.ppxfxbqfkf(layoutInflater, parent, false);
        zdlpuopuiu.dxjokdxxww(crxdokpmqzVarPpxfxbqfkf, "inflate(...)");
        return crxdokpmqzVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wflxmlrfwp(ef.iobyxmoadg iobyxmoadgVar, List it) {
        zdlpuopuiu.btonecajqb(it, "it");
        ((crxdokpmqz) iobyxmoadgVar.ppxfxbqfkf()).getRoot().setComboSetUiModel((qu.iobyxmoadg) iobyxmoadgVar.eablkybsjg());
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
