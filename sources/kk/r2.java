package kk;

import android.content.Context;
import android.content.Intent;
import npi.spay.I0;
import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
public final class r2 extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ I0 f58260zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(I0 i13) {
        super(1);
        this.f58260zdlpuopuiu = i13;
    }

    @Override // tg.draadjrbmk
    public final Object invoke(Object obj) {
        vu message = (vu) obj;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(message, "message");
        I0 i13 = this.f58260zdlpuopuiu;
        int i14 = I0.f70549cqumvgiudr;
        i13.getClass();
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            Context contextRequireContext = i13.requireContext();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext()");
            intent.putExtra("android.intent.extra.TEXT", zv.iobyxmoadg(message, contextRequireContext));
            i13.startActivity(Intent.createChooser(intent, i13.getString(R.string.spay_bnpl_share_link_choose_application)));
        } catch (Exception e13) {
            jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("SHARE LINK EXCEPTION").ppxfxbqfkf(e13);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
