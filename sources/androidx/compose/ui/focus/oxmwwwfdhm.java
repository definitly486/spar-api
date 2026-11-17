package androidx.compose.ui.focus;

/* JADX INFO: loaded from: classes.dex */
public abstract class oxmwwwfdhm {
    public static final vdvldrhtss iobyxmoadg(int i13, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        return new FocusTargetNode(i13, rgvfuqvkyqVar, null, 4, null);
    }

    public static /* synthetic */ vdvldrhtss zoijcleaow(int i13, tg.rgvfuqvkyq rgvfuqvkyqVar, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = yggfygwlhe.f6268iobyxmoadg.iobyxmoadg();
        }
        if ((i14 & 2) != 0) {
            rgvfuqvkyqVar = null;
        }
        return iobyxmoadg(i13, rgvfuqvkyqVar);
    }
}
