package kk;

import spay.sdk.view.otpTextView.SpayOtpTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class no extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ nz f57836zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no(nz nzVar) {
        super(1);
        this.f57836zdlpuopuiu = nzVar;
    }

    @Override // tg.draadjrbmk
    public final Object invoke(Object obj) {
        SpayOtpTextView spayOtpTextView;
        ag0 view;
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg((Boolean) obj, Boolean.TRUE) && (view = (spayOtpTextView = this.f57836zdlpuopuiu.f57867wkgbmnqykc).f107892b) != null) {
            view.requestFocus();
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(spayOtpTextView, "<this>");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(view, "view");
            gb0.iobyxmoadg(spayOtpTextView, view);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
