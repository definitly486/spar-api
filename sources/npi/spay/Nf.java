package npi.spay;

import a6.iobyxmoadg;
import a6.zoijcleaow;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.gtknphoqwx;
import androidx.lifecycle.oxmwwwfdhm;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import kk.aj;
import kk.b50;
import kk.ce0;
import kk.ck;
import kk.d0;
import kk.dh;
import kk.dk;
import kk.fb;
import kk.g2;
import kk.gp;
import kk.hc;
import kk.hm;
import kk.j00;
import kk.krqnebusok;
import kk.l80;
import kk.lrnfpwlwnk;
import kk.n10;
import kk.ne;
import kk.o5;
import kk.pf;
import kk.pf0;
import kk.r6;
import kk.r80;
import kk.rw;
import kk.tg;
import kk.u00;
import kk.u7;
import kk.vdvldrhtss;
import kk.w8;
import kk.wq;
import kk.xb0;
import kk.zf;
import kk.zs;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import npi.spay.Nf;
import sj.dxjokdxxww;
import sj.lqeggnwhkg;
import spay.sdk.R;
import spay.sdk.view.BnplButtonCompositeView;
import spay.sdk.view.SpasiboBonusesButtonCompositeView;
import spay.sdk.view.SpayBnplGraphCompositeView;
import spay.sdk.view.SpayBonusOverallCompositeView;
import spay.sdk.view.SpayUserDataCompositeView;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnpi/spay/Nf;", "Lnpi/spay/S;", "Lkk/lrnfpwlwnk;", "Lkk/u00;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Nf extends S<lrnfpwlwnk, u00> {

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public static final /* synthetic */ int f70560lereixgezr = 0;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public d0 f70561cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public r6 f70562esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public gp f70563iwizpuwonk;

    public static final void cllcsxoeiz(Nf this$0, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        ((lrnfpwlwnk) this$0.yadqdtsiqt()).agtfadlqog(pf.f58075iobyxmoadg);
    }

    public static final void hcddaimhww(Nf this$0, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        ((lrnfpwlwnk) this$0.yadqdtsiqt()).agtfadlqog(ne.f57799iobyxmoadg);
    }

    public static final void hkdspvbjdz(Nf this$0, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        ((lrnfpwlwnk) this$0.yadqdtsiqt()).agtfadlqog(fb.f56520iobyxmoadg);
    }

    public static final void jpowsppfya(Nf this$0, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        ((lrnfpwlwnk) this$0.yadqdtsiqt()).agtfadlqog(hc.f56892iobyxmoadg);
    }

    @Override // npi.spay.S
    public final iobyxmoadg cdpycssgdh() {
        View viewIobyxmoadg;
        View viewInflate = getLayoutInflater().inflate(R.layout.spay_layout_order, (ViewGroup) null, false);
        int i13 = R.id.spay_slo_acb_cancel;
        AppCompatButton appCompatButton = (AppCompatButton) zoijcleaow.iobyxmoadg(viewInflate, i13);
        if (appCompatButton != null) {
            i13 = R.id.spay_slo_composite_btn_bnpl;
            BnplButtonCompositeView bnplButtonCompositeView = (BnplButtonCompositeView) zoijcleaow.iobyxmoadg(viewInflate, i13);
            if (bnplButtonCompositeView != null) {
                i13 = R.id.spay_slo_cv_card_selection_button;
                CardView cardView = (CardView) zoijcleaow.iobyxmoadg(viewInflate, i13);
                if (cardView != null && (viewIobyxmoadg = zoijcleaow.iobyxmoadg(viewInflate, (i13 = R.id.spay_slo_include_compound_wallet))) != null) {
                    zf zfVarIobyxmoadg = zf.iobyxmoadg(viewIobyxmoadg);
                    i13 = R.id.spay_slo_include_selected_card;
                    View viewIobyxmoadg2 = zoijcleaow.iobyxmoadg(viewInflate, i13);
                    if (viewIobyxmoadg2 != null) {
                        dh dhVarIobyxmoadg = dh.iobyxmoadg(viewIobyxmoadg2);
                        i13 = R.id.spay_slo_inlude_no_card_error;
                        View viewIobyxmoadg3 = zoijcleaow.iobyxmoadg(viewInflate, i13);
                        if (viewIobyxmoadg3 != null) {
                            int i14 = R.id.spay_silnc_iv_alert_image;
                            if (((AppCompatImageView) zoijcleaow.iobyxmoadg(viewIobyxmoadg3, i14)) != null) {
                                i14 = R.id.spay_silnc_tv_choose_another_way;
                                if (((AppCompatTextView) zoijcleaow.iobyxmoadg(viewIobyxmoadg3, i14)) != null) {
                                    i14 = R.id.spay_silnc_tv_no_card_text;
                                    if (((AppCompatTextView) zoijcleaow.iobyxmoadg(viewIobyxmoadg3, i14)) != null) {
                                        i13 = R.id.spay_slo_mb_pay;
                                        MaterialButton materialButton = (MaterialButton) zoijcleaow.iobyxmoadg(viewInflate, i13);
                                        if (materialButton != null) {
                                            i13 = R.id.spay_slo_root;
                                            if (((ConstraintLayout) zoijcleaow.iobyxmoadg(viewInflate, i13)) != null) {
                                                i13 = R.id.spay_slo_rv_amount;
                                                RecyclerView recyclerView = (RecyclerView) zoijcleaow.iobyxmoadg(viewInflate, i13);
                                                if (recyclerView != null) {
                                                    i13 = R.id.spay_slo_rv_hint_helper;
                                                    RecyclerView recyclerView2 = (RecyclerView) zoijcleaow.iobyxmoadg(viewInflate, i13);
                                                    if (recyclerView2 != null) {
                                                        i13 = R.id.spay_slo_sbgcv_graph;
                                                        SpayBnplGraphCompositeView spayBnplGraphCompositeView = (SpayBnplGraphCompositeView) zoijcleaow.iobyxmoadg(viewInflate, i13);
                                                        if (spayBnplGraphCompositeView != null) {
                                                            i13 = R.id.spay_slo_sbocv_bonus;
                                                            SpayBonusOverallCompositeView spayBonusOverallCompositeView = (SpayBonusOverallCompositeView) zoijcleaow.iobyxmoadg(viewInflate, i13);
                                                            if (spayBonusOverallCompositeView != null) {
                                                                i13 = R.id.spay_slo_sudcv_user_data;
                                                                SpayUserDataCompositeView spayUserDataCompositeView = (SpayUserDataCompositeView) zoijcleaow.iobyxmoadg(viewInflate, i13);
                                                                if (spayUserDataCompositeView != null) {
                                                                    i13 = R.id.spay_slo_tv_client_name;
                                                                    AppCompatTextView appCompatTextView = (AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13);
                                                                    if (appCompatTextView != null) {
                                                                        i13 = R.id.spay_spasibo_btn;
                                                                        SpasiboBonusesButtonCompositeView spasiboBonusesButtonCompositeView = (SpasiboBonusesButtonCompositeView) zoijcleaow.iobyxmoadg(viewInflate, i13);
                                                                        if (spasiboBonusesButtonCompositeView != null) {
                                                                            u00 u00Var = new u00((NestedScrollView) viewInflate, appCompatButton, bnplButtonCompositeView, cardView, zfVarIobyxmoadg, dhVarIobyxmoadg, materialButton, recyclerView, recyclerView2, spayBnplGraphCompositeView, spayBonusOverallCompositeView, spayUserDataCompositeView, appCompatTextView, spasiboBonusesButtonCompositeView);
                                                                            zdlpuopuiu.dxjokdxxww(u00Var, "inflate(layoutInflater)");
                                                                            return u00Var;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            throw new NullPointerException("Missing required view with ID: ".concat(viewIobyxmoadg3.getResources().getResourceName(i14)));
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
        return lrnfpwlwnk.class;
    }

    @Override // npi.spay.S
    public final void lmojexxdyd() {
        iobyxmoadg iobyxmoadgVar = this.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        ((u00) iobyxmoadgVar).f58745lqeggnwhkg.setOnClickListener(new View.OnClickListener() { // from class: kk.z9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Nf.hcddaimhww(this.f59546zdlpuopuiu, view);
            }
        });
        iobyxmoadg iobyxmoadgVar2 = this.f70570yggfygwlhe;
        if (iobyxmoadgVar2 == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        ((u00) iobyxmoadgVar2).f58750zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: kk.aa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Nf.jpowsppfya(this.f55794zdlpuopuiu, view);
            }
        });
        iobyxmoadg iobyxmoadgVar3 = this.f70570yggfygwlhe;
        if (iobyxmoadgVar3 == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        ((u00) iobyxmoadgVar3).f58747ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: kk.ba
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Nf.hkdspvbjdz(this.f55961zdlpuopuiu, view);
            }
        });
        iobyxmoadg iobyxmoadgVar4 = this.f70570yggfygwlhe;
        if (iobyxmoadgVar4 == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        ((u00) iobyxmoadgVar4).f58749wkgbmnqykc.setOnClickListener(new View.OnClickListener() { // from class: kk.ca
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Nf.cllcsxoeiz(this.f56116zdlpuopuiu, view);
            }
        });
        iobyxmoadg iobyxmoadgVar5 = this.f70570yggfygwlhe;
        if (iobyxmoadgVar5 == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        ((u00) iobyxmoadgVar5).f58737agtfadlqog.a(new hm(this));
    }

    @Override // npi.spay.S, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        ((lrnfpwlwnk) yadqdtsiqt()).agtfadlqog(aj.f55826iobyxmoadg);
    }

    @Override // npi.spay.S, androidx.fragment.app.Fragment
    public final void onStop() {
        ((lrnfpwlwnk) yadqdtsiqt()).agtfadlqog(dk.f56302iobyxmoadg);
        super.onStop();
    }

    @Override // npi.spay.S
    public final void pkzmftpjix() {
        this.f70562esjtqupxsv = new r6();
        this.f70563iwizpuwonk = new gp(new ck(), new tg());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
        iobyxmoadg iobyxmoadgVar = this.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        RecyclerView recyclerView = ((u00) iobyxmoadgVar).f58746nufgyqmvbu;
        recyclerView.setLayoutManager(linearLayoutManager);
        gp gpVar = this.f70563iwizpuwonk;
        if (gpVar == null) {
            zdlpuopuiu.pmvmpeiblj("amountAdapter");
            gpVar = null;
        }
        recyclerView.setAdapter(gpVar);
        new ce0(new u7(this)).attachToRecyclerView(recyclerView);
        d0 d0Var = new d0(new zs(), new w8(this));
        this.f70561cqumvgiudr = d0Var;
        iobyxmoadg iobyxmoadgVar2 = this.f70570yggfygwlhe;
        if (iobyxmoadgVar2 == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        ((u00) iobyxmoadgVar2).f58740dxjokdxxww.setAdapter(d0Var);
        lmojexxdyd();
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
        u00 u00Var = (u00) iobyxmoadgVar;
        lqeggnwhkg lqeggnwhkgVarLereixgezr = dxjokdxxww.lereixgezr(((lrnfpwlwnk) yadqdtsiqt()).f57518oxmwwwfdhm);
        gtknphoqwx.zoijcleaow zoijcleaowVar = gtknphoqwx.zoijcleaow.STARTED;
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new n10(this, zoijcleaowVar, lqeggnwhkgVarLereixgezr, null, u00Var, contextRequireContext, this), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new b50(this, zoijcleaowVar, ((lrnfpwlwnk) yadqdtsiqt()).f57525zdlpuopuiu, null, u00Var), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new l80(this, zoijcleaowVar, dxjokdxxww.lereixgezr(((lrnfpwlwnk) yadqdtsiqt()).f57521vdvldrhtss), null, this), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new xb0(this, zoijcleaowVar, dxjokdxxww.lereixgezr(((lrnfpwlwnk) yadqdtsiqt()).f57524yggfygwlhe), null, u00Var, contextRequireContext), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new pf0(this, zoijcleaowVar, dxjokdxxww.lereixgezr(((lrnfpwlwnk) yadqdtsiqt()).f57513kcexrzcfyt), null, u00Var), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new vdvldrhtss(this, zoijcleaowVar, ((lrnfpwlwnk) yadqdtsiqt()).f57503cqumvgiudr, null, u00Var), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new krqnebusok(this, zoijcleaowVar, dxjokdxxww.lereixgezr(((lrnfpwlwnk) yadqdtsiqt()).f57511iwizpuwonk), null, u00Var), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new g2(this, zoijcleaowVar, dxjokdxxww.lereixgezr(((lrnfpwlwnk) yadqdtsiqt()).f57514lereixgezr), null, u00Var, contextRequireContext), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new o5(this, zoijcleaowVar, new wq(dxjokdxxww.lereixgezr(((lrnfpwlwnk) yadqdtsiqt()).f57526zynmafqrjb)), null, this, u00Var), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new rw(this, zoijcleaowVar, ((lrnfpwlwnk) yadqdtsiqt()).f57502cdpycssgdh, null, u00Var, this), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new j00(this, zoijcleaowVar, ((lrnfpwlwnk) yadqdtsiqt()).f57517ojitshcjhn, null, u00Var), 3, null);
    }
}
