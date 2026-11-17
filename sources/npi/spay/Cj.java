package npi.spay;

import a6.iobyxmoadg;
import a6.zoijcleaow;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.gtknphoqwx;
import androidx.lifecycle.oxmwwwfdhm;
import com.google.android.material.button.MaterialButton;
import kk.auzgnhcxok;
import kk.d;
import kk.ec0;
import kk.g0;
import kk.i1;
import kk.r80;
import kk.sopmlzcsov;
import kk.v80;
import kk.ve;
import kk.xg0;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import npi.spay.Cj;
import sj.dxjokdxxww;
import sj.kegysxyocb;
import sj.lqeggnwhkg;
import spay.sdk.R;
import spay.sdk.domain.model.MerchantData;
import spay.sdk.domain.model.PayStrategy;
import spay.sdk.view.PhoneNumberCompositeView;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnpi/spay/Cj;", "Lnpi/spay/S;", "Lkk/i1;", "Lkk/v80;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Cj extends S<i1, v80> {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final /* synthetic */ int f70540iwizpuwonk = 0;

    public static final void hcddaimhww(Cj this$0, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        ((ve) ((i1) this$0.yadqdtsiqt()).f58736ppxfxbqfkf).zoijcleaow(ec0.f56401iobyxmoadg);
    }

    public static final void jpowsppfya(Cj this$0, v80 this_with, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        zdlpuopuiu.btonecajqb(this_with, "$this_with");
        i1 i1Var = (i1) this$0.yadqdtsiqt();
        String phoneNumber = String.valueOf(this_with.f58977ppxfxbqfkf.getText());
        i1Var.getClass();
        zdlpuopuiu.btonecajqb(phoneNumber, "phoneNumber");
        d dVar = new d(i1Var);
        g0 g0Var = new g0(i1Var);
        StringBuilder sb3 = new StringBuilder();
        for (int i13 = 0; i13 < phoneNumber.length(); i13++) {
            char cCharAt = phoneNumber.charAt(i13);
            if (cCharAt != '+' && cCharAt != ' ' && cCharAt != '-') {
                sb3.append(cCharAt);
            }
        }
        String string = sb3.toString();
        zdlpuopuiu.dxjokdxxww(string, "filterNotTo(StringBuilder(), predicate).toString()");
        if (string.length() == 11) {
            dVar.invoke(string);
        } else {
            g0Var.invoke();
        }
    }

    @Override // npi.spay.S
    public final iobyxmoadg cdpycssgdh() {
        View viewInflate = getLayoutInflater().inflate(R.layout.spay_layout_phone_number, (ViewGroup) null, false);
        int i13 = R.id.spay_slpn_acb_backward;
        AppCompatButton appCompatButton = (AppCompatButton) zoijcleaow.iobyxmoadg(viewInflate, i13);
        if (appCompatButton != null) {
            i13 = R.id.spay_slpn_acet_phone_number;
            PhoneNumberCompositeView phoneNumberCompositeView = (PhoneNumberCompositeView) zoijcleaow.iobyxmoadg(viewInflate, i13);
            if (phoneNumberCompositeView != null) {
                i13 = R.id.spay_slpn_actv_exception;
                AppCompatTextView appCompatTextView = (AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13);
                if (appCompatTextView != null) {
                    i13 = R.id.spay_slpn_actv_title;
                    if (((AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13)) != null) {
                        i13 = R.id.spay_slpn_mb_continue;
                        MaterialButton materialButton = (MaterialButton) zoijcleaow.iobyxmoadg(viewInflate, i13);
                        if (materialButton != null) {
                            return new v80((ConstraintLayout) viewInflate, appCompatButton, phoneNumberCompositeView, appCompatTextView, materialButton);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i13)));
    }

    @Override // npi.spay.S
    /* JADX INFO: renamed from: iozdgvuglv */
    public final Class getF70578cqumvgiudr() {
        return i1.class;
    }

    @Override // npi.spay.S
    public final void pkzmftpjix() {
        int i13 = !zdlpuopuiu.eablkybsjg(((auzgnhcxok) ((i1) yadqdtsiqt()).f56063zoijcleaow).f55853iozdgvuglv.getValue(), PayStrategy.PayWithPhoneNumber.INSTANCE) ? 2 : 0;
        iobyxmoadg iobyxmoadgVar = this.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        PhoneNumberCompositeView phoneNumberCompositeView = ((v80) iobyxmoadgVar).f58977ppxfxbqfkf;
        phoneNumberCompositeView.setInputType(i13);
        phoneNumberCompositeView.setPayStrategy(((i1) yadqdtsiqt()).f56978gxszxtbevo);
        iobyxmoadg iobyxmoadgVar2 = this.f70570yggfygwlhe;
        if (iobyxmoadgVar2 == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        final v80 v80Var = (v80) iobyxmoadgVar2;
        v80Var.f58975eablkybsjg.setOnClickListener(new View.OnClickListener() { // from class: kk.tbqsvytpvh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Cj.jpowsppfya(this.f58646zdlpuopuiu, v80Var, view);
            }
        });
        v80Var.f58979zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: kk.roivzttewh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Cj.hcddaimhww(this.f58461zdlpuopuiu, view);
            }
        });
    }

    @Override // npi.spay.S
    public final void wwaezpbzkn() {
        kk.rj rjVar = r80.f58286zoijcleaow;
        if (rjVar != null) {
            this.f70569jyumaefscl = rjVar.f58386iobyxmoadg.ppxfxbqfkf();
        }
    }

    @Override // npi.spay.S
    public final void ylkuphrtab() {
        MerchantData merchantData = ((auzgnhcxok) ((i1) yadqdtsiqt()).f56063zoijcleaow).f55859lmojexxdyd;
        if (merchantData == null) {
            throw Cn.f70541zdlpuopuiu;
        }
        lqeggnwhkg lqeggnwhkgVarLereixgezr = dxjokdxxww.lereixgezr(kegysxyocb.iobyxmoadg(merchantData.getPhoneNumber()));
        gtknphoqwx.zoijcleaow zoijcleaowVar = gtknphoqwx.zoijcleaow.STARTED;
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new xg0(this, zoijcleaowVar, lqeggnwhkgVarLereixgezr, null, this), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new sopmlzcsov(this, zoijcleaowVar, ((i1) yadqdtsiqt()).f56977eablkybsjg, null, this), 3, null);
    }
}
