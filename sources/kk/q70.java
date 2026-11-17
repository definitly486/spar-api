package kk;

import android.hardware.SensorManager;

/* JADX INFO: loaded from: classes3.dex */
public final class q70 extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ npi.spay.uo f58164zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q70(npi.spay.uo uoVar) {
        super(0);
        this.f58164zdlpuopuiu = uoVar;
    }

    @Override // tg.iobyxmoadg
    public final Object invoke() {
        npi.spay.uo uoVar = this.f58164zdlpuopuiu;
        SensorManager sensorManager = uoVar.f70589pmvmpeiblj;
        if (sensorManager != null) {
            sensorManager.registerListener((y90) uoVar.f70588lereixgezr.getValue(), this.f58164zdlpuopuiu.f70590zynmafqrjb, 2);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
