package t6;

import android.os.Build;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityNr;
import android.telephony.CellIdentityTdscdma;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoNr;
import android.telephony.CellInfoTdscdma;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrength;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthTdscdma;
import android.telephony.CellSignalStrengthWcdma;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class f0 implements wflxmlrfwp {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final String f109804cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final long f109805esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final String f109806iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final int f109807jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final dsvhmnatus f109808lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final int f109809pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final long f109810yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f109811zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final int f109812zynmafqrjb;

    /* JADX INFO: Access modifiers changed from: private */
    interface iobyxmoadg {
        Object get();
    }

    private f0(String str, long j13, int i13, String str2, String str3, long j14, dsvhmnatus dsvhmnatusVar, int i14, int i15) {
        this.f109811zdlpuopuiu = str;
        this.f109810yggfygwlhe = j13;
        this.f109807jyumaefscl = i13;
        this.f109806iwizpuwonk = str2;
        this.f109804cqumvgiudr = str3;
        this.f109805esjtqupxsv = j14;
        this.f109808lereixgezr = dsvhmnatusVar;
        this.f109809pmvmpeiblj = i14;
        this.f109812zynmafqrjb = i15;
    }

    private static wflxmlrfwp agtfadlqog(CellInfoLte cellInfoLte, long j13, dsvhmnatus dsvhmnatusVar) {
        String strNufgyqmvbu;
        String strNufgyqmvbu2;
        final CellIdentityLte cellIdentity = cellInfoLte.getCellIdentity();
        Objects.requireNonNull(cellIdentity);
        int iWkgbmnqykc = wkgbmnqykc(new iobyxmoadg() { // from class: t6.x
            @Override // t6.f0.iobyxmoadg
            public final Object get() {
                return Integer.valueOf(cellIdentity.getCi());
            }
        }, 268435455);
        int iWkgbmnqykc2 = wkgbmnqykc(new iobyxmoadg() { // from class: t6.y
            @Override // t6.f0.iobyxmoadg
            public final Object get() {
                return Integer.valueOf(cellIdentity.getTac());
            }
        }, 65535);
        if (Build.VERSION.SDK_INT >= 28) {
            strNufgyqmvbu = cellIdentity.getMccString();
            strNufgyqmvbu2 = cellIdentity.getMncString();
        } else {
            strNufgyqmvbu = nufgyqmvbu(new iobyxmoadg() { // from class: t6.z
                @Override // t6.f0.iobyxmoadg
                public final Object get() {
                    return Integer.valueOf(cellIdentity.getMcc());
                }
            });
            strNufgyqmvbu2 = nufgyqmvbu(new iobyxmoadg() { // from class: t6.a0
                @Override // t6.f0.iobyxmoadg
                public final Object get() {
                    return Integer.valueOf(cellIdentity.getMnc());
                }
            });
        }
        String str = strNufgyqmvbu2;
        String str2 = strNufgyqmvbu;
        CellSignalStrengthLte cellSignalStrength = cellInfoLte.getCellSignalStrength();
        return new f0("LTE", iWkgbmnqykc, iWkgbmnqykc2, str2, str, j13, dsvhmnatusVar, cellSignalStrength.getLevel(), iobyxmoadg(cellSignalStrength.getDbm()));
    }

    private static wflxmlrfwp btonecajqb(CellInfoCdma cellInfoCdma, long j13, dsvhmnatus dsvhmnatusVar) {
        final CellIdentityCdma cellIdentity = cellInfoCdma.getCellIdentity();
        Objects.requireNonNull(cellIdentity);
        int iWkgbmnqykc = wkgbmnqykc(new iobyxmoadg() { // from class: t6.u
            @Override // t6.f0.iobyxmoadg
            public final Object get() {
                return Integer.valueOf(cellIdentity.getBasestationId());
            }
        }, 65535);
        int iWkgbmnqykc2 = wkgbmnqykc(new iobyxmoadg() { // from class: t6.v
            @Override // t6.f0.iobyxmoadg
            public final Object get() {
                return Integer.valueOf(cellIdentity.getNetworkId());
            }
        }, 65535);
        String strNufgyqmvbu = nufgyqmvbu(new iobyxmoadg() { // from class: t6.w
            @Override // t6.f0.iobyxmoadg
            public final Object get() {
                return Integer.valueOf(cellIdentity.getSystemId());
            }
        });
        CellSignalStrengthCdma cellSignalStrength = cellInfoCdma.getCellSignalStrength();
        return new f0("CDMA", iWkgbmnqykc, iWkgbmnqykc2, strNufgyqmvbu, null, j13, dsvhmnatusVar, cellSignalStrength.getLevel(), iobyxmoadg(cellSignalStrength.getDbm()));
    }

    private static wflxmlrfwp draadjrbmk(CellInfoGsm cellInfoGsm, long j13, dsvhmnatus dsvhmnatusVar) {
        String strNufgyqmvbu;
        String strNufgyqmvbu2;
        final CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
        Objects.requireNonNull(cellIdentity);
        int iWkgbmnqykc = wkgbmnqykc(new iobyxmoadg() { // from class: t6.q
            @Override // t6.f0.iobyxmoadg
            public final Object get() {
                return Integer.valueOf(cellIdentity.getCid());
            }
        }, 65535);
        int iWkgbmnqykc2 = wkgbmnqykc(new iobyxmoadg() { // from class: t6.r
            @Override // t6.f0.iobyxmoadg
            public final Object get() {
                return Integer.valueOf(cellIdentity.getLac());
            }
        }, 65535);
        if (Build.VERSION.SDK_INT >= 28) {
            strNufgyqmvbu = cellIdentity.getMccString();
            strNufgyqmvbu2 = cellIdentity.getMncString();
        } else {
            strNufgyqmvbu = nufgyqmvbu(new iobyxmoadg() { // from class: t6.s
                @Override // t6.f0.iobyxmoadg
                public final Object get() {
                    return Integer.valueOf(cellIdentity.getMcc());
                }
            });
            strNufgyqmvbu2 = nufgyqmvbu(new iobyxmoadg() { // from class: t6.t
                @Override // t6.f0.iobyxmoadg
                public final Object get() {
                    return Integer.valueOf(cellIdentity.getMnc());
                }
            });
        }
        String str = strNufgyqmvbu2;
        String str2 = strNufgyqmvbu;
        CellSignalStrengthGsm cellSignalStrength = cellInfoGsm.getCellSignalStrength();
        return new f0("GSM", iWkgbmnqykc, iWkgbmnqykc2, str2, str, j13, dsvhmnatusVar, cellSignalStrength.getLevel(), iobyxmoadg(cellSignalStrength.getDbm()));
    }

    static wflxmlrfwp dxjokdxxww(CellInfo cellInfo, long j13, long j14) {
        long millis = j14 - (j13 - TimeUnit.NANOSECONDS.toMillis(cellInfo.getTimeStamp()));
        dsvhmnatus dsvhmnatusVarKcexrzcfyt = kcexrzcfyt(cellInfo);
        if (cellInfo instanceof CellInfoGsm) {
            return draadjrbmk((CellInfoGsm) cellInfo, millis, dsvhmnatusVarKcexrzcfyt);
        }
        if (cellInfo instanceof CellInfoLte) {
            return agtfadlqog((CellInfoLte) cellInfo, millis, dsvhmnatusVarKcexrzcfyt);
        }
        if (cellInfo instanceof CellInfoCdma) {
            return btonecajqb((CellInfoCdma) cellInfo, millis, dsvhmnatusVarKcexrzcfyt);
        }
        if (cellInfo instanceof CellInfoWcdma) {
            return vdvldrhtss((CellInfoWcdma) cellInfo, millis, dsvhmnatusVarKcexrzcfyt);
        }
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        if (fyldjkxazc.iobyxmoadg(cellInfo)) {
            return ojitshcjhn(krqnebusok.iobyxmoadg(cellInfo), millis, dsvhmnatusVarKcexrzcfyt);
        }
        if (e.iobyxmoadg(cellInfo)) {
            return rgvfuqvkyq(f.iobyxmoadg(cellInfo), millis, dsvhmnatusVarKcexrzcfyt);
        }
        return null;
    }

    private static int iobyxmoadg(int i13) {
        if (i13 < -150 || i13 > -1) {
            return 0;
        }
        return i13;
    }

    private static dsvhmnatus kcexrzcfyt(CellInfo cellInfo) {
        dsvhmnatus dsvhmnatusVar = dsvhmnatus.None;
        if (Build.VERSION.SDK_INT < 28) {
            return cellInfo.isRegistered() ? dsvhmnatus.Primary : dsvhmnatusVar;
        }
        int cellConnectionStatus = cellInfo.getCellConnectionStatus();
        if (cellConnectionStatus == 1) {
            return dsvhmnatus.Primary;
        }
        if (cellConnectionStatus == 2) {
            return dsvhmnatus.Secondary;
        }
        return cellInfo.isRegistered() ? dsvhmnatus.Primary : dsvhmnatusVar;
    }

    private static long lqeggnwhkg(iobyxmoadg iobyxmoadgVar, long j13) {
        Long l13 = (Long) iobyxmoadgVar.get();
        if (l13.longValue() != Long.MAX_VALUE) {
            return l13.longValue() & j13;
        }
        return -1L;
    }

    private static String nufgyqmvbu(iobyxmoadg iobyxmoadgVar) {
        Integer num = (Integer) iobyxmoadgVar.get();
        if (num.intValue() != Integer.MAX_VALUE) {
            return String.valueOf(num);
        }
        return null;
    }

    private static wflxmlrfwp ojitshcjhn(CellInfoNr cellInfoNr, long j13, dsvhmnatus dsvhmnatusVar) {
        final CellIdentityNr cellIdentityNrIobyxmoadg = mhtqkkgtqm.iobyxmoadg(cellInfoNr.getCellIdentity());
        Objects.requireNonNull(cellIdentityNrIobyxmoadg);
        long jLqeggnwhkg = lqeggnwhkg(new iobyxmoadg() { // from class: t6.b0
            @Override // t6.f0.iobyxmoadg
            public final Object get() {
                return Long.valueOf(cellIdentityNrIobyxmoadg.getNci());
            }
        }, 68719476735L);
        int iWkgbmnqykc = wkgbmnqykc(new iobyxmoadg() { // from class: t6.c0
            @Override // t6.f0.iobyxmoadg
            public final Object get() {
                return Integer.valueOf(cellIdentityNrIobyxmoadg.getTac());
            }
        }, 16777215);
        CellSignalStrength cellSignalStrength = cellInfoNr.getCellSignalStrength();
        return new f0("NR", jLqeggnwhkg, iWkgbmnqykc, cellIdentityNrIobyxmoadg.getMccString(), cellIdentityNrIobyxmoadg.getMncString(), j13, dsvhmnatusVar, cellSignalStrength.getLevel(), iobyxmoadg(cellSignalStrength.getDbm()));
    }

    private static wflxmlrfwp rgvfuqvkyq(CellInfoTdscdma cellInfoTdscdma, long j13, dsvhmnatus dsvhmnatusVar) {
        final CellIdentityTdscdma cellIdentity = cellInfoTdscdma.getCellIdentity();
        Objects.requireNonNull(cellIdentity);
        int iWkgbmnqykc = wkgbmnqykc(new iobyxmoadg() { // from class: t6.d0
            @Override // t6.f0.iobyxmoadg
            public final Object get() {
                return Integer.valueOf(cellIdentity.getCid());
            }
        }, 268435455);
        int iWkgbmnqykc2 = wkgbmnqykc(new iobyxmoadg() { // from class: t6.e0
            @Override // t6.f0.iobyxmoadg
            public final Object get() {
                return Integer.valueOf(cellIdentity.getLac());
            }
        }, 65535);
        CellSignalStrengthTdscdma cellSignalStrength = cellInfoTdscdma.getCellSignalStrength();
        return new f0("TD-SCDMA", iWkgbmnqykc, iWkgbmnqykc2, cellIdentity.getMccString(), cellIdentity.getMncString(), j13, dsvhmnatusVar, cellSignalStrength.getLevel(), iobyxmoadg(cellSignalStrength.getDbm()));
    }

    private static wflxmlrfwp vdvldrhtss(CellInfoWcdma cellInfoWcdma, long j13, dsvhmnatus dsvhmnatusVar) {
        String strNufgyqmvbu;
        String strNufgyqmvbu2;
        final CellIdentityWcdma cellIdentity = cellInfoWcdma.getCellIdentity();
        Objects.requireNonNull(cellIdentity);
        int iWkgbmnqykc = wkgbmnqykc(new iobyxmoadg() { // from class: t6.m
            @Override // t6.f0.iobyxmoadg
            public final Object get() {
                return Integer.valueOf(cellIdentity.getCid());
            }
        }, 268435455);
        int iWkgbmnqykc2 = wkgbmnqykc(new iobyxmoadg() { // from class: t6.n
            @Override // t6.f0.iobyxmoadg
            public final Object get() {
                return Integer.valueOf(cellIdentity.getLac());
            }
        }, 65535);
        if (Build.VERSION.SDK_INT >= 28) {
            strNufgyqmvbu = cellIdentity.getMccString();
            strNufgyqmvbu2 = cellIdentity.getMncString();
        } else {
            strNufgyqmvbu = nufgyqmvbu(new iobyxmoadg() { // from class: t6.o
                @Override // t6.f0.iobyxmoadg
                public final Object get() {
                    return Integer.valueOf(cellIdentity.getMcc());
                }
            });
            strNufgyqmvbu2 = nufgyqmvbu(new iobyxmoadg() { // from class: t6.p
                @Override // t6.f0.iobyxmoadg
                public final Object get() {
                    return Integer.valueOf(cellIdentity.getMnc());
                }
            });
        }
        String str = strNufgyqmvbu2;
        String str2 = strNufgyqmvbu;
        CellSignalStrengthWcdma cellSignalStrength = cellInfoWcdma.getCellSignalStrength();
        return new f0("UMTS", iWkgbmnqykc, iWkgbmnqykc2, str2, str, j13, dsvhmnatusVar, cellSignalStrength.getLevel(), iobyxmoadg(cellSignalStrength.getDbm()));
    }

    private static int wkgbmnqykc(iobyxmoadg iobyxmoadgVar, int i13) {
        Integer num = (Integer) iobyxmoadgVar.get();
        if (num.intValue() != Integer.MAX_VALUE) {
            return num.intValue() & i13;
        }
        return -1;
    }

    @Override // t6.wflxmlrfwp
    public int eablkybsjg() {
        return this.f109812zynmafqrjb;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f0.class != obj.getClass()) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f109810yggfygwlhe == f0Var.f109810yggfygwlhe && this.f109807jyumaefscl == f0Var.f109807jyumaefscl && this.f109811zdlpuopuiu.equals(f0Var.f109811zdlpuopuiu);
    }

    @Override // t6.wflxmlrfwp
    public String esjtqupxsv() {
        return this.f109804cqumvgiudr;
    }

    @Override // t6.wflxmlrfwp
    public String gtknphoqwx() {
        return this.f109806iwizpuwonk;
    }

    @Override // t6.wflxmlrfwp
    public int gxszxtbevo() {
        return this.f109809pmvmpeiblj;
    }

    public int hashCode() {
        return Objects.hash(this.f109811zdlpuopuiu, Long.valueOf(this.f109810yggfygwlhe), Integer.valueOf(this.f109807jyumaefscl));
    }

    @Override // t6.wflxmlrfwp
    public int iwizpuwonk() {
        return this.f109807jyumaefscl;
    }

    @Override // t6.wflxmlrfwp
    public long oxmwwwfdhm() {
        return this.f109810yggfygwlhe;
    }

    @Override // t6.wflxmlrfwp
    public dsvhmnatus ppxfxbqfkf() {
        return this.f109808lereixgezr;
    }

    @Override // t6.wflxmlrfwp
    public long wflxmlrfwp() {
        return this.f109805esjtqupxsv;
    }

    @Override // t6.wflxmlrfwp
    public String zoijcleaow() {
        return this.f109811zdlpuopuiu;
    }
}
