package npi.spay;

import a6.iobyxmoadg;
import a6.zoijcleaow;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.lifecycle.oxmwwwfdhm;
import kk.r80;
import kk.s40;
import kk.sm;
import kk.xz;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.gtknphoqwx;
import sj.dxjokdxxww;
import sj.lqeggnwhkg;
import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnpi/spay/p6;", "Lnpi/spay/S;", "Lkk/xz;", "Lkk/sm;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class p6 extends S<xz, sm> {
    @Override // npi.spay.S
    public final iobyxmoadg cdpycssgdh() {
        View viewInflate = getLayoutInflater().inflate(R.layout.spay_layout_fake_bank, (ViewGroup) null, false);
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) viewInflate;
        int i13 = R.id.spay_slfb_tv_fake_bank_description;
        if (((AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13)) != null) {
            i13 = R.id.spay_slfb_tv_fake_bank_title;
            if (((AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13)) != null) {
                sm smVar = new sm(linearLayoutCompat);
                zdlpuopuiu.dxjokdxxww(smVar, "inflate(layoutInflater)");
                return smVar;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i13)));
    }

    @Override // npi.spay.S
    /* JADX INFO: renamed from: iozdgvuglv */
    public final Class getF70578cqumvgiudr() {
        return xz.class;
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
        lqeggnwhkg lqeggnwhkgVarLereixgezr = dxjokdxxww.lereixgezr(((xz) yadqdtsiqt()).f59352gxszxtbevo);
        gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new s40(this, androidx.lifecycle.gtknphoqwx.zoijcleaow.STARTED, lqeggnwhkgVarLereixgezr, null, this), 3, null);
    }
}
