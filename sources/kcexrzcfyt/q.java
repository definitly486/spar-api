package kcexrzcfyt;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f54962iobyxmoadg;

        static {
            int[] iArr = new int[androidx.camera.core.impl.cdpycssgdh.zoijcleaow.values().length];
            f54962iobyxmoadg = iArr;
            try {
                iArr[androidx.camera.core.impl.cdpycssgdh.zoijcleaow.IMAGE_CAPTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54962iobyxmoadg[androidx.camera.core.impl.cdpycssgdh.zoijcleaow.VIDEO_CAPTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f54962iobyxmoadg[androidx.camera.core.impl.cdpycssgdh.zoijcleaow.STREAM_SHARING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f54962iobyxmoadg[androidx.camera.core.impl.cdpycssgdh.zoijcleaow.PREVIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f54962iobyxmoadg[androidx.camera.core.impl.cdpycssgdh.zoijcleaow.IMAGE_ANALYSIS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static int iobyxmoadg(androidx.camera.core.impl.cdpycssgdh.zoijcleaow zoijcleaowVar, int i13) {
        int i14 = iobyxmoadg.f54962iobyxmoadg[zoijcleaowVar.ordinal()];
        if (i14 != 1) {
            return i14 != 2 ? 1 : 3;
        }
        return i13 == 2 ? 5 : 2;
    }

    public static int zoijcleaow(androidx.camera.core.impl.cdpycssgdh.zoijcleaow zoijcleaowVar, int i13) {
        int i14 = iobyxmoadg.f54962iobyxmoadg[zoijcleaowVar.ordinal()];
        if (i14 != 1) {
            return i14 != 2 ? 1 : 3;
        }
        return i13 == 2 ? 5 : 1;
    }
}
