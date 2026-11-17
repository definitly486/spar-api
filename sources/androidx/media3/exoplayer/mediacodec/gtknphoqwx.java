package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodecInfo;
import java.util.List;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
abstract class gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static Boolean f10829iobyxmoadg;

    private static final class iobyxmoadg {
        public static int iobyxmoadg(MediaCodecInfo.VideoCapabilities videoCapabilities, int i13, int i14, double d13) {
            List supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
                return 0;
            }
            k3.draadjrbmk.iobyxmoadg();
            int iPpxfxbqfkf = ppxfxbqfkf(supportedPerformancePoints, k3.gtknphoqwx.iobyxmoadg(i13, i14, (int) d13));
            if (iPpxfxbqfkf == 1 && gtknphoqwx.f10829iobyxmoadg == null) {
                Boolean unused = gtknphoqwx.f10829iobyxmoadg = Boolean.valueOf(wkgbmnqykc());
                if (gtknphoqwx.f10829iobyxmoadg.booleanValue()) {
                    return 0;
                }
            }
            return iPpxfxbqfkf;
        }

        private static int ppxfxbqfkf(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
            for (int i13 = 0; i13 < list.size(); i13++) {
                if (k3.wflxmlrfwp.iobyxmoadg(list.get(i13)).covers(performancePoint)) {
                    return 2;
                }
            }
            return 1;
        }

        private static boolean wkgbmnqykc() {
            if (stevsuqkhv.f123602iobyxmoadg >= 35) {
                return false;
            }
            int iZoijcleaow = zoijcleaow(false);
            int iZoijcleaow2 = zoijcleaow(true);
            if (iZoijcleaow == 0) {
                return true;
            }
            if (iZoijcleaow2 == 0) {
                return iZoijcleaow != 2;
            }
            return (iZoijcleaow == 2 && iZoijcleaow2 == 2) ? false : true;
        }

        private static int zoijcleaow(boolean z13) {
            List supportedPerformancePoints;
            try {
                androidx.media3.common.iobyxmoadg iobyxmoadgVarCllcsxoeiz = new androidx.media3.common.iobyxmoadg.zoijcleaow().zeieaojujs("video/avc").cllcsxoeiz();
                if (iobyxmoadgVarCllcsxoeiz.f9769ojitshcjhn != null) {
                    List listWflxmlrfwp = MediaCodecUtil.wflxmlrfwp(draadjrbmk.f10812iobyxmoadg, iobyxmoadgVarCllcsxoeiz, z13, false);
                    for (int i13 = 0; i13 < listWflxmlrfwp.size(); i13++) {
                        if (((btonecajqb) listWflxmlrfwp.get(i13)).f10810wkgbmnqykc != null && ((btonecajqb) listWflxmlrfwp.get(i13)).f10810wkgbmnqykc.getVideoCapabilities() != null && (supportedPerformancePoints = ((btonecajqb) listWflxmlrfwp.get(i13)).f10810wkgbmnqykc.getVideoCapabilities().getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                            k3.draadjrbmk.iobyxmoadg();
                            return ppxfxbqfkf(supportedPerformancePoints, k3.gtknphoqwx.iobyxmoadg(1280, 720, 60));
                        }
                    }
                }
            } catch (MediaCodecUtil.DecoderQueryException unused) {
            }
            return 0;
        }
    }

    public static int ppxfxbqfkf(MediaCodecInfo.VideoCapabilities videoCapabilities, int i13, int i14, double d13) {
        if (stevsuqkhv.f123602iobyxmoadg < 29) {
            return 0;
        }
        Boolean bool = f10829iobyxmoadg;
        if (bool == null || !bool.booleanValue()) {
            return iobyxmoadg.iobyxmoadg(videoCapabilities, i13, i14, d13);
        }
        return 0;
    }
}
