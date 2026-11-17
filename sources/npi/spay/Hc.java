package npi.spay;

import a6.iobyxmoadg;
import a6.zoijcleaow;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.gtknphoqwx;
import androidx.lifecycle.oxmwwwfdhm;
import com.google.android.material.button.MaterialButton;
import kk.bfopjjpdmp;
import kk.d2;
import kk.ec0;
import kk.j4;
import kk.o6;
import kk.r80;
import kk.ve;
import kk.yv;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import npi.spay.Hc;
import sj.dxjokdxxww;
import sj.wypolnanlu;
import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnpi/spay/Hc;", "Lnpi/spay/S;", "Lkk/j4;", "Lkk/yv;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Hc extends S<j4, yv> {
    public static final void hcddaimhww(Hc this$0, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        j4 j4Var = (j4) this$0.yadqdtsiqt();
        o6 event = o6.f57898iobyxmoadg;
        j4Var.getClass();
        zdlpuopuiu.btonecajqb(event, "event");
        if (zdlpuopuiu.eablkybsjg(event, event)) {
            ((ve) j4Var.f58736ppxfxbqfkf).zoijcleaow(ec0.f56401iobyxmoadg);
        }
    }

    @Override // npi.spay.S
    public final iobyxmoadg cdpycssgdh() {
        View viewInflate = getLayoutInflater().inflate(R.layout.spay_layout_no_card, (ViewGroup) null, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i13 = R.id.spay_lnc_aciv_image;
        if (((AppCompatImageView) zoijcleaow.iobyxmoadg(viewInflate, i13)) != null) {
            i13 = R.id.spay_lnc_actv_content;
            if (((AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13)) != null) {
                i13 = R.id.spay_lnc_actv_header;
                AppCompatTextView appCompatTextView = (AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13);
                if (appCompatTextView != null) {
                    i13 = R.id.spay_lnc_mb_cancel;
                    MaterialButton materialButton = (MaterialButton) zoijcleaow.iobyxmoadg(viewInflate, i13);
                    if (materialButton != null) {
                        yv yvVar = new yv(constraintLayout, appCompatTextView, materialButton);
                        zdlpuopuiu.dxjokdxxww(yvVar, "inflate(layoutInflater)");
                        return yvVar;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i13)));
    }

    @Override // npi.spay.S
    public final Class iozdgvuglv() {
        return j4.class;
    }

    @Override // npi.spay.S
    public final void lmojexxdyd() {
        iobyxmoadg iobyxmoadgVar = this.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        ((yv) iobyxmoadgVar).f59488ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: kk.e3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Hc.hcddaimhww(this.f56377zdlpuopuiu, view);
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
        iobyxmoadg iobyxmoadgVar = this.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        yv yvVar = (yv) iobyxmoadgVar;
        wypolnanlu wypolnanluVar = ((j4) yadqdtsiqt()).f57138wkgbmnqykc;
        gtknphoqwx.zoijcleaow zoijcleaowVar = gtknphoqwx.zoijcleaow.STARTED;
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new d2(this, zoijcleaowVar, wypolnanluVar, null, this), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new bfopjjpdmp(this, zoijcleaowVar, dxjokdxxww.lereixgezr(((j4) yadqdtsiqt()).f57137eablkybsjg), null, yvVar), 3, null);
    }
}
