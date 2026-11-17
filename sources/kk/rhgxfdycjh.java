package kk;

import android.content.Context;
import android.media.MediaPlayer;
import npi.spay.Hc;
import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
public final class rhgxfdycjh extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ Hc f58361zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rhgxfdycjh(Hc hc3) {
        super(1);
        this.f58361zdlpuopuiu = hc3;
    }

    @Override // tg.draadjrbmk
    public final Object invoke(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            Context context = this.f58361zdlpuopuiu.requireContext();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(context, "requireContext()");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
            MediaPlayer.create(context, R.raw.spay_failure_payment_sound).start();
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
