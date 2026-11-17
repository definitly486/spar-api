package kk;

import android.content.Intent;
import android.net.Uri;
import npi.spay.Nb;

/* JADX INFO: loaded from: classes3.dex */
public final class ezmngbhpjk extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ Nb f56475zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezmngbhpjk(Nb nb3) {
        super(1);
        this.f56475zdlpuopuiu = nb3;
    }

    @Override // tg.draadjrbmk
    public final Object invoke(Object obj) {
        this.f56475zdlpuopuiu.requireActivity().startActivity(new Intent("android.intent.action.VIEW", (Uri) obj));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
