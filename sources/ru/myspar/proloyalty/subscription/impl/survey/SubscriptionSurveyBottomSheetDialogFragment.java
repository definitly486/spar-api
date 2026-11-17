package ru.myspar.proloyalty.subscription.impl.survey;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import com.google.android.gms.common.internal.ImagesContract;
import gg.wwaezpbzkn;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.Metadata;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.subscription.api.model.SubscriptionSurveyDialogArgs;
import tg.rgvfuqvkyq;
import uu1.lqeggnwhkg;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001cB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lru/myspar/proloyalty/subscription/impl/survey/SubscriptionSurveyBottomSheetDialogFragment;", "Lru/myspar/proloyalty/core/base/api/bottomsheet/SimpleComposeBottomSheetDialogFragment;", "Lru/myspar/proloyalty/subscription/api/model/SubscriptionSurveyDialogArgs;", "Lj21/iobyxmoadg;", "<init>", "()V", "", ImagesContract.URL, "Lgg/wwaezpbzkn;", "opjhrmiecq", "(Ljava/lang/String;)V", "oipsdeybqn", "()Lru/myspar/proloyalty/subscription/api/model/SubscriptionSurveyDialogArgs;", CommonUrlParts.MODEL, "yfnezrywwk", "(Lru/myspar/proloyalty/subscription/api/model/SubscriptionSurveyDialogArgs;Landroidx/compose/runtime/draadjrbmk;I)V", "", "gxszxtbevo", "()Z", "Lvw1/iobyxmoadg;", "wwaezpbzkn", "Lvw1/iobyxmoadg;", "bfopjjpdmp", "()Lvw1/iobyxmoadg;", "setWebViewScreenFeatureApi", "(Lvw1/iobyxmoadg;)V", "webViewScreenFeatureApi", "ylkuphrtab", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SubscriptionSurveyBottomSheetDialogFragment extends Hilt_SubscriptionSurveyBottomSheetDialogFragment<SubscriptionSurveyDialogArgs> implements j21.iobyxmoadg {

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata */
    public vw1.iobyxmoadg webViewScreenFeatureApi;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    public static final int f101792pkzmftpjix = 8;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.subscription.impl.survey.SubscriptionSurveyBottomSheetDialogFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final SubscriptionSurveyBottomSheetDialogFragment iobyxmoadg(SubscriptionSurveyDialogArgs args) {
            zdlpuopuiu.btonecajqb(args, "args");
            return (SubscriptionSurveyBottomSheetDialogFragment) g21.iobyxmoadg.zoijcleaow(new SubscriptionSurveyBottomSheetDialogFragment(), args, false, 2, null);
        }

        private Companion() {
        }
    }

    private final void opjhrmiecq(String url) {
        i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(vw1.iobyxmoadg.nufgyqmvbu(bfopjjpdmp(), url, null, ww1.iobyxmoadg.SURVEY, null, 8, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn sflfametgt(SubscriptionSurveyBottomSheetDialogFragment subscriptionSurveyBottomSheetDialogFragment) {
        subscriptionSurveyBottomSheetDialogFragment.dismiss();
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ydmasvzmpa(SubscriptionSurveyBottomSheetDialogFragment subscriptionSurveyBottomSheetDialogFragment, SubscriptionSurveyDialogArgs subscriptionSurveyDialogArgs) {
        subscriptionSurveyBottomSheetDialogFragment.opjhrmiecq(subscriptionSurveyDialogArgs.getSurveyUrl());
        subscriptionSurveyBottomSheetDialogFragment.dismiss();
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn zfvoamnweg(SubscriptionSurveyBottomSheetDialogFragment subscriptionSurveyBottomSheetDialogFragment, SubscriptionSurveyDialogArgs subscriptionSurveyDialogArgs, int i13, draadjrbmk draadjrbmkVar, int i14) {
        subscriptionSurveyBottomSheetDialogFragment.jlmebxxoox(subscriptionSurveyDialogArgs, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final vw1.iobyxmoadg bfopjjpdmp() {
        vw1.iobyxmoadg iobyxmoadgVar = this.webViewScreenFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("webViewScreenFeatureApi");
        return null;
    }

    @Override // j21.iobyxmoadg
    public boolean gxszxtbevo() {
        dismiss();
        return true;
    }

    @Override // ru.myspar.proloyalty.core.base.api.bottomsheet.SimpleComposeBottomSheetDialogFragment
    /* JADX INFO: renamed from: oipsdeybqn, reason: merged with bridge method [inline-methods] */
    public SubscriptionSurveyDialogArgs jhduphickx() {
        return (SubscriptionSurveyDialogArgs) jr0.zoijcleaow.wkgbmnqykc(this, cllcsxoeiz.zoijcleaow(SubscriptionSurveyDialogArgs.class));
    }

    @Override // ru.myspar.proloyalty.core.base.api.bottomsheet.SimpleComposeBottomSheetDialogFragment
    /* JADX INFO: renamed from: yfnezrywwk, reason: merged with bridge method [inline-methods] */
    public void jlmebxxoox(final SubscriptionSurveyDialogArgs model, draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        zdlpuopuiu.btonecajqb(model, "model");
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1574633781);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.lmojexxdyd(model) ? 4 : 2) | i13;
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
                jyumaefscl.ntlheqmsrt(1574633781, i14, -1, "ru.myspar.proloyalty.subscription.impl.survey.SubscriptionSurveyBottomSheetDialogFragment.Render (SubscriptionSurveyBottomSheetDialogFragment.kt:28)");
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(1047144431);
            boolean zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(this) | draadjrbmkVarBtonecajqb.lmojexxdyd(model);
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd || objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new tg.iobyxmoadg() { // from class: ru.myspar.proloyalty.subscription.impl.survey.iobyxmoadg
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return SubscriptionSurveyBottomSheetDialogFragment.ydmasvzmpa(this.f101796zdlpuopuiu, model);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            tg.iobyxmoadg iobyxmoadgVar = (tg.iobyxmoadg) objYadqdtsiqt;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.sopmlzcsov(1047148071);
            boolean zLmojexxdyd2 = draadjrbmkVarBtonecajqb.lmojexxdyd(this);
            Object objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd2 || objYadqdtsiqt2 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: ru.myspar.proloyalty.subscription.impl.survey.zoijcleaow
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return SubscriptionSurveyBottomSheetDialogFragment.sflfametgt(this.f101800zdlpuopuiu);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            lqeggnwhkg.vdvldrhtss(null, iobyxmoadgVar, (tg.iobyxmoadg) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, 0, 1);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: ru.myspar.proloyalty.subscription.impl.survey.ppxfxbqfkf
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return SubscriptionSurveyBottomSheetDialogFragment.zfvoamnweg(this.f101799zdlpuopuiu, model, i13, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
