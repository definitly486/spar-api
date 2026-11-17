package z;

/* JADX INFO: loaded from: classes.dex */
public abstract class hszhottldk {
    public static final kcexrzcfyt iobyxmoadg(float f13, float f14, float f15, float f16) {
        return new kcexrzcfyt(f13, f14, f15, f16, true, null);
    }

    public static /* synthetic */ long ppxfxbqfkf(int i13, int i14, int i15, int i16, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i13 = 0;
        }
        if ((i17 & 2) != 0) {
            i14 = 0;
        }
        if ((i17 & 4) != 0) {
            i15 = 0;
        }
        if ((i17 & 8) != 0) {
            i16 = 0;
        }
        return zoijcleaow(i13, i14, i15, i16);
    }

    public static final long zoijcleaow(int i13, int i14, int i15, int i16) {
        if (!(i13 >= 0 && i13 < 32768)) {
            w.iobyxmoadg.iobyxmoadg("Start must be in the range of 0 .. 32767");
        }
        if (!(i14 >= 0 && i14 < 32768)) {
            w.iobyxmoadg.iobyxmoadg("Top must be in the range of 0 .. 32767");
        }
        if (!(i15 >= 0 && i15 < 32768)) {
            w.iobyxmoadg.iobyxmoadg("End must be in the range of 0 .. 32767");
        }
        if (!(i16 >= 0 && i16 < 32768)) {
            w.iobyxmoadg.iobyxmoadg("Bottom must be in the range of 0 .. 32767");
        }
        return wizcaqwiak.wkgbmnqykc(wizcaqwiak.f127337iobyxmoadg.ppxfxbqfkf(i13, i14, i15, i16, true));
    }
}
