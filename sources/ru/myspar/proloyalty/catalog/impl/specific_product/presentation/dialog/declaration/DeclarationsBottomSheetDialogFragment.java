package ru.myspar.proloyalty.catalog.impl.specific_product.presentation.dialog.declaration;

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
import oq0.wkgbmnqykc;
import ru.myspar.proloyalty.catalog.impl.specific_product.presentation.dialog.declaration.DeclarationsBottomSheetDialogFragment;
import ru.myspar.proloyalty.catalog.impl.specific_product.presentation.dialog.declaration.model.DeclarationsDialogArgs;
import ru.myspar.proloyalty.core.base.api.bottomsheet.SimpleComposeBottomSheetDialogFragment;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0010B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lru/myspar/proloyalty/catalog/impl/specific_product/presentation/dialog/declaration/DeclarationsBottomSheetDialogFragment;", "Lru/myspar/proloyalty/core/base/api/bottomsheet/SimpleComposeBottomSheetDialogFragment;", "Lru/myspar/proloyalty/catalog/impl/specific_product/presentation/dialog/declaration/model/DeclarationsDialogArgs;", "Lj21/iobyxmoadg;", "<init>", "()V", "rlfsiqarku", "()Lru/myspar/proloyalty/catalog/impl/specific_product/presentation/dialog/declaration/model/DeclarationsDialogArgs;", CommonUrlParts.MODEL, "Lgg/wwaezpbzkn;", "xrmfcynszj", "(Lru/myspar/proloyalty/catalog/impl/specific_product/presentation/dialog/declaration/model/DeclarationsDialogArgs;Landroidx/compose/runtime/draadjrbmk;I)V", "", "gxszxtbevo", "()Z", "istkbnxepw", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeclarationsBottomSheetDialogFragment extends SimpleComposeBottomSheetDialogFragment<DeclarationsDialogArgs> implements iobyxmoadg {

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: ru.myspar.proloyalty.catalog.impl.specific_product.presentation.dialog.declaration.DeclarationsBottomSheetDialogFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final DeclarationsBottomSheetDialogFragment iobyxmoadg(DeclarationsDialogArgs args) {
            zdlpuopuiu.btonecajqb(args, "args");
            return (DeclarationsBottomSheetDialogFragment) g21.iobyxmoadg.zoijcleaow(new DeclarationsBottomSheetDialogFragment(), args, false, 2, null);
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn metgxyhuhe(DeclarationsBottomSheetDialogFragment declarationsBottomSheetDialogFragment, DeclarationsDialogArgs declarationsDialogArgs, int i13, draadjrbmk draadjrbmkVar, int i14) {
        declarationsBottomSheetDialogFragment.jlmebxxoox(declarationsDialogArgs, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // j21.iobyxmoadg
    public boolean gxszxtbevo() {
        dismiss();
        return true;
    }

    @Override // ru.myspar.proloyalty.core.base.api.bottomsheet.SimpleComposeBottomSheetDialogFragment
    /* JADX INFO: renamed from: rlfsiqarku, reason: merged with bridge method [inline-methods] */
    public DeclarationsDialogArgs jhduphickx() {
        return (DeclarationsDialogArgs) zoijcleaow.wkgbmnqykc(this, cllcsxoeiz.zoijcleaow(DeclarationsDialogArgs.class));
    }

    @Override // ru.myspar.proloyalty.core.base.api.bottomsheet.SimpleComposeBottomSheetDialogFragment
    /* JADX INFO: renamed from: xrmfcynszj, reason: merged with bridge method [inline-methods] */
    public void jlmebxxoox(final DeclarationsDialogArgs model, draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        zdlpuopuiu.btonecajqb(model, "model");
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-49256731);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.lmojexxdyd(model) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i14 & 3) == 2 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-49256731, i14, -1, "ru.myspar.proloyalty.catalog.impl.specific_product.presentation.dialog.declaration.DeclarationsBottomSheetDialogFragment.Render (DeclarationsBottomSheetDialogFragment.kt:19)");
            }
            wkgbmnqykc.gxszxtbevo(null, model, draadjrbmkVarBtonecajqb, (i14 << 3) & 112, 1);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: nq0.iobyxmoadg
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return DeclarationsBottomSheetDialogFragment.metgxyhuhe(this.f70625zdlpuopuiu, model, i13, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
