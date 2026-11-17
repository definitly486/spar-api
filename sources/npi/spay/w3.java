package npi.spay;

import a6.iobyxmoadg;
import a6.zoijcleaow;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.gtknphoqwx;
import androidx.lifecycle.oxmwwwfdhm;
import androidx.recyclerview.widget.RecyclerView;
import kk.fa0;
import kk.gp;
import kk.iozdgvuglv;
import kk.j90;
import kk.kb0;
import kk.kj;
import kk.m30;
import kk.na0;
import kk.p;
import kk.r80;
import kk.tc0;
import kk.uz;
import kk.v60;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import sj.dxjokdxxww;
import sj.lqeggnwhkg;
import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnpi/spay/w3;", "Lnpi/spay/S;", "Lkk/iozdgvuglv;", "Lkk/kj;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class w3 extends S<iozdgvuglv, kj> {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public gp f70591iwizpuwonk;

    @Override // npi.spay.S
    public final iobyxmoadg cdpycssgdh() {
        View viewInflate = getLayoutInflater().inflate(R.layout.spay_layout_card_selection, (ViewGroup) null, false);
        int i13 = R.id.spay_slcs_actv_order_sum;
        AppCompatTextView appCompatTextView = (AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13);
        if (appCompatTextView != null) {
            i13 = R.id.spay_slcs_actv_order_sum_old;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13);
            if (appCompatTextView2 != null) {
                i13 = R.id.spay_slcs_actv_title;
                if (((AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13)) != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                    int i14 = R.id.spay_slcs_rv_cards_list;
                    RecyclerView recyclerView = (RecyclerView) zoijcleaow.iobyxmoadg(viewInflate, i14);
                    if (recyclerView != null) {
                        kj kjVar = new kj(constraintLayout, appCompatTextView, appCompatTextView2, recyclerView);
                        zdlpuopuiu.dxjokdxxww(kjVar, "inflate(layoutInflater)");
                        return kjVar;
                    }
                    i13 = i14;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i13)));
    }

    @Override // npi.spay.S
    /* JADX INFO: renamed from: iozdgvuglv */
    public final Class getF70578cqumvgiudr() {
        return iozdgvuglv.class;
    }

    @Override // npi.spay.S, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        ((iozdgvuglv) yadqdtsiqt()).draadjrbmk(j90.f57169iobyxmoadg);
    }

    @Override // npi.spay.S, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        ((iozdgvuglv) yadqdtsiqt()).draadjrbmk(na0.f57751iobyxmoadg);
    }

    @Override // npi.spay.S
    public final void pkzmftpjix() {
        gp gpVar = new gp(new uz(((Boolean) ((iozdgvuglv) yadqdtsiqt()).f57081nufgyqmvbu.getValue()).booleanValue(), new kb0(this)), new p(), new m30(((Boolean) ((iozdgvuglv) yadqdtsiqt()).f57081nufgyqmvbu.getValue()).booleanValue(), tc0.f58648zdlpuopuiu));
        this.f70591iwizpuwonk = gpVar;
        iobyxmoadg iobyxmoadgVar = this.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        ((kj) iobyxmoadgVar).f57328wkgbmnqykc.setAdapter(gpVar);
    }

    @Override // npi.spay.S
    public final void wwaezpbzkn() {
        kk.rj rjVar = r80.f58286zoijcleaow;
        if (rjVar != null) {
            this.f70569jyumaefscl = rjVar.f58386iobyxmoadg.ppxfxbqfkf();
            rjVar.f58386iobyxmoadg.iobyxmoadg();
        }
    }

    @Override // npi.spay.S
    public final void ylkuphrtab() {
        iobyxmoadg iobyxmoadgVar = this.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        Context contextRequireContext = requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext()");
        lqeggnwhkg lqeggnwhkgVarLereixgezr = dxjokdxxww.lereixgezr(((iozdgvuglv) yadqdtsiqt()).f57075btonecajqb);
        gtknphoqwx.zoijcleaow zoijcleaowVar = gtknphoqwx.zoijcleaow.STARTED;
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new v60(this, zoijcleaowVar, lqeggnwhkgVarLereixgezr, null, (kj) iobyxmoadgVar, contextRequireContext), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new fa0(this, zoijcleaowVar, dxjokdxxww.lereixgezr(((iozdgvuglv) yadqdtsiqt()).f57078gtknphoqwx), null, this), 3, null);
    }
}
