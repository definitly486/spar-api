package ru.myspar.proloyalty.main_activity.impl.dialogs_interactor.dialog.purchaserating;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import g21.iobyxmoadg;
import gd1.btonecajqb;
import gg.wwaezpbzkn;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import jr0.zoijcleaow;
import kotlin.Metadata;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.base.api.bottomsheet.SimpleComposeBottomSheetDialogFragment;
import ru.myspar.proloyalty.main_activity.impl.dialogs_interactor.dialog.purchaserating.PurchaseRatingDialogFragment;
import ru.myspar.proloyalty.main_activity.impl.models.PopupTypesUiModel;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000f\u001a\u00020\u00002\u001a\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0004\b\u000f\u0010\u0010R,\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lru/myspar/proloyalty/main_activity/impl/dialogs_interactor/dialog/purchaserating/PurchaseRatingDialogFragment;", "Lru/myspar/proloyalty/core/base/api/bottomsheet/SimpleComposeBottomSheetDialogFragment;", "Lru/myspar/proloyalty/main_activity/impl/models/PopupTypesUiModel$PurchaseRating;", "<init>", "()V", "uwvvkdfqfp", "()Lru/myspar/proloyalty/main_activity/impl/models/PopupTypesUiModel$PurchaseRating;", CommonUrlParts.MODEL, "Lgg/wwaezpbzkn;", "metgxyhuhe", "(Lru/myspar/proloyalty/main_activity/impl/models/PopupTypesUiModel$PurchaseRating;Landroidx/compose/runtime/draadjrbmk;I)V", "Lkotlin/Function2;", "Lk21/ojitshcjhn;", "", "handler", "yfnezrywwk", "(Ltg/rgvfuqvkyq;)Lru/myspar/proloyalty/main_activity/impl/dialogs_interactor/dialog/purchaserating/PurchaseRatingDialogFragment;", "istkbnxepw", "Ltg/rgvfuqvkyq;", "navLinkHandler", "cdpycssgdh", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PurchaseRatingDialogFragment extends SimpleComposeBottomSheetDialogFragment<PopupTypesUiModel.PurchaseRating> {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    public static final int f97826yadqdtsiqt = 8;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    private rgvfuqvkyq navLinkHandler;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.main_activity.impl.dialogs_interactor.dialog.purchaserating.PurchaseRatingDialogFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final PurchaseRatingDialogFragment iobyxmoadg(PopupTypesUiModel.PurchaseRating args) {
            zdlpuopuiu.btonecajqb(args, "args");
            return (PurchaseRatingDialogFragment) iobyxmoadg.zoijcleaow(new PurchaseRatingDialogFragment(), args, false, 2, null);
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn czzsidtyhn(PurchaseRatingDialogFragment purchaseRatingDialogFragment, PopupTypesUiModel.PurchaseRating purchaseRating, int i13, draadjrbmk draadjrbmkVar, int i14) {
        purchaseRatingDialogFragment.jlmebxxoox(purchaseRating, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn rlfsiqarku(PurchaseRatingDialogFragment purchaseRatingDialogFragment, PopupTypesUiModel.PurchaseRating purchaseRating) {
        rgvfuqvkyq rgvfuqvkyqVar = purchaseRatingDialogFragment.navLinkHandler;
        if (rgvfuqvkyqVar != null) {
            rgvfuqvkyqVar.invoke(purchaseRating.getNavLink(), purchaseRating.getReference());
        }
        purchaseRatingDialogFragment.dismiss();
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // ru.myspar.proloyalty.core.base.api.bottomsheet.SimpleComposeBottomSheetDialogFragment
    /* JADX INFO: renamed from: metgxyhuhe, reason: merged with bridge method [inline-methods] */
    public void jlmebxxoox(final PopupTypesUiModel.PurchaseRating model, draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        zdlpuopuiu.btonecajqb(model, "model");
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(866910610);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(model) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(this) ? 32 : 16;
        }
        if ((i14 & 19) == 18 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(866910610, i14, -1, "ru.myspar.proloyalty.main_activity.impl.dialogs_interactor.dialog.purchaserating.PurchaseRatingDialogFragment.Render (PurchaseRatingDialogFragment.kt:16)");
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(-135729700);
            boolean zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(this) | ((i14 & 14) == 4);
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd || objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new tg.iobyxmoadg() { // from class: gd1.zoijcleaow
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return PurchaseRatingDialogFragment.rlfsiqarku(this.f36885zdlpuopuiu, model);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            btonecajqb.wflxmlrfwp(null, model, (tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVarBtonecajqb, (i14 << 3) & 112, 1);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: gd1.ppxfxbqfkf
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return PurchaseRatingDialogFragment.czzsidtyhn(this.f36883zdlpuopuiu, model, i13, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // ru.myspar.proloyalty.core.base.api.bottomsheet.SimpleComposeBottomSheetDialogFragment
    /* JADX INFO: renamed from: uwvvkdfqfp, reason: merged with bridge method [inline-methods] */
    public PopupTypesUiModel.PurchaseRating jhduphickx() {
        return (PopupTypesUiModel.PurchaseRating) zoijcleaow.wkgbmnqykc(this, cllcsxoeiz.zoijcleaow(PopupTypesUiModel.PurchaseRating.class));
    }

    public final PurchaseRatingDialogFragment yfnezrywwk(rgvfuqvkyq handler) {
        zdlpuopuiu.btonecajqb(handler, "handler");
        this.navLinkHandler = handler;
        return this;
    }
}
