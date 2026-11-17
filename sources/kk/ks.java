package kk;

import android.os.Build;
import com.google.gson.Gson;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import java.util.LinkedHashMap;
import spay.sdk.data.dto.StartDeviceInfoModel;

/* JADX INFO: loaded from: classes3.dex */
public final class ks implements gr {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final okpsazkaxt f57343ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final kc2.ppxfxbqfkf f57344zoijcleaow;

    public ks(kc2.ppxfxbqfkf bizoneFingerprintFactory, okpsazkaxt systemProperties) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bizoneFingerprintFactory, "bizoneFingerprintFactory");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(systemProperties, "systemProperties");
        this.f57344zoijcleaow = bizoneFingerprintFactory;
        this.f57343ppxfxbqfkf = systemProperties;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:54:0x018e  */
    /* JADX WARN: Code duplicated, block: B:58:0x01a4 A[PHI: r17 r18
      0x01a4: PHI (r17v3 kc2.lqeggnwhkg) = 
      (r17v1 kc2.lqeggnwhkg)
      (r17v1 kc2.lqeggnwhkg)
      (r17v1 kc2.lqeggnwhkg)
      (r17v1 kc2.lqeggnwhkg)
      (r17v1 kc2.lqeggnwhkg)
      (r17v1 kc2.lqeggnwhkg)
      (r17v1 kc2.lqeggnwhkg)
      (r17v1 kc2.lqeggnwhkg)
      (r17v1 kc2.lqeggnwhkg)
      (r17v1 kc2.lqeggnwhkg)
      (r17v1 kc2.lqeggnwhkg)
      (r17v5 kc2.lqeggnwhkg)
      (r17v7 kc2.lqeggnwhkg)
     binds: [B:33:0x0113, B:35:0x011e, B:37:0x012b, B:39:0x0136, B:41:0x0141, B:47:0x0163, B:49:0x0172, B:55:0x0194, B:57:0x01a2, B:53:0x018c, B:45:0x0154, B:29:0x00ff, B:16:0x00bb] A[DONT_GENERATE, DONT_INLINE]
      0x01a4: PHI (r18v3 kc2.lqeggnwhkg) = 
      (r18v1 kc2.lqeggnwhkg)
      (r18v1 kc2.lqeggnwhkg)
      (r18v1 kc2.lqeggnwhkg)
      (r18v1 kc2.lqeggnwhkg)
      (r18v1 kc2.lqeggnwhkg)
      (r18v1 kc2.lqeggnwhkg)
      (r18v1 kc2.lqeggnwhkg)
      (r18v1 kc2.lqeggnwhkg)
      (r18v1 kc2.lqeggnwhkg)
      (r18v1 kc2.lqeggnwhkg)
      (r18v1 kc2.lqeggnwhkg)
      (r18v5 kc2.lqeggnwhkg)
      (r18v7 kc2.lqeggnwhkg)
     binds: [B:33:0x0113, B:35:0x011e, B:37:0x012b, B:39:0x0136, B:41:0x0141, B:47:0x0163, B:49:0x0172, B:55:0x0194, B:57:0x01a2, B:53:0x018c, B:45:0x0154, B:29:0x00ff, B:16:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:67:0x01e2  */
    public final t0 iobyxmoadg() {
        kc2.lqeggnwhkg lqeggnwhkgVar;
        kc2.lqeggnwhkg lqeggnwhkgVar2;
        Object obj;
        int i13;
        int i14;
        String PRODUCT;
        String MODEL;
        kc2.lqeggnwhkg lqeggnwhkgVar3 = kc2.lqeggnwhkg.Compromised;
        kc2.lqeggnwhkg lqeggnwhkgVar4 = kc2.lqeggnwhkg.Emulator;
        kc2.lqeggnwhkg lqeggnwhkgVar5 = kc2.lqeggnwhkg.RdpConnection;
        kc2.lqeggnwhkg lqeggnwhkgVar6 = kc2.lqeggnwhkg.RdpConnectionDuration;
        kc2.lqeggnwhkg lqeggnwhkgVar7 = kc2.lqeggnwhkg.Debugger;
        s sVar = new s(hg.jyumaefscl.kcexrzcfyt(lqeggnwhkgVar3, lqeggnwhkgVar4, lqeggnwhkgVar5, lqeggnwhkgVar6, lqeggnwhkgVar7));
        gr.f56730iobyxmoadg.getClass();
        new s(cq.f56179zoijcleaow);
        kc2.zoijcleaow zoijcleaowVarIobyxmoadg = this.f57344zoijcleaow.iobyxmoadg(sVar);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(zoijcleaowVarIobyxmoadg, "bizoneFingerprintFactory…eate(fingerprintSettings)");
        zoijcleaowVarIobyxmoadg.iobyxmoadg(null);
        String report = (String) zoijcleaowVarIobyxmoadg.ppxfxbqfkf();
        zoijcleaowVarIobyxmoadg.zoijcleaow();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(report, "report");
        StartDeviceInfoModel startDeviceInfoModel = (StartDeviceInfoModel) new Gson().gtknphoqwx(report, StartDeviceInfoModel.class);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (startDeviceInfoModel.getCompromised() >= 16) {
            linkedHashMap.put(lqeggnwhkgVar3.name(), String.valueOf(startDeviceInfoModel.getCompromised()));
        }
        String MANUFACTURER = Build.MANUFACTURER;
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(MANUFACTURER, "Google") && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(Build.BRAND, "google")) {
            String FINGERPRINT = Build.FINGERPRINT;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(FINGERPRINT, "FINGERPRINT");
            if (mj.kcexrzcfyt.stevsuqkhv(FINGERPRINT, "google/sdk_gphone_", false, 2, null)) {
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(FINGERPRINT, "FINGERPRINT");
                obj = null;
                if (mj.kcexrzcfyt.zynmafqrjb(FINGERPRINT, ":user/release-keys", false, 2, null)) {
                    String PRODUCT2 = Build.PRODUCT;
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(PRODUCT2, "PRODUCT");
                    lqeggnwhkgVar2 = lqeggnwhkgVar7;
                    lqeggnwhkgVar = lqeggnwhkgVar6;
                    i13 = 2;
                    if (mj.kcexrzcfyt.stevsuqkhv(PRODUCT2, "sdk_gphone_", false, 2, null)) {
                        String MODEL2 = Build.MODEL;
                        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(MODEL2, "MODEL");
                        if (!mj.kcexrzcfyt.stevsuqkhv(MODEL2, "sdk_gphone_", false, 2, null)) {
                        }
                    }
                    linkedHashMap.put(lqeggnwhkgVar4.name(), String.valueOf(startDeviceInfoModel.getEmulator()));
                    if (startDeviceInfoModel.getRdpConnection() != 0) {
                        linkedHashMap.put(lqeggnwhkgVar5.name(), String.valueOf(startDeviceInfoModel.getRdpConnection()));
                    }
                    if (startDeviceInfoModel.getRdpConnectionDuration() != 0) {
                        linkedHashMap.put(lqeggnwhkgVar.name(), String.valueOf(startDeviceInfoModel.getRdpConnectionDuration()));
                    }
                    i14 = ag.f55814zoijcleaow;
                    if (i14 != 6 && i14 != 7 && startDeviceInfoModel.getDebugger() > 1) {
                        linkedHashMap.put(lqeggnwhkgVar2.name(), String.valueOf(startDeviceInfoModel.getDebugger()));
                    }
                    return new t0(linkedHashMap.isEmpty(), linkedHashMap);
                }
                lqeggnwhkgVar = lqeggnwhkgVar6;
                lqeggnwhkgVar2 = lqeggnwhkgVar7;
                i13 = 2;
            } else {
                lqeggnwhkgVar = lqeggnwhkgVar6;
                lqeggnwhkgVar2 = lqeggnwhkgVar7;
                i13 = 2;
                obj = null;
            }
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(FINGERPRINT, "FINGERPRINT");
            if (mj.kcexrzcfyt.stevsuqkhv(FINGERPRINT, "google/sdk_gphone64_", false, i13, obj)) {
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(FINGERPRINT, "FINGERPRINT");
                if (mj.kcexrzcfyt.zynmafqrjb(FINGERPRINT, ":userdebug/dev-keys", false, i13, obj)) {
                    PRODUCT = Build.PRODUCT;
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(PRODUCT, "PRODUCT");
                    if (mj.kcexrzcfyt.stevsuqkhv(PRODUCT, "sdk_gphone64_", false, i13, obj)) {
                        MODEL = Build.MODEL;
                        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(MODEL, "MODEL");
                        if (!mj.kcexrzcfyt.stevsuqkhv(MODEL, "sdk_gphone64_", false, i13, obj)) {
                        }
                    }
                } else {
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(FINGERPRINT, "FINGERPRINT");
                    if (mj.kcexrzcfyt.zynmafqrjb(FINGERPRINT, ":user/release-keys", false, i13, obj)) {
                        PRODUCT = Build.PRODUCT;
                        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(PRODUCT, "PRODUCT");
                        if (mj.kcexrzcfyt.stevsuqkhv(PRODUCT, "sdk_gphone64_", false, i13, obj)) {
                            MODEL = Build.MODEL;
                            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(MODEL, "MODEL");
                            if (!mj.kcexrzcfyt.stevsuqkhv(MODEL, "sdk_gphone64_", false, i13, obj)) {
                            }
                        }
                    }
                }
                linkedHashMap.put(lqeggnwhkgVar4.name(), String.valueOf(startDeviceInfoModel.getEmulator()));
            }
            if (startDeviceInfoModel.getRdpConnection() != 0) {
                linkedHashMap.put(lqeggnwhkgVar5.name(), String.valueOf(startDeviceInfoModel.getRdpConnection()));
            }
            if (startDeviceInfoModel.getRdpConnectionDuration() != 0) {
                linkedHashMap.put(lqeggnwhkgVar.name(), String.valueOf(startDeviceInfoModel.getRdpConnectionDuration()));
            }
            i14 = ag.f55814zoijcleaow;
            if (i14 != 6) {
                linkedHashMap.put(lqeggnwhkgVar2.name(), String.valueOf(startDeviceInfoModel.getDebugger()));
            }
            return new t0(linkedHashMap.isEmpty(), linkedHashMap);
        }
        lqeggnwhkgVar = lqeggnwhkgVar6;
        lqeggnwhkgVar2 = lqeggnwhkgVar7;
        obj = null;
        i13 = 2;
        String FINGERPRINT2 = Build.FINGERPRINT;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(FINGERPRINT2, "FINGERPRINT");
        if (mj.kcexrzcfyt.stevsuqkhv(FINGERPRINT2, "generic", false, i13, obj)) {
            linkedHashMap.put(lqeggnwhkgVar4.name(), String.valueOf(startDeviceInfoModel.getEmulator()));
        } else {
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(FINGERPRINT2, "FINGERPRINT");
            if (mj.kcexrzcfyt.stevsuqkhv(FINGERPRINT2, CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE, false, i13, obj)) {
                linkedHashMap.put(lqeggnwhkgVar4.name(), String.valueOf(startDeviceInfoModel.getEmulator()));
            } else {
                String MODEL3 = Build.MODEL;
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(MODEL3, "MODEL");
                if (mj.kcexrzcfyt.sopmlzcsov(MODEL3, "google_sdk", false, i13, obj)) {
                    linkedHashMap.put(lqeggnwhkgVar4.name(), String.valueOf(startDeviceInfoModel.getEmulator()));
                } else {
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(MODEL3, "MODEL");
                    if (mj.kcexrzcfyt.sopmlzcsov(MODEL3, "Emulator", false, i13, obj)) {
                        linkedHashMap.put(lqeggnwhkgVar4.name(), String.valueOf(startDeviceInfoModel.getEmulator()));
                    } else {
                        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(MODEL3, "MODEL");
                        if (mj.kcexrzcfyt.sopmlzcsov(MODEL3, "Android SDK built for x86", false, i13, obj) || (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg("QC_Reference_Phone", Build.BOARD) && !mj.kcexrzcfyt.istkbnxepw("Xiaomi", MANUFACTURER, true))) {
                            linkedHashMap.put(lqeggnwhkgVar4.name(), String.valueOf(startDeviceInfoModel.getEmulator()));
                        } else {
                            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(MANUFACTURER, "MANUFACTURER");
                            if (mj.kcexrzcfyt.sopmlzcsov(MANUFACTURER, "Genymotion", false, 2, null)) {
                                linkedHashMap.put(lqeggnwhkgVar4.name(), String.valueOf(startDeviceInfoModel.getEmulator()));
                            } else {
                                String HOST = Build.HOST;
                                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(HOST, "HOST");
                                if (mj.kcexrzcfyt.stevsuqkhv(HOST, "Build", false, 2, null)) {
                                    linkedHashMap.put(lqeggnwhkgVar4.name(), String.valueOf(startDeviceInfoModel.getEmulator()));
                                } else {
                                    String BRAND = Build.BRAND;
                                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(BRAND, "BRAND");
                                    if (mj.kcexrzcfyt.stevsuqkhv(BRAND, "generic", false, 2, null)) {
                                        String DEVICE = Build.DEVICE;
                                        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(DEVICE, "DEVICE");
                                        if (mj.kcexrzcfyt.stevsuqkhv(DEVICE, "generic", false, 2, null)) {
                                            linkedHashMap.put(lqeggnwhkgVar4.name(), String.valueOf(startDeviceInfoModel.getEmulator()));
                                        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(Build.PRODUCT, "google_sdk") || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57343ppxfxbqfkf.iobyxmoadg(), "1")) {
                                            linkedHashMap.put(lqeggnwhkgVar4.name(), String.valueOf(startDeviceInfoModel.getEmulator()));
                                        }
                                    } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(Build.PRODUCT, "google_sdk")) {
                                        linkedHashMap.put(lqeggnwhkgVar4.name(), String.valueOf(startDeviceInfoModel.getEmulator()));
                                    } else {
                                        linkedHashMap.put(lqeggnwhkgVar4.name(), String.valueOf(startDeviceInfoModel.getEmulator()));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (startDeviceInfoModel.getRdpConnection() != 0) {
            linkedHashMap.put(lqeggnwhkgVar5.name(), String.valueOf(startDeviceInfoModel.getRdpConnection()));
        }
        if (startDeviceInfoModel.getRdpConnectionDuration() != 0) {
            linkedHashMap.put(lqeggnwhkgVar.name(), String.valueOf(startDeviceInfoModel.getRdpConnectionDuration()));
        }
        i14 = ag.f55814zoijcleaow;
        if (i14 != 6) {
            linkedHashMap.put(lqeggnwhkgVar2.name(), String.valueOf(startDeviceInfoModel.getDebugger()));
        }
        return new t0(linkedHashMap.isEmpty(), linkedHashMap);
    }
}
