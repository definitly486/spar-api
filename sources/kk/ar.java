package kk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
public final class ar extends BroadcastReceiver {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final xf0 f55834iobyxmoadg;

    public ar(xf0 result) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(result, "result");
        this.f55834iobyxmoadg = result;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode == -3956105) {
                if (action.equals("action_permissions_granted")) {
                    this.f55834iobyxmoadg.invoke("action_permissions_granted");
                    context.unregisterReceiver(this);
                    return;
                }
                return;
            }
            if (iHashCode == 456550495 && action.equals("action_permissions_denied")) {
                this.f55834iobyxmoadg.invoke("action_permissions_denied");
                context.unregisterReceiver(this);
            }
        }
    }
}
