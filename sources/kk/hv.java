package kk;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class hv {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final String f56964iobyxmoadg;

    static {
        String str;
        switch (lq.iobyxmoadg(ag.f55814zoijcleaow)) {
            case 0:
            case 5:
            case 6:
                str = "aHR0cHM6Ly9pZC5zYmVyLnJ1Lw==";
                break;
            case 1:
                str = "aHR0cHM6Ly9pZC1wc2kuc2Jlci5ydS8=";
                break;
            case 2:
            case 3:
            case 4:
                str = "aHR0cHM6Ly9pZC1pZnQuc2Jlci5ydS8=";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        f56964iobyxmoadg = str;
    }

    public static String iobyxmoadg() {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb("token-exchange", "path");
        return ir.ppxfxbqfkf(f56964iobyxmoadg) + "token-exchange";
    }
}
