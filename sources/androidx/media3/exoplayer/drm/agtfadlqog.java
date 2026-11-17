package androidx.media3.exoplayer.drm;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.text.TextUtils;
import androidx.media3.common.DrmInitData;
import g3.h0;
import i3.vdvldrhtss;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import y2.kcexrzcfyt;
import y2.stevsuqkhv;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
public final class agtfadlqog implements wflxmlrfwp {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final wflxmlrfwp.ppxfxbqfkf f10453wkgbmnqykc = new wflxmlrfwp.ppxfxbqfkf() { // from class: i3.agtfadlqog
        @Override // androidx.media3.exoplayer.drm.wflxmlrfwp.ppxfxbqfkf
        public final androidx.media3.exoplayer.drm.wflxmlrfwp iobyxmoadg(UUID uuid) {
            return androidx.media3.exoplayer.drm.agtfadlqog.istkbnxepw(uuid);
        }
    };

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final UUID f10454iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f10455ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final MediaDrm f10456zoijcleaow;

    private static class iobyxmoadg {
        public static boolean iobyxmoadg(MediaDrm mediaDrm, String str, int i13) {
            return mediaDrm.requiresSecureDecoder(str, i13);
        }

        public static void zoijcleaow(MediaDrm mediaDrm, byte[] bArr, h0 h0Var) {
            LogSessionId logSessionIdIobyxmoadg = h0Var.iobyxmoadg();
            if (logSessionIdIobyxmoadg.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            vdvldrhtss.iobyxmoadg(y2.iobyxmoadg.eablkybsjg(mediaDrm.getPlaybackComponent(bArr))).setLogSessionId(logSessionIdIobyxmoadg);
        }
    }

