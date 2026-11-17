package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public final class ExoTimeoutException extends RuntimeException {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final int f10073zdlpuopuiu;

    public ExoTimeoutException(int i13) {
        super(iobyxmoadg(i13));
        this.f10073zdlpuopuiu = i13;
    }

    private static String iobyxmoadg(int i13) {
        if (i13 == 1) {
            return "Player release timed out.";
        }
        if (i13 != 2) {
            return i13 != 3 ? "Undefined timeout." : "Detaching surface timed out.";
        }
        return "Setting foreground mode timed out.";
    }
}
