package kk;

import android.content.Intent;
import java.io.PrintWriter;
import java.io.StringWriter;
import spay.sdk.RedirectActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class o00 extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ Throwable f57874yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ RedirectActivity f57875zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00(RedirectActivity redirectActivity, Throwable th2) {
        super(0);
        this.f57875zdlpuopuiu = redirectActivity;
        this.f57874yggfygwlhe = th2;
    }

    @Override // tg.iobyxmoadg
    public final Object invoke() {
        RedirectActivity redirectActivity = this.f57875zdlpuopuiu;
        Throwable exception = this.f57874yggfygwlhe;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(exception, "exception");
        int i13 = RedirectActivity.f107822g;
        redirectActivity.getClass();
        StringWriter stringWriter = new StringWriter();
        exception.printStackTrace(new PrintWriter(stringWriter));
        Intent intent = new Intent(redirectActivity.getBaseContext(), (Class<?>) ce.class);
        intent.addFlags(268435456);
        intent.putExtra("error_header", "Oops!");
        intent.putExtra("stack_trace", stringWriter.toString());
        redirectActivity.getApplicationContext().startActivity(intent);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
