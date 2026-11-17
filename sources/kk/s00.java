package kk;

import android.os.Bundle;
import java.util.List;
import modern.payments.ecomAndroid.presentation.fragment.EcomLoadingFragment;
import npi.spay.C7;
import npi.spay.Cj;
import npi.spay.Da;
import npi.spay.Hc;
import npi.spay.Hi;
import npi.spay.I0;
import npi.spay.Lj;
import npi.spay.Nb;
import npi.spay.Nf;
import npi.spay.Rc;
import npi.spay.To;
import npi.spay.Yr;
import spay.sdk.R;
import spay.sdk.domain.model.BiometricSuggestionModel;
import spay.sdk.domain.model.PayStrategy;
import spay.sdk.domain.model.response.ErrorEntity;

/* JADX INFO: loaded from: classes3.dex */
public final class s00 extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ npi.spay.uo f58489zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s00(npi.spay.uo uoVar) {
        super(1);
        this.f58489zdlpuopuiu = uoVar;
    }

    @Override // tg.draadjrbmk
    public final Object invoke(Object obj) {
        nr nrVar = ((qd0) obj).f58179iobyxmoadg;
        if (nrVar instanceof g7) {
            npi.spay.uo uoVar = this.f58489zdlpuopuiu;
            int i13 = npi.spay.uo.f70585cdpycssgdh;
            uoVar.getClass();
            uoVar.wypolnanlu(new Rc(), "NoInternetFragment");
        } else if (nrVar instanceof ub) {
            npi.spay.uo uoVar2 = this.f58489zdlpuopuiu;
            ub ubVar = (ub) nrVar;
            int i14 = npi.spay.uo.f70585cdpycssgdh;
            uoVar2.getClass();
            if (ubVar.f58810zoijcleaow) {
                uoVar2.wypolnanlu(new Hc(), "NoCardFragment");
            } else {
                gl glVar = ubVar.f58809iobyxmoadg;
                if (glVar instanceof bj) {
                    uoVar2.wypolnanlu(new npi.spay.x1(), "BnplOrderFragment");
                } else if (glVar instanceof xh) {
                    uoVar2.wypolnanlu(new I0(), "BnplAgreementFragment");
                } else {
                    uoVar2.wypolnanlu(new Nf(), "OrderFragment");
                }
            }
        } else if (nrVar instanceof sa) {
            npi.spay.uo uoVar3 = this.f58489zdlpuopuiu;
            int i15 = npi.spay.uo.f70585cdpycssgdh;
            uoVar3.getClass();
            uoVar3.wypolnanlu(new npi.spay.i2(), "BnplPartsOrderFragment");
        } else if (nrVar instanceof zd) {
            npi.spay.uo uoVar4 = this.f58489zdlpuopuiu;
            kc kcVar = ((zd) nrVar).f59568iobyxmoadg;
            int i16 = npi.spay.uo.f70585cdpycssgdh;
            uoVar4.getClass();
            if (kcVar instanceof z8) {
                ErrorEntity errorEntity = ((z8) kcVar).f59540iobyxmoadg;
                if (errorEntity instanceof ErrorEntity.NoBnplResponse) {
                    int i17 = R.string.spay_bnpl_disabled_for_user_exception_title;
                    int i18 = R.string.spay_bnpl_disabled_for_user_exception_subtitle;
                    npi.spay.e6 e6Var = new npi.spay.e6();
                    Bundle bundle = new Bundle();
                    bundle.putInt("title", i17);
                    bundle.putInt("subTitle", i18);
                    e6Var.setArguments(bundle);
                    uoVar4.wypolnanlu(e6Var, "FailurePaymentFragment");
                } else if (errorEntity instanceof ErrorEntity.PayBnplPartsFail) {
                    int i19 = R.string.spay_bnpl_disabled_for_user_exception_title;
                    int i23 = R.string.spay_bnpl_disabled_for_user_exception_subtitle;
                    npi.spay.e6 e6Var2 = new npi.spay.e6();
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("title", i19);
                    bundle2.putInt("subTitle", i23);
                    e6Var2.setArguments(bundle2);
                    uoVar4.wypolnanlu(e6Var2, "FailurePaymentFragment");
                } else if ((errorEntity instanceof ErrorEntity.NotEnoughMoneyForBnplFirstPayment) && (((auzgnhcxok) ((dvvnrvtcbc) uoVar4.hcddaimhww()).f56063zoijcleaow).btonecajqb() instanceof PayStrategy.PayWithPartsOnly)) {
                    int i24 = R.string.spay_not_enough_money_for_bnpl_first_payment_title;
                    int i25 = R.string.spay_not_enough_money_for_bnpl_first_payment_subtitle;
                    npi.spay.e6 e6Var3 = new npi.spay.e6();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt("title", i24);
                    bundle3.putInt("subTitle", i25);
                    e6Var3.setArguments(bundle3);
                    uoVar4.wypolnanlu(e6Var3, "FailurePaymentFragment");
                } else {
                    int i26 = R.string.spay_default_client_exception_message_error_title_text;
                    int i27 = R.string.spay_default_client_exception_message_error_subtitle_text;
                    npi.spay.e6 e6Var4 = new npi.spay.e6();
                    Bundle bundle4 = new Bundle();
                    bundle4.putInt("title", i26);
                    bundle4.putInt("subTitle", i27);
                    e6Var4.setArguments(bundle4);
                    uoVar4.wypolnanlu(e6Var4, "FailurePaymentFragment");
                }
            } else if (kcVar instanceof fa) {
                uoVar4.wypolnanlu(new Lj(), "ProcessingPaymentFragment");
            } else if (kcVar instanceof ib) {
                uoVar4.wypolnanlu(new npi.spay.tr(), "SuccessPaymentFragment");
            }
        } else if (nrVar instanceof ao) {
            npi.spay.uo uoVar5 = this.f58489zdlpuopuiu;
            int i28 = npi.spay.uo.f70585cdpycssgdh;
            uoVar5.getClass();
            uoVar5.wypolnanlu(new Da(), EcomLoadingFragment.TAG);
        } else if (nrVar instanceof fp) {
            npi.spay.uo uoVar6 = this.f58489zdlpuopuiu;
            int i29 = npi.spay.uo.f70585cdpycssgdh;
            uoVar6.getClass();
            uoVar6.wypolnanlu(new npi.spay.dl(), "RetryWithoutBnplFragment");
        } else if (nrVar instanceof wc) {
            npi.spay.uo uoVar7 = this.f58489zdlpuopuiu;
            int i33 = npi.spay.uo.f70585cdpycssgdh;
            uoVar7.getClass();
            uoVar7.wypolnanlu(new npi.spay.w3(), "CardSelectionFragment");
        } else if (nrVar instanceof t2) {
            npi.spay.uo uoVar8 = this.f58489zdlpuopuiu;
            int i34 = npi.spay.uo.f70585cdpycssgdh;
            uoVar8.getClass();
            uoVar8.wypolnanlu(new npi.spay.p6(), "FakeBankFragment");
        } else if (nrVar instanceof ul) {
            npi.spay.uo uoVar9 = this.f58489zdlpuopuiu;
            BiometricSuggestionModel biometricSuggestionModel = ((ul) nrVar).f58866iobyxmoadg;
            int i35 = npi.spay.uo.f70585cdpycssgdh;
            uoVar9.ntlheqmsrt(biometricSuggestionModel);
        } else if (nrVar instanceof wm) {
            npi.spay.uo uoVar10 = this.f58489zdlpuopuiu;
            List list = ((wm) nrVar).f59183iobyxmoadg;
            int i36 = npi.spay.uo.f70585cdpycssgdh;
            uoVar10.getClass();
            pj.gtknphoqwx.wkgbmnqykc(androidx.lifecycle.oxmwwwfdhm.iobyxmoadg(uoVar10), null, null, new bb0(uoVar10, list, null), 3, null);
        } else if (nrVar instanceof i8) {
            npi.spay.uo uoVar11 = this.f58489zdlpuopuiu;
            int i37 = npi.spay.uo.f70585cdpycssgdh;
            uoVar11.getClass();
            uoVar11.wypolnanlu(new npi.spay.ke(), "OneTimePasswordFragment");
        } else if (nrVar instanceof l9) {
            npi.spay.uo uoVar12 = this.f58489zdlpuopuiu;
            int i38 = npi.spay.uo.f70585cdpycssgdh;
            uoVar12.getClass();
            uoVar12.wypolnanlu(new npi.spay.ud(), "OTPErrorFragment");
        } else if (nrVar instanceof jq) {
            npi.spay.uo uoVar13 = this.f58489zdlpuopuiu;
            int i39 = npi.spay.uo.f70585cdpycssgdh;
            uoVar13.getClass();
            uoVar13.wypolnanlu(new Yr(), "UserProfileFragment");
        } else if (nrVar instanceof pj) {
            npi.spay.uo uoVar14 = this.f58489zdlpuopuiu;
            int i43 = npi.spay.uo.f70585cdpycssgdh;
            uoVar14.getClass();
            uoVar14.wypolnanlu(new To(), "SdkVersionDeprecatedFragment");
        } else if (nrVar instanceof y3) {
            npi.spay.uo uoVar15 = this.f58489zdlpuopuiu;
            int i44 = npi.spay.uo.f70585cdpycssgdh;
            uoVar15.getClass();
            uoVar15.wypolnanlu(new C7(), "FraudMonReviewFragment");
        } else if (nrVar instanceof a5) {
            npi.spay.uo uoVar16 = this.f58489zdlpuopuiu;
            wj wjVar = ((a5) nrVar).f55774iobyxmoadg;
            int i45 = npi.spay.uo.f70585cdpycssgdh;
            uoVar16.getClass();
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wjVar, jf.f57187iobyxmoadg) || (wjVar instanceof ng)) {
                uoVar16.wypolnanlu(new npi.spay.kd(), "NoMatchingCardsFragment");
            } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wjVar, ph.f58085iobyxmoadg)) {
                uoVar16.wypolnanlu(new Hc(), "NoCardFragment");
            } else if (wjVar instanceof ti) {
                uoVar16.wypolnanlu(new Nb(), "HelpersFragment");
            }
        } else if (nrVar instanceof eg) {
            npi.spay.uo uoVar17 = this.f58489zdlpuopuiu;
            int i46 = npi.spay.uo.f70585cdpycssgdh;
            uoVar17.getClass();
            uoVar17.wypolnanlu(new Hi(), "PayBonusesErrorFragment");
        } else if (nrVar instanceof cf) {
            npi.spay.uo uoVar18 = this.f58489zdlpuopuiu;
            String subtitle = ((cf) nrVar).f56149iobyxmoadg;
            int i47 = npi.spay.uo.f70585cdpycssgdh;
            uoVar18.getClass();
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subtitle, "subtitle");
            npi.spay.oi oiVar = new npi.spay.oi();
            Bundle bundle5 = new Bundle();
            bundle5.putString("subTitle", subtitle);
            oiVar.setArguments(bundle5);
            uoVar18.wypolnanlu(oiVar, "PayBindingErrorFragment");
        } else if (nrVar instanceof s1) {
            npi.spay.uo uoVar19 = this.f58489zdlpuopuiu;
            String str = ((s1) nrVar).f58490iobyxmoadg;
            int i48 = npi.spay.uo.f70585cdpycssgdh;
            uoVar19.getClass();
            int i49 = R.string.spay_no_payment_accounts_exception_title;
            npi.spay.e6 e6Var5 = new npi.spay.e6();
            Bundle bundle6 = new Bundle();
            bundle6.putInt("title", i49);
            bundle6.putString("subTitleMsg", str);
            e6Var5.setArguments(bundle6);
            uoVar19.wypolnanlu(e6Var5, "FailurePaymentFragment");
        } else if (nrVar instanceof ih) {
            npi.spay.uo uoVar20 = this.f58489zdlpuopuiu;
            int i53 = npi.spay.uo.f70585cdpycssgdh;
            uoVar20.getClass();
            uoVar20.wypolnanlu(new Cj(), "PhoneNumberFragment");
        } else if (nrVar instanceof li) {
            npi.spay.uo uoVar21 = this.f58489zdlpuopuiu;
            int i54 = npi.spay.uo.f70585cdpycssgdh;
            uoVar21.getClass();
            uoVar21.wypolnanlu(new npi.spay.rj(), "PhoneNumberAuthViaWebViewFragment");
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
