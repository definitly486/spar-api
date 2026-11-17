package kk;

import android.hardware.SensorManager;

/* JADX INFO: loaded from: classes3.dex */
public final class n60 extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ npi.spay.uo f57740zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n60(npi.spay.uo uoVar) {
        super(0);
        this.f57740zdlpuopuiu = uoVar;
    }

    @Override // tg.iobyxmoadg
    public final Object invoke() {
        npi.spay.uo uoVar = this.f57740zdlpuopuiu;
        SensorManager sensorManager = uoVar.f70589pmvmpeiblj;
        if (sensorManager != null) {
            sensorManager.unregisterListener((y90) uoVar.f70588lereixgezr.getValue());
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
