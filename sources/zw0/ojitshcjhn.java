package zw0;

import android.content.Context;
import android.location.LocationManager;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class ojitshcjhn {
    public final LocationManager iobyxmoadg(Context context) {
        zdlpuopuiu.btonecajqb(context, "context");
        Object systemService = context.getSystemService("location");
        zdlpuopuiu.nufgyqmvbu(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        return (LocationManager) systemService;
    }
}
