package kk;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import spay.sdk.RedirectActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class gi0 extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ Context f56713zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi0(Context context) {
        super(1);
        this.f56713zdlpuopuiu = context;
    }

    @Override // tg.draadjrbmk
    public final Object invoke(Object obj) {
        String it = (String) obj;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        Context context = this.f56713zdlpuopuiu;
        Uri uri = Uri.parse("spaysdk://payment");
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(uri, "parse(this)");
        Intent intent = new Intent("android.intent.action.VIEW", uri, this.f56713zdlpuopuiu, RedirectActivity.class);
        bh0 block = new bh0(intent);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(block, "block");
        context.startActivity(intent);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
