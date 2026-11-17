package g52;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.List;
import ru.myspar.core.domain.models.comboset.ComboSetProduct;
import ru.myspar.legacy.presentation.view.ComboSetView;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ylkuphrtab {

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
            return Boolean.valueOf(obj instanceof c62.iobyxmoadg);
        }
    }

    public static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f36359zdlpuopuiu = new zoijcleaow();

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
    public static final gg.wwaezpbzkn btonecajqb(ef.iobyxmoadg iobyxmoadgVar, tg.rgvfuqvkyq rgvfuqvkyqVar, ComboSetProduct product, mo.zoijcleaow analyticsData) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsData, "analyticsData");
        if (iobyxmoadgVar.getAdapterPosition() != -1) {
            rgvfuqvkyqVar.invoke(product, analyticsData);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn draadjrbmk(ef.iobyxmoadg iobyxmoadgVar, tg.draadjrbmk draadjrbmkVar, qu.iobyxmoadg it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        if (iobyxmoadgVar.getAdapterPosition() != -1) {
            draadjrbmkVar.invoke(it);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn dxjokdxxww(final tg.rgvfuqvkyq rgvfuqvkyqVar, final tg.draadjrbmk draadjrbmkVar, final tg.draadjrbmk draadjrbmkVar2, final ef.iobyxmoadg adapterDelegateViewBinding) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        ComboSetView root = ((b52.ppxfxbqfkf) adapterDelegateViewBinding.ppxfxbqfkf()).getRoot();
        root.setTitleRes(pm.dxjokdxxww.try_a_combo);
        root.setActionClickedCardProduct(new tg.rgvfuqvkyq() { // from class: g52.yadqdtsiqt
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return ylkuphrtab.btonecajqb(adapterDelegateViewBinding, rgvfuqvkyqVar, (ComboSetProduct) obj, (mo.zoijcleaow) obj2);
            }
        });
        root.setActionClickedShowAllCombo(new tg.draadjrbmk() { // from class: g52.iozdgvuglv
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ylkuphrtab.gtknphoqwx(adapterDelegateViewBinding, draadjrbmkVar, (qu.iobyxmoadg) obj);
            }
        });
        root.setActionClickedBtnAddComboToCart(new tg.draadjrbmk() { // from class: g52.lmojexxdyd
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ylkuphrtab.draadjrbmk(adapterDelegateViewBinding, draadjrbmkVar2, (qu.iobyxmoadg) obj);
            }
        });
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: g52.wwaezpbzkn
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ylkuphrtab.wflxmlrfwp(adapterDelegateViewBinding, (List) obj);
            }
        });
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn gtknphoqwx(ef.iobyxmoadg iobyxmoadgVar, tg.draadjrbmk draadjrbmkVar, qu.iobyxmoadg it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        if (iobyxmoadgVar.getAdapterPosition() != -1) {
            draadjrbmkVar.invoke(it);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow lqeggnwhkg(final tg.rgvfuqvkyq onClickCardProductCombo, final tg.draadjrbmk onClickBtnShowAllCombo, final tg.draadjrbmk onClickBtnAddComboToCart) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onClickCardProductCombo, "onClickCardProductCombo");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onClickBtnShowAllCombo, "onClickBtnShowAllCombo");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onClickBtnAddComboToCart, "onClickBtnAddComboToCart");
        return new ef.zoijcleaow(new tg.rgvfuqvkyq() { // from class: g52.istkbnxepw
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return ylkuphrtab.nufgyqmvbu((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: g52.cdpycssgdh
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ylkuphrtab.dxjokdxxww(onClickCardProductCombo, onClickBtnShowAllCombo, onClickBtnAddComboToCart, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f36359zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b52.ppxfxbqfkf nufgyqmvbu(LayoutInflater layoutInflater, ViewGroup root) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(root, "root");
        b52.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf = b52.ppxfxbqfkf.ppxfxbqfkf(layoutInflater, root, false);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ppxfxbqfkfVarPpxfxbqfkf, "inflate(...)");
        return ppxfxbqfkfVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn wflxmlrfwp(ef.iobyxmoadg iobyxmoadgVar, List it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        ((b52.ppxfxbqfkf) iobyxmoadgVar.ppxfxbqfkf()).getRoot().setComboSetList(((c62.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).iobyxmoadg());
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
