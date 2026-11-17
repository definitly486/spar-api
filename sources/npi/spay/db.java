package npi.spay;

import a6.iobyxmoadg;
import a6.zoijcleaow;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.oxmwwwfdhm;
import kk.a40;
import kk.fu;
import kk.he;
import kk.ij;
import kk.ln;
import kk.r80;
import kk.sq;
import kk.uu;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.gtknphoqwx;
import sj.dxjokdxxww;
import sj.lqeggnwhkg;
import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnpi/spay/db;", "Lnpi/spay/S;", "Lkk/fu;", "Lkk/uu;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class db extends S<fu, uu> {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final /* synthetic */ int f70572iwizpuwonk = 0;

    public static final void hcddaimhww(db this$0, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        ij ijVar = (ij) ((fu) this$0.yadqdtsiqt()).f56594wkgbmnqykc;
        ln lnVarIobyxmoadg = ijVar.iobyxmoadg();
        ijVar.ppxfxbqfkf(new ln(new a40(new he()), 6));
        ijVar.ppxfxbqfkf(lnVarIobyxmoadg);
    }

    @Override // npi.spay.S
    public final iobyxmoadg cdpycssgdh() {
        View viewInflate = getLayoutInflater().inflate(R.layout.spay_layout_logger, (ViewGroup) null, false);
        int i13 = R.id.logger_back_btn;
        CardView cardView = (CardView) zoijcleaow.iobyxmoadg(viewInflate, i13);
        if (cardView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            int i14 = R.id.loggerScrollContainer;
            if (((NestedScrollView) zoijcleaow.iobyxmoadg(viewInflate, i14)) != null) {
                i14 = R.id.loggerTextView;
                TextView textView = (TextView) zoijcleaow.iobyxmoadg(viewInflate, i14);
                if (textView != null) {
                    uu uuVar = new uu(constraintLayout, cardView, textView);
                    zdlpuopuiu.dxjokdxxww(uuVar, "inflate(layoutInflater)");
                    return uuVar;
                }
            }
            i13 = i14;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i13)));
    }

    @Override // npi.spay.S
    /* JADX INFO: renamed from: iozdgvuglv */
    public final Class getF70578cqumvgiudr() {
        return fu.class;
    }

    @Override // npi.spay.S
    public final void lmojexxdyd() {
        iobyxmoadg iobyxmoadgVar = this.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        ((uu) iobyxmoadgVar).f58891zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: kk.wr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                npi.spay.db.hcddaimhww(this.f59188zdlpuopuiu, view);
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
        lqeggnwhkg lqeggnwhkgVarLereixgezr = dxjokdxxww.lereixgezr(((fu) yadqdtsiqt()).f56593lqeggnwhkg);
        gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new sq(this, androidx.lifecycle.gtknphoqwx.zoijcleaow.STARTED, lqeggnwhkgVarLereixgezr, null, this), 3, null);
    }
}
