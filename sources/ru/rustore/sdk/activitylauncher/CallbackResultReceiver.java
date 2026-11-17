package ru.rustore.sdk.activitylauncher;

import android.os.Bundle;
import android.os.ResultReceiver;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/rustore/sdk/activitylauncher/CallbackResultReceiver;", "Landroid/os/ResultReceiver;", "Lib2/zoijcleaow;", "callback", "<init>", "(Lib2/zoijcleaow;)V", "", "resultCode", "Landroid/os/Bundle;", "resultData", "Lgg/wwaezpbzkn;", "onReceiveResult", "(ILandroid/os/Bundle;)V", "zdlpuopuiu", "Lib2/zoijcleaow;", "sdk-public-activitylauncher_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class CallbackResultReceiver extends ResultReceiver {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private final ib2.zoijcleaow callback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallbackResultReceiver(ib2.zoijcleaow callback) {
        super(null);
        zdlpuopuiu.btonecajqb(callback, "callback");
        this.callback = callback;
    }

    @Override // android.os.ResultReceiver
    protected void onReceiveResult(int resultCode, Bundle resultData) {
        super.onReceiveResult(resultCode, resultData);
        this.callback.iobyxmoadg(new zoijcleaow().iobyxmoadg(resultCode), resultData);
    }
}
