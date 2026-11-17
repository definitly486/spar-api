package kj;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final ConcurrentHashMap f55722iobyxmoadg = new ConcurrentHashMap();

    public static final Void iobyxmoadg(String message) {
        zdlpuopuiu.btonecajqb(message, "message");
        throw new IllegalStateException(message.toString());
    }

    public static /* synthetic */ Void zoijcleaow(String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = "should not be called";
        }
        return iobyxmoadg(str);
    }
}
