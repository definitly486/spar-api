package ru.myspar.proloyalty.loyalty_program.impl.presentation.categories_detail.bottomsheet;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import gg.wwaezpbzkn;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import j21.iobyxmoadg;
import jr0.zoijcleaow;
import kotlin.Metadata;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.base.api.bottomsheet.SimpleComposeBottomSheetDialogFragment;
import ru.myspar.proloyalty.loyalty_program.impl.presentation.categories_detail.bottomsheet.CategoriesInfoBottomSheetFragment;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0010B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lru/myspar/proloyalty/loyalty_program/impl/presentation/categories_detail/bottomsheet/CategoriesInfoBottomSheetFragment;", "Lru/myspar/proloyalty/core/base/api/bottomsheet/SimpleComposeBottomSheetDialogFragment;", "Lru/myspar/proloyalty/loyalty_program/impl/presentation/categories_detail/bottomsheet/CategoriesSheetArgs;", "Lj21/iobyxmoadg;", "<init>", "()V", "uwvvkdfqfp", "()Lru/myspar/proloyalty/loyalty_program/impl/presentation/categories_detail/bottomsheet/CategoriesSheetArgs;", CommonUrlParts.MODEL, "Lgg/wwaezpbzkn;", "metgxyhuhe", "(Lru/myspar/proloyalty/loyalty_program/impl/presentation/categories_detail/bottomsheet/CategoriesSheetArgs;Landroidx/compose/runtime/draadjrbmk;I)V", "", "gxszxtbevo", "()Z", "istkbnxepw", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CategoriesInfoBottomSheetFragment extends SimpleComposeBottomSheetDialogFragment<CategoriesSheetArgs> implements iobyxmoadg {

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: ru.myspar.proloyalty.loyalty_program.impl.presentation.categories_detail.bottomsheet.CategoriesInfoBottomSheetFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final CategoriesInfoBottomSheetFragment iobyxmoadg(CategoriesSheetArgs args) {
            zdlpuopuiu.btonecajqb(args, "args");
            return (CategoriesInfoBottomSheetFragment) g21.iobyxmoadg.zoijcleaow(new CategoriesInfoBottomSheetFragment(), args, false, 2, null);
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn czzsidtyhn(CategoriesInfoBottomSheetFragment categoriesInfoBottomSheetFragment, CategoriesSheetArgs categoriesSheetArgs, int i13, draadjrbmk draadjrbmkVar, int i14) {
        categoriesInfoBottomSheetFragment.jlmebxxoox(categoriesSheetArgs, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn rlfsiqarku(CategoriesInfoBottomSheetFragment categoriesInfoBottomSheetFragment) {
        categoriesInfoBottomSheetFragment.dismiss();
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // j21.iobyxmoadg
    public boolean gxszxtbevo() {
        dismiss();
        return true;
    }

    @Override // ru.myspar.proloyalty.core.base.api.bottomsheet.SimpleComposeBottomSheetDialogFragment
    /* JADX INFO: renamed from: metgxyhuhe, reason: merged with bridge method [inline-methods] */
    public void jlmebxxoox(final CategoriesSheetArgs model, draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        zdlpuopuiu.btonecajqb(model, "model");
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(497096461);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(model) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(this) ? 32 : 16;
        }
        if ((i14 & 19) == 18 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(497096461, i14, -1, "ru.myspar.proloyalty.loyalty_program.impl.presentation.categories_detail.bottomsheet.CategoriesInfoBottomSheetFragment.Render (CategoriesInfoBottomSheetFragment.kt:18)");
            }
            String imageUrl = model.getImageUrl();
            String name = model.getName();
            String description = model.getDescription();
            draadjrbmkVarBtonecajqb.sopmlzcsov(665916480);
            boolean z13 = (i14 & 112) == 32;
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z13 || objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new tg.iobyxmoadg() { // from class: pc1.iobyxmoadg
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return CategoriesInfoBottomSheetFragment.rlfsiqarku(this.f76392zdlpuopuiu);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            qc1.draadjrbmk.zoijcleaow(name, description, imageUrl, (tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVarBtonecajqb, 0);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: pc1.zoijcleaow
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return CategoriesInfoBottomSheetFragment.czzsidtyhn(this.f76395zdlpuopuiu, model, i13, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // ru.myspar.proloyalty.core.base.api.bottomsheet.SimpleComposeBottomSheetDialogFragment
    /* JADX INFO: renamed from: uwvvkdfqfp, reason: merged with bridge method [inline-methods] */
    public CategoriesSheetArgs jhduphickx() {
        return (CategoriesSheetArgs) zoijcleaow.wkgbmnqykc(this, cllcsxoeiz.zoijcleaow(CategoriesSheetArgs.class));
    }
}
