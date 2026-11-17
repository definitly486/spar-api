package ru.rustore.sdk.activitylauncher;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ppxfxbqfkf {
    public static final void iobyxmoadg(Context context, Intent intent, ib2.zoijcleaow callback) {
        zdlpuopuiu.btonecajqb(context, "<this>");
        zdlpuopuiu.btonecajqb(intent, "intent");
        zdlpuopuiu.btonecajqb(callback, "callback");
        context.startActivity(RuStoreActivityLauncher.INSTANCE.iobyxmoadg(context, new CallbackResultReceiver(callback), intent));
    }
}