    private agtfadlqog(UUID uuid) {
        y2.iobyxmoadg.eablkybsjg(uuid);
        y2.iobyxmoadg.zoijcleaow(!v2.nufgyqmvbu.f115648zoijcleaow.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f10454iobyxmoadg = uuid;
        MediaDrm mediaDrm = new MediaDrm(yggfygwlhe(uuid));
        this.f10456zoijcleaow = mediaDrm;
        this.f10455ppxfxbqfkf = 1;
        if (v2.nufgyqmvbu.f115647wkgbmnqykc.equals(uuid) && cdpycssgdh()) {
            cqumvgiudr(mediaDrm);
        }
    }

    private static boolean cdpycssgdh() {
        return "ASUS_Z00AD".equals(Build.MODEL);
    }

    private static void cqumvgiudr(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ wflxmlrfwp istkbnxepw(UUID uuid) {
        try {
            return yadqdtsiqt(uuid);
        } catch (UnsupportedDrmException unused) {
            kcexrzcfyt.ppxfxbqfkf("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new gtknphoqwx();
        }
    }

    private static boolean jyumaefscl(UUID uuid) {
        return stevsuqkhv.f123602iobyxmoadg < 27 && Objects.equals(uuid, v2.nufgyqmvbu.f115646ppxfxbqfkf);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0074 A[RETURN] */
    private static byte[] kcexrzcfyt(UUID uuid, byte[] bArr) {
        byte[] bArrEablkybsjg;
        n4.rgvfuqvkyq.iobyxmoadg iobyxmoadgVarWkgbmnqykc;
        UUID uuid2 = v2.nufgyqmvbu.f115644eablkybsjg;
        if (uuid2.equals(uuid)) {
            byte[] bArrEablkybsjg2 = n4.rgvfuqvkyq.eablkybsjg(bArr, uuid);
            if (bArrEablkybsjg2 != null) {
                bArr = bArrEablkybsjg2;
            }
            bArr = n4.rgvfuqvkyq.iobyxmoadg(uuid2, rgvfuqvkyq(bArr));
        }
        if (jyumaefscl(uuid) && (iobyxmoadgVarWkgbmnqykc = n4.rgvfuqvkyq.wkgbmnqykc(bArr)) != null) {
            bArr = n4.rgvfuqvkyq.zoijcleaow(v2.nufgyqmvbu.f115648zoijcleaow, iobyxmoadgVarWkgbmnqykc.f68690wkgbmnqykc, iobyxmoadgVarWkgbmnqykc.f68689ppxfxbqfkf);
        }
        if (stevsuqkhv.f123602iobyxmoadg < 23 && v2.nufgyqmvbu.f115647wkgbmnqykc.equals(uuid)) {
            bArrEablkybsjg = n4.rgvfuqvkyq.eablkybsjg(bArr, uuid);
            if (bArrEablkybsjg != null) {
                return bArrEablkybsjg;
            }
        } else if (uuid2.equals(uuid) && "Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTB".equals(str) || "AFTS".equals(str) || "AFTM".equals(str) || "AFTT".equals(str)) {
                bArrEablkybsjg = n4.rgvfuqvkyq.eablkybsjg(bArr, uuid);
                if (bArrEablkybsjg != null) {
                    return bArrEablkybsjg;
                }
            }
        }
        return bArr;
    }

    private static DrmInitData.SchemeData lereixgezr(UUID uuid, List list) {
        if (!v2.nufgyqmvbu.f115647wkgbmnqykc.equals(uuid)) {
            return (DrmInitData.SchemeData) list.get(0);
        }
        if (stevsuqkhv.f123602iobyxmoadg >= 28 && list.size() > 1) {
            DrmInitData.SchemeData schemeData = (DrmInitData.SchemeData) list.get(0);
            int i13 = 0;
            int length = 0;
            while (true) {
                if (i13 >= list.size()) {
                    byte[] bArr = new byte[length];
                    int i14 = 0;
                    for (int i15 = 0; i15 < list.size(); i15++) {
                        byte[] bArr2 = (byte[]) y2.iobyxmoadg.eablkybsjg(((DrmInitData.SchemeData) list.get(i15)).f9623cqumvgiudr);
                        int length2 = bArr2.length;
                        System.arraycopy(bArr2, 0, bArr, i14, length2);
                        i14 += length2;
                    }
                    return schemeData.zoijcleaow(bArr);
                }
                DrmInitData.SchemeData schemeData2 = (DrmInitData.SchemeData) list.get(i13);
                byte[] bArr3 = (byte[]) y2.iobyxmoadg.eablkybsjg(schemeData2.f9623cqumvgiudr);
                if (!Objects.equals(schemeData2.f9624iwizpuwonk, schemeData.f9624iwizpuwonk) || !Objects.equals(schemeData2.f9625jyumaefscl, schemeData.f9625jyumaefscl) || !n4.rgvfuqvkyq.ppxfxbqfkf(bArr3)) {
                    break;
                }
                length += bArr3.length;
                i13++;
            }
        }
        for (int i16 = 0; i16 < list.size(); i16++) {
            DrmInitData.SchemeData schemeData3 = (DrmInitData.SchemeData) list.get(i16);
            int iLqeggnwhkg = n4.rgvfuqvkyq.lqeggnwhkg((byte[]) y2.iobyxmoadg.eablkybsjg(schemeData3.f9623cqumvgiudr));
            int i17 = stevsuqkhv.f123602iobyxmoadg;
            if (i17 < 23 && iLqeggnwhkg == 0) {
                return schemeData3;
            }
            if (i17 >= 23 && iLqeggnwhkg == 1) {
                return schemeData3;
            }
        }
        return (DrmInitData.SchemeData) list.get(0);
    }

    private static byte[] oxmwwwfdhm(UUID uuid, byte[] bArr) {
        return v2.nufgyqmvbu.f115646ppxfxbqfkf.equals(uuid) ? androidx.media3.exoplayer.drm.iobyxmoadg.iobyxmoadg(bArr) : bArr;
    }

    private boolean pmvmpeiblj() {
        if (!this.f10454iobyxmoadg.equals(v2.nufgyqmvbu.f115647wkgbmnqykc)) {
            return this.f10454iobyxmoadg.equals(v2.nufgyqmvbu.f115646ppxfxbqfkf);
        }
        String strEsjtqupxsv = esjtqupxsv("version");
        return (strEsjtqupxsv.startsWith("v5.") || strEsjtqupxsv.startsWith("14.") || strEsjtqupxsv.startsWith("15.") || strEsjtqupxsv.startsWith("16.0")) ? false : true;
    }

    private static byte[] rgvfuqvkyq(byte[] bArr) {
        yadqdtsiqt yadqdtsiqtVar = new yadqdtsiqt(bArr);
        int iYggfygwlhe = yadqdtsiqtVar.yggfygwlhe();
        short sIwizpuwonk = yadqdtsiqtVar.iwizpuwonk();
        short sIwizpuwonk2 = yadqdtsiqtVar.iwizpuwonk();
        if (sIwizpuwonk != 1 || sIwizpuwonk2 != 1) {
            kcexrzcfyt.gxszxtbevo("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
            return bArr;
        }
        short sIwizpuwonk3 = yadqdtsiqtVar.iwizpuwonk();
        Charset charset = StandardCharsets.UTF_16LE;
        String strIozdgvuglv = yadqdtsiqtVar.iozdgvuglv(sIwizpuwonk3, charset);
        if (strIozdgvuglv.contains("<LA_URL>")) {
            return bArr;
        }
        int iIndexOf = strIozdgvuglv.indexOf("</DATA>");
        if (iIndexOf == -1) {
            kcexrzcfyt.nufgyqmvbu("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
        }
        String str = strIozdgvuglv.substring(0, iIndexOf) + "<LA_URL>https://x</LA_URL>" + strIozdgvuglv.substring(iIndexOf);
        int i13 = iYggfygwlhe + 52;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i13);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(i13);
        byteBufferAllocate.putShort(sIwizpuwonk);
        byteBufferAllocate.putShort(sIwizpuwonk2);
        byteBufferAllocate.putShort((short) (str.length() * 2));
        byteBufferAllocate.put(str.getBytes(charset));
        return byteBufferAllocate.array();
    }

    private String vdvldrhtss(String str) {
        if ("<LA_URL>https://x</LA_URL>".equals(str)) {
            return "";
        }
        if (stevsuqkhv.f123602iobyxmoadg >= 33 && "https://default.url".equals(str)) {
            String strEsjtqupxsv = esjtqupxsv("version");
            if (Objects.equals(strEsjtqupxsv, "1.2") || Objects.equals(strEsjtqupxsv, "aidl-1")) {
                return "";
            }
        }
        return str;
    }

    public static agtfadlqog yadqdtsiqt(UUID uuid) throws UnsupportedDrmException {
        try {
            return new agtfadlqog(uuid);
        } catch (UnsupportedSchemeException e13) {
            throw new UnsupportedDrmException(1, e13);
        } catch (Exception e14) {
            throw new UnsupportedDrmException(2, e14);
        }
    }

    private static UUID yggfygwlhe(UUID uuid) {
        return jyumaefscl(uuid) ? v2.nufgyqmvbu.f115648zoijcleaow : uuid;
    }

    private static String zdlpuopuiu(UUID uuid, String str) {
        return (stevsuqkhv.f123602iobyxmoadg < 26 && v2.nufgyqmvbu.f115646ppxfxbqfkf.equals(uuid) && ("video/mp4".equals(str) || "audio/mp4".equals(str))) ? "cenc" : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void zynmafqrjb(wflxmlrfwp.zoijcleaow zoijcleaowVar, MediaDrm mediaDrm, byte[] bArr, int i13, int i14, byte[] bArr2) {
        zoijcleaowVar.iobyxmoadg(this, bArr, i13, i14, bArr2);
    }

    @Override // androidx.media3.exoplayer.drm.wflxmlrfwp
    public void btonecajqb(byte[] bArr) {
        this.f10456zoijcleaow.closeSession(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.wflxmlrfwp
    public void draadjrbmk(final wflxmlrfwp.zoijcleaow zoijcleaowVar) {
        this.f10456zoijcleaow.setOnEventListener(zoijcleaowVar == null ? null : new MediaDrm.OnEventListener() { // from class: i3.ojitshcjhn
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i13, int i14, byte[] bArr2) {
                this.f41836iobyxmoadg.zynmafqrjb(zoijcleaowVar, mediaDrm, bArr, i13, i14, bArr2);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.wflxmlrfwp
    public boolean dxjokdxxww(byte[] bArr, String str) throws Throwable {
        boolean zRequiresSecureDecoderComponent;
        if (stevsuqkhv.f123602iobyxmoadg >= 31 && pmvmpeiblj()) {
            MediaDrm mediaDrm = this.f10456zoijcleaow;
            return iobyxmoadg.iobyxmoadg(mediaDrm, str, mediaDrm.getSecurityLevel(bArr));
        }
        MediaCrypto mediaCrypto = null;
        try {
            try {
                MediaCrypto mediaCrypto2 = new MediaCrypto(yggfygwlhe(this.f10454iobyxmoadg), bArr);
                try {
                    zRequiresSecureDecoderComponent = mediaCrypto2.requiresSecureDecoderComponent(str);
                    mediaCrypto2.release();
                } catch (MediaCryptoException unused) {
                    mediaCrypto = mediaCrypto2;
                    zRequiresSecureDecoderComponent = !this.f10454iobyxmoadg.equals(v2.nufgyqmvbu.f115646ppxfxbqfkf);
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    mediaCrypto = mediaCrypto2;
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (MediaCryptoException unused2) {
        }
        return zRequiresSecureDecoderComponent;
    }

    @Override // androidx.media3.exoplayer.drm.wflxmlrfwp
    public void eablkybsjg(byte[] bArr, byte[] bArr2) {
        this.f10456zoijcleaow.restoreKeys(bArr, bArr2);
    }

    public String esjtqupxsv(String str) {
        return this.f10456zoijcleaow.getPropertyString(str);
    }

    @Override // androidx.media3.exoplayer.drm.wflxmlrfwp
    public byte[] gtknphoqwx(byte[] bArr, byte[] bArr2) {
        if (v2.nufgyqmvbu.f115646ppxfxbqfkf.equals(this.f10454iobyxmoadg)) {
            bArr2 = androidx.media3.exoplayer.drm.iobyxmoadg.zoijcleaow(bArr2);
        }
        return this.f10456zoijcleaow.provideKeyResponse(bArr, bArr2);
    }

    @Override // androidx.media3.exoplayer.drm.wflxmlrfwp
    public void gxszxtbevo(byte[] bArr) throws DeniedByServerException {
        this.f10456zoijcleaow.provideProvisionResponse(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.wflxmlrfwp
    public Map iobyxmoadg(byte[] bArr) {
        return this.f10456zoijcleaow.queryKeyStatus(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.wflxmlrfwp
    /* JADX INFO: renamed from: iwizpuwonk, reason: merged with bridge method [inline-methods] */
    public i3.draadjrbmk nufgyqmvbu(byte[] bArr) {
        return new i3.draadjrbmk(yggfygwlhe(this.f10454iobyxmoadg), bArr);
    }

    @Override // androidx.media3.exoplayer.drm.wflxmlrfwp
    public int lqeggnwhkg() {
        return 2;
    }

    @Override // androidx.media3.exoplayer.drm.wflxmlrfwp
    public wflxmlrfwp.wkgbmnqykc ppxfxbqfkf() {
        MediaDrm.ProvisionRequest provisionRequest = this.f10456zoijcleaow.getProvisionRequest();
        return new wflxmlrfwp.wkgbmnqykc(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // androidx.media3.exoplayer.drm.wflxmlrfwp
    public synchronized void release() {
        int i13 = this.f10455ppxfxbqfkf - 1;
        this.f10455ppxfxbqfkf = i13;
        if (i13 == 0) {
            this.f10456zoijcleaow.release();
        }
    }

    @Override // androidx.media3.exoplayer.drm.wflxmlrfwp
    public wflxmlrfwp.iobyxmoadg wflxmlrfwp(byte[] bArr, List list, int i13, HashMap map) throws NotProvisionedException {
        DrmInitData.SchemeData schemeDataLereixgezr;
        byte[] bArrKcexrzcfyt;
        String strZdlpuopuiu;
        if (list != null) {
            schemeDataLereixgezr = lereixgezr(this.f10454iobyxmoadg, list);
            bArrKcexrzcfyt = kcexrzcfyt(this.f10454iobyxmoadg, (byte[]) y2.iobyxmoadg.eablkybsjg(schemeDataLereixgezr.f9623cqumvgiudr));
            strZdlpuopuiu = zdlpuopuiu(this.f10454iobyxmoadg, schemeDataLereixgezr.f9624iwizpuwonk);
        } else {
            schemeDataLereixgezr = null;
            bArrKcexrzcfyt = null;
            strZdlpuopuiu = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f10456zoijcleaow.getKeyRequest(bArr, bArrKcexrzcfyt, strZdlpuopuiu, i13, map);
        byte[] bArrOxmwwwfdhm = oxmwwwfdhm(this.f10454iobyxmoadg, keyRequest.getData());
        String strVdvldrhtss = vdvldrhtss(keyRequest.getDefaultUrl());
        if (TextUtils.isEmpty(strVdvldrhtss) && schemeDataLereixgezr != null && !TextUtils.isEmpty(schemeDataLereixgezr.f9625jyumaefscl)) {
            strVdvldrhtss = schemeDataLereixgezr.f9625jyumaefscl;
        }
        return new wflxmlrfwp.iobyxmoadg(bArrOxmwwwfdhm, strVdvldrhtss, stevsuqkhv.f123602iobyxmoadg >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    @Override // androidx.media3.exoplayer.drm.wflxmlrfwp
    public byte[] wkgbmnqykc() {
        return this.f10456zoijcleaow.openSession();
    }

    @Override // androidx.media3.exoplayer.drm.wflxmlrfwp
    public void zoijcleaow(byte[] bArr, h0 h0Var) {
        if (stevsuqkhv.f123602iobyxmoadg >= 31) {
            try {
                iobyxmoadg.zoijcleaow(this.f10456zoijcleaow, bArr, h0Var);
            } catch (UnsupportedOperationException unused) {
                kcexrzcfyt.nufgyqmvbu("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }
}
