package kk;

import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class lv extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ npi.spay.kd f57537zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv(npi.spay.kd kdVar) {
        super(1);
        this.f57537zdlpuopuiu = kdVar;
    }

    @Override // tg.draadjrbmk
    public final Object invoke(Object obj) {
        this.f57537zdlpuopuiu.requireActivity().startActivity(new Intent("android.intent.action.VIEW", (Uri) obj));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
