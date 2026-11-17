package npi.spay;

import a6.iobyxmoadg;
import a6.zoijcleaow;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.gtknphoqwx;
import androidx.lifecycle.oxmwwwfdhm;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.auth.api.phone.SmsRetrieverClient;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.button.MaterialButton;
import kk.a0;
import kk.bz;
import kk.dt;
import kk.fc;
import kk.in;
import kk.iu;
import kk.m5;
import kk.mv;
import kk.nf;
import kk.nz;
import kk.opjhrmiecq;
import kk.qw;
import kk.r80;
import kk.rgvfuqvkyq;
import kk.u8;
import kk.xx;
import kk.yi;
import kk.yzdjzghtvl;
import kk.zr;
import kotlin.Metadata;
import kotlin.jvm.internal.jpowsppfya;
import kotlin.jvm.internal.zdlpuopuiu;
import sj.dxjokdxxww;
import sj.wypolnanlu;
import spay.sdk.R;
import spay.sdk.utils.receiver.OtpReceiver;
import spay.sdk.view.otpTextView.SpayOtpTextView;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnpi/spay/ke;", "Lnpi/spay/S;", "Lkk/rgvfuqvkyq;", "Lkk/nz;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ke extends S<rgvfuqvkyq, nz> {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final /* synthetic */ int f70577esjtqupxsv = 0;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public final Class f70578cqumvgiudr = rgvfuqvkyq.class;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public OtpReceiver f70579iwizpuwonk;

    public static final void hcddaimhww(Exception it) {
        zdlpuopuiu.btonecajqb(it, "it");
    }

    public static final void jpowsppfya(draadjrbmk tmp0, Object obj) {
        zdlpuopuiu.btonecajqb(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // npi.spay.S
    public final iobyxmoadg cdpycssgdh() {
        View viewInflate = getLayoutInflater().inflate(R.layout.spay_layout_one_time_password, (ViewGroup) null, false);
        int i13 = R.id.spay_slotp_mb_btn_cancel;
        MaterialButton materialButton = (MaterialButton) zoijcleaow.iobyxmoadg(viewInflate, i13);
        if (materialButton != null) {
            i13 = R.id.spay_slotp_mb_btn_continue;
            MaterialButton materialButton2 = (MaterialButton) zoijcleaow.iobyxmoadg(viewInflate, i13);
            if (materialButton2 != null) {
                i13 = R.id.spay_slotp_socecv_code;
                SpayOtpTextView spayOtpTextView = (SpayOtpTextView) zoijcleaow.iobyxmoadg(viewInflate, i13);
                if (spayOtpTextView != null) {
                    i13 = R.id.spay_slotp_tv_error_message;
                    TextView textView = (TextView) zoijcleaow.iobyxmoadg(viewInflate, i13);
                    if (textView != null) {
                        i13 = R.id.spay_slotp_tv_message;
                        TextView textView2 = (TextView) zoijcleaow.iobyxmoadg(viewInflate, i13);
                        if (textView2 != null) {
                            i13 = R.id.spay_slotp_tv_retry_btn;
                            TextView textView3 = (TextView) zoijcleaow.iobyxmoadg(viewInflate, i13);
                            if (textView3 != null) {
                                nz nzVar = new nz((ConstraintLayout) viewInflate, materialButton, materialButton2, spayOtpTextView, textView, textView2, textView3);
                                zdlpuopuiu.dxjokdxxww(nzVar, "inflate(layoutInflater)");
                                return nzVar;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i13)));
    }

    public final void hkdspvbjdz() {
        SmsRetrieverClient client = SmsRetriever.getClient(requireContext());
        zdlpuopuiu.dxjokdxxww(client, "getClient(requireContext())");
        Task<Void> taskStartSmsUserConsent = client.startSmsUserConsent(null);
        final bz bzVar = bz.f56066zdlpuopuiu;
        taskStartSmsUserConsent.addOnSuccessListener(new OnSuccessListener() { // from class: kk.h00
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                npi.spay.ke.jpowsppfya(bzVar, obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: kk.i00
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                npi.spay.ke.hcddaimhww(exc);
            }
        });
    }

    @Override // npi.spay.S
    /* JADX INFO: renamed from: iozdgvuglv, reason: from getter */
    public final Class getF70578cqumvgiudr() {
        return this.f70578cqumvgiudr;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i13, int i14, Intent intent) {
        String stringExtra;
        super.onActivityResult(i13, i14, intent);
        if (i13 != 200 || i14 != -1 || intent == null || (stringExtra = intent.getStringExtra(SmsRetriever.EXTRA_SMS_MESSAGE)) == null) {
            return;
        }
        ((rgvfuqvkyq) yadqdtsiqt()).agtfadlqog(new opjhrmiecq(stringExtra));
    }

    @Override // npi.spay.S, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        ((rgvfuqvkyq) yadqdtsiqt()).agtfadlqog(yzdjzghtvl.f59500iobyxmoadg);
        OtpReceiver otpReceiver = new OtpReceiver();
        this.f70579iwizpuwonk = otpReceiver;
        dt listener = new dt(this);
        zdlpuopuiu.btonecajqb(listener, "listener");
        otpReceiver.f107847a = listener;
        androidx.core.content.iobyxmoadg.registerReceiver(requireContext(), this.f70579iwizpuwonk, new IntentFilter(SmsRetriever.SMS_RETRIEVED_ACTION), SmsRetriever.SEND_PERMISSION, null, 4);
    }

    @Override // npi.spay.S, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        ((rgvfuqvkyq) yadqdtsiqt()).agtfadlqog(a0.f55759iobyxmoadg);
        requireActivity().unregisterReceiver(this.f70579iwizpuwonk);
    }

    @Override // npi.spay.S
    public final void pkzmftpjix() {
        iobyxmoadg iobyxmoadgVar = this.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        nz nzVar = (nz) iobyxmoadgVar;
        MaterialButton spaySlotpMbBtnCancel = nzVar.f57868zoijcleaow;
        zdlpuopuiu.dxjokdxxww(spaySlotpMbBtnCancel, "spaySlotpMbBtnCancel");
        spaySlotpMbBtnCancel.setOnClickListener(new mv(new jpowsppfya(), this));
        MaterialButton spaySlotpMbBtnContinue = nzVar.f57866ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(spaySlotpMbBtnContinue, "spaySlotpMbBtnContinue");
        spaySlotpMbBtnContinue.setOnClickListener(new qw(new jpowsppfya(), this));
        TextView spaySlotpTvRetryBtn = nzVar.f57865lqeggnwhkg;
        zdlpuopuiu.dxjokdxxww(spaySlotpTvRetryBtn, "spaySlotpTvRetryBtn");
        spaySlotpTvRetryBtn.setOnClickListener(new xx(new jpowsppfya(), nzVar, this));
        nzVar.f57867wkgbmnqykc.setSpayOtpListener(new iu(this));
        hkdspvbjdz();
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
        nz nzVar = (nz) iobyxmoadgVar;
        wypolnanlu wypolnanluVar = ((rgvfuqvkyq) yadqdtsiqt()).f58352pmvmpeiblj;
        gtknphoqwx.zoijcleaow zoijcleaowVar = gtknphoqwx.zoijcleaow.STARTED;
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new m5(this, zoijcleaowVar, wypolnanluVar, null, nzVar), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new u8(this, zoijcleaowVar, dxjokdxxww.lereixgezr(((rgvfuqvkyq) yadqdtsiqt()).f58358zdlpuopuiu), null, nzVar, contextRequireContext), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new fc(this, zoijcleaowVar, ((rgvfuqvkyq) yadqdtsiqt()).f58345jyumaefscl, null, nzVar, contextRequireContext), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new nf(this, zoijcleaowVar, ((rgvfuqvkyq) yadqdtsiqt()).f58359zynmafqrjb, null, nzVar, this, contextRequireContext), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new yi(this, zoijcleaowVar, ((rgvfuqvkyq) yadqdtsiqt()).f58337cqumvgiudr, null, nzVar), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new in(this, zoijcleaowVar, dxjokdxxww.lereixgezr(((rgvfuqvkyq) yadqdtsiqt()).f58347lereixgezr), null, this), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new zr(this, zoijcleaowVar, dxjokdxxww.lereixgezr(((rgvfuqvkyq) yadqdtsiqt()).f58350ojitshcjhn), null, nzVar), 3, null);
    }
}
