package androidx.media3.exoplayer.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Objects;
import v2.iwizpuwonk;
import y2.kcexrzcfyt;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class btonecajqb {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final boolean f10800btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final boolean f10801draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final boolean f10802dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final boolean f10803eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final boolean f10804gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final boolean f10805gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f10806iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final boolean f10807lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final boolean f10808nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final String f10809ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f10810wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final String f10811zoijcleaow;

    btonecajqb(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
        this.f10806iobyxmoadg = (String) y2.iobyxmoadg.eablkybsjg(str);
        this.f10811zoijcleaow = str2;
        this.f10809ppxfxbqfkf = str3;
        this.f10810wkgbmnqykc = codecCapabilities;
        this.f10808nufgyqmvbu = z13;
        this.f10802dxjokdxxww = z14;
        this.f10800btonecajqb = z15;
        this.f10803eablkybsjg = z16;
        this.f10805gxszxtbevo = z17;
        this.f10807lqeggnwhkg = z18;
        this.f10804gtknphoqwx = z19;
        this.f10801draadjrbmk = iwizpuwonk.vdvldrhtss(str2);
    }

    public static btonecajqb cdpycssgdh(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        return new btonecajqb(str, str2, str3, codecCapabilities, z13, z14, z15, (z16 || codecCapabilities == null || !nufgyqmvbu(codecCapabilities) || pmvmpeiblj(str)) ? false : true, codecCapabilities != null && zdlpuopuiu(codecCapabilities), z17 || (codecCapabilities != null && kcexrzcfyt(codecCapabilities)), wflxmlrfwp(codecCapabilities));
    }

    private static boolean cqumvgiudr(String str) {
        return "audio/opus".equals(str);
    }

    private boolean draadjrbmk(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        return (Objects.equals(iobyxmoadgVar.f9769ojitshcjhn, "audio/flac") && iobyxmoadgVar.f9766lmojexxdyd == 22 && stevsuqkhv.f123602iobyxmoadg < 34 && this.f10806iobyxmoadg.equals("c2.android.flac.decoder")) ? false : true;
    }

    private static boolean esjtqupxsv(String str) {
        return Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007d  */
    private boolean gtknphoqwx(androidx.media3.common.iobyxmoadg iobyxmoadgVar, boolean z13) {
        int i13 = 2;
        Pair pairDxjokdxxww = MediaCodecUtil.dxjokdxxww(iobyxmoadgVar);
        String str = iobyxmoadgVar.f9769ojitshcjhn;
        if (str != null && str.equals("video/mv-hevc")) {
            String strOxmwwwfdhm = iwizpuwonk.oxmwwwfdhm(this.f10809ppxfxbqfkf);
            if (strOxmwwwfdhm.equals("video/mv-hevc")) {
                return true;
            }
            if (strOxmwwwfdhm.equals("video/hevc")) {
                pairDxjokdxxww = MediaCodecUtil.vdvldrhtss(iobyxmoadgVar);
            }
        }
        if (pairDxjokdxxww == null) {
            return true;
        }
        int iIntValue = ((Integer) pairDxjokdxxww.first).intValue();
        int iIntValue2 = ((Integer) pairDxjokdxxww.second).intValue();
        if ("video/dolby-vision".equals(iobyxmoadgVar.f9769ojitshcjhn)) {
            String str2 = this.f10811zoijcleaow;
            str2.hashCode();
            switch (str2) {
                case "video/avc":
                    i13 = 8;
                case "video/av01":
                case "video/hevc":
                    iIntValue2 = 0;
                    break;
                default:
                    i13 = iIntValue;
                    break;
            }
        } else {
            i13 = iIntValue;
        }
        if (!this.f10801draadjrbmk && i13 != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrLqeggnwhkg = lqeggnwhkg();
        if (stevsuqkhv.f123602iobyxmoadg <= 23 && "video/x-vnd.on2.vp9".equals(this.f10811zoijcleaow) && codecProfileLevelArrLqeggnwhkg.length == 0) {
            codecProfileLevelArrLqeggnwhkg = gxszxtbevo(this.f10810wkgbmnqykc);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArrLqeggnwhkg) {
            if (codecProfileLevel.profile == i13 && ((codecProfileLevel.level >= iIntValue2 || !z13) && !zynmafqrjb(this.f10811zoijcleaow, i13))) {
                return true;
            }
        }
        iwizpuwonk("codec.profileLevel, " + iobyxmoadgVar.f9754gtknphoqwx + ", " + this.f10809ppxfxbqfkf);
        return false;
    }

    private static MediaCodecInfo.CodecProfileLevel[] gxszxtbevo(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        int i13;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int iIntValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
        if (iIntValue >= 180000000) {
            i13 = UserVerificationMethods.USER_VERIFY_ALL;
        } else if (iIntValue >= 120000000) {
            i13 = UserVerificationMethods.USER_VERIFY_NONE;
        } else if (iIntValue >= 60000000) {
            i13 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
        } else if (iIntValue >= 30000000) {
            i13 = UserVerificationMethods.USER_VERIFY_PATTERN;
        } else if (iIntValue >= 18000000) {
            i13 = 64;
        } else if (iIntValue >= 12000000) {
            i13 = 32;
        } else if (iIntValue >= 7200000) {
            i13 = 16;
        } else if (iIntValue >= 3600000) {
            i13 = 8;
        } else if (iIntValue >= 1800000) {
            i13 = 4;
        } else {
            i13 = iIntValue >= 800000 ? 2 : 1;
        }
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i13;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    private static int iobyxmoadg(String str, String str2, int i13) {
        int i14;
        if (i13 > 1 || ((stevsuqkhv.f123602iobyxmoadg >= 26 && i13 > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i13;
        }
        if ("audio/ac3".equals(str2)) {
            i14 = 6;
        } else {
            i14 = "audio/eac3".equals(str2) ? 16 : 30;
        }
        kcexrzcfyt.nufgyqmvbu("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i13 + " to " + i14 + "]");
        return i14;
    }

    private static boolean istkbnxepw(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(Build.DEVICE)) ? false : true;
    }

    private void iwizpuwonk(String str) {
        kcexrzcfyt.zoijcleaow("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f10806iobyxmoadg + ", " + this.f10811zoijcleaow + "] [" + stevsuqkhv.f123599eablkybsjg + "]");
    }

    private void jyumaefscl(String str) {
        kcexrzcfyt.zoijcleaow("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f10806iobyxmoadg + ", " + this.f10811zoijcleaow + "] [" + stevsuqkhv.f123599eablkybsjg + "]");
    }

    private static boolean kcexrzcfyt(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean lereixgezr() {
        String str = Build.MANUFACTURER;
        return str.equals("Xiaomi") || str.equals("OPPO");
    }

    private static boolean nufgyqmvbu(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private static boolean pmvmpeiblj(String str) {
        if (stevsuqkhv.f123602iobyxmoadg <= 22) {
            String str2 = Build.MODEL;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    private boolean vdvldrhtss(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        return this.f10811zoijcleaow.equals(iobyxmoadgVar.f9769ojitshcjhn) || this.f10811zoijcleaow.equals(MediaCodecUtil.gxszxtbevo(iobyxmoadgVar));
    }

    private static boolean wflxmlrfwp(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return stevsuqkhv.f123602iobyxmoadg >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface") && !lereixgezr();
    }

    private static boolean wkgbmnqykc(MediaCodecInfo.VideoCapabilities videoCapabilities, int i13, int i14, double d13) {
        Point pointZoijcleaow = zoijcleaow(videoCapabilities, i13, i14);
        int i15 = pointZoijcleaow.x;
        int i16 = pointZoijcleaow.y;
        return (d13 == -1.0d || d13 < 1.0d) ? videoCapabilities.isSizeSupported(i15, i16) : videoCapabilities.areSizeAndRateSupported(i15, i16, Math.floor(d13));
    }

    private static boolean zdlpuopuiu(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private static Point zoijcleaow(MediaCodecInfo.VideoCapabilities videoCapabilities, int i13, int i14) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(stevsuqkhv.btonecajqb(i13, widthAlignment) * widthAlignment, stevsuqkhv.btonecajqb(i14, heightAlignment) * heightAlignment);
    }

    private static boolean zynmafqrjb(String str, int i13) {
        if ("video/hevc".equals(str) && 2 == i13) {
            String str2 = Build.DEVICE;
            if ("sailfish".equals(str2) || "marlin".equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public boolean agtfadlqog(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        return vdvldrhtss(iobyxmoadgVar) && gtknphoqwx(iobyxmoadgVar, false) && draadjrbmk(iobyxmoadgVar);
    }

    public boolean btonecajqb(int i13) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f10810wkgbmnqykc;
        if (codecCapabilities == null) {
            iwizpuwonk("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            iwizpuwonk("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i13)) {
            return true;
        }
        iwizpuwonk("sampleRate.support, " + i13);
        return false;
    }

    public boolean dxjokdxxww(int i13) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f10810wkgbmnqykc;
        if (codecCapabilities == null) {
            iwizpuwonk("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            iwizpuwonk("channelCount.aCaps");
            return false;
        }
        if (iobyxmoadg(this.f10806iobyxmoadg, this.f10811zoijcleaow, audioCapabilities.getMaxInputChannelCount()) >= i13) {
            return true;
        }
        iwizpuwonk("channelCount.support, " + i13);
        return false;
    }

    public f3.ppxfxbqfkf eablkybsjg(androidx.media3.common.iobyxmoadg iobyxmoadgVar, androidx.media3.common.iobyxmoadg iobyxmoadgVar2) {
        int i13 = !Objects.equals(iobyxmoadgVar.f9769ojitshcjhn, iobyxmoadgVar2.f9769ojitshcjhn) ? 8 : 0;
        if (this.f10801draadjrbmk) {
            if (iobyxmoadgVar.f9753esjtqupxsv != iobyxmoadgVar2.f9753esjtqupxsv) {
                i13 |= UserVerificationMethods.USER_VERIFY_ALL;
            }
            if (!this.f10803eablkybsjg && (iobyxmoadgVar.f9763jyumaefscl != iobyxmoadgVar2.f9763jyumaefscl || iobyxmoadgVar.f9761iwizpuwonk != iobyxmoadgVar2.f9761iwizpuwonk)) {
                i13 |= UserVerificationMethods.USER_VERIFY_NONE;
            }
            if ((!v2.dxjokdxxww.nufgyqmvbu(iobyxmoadgVar.f9760istkbnxepw) || !v2.dxjokdxxww.nufgyqmvbu(iobyxmoadgVar2.f9760istkbnxepw)) && !Objects.equals(iobyxmoadgVar.f9760istkbnxepw, iobyxmoadgVar2.f9760istkbnxepw)) {
                i13 |= 2048;
            }
            if (esjtqupxsv(this.f10806iobyxmoadg) && !iobyxmoadgVar.gxszxtbevo(iobyxmoadgVar2)) {
                i13 |= 2;
            }
            if (i13 == 0) {
                return new f3.ppxfxbqfkf(this.f10806iobyxmoadg, iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar.gxszxtbevo(iobyxmoadgVar2) ? 3 : 2, 0);
            }
        } else {
            if (iobyxmoadgVar.f9779yadqdtsiqt != iobyxmoadgVar2.f9779yadqdtsiqt) {
                i13 |= 4096;
            }
            if (iobyxmoadgVar.f9759iozdgvuglv != iobyxmoadgVar2.f9759iozdgvuglv) {
                i13 |= 8192;
            }
            if (iobyxmoadgVar.f9766lmojexxdyd != iobyxmoadgVar2.f9766lmojexxdyd) {
                i13 |= 16384;
            }
            if (i13 == 0 && "audio/mp4a-latm".equals(this.f10811zoijcleaow)) {
                Pair pairDxjokdxxww = MediaCodecUtil.dxjokdxxww(iobyxmoadgVar);
                Pair pairDxjokdxxww2 = MediaCodecUtil.dxjokdxxww(iobyxmoadgVar2);
                if (pairDxjokdxxww != null && pairDxjokdxxww2 != null) {
                    int iIntValue = ((Integer) pairDxjokdxxww.first).intValue();
                    int iIntValue2 = ((Integer) pairDxjokdxxww2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new f3.ppxfxbqfkf(this.f10806iobyxmoadg, iobyxmoadgVar, iobyxmoadgVar2, 3, 0);
                    }
                }
            }
            if (!iobyxmoadgVar.gxszxtbevo(iobyxmoadgVar2)) {
                i13 |= 32;
            }
            if (cqumvgiudr(this.f10811zoijcleaow)) {
                i13 |= 2;
            }
            if (i13 == 0) {
                return new f3.ppxfxbqfkf(this.f10806iobyxmoadg, iobyxmoadgVar, iobyxmoadgVar2, 1, 0);
            }
        }
        return new f3.ppxfxbqfkf(this.f10806iobyxmoadg, iobyxmoadgVar, iobyxmoadgVar2, 0, i13);
    }

    public MediaCodecInfo.CodecProfileLevel[] lqeggnwhkg() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f10810wkgbmnqykc;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean ojitshcjhn(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        int i13;
        if (!vdvldrhtss(iobyxmoadgVar) || !gtknphoqwx(iobyxmoadgVar, true) || !draadjrbmk(iobyxmoadgVar)) {
            return false;
        }
        if (this.f10801draadjrbmk) {
            int i14 = iobyxmoadgVar.f9763jyumaefscl;
            if (i14 <= 0 || (i13 = iobyxmoadgVar.f9761iwizpuwonk) <= 0) {
                return true;
            }
            return yggfygwlhe(i14, i13, iobyxmoadgVar.f9748cqumvgiudr);
        }
        int i15 = iobyxmoadgVar.f9759iozdgvuglv;
        if (i15 != -1 && !btonecajqb(i15)) {
            return false;
        }
        int i16 = iobyxmoadgVar.f9779yadqdtsiqt;
        return i16 == -1 || dxjokdxxww(i16);
    }

    public boolean oxmwwwfdhm(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        if (this.f10801draadjrbmk) {
            return this.f10803eablkybsjg;
        }
        Pair pairDxjokdxxww = MediaCodecUtil.dxjokdxxww(iobyxmoadgVar);
        return pairDxjokdxxww != null && ((Integer) pairDxjokdxxww.first).intValue() == 42;
    }

    public Point ppxfxbqfkf(int i13, int i14) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f10810wkgbmnqykc;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return zoijcleaow(videoCapabilities, i13, i14);
    }

    public boolean rgvfuqvkyq() {
        if (stevsuqkhv.f123602iobyxmoadg >= 29 && "video/x-vnd.on2.vp9".equals(this.f10811zoijcleaow)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : lqeggnwhkg()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public String toString() {
        return this.f10806iobyxmoadg;
    }

    public boolean yggfygwlhe(int i13, int i14, double d13) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f10810wkgbmnqykc;
        if (codecCapabilities == null) {
            iwizpuwonk("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            iwizpuwonk("sizeAndRate.vCaps");
            return false;
        }
        if (stevsuqkhv.f123602iobyxmoadg >= 29) {
            int iPpxfxbqfkf = gtknphoqwx.ppxfxbqfkf(videoCapabilities, i13, i14, d13);
            if (iPpxfxbqfkf == 2) {
                return true;
            }
            if (iPpxfxbqfkf == 1) {
                iwizpuwonk("sizeAndRate.cover, " + i13 + "x" + i14 + "@" + d13);
                return false;
            }
        }
        if (!wkgbmnqykc(videoCapabilities, i13, i14, d13)) {
            if (i13 >= i14 || !istkbnxepw(this.f10806iobyxmoadg) || !wkgbmnqykc(videoCapabilities, i14, i13, d13)) {
                iwizpuwonk("sizeAndRate.support, " + i13 + "x" + i14 + "@" + d13);
                return false;
            }
            jyumaefscl("sizeAndRate.rotated, " + i13 + "x" + i14 + "@" + d13);
        }
        return true;
    }
}
