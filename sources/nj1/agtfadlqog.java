package nj1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.aitsuki.swipe.SwipeLayout;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.purchases.impl.specific.presentation.view.PurchaseProductView;

/* JADX INFO: loaded from: classes6.dex */
public abstract class agtfadlqog {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f70202iobyxmoadg;

        static {
            int[] iArr = new int[istkbnxepw.values().length];
            try {
                iArr[istkbnxepw.TO_BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[istkbnxepw.BOUGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f70202iobyxmoadg = iArr;
        }
    }

    public static final class ppxfxbqfkf extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final ppxfxbqfkf f70203zdlpuopuiu = new ppxfxbqfkf();

        public ppxfxbqfkf() {
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

    public static final class wkgbmnqykc implements SwipeLayout.wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ ef.iobyxmoadg f70204iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f70205ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f70206zoijcleaow;

        wkgbmnqykc(ef.iobyxmoadg iobyxmoadgVar, tg.rgvfuqvkyq rgvfuqvkyqVar, tg.rgvfuqvkyq rgvfuqvkyqVar2) {
            this.f70204iobyxmoadg = iobyxmoadgVar;
            this.f70206zoijcleaow = rgvfuqvkyqVar;
            this.f70205ppxfxbqfkf = rgvfuqvkyqVar2;
        }

        @Override // com.aitsuki.swipe.SwipeLayout.wkgbmnqykc
        public void iobyxmoadg(View view) {
            SwipeLayout.wkgbmnqykc.iobyxmoadg.iobyxmoadg(this, view);
        }

        @Override // com.aitsuki.swipe.SwipeLayout.wkgbmnqykc
        public void ppxfxbqfkf(View view, int i13) {
            SwipeLayout.wkgbmnqykc.iobyxmoadg.ppxfxbqfkf(this, view, i13);
        }

        @Override // com.aitsuki.swipe.SwipeLayout.wkgbmnqykc
        public void wkgbmnqykc(View view, float f13) {
            SwipeLayout.wkgbmnqykc.iobyxmoadg.zoijcleaow(this, view, f13);
        }

        @Override // com.aitsuki.swipe.SwipeLayout.wkgbmnqykc
        public void zoijcleaow(View menuView) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(menuView, "menuView");
            if (this.f70204iobyxmoadg.getBindingAdapterPosition() != -1) {
                int id2 = menuView.getId();
                if (id2 == ((yi1.draadjrbmk) this.f70204iobyxmoadg.ppxfxbqfkf()).f125400wkgbmnqykc.getId()) {
                    this.f70206zoijcleaow.invoke(((pj1.iobyxmoadg.ppxfxbqfkf) this.f70204iobyxmoadg.eablkybsjg()).wkgbmnqykc().getId(), ((pj1.iobyxmoadg.ppxfxbqfkf) this.f70204iobyxmoadg.eablkybsjg()).iobyxmoadg());
                } else if (id2 == ((yi1.draadjrbmk) this.f70204iobyxmoadg.ppxfxbqfkf()).f125397lqeggnwhkg.getId()) {
                    this.f70205ppxfxbqfkf.invoke(((pj1.iobyxmoadg.ppxfxbqfkf) this.f70204iobyxmoadg.eablkybsjg()).wkgbmnqykc().getId(), ((pj1.iobyxmoadg.ppxfxbqfkf) this.f70204iobyxmoadg.eablkybsjg()).iobyxmoadg());
                }
            }
            SwipeLayout.rgvfuqvkyq(((yi1.draadjrbmk) this.f70204iobyxmoadg.ppxfxbqfkf()).getRoot(), false, 1, null);
        }
    }

    public static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.vdvldrhtss {
        public zoijcleaow() {
            super(3);
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return iobyxmoadg(obj, (List) obj2, ((Number) obj3).intValue());
        }

        public final Boolean iobyxmoadg(Object obj, List noName_1, int i13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(noName_1, "$noName_1");
            return Boolean.valueOf(obj instanceof pj1.iobyxmoadg.ppxfxbqfkf);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yi1.draadjrbmk agtfadlqog(LayoutInflater layoutInflater, ViewGroup root) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(root, "root");
        yi1.draadjrbmk draadjrbmkVarPpxfxbqfkf = yi1.draadjrbmk.ppxfxbqfkf(layoutInflater, root, false);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(draadjrbmkVarPpxfxbqfkf, "inflate(...)");
        return draadjrbmkVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn cqumvgiudr(ef.iobyxmoadg iobyxmoadgVar, tg.draadjrbmk draadjrbmkVar) {
        if (iobyxmoadgVar.getBindingAdapterPosition() != -1) {
            draadjrbmkVar.invoke(((pj1.iobyxmoadg.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc().iobyxmoadg());
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn esjtqupxsv(ef.iobyxmoadg iobyxmoadgVar, tg.draadjrbmk draadjrbmkVar) {
        if (iobyxmoadgVar.getBindingAdapterPosition() != -1) {
            draadjrbmkVar.invoke(((pj1.iobyxmoadg.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc().iobyxmoadg());
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn iwizpuwonk(ef.iobyxmoadg iobyxmoadgVar, tg.draadjrbmk draadjrbmkVar) {
        if (iobyxmoadgVar.getBindingAdapterPosition() != -1) {
            draadjrbmkVar.invoke(((pj1.iobyxmoadg.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc().iobyxmoadg());
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn jyumaefscl(ef.iobyxmoadg iobyxmoadgVar, tg.draadjrbmk draadjrbmkVar) {
        if (iobyxmoadgVar.getBindingAdapterPosition() != -1) {
            draadjrbmkVar.invoke(((pj1.iobyxmoadg.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc().iobyxmoadg());
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn kcexrzcfyt(tg.vdvldrhtss vdvldrhtssVar, ef.iobyxmoadg iobyxmoadgVar, HintUiModel it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        if (vdvldrhtssVar != null) {
            vdvldrhtssVar.invoke(it, ((pj1.iobyxmoadg.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc().iobyxmoadg(), ((pj1.iobyxmoadg.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc().draadjrbmk());
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lereixgezr(ef.iobyxmoadg iobyxmoadgVar, List payloads) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(payloads, "payloads");
        if (payloads.isEmpty()) {
            ((yi1.draadjrbmk) iobyxmoadgVar.ppxfxbqfkf()).f125401zoijcleaow.setProduct(((pj1.iobyxmoadg.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc());
            pmvmpeiblj(iobyxmoadgVar, ((pj1.iobyxmoadg.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).iobyxmoadg(), ((pj1.iobyxmoadg.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc());
        } else {
            for (Object obj : payloads) {
                if (obj instanceof List) {
                    for (Object obj2 : (Iterable) obj) {
                        if (obj2 != null && (obj2 instanceof pj1.zoijcleaow)) {
                            rgvfuqvkyq(iobyxmoadgVar, (pj1.zoijcleaow) obj2);
                        }
                    }
                }
            }
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ojitshcjhn(tg.rgvfuqvkyq rgvfuqvkyqVar, tg.rgvfuqvkyq rgvfuqvkyqVar2, final tg.rgvfuqvkyq rgvfuqvkyqVar3, final tg.vdvldrhtss vdvldrhtssVar, final tg.draadjrbmk draadjrbmkVar, final tg.rgvfuqvkyq rgvfuqvkyqVar4, final tg.draadjrbmk draadjrbmkVar2, final tg.draadjrbmk draadjrbmkVar3, final tg.draadjrbmk draadjrbmkVar4, final tg.draadjrbmk draadjrbmkVar5, final ef.iobyxmoadg adapterDelegateViewBinding) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        ((yi1.draadjrbmk) adapterDelegateViewBinding.ppxfxbqfkf()).getRoot().dxjokdxxww(new wkgbmnqykc(adapterDelegateViewBinding, rgvfuqvkyqVar, rgvfuqvkyqVar2));
        PurchaseProductView purchaseProductView = ((yi1.draadjrbmk) adapterDelegateViewBinding.ppxfxbqfkf()).f125401zoijcleaow;
        purchaseProductView.setOnClickListener(new View.OnClickListener() { // from class: nj1.gxszxtbevo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                agtfadlqog.vdvldrhtss(adapterDelegateViewBinding, rgvfuqvkyqVar3, view);
            }
        });
        purchaseProductView.setOnProductCardClicked(new tg.iobyxmoadg() { // from class: nj1.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return agtfadlqog.oxmwwwfdhm(adapterDelegateViewBinding, rgvfuqvkyqVar3);
            }
        });
        purchaseProductView.setOnHintClicked(new tg.draadjrbmk() { // from class: nj1.nufgyqmvbu
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return agtfadlqog.kcexrzcfyt(vdvldrhtssVar, adapterDelegateViewBinding, (HintUiModel) obj);
            }
        });
        purchaseProductView.setOnFavoriteClicked(new tg.iobyxmoadg() { // from class: nj1.dxjokdxxww
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return agtfadlqog.zdlpuopuiu(adapterDelegateViewBinding, draadjrbmkVar);
            }
        });
        purchaseProductView.setInputCountListener(new tg.draadjrbmk() { // from class: nj1.btonecajqb
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return agtfadlqog.yggfygwlhe(adapterDelegateViewBinding, rgvfuqvkyqVar4, ((Double) obj).doubleValue());
            }
        });
        purchaseProductView.setIncreaseListener(new tg.iobyxmoadg() { // from class: nj1.gtknphoqwx
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return agtfadlqog.jyumaefscl(adapterDelegateViewBinding, draadjrbmkVar2);
            }
        });
        purchaseProductView.setDecreaseListener(new tg.iobyxmoadg() { // from class: nj1.draadjrbmk
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return agtfadlqog.iwizpuwonk(adapterDelegateViewBinding, draadjrbmkVar3);
            }
        });
        purchaseProductView.setChangeMeasureListener(new tg.iobyxmoadg() { // from class: nj1.wflxmlrfwp
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return agtfadlqog.cqumvgiudr(adapterDelegateViewBinding, draadjrbmkVar4);
            }
        });
        purchaseProductView.setOnBuyButtonClicked(new tg.iobyxmoadg() { // from class: nj1.ppxfxbqfkf
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return agtfadlqog.esjtqupxsv(adapterDelegateViewBinding, draadjrbmkVar5);
            }
        });
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: nj1.wkgbmnqykc
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return agtfadlqog.lereixgezr(adapterDelegateViewBinding, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn oxmwwwfdhm(ef.iobyxmoadg iobyxmoadgVar, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        if (iobyxmoadgVar.getBindingAdapterPosition() != -1 && rgvfuqvkyqVar != null) {
            rgvfuqvkyqVar.invoke(((pj1.iobyxmoadg.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc().iobyxmoadg(), ((pj1.iobyxmoadg.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc().draadjrbmk());
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private static final void pmvmpeiblj(ef.iobyxmoadg iobyxmoadgVar, istkbnxepw istkbnxepwVar, pj1.ppxfxbqfkf ppxfxbqfkfVar) {
        int i13 = iobyxmoadg.f70202iobyxmoadg[istkbnxepwVar.ordinal()];
        if (i13 == 1) {
            ((yi1.draadjrbmk) iobyxmoadgVar.ppxfxbqfkf()).f125394eablkybsjg.setText(ti1.nufgyqmvbu.proloyalty_purchases_list_details_action_bought);
            ((yi1.draadjrbmk) iobyxmoadgVar.ppxfxbqfkf()).f125401zoijcleaow.setAvailable(ppxfxbqfkfVar);
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            ((yi1.draadjrbmk) iobyxmoadgVar.ppxfxbqfkf()).f125394eablkybsjg.setText(ti1.nufgyqmvbu.proloyalty_purchases_list_details_action_buy);
            ((yi1.draadjrbmk) iobyxmoadgVar.ppxfxbqfkf()).f125401zoijcleaow.cdpycssgdh();
        }
    }

    private static final void rgvfuqvkyq(ef.iobyxmoadg iobyxmoadgVar, pj1.zoijcleaow zoijcleaowVar) {
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, pj1.zoijcleaow.iobyxmoadg.f76853iobyxmoadg)) {
            ((yi1.draadjrbmk) iobyxmoadgVar.ppxfxbqfkf()).f125401zoijcleaow.setFavorite(((pj1.iobyxmoadg.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc().yggfygwlhe());
        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar, pj1.zoijcleaow.C1699zoijcleaow.f76855iobyxmoadg)) {
            ((yi1.draadjrbmk) iobyxmoadgVar.ppxfxbqfkf()).f125401zoijcleaow.setProductQuantityAndMeasureType(((pj1.iobyxmoadg.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc());
        } else {
            if (!(zoijcleaowVar instanceof pj1.zoijcleaow.ppxfxbqfkf)) {
                throw new NoWhenBranchMatchedException();
            }
            pmvmpeiblj(iobyxmoadgVar, ((pj1.iobyxmoadg.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).iobyxmoadg(), ((pj1.iobyxmoadg.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void vdvldrhtss(ef.iobyxmoadg iobyxmoadgVar, tg.rgvfuqvkyq rgvfuqvkyqVar, View view) {
        if (iobyxmoadgVar.getBindingAdapterPosition() == -1 || rgvfuqvkyqVar == null) {
            return;
        }
        rgvfuqvkyqVar.invoke(((pj1.iobyxmoadg.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc().iobyxmoadg(), ((pj1.iobyxmoadg.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc().draadjrbmk());
    }

    public static final df.zoijcleaow wflxmlrfwp(final tg.rgvfuqvkyq rgvfuqvkyqVar, final tg.vdvldrhtss vdvldrhtssVar, final tg.draadjrbmk onAddProductToCartClicked, final tg.draadjrbmk draadjrbmkVar, final tg.rgvfuqvkyq onChangeInputQuantity, final tg.draadjrbmk onChangeMeasureType, final tg.draadjrbmk onIncreaseClick, final tg.draadjrbmk onDecreaseClick, final tg.rgvfuqvkyq onRightAction, final tg.rgvfuqvkyq onLeftAction) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onAddProductToCartClicked, "onAddProductToCartClicked");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onChangeInputQuantity, "onChangeInputQuantity");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onChangeMeasureType, "onChangeMeasureType");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onIncreaseClick, "onIncreaseClick");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onDecreaseClick, "onDecreaseClick");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onRightAction, "onRightAction");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onLeftAction, "onLeftAction");
        return new ef.zoijcleaow(new tg.rgvfuqvkyq() { // from class: nj1.zoijcleaow
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return agtfadlqog.agtfadlqog((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new zoijcleaow(), new tg.draadjrbmk() { // from class: nj1.eablkybsjg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return agtfadlqog.ojitshcjhn(onLeftAction, onRightAction, rgvfuqvkyqVar, vdvldrhtssVar, draadjrbmkVar, onChangeInputQuantity, onIncreaseClick, onDecreaseClick, onChangeMeasureType, onAddProductToCartClicked, (ef.iobyxmoadg) obj);
            }
        }, ppxfxbqfkf.f70203zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn yggfygwlhe(ef.iobyxmoadg iobyxmoadgVar, tg.rgvfuqvkyq rgvfuqvkyqVar, double d13) {
        if (iobyxmoadgVar.getBindingAdapterPosition() != -1) {
            rgvfuqvkyqVar.invoke(((pj1.iobyxmoadg.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc().iobyxmoadg(), Double.valueOf(d13));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn zdlpuopuiu(ef.iobyxmoadg iobyxmoadgVar, tg.draadjrbmk draadjrbmkVar) {
        if (iobyxmoadgVar.getBindingAdapterPosition() != -1 && draadjrbmkVar != null) {
            draadjrbmkVar.invoke(((pj1.iobyxmoadg.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc().getId());
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
