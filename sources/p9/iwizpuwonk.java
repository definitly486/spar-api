package p9;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iwizpuwonk {

    public static abstract class iobyxmoadg {
        public abstract iwizpuwonk iobyxmoadg();

        public abstract iobyxmoadg ppxfxbqfkf(ppxfxbqfkf ppxfxbqfkfVar);

        public abstract iobyxmoadg zoijcleaow(zoijcleaow zoijcleaowVar);
    }

    public enum ppxfxbqfkf {
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_HIPRI(5),
        /* JADX INFO: Fake field, exist only in values array */
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17),
        NONE(-1);


        /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
        private static final SparseArray f76075cllcsxoeiz;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        public static final ppxfxbqfkf f76086lereixgezr;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        public static final ppxfxbqfkf f76089pmvmpeiblj;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final int f76095zdlpuopuiu;

        static {
            ppxfxbqfkf ppxfxbqfkfVar = MOBILE;
            ppxfxbqfkf ppxfxbqfkfVar2 = WIFI;
            ppxfxbqfkf ppxfxbqfkfVar3 = MOBILE_MMS;
            ppxfxbqfkf ppxfxbqfkfVar4 = MOBILE_SUPL;
            ppxfxbqfkf ppxfxbqfkfVar5 = MOBILE_DUN;
            ppxfxbqfkf ppxfxbqfkfVar6 = MOBILE_HIPRI;
            f76086lereixgezr = ppxfxbqfkfVar6;
            ppxfxbqfkf ppxfxbqfkfVar7 = WIMAX;
            f76089pmvmpeiblj = ppxfxbqfkfVar7;
            ppxfxbqfkf ppxfxbqfkfVar8 = BLUETOOTH;
            ppxfxbqfkf ppxfxbqfkfVar9 = DUMMY;
            ppxfxbqfkf ppxfxbqfkfVar10 = ETHERNET;
            ppxfxbqfkf ppxfxbqfkfVar11 = MOBILE_FOTA;
            ppxfxbqfkf ppxfxbqfkfVar12 = MOBILE_IMS;
            ppxfxbqfkf ppxfxbqfkfVar13 = MOBILE_CBS;
            ppxfxbqfkf ppxfxbqfkfVar14 = WIFI_P2P;
            ppxfxbqfkf ppxfxbqfkfVar15 = MOBILE_IA;
            ppxfxbqfkf ppxfxbqfkfVar16 = MOBILE_EMERGENCY;
            ppxfxbqfkf ppxfxbqfkfVar17 = PROXY;
            ppxfxbqfkf ppxfxbqfkfVar18 = VPN;
            ppxfxbqfkf ppxfxbqfkfVar19 = NONE;
            SparseArray sparseArray = new SparseArray();
            f76075cllcsxoeiz = sparseArray;
            sparseArray.put(0, ppxfxbqfkfVar);
            sparseArray.put(1, ppxfxbqfkfVar2);
            sparseArray.put(2, ppxfxbqfkfVar3);
            sparseArray.put(3, ppxfxbqfkfVar4);
            sparseArray.put(4, ppxfxbqfkfVar5);
            sparseArray.put(5, ppxfxbqfkfVar6);
            sparseArray.put(6, ppxfxbqfkfVar7);
            sparseArray.put(7, ppxfxbqfkfVar8);
            sparseArray.put(8, ppxfxbqfkfVar9);
            sparseArray.put(9, ppxfxbqfkfVar10);
            sparseArray.put(10, ppxfxbqfkfVar11);
            sparseArray.put(11, ppxfxbqfkfVar12);
            sparseArray.put(12, ppxfxbqfkfVar13);
            sparseArray.put(13, ppxfxbqfkfVar14);
            sparseArray.put(14, ppxfxbqfkfVar15);
            sparseArray.put(15, ppxfxbqfkfVar16);
            sparseArray.put(16, ppxfxbqfkfVar17);
            sparseArray.put(17, ppxfxbqfkfVar18);
            sparseArray.put(-1, ppxfxbqfkfVar19);
        }

        ppxfxbqfkf(int i13) {
            this.f76095zdlpuopuiu = i13;
        }

        public static ppxfxbqfkf iobyxmoadg(int i13) {
            return (ppxfxbqfkf) f76075cllcsxoeiz.get(i13);
        }

        public int wkgbmnqykc() {
            return this.f76095zdlpuopuiu;
        }
    }

    public enum zoijcleaow {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        /* JADX INFO: Fake field, exist only in values array */
        EVDO_0(5),
        /* JADX INFO: Fake field, exist only in values array */
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);


        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        public static final zoijcleaow f76108lereixgezr;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        public static final zoijcleaow f76111pmvmpeiblj;

        /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
        private static final SparseArray f76114wypolnanlu;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final int f76119zdlpuopuiu;

        static {
            zoijcleaow zoijcleaowVar = UNKNOWN_MOBILE_SUBTYPE;
            zoijcleaow zoijcleaowVar2 = GPRS;
            zoijcleaow zoijcleaowVar3 = EDGE;
            zoijcleaow zoijcleaowVar4 = UMTS;
            zoijcleaow zoijcleaowVar5 = CDMA;
            zoijcleaow zoijcleaowVar6 = EVDO_0;
            f76108lereixgezr = zoijcleaowVar6;
            zoijcleaow zoijcleaowVar7 = EVDO_A;
            f76111pmvmpeiblj = zoijcleaowVar7;
            zoijcleaow zoijcleaowVar8 = RTT;
            zoijcleaow zoijcleaowVar9 = HSDPA;
            zoijcleaow zoijcleaowVar10 = HSUPA;
            zoijcleaow zoijcleaowVar11 = HSPA;
            zoijcleaow zoijcleaowVar12 = IDEN;
            zoijcleaow zoijcleaowVar13 = EVDO_B;
            zoijcleaow zoijcleaowVar14 = LTE;
            zoijcleaow zoijcleaowVar15 = EHRPD;
            zoijcleaow zoijcleaowVar16 = HSPAP;
            zoijcleaow zoijcleaowVar17 = GSM;
            zoijcleaow zoijcleaowVar18 = TD_SCDMA;
            zoijcleaow zoijcleaowVar19 = IWLAN;
            zoijcleaow zoijcleaowVar20 = LTE_CA;
            SparseArray sparseArray = new SparseArray();
            f76114wypolnanlu = sparseArray;
            sparseArray.put(0, zoijcleaowVar);
            sparseArray.put(1, zoijcleaowVar2);
            sparseArray.put(2, zoijcleaowVar3);
            sparseArray.put(3, zoijcleaowVar4);
            sparseArray.put(4, zoijcleaowVar5);
            sparseArray.put(5, zoijcleaowVar6);
            sparseArray.put(6, zoijcleaowVar7);
            sparseArray.put(7, zoijcleaowVar8);
            sparseArray.put(8, zoijcleaowVar9);
            sparseArray.put(9, zoijcleaowVar10);
            sparseArray.put(10, zoijcleaowVar11);
            sparseArray.put(11, zoijcleaowVar12);
            sparseArray.put(12, zoijcleaowVar13);
            sparseArray.put(13, zoijcleaowVar14);
            sparseArray.put(14, zoijcleaowVar15);
            sparseArray.put(15, zoijcleaowVar16);
            sparseArray.put(16, zoijcleaowVar17);
            sparseArray.put(17, zoijcleaowVar18);
            sparseArray.put(18, zoijcleaowVar19);
            sparseArray.put(19, zoijcleaowVar20);
        }

        zoijcleaow(int i13) {
            this.f76119zdlpuopuiu = i13;
        }

        public static zoijcleaow iobyxmoadg(int i13) {
            return (zoijcleaow) f76114wypolnanlu.get(i13);
        }

        public int wkgbmnqykc() {
            return this.f76119zdlpuopuiu;
        }
    }

    public static iobyxmoadg iobyxmoadg() {
        return new wflxmlrfwp.zoijcleaow();
    }

    public abstract ppxfxbqfkf ppxfxbqfkf();

    public abstract zoijcleaow zoijcleaow();
}
