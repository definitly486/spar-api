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
import com.google.android.material.button.MaterialButton;
import kk.c2;
import kk.ce0;
import kk.d0;
import kk.d3;
import kk.dn;
import kk.eu;
import kk.fe0;
import kk.gp;
import kk.i4;
import kk.k5;
import kk.l0;
import kk.ls;
import kk.n6;
import kk.oa0;
import kk.oipsdeybqn;
import kk.q7;
import kk.r80;
import kk.s8;
import kk.tq;
import kk.uh0;
import kk.v30;
import kk.y40;
import kk.yy;
import kk.zj;
import kk.zs;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import npi.spay.Nb;
import sj.dxjokdxxww;
import sj.lqeggnwhkg;
import spay.sdk.R;
import spay.sdk.view.SpayUserDataCompositeView;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnpi/spay/Nb;", "Lnpi/spay/S;", "Lkk/zj;", "Lkk/ls;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Nb extends S<zj, ls> {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final /* synthetic */ int f70557esjtqupxsv = 0;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public gp f70558cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public d0 f70559iwizpuwonk;

    public static final void hcddaimhww(Nb this$0, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        ((zj) this$0.yadqdtsiqt()).draadjrbmk(yy.f59496iobyxmoadg);
    }

    @Override // npi.spay.S
    public final iobyxmoadg cdpycssgdh() {
        View viewInflate = getLayoutInflater().inflate(R.layout.spay_layout_heplers, (ViewGroup) null, false);
        int i13 = R.id.spay_slh_actv_merchant_name;
        AppCompatTextView appCompatTextView = (AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13);
        if (appCompatTextView != null) {
            i13 = R.id.spay_slh_actv_order_amount;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13);
            if (appCompatTextView2 != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                i13 = R.id.spay_slh_mb_cancel;
                MaterialButton materialButton = (MaterialButton) zoijcleaow.iobyxmoadg(viewInflate, i13);
                if (materialButton != null) {
                    i13 = R.id.spay_slh_rv_helpers;
                    RecyclerView recyclerView = (RecyclerView) zoijcleaow.iobyxmoadg(viewInflate, i13);
                    if (recyclerView != null) {
                        i13 = R.id.spay_slh_rv_hint_helper;
                        RecyclerView recyclerView2 = (RecyclerView) zoijcleaow.iobyxmoadg(viewInflate, i13);
                        if (recyclerView2 != null) {
                            i13 = R.id.spay_slh_sudcv_user_data;
                            SpayUserDataCompositeView spayUserDataCompositeView = (SpayUserDataCompositeView) zoijcleaow.iobyxmoadg(viewInflate, i13);
                            if (spayUserDataCompositeView != null) {
                                ls lsVar = new ls(constraintLayout, appCompatTextView, appCompatTextView2, materialButton, recyclerView, recyclerView2, spayUserDataCompositeView);
                                zdlpuopuiu.dxjokdxxww(lsVar, "inflate(layoutInflater)");
                                return lsVar;
                            }
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
        return zj.class;
    }

    @Override // npi.spay.S
    public final void lmojexxdyd() {
        iobyxmoadg iobyxmoadgVar = this.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        ((ls) iobyxmoadgVar).f57532wkgbmnqykc.setOnClickListener(new View.OnClickListener() { // from class: kk.v9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Nb.hcddaimhww(this.f58980zdlpuopuiu, view);
            }
        });
    }

    @Override // npi.spay.S, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        ((zj) yadqdtsiqt()).draadjrbmk(v30.f58942iobyxmoadg);
    }

    @Override // npi.spay.S, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        ((zj) yadqdtsiqt()).draadjrbmk(y40.f59383iobyxmoadg);
    }

    @Override // npi.spay.S
    public final void pkzmftpjix() {
        d0 d0Var = new d0(new zs(), new d3(this));
        this.f70559iwizpuwonk = d0Var;
        iobyxmoadg iobyxmoadgVar = this.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        RecyclerView recyclerView = ((ls) iobyxmoadgVar).f57528gxszxtbevo;
        recyclerView.setAdapter(d0Var);
        recyclerView.wflxmlrfwp(new i4());
        gp gpVar = new gp(new tq(new k5(this)), new dn(new n6(this)), new l0(new q7(this)));
        this.f70558cqumvgiudr = gpVar;
        iobyxmoadg iobyxmoadgVar2 = this.f70570yggfygwlhe;
        if (iobyxmoadgVar2 == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        RecyclerView recyclerView2 = ((ls) iobyxmoadgVar2).f57527eablkybsjg;
        recyclerView2.setAdapter(gpVar);
        Context context = recyclerView2.getContext();
        zdlpuopuiu.dxjokdxxww(context, "context");
        int i13 = R.dimen.spay_8dp;
        zdlpuopuiu.btonecajqb(context, "<this>");
        recyclerView2.btonecajqb(new eu(context.getResources().getDimensionPixelSize(i13)));
        new ce0(new s8()).attachToRecyclerView(recyclerView2);
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
        Context contextRequireContext = requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext()");
        iobyxmoadg iobyxmoadgVar = this.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        ls lsVar = (ls) iobyxmoadgVar;
        lqeggnwhkg lqeggnwhkgVarLereixgezr = dxjokdxxww.lereixgezr(((zj) yadqdtsiqt()).f59590btonecajqb);
        gtknphoqwx.zoijcleaow zoijcleaowVar = gtknphoqwx.zoijcleaow.STARTED;
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new oa0(this, zoijcleaowVar, lqeggnwhkgVarLereixgezr, null, this), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new c2(this, zoijcleaowVar, dxjokdxxww.lereixgezr(((zj) yadqdtsiqt()).f59589agtfadlqog), null, this), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new fe0(this, zoijcleaowVar, dxjokdxxww.lereixgezr(((zj) yadqdtsiqt()).f59591draadjrbmk), null, this), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new uh0(this, zoijcleaowVar, dxjokdxxww.lereixgezr(((zj) yadqdtsiqt()).f59598ojitshcjhn), null, this), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new oipsdeybqn(this, zoijcleaowVar, ((zj) yadqdtsiqt()).f59599rgvfuqvkyq, null, lsVar, contextRequireContext), 3, null);
    }
}
