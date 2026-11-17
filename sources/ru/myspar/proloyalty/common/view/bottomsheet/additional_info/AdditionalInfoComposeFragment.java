package ru.myspar.proloyalty.common.view.bottomsheet.additional_info;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import gg.wwaezpbzkn;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.Metadata;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.view.bottomsheet.additional_info.AdditionalInfoComposeFragment;
import ru.myspar.proloyalty.core.base.api.bottomsheet.SimpleComposeBottomSheetDialogFragment;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lru/myspar/proloyalty/common/view/bottomsheet/additional_info/AdditionalInfoComposeFragment;", "Lru/myspar/proloyalty/core/base/api/bottomsheet/SimpleComposeBottomSheetDialogFragment;", "Lru/myspar/proloyalty/common/view/bottomsheet/additional_info/AdditionalInfoUiModel;", "Lru/myspar/proloyalty/common/view/bottomsheet/additional_info/zoijcleaow;", "style", "<init>", "(Lru/myspar/proloyalty/common/view/bottomsheet/additional_info/zoijcleaow;)V", "uwvvkdfqfp", "()Lru/myspar/proloyalty/common/view/bottomsheet/additional_info/AdditionalInfoUiModel;", CommonUrlParts.MODEL, "Lgg/wwaezpbzkn;", "metgxyhuhe", "(Lru/myspar/proloyalty/common/view/bottomsheet/additional_info/AdditionalInfoUiModel;Landroidx/compose/runtime/draadjrbmk;I)V", "istkbnxepw", "Lru/myspar/proloyalty/common/view/bottomsheet/additional_info/zoijcleaow;", "cdpycssgdh", "iobyxmoadg", "view_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AdditionalInfoComposeFragment extends SimpleComposeBottomSheetDialogFragment<AdditionalInfoUiModel> {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    public static final int f93834yadqdtsiqt = 8;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    private final zoijcleaow style;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.common.view.bottomsheet.additional_info.AdditionalInfoComposeFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final AdditionalInfoComposeFragment iobyxmoadg(AdditionalInfoUiModel args, zoijcleaow style) {
            zdlpuopuiu.btonecajqb(args, "args");
            zdlpuopuiu.btonecajqb(style, "style");
            return (AdditionalInfoComposeFragment) g21.iobyxmoadg.zoijcleaow(new AdditionalInfoComposeFragment(style), args, false, 2, null);
        }

        private Companion() {
        }
    }

    public AdditionalInfoComposeFragment(zoijcleaow style) {
        zdlpuopuiu.btonecajqb(style, "style");
        this.style = style;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn czzsidtyhn(AdditionalInfoComposeFragment additionalInfoComposeFragment, AdditionalInfoUiModel additionalInfoUiModel, int i13, draadjrbmk draadjrbmkVar, int i14) {
        additionalInfoComposeFragment.jlmebxxoox(additionalInfoUiModel, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn rlfsiqarku(AdditionalInfoComposeFragment additionalInfoComposeFragment) {
        additionalInfoComposeFragment.dismiss();
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // ru.myspar.proloyalty.core.base.api.bottomsheet.SimpleComposeBottomSheetDialogFragment
    /* JADX INFO: renamed from: metgxyhuhe, reason: merged with bridge method [inline-methods] */
    public void jlmebxxoox(final AdditionalInfoUiModel model, draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        zdlpuopuiu.btonecajqb(model, "model");
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-223436996);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.lmojexxdyd(model) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? draadjrbmkVarBtonecajqb.ulzqkzuiru(this) : draadjrbmkVarBtonecajqb.lmojexxdyd(this) ? 32 : 16;
        }
        if ((i14 & 19) == 18 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-223436996, i14, -1, "ru.myspar.proloyalty.common.view.bottomsheet.additional_info.AdditionalInfoComposeFragment.Render (AdditionalInfoComposeFragment.kt:16)");
            }
            zoijcleaow zoijcleaowVar = this.style;
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1975960584);
            boolean z13 = (i14 & 112) == 32 || ((i14 & 64) != 0 && draadjrbmkVarBtonecajqb.lmojexxdyd(this));
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z13 || objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new tg.iobyxmoadg() { // from class: cs0.gtknphoqwx
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return AdditionalInfoComposeFragment.rlfsiqarku(this.f25655zdlpuopuiu);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            iobyxmoadg.nufgyqmvbu(model, zoijcleaowVar, (tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVarBtonecajqb, i14 & 14);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: cs0.draadjrbmk
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return AdditionalInfoComposeFragment.czzsidtyhn(this.f25646zdlpuopuiu, model, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // ru.myspar.proloyalty.core.base.api.bottomsheet.SimpleComposeBottomSheetDialogFragment
    /* JADX INFO: renamed from: uwvvkdfqfp, reason: merged with bridge method [inline-methods] */
    public AdditionalInfoUiModel jhduphickx() {
        return (AdditionalInfoUiModel) jr0.zoijcleaow.wkgbmnqykc(this, cllcsxoeiz.zoijcleaow(AdditionalInfoUiModel.class));
    }
}
