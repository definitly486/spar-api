package kk;

import android.os.CountDownTimer;

/* JADX INFO: loaded from: classes3.dex */
public final class fyldjkxazc extends CountDownTimer {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final kotlin.jvm.internal.jyumaefscl f56601iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final kotlin.jvm.internal.jyumaefscl f56602zoijcleaow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public fyldjkxazc(long j13, long j14, tg.draadjrbmk draadjrbmkVar, tg.iobyxmoadg onFinishTimerAction) {
        super(j13, j14);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onFinishTimerAction, "onFinishTimerAction");
        this.f56601iobyxmoadg = (kotlin.jvm.internal.jyumaefscl) draadjrbmkVar;
        this.f56602zoijcleaow = (kotlin.jvm.internal.jyumaefscl) onFinishTimerAction;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.jyumaefscl, tg.iobyxmoadg] */
    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.f56602zoijcleaow.invoke();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.jyumaefscl, tg.draadjrbmk] */
    @Override // android.os.CountDownTimer
    public final void onTick(long j13) {
        ?? r13 = this.f56601iobyxmoadg;
        if (r13 != 0) {
            r13.invoke(Long.valueOf(j13));
        }
    }
}
