package kk;

import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
public final class xh0 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ long f59307zdlpuopuiu;

    public xh0(lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        xh0 xh0Var = new xh0(gxszxtbevoVar);
        xh0Var.f59307zdlpuopuiu = ((Number) obj).longValue();
        return xh0Var;
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        long jLongValue = ((Number) obj).longValue();
        xh0 xh0Var = new xh0((lg.gxszxtbevo) obj2);
        xh0Var.f59307zdlpuopuiu = jLongValue;
        return xh0Var.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        long j13 = this.f59307zdlpuopuiu;
        if (j13 <= -1) {
            return j13 == -1 ? new m10(R.string.spay_otp_code_resend_btn, null, R.color.spay_otp_primary_button_color, null, 10) : new m10(R.string.spay_empty_string, null, 0, null, 30);
        }
        return new m10(R.string.spay_otp_code_resend_btn_countdown, kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(R.plurals.spay_otp_secs_f), R.color.spay_otp_code_info_text_color, kotlin.coroutines.jvm.internal.zoijcleaow.eablkybsjg(j13), 16);
    }
}
