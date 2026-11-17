package ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set_counter;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.stevsuqkhv;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.dxjokdxxww;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.ribwqtqdhb;
import gg.gtknphoqwx;
import gg.ojitshcjhn;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.istkbnxepw;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.yadqdtsiqt;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.products_from_banner.impl.domain.product_set_counter.args.ProductSetCounterArgs;
import ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set_counter.ProductSetCounterDialogFragment;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 *2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001+B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\u00020\u00002\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010 \u001a\u00020\u001b8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R$\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lru/myspar/proloyalty/products_from_banner/impl/presentation/product_set_counter/ProductSetCounterDialogFragment;", "Lru/myspar/proloyalty/core/base/mvi/bottomsheet/BaseMviBottomSheetDialogFragment;", "Ldi1/gxszxtbevo;", "Lru/myspar/proloyalty/products_from_banner/impl/presentation/product_set_counter/ppxfxbqfkf;", "Lru/myspar/proloyalty/products_from_banner/impl/presentation/product_set_counter/wkgbmnqykc;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "uiLabel", "Lgg/wwaezpbzkn;", "zfvoamnweg", "(Lru/myspar/proloyalty/products_from_banner/impl/presentation/product_set_counter/wkgbmnqykc;)V", "Lkotlin/Function1;", "", "action", "bfopjjpdmp", "(Ltg/draadjrbmk;)Lru/myspar/proloyalty/products_from_banner/impl/presentation/product_set_counter/ProductSetCounterDialogFragment;", "Lru/myspar/proloyalty/products_from_banner/impl/presentation/product_set_counter/zoijcleaow;", "yadqdtsiqt", "Lgg/gtknphoqwx;", "yfnezrywwk", "()Lru/myspar/proloyalty/products_from_banner/impl/presentation/product_set_counter/zoijcleaow;", "binder", "Lru/myspar/proloyalty/products_from_banner/impl/presentation/product_set_counter/eablkybsjg;", "iozdgvuglv", "Ltr0/ppxfxbqfkf;", "sflfametgt", "()Lru/myspar/proloyalty/products_from_banner/impl/presentation/product_set_counter/eablkybsjg;", "viewImpl", "Lvh1/zoijcleaow;", "lmojexxdyd", "Lsr0/ppxfxbqfkf;", "ydmasvzmpa", "()Lvh1/zoijcleaow;", "binding", "wwaezpbzkn", "Ltg/draadjrbmk;", "onChangeProductSetCountListener", "ylkuphrtab", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProductSetCounterDialogFragment extends iobyxmoadg {

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata */
    private final tr0.ppxfxbqfkf viewImpl;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata */
    private final sr0.ppxfxbqfkf binding;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata */
    private draadjrbmk onChangeProductSetCountListener;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx binder;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f99375pkzmftpjix = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(ProductSetCounterDialogFragment.class, "viewImpl", "getViewImpl()Lru/myspar/proloyalty/products_from_banner/impl/presentation/product_set_counter/ProductSetCounterViewImpl;", 0)), cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(ProductSetCounterDialogFragment.class, "binding", "getBinding()Lru/myspar/proloyalty/products_from_banner/impl/databinding/ProductsSetCounterFragmentProloyaltyBinding;", 0))};

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    public static final int f99374hcddaimhww = 8;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f99381zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f99381zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f99381zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f99382yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f99383zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f99383zdlpuopuiu = iobyxmoadgVar;
            this.f99382yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f99383zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f99382yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set_counter.ProductSetCounterDialogFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final ProductSetCounterDialogFragment iobyxmoadg(ProductSetCounterArgs args) {
            zdlpuopuiu.btonecajqb(args, "args");
            ProductSetCounterDialogFragment productSetCounterDialogFragment = (ProductSetCounterDialogFragment) g21.iobyxmoadg.zoijcleaow(new ProductSetCounterDialogFragment(), args, false, 2, null);
            productSetCounterDialogFragment.setCancelable(true);
            return productSetCounterDialogFragment;
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f99384yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f99385zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Fragment fragment, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f99385zdlpuopuiu = fragment;
            this.f99384yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f99384yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f99385zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f99386zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Fragment fragment) {
            super(0);
            this.f99386zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f99386zdlpuopuiu;
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f99387zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f99387zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f99387zdlpuopuiu.invoke();
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f99388zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1, vh1.zoijcleaow.class, "bind", "bind(Landroid/view/View;)Lru/myspar/proloyalty/products_from_banner/impl/databinding/ProductsSetCounterFragmentProloyaltyBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final vh1.zoijcleaow invoke(View p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return vh1.zoijcleaow.iobyxmoadg(p13);
        }
    }

    public ProductSetCounterDialogFragment() {
        super(qh1.wkgbmnqykc.products_set_counter_fragment_proloyalty);
        gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new wkgbmnqykc(new ppxfxbqfkf(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set_counter.zoijcleaow.class), new eablkybsjg(gtknphoqwxVarIobyxmoadg), new gxszxtbevo(null, gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(this, gtknphoqwxVarIobyxmoadg));
        this.viewImpl = tr0.wkgbmnqykc.iobyxmoadg(this, new tg.iobyxmoadg() { // from class: di1.ppxfxbqfkf
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ProductSetCounterDialogFragment.opjhrmiecq(this.f29011zdlpuopuiu);
            }
        });
        this.binding = sr0.iobyxmoadg.ppxfxbqfkf(this, zoijcleaow.f99388zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void oipsdeybqn(com.google.android.material.bottomsheet.ppxfxbqfkf ppxfxbqfkfVar, DialogInterface dialogInterface) {
        View viewFindViewById = ppxfxbqfkfVar.findViewById(da.gxszxtbevo.design_bottom_sheet);
        if (viewFindViewById != null) {
            viewFindViewById.setBackgroundResource(b31.gxszxtbevo.bottom_sheet_background);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set_counter.eablkybsjg opjhrmiecq(ProductSetCounterDialogFragment productSetCounterDialogFragment) {
        return new ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set_counter.eablkybsjg(new istkbnxepw(productSetCounterDialogFragment) { // from class: ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set_counter.ProductSetCounterDialogFragment.nufgyqmvbu
            @Override // ah.draadjrbmk
            public Object get() {
                return ((ProductSetCounterDialogFragment) this.receiver).ydmasvzmpa();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final vh1.zoijcleaow ydmasvzmpa() {
        return (vh1.zoijcleaow) this.binding.iobyxmoadg(this, f99375pkzmftpjix[1]);
    }

    public final ProductSetCounterDialogFragment bfopjjpdmp(draadjrbmk action) {
        zdlpuopuiu.btonecajqb(action, "action");
        this.onChangeProductSetCountListener = action;
        return this;
    }

    @Override // ru.myspar.proloyalty.core.base.api.bottomsheet.FixedBottomSheetFragment, com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        zdlpuopuiu.nufgyqmvbu(dialogOnCreateDialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        final com.google.android.material.bottomsheet.ppxfxbqfkf ppxfxbqfkfVar = (com.google.android.material.bottomsheet.ppxfxbqfkf) dialogOnCreateDialog;
        ppxfxbqfkfVar.setOnShowListener(new DialogInterface.OnShowListener() { // from class: di1.wkgbmnqykc
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                ProductSetCounterDialogFragment.oipsdeybqn(ppxfxbqfkfVar, dialogInterface);
            }
        });
        return ppxfxbqfkfVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment
    /* JADX INFO: renamed from: sflfametgt, reason: merged with bridge method [inline-methods] */
    public ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set_counter.eablkybsjg vipkmwdibw() {
        return (ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set_counter.eablkybsjg) this.viewImpl.iobyxmoadg(this, f99375pkzmftpjix[0]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment
    /* JADX INFO: renamed from: yfnezrywwk, reason: merged with bridge method [inline-methods] */
    public ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set_counter.zoijcleaow ribwqtqdhb() {
        return (ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set_counter.zoijcleaow) this.binder.getValue();
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment
    /* JADX INFO: renamed from: zfvoamnweg, reason: merged with bridge method [inline-methods] */
    public void jhduphickx(ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set_counter.wkgbmnqykc uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (!(uiLabel instanceof ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set_counter.wkgbmnqykc.iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        draadjrbmk draadjrbmkVar = this.onChangeProductSetCountListener;
        if (draadjrbmkVar != null) {
            draadjrbmkVar.invoke(Integer.valueOf(((ru.myspar.proloyalty.products_from_banner.impl.presentation.product_set_counter.wkgbmnqykc.iobyxmoadg) uiLabel).iobyxmoadg()));
        }
        dismiss();
    }
}
