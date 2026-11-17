package z;

/* JADX INFO: loaded from: classes.dex */
public abstract class cqumvgiudr {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long iobyxmoadg(float f13, boolean z13, boolean z14) {
        return oxmwwwfdhm.zoijcleaow((((z13 ? 1L : 0L) | (z14 ? 2L : 0L)) & 4294967295L) | (((long) Float.floatToRawIntBits(f13)) << 32));
    }

    static /* synthetic */ long zoijcleaow(float f13, boolean z13, boolean z14, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            z14 = false;
        }
        return iobyxmoadg(f13, z13, z14);
    }
}
