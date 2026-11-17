package npi.spay;

import a6.iobyxmoadg;
import a6.zoijcleaow;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import kk.fi;
import kk.nc0;
import kk.r80;
import kk.yf;
import kotlin.Metadata;
import kotlin.jvm.internal.jpowsppfya;
import kotlin.jvm.internal.zdlpuopuiu;
import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnpi/spay/To;", "Lnpi/spay/C6;", "Lkk/fi;", "Lkk/nc0;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class To extends C6<fi, nc0> {
    @Override // npi.spay.S
    public final iobyxmoadg cdpycssgdh() {
        View viewInflate = getLayoutInflater().inflate(R.layout.spay_layout_sdk_version_deprecated_error, (ViewGroup) null, false);
        int i13 = R.id.spay_slsvde_actv_to_payment_methods;
        if (((AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13)) != null) {
            i13 = R.id.spay_slsvde_cv_to_payment_methods;
            CardView cardView = (CardView) zoijcleaow.iobyxmoadg(viewInflate, i13);
            if (cardView != null) {
                FrameLayout frameLayout = (FrameLayout) viewInflate;
                int i14 = R.id.spay_slsvde_tv_otp_error;
                if (((AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i14)) != null) {
                    nc0 nc0Var = new nc0(frameLayout, cardView);
                    zdlpuopuiu.dxjokdxxww(nc0Var, "inflate(layoutInflater)");
                    return nc0Var;
                }
                i13 = i14;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i13)));
    }

    @Override // npi.spay.S
    /* JADX INFO: renamed from: iozdgvuglv */
    public final Class getF70578cqumvgiudr() {
        return fi.class;
    }

    @Override // npi.spay.S
    public final void pkzmftpjix() {
        iobyxmoadg iobyxmoadgVar = this.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        CardView cardView = ((nc0) iobyxmoadgVar).f57758zoijcleaow;
        zdlpuopuiu.dxjokdxxww(cardView, "binding.spaySlsvdeCvToPaymentMethods");
        cardView.setOnClickListener(new yf(new jpowsppfya(), this));
    }

    @Override // npi.spay.S
    public final void wwaezpbzkn() {
        kk.rj rjVar = r80.f58286zoijcleaow;
        if (rjVar != null) {
            this.f70569jyumaefscl = rjVar.f58386iobyxmoadg.ppxfxbqfkf();
        }
    }
}
