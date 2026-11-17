package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.google.common.collect.zdlpuopuiu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import v2.iwizpuwonk;
import y2.kcexrzcfyt;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public abstract class MediaCodecUtil {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final HashMap f10792iobyxmoadg = new HashMap();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static int f10793zoijcleaow = -1;

    public static class DecoderQueryException extends Exception {
        private DecoderQueryException(Throwable th2) {
            super("Failed to query underlying media codecs", th2);
        }
    }

    private static final class eablkybsjg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f10794iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private MediaCodecInfo[] f10795zoijcleaow;

        public eablkybsjg(boolean z13, boolean z14, boolean z15) {
            this.f10794iobyxmoadg = (z13 || z14 || z15) ? 1 : 0;
        }

        private void gxszxtbevo() {
            if (this.f10795zoijcleaow == null) {
                this.f10795zoijcleaow = new MediaCodecList(this.f10794iobyxmoadg).getCodecInfos();
            }
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.ppxfxbqfkf
        public boolean eablkybsjg() {
            return true;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.ppxfxbqfkf
        public MediaCodecInfo iobyxmoadg(int i13) {
            gxszxtbevo();
            return this.f10795zoijcleaow[i13];
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.ppxfxbqfkf
        public boolean ppxfxbqfkf(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.ppxfxbqfkf
        public int wkgbmnqykc() {
            gxszxtbevo();
            return this.f10795zoijcleaow.length;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.ppxfxbqfkf
        public boolean zoijcleaow(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface gxszxtbevo {
        int iobyxmoadg(Object obj);
    }

    private interface ppxfxbqfkf {
        boolean eablkybsjg();

        MediaCodecInfo iobyxmoadg(int i13);

        boolean ppxfxbqfkf(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        int wkgbmnqykc();

        boolean zoijcleaow(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);
    }

    private static final class wkgbmnqykc implements ppxfxbqfkf {
        private wkgbmnqykc() {
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.ppxfxbqfkf
        public boolean eablkybsjg() {
            return false;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.ppxfxbqfkf
        public MediaCodecInfo iobyxmoadg(int i13) {
            return MediaCodecList.getCodecInfoAt(i13);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.ppxfxbqfkf
        public boolean ppxfxbqfkf(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.ppxfxbqfkf
        public int wkgbmnqykc() {
            return MediaCodecList.getCodecCount();
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.ppxfxbqfkf
        public boolean zoijcleaow(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }
    }

    private static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final String f10796iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final boolean f10797ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final boolean f10798zoijcleaow;

        public zoijcleaow(String str, boolean z13, boolean z14) {
            this.f10796iobyxmoadg = str;
            this.f10798zoijcleaow = z13;
            this.f10797ppxfxbqfkf = z14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != zoijcleaow.class) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return TextUtils.equals(this.f10796iobyxmoadg, zoijcleaowVar.f10796iobyxmoadg) && this.f10798zoijcleaow == zoijcleaowVar.f10798zoijcleaow && this.f10797ppxfxbqfkf == zoijcleaowVar.f10797ppxfxbqfkf;
        }

        public int hashCode() {
            return ((((this.f10796iobyxmoadg.hashCode() + 31) * 31) + (this.f10798zoijcleaow ? 1231 : 1237)) * 31) + (this.f10797ppxfxbqfkf ? 1231 : 1237);
        }
    }

    public static List agtfadlqog(List list, final androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        ArrayList arrayList = new ArrayList(list);
        yadqdtsiqt(arrayList, new gxszxtbevo() { // from class: androidx.media3.exoplayer.mediacodec.agtfadlqog
            @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.gxszxtbevo
            public final int iobyxmoadg(Object obj) {
                return MediaCodecUtil.zynmafqrjb(iobyxmoadgVar, (btonecajqb) obj);
            }
        });
        return arrayList;
    }

    public static btonecajqb btonecajqb(String str, boolean z13, boolean z14) {
        List listGtknphoqwx = gtknphoqwx(str, z13, z14);
        if (listGtknphoqwx.isEmpty()) {
            return null;
        }
        return (btonecajqb) listGtknphoqwx.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int cdpycssgdh(gxszxtbevo gxszxtbevoVar, Object obj, Object obj2) {
        return gxszxtbevoVar.iobyxmoadg(obj2) - gxszxtbevoVar.iobyxmoadg(obj);
    }

    private static boolean cqumvgiudr(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0105 A[Catch: Exception -> 0x012e, TRY_ENTER, TryCatch #1 {Exception -> 0x012e, blocks: (B:3:0x0008, B:5:0x001b, B:61:0x0124, B:8:0x002d, B:11:0x0038, B:55:0x00fd, B:58:0x0105, B:60:0x010b, B:64:0x0130, B:65:0x0153), top: B:71:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    /* JADX WARN: Code duplicated, block: B:83:0x0130 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    private static ArrayList draadjrbmk(zoijcleaow zoijcleaowVar, ppxfxbqfkf ppxfxbqfkfVar) throws DecoderQueryException {
        String strNufgyqmvbu;
        String str;
        int i13;
        boolean z13;
        int i14;
        zoijcleaow zoijcleaowVar2 = zoijcleaowVar;
        try {
            ArrayList arrayList = new ArrayList();
            String str2 = zoijcleaowVar2.f10796iobyxmoadg;
            int iWkgbmnqykc = ppxfxbqfkfVar.wkgbmnqykc();
            boolean zEablkybsjg = ppxfxbqfkfVar.eablkybsjg();
            int i15 = 0;
            while (i15 < iWkgbmnqykc) {
                MediaCodecInfo mediaCodecInfoIobyxmoadg = ppxfxbqfkfVar.iobyxmoadg(i15);
                if (oxmwwwfdhm(mediaCodecInfoIobyxmoadg)) {
                    i13 = i15;
                    z13 = zEablkybsjg;
                    i14 = iWkgbmnqykc;
                } else {
                    String name = mediaCodecInfoIobyxmoadg.getName();
                    if (zdlpuopuiu(mediaCodecInfoIobyxmoadg, name, zEablkybsjg, str2) && (strNufgyqmvbu = nufgyqmvbu(mediaCodecInfoIobyxmoadg, name, str2)) != null) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoIobyxmoadg.getCapabilitiesForType(strNufgyqmvbu);
                            boolean zZoijcleaow = ppxfxbqfkfVar.zoijcleaow("tunneled-playback", strNufgyqmvbu, capabilitiesForType);
                            boolean zPpxfxbqfkf = ppxfxbqfkfVar.ppxfxbqfkf("tunneled-playback", strNufgyqmvbu, capabilitiesForType);
                            boolean z14 = zoijcleaowVar2.f10797ppxfxbqfkf;
                            if ((z14 || !zPpxfxbqfkf) && (!z14 || zZoijcleaow)) {
                                boolean zZoijcleaow2 = ppxfxbqfkfVar.zoijcleaow("secure-playback", strNufgyqmvbu, capabilitiesForType);
                                boolean zPpxfxbqfkf2 = ppxfxbqfkfVar.ppxfxbqfkf("secure-playback", strNufgyqmvbu, capabilitiesForType);
                                boolean z15 = zoijcleaowVar2.f10798zoijcleaow;
                                if ((z15 || !zPpxfxbqfkf2) && (!z15 || zZoijcleaow2)) {
                                    boolean zYggfygwlhe = yggfygwlhe(mediaCodecInfoIobyxmoadg, str2);
                                    boolean zIwizpuwonk = iwizpuwonk(mediaCodecInfoIobyxmoadg, str2);
                                    boolean zEsjtqupxsv = esjtqupxsv(mediaCodecInfoIobyxmoadg);
                                    if (zEablkybsjg && zoijcleaowVar2.f10798zoijcleaow == zZoijcleaow2) {
                                        i13 = i15;
                                        z13 = zEablkybsjg;
                                        i14 = iWkgbmnqykc;
                                        arrayList.add(btonecajqb.cdpycssgdh(name, str2, strNufgyqmvbu, capabilitiesForType, zYggfygwlhe, zIwizpuwonk, zEsjtqupxsv, false, false));
                                    } else {
                                        if (!zEablkybsjg) {
                                            try {
                                                if (!zoijcleaowVar2.f10798zoijcleaow) {
                                                    i13 = i15;
                                                    z13 = zEablkybsjg;
                                                    i14 = iWkgbmnqykc;
                                                    try {
                                                        arrayList.add(btonecajqb.cdpycssgdh(name, str2, strNufgyqmvbu, capabilitiesForType, zYggfygwlhe, zIwizpuwonk, zEsjtqupxsv, false, false));
                                                    } catch (Exception e13) {
                                                        e = e13;
                                                        str = name;
                                                        if (stevsuqkhv.f123602iobyxmoadg <= 23) {
                                                        }
                                                        kcexrzcfyt.ppxfxbqfkf("MediaCodecUtil", "Failed to query codec " + str + " (" + strNufgyqmvbu + ")");
                                                        throw e;
                                                    }
                                                }
                                            } catch (Exception e14) {
                                                e = e14;
                                                i13 = i15;
                                                z13 = zEablkybsjg;
                                                i14 = iWkgbmnqykc;
                                                str = name;
                                                if (stevsuqkhv.f123602iobyxmoadg <= 23 || arrayList.isEmpty()) {
                                                    kcexrzcfyt.ppxfxbqfkf("MediaCodecUtil", "Failed to query codec " + str + " (" + strNufgyqmvbu + ")");
                                                    throw e;
                                                }
                                                kcexrzcfyt.ppxfxbqfkf("MediaCodecUtil", "Skipping codec " + str + " (failed to query capabilities)");
                                                i15 = i13 + 1;
                                                zoijcleaowVar2 = zoijcleaowVar;
                                                iWkgbmnqykc = i14;
                                                zEablkybsjg = z13;
                                            }
                                        }
                                        strNufgyqmvbu = strNufgyqmvbu;
                                        i13 = i15;
                                        z13 = zEablkybsjg;
                                        i14 = iWkgbmnqykc;
                                        if (!z13 && zZoijcleaow2) {
                                            StringBuilder sb3 = new StringBuilder();
                                            try {
                                                sb3.append(name);
                                                sb3.append(".secure");
                                                str = name;
                                                try {
                                                    arrayList.add(btonecajqb.cdpycssgdh(sb3.toString(), str2, strNufgyqmvbu, capabilitiesForType, zYggfygwlhe, zIwizpuwonk, zEsjtqupxsv, false, true));
                                                    return arrayList;
                                                } catch (Exception e15) {
                                                    e = e15;
                                                    if (stevsuqkhv.f123602iobyxmoadg <= 23) {
                                                    }
                                                    kcexrzcfyt.ppxfxbqfkf("MediaCodecUtil", "Failed to query codec " + str + " (" + strNufgyqmvbu + ")");
                                                    throw e;
                                                }
                                            } catch (Exception e16) {
                                                e = e16;
                                                str = name;
                                            }
                                        }
                                    }
                                } else {
                                    i13 = i15;
                                    z13 = zEablkybsjg;
                                    i14 = iWkgbmnqykc;
                                }
                            } else {
                                i13 = i15;
                                z13 = zEablkybsjg;
                                i14 = iWkgbmnqykc;
                            }
                        } catch (Exception e17) {
                            e = e17;
                            strNufgyqmvbu = strNufgyqmvbu;
                            str = name;
                            i13 = i15;
                            z13 = zEablkybsjg;
                            i14 = iWkgbmnqykc;
                        }
                    } else {
                        i13 = i15;
                        z13 = zEablkybsjg;
                        i14 = iWkgbmnqykc;
                    }
                }
                i15 = i13 + 1;
                zoijcleaowVar2 = zoijcleaowVar;
                iWkgbmnqykc = i14;
                zEablkybsjg = z13;
            }
            return arrayList;
        } catch (Exception e18) {
            throw new DecoderQueryException(e18);
        }
    }

    public static Pair dxjokdxxww(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        return y2.btonecajqb.agtfadlqog(iobyxmoadgVar);
    }

    private static void eablkybsjg(String str, List list) {
        if ("audio/raw".equals(str)) {
            if (stevsuqkhv.f123602iobyxmoadg < 26 && Build.DEVICE.equals("R9") && list.size() == 1 && ((btonecajqb) list.get(0)).f10806iobyxmoadg.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(btonecajqb.cdpycssgdh("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            yadqdtsiqt(list, new gxszxtbevo() { // from class: androidx.media3.exoplayer.mediacodec.wflxmlrfwp
                @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.gxszxtbevo
                public final int iobyxmoadg(Object obj) {
                    return MediaCodecUtil.pmvmpeiblj((btonecajqb) obj);
                }
            });
        }
        if (stevsuqkhv.f123602iobyxmoadg >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((btonecajqb) list.get(0)).f10806iobyxmoadg)) {
            return;
        }
        list.add((btonecajqb) list.remove(0));
    }

    private static boolean esjtqupxsv(MediaCodecInfo mediaCodecInfo) {
        if (stevsuqkhv.f123602iobyxmoadg >= 29) {
            return lereixgezr(mediaCodecInfo);
        }
        String strEablkybsjg = xa.zoijcleaow.eablkybsjg(mediaCodecInfo.getName());
        return (strEablkybsjg.startsWith("omx.google.") || strEablkybsjg.startsWith("c2.android.") || strEablkybsjg.startsWith("c2.google.")) ? false : true;
    }

    public static synchronized List gtknphoqwx(String str, boolean z13, boolean z14) {
        try {
            zoijcleaow zoijcleaowVar = new zoijcleaow(str, z13, z14);
            HashMap map = f10792iobyxmoadg;
            List list = (List) map.get(zoijcleaowVar);
            if (list != null) {
                return list;
            }
            ArrayList arrayListDraadjrbmk = draadjrbmk(zoijcleaowVar, new eablkybsjg(z13, z14, str.equals("video/mv-hevc")));
            if (z13 && arrayListDraadjrbmk.isEmpty() && stevsuqkhv.f123602iobyxmoadg <= 23) {
                arrayListDraadjrbmk = draadjrbmk(zoijcleaowVar, new wkgbmnqykc());
                if (!arrayListDraadjrbmk.isEmpty()) {
                    kcexrzcfyt.nufgyqmvbu("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((btonecajqb) arrayListDraadjrbmk.get(0)).f10806iobyxmoadg);
                }
            }
            eablkybsjg(str, arrayListDraadjrbmk);
            zdlpuopuiu zdlpuopuiuVarJyumaefscl = zdlpuopuiu.jyumaefscl(arrayListDraadjrbmk);
            map.put(zoijcleaowVar, zdlpuopuiuVarJyumaefscl);
            return zdlpuopuiuVarJyumaefscl;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static String gxszxtbevo(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        Pair pairDxjokdxxww;
        if ("audio/eac3-joc".equals(iobyxmoadgVar.f9769ojitshcjhn)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(iobyxmoadgVar.f9769ojitshcjhn) && (pairDxjokdxxww = dxjokdxxww(iobyxmoadgVar)) != null) {
            int iIntValue = ((Integer) pairDxjokdxxww.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(iobyxmoadgVar.f9769ojitshcjhn)) {
            return "video/hevc";
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int istkbnxepw(btonecajqb btonecajqbVar) {
        return (btonecajqbVar.f10802dxjokdxxww ? 2 : 0) + (!btonecajqbVar.f10800btonecajqb ? 1 : 0);
    }

    private static boolean iwizpuwonk(MediaCodecInfo mediaCodecInfo, String str) {
        if (stevsuqkhv.f123602iobyxmoadg >= 29) {
            return cqumvgiudr(mediaCodecInfo);
        }
        if (iwizpuwonk.agtfadlqog(str)) {
            return true;
        }
        String strEablkybsjg = xa.zoijcleaow.eablkybsjg(mediaCodecInfo.getName());
        if (strEablkybsjg.startsWith("arc.")) {
            return false;
        }
        if (strEablkybsjg.startsWith("omx.google.") || strEablkybsjg.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strEablkybsjg.startsWith("omx.sec.") && strEablkybsjg.contains(".sw.")) || strEablkybsjg.equals("omx.qcom.video.decoder.hevcswvdec") || strEablkybsjg.startsWith("c2.android.") || strEablkybsjg.startsWith("c2.google.")) {
            return true;
        }
        return (strEablkybsjg.startsWith("omx.") || strEablkybsjg.startsWith("c2.")) ? false : true;
    }

    private static boolean jyumaefscl(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    private static boolean kcexrzcfyt(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    private static boolean lereixgezr(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    public static List lqeggnwhkg(draadjrbmk draadjrbmkVar, androidx.media3.common.iobyxmoadg iobyxmoadgVar, boolean z13, boolean z14) {
        String strGxszxtbevo = gxszxtbevo(iobyxmoadgVar);
        return strGxszxtbevo == null ? zdlpuopuiu.zynmafqrjb() : draadjrbmkVar.zoijcleaow(strGxszxtbevo, z13, z14);
    }

    private static String nufgyqmvbu(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    public static List ojitshcjhn(List list) {
        ArrayList arrayList = new ArrayList(list);
        yadqdtsiqt(arrayList, new gxszxtbevo() { // from class: androidx.media3.exoplayer.mediacodec.ojitshcjhn
            @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.gxszxtbevo
            public final int iobyxmoadg(Object obj) {
                return MediaCodecUtil.istkbnxepw((btonecajqb) obj);
            }
        });
        return zdlpuopuiu.jyumaefscl(arrayList);
    }

    private static boolean oxmwwwfdhm(MediaCodecInfo mediaCodecInfo) {
        return stevsuqkhv.f123602iobyxmoadg >= 29 && kcexrzcfyt(mediaCodecInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int pmvmpeiblj(btonecajqb btonecajqbVar) {
        String str = btonecajqbVar.f10806iobyxmoadg;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (stevsuqkhv.f123602iobyxmoadg >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    public static btonecajqb rgvfuqvkyq() {
        return btonecajqb("audio/raw", false, false);
    }

    public static Pair vdvldrhtss(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        String strNufgyqmvbu = z2.gxszxtbevo.nufgyqmvbu(iobyxmoadgVar.f9770oxmwwwfdhm);
        if (strNufgyqmvbu == null) {
            return null;
        }
        return y2.btonecajqb.vdvldrhtss(strNufgyqmvbu, stevsuqkhv.k(strNufgyqmvbu.trim(), "\\."), iobyxmoadgVar.f9760istkbnxepw);
    }

    public static List wflxmlrfwp(draadjrbmk draadjrbmkVar, androidx.media3.common.iobyxmoadg iobyxmoadgVar, boolean z13, boolean z14) {
        List listZoijcleaow = draadjrbmkVar.zoijcleaow(iobyxmoadgVar.f9769ojitshcjhn, z13, z14);
        return zdlpuopuiu.kcexrzcfyt().btonecajqb(listZoijcleaow).btonecajqb(lqeggnwhkg(draadjrbmkVar, iobyxmoadgVar, z13, z14)).gtknphoqwx();
    }

    private static void yadqdtsiqt(List list, final gxszxtbevo gxszxtbevoVar) {
        Collections.sort(list, new Comparator() { // from class: androidx.media3.exoplayer.mediacodec.rgvfuqvkyq
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return MediaCodecUtil.cdpycssgdh(gxszxtbevoVar, obj, obj2);
            }
        });
    }

    private static boolean yggfygwlhe(MediaCodecInfo mediaCodecInfo, String str) {
        return stevsuqkhv.f123602iobyxmoadg >= 29 ? jyumaefscl(mediaCodecInfo) : !iwizpuwonk(mediaCodecInfo, str);
    }

    private static boolean zdlpuopuiu(MediaCodecInfo mediaCodecInfo, String str, boolean z13, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z13 && str.endsWith(".secure"))) {
            return false;
        }
        int i13 = stevsuqkhv.f123602iobyxmoadg;
        if (i13 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(Build.MANUFACTURER))) {
            String str3 = Build.DEVICE;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        return (i13 <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int zynmafqrjb(androidx.media3.common.iobyxmoadg iobyxmoadgVar, btonecajqb btonecajqbVar) {
        return btonecajqbVar.agtfadlqog(iobyxmoadgVar) ? 1 : 0;
    }
}
