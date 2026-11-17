package p3;

import android.content.Context;
import android.os.Handler;
import b3.wflxmlrfwp;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.common.collect.yggfygwlhe;
import com.google.common.collect.zdlpuopuiu;
import com.google.protobuf.DescriptorProtos;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.impl.C4007z9;
import java.util.HashMap;
import java.util.Map;
import modern.payments.ecomAndroid.data.common.MockConstants;
import modern.payments.ecomAndroid.util.networkErrorHandler.impl.OrderServiceErrorHandlerImpl;
import xa.rgvfuqvkyq;
import y2.cqumvgiudr;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class lqeggnwhkg implements wkgbmnqykc, wflxmlrfwp {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private static lqeggnwhkg f75477cqumvgiudr;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private int f75484agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private long f75485btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private long f75486draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private long f75487dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f75488eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private long f75489gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final gtknphoqwx f75490gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f75491iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private int f75492lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private long f75493nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private boolean f75494ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final wkgbmnqykc.iobyxmoadg.C1660iobyxmoadg f75495ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private int f75496rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private String f75497vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private long f75498wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final y2.dxjokdxxww f75499wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final yggfygwlhe f75500zoijcleaow;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    public static final zdlpuopuiu f75481oxmwwwfdhm = zdlpuopuiu.lmojexxdyd(4300000L, 3200000L, 2400000L, 1700000L, 860000L);

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    public static final zdlpuopuiu f75480kcexrzcfyt = zdlpuopuiu.lmojexxdyd(1500000L, 980000L, 750000L, 520000L, 290000L);

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public static final zdlpuopuiu f75483zdlpuopuiu = zdlpuopuiu.lmojexxdyd(2000000L, 1300000L, 1000000L, 860000L, 610000L);

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final zdlpuopuiu f75482yggfygwlhe = zdlpuopuiu.lmojexxdyd(2500000L, 1700000L, 1200000L, 970000L, 680000L);

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public static final zdlpuopuiu f75479jyumaefscl = zdlpuopuiu.lmojexxdyd(4700000L, 2800000L, 2100000L, 1700000L, 980000L);

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final zdlpuopuiu f75478iwizpuwonk = zdlpuopuiu.lmojexxdyd(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private boolean f75501eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Context f75502iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private int f75503ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private y2.dxjokdxxww f75504wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Map f75505zoijcleaow;

        public zoijcleaow(Context context) {
            this.f75502iobyxmoadg = context == null ? null : context.getApplicationContext();
            this.f75503ppxfxbqfkf = 2000;
            this.f75504wkgbmnqykc = y2.dxjokdxxww.f123544iobyxmoadg;
            this.f75501eablkybsjg = true;
            HashMap map = new HashMap(8);
            this.f75505zoijcleaow = map;
            map.put(0, 1000000L);
            map.put(2, -9223372036854775807L);
            map.put(3, -9223372036854775807L);
            map.put(4, -9223372036854775807L);
            map.put(5, -9223372036854775807L);
            map.put(10, -9223372036854775807L);
            map.put(9, -9223372036854775807L);
            map.put(7, -9223372036854775807L);
        }

        public lqeggnwhkg iobyxmoadg() {
            return new lqeggnwhkg(this.f75502iobyxmoadg, this.f75505zoijcleaow, this.f75503ppxfxbqfkf, this.f75504wkgbmnqykc, this.f75501eablkybsjg);
        }
    }

    private void agtfadlqog(int i13, long j13, long j14) {
        if (i13 == 0 && j13 == 0 && j14 == this.f75498wflxmlrfwp) {
            return;
        }
        this.f75498wflxmlrfwp = j14;
        this.f75495ppxfxbqfkf.ppxfxbqfkf(i13, j13, j14);
    }

    private long btonecajqb(int i13) {
        Long lValueOf = (Long) this.f75500zoijcleaow.get(Integer.valueOf(i13));
        if (lValueOf == null) {
            lValueOf = (Long) this.f75500zoijcleaow.get(0);
        } else if (lValueOf.longValue() == -9223372036854775807L) {
            lValueOf = Long.valueOf(gtknphoqwx(this.f75497vdvldrhtss, i13));
        }
        if (lValueOf == null) {
            lValueOf = 1000000L;
        }
        return lValueOf.longValue();
    }

    public static synchronized lqeggnwhkg draadjrbmk(Context context) {
        try {
            if (f75477cqumvgiudr == null) {
                f75477cqumvgiudr = new zoijcleaow(context).iobyxmoadg();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f75477cqumvgiudr;
    }

    private static int[] dxjokdxxww(String str) {
        byte b13 = 4;
        str.hashCode();
        switch (str.hashCode()) {
            case 2083:
                b13 = !str.equals("AD") ? (byte) -1 : (byte) 0;
                break;
            case 2084:
                b13 = !str.equals("AE") ? (byte) -1 : (byte) 1;
                break;
            case 2085:
                b13 = !str.equals("AF") ? (byte) -1 : (byte) 2;
                break;
            case 2086:
                b13 = !str.equals("AG") ? (byte) -1 : (byte) 3;
                break;
            case 2088:
                if (!str.equals("AI")) {
                    b13 = -1;
                }
                break;
            case 2091:
                b13 = !str.equals("AL") ? (byte) -1 : (byte) 5;
                break;
            case 2092:
                b13 = !str.equals("AM") ? (byte) -1 : (byte) 6;
                break;
            case 2094:
                b13 = !str.equals("AO") ? (byte) -1 : (byte) 7;
                break;
            case 2096:
                b13 = !str.equals("AQ") ? (byte) -1 : (byte) 8;
                break;
            case 2097:
                b13 = !str.equals("AR") ? (byte) -1 : (byte) 9;
                break;
            case 2098:
                b13 = !str.equals("AS") ? (byte) -1 : (byte) 10;
                break;
            case 2099:
                b13 = !str.equals("AT") ? (byte) -1 : (byte) 11;
                break;
            case 2100:
                b13 = !str.equals("AU") ? (byte) -1 : (byte) 12;
                break;
            case 2102:
                b13 = !str.equals("AW") ? (byte) -1 : (byte) 13;
                break;
            case 2103:
                b13 = !str.equals("AX") ? (byte) -1 : (byte) 14;
                break;
            case 2105:
                b13 = !str.equals("AZ") ? (byte) -1 : (byte) 15;
                break;
            case 2111:
                b13 = !str.equals("BA") ? (byte) -1 : (byte) 16;
                break;
            case 2112:
                b13 = !str.equals("BB") ? (byte) -1 : (byte) 17;
                break;
            case 2114:
                b13 = !str.equals("BD") ? (byte) -1 : (byte) 18;
                break;
            case 2115:
                b13 = !str.equals("BE") ? (byte) -1 : (byte) 19;
                break;
            case 2116:
                b13 = !str.equals("BF") ? (byte) -1 : (byte) 20;
                break;
            case 2117:
                b13 = !str.equals("BG") ? (byte) -1 : (byte) 21;
                break;
            case 2118:
                b13 = !str.equals("BH") ? (byte) -1 : (byte) 22;
                break;
            case 2119:
                b13 = !str.equals("BI") ? (byte) -1 : (byte) 23;
                break;
            case 2120:
                b13 = !str.equals("BJ") ? (byte) -1 : (byte) 24;
                break;
            case 2122:
                b13 = !str.equals("BL") ? (byte) -1 : (byte) 25;
                break;
            case 2123:
                b13 = !str.equals("BM") ? (byte) -1 : (byte) 26;
                break;
            case 2124:
                b13 = !str.equals("BN") ? (byte) -1 : (byte) 27;
                break;
            case 2125:
                b13 = !str.equals("BO") ? (byte) -1 : (byte) 28;
                break;
            case 2127:
                b13 = !str.equals("BQ") ? (byte) -1 : (byte) 29;
                break;
            case 2128:
                b13 = !str.equals("BR") ? (byte) -1 : (byte) 30;
                break;
            case 2129:
                b13 = !str.equals("BS") ? (byte) -1 : (byte) 31;
                break;
            case 2130:
                b13 = !str.equals("BT") ? (byte) -1 : (byte) 32;
                break;
            case 2133:
                b13 = !str.equals("BW") ? (byte) -1 : (byte) 33;
                break;
            case 2135:
                b13 = !str.equals("BY") ? (byte) -1 : (byte) 34;
                break;
            case 2136:
                b13 = !str.equals("BZ") ? (byte) -1 : (byte) 35;
                break;
            case 2142:
                b13 = !str.equals("CA") ? (byte) -1 : (byte) 36;
                break;
            case 2145:
                b13 = !str.equals("CD") ? (byte) -1 : (byte) 37;
                break;
            case 2147:
                b13 = !str.equals("CF") ? (byte) -1 : (byte) 38;
                break;
            case 2148:
                b13 = !str.equals("CG") ? (byte) -1 : (byte) 39;
                break;
            case 2149:
                b13 = !str.equals("CH") ? (byte) -1 : (byte) 40;
                break;
            case 2150:
                b13 = !str.equals("CI") ? (byte) -1 : (byte) 41;
                break;
            case 2152:
                b13 = !str.equals("CK") ? (byte) -1 : (byte) 42;
                break;
            case 2153:
                b13 = !str.equals("CL") ? (byte) -1 : (byte) 43;
                break;
            case 2154:
                b13 = !str.equals("CM") ? (byte) -1 : (byte) 44;
                break;
            case 2155:
                b13 = !str.equals("CN") ? (byte) -1 : (byte) 45;
                break;
            case 2156:
                b13 = !str.equals("CO") ? (byte) -1 : (byte) 46;
                break;
            case 2159:
                b13 = !str.equals("CR") ? (byte) -1 : (byte) 47;
                break;
            case 2162:
                b13 = !str.equals("CU") ? (byte) -1 : (byte) 48;
                break;
            case 2163:
                b13 = !str.equals("CV") ? (byte) -1 : (byte) 49;
                break;
            case 2164:
                b13 = !str.equals("CW") ? (byte) -1 : (byte) 50;
                break;
            case 2165:
                b13 = !str.equals("CX") ? (byte) -1 : (byte) 51;
                break;
            case 2166:
                b13 = !str.equals("CY") ? (byte) -1 : (byte) 52;
                break;
            case 2167:
                b13 = !str.equals("CZ") ? (byte) -1 : (byte) 53;
                break;
            case 2177:
                b13 = !str.equals("DE") ? (byte) -1 : (byte) 54;
                break;
            case 2182:
                b13 = !str.equals("DJ") ? (byte) -1 : (byte) 55;
                break;
            case 2183:
                b13 = !str.equals("DK") ? (byte) -1 : (byte) 56;
                break;
            case 2185:
                b13 = !str.equals("DM") ? (byte) -1 : (byte) 57;
                break;
            case 2187:
                b13 = !str.equals("DO") ? (byte) -1 : (byte) 58;
                break;
            case 2198:
                b13 = !str.equals("DZ") ? (byte) -1 : (byte) 59;
                break;
            case 2206:
                b13 = !str.equals("EC") ? (byte) -1 : (byte) 60;
                break;
            case 2208:
                b13 = !str.equals("EE") ? (byte) -1 : (byte) 61;
                break;
            case 2210:
                b13 = !str.equals("EG") ? (byte) -1 : (byte) 62;
                break;
            case 2221:
                b13 = !str.equals("ER") ? (byte) -1 : (byte) 63;
                break;
            case 2222:
                b13 = !str.equals("ES") ? (byte) -1 : (byte) 64;
                break;
            case 2223:
                b13 = !str.equals("ET") ? (byte) -1 : (byte) 65;
                break;
            case 2243:
                b13 = !str.equals("FI") ? (byte) -1 : (byte) 66;
                break;
            case 2244:
                b13 = !str.equals("FJ") ? (byte) -1 : (byte) 67;
                break;
            case 2245:
                b13 = !str.equals("FK") ? (byte) -1 : (byte) 68;
                break;
            case 2247:
                b13 = !str.equals("FM") ? (byte) -1 : (byte) 69;
                break;
            case 2249:
                b13 = !str.equals("FO") ? (byte) -1 : (byte) 70;
                break;
            case 2252:
                b13 = !str.equals("FR") ? (byte) -1 : (byte) 71;
                break;
            case 2266:
                b13 = !str.equals("GA") ? (byte) -1 : (byte) 72;
                break;
            case 2267:
                b13 = !str.equals("GB") ? (byte) -1 : (byte) 73;
                break;
            case 2269:
                b13 = !str.equals("GD") ? (byte) -1 : (byte) 74;
                break;
            case 2270:
                b13 = !str.equals("GE") ? (byte) -1 : (byte) 75;
                break;
            case 2271:
                b13 = !str.equals("GF") ? (byte) -1 : (byte) 76;
                break;
            case 2272:
                b13 = !str.equals("GG") ? (byte) -1 : (byte) 77;
                break;
            case 2273:
                b13 = !str.equals("GH") ? (byte) -1 : (byte) 78;
                break;
            case 2274:
                b13 = !str.equals("GI") ? (byte) -1 : (byte) 79;
                break;
            case 2277:
                b13 = !str.equals("GL") ? (byte) -1 : (byte) 80;
                break;
            case 2278:
                b13 = !str.equals("GM") ? (byte) -1 : (byte) 81;
                break;
            case 2279:
                b13 = !str.equals("GN") ? (byte) -1 : (byte) 82;
                break;
            case 2281:
                b13 = !str.equals("GP") ? (byte) -1 : (byte) 83;
                break;
            case 2282:
                b13 = !str.equals("GQ") ? (byte) -1 : (byte) 84;
                break;
            case 2283:
                b13 = !str.equals("GR") ? (byte) -1 : (byte) 85;
                break;
            case 2285:
                b13 = !str.equals("GT") ? (byte) -1 : (byte) 86;
                break;
            case 2286:
                b13 = !str.equals("GU") ? (byte) -1 : (byte) 87;
                break;
            case 2288:
                b13 = !str.equals("GW") ? (byte) -1 : (byte) 88;
                break;
            case 2290:
                b13 = !str.equals("GY") ? (byte) -1 : (byte) 89;
                break;
            case 2307:
                b13 = !str.equals("HK") ? (byte) -1 : (byte) 90;
                break;
            case 2314:
                b13 = !str.equals("HR") ? (byte) -1 : (byte) 91;
                break;
            case 2316:
                b13 = !str.equals("HT") ? (byte) -1 : (byte) 92;
                break;
            case 2317:
                b13 = !str.equals("HU") ? (byte) -1 : (byte) 93;
                break;
            case 2331:
                b13 = !str.equals("ID") ? (byte) -1 : (byte) 94;
                break;
            case 2332:
                b13 = !str.equals("IE") ? (byte) -1 : (byte) 95;
                break;
            case 2339:
                b13 = !str.equals("IL") ? (byte) -1 : (byte) 96;
                break;
            case 2340:
                b13 = !str.equals("IM") ? (byte) -1 : (byte) 97;
                break;
            case 2341:
                b13 = !str.equals("IN") ? (byte) -1 : (byte) 98;
                break;
            case 2342:
                b13 = !str.equals("IO") ? (byte) -1 : (byte) 99;
                break;
            case 2344:
                b13 = !str.equals("IQ") ? (byte) -1 : (byte) 100;
                break;
            case 2345:
                b13 = !str.equals("IR") ? (byte) -1 : (byte) 101;
                break;
            case 2346:
                b13 = !str.equals("IS") ? (byte) -1 : (byte) 102;
                break;
            case 2347:
                b13 = !str.equals("IT") ? (byte) -1 : (byte) 103;
                break;
            case 2363:
                b13 = !str.equals("JE") ? (byte) -1 : (byte) 104;
                break;
            case 2371:
                b13 = !str.equals("JM") ? (byte) -1 : (byte) 105;
                break;
            case 2373:
                b13 = !str.equals("JO") ? (byte) -1 : (byte) 106;
                break;
            case 2374:
                b13 = !str.equals("JP") ? (byte) -1 : (byte) 107;
                break;
            case 2394:
                b13 = !str.equals("KE") ? (byte) -1 : (byte) 108;
                break;
            case 2396:
                b13 = !str.equals("KG") ? (byte) -1 : (byte) 109;
                break;
            case 2397:
                b13 = !str.equals("KH") ? (byte) -1 : (byte) 110;
                break;
            case 2398:
                b13 = !str.equals("KI") ? (byte) -1 : (byte) 111;
                break;
            case 2402:
                b13 = !str.equals("KM") ? (byte) -1 : (byte) 112;
                break;
            case 2403:
                b13 = !str.equals("KN") ? (byte) -1 : (byte) 113;
                break;
            case 2407:
                b13 = !str.equals("KR") ? (byte) -1 : (byte) 114;
                break;
            case 2412:
                b13 = !str.equals("KW") ? (byte) -1 : (byte) 115;
                break;
            case 2414:
                b13 = !str.equals("KY") ? (byte) -1 : (byte) 116;
                break;
            case 2415:
                b13 = !str.equals("KZ") ? (byte) -1 : (byte) 117;
                break;
            case 2421:
                b13 = !str.equals("LA") ? (byte) -1 : (byte) 118;
                break;
            case 2422:
                b13 = !str.equals("LB") ? (byte) -1 : (byte) 119;
                break;
            case 2423:
                b13 = !str.equals("LC") ? (byte) -1 : (byte) 120;
                break;
            case 2429:
                b13 = !str.equals("LI") ? (byte) -1 : (byte) 121;
                break;
            case 2431:
                b13 = !str.equals("LK") ? (byte) -1 : (byte) 122;
                break;
            case 2438:
                b13 = !str.equals("LR") ? (byte) -1 : (byte) 123;
                break;
            case 2439:
                b13 = !str.equals("LS") ? (byte) -1 : (byte) 124;
                break;
            case 2440:
                b13 = !str.equals("LT") ? (byte) -1 : (byte) 125;
                break;
            case 2441:
                b13 = !str.equals("LU") ? (byte) -1 : (byte) 126;
                break;
            case 2442:
                b13 = !str.equals("LV") ? (byte) -1 : (byte) 127;
                break;
            case 2445:
                b13 = !str.equals("LY") ? (byte) -1 : (byte) 128;
                break;
            case 2452:
                b13 = !str.equals("MA") ? (byte) -1 : (byte) 129;
                break;
            case 2454:
                b13 = !str.equals("MC") ? (byte) -1 : (byte) 130;
                break;
            case 2455:
                b13 = !str.equals("MD") ? (byte) -1 : (byte) 131;
                break;
            case 2456:
                b13 = !str.equals("ME") ? (byte) -1 : (byte) 132;
                break;
            case 2457:
                b13 = !str.equals("MF") ? (byte) -1 : (byte) 133;
                break;
            case 2458:
                b13 = !str.equals("MG") ? (byte) -1 : (byte) 134;
                break;
            case 2459:
                b13 = !str.equals("MH") ? (byte) -1 : (byte) 135;
                break;
            case 2462:
                b13 = !str.equals("MK") ? (byte) -1 : (byte) 136;
                break;
            case 2463:
                b13 = !str.equals("ML") ? (byte) -1 : (byte) 137;
                break;
            case 2464:
                b13 = !str.equals("MM") ? (byte) -1 : (byte) 138;
                break;
            case 2465:
                b13 = !str.equals("MN") ? (byte) -1 : (byte) 139;
                break;
            case 2466:
                b13 = !str.equals("MO") ? (byte) -1 : (byte) 140;
                break;
            case 2467:
                b13 = !str.equals("MP") ? (byte) -1 : (byte) 141;
                break;
            case 2468:
                b13 = !str.equals("MQ") ? (byte) -1 : (byte) 142;
                break;
            case 2469:
                b13 = !str.equals("MR") ? (byte) -1 : (byte) 143;
                break;
            case 2470:
                b13 = !str.equals("MS") ? (byte) -1 : (byte) 144;
                break;
            case 2471:
                b13 = !str.equals("MT") ? (byte) -1 : (byte) 145;
                break;
            case 2472:
                b13 = !str.equals("MU") ? (byte) -1 : (byte) 146;
                break;
            case 2473:
                b13 = !str.equals("MV") ? (byte) -1 : (byte) 147;
                break;
            case 2474:
                b13 = !str.equals("MW") ? (byte) -1 : (byte) 148;
                break;
            case 2475:
                b13 = !str.equals("MX") ? (byte) -1 : (byte) 149;
                break;
            case 2476:
                b13 = !str.equals("MY") ? (byte) -1 : (byte) 150;
                break;
            case 2477:
                b13 = !str.equals("MZ") ? (byte) -1 : (byte) 151;
                break;
            case 2483:
                b13 = !str.equals("NA") ? (byte) -1 : (byte) 152;
                break;
            case 2485:
                b13 = !str.equals("NC") ? (byte) -1 : (byte) 153;
                break;
            case 2487:
                b13 = !str.equals("NE") ? (byte) -1 : (byte) 154;
                break;
            case 2488:
                b13 = !str.equals("NF") ? (byte) -1 : (byte) 155;
                break;
            case 2489:
                b13 = !str.equals("NG") ? (byte) -1 : (byte) 156;
                break;
            case 2491:
                b13 = !str.equals("NI") ? (byte) -1 : (byte) 157;
                break;
            case 2494:
                b13 = !str.equals("NL") ? (byte) -1 : (byte) 158;
                break;
            case 2497:
                b13 = !str.equals("NO") ? (byte) -1 : (byte) 159;
                break;
            case 2498:
                b13 = !str.equals("NP") ? (byte) -1 : (byte) 160;
                break;
            case 2500:
                b13 = !str.equals("NR") ? (byte) -1 : (byte) 161;
                break;
            case 2503:
                b13 = !str.equals("NU") ? (byte) -1 : (byte) 162;
                break;
            case 2508:
                b13 = !str.equals("NZ") ? (byte) -1 : (byte) 163;
                break;
            case 2526:
                b13 = !str.equals("OM") ? (byte) -1 : (byte) 164;
                break;
            case 2545:
                b13 = !str.equals("PA") ? (byte) -1 : (byte) 165;
                break;
            case 2549:
                b13 = !str.equals("PE") ? (byte) -1 : (byte) 166;
                break;
            case 2550:
                b13 = !str.equals("PF") ? (byte) -1 : (byte) 167;
                break;
            case 2551:
                b13 = !str.equals("PG") ? (byte) -1 : (byte) 168;
                break;
            case 2552:
                b13 = !str.equals("PH") ? (byte) -1 : (byte) 169;
                break;
            case 2555:
                b13 = !str.equals("PK") ? (byte) -1 : (byte) 170;
                break;
            case 2556:
                b13 = !str.equals("PL") ? (byte) -1 : (byte) 171;
                break;
            case 2557:
                b13 = !str.equals("PM") ? (byte) -1 : (byte) 172;
                break;
            case 2562:
                b13 = !str.equals("PR") ? (byte) -1 : (byte) 173;
                break;
            case 2563:
                b13 = !str.equals("PS") ? (byte) -1 : (byte) 174;
                break;
            case 2564:
                b13 = !str.equals("PT") ? (byte) -1 : (byte) 175;
                break;
            case 2567:
                b13 = !str.equals("PW") ? (byte) -1 : (byte) 176;
                break;
            case 2569:
                b13 = !str.equals("PY") ? (byte) -1 : (byte) 177;
                break;
            case 2576:
                b13 = !str.equals("QA") ? (byte) -1 : (byte) 178;
                break;
            case 2611:
                b13 = !str.equals("RE") ? (byte) -1 : (byte) 179;
                break;
            case 2621:
                b13 = !str.equals("RO") ? (byte) -1 : (byte) 180;
                break;
            case 2625:
                b13 = !str.equals("RS") ? (byte) -1 : (byte) 181;
                break;
            case 2627:
                b13 = !str.equals("RU") ? (byte) -1 : (byte) 182;
                break;
            case 2629:
                b13 = !str.equals("RW") ? (byte) -1 : (byte) 183;
                break;
            case 2638:
                b13 = !str.equals("SA") ? (byte) -1 : (byte) 184;
                break;
            case 2639:
                b13 = !str.equals("SB") ? (byte) -1 : (byte) 185;
                break;
            case 2640:
                b13 = !str.equals("SC") ? (byte) -1 : (byte) 186;
                break;
            case 2641:
                b13 = !str.equals("SD") ? (byte) -1 : (byte) 187;
                break;
            case 2642:
                b13 = !str.equals("SE") ? (byte) -1 : (byte) 188;
                break;
            case 2644:
                b13 = !str.equals("SG") ? (byte) -1 : (byte) 189;
                break;
            case 2645:
                b13 = !str.equals("SH") ? (byte) -1 : (byte) 190;
                break;
            case 2646:
                b13 = !str.equals("SI") ? (byte) -1 : (byte) 191;
                break;
            case 2647:
                b13 = !str.equals("SJ") ? (byte) -1 : (byte) 192;
                break;
            case 2648:
                b13 = !str.equals("SK") ? (byte) -1 : (byte) 193;
                break;
            case 2649:
                b13 = !str.equals("SL") ? (byte) -1 : (byte) 194;
                break;
            case 2650:
                b13 = !str.equals("SM") ? (byte) -1 : (byte) 195;
                break;
            case 2651:
                b13 = !str.equals("SN") ? (byte) -1 : (byte) 196;
                break;
            case 2652:
                b13 = !str.equals("SO") ? (byte) -1 : (byte) 197;
                break;
            case 2655:
                b13 = !str.equals("SR") ? (byte) -1 : (byte) 198;
                break;
            case 2656:
                b13 = !str.equals("SS") ? (byte) -1 : (byte) 199;
                break;
            case 2657:
                b13 = !str.equals("ST") ? (byte) -1 : (byte) 200;
                break;
            case 2659:
                b13 = !str.equals("SV") ? (byte) -1 : (byte) 201;
                break;
            case 2661:
                b13 = !str.equals("SX") ? (byte) -1 : (byte) 202;
                break;
            case 2662:
                b13 = !str.equals("SY") ? (byte) -1 : (byte) 203;
                break;
            case 2663:
                b13 = !str.equals("SZ") ? (byte) -1 : (byte) 204;
                break;
            case 2671:
                b13 = !str.equals("TC") ? (byte) -1 : (byte) 205;
                break;
            case 2672:
                b13 = !str.equals("TD") ? (byte) -1 : (byte) 206;
                break;
            case 2675:
                b13 = !str.equals("TG") ? (byte) -1 : (byte) 207;
                break;
            case 2676:
                b13 = !str.equals("TH") ? (byte) -1 : (byte) 208;
                break;
            case 2678:
                b13 = !str.equals("TJ") ? (byte) -1 : (byte) 209;
                break;
            case 2680:
                b13 = !str.equals("TL") ? (byte) -1 : (byte) 210;
                break;
            case 2681:
                b13 = !str.equals("TM") ? (byte) -1 : (byte) 211;
                break;
            case 2682:
                b13 = !str.equals("TN") ? (byte) -1 : (byte) 212;
                break;
            case 2683:
                b13 = !str.equals("TO") ? (byte) -1 : (byte) 213;
                break;
            case 2686:
                b13 = !str.equals("TR") ? (byte) -1 : (byte) 214;
                break;
            case 2688:
                b13 = !str.equals("TT") ? (byte) -1 : (byte) 215;
                break;
            case 2690:
                b13 = !str.equals("TV") ? (byte) -1 : (byte) 216;
                break;
            case 2691:
                b13 = !str.equals("TW") ? (byte) -1 : (byte) 217;
                break;
            case 2694:
                b13 = !str.equals("TZ") ? (byte) -1 : (byte) 218;
                break;
            case 2700:
                b13 = !str.equals("UA") ? (byte) -1 : (byte) 219;
                break;
            case 2706:
                b13 = !str.equals("UG") ? (byte) -1 : (byte) 220;
                break;
            case 2718:
                b13 = !str.equals("US") ? (byte) -1 : (byte) 221;
                break;
            case 2724:
                b13 = !str.equals("UY") ? (byte) -1 : (byte) 222;
                break;
            case 2725:
                b13 = !str.equals("UZ") ? (byte) -1 : (byte) 223;
                break;
            case 2731:
                b13 = !str.equals("VA") ? (byte) -1 : (byte) 224;
                break;
            case 2733:
                b13 = !str.equals("VC") ? (byte) -1 : (byte) 225;
                break;
            case 2735:
                b13 = !str.equals("VE") ? (byte) -1 : (byte) 226;
                break;
            case 2737:
                b13 = !str.equals("VG") ? (byte) -1 : (byte) 227;
                break;
            case 2739:
                b13 = !str.equals("VI") ? (byte) -1 : (byte) 228;
                break;
            case 2744:
                b13 = !str.equals("VN") ? (byte) -1 : (byte) 229;
                break;
            case 2751:
                b13 = !str.equals("VU") ? (byte) -1 : (byte) 230;
                break;
            case 2767:
                b13 = !str.equals("WF") ? (byte) -1 : (byte) 231;
                break;
            case 2780:
                b13 = !str.equals("WS") ? (byte) -1 : (byte) 232;
                break;
            case 2803:
                b13 = !str.equals("XK") ? (byte) -1 : (byte) 233;
                break;
            case 2828:
                b13 = !str.equals("YE") ? (byte) -1 : (byte) 234;
                break;
            case 2843:
                b13 = !str.equals("YT") ? (byte) -1 : (byte) 235;
                break;
            case 2855:
                b13 = !str.equals("ZA") ? (byte) -1 : (byte) 236;
                break;
            case 2867:
                b13 = !str.equals("ZM") ? (byte) -1 : (byte) 237;
                break;
            case 2877:
                b13 = !str.equals("ZW") ? (byte) -1 : (byte) 238;
                break;
            default:
                b13 = -1;
                break;
        }
        switch (b13) {
            case 0:
            case 4:
            case 17:
            case C4007z9.I /* 29 */:
            case 50:
            case 57:
            case 113:
            case 116:
            case OrderServiceErrorHandlerImpl.VALIDATION_EXCEPTION /* 202 */:
            case 225:
                return new int[]{1, 2, 0, 0, 2, 2};
            case 1:
                return new int[]{1, 4, 2, 3, 4, 1};
            case 2:
            case OrderServiceErrorHandlerImpl.ORDER_NOT_FOUND /* 204 */:
                return new int[]{4, 4, 3, 4, 2, 2};
            case 3:
            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                return new int[]{2, 4, 3, 4, 2, 2};
            case 5:
                return new int[]{1, 1, 1, 2, 2, 2};
            case 6:
            case 165:
                return new int[]{2, 3, 2, 3, 2, 2};
            case 7:
                return new int[]{3, 4, 4, 3, 2, 2};
            case 8:
            case 63:
            case 162:
            case 186:
            case 190:
                return new int[]{4, 2, 2, 2, 2, 2};
            case 9:
                return new int[]{2, 2, 2, 2, 1, 2};
            case 10:
                return new int[]{2, 2, 3, 3, 2, 2};
            case 11:
            case 61:
            case 93:
            case 102:
            case 127:
            case 145:
            case 188:
                return new int[]{0, 0, 0, 0, 0, 2};
            case 12:
                return new int[]{0, 3, 1, 1, 3, 0};
            case 13:
                return new int[]{2, 2, 3, 4, 2, 2};
            case 14:
            case 51:
            case 121:
            case 144:
            case 172:
            case 195:
            case 224:
                return new int[]{0, 2, 2, 2, 2, 2};
            case 15:
            case 55:
            case UserVerificationMethods.USER_VERIFY_PATTERN /* 128 */:
            case 194:
                return new int[]{4, 2, 3, 3, 2, 2};
            case 16:
            case 106:
            case 214:
                return new int[]{1, 1, 1, 1, 2, 2};
            case 18:
                return new int[]{2, 1, 3, 2, 4, 2};
            case 19:
                return new int[]{0, 0, 1, 0, 1, 2};
            case 20:
            case 187:
            case OrderServiceErrorHandlerImpl.OPERATION_PARAMETER_INCORRECT /* 203 */:
            case OrderServiceErrorHandlerImpl.PAYMENT_TOKEN_EXPIRED /* 206 */:
                return new int[]{4, 3, 4, 4, 2, 2};
            case 21:
            case 175:
            case 191:
                return new int[]{0, 0, 0, 0, 1, 2};
            case 22:
                return new int[]{1, 3, 1, 3, 4, 2};
            case 23:
            case 84:
            case 92:
            case 154:
            case 226:
            case 234:
                return new int[]{4, 4, 4, 4, 2, 2};
            case 24:
                return new int[]{4, 4, 2, 3, 2, 2};
            case C4007z9.F /* 25 */:
            case 141:
            case 177:
                return new int[]{1, 2, 2, 2, 2, 2};
            case C4007z9.G /* 26 */:
                return new int[]{0, 2, 0, 0, 2, 2};
            case 27:
                return new int[]{3, 2, 0, 0, 2, 2};
            case 28:
                return new int[]{1, 2, 4, 4, 2, 2};
            case 30:
                return new int[]{1, 1, 1, 1, 2, 4};
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                return new int[]{3, 2, 1, 1, 2, 2};
            case 32:
                return new int[]{3, 1, 2, 2, 3, 2};
            case 33:
                return new int[]{3, 2, 1, 0, 2, 2};
            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                return new int[]{1, 2, 3, 3, 2, 2};
            case C4007z9.J /* 35 */:
            case 42:
                return new int[]{2, 2, 2, 1, 2, 2};
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
            case 219:
                return new int[]{0, 2, 1, 2, 3, 3};
            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
            case 137:
                return new int[]{3, 3, 2, 2, 2, 2};
            case C4007z9.K /* 38 */:
                return new int[]{4, 2, 4, 2, 2, 2};
            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case 62:
            case 134:
                return new int[]{3, 4, 3, 3, 2, 2};
            case 40:
                return new int[]{0, 1, 0, 0, 0, 2};
            case 43:
            case OrderServiceErrorHandlerImpl.ORDER_STATUS_INCORRECT /* 208 */:
                return new int[]{0, 1, 2, 2, 2, 2};
            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
            case 143:
                return new int[]{4, 3, 3, 4, 2, 2};
            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                return new int[]{2, 0, 1, 1, 3, 1};
            case 46:
                return new int[]{2, 3, 3, 2, 2, 2};
            case 47:
            case 157:
                return new int[]{2, 4, 4, 4, 2, 2};
            case 48:
            case 111:
            case 161:
            case OrderServiceErrorHandlerImpl.ORDER_IN_PROGRESS /* 210 */:
                return new int[]{4, 2, 4, 4, 2, 2};
            case 49:
                return new int[]{2, 3, 0, 1, 2, 2};
            case 52:
                return new int[]{1, 0, 1, 0, 0, 2};
            case 53:
                return new int[]{0, 0, 2, 0, 1, 2};
            case 54:
                return new int[]{0, 1, 4, 2, 2, 1};
            case 56:
                return new int[]{0, 0, 2, 0, 0, 2};
            case 58:
            case 123:
                return new int[]{3, 4, 4, 4, 2, 2};
            case 59:
            case OrderServiceErrorHandlerImpl.PAYMENT_UNSUCCESSFUL_DESCRIPTION /* 209 */:
                return new int[]{3, 3, 4, 4, 2, 2};
            case 60:
                return new int[]{1, 3, 2, 1, 2, 2};
            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                return new int[]{0, 0, 0, 0, 1, 0};
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                return new int[]{4, 3, 4, 4, 4, 2};
            case 66:
                return new int[]{0, 0, 0, 1, 0, 2};
            case 67:
                return new int[]{3, 2, 2, 3, 2, 2};
            case 68:
            case 155:
            case 192:
                return new int[]{3, 2, 2, 2, 2, 2};
            case 69:
                return new int[]{4, 2, 4, 0, 2, 2};
            case 70:
                return new int[]{0, 2, 2, 0, 2, 2};
            case 71:
                return new int[]{1, 1, 1, 1, 0, 2};
            case 72:
                return new int[]{3, 4, 0, 0, 2, 2};
            case 73:
                return new int[]{1, 1, 3, 2, 2, 2};
            case 74:
                return new int[]{2, 2, 0, 0, 2, 2};
            case 75:
                return new int[]{1, 1, 0, 2, 2, 2};
            case 76:
                return new int[]{3, 2, 3, 3, 2, 2};
            case 77:
                return new int[]{0, 2, 1, 1, 2, 2};
            case 78:
                return new int[]{3, 3, 3, 2, 2, 2};
            case 79:
            case 97:
            case 104:
                return new int[]{0, 2, 0, 1, 2, 2};
            case 80:
            case 130:
                return new int[]{1, 2, 2, 0, 2, 2};
            case 81:
            case 199:
                return new int[]{4, 3, 2, 4, 2, 2};
            case 82:
                return new int[]{3, 4, 4, 2, 2, 2};
            case 83:
                return new int[]{2, 1, 1, 3, 2, 2};
            case 85:
                return new int[]{1, 0, 0, 0, 1, 2};
            case 86:
                return new int[]{2, 1, 2, 1, 2, 2};
            case 87:
                return new int[]{2, 2, 4, 3, 3, 2};
            case 88:
                return new int[]{4, 4, 1, 2, 2, 2};
            case 89:
                return new int[]{3, 1, 1, 3, 2, 2};
            case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                return new int[]{0, 1, 0, 1, 1, 0};
            case 91:
            case BuildConfig.API_LEVEL /* 115 */:
                return new int[]{1, 0, 0, 0, 0, 2};
            case 94:
                return new int[]{3, 1, 3, 3, 2, 4};
            case 95:
                return new int[]{1, 1, 1, 1, 1, 2};
            case 96:
                return new int[]{1, 2, 2, 3, 4, 2};
            case 98:
                return new int[]{1, 1, 3, 2, 2, 3};
            case 99:
                return new int[]{3, 2, 2, 0, 2, 2};
            case 100:
                return new int[]{3, 2, 3, 2, 2, 2};
            case 101:
                return new int[]{4, 2, 3, 3, 4, 3};
            case 103:
                return new int[]{0, 1, 1, 2, 1, 2};
            case 105:
                return new int[]{2, 4, 3, 1, 2, 2};
            case 107:
                return new int[]{0, 3, 2, 3, 4, 2};
            case 108:
                return new int[]{3, 2, 1, 1, 1, 2};
            case 109:
                return new int[]{2, 1, 1, 2, 2, 2};
            case 110:
                return new int[]{1, 0, 4, 2, 2, 2};
            case 112:
            case 230:
                return new int[]{4, 3, 3, 2, 2, 2};
            case 114:
                return new int[]{0, 2, 2, 4, 4, 4};
            case 117:
                return new int[]{2, 1, 2, 2, 3, 2};
            case 118:
                return new int[]{1, 2, 1, 3, 2, 2};
            case 119:
                return new int[]{3, 1, 1, 2, 2, 2};
            case 120:
                return new int[]{2, 2, 1, 1, 2, 2};
            case 122:
            case 138:
                return new int[]{3, 2, 3, 3, 4, 2};
            case 124:
            case 168:
                return new int[]{4, 3, 3, 3, 2, 2};
            case 125:
                return new int[]{0, 1, 0, 1, 0, 2};
            case 126:
                return new int[]{4, 0, 3, 2, 1, 3};
            case 129:
                return new int[]{3, 3, 1, 1, 2, 2};
            case 131:
                return new int[]{1, 0, 0, 0, 2, 2};
            case 132:
                return new int[]{2, 0, 0, 1, 3, 2};
            case 133:
                return new int[]{1, 2, 2, 3, 2, 2};
            case 135:
            case OrderServiceErrorHandlerImpl.SYSTEM_ERROR /* 211 */:
            case 216:
            case 231:
                return new int[]{4, 2, 2, 4, 2, 2};
            case 136:
                return new int[]{1, 0, 0, 1, 3, 2};
            case 139:
                return new int[]{2, 0, 2, 2, 2, 2};
            case 140:
                return new int[]{0, 2, 4, 4, 3, 1};
            case 142:
                return new int[]{2, 1, 2, 3, 2, 2};
            case 146:
                return new int[]{3, 1, 0, 2, 2, 2};
            case 147:
                return new int[]{3, 2, 1, 3, 4, 2};
            case 148:
                return new int[]{3, 2, 2, 1, 2, 2};
            case 149:
                return new int[]{2, 4, 4, 4, 3, 2};
            case 150:
                return new int[]{1, 0, 4, 1, 1, 0};
            case 151:
            case 232:
                return new int[]{3, 1, 2, 2, 2, 2};
            case 152:
                return new int[]{3, 4, 3, 2, 2, 2};
            case 153:
            case 235:
                return new int[]{2, 3, 3, 4, 2, 2};
            case 156:
                return new int[]{3, 4, 2, 1, 2, 2};
            case 158:
                return new int[]{2, 1, 4, 3, 0, 4};
            case 159:
                return new int[]{0, 0, 3, 0, 0, 2};
            case 160:
                return new int[]{2, 2, 4, 3, 2, 2};
            case 163:
                return new int[]{0, 0, 1, 2, 4, 2};
            case 164:
                return new int[]{2, 3, 1, 2, 4, 2};
            case 166:
                return new int[]{1, 2, 4, 4, 3, 2};
            case 167:
                return new int[]{2, 2, 3, 1, 2, 2};
            case 169:
                return new int[]{2, 1, 2, 3, 2, 1};
            case 170:
                return new int[]{3, 3, 3, 3, 2, 2};
            case 171:
                return new int[]{1, 0, 2, 2, 4, 4};
            case 173:
                return new int[]{2, 0, 2, 1, 2, 0};
            case 174:
                return new int[]{3, 4, 1, 3, 2, 2};
            case 176:
                return new int[]{2, 2, 4, 1, 2, 2};
            case 178:
                return new int[]{1, 4, 4, 4, 4, 2};
            case 179:
                return new int[]{0, 3, 2, 3, 1, 2};
            case 180:
                return new int[]{0, 0, 1, 1, 3, 2};
            case 181:
                return new int[]{1, 0, 0, 1, 2, 2};
            case 182:
                return new int[]{1, 0, 0, 1, 3, 3};
            case 183:
                return new int[]{3, 3, 2, 0, 2, 2};
            case 184:
                return new int[]{3, 1, 1, 2, 2, 0};
            case 185:
            case 238:
                return new int[]{4, 2, 4, 3, 2, 2};
            case 189:
                return new int[]{2, 3, 3, 3, 1, 1};
            case 193:
                return new int[]{0, 1, 1, 1, 2, 2};
            case 196:
                return new int[]{4, 4, 3, 2, 2, 2};
            case 197:
                return new int[]{2, 2, 3, 4, 4, 2};
            case 198:
                return new int[]{2, 4, 4, 1, 2, 2};
            case 200:
                return new int[]{2, 2, 1, 2, 2, 2};
            case OrderServiceErrorHandlerImpl.ACCESS_DENIED /* 201 */:
                return new int[]{2, 3, 2, 1, 2, 2};
            case OrderServiceErrorHandlerImpl.PAYMENT_ATTEMPTS_EXCEEDED /* 205 */:
                return new int[]{3, 2, 1, 2, 2, 2};
            case OrderServiceErrorHandlerImpl.ORDER_LOCKED /* 207 */:
                return new int[]{3, 4, 1, 0, 2, 2};
            case 212:
                return new int[]{3, 1, 1, 1, 2, 2};
            case 213:
                return new int[]{3, 2, 4, 3, 2, 2};
            case 215:
                return new int[]{2, 4, 1, 0, 2, 2};
            case 217:
                return new int[]{0, 0, 0, 0, 0, 0};
            case 218:
                return new int[]{3, 4, 2, 1, 3, 2};
            case 220:
                return new int[]{3, 3, 2, 3, 4, 2};
            case 221:
                return new int[]{2, 2, 4, 1, 3, 1};
            case 222:
                return new int[]{2, 1, 1, 2, 1, 2};
            case 223:
                return new int[]{1, 2, 3, 4, 3, 2};
            case 227:
                return new int[]{2, 2, 1, 1, 2, 4};
            case 228:
                return new int[]{0, 2, 1, 2, 2, 2};
            case 229:
                return new int[]{0, 0, 1, 2, 2, 2};
            case 233:
                return new int[]{1, 2, 1, 1, 2, 2};
            case 236:
                return new int[]{2, 4, 2, 1, 1, 2};
            case 237:
                return new int[]{4, 4, 4, 3, 2, 2};
            default:
                return new int[]{2, 2, 2, 2, 2, 2};
        }
    }

    private static long gtknphoqwx(String str, int i13) {
        int[] iArrDxjokdxxww = dxjokdxxww(rgvfuqvkyq.wkgbmnqykc(str));
        if (i13 != 2) {
            if (i13 == 3) {
                return ((Long) f75480kcexrzcfyt.get(iArrDxjokdxxww[1])).longValue();
            }
            if (i13 == 4) {
                return ((Long) f75483zdlpuopuiu.get(iArrDxjokdxxww[2])).longValue();
            }
            if (i13 == 5) {
                return ((Long) f75482yggfygwlhe.get(iArrDxjokdxxww[3])).longValue();
            }
            if (i13 != 7) {
                if (i13 == 9) {
                    return ((Long) f75478iwizpuwonk.get(iArrDxjokdxxww[5])).longValue();
                }
                if (i13 != 10) {
                    return 1000000L;
                }
                return ((Long) f75479jyumaefscl.get(iArrDxjokdxxww[4])).longValue();
            }
        }
        return ((Long) f75481oxmwwwfdhm.get(iArrDxjokdxxww[0])).longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void ojitshcjhn(int i13) {
        int i14 = this.f75484agtfadlqog;
        if (i14 == 0 || this.f75488eablkybsjg) {
            if (this.f75494ojitshcjhn) {
                i13 = this.f75496rgvfuqvkyq;
            }
            if (i14 != i13 || this.f75497vdvldrhtss == null) {
                this.f75484agtfadlqog = i13;
                if (i13 != 1 && i13 != 0 && i13 != 8) {
                    if (this.f75497vdvldrhtss == null) {
                        this.f75497vdvldrhtss = stevsuqkhv.stevsuqkhv(this.f75491iobyxmoadg);
                    }
                    this.f75486draadjrbmk = btonecajqb(i13);
                    long jElapsedRealtime = this.f75499wkgbmnqykc.elapsedRealtime();
                    agtfadlqog(this.f75492lqeggnwhkg > 0 ? (int) (jElapsedRealtime - this.f75493nufgyqmvbu) : 0, this.f75487dxjokdxxww, this.f75486draadjrbmk);
                    this.f75493nufgyqmvbu = jElapsedRealtime;
                    this.f75487dxjokdxxww = 0L;
                    this.f75489gtknphoqwx = 0L;
                    this.f75485btonecajqb = 0L;
                    this.f75490gxszxtbevo.dxjokdxxww();
                }
            }
        }
    }

    private static boolean wflxmlrfwp(b3.lqeggnwhkg lqeggnwhkgVar, boolean z13) {
        return z13 && !lqeggnwhkgVar.wkgbmnqykc(8);
    }

    @Override // p3.wkgbmnqykc
    public void eablkybsjg(Handler handler, wkgbmnqykc.iobyxmoadg iobyxmoadgVar) {
        y2.iobyxmoadg.eablkybsjg(handler);
        y2.iobyxmoadg.eablkybsjg(iobyxmoadgVar);
        this.f75495ppxfxbqfkf.zoijcleaow(handler, iobyxmoadgVar);
    }

    @Override // p3.wkgbmnqykc
    public void gxszxtbevo(wkgbmnqykc.iobyxmoadg iobyxmoadgVar) {
        this.f75495ppxfxbqfkf.eablkybsjg(iobyxmoadgVar);
    }

    @Override // b3.wflxmlrfwp
    public synchronized void iobyxmoadg(androidx.media3.datasource.iobyxmoadg iobyxmoadgVar, b3.lqeggnwhkg lqeggnwhkgVar, boolean z13) {
        try {
            if (wflxmlrfwp(lqeggnwhkgVar, z13)) {
                y2.iobyxmoadg.lqeggnwhkg(this.f75492lqeggnwhkg > 0);
                long jElapsedRealtime = this.f75499wkgbmnqykc.elapsedRealtime();
                int i13 = (int) (jElapsedRealtime - this.f75493nufgyqmvbu);
                this.f75485btonecajqb += (long) i13;
                long j13 = this.f75489gtknphoqwx;
                long j14 = this.f75487dxjokdxxww;
                this.f75489gtknphoqwx = j13 + j14;
                if (i13 > 0) {
                    this.f75490gxszxtbevo.ppxfxbqfkf((int) Math.sqrt(j14), (j14 * 8000.0f) / i13);
                    if (this.f75485btonecajqb >= MockConstants.TWO_SECONDS_DELAY || this.f75489gtknphoqwx >= 524288) {
                        this.f75486draadjrbmk = (long) this.f75490gxszxtbevo.gxszxtbevo(0.5f);
                    }
                    agtfadlqog(i13, this.f75487dxjokdxxww, this.f75486draadjrbmk);
                    this.f75493nufgyqmvbu = jElapsedRealtime;
                    this.f75487dxjokdxxww = 0L;
                }
                this.f75492lqeggnwhkg--;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // b3.wflxmlrfwp
    public synchronized void lqeggnwhkg(androidx.media3.datasource.iobyxmoadg iobyxmoadgVar, b3.lqeggnwhkg lqeggnwhkgVar, boolean z13, int i13) {
        if (wflxmlrfwp(lqeggnwhkgVar, z13)) {
            this.f75487dxjokdxxww += (long) i13;
        }
    }

    @Override // b3.wflxmlrfwp
    public void ppxfxbqfkf(androidx.media3.datasource.iobyxmoadg iobyxmoadgVar, b3.lqeggnwhkg lqeggnwhkgVar, boolean z13) {
    }

    @Override // b3.wflxmlrfwp
    public synchronized void wkgbmnqykc(androidx.media3.datasource.iobyxmoadg iobyxmoadgVar, b3.lqeggnwhkg lqeggnwhkgVar, boolean z13) {
        try {
            if (wflxmlrfwp(lqeggnwhkgVar, z13)) {
                if (this.f75492lqeggnwhkg == 0) {
                    this.f75493nufgyqmvbu = this.f75499wkgbmnqykc.elapsedRealtime();
                }
                this.f75492lqeggnwhkg++;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // p3.wkgbmnqykc
    public wflxmlrfwp zoijcleaow() {
        return this;
    }

    private lqeggnwhkg(Context context, Map map, int i13, y2.dxjokdxxww dxjokdxxwwVar, boolean z13) {
        this.f75491iobyxmoadg = context == null ? null : context.getApplicationContext();
        this.f75500zoijcleaow = yggfygwlhe.dxjokdxxww(map);
        this.f75495ppxfxbqfkf = new wkgbmnqykc.iobyxmoadg.C1660iobyxmoadg();
        this.f75490gxszxtbevo = new gtknphoqwx(i13);
        this.f75499wkgbmnqykc = dxjokdxxwwVar;
        this.f75488eablkybsjg = z13;
        if (context == null) {
            this.f75484agtfadlqog = 0;
            this.f75486draadjrbmk = 1000000L;
            return;
        }
        cqumvgiudr cqumvgiudrVarEablkybsjg = cqumvgiudr.eablkybsjg(context);
        int iLqeggnwhkg = cqumvgiudrVarEablkybsjg.lqeggnwhkg();
        this.f75484agtfadlqog = iLqeggnwhkg;
        this.f75486draadjrbmk = btonecajqb(iLqeggnwhkg);
        cqumvgiudrVarEablkybsjg.draadjrbmk(new cqumvgiudr.ppxfxbqfkf() { // from class: p3.gxszxtbevo
            @Override // y2.cqumvgiudr.ppxfxbqfkf
            public final void iobyxmoadg(int i14) {
                this.f75474iobyxmoadg.ojitshcjhn(i14);
            }
        }, y2.ppxfxbqfkf.iobyxmoadg());
    }
}
