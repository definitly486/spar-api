package bc2;

import android.content.Context;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iobyxmoadg {
    public static final boolean iobyxmoadg(Context context, String permissionName) {
        zdlpuopuiu.btonecajqb(context, "<this>");
        zdlpuopuiu.btonecajqb(permissionName, "permissionName");
        return context.checkSelfPermission(permissionName) == 0;
    }
}
