package lk;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpViewModel;
import modern.payments.ecomAndroid.util.interceptor.impl.HostSelectionInterceptorImpl;
import modern.payments.ecomAndroid.util.networkErrorHandler.impl.OrderServiceErrorHandlerImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class jyumaefscl {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final boolean f63068btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final String f63069dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final int f63070eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final List f63071gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f63072iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final List f63073lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final String f63074nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f63075ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f63076wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f63077zoijcleaow;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public static final zoijcleaow f63067gtknphoqwx = new zoijcleaow(null);

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private static final char[] f63066draadjrbmk = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        public static final C1282iobyxmoadg f63078dxjokdxxww = new C1282iobyxmoadg(null);

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final List f63080gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private String f63081iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private List f63082lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private String f63083nufgyqmvbu;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private String f63085wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private String f63086zoijcleaow = "";

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private String f63084ppxfxbqfkf = "";

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private int f63079eablkybsjg = -1;

        /* JADX INFO: renamed from: lk.jyumaefscl$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C1282iobyxmoadg {
            public /* synthetic */ C1282iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int eablkybsjg(String str, int i13, int i14) {
                try {
                    int i15 = Integer.parseInt(zoijcleaow.zoijcleaow(jyumaefscl.f63067gtknphoqwx, str, i13, i14, "", false, false, false, false, null, 248, null));
                    if (1 > i15 || i15 >= 65536) {
                        return -1;
                    }
                    return i15;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int gxszxtbevo(String str, int i13, int i14) {
                while (i13 < i14) {
                    char cCharAt = str.charAt(i13);
                    if (cCharAt == '[') {
                        do {
                            i13++;
                            if (i13 >= i14) {
                                break;
                            }
                        } while (str.charAt(i13) != ']');
                    } else if (cCharAt == ':') {
                        return i13;
                    }
                    i13++;
                }
                return i14;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int lqeggnwhkg(String str, int i13, int i14) {
                if (i14 - i13 < 2) {
                    return -1;
                }
                char cCharAt = str.charAt(i13);
                if ((kotlin.jvm.internal.zdlpuopuiu.draadjrbmk(cCharAt, 97) < 0 || kotlin.jvm.internal.zdlpuopuiu.draadjrbmk(cCharAt, 122) > 0) && (kotlin.jvm.internal.zdlpuopuiu.draadjrbmk(cCharAt, 65) < 0 || kotlin.jvm.internal.zdlpuopuiu.draadjrbmk(cCharAt, 90) > 0)) {
                    return -1;
                }
                while (true) {
                    i13++;
                    if (i13 >= i14) {
                        return -1;
                    }
                    char cCharAt2 = str.charAt(i13);
                    if ('a' > cCharAt2 || cCharAt2 >= '{') {
                        if ('A' > cCharAt2 || cCharAt2 >= '[') {
                            if ('0' > cCharAt2 || cCharAt2 >= ':') {
                                if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                    if (cCharAt2 == ':') {
                                        return i13;
                                    }
                                    return -1;
                                }
                            }
                        }
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int nufgyqmvbu(String str, int i13, int i14) {
                int i15 = 0;
                while (i13 < i14) {
                    char cCharAt = str.charAt(i13);
                    if (cCharAt != '\\' && cCharAt != '/') {
                        break;
                    }
                    i15++;
                    i13++;
                }
                return i15;
            }

            private C1282iobyxmoadg() {
            }
        }

        public iobyxmoadg() {
            ArrayList arrayList = new ArrayList();
            this.f63080gxszxtbevo = arrayList;
            arrayList.add("");
        }

        private final boolean btonecajqb(String str) {
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, "..") || mj.kcexrzcfyt.istkbnxepw(str, "%2e.", true) || mj.kcexrzcfyt.istkbnxepw(str, ".%2e", true) || mj.kcexrzcfyt.istkbnxepw(str, "%2e%2e", true);
        }

        private final boolean dxjokdxxww(String str) {
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, ".") || mj.kcexrzcfyt.istkbnxepw(str, "%2e", true);
        }

        private final void ojitshcjhn(String str, int i13, int i14, boolean z13, boolean z14) {
            String strZoijcleaow = zoijcleaow.zoijcleaow(jyumaefscl.f63067gtknphoqwx, str, i13, i14, " \"<>^`{}|/\\?#", z14, false, false, false, null, 240, null);
            if (dxjokdxxww(strZoijcleaow)) {
                return;
            }
            if (btonecajqb(strZoijcleaow)) {
                wflxmlrfwp();
                return;
            }
            List list = this.f63080gxszxtbevo;
            if (((CharSequence) list.get(list.size() - 1)).length() == 0) {
                List list2 = this.f63080gxszxtbevo;
                list2.set(list2.size() - 1, strZoijcleaow);
            } else {
                this.f63080gxszxtbevo.add(strZoijcleaow);
            }
            if (z13) {
                this.f63080gxszxtbevo.add("");
            }
        }

        private final void oxmwwwfdhm(String str, int i13, int i14) {
            if (i13 == i14) {
                return;
            }
            char cCharAt = str.charAt(i13);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.f63080gxszxtbevo.clear();
                this.f63080gxszxtbevo.add("");
                i13++;
            } else {
                List list = this.f63080gxszxtbevo;
                list.set(list.size() - 1, "");
            }
            while (true) {
                int i15 = i13;
                while (i15 < i14) {
                    i13 = mk.wflxmlrfwp.dxjokdxxww(str, "/\\", i15, i14);
                    boolean z13 = i13 < i14;
                    ojitshcjhn(str, i15, i13, z13, true);
                    if (z13) {
                        i15 = i13 + 1;
                    }
                }
                return;
            }
        }

        private final void wflxmlrfwp() {
            List list = this.f63080gxszxtbevo;
            if (((String) list.remove(list.size() - 1)).length() != 0 || this.f63080gxszxtbevo.isEmpty()) {
                this.f63080gxszxtbevo.add("");
            } else {
                List list2 = this.f63080gxszxtbevo;
                list2.set(list2.size() - 1, "");
            }
        }

        private final int wkgbmnqykc() {
            int i13 = this.f63079eablkybsjg;
            if (i13 != -1) {
                return i13;
            }
            zoijcleaow zoijcleaowVar = jyumaefscl.f63067gtknphoqwx;
            String str = this.f63081iobyxmoadg;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(str);
            return zoijcleaowVar.ppxfxbqfkf(str);
        }

        public final iobyxmoadg agtfadlqog(int i13) {
            if (1 <= i13 && i13 < 65536) {
                this.f63079eablkybsjg = i13;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i13).toString());
        }

        public final void cqumvgiudr(int i13) {
            this.f63079eablkybsjg = i13;
        }

        public final iobyxmoadg draadjrbmk(String password) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(password, "password");
            this.f63084ppxfxbqfkf = zoijcleaow.zoijcleaow(jyumaefscl.f63067gtknphoqwx, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:6:0x001d  */
        public final iobyxmoadg eablkybsjg(String str) {
            List listBtonecajqb;
            if (str != null) {
                zoijcleaow zoijcleaowVar = jyumaefscl.f63067gtknphoqwx;
                String strZoijcleaow = zoijcleaow.zoijcleaow(zoijcleaowVar, str, 0, 0, " \"'<>#", true, false, true, false, null, OrderServiceErrorHandlerImpl.SYSTEM_ERROR, null);
                if (strZoijcleaow != null) {
                    listBtonecajqb = zoijcleaowVar.btonecajqb(strZoijcleaow);
                } else {
                    listBtonecajqb = null;
                }
            } else {
                listBtonecajqb = null;
            }
            this.f63082lqeggnwhkg = listBtonecajqb;
            return this;
        }

        public final void esjtqupxsv(String str) {
            this.f63081iobyxmoadg = str;
        }

        public final iobyxmoadg gtknphoqwx(jyumaefscl jyumaefsclVar, String str) {
            int iDxjokdxxww;
            int i13;
            boolean z13;
            boolean z14;
            int i14;
            int i15;
            char c13;
            int i16;
            String input = str;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(input, "input");
            int iKcexrzcfyt = mk.wflxmlrfwp.kcexrzcfyt(input, 0, 0, 3, null);
            int iYggfygwlhe = mk.wflxmlrfwp.yggfygwlhe(input, iKcexrzcfyt, 0, 2, null);
            C1282iobyxmoadg c1282iobyxmoadg = f63078dxjokdxxww;
            int iLqeggnwhkg = c1282iobyxmoadg.lqeggnwhkg(input, iKcexrzcfyt, iYggfygwlhe);
            boolean z15 = true;
            int i17 = -1;
            if (iLqeggnwhkg != -1) {
                if (mj.kcexrzcfyt.cllcsxoeiz(input, "https:", iKcexrzcfyt, true)) {
                    this.f63081iobyxmoadg = HostSelectionInterceptorImpl.PROTOCOL_HTTPS;
                    iKcexrzcfyt += 6;
                } else {
                    if (!mj.kcexrzcfyt.cllcsxoeiz(input, "http:", iKcexrzcfyt, true)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = input.substring(0, iLqeggnwhkg);
                        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb3.append(strSubstring);
                        sb3.append('\'');
                        throw new IllegalArgumentException(sb3.toString());
                    }
                    this.f63081iobyxmoadg = HostSelectionInterceptorImpl.PROTOCOL_HTTP;
                    iKcexrzcfyt += 5;
                }
            } else {
                if (jyumaefsclVar == null) {
                    if (str.length() > 6) {
                        input = mj.kcexrzcfyt.y(input, 6) + "...";
                    }
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for " + input);
                }
                this.f63081iobyxmoadg = jyumaefsclVar.zdlpuopuiu();
            }
            int iNufgyqmvbu = c1282iobyxmoadg.nufgyqmvbu(input, iKcexrzcfyt, iYggfygwlhe);
            if (iNufgyqmvbu >= 2 || jyumaefsclVar == null || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(jyumaefsclVar.zdlpuopuiu(), this.f63081iobyxmoadg)) {
                boolean z16 = false;
                boolean z17 = false;
                int i18 = iKcexrzcfyt + iNufgyqmvbu;
                while (true) {
                    iDxjokdxxww = mk.wflxmlrfwp.dxjokdxxww(input, "@/\\?#", i18, iYggfygwlhe);
                    int iCharAt = iDxjokdxxww != iYggfygwlhe ? input.charAt(iDxjokdxxww) : i17;
                    if (iCharAt != 64) {
                        i14 = i17;
                        boolean z18 = z15;
                        i15 = iYggfygwlhe;
                        if (iCharAt == i14 || iCharAt == 47 || iCharAt == 92) {
                            break;
                            break;
                        }
                        if (iCharAt == 63) {
                            break;
                        }
                        if (iCharAt == 35) {
                            break;
                        }
                        i17 = i14;
                        z15 = z18;
                        iYggfygwlhe = i15;
                    } else {
                        if (z16) {
                            i13 = iDxjokdxxww;
                            z13 = z15;
                            this.f63084ppxfxbqfkf += "%40" + zoijcleaow.zoijcleaow(jyumaefscl.f63067gtknphoqwx, str, i18, i13, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                        } else {
                            int iNufgyqmvbu2 = mk.wflxmlrfwp.nufgyqmvbu(input, ':', i18, iDxjokdxxww);
                            zoijcleaow zoijcleaowVar = jyumaefscl.f63067gtknphoqwx;
                            z13 = z15;
                            String strZoijcleaow = zoijcleaow.zoijcleaow(zoijcleaowVar, str, i18, iNufgyqmvbu2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z17) {
                                strZoijcleaow = this.f63086zoijcleaow + "%40" + strZoijcleaow;
                            }
                            this.f63086zoijcleaow = strZoijcleaow;
                            i13 = iDxjokdxxww;
                            if (iNufgyqmvbu2 != i13) {
                                this.f63084ppxfxbqfkf = zoijcleaow.zoijcleaow(zoijcleaowVar, str, iNufgyqmvbu2 + 1, i13, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z14 = z13;
                            } else {
                                z14 = z16;
                            }
                            z16 = z14;
                            z17 = z13;
                        }
                        i18 = i13 + 1;
                        z15 = z13;
                        iYggfygwlhe = iYggfygwlhe;
                        i17 = -1;
                    }
                }
                C1282iobyxmoadg c1282iobyxmoadg2 = f63078dxjokdxxww;
                int iGxszxtbevo = c1282iobyxmoadg2.gxszxtbevo(input, i18, iDxjokdxxww);
                int i19 = iGxszxtbevo + 1;
                if (i19 < iDxjokdxxww) {
                    c13 = '\"';
                    i16 = iGxszxtbevo;
                    this.f63085wkgbmnqykc = mk.lqeggnwhkg.iobyxmoadg(zoijcleaow.nufgyqmvbu(jyumaefscl.f63067gtknphoqwx, str, i18, iGxszxtbevo, false, 4, null));
                    int iEablkybsjg = c1282iobyxmoadg2.eablkybsjg(input, i19, iDxjokdxxww);
                    this.f63079eablkybsjg = iEablkybsjg;
                    if (iEablkybsjg == i14) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid URL port: \"");
                        String strSubstring2 = input.substring(i19, iDxjokdxxww);
                        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb4.append(strSubstring2);
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                } else {
                    c13 = '\"';
                    i16 = iGxszxtbevo;
                    zoijcleaow zoijcleaowVar2 = jyumaefscl.f63067gtknphoqwx;
                    this.f63085wkgbmnqykc = mk.lqeggnwhkg.iobyxmoadg(zoijcleaow.nufgyqmvbu(zoijcleaowVar2, str, i18, i16, false, 4, null));
                    String str2 = this.f63081iobyxmoadg;
                    kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(str2);
                    this.f63079eablkybsjg = zoijcleaowVar2.ppxfxbqfkf(str2);
                }
                if (this.f63085wkgbmnqykc == null) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Invalid URL host: \"");
                    String strSubstring3 = input.substring(i18, i16);
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb5.append(strSubstring3);
                    sb5.append(c13);
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
                iKcexrzcfyt = iDxjokdxxww;
            } else {
                this.f63086zoijcleaow = jyumaefsclVar.lqeggnwhkg();
                this.f63084ppxfxbqfkf = jyumaefsclVar.ppxfxbqfkf();
                this.f63085wkgbmnqykc = jyumaefsclVar.dxjokdxxww();
                this.f63079eablkybsjg = jyumaefsclVar.rgvfuqvkyq();
                this.f63080gxszxtbevo.clear();
                this.f63080gxszxtbevo.addAll(jyumaefsclVar.eablkybsjg());
                if (iKcexrzcfyt == iYggfygwlhe || input.charAt(iKcexrzcfyt) == '#') {
                    eablkybsjg(jyumaefsclVar.gxszxtbevo());
                }
                i15 = iYggfygwlhe;
            }
            int i23 = i15;
            int iDxjokdxxww2 = mk.wflxmlrfwp.dxjokdxxww(input, "?#", iKcexrzcfyt, i23);
            oxmwwwfdhm(input, iKcexrzcfyt, iDxjokdxxww2);
            if (iDxjokdxxww2 < i23 && input.charAt(iDxjokdxxww2) == '?') {
                int iNufgyqmvbu3 = mk.wflxmlrfwp.nufgyqmvbu(input, '#', iDxjokdxxww2, i23);
                zoijcleaow zoijcleaowVar3 = jyumaefscl.f63067gtknphoqwx;
                this.f63082lqeggnwhkg = zoijcleaowVar3.btonecajqb(zoijcleaow.zoijcleaow(zoijcleaowVar3, str, iDxjokdxxww2 + 1, iNufgyqmvbu3, " \"'<>#", true, false, true, false, null, OrderServiceErrorHandlerImpl.ORDER_STATUS_INCORRECT, null));
                iDxjokdxxww2 = iNufgyqmvbu3;
            }
            if (iDxjokdxxww2 < i23 && input.charAt(iDxjokdxxww2) == '#') {
                this.f63083nufgyqmvbu = zoijcleaow.zoijcleaow(jyumaefscl.f63067gtknphoqwx, str, iDxjokdxxww2 + 1, i23, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        public final iobyxmoadg gxszxtbevo(String str) {
            this.f63083nufgyqmvbu = str != null ? zoijcleaow.zoijcleaow(jyumaefscl.f63067gtknphoqwx, str, 0, 0, "", false, false, false, true, null, 187, null) : null;
            return this;
        }

        public final iobyxmoadg iobyxmoadg(String encodedName, String str) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(encodedName, "encodedName");
            if (this.f63082lqeggnwhkg == null) {
                this.f63082lqeggnwhkg = new ArrayList();
            }
            List list = this.f63082lqeggnwhkg;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(list);
            zoijcleaow zoijcleaowVar = jyumaefscl.f63067gtknphoqwx;
            list.add(zoijcleaow.zoijcleaow(zoijcleaowVar, encodedName, 0, 0, " \"'<>#&=", true, false, true, false, null, OrderServiceErrorHandlerImpl.SYSTEM_ERROR, null));
            List list2 = this.f63082lqeggnwhkg;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(list2);
            list2.add(str != null ? zoijcleaow.zoijcleaow(zoijcleaowVar, str, 0, 0, " \"'<>#&=", true, false, true, false, null, OrderServiceErrorHandlerImpl.SYSTEM_ERROR, null) : null);
            return this;
        }

        public final void iwizpuwonk(String str) {
            this.f63085wkgbmnqykc = str;
        }

        public final void jyumaefscl(String str) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<set-?>");
            this.f63086zoijcleaow = str;
        }

        public final iobyxmoadg kcexrzcfyt(String scheme) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(scheme, "scheme");
            if (mj.kcexrzcfyt.istkbnxepw(scheme, HostSelectionInterceptorImpl.PROTOCOL_HTTP, true)) {
                this.f63081iobyxmoadg = HostSelectionInterceptorImpl.PROTOCOL_HTTP;
            } else {
                if (!mj.kcexrzcfyt.istkbnxepw(scheme, HostSelectionInterceptorImpl.PROTOCOL_HTTPS, true)) {
                    throw new IllegalArgumentException("unexpected scheme: " + scheme);
                }
                this.f63081iobyxmoadg = HostSelectionInterceptorImpl.PROTOCOL_HTTPS;
            }
            return this;
        }

        public final iobyxmoadg lereixgezr(String username) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(username, "username");
            this.f63086zoijcleaow = zoijcleaow.zoijcleaow(jyumaefscl.f63067gtknphoqwx, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        public final List lqeggnwhkg() {
            return this.f63080gxszxtbevo;
        }

        public final iobyxmoadg nufgyqmvbu(String host) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(host, "host");
            String strIobyxmoadg = mk.lqeggnwhkg.iobyxmoadg(zoijcleaow.nufgyqmvbu(jyumaefscl.f63067gtknphoqwx, host, 0, 0, false, 7, null));
            if (strIobyxmoadg != null) {
                this.f63085wkgbmnqykc = strIobyxmoadg;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + host);
        }

        public final jyumaefscl ppxfxbqfkf() {
            ArrayList arrayList;
            String str = this.f63081iobyxmoadg;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            zoijcleaow zoijcleaowVar = jyumaefscl.f63067gtknphoqwx;
            String strNufgyqmvbu = zoijcleaow.nufgyqmvbu(zoijcleaowVar, this.f63086zoijcleaow, 0, 0, false, 7, null);
            String strNufgyqmvbu2 = zoijcleaow.nufgyqmvbu(zoijcleaowVar, this.f63084ppxfxbqfkf, 0, 0, false, 7, null);
            String str2 = this.f63085wkgbmnqykc;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iWkgbmnqykc = wkgbmnqykc();
            List list = this.f63080gxszxtbevo;
            ArrayList arrayList2 = new ArrayList(hg.jyumaefscl.cqumvgiudr(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(zoijcleaow.nufgyqmvbu(jyumaefscl.f63067gtknphoqwx, (String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.f63082lqeggnwhkg;
            if (list2 != null) {
                arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(list2, 10));
                for (String str3 : list2) {
                    arrayList.add(str3 != null ? zoijcleaow.nufgyqmvbu(jyumaefscl.f63067gtknphoqwx, str3, 0, 0, true, 3, null) : null);
                }
            } else {
                arrayList = null;
            }
            String str4 = this.f63083nufgyqmvbu;
            return new jyumaefscl(str, strNufgyqmvbu, strNufgyqmvbu2, str2, iWkgbmnqykc, arrayList2, arrayList, str4 != null ? zoijcleaow.nufgyqmvbu(jyumaefscl.f63067gtknphoqwx, str4, 0, 0, false, 7, null) : null, toString());
        }

        /* JADX WARN: Code duplicated, block: B:6:0x001d  */
        public final iobyxmoadg rgvfuqvkyq(String str) {
            List listBtonecajqb;
            if (str != null) {
                zoijcleaow zoijcleaowVar = jyumaefscl.f63067gtknphoqwx;
                String strZoijcleaow = zoijcleaow.zoijcleaow(zoijcleaowVar, str, 0, 0, " \"'<>#", false, false, true, false, null, 219, null);
                if (strZoijcleaow != null) {
                    listBtonecajqb = zoijcleaowVar.btonecajqb(strZoijcleaow);
                } else {
                    listBtonecajqb = null;
                }
            } else {
                listBtonecajqb = null;
            }
            this.f63082lqeggnwhkg = listBtonecajqb;
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0085  */
        public String toString() {
            StringBuilder sb3 = new StringBuilder();
            String str = this.f63081iobyxmoadg;
            if (str != null) {
                sb3.append(str);
                sb3.append(EcomSbpViewModel.SCHEMA_DIVIDER);
            } else {
                sb3.append("//");
            }
            if (this.f63086zoijcleaow.length() > 0 || this.f63084ppxfxbqfkf.length() > 0) {
                sb3.append(this.f63086zoijcleaow);
                if (this.f63084ppxfxbqfkf.length() > 0) {
                    sb3.append(':');
                    sb3.append(this.f63084ppxfxbqfkf);
                }
                sb3.append('@');
            }
            String str2 = this.f63085wkgbmnqykc;
            if (str2 != null) {
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(str2);
                if (mj.kcexrzcfyt.ulzqkzuiru(str2, ':', false, 2, null)) {
                    sb3.append('[');
                    sb3.append(this.f63085wkgbmnqykc);
                    sb3.append(']');
                } else {
                    sb3.append(this.f63085wkgbmnqykc);
                }
            }
            if (this.f63079eablkybsjg != -1 || this.f63081iobyxmoadg != null) {
                int iWkgbmnqykc = wkgbmnqykc();
                String str3 = this.f63081iobyxmoadg;
                if (str3 != null) {
                    zoijcleaow zoijcleaowVar = jyumaefscl.f63067gtknphoqwx;
                    kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(str3);
                    if (iWkgbmnqykc != zoijcleaowVar.ppxfxbqfkf(str3)) {
                        sb3.append(':');
                        sb3.append(iWkgbmnqykc);
                    }
                } else {
                    sb3.append(':');
                    sb3.append(iWkgbmnqykc);
                }
            }
            zoijcleaow zoijcleaowVar2 = jyumaefscl.f63067gtknphoqwx;
            zoijcleaowVar2.dxjokdxxww(this.f63080gxszxtbevo, sb3);
            if (this.f63082lqeggnwhkg != null) {
                sb3.append('?');
                List list = this.f63082lqeggnwhkg;
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(list);
                zoijcleaowVar2.gtknphoqwx(list, sb3);
            }
            if (this.f63083nufgyqmvbu != null) {
                sb3.append('#');
                sb3.append(this.f63083nufgyqmvbu);
            }
            String string = sb3.toString();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }

        public final iobyxmoadg vdvldrhtss() {
            String str = this.f63085wkgbmnqykc;
            this.f63085wkgbmnqykc = str != null ? new mj.rgvfuqvkyq("[\"<>^`{|}]").rgvfuqvkyq(str, "") : null;
            int size = this.f63080gxszxtbevo.size();
            for (int i13 = 0; i13 < size; i13++) {
                List list = this.f63080gxszxtbevo;
                list.set(i13, zoijcleaow.zoijcleaow(jyumaefscl.f63067gtknphoqwx, (String) list.get(i13), 0, 0, "[]", true, true, false, false, null, 227, null));
            }
            List list2 = this.f63082lqeggnwhkg;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    String str2 = (String) list2.get(i14);
                    list2.set(i14, str2 != null ? zoijcleaow.zoijcleaow(jyumaefscl.f63067gtknphoqwx, str2, 0, 0, "\\^`{|}", true, true, true, false, null, 195, null) : null);
                }
            }
            String str3 = this.f63083nufgyqmvbu;
            this.f63083nufgyqmvbu = str3 != null ? zoijcleaow.zoijcleaow(jyumaefscl.f63067gtknphoqwx, str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163, null) : null;
            return this;
        }

        public final void yggfygwlhe(String str) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<set-?>");
            this.f63084ppxfxbqfkf = str;
        }

        public final void zdlpuopuiu(String str) {
            this.f63083nufgyqmvbu = str;
        }

        public final iobyxmoadg zoijcleaow(String name, String str) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
            if (this.f63082lqeggnwhkg == null) {
                this.f63082lqeggnwhkg = new ArrayList();
            }
            List list = this.f63082lqeggnwhkg;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(list);
            zoijcleaow zoijcleaowVar = jyumaefscl.f63067gtknphoqwx;
            list.add(zoijcleaow.zoijcleaow(zoijcleaowVar, name, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219, null));
            List list2 = this.f63082lqeggnwhkg;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(list2);
            list2.add(str != null ? zoijcleaow.zoijcleaow(zoijcleaowVar, str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219, null) : null);
            return this;
        }
    }

    public static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:35:0x0054  */
        /* JADX WARN: Code duplicated, block: B:44:0x006d  */
        /* JADX WARN: Code duplicated, block: B:47:0x0074  */
        /* JADX WARN: Code duplicated, block: B:53:0x008d  */
        /* JADX WARN: Code duplicated, block: B:56:0x0096 A[LOOP:1: B:54:0x0090->B:56:0x0096, LOOP_END] */
        private final void draadjrbmk(bl.ppxfxbqfkf ppxfxbqfkfVar, String str, int i13, int i14, String str2, boolean z13, boolean z14, boolean z15, boolean z16, Charset charset) {
            int iCharCount = i13;
            bl.ppxfxbqfkf ppxfxbqfkfVar2 = null;
            while (iCharCount < i14) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (!z13 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                    if (iCodePointAt == 32 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                        ppxfxbqfkfVar.metgxyhuhe("+");
                    } else if (iCodePointAt == 43 && z15) {
                        ppxfxbqfkfVar.metgxyhuhe(z13 ? "+" : "%2B");
                    } else if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z16) || mj.kcexrzcfyt.ulzqkzuiru(str2, (char) iCodePointAt, false, 2, null))) {
                        if (ppxfxbqfkfVar2 == null) {
                            ppxfxbqfkfVar2 = new bl.ppxfxbqfkf();
                        }
                        if (charset != null || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(charset, mj.wkgbmnqykc.f67326zoijcleaow)) {
                            ppxfxbqfkfVar2.uawqvzlxes(iCodePointAt);
                        } else {
                            ppxfxbqfkfVar2.iyctptxqzt(str, iCharCount, Character.charCount(iCodePointAt) + iCharCount, charset);
                        }
                        while (!ppxfxbqfkfVar2.n()) {
                            byte b13 = ppxfxbqfkfVar2.readByte();
                            ppxfxbqfkfVar.o(37);
                            ppxfxbqfkfVar.o(jyumaefscl.f63066draadjrbmk[((b13 & 255) >> 4) & 15]);
                            ppxfxbqfkfVar.o(jyumaefscl.f63066draadjrbmk[b13 & 15]);
                        }
                    } else {
                        if (iCodePointAt == 37) {
                            if (z13) {
                                if (z14) {
                                    if (!eablkybsjg(str, iCharCount, i14)) {
                                    }
                                }
                            }
                            if (ppxfxbqfkfVar2 == null) {
                                ppxfxbqfkfVar2 = new bl.ppxfxbqfkf();
                            }
                            if (charset != null) {
                                ppxfxbqfkfVar2.uawqvzlxes(iCodePointAt);
                            } else {
                                ppxfxbqfkfVar2.uawqvzlxes(iCodePointAt);
                            }
                            while (!ppxfxbqfkfVar2.n()) {
                                byte b14 = ppxfxbqfkfVar2.readByte();
                                ppxfxbqfkfVar.o(37);
                                ppxfxbqfkfVar.o(jyumaefscl.f63066draadjrbmk[((b14 & 255) >> 4) & 15]);
                                ppxfxbqfkfVar.o(jyumaefscl.f63066draadjrbmk[b14 & 15]);
                            }
                        }
                        ppxfxbqfkfVar.uawqvzlxes(iCodePointAt);
                    }
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
        }

        private final boolean eablkybsjg(String str, int i13, int i14) {
            int i15 = i13 + 2;
            return i15 < i14 && str.charAt(i13) == '%' && mk.wflxmlrfwp.pmvmpeiblj(str.charAt(i13 + 1)) != -1 && mk.wflxmlrfwp.pmvmpeiblj(str.charAt(i15)) != -1;
        }

        public static /* synthetic */ String nufgyqmvbu(zoijcleaow zoijcleaowVar, String str, int i13, int i14, boolean z13, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                i13 = 0;
            }
            if ((i15 & 2) != 0) {
                i14 = str.length();
            }
            if ((i15 & 4) != 0) {
                z13 = false;
            }
            return zoijcleaowVar.lqeggnwhkg(str, i13, i14, z13);
        }

        private final void wflxmlrfwp(bl.ppxfxbqfkf ppxfxbqfkfVar, String str, int i13, int i14, boolean z13) {
            int i15;
            while (i13 < i14) {
                int iCodePointAt = str.codePointAt(i13);
                if (iCodePointAt == 37 && (i15 = i13 + 2) < i14) {
                    int iPmvmpeiblj = mk.wflxmlrfwp.pmvmpeiblj(str.charAt(i13 + 1));
                    int iPmvmpeiblj2 = mk.wflxmlrfwp.pmvmpeiblj(str.charAt(i15));
                    if (iPmvmpeiblj == -1 || iPmvmpeiblj2 == -1) {
                        ppxfxbqfkfVar.uawqvzlxes(iCodePointAt);
                        i13 += Character.charCount(iCodePointAt);
                    } else {
                        ppxfxbqfkfVar.o((iPmvmpeiblj << 4) + iPmvmpeiblj2);
                        i13 = Character.charCount(iCodePointAt) + i15;
                    }
                } else if (iCodePointAt == 43 && z13) {
                    ppxfxbqfkfVar.o(32);
                    i13++;
                } else {
                    ppxfxbqfkfVar.uawqvzlxes(iCodePointAt);
                    i13 += Character.charCount(iCodePointAt);
                }
            }
        }

        public static /* synthetic */ String zoijcleaow(zoijcleaow zoijcleaowVar, String str, int i13, int i14, String str2, boolean z13, boolean z14, boolean z15, boolean z16, Charset charset, int i15, Object obj) {
            return zoijcleaowVar.iobyxmoadg(str, (i15 & 1) != 0 ? 0 : i13, (i15 & 2) != 0 ? str.length() : i14, str2, (i15 & 8) != 0 ? false : z13, (i15 & 16) != 0 ? false : z14, (i15 & 32) != 0 ? false : z15, (i15 & 64) != 0 ? false : z16, (i15 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : charset);
        }

        public final List btonecajqb(String str) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i13 = 0;
            while (i13 <= str.length()) {
                int iYfnezrywwk = mj.kcexrzcfyt.yfnezrywwk(str, '&', i13, false, 4, null);
                if (iYfnezrywwk == -1) {
                    iYfnezrywwk = str.length();
                }
                int i14 = iYfnezrywwk;
                int iYfnezrywwk2 = mj.kcexrzcfyt.yfnezrywwk(str, '=', i13, false, 4, null);
                if (iYfnezrywwk2 == -1 || iYfnezrywwk2 > i14) {
                    String strSubstring = str.substring(i13, i14);
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str.substring(i13, iYfnezrywwk2);
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str.substring(iYfnezrywwk2 + 1, i14);
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                }
                i13 = i14 + 1;
            }
            return arrayList;
        }

        public final void dxjokdxxww(List list, StringBuilder out) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(list, "<this>");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(out, "out");
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                out.append('/');
                out.append((String) list.get(i13));
            }
        }

        public final void gtknphoqwx(List list, StringBuilder out) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(list, "<this>");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(out, "out");
            zg.nufgyqmvbu nufgyqmvbuVarZdlpuopuiu = zg.gtknphoqwx.zdlpuopuiu(zg.gtknphoqwx.jyumaefscl(0, list.size()), 2);
            int iWkgbmnqykc = nufgyqmvbuVarZdlpuopuiu.wkgbmnqykc();
            int iEablkybsjg = nufgyqmvbuVarZdlpuopuiu.eablkybsjg();
            int iGxszxtbevo = nufgyqmvbuVarZdlpuopuiu.gxszxtbevo();
            if ((iGxszxtbevo <= 0 || iWkgbmnqykc > iEablkybsjg) && (iGxszxtbevo >= 0 || iEablkybsjg > iWkgbmnqykc)) {
                return;
            }
            while (true) {
                String str = (String) list.get(iWkgbmnqykc);
                String str2 = (String) list.get(iWkgbmnqykc + 1);
                if (iWkgbmnqykc > 0) {
                    out.append('&');
                }
                out.append(str);
                if (str2 != null) {
                    out.append('=');
                    out.append(str2);
                }
                if (iWkgbmnqykc == iEablkybsjg) {
                    return;
                } else {
                    iWkgbmnqykc += iGxszxtbevo;
                }
            }
        }

        public final jyumaefscl gxszxtbevo(String str) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
            try {
                return wkgbmnqykc(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0041  */
        public final String iobyxmoadg(String str, int i13, int i14, String encodeSet, boolean z13, boolean z14, boolean z15, boolean z16, Charset charset) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(encodeSet, "encodeSet");
            int iCharCount = i13;
            while (true) {
                if (iCharCount >= i14) {
                    String strSubstring = str.substring(i13, i14);
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    return strSubstring;
                }
                int iCodePointAt = str.codePointAt(iCharCount);
                if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z16) || mj.kcexrzcfyt.ulzqkzuiru(encodeSet, (char) iCodePointAt, false, 2, null))) {
                    break;
                }
                if (iCodePointAt == 37) {
                    if (!z13) {
                        break;
                    }
                    if (z14) {
                        if (eablkybsjg(str, iCharCount, i14)) {
                        }
                    }
                    if (iCodePointAt == 43) {
                    }
                    iCharCount += Character.charCount(iCodePointAt);
                } else if (iCodePointAt == 43 || !z15) {
                    iCharCount += Character.charCount(iCodePointAt);
                }
                bl.ppxfxbqfkf ppxfxbqfkfVar = new bl.ppxfxbqfkf();
                ppxfxbqfkfVar.sflfametgt(str, i13, iCharCount);
                draadjrbmk(ppxfxbqfkfVar, str, iCharCount, i14, encodeSet, z13, z14, z15, z16, charset);
                return ppxfxbqfkfVar.istkbnxepw();
            }
            bl.ppxfxbqfkf ppxfxbqfkfVar2 = new bl.ppxfxbqfkf();
            ppxfxbqfkfVar2.sflfametgt(str, i13, iCharCount);
            draadjrbmk(ppxfxbqfkfVar2, str, iCharCount, i14, encodeSet, z13, z14, z15, z16, charset);
            return ppxfxbqfkfVar2.istkbnxepw();
        }

        public final String lqeggnwhkg(String str, int i13, int i14, boolean z13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
            for (int i15 = i13; i15 < i14; i15++) {
                char cCharAt = str.charAt(i15);
                if (cCharAt == '%' || (cCharAt == '+' && z13)) {
                    bl.ppxfxbqfkf ppxfxbqfkfVar = new bl.ppxfxbqfkf();
                    ppxfxbqfkfVar.sflfametgt(str, i13, i15);
                    wflxmlrfwp(ppxfxbqfkfVar, str, i15, i14, z13);
                    return ppxfxbqfkfVar.istkbnxepw();
                }
            }
            String strSubstring = str.substring(i13, i14);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public final int ppxfxbqfkf(String scheme) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(scheme, "scheme");
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(scheme, HostSelectionInterceptorImpl.PROTOCOL_HTTP)) {
                return 80;
            }
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(scheme, HostSelectionInterceptorImpl.PROTOCOL_HTTPS) ? 443 : -1;
        }

        public final jyumaefscl wkgbmnqykc(String str) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
            return new iobyxmoadg().gtknphoqwx(null, str).ppxfxbqfkf();
        }

        private zoijcleaow() {
        }
    }

    public jyumaefscl(String scheme, String username, String password, String host, int i13, List pathSegments, List list, String str, String url) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(scheme, "scheme");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(username, "username");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(password, "password");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(host, "host");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(pathSegments, "pathSegments");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(url, "url");
        this.f63072iobyxmoadg = scheme;
        this.f63077zoijcleaow = username;
        this.f63075ppxfxbqfkf = password;
        this.f63076wkgbmnqykc = host;
        this.f63070eablkybsjg = i13;
        this.f63071gxszxtbevo = pathSegments;
        this.f63073lqeggnwhkg = list;
        this.f63074nufgyqmvbu = str;
        this.f63069dxjokdxxww = url;
        this.f63068btonecajqb = kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(scheme, HostSelectionInterceptorImpl.PROTOCOL_HTTPS);
    }

    public static final jyumaefscl nufgyqmvbu(String str) {
        return f63067gtknphoqwx.wkgbmnqykc(str);
    }

    public static final jyumaefscl wflxmlrfwp(String str) {
        return f63067gtknphoqwx.gxszxtbevo(str);
    }

    public final List agtfadlqog() {
        return this.f63071gxszxtbevo;
    }

    public final boolean btonecajqb() {
        return this.f63068btonecajqb;
    }

    public final iobyxmoadg draadjrbmk(String link) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(link, "link");
        try {
            return new iobyxmoadg().gtknphoqwx(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final String dxjokdxxww() {
        return this.f63076wkgbmnqykc;
    }

    public final List eablkybsjg() {
        int iYfnezrywwk = mj.kcexrzcfyt.yfnezrywwk(this.f63069dxjokdxxww, '/', this.f63072iobyxmoadg.length() + 3, false, 4, null);
        String str = this.f63069dxjokdxxww;
        int iDxjokdxxww = mk.wflxmlrfwp.dxjokdxxww(str, "?#", iYfnezrywwk, str.length());
        ArrayList arrayList = new ArrayList();
        while (iYfnezrywwk < iDxjokdxxww) {
            int i13 = iYfnezrywwk + 1;
            int iNufgyqmvbu = mk.wflxmlrfwp.nufgyqmvbu(this.f63069dxjokdxxww, '/', i13, iDxjokdxxww);
            String strSubstring = this.f63069dxjokdxxww.substring(i13, iNufgyqmvbu);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iYfnezrywwk = iNufgyqmvbu;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof jyumaefscl) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((jyumaefscl) obj).f63069dxjokdxxww, this.f63069dxjokdxxww);
    }

    public final iobyxmoadg gtknphoqwx() {
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
        iobyxmoadgVar.esjtqupxsv(this.f63072iobyxmoadg);
        iobyxmoadgVar.jyumaefscl(lqeggnwhkg());
        iobyxmoadgVar.yggfygwlhe(ppxfxbqfkf());
        iobyxmoadgVar.iwizpuwonk(this.f63076wkgbmnqykc);
        iobyxmoadgVar.cqumvgiudr(this.f63070eablkybsjg != f63067gtknphoqwx.ppxfxbqfkf(this.f63072iobyxmoadg) ? this.f63070eablkybsjg : -1);
        iobyxmoadgVar.lqeggnwhkg().clear();
        iobyxmoadgVar.lqeggnwhkg().addAll(eablkybsjg());
        iobyxmoadgVar.eablkybsjg(gxszxtbevo());
        iobyxmoadgVar.zdlpuopuiu(zoijcleaow());
        return iobyxmoadgVar;
    }

    public final String gxszxtbevo() {
        if (this.f63073lqeggnwhkg == null) {
            return null;
        }
        int iYfnezrywwk = mj.kcexrzcfyt.yfnezrywwk(this.f63069dxjokdxxww, '?', 0, false, 6, null) + 1;
        String str = this.f63069dxjokdxxww;
        String strSubstring = this.f63069dxjokdxxww.substring(iYfnezrywwk, mk.wflxmlrfwp.nufgyqmvbu(str, '#', iYfnezrywwk, str.length()));
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public int hashCode() {
        return this.f63069dxjokdxxww.hashCode();
    }

    public final URL jyumaefscl() {
        try {
            return new URL(this.f63069dxjokdxxww);
        } catch (MalformedURLException e13) {
            throw new RuntimeException(e13);
        }
    }

    public final jyumaefscl kcexrzcfyt(String link) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(link, "link");
        iobyxmoadg iobyxmoadgVarDraadjrbmk = draadjrbmk(link);
        if (iobyxmoadgVarDraadjrbmk != null) {
            return iobyxmoadgVarDraadjrbmk.ppxfxbqfkf();
        }
        return null;
    }

    public final String lqeggnwhkg() {
        if (this.f63077zoijcleaow.length() == 0) {
            return "";
        }
        int length = this.f63072iobyxmoadg.length() + 3;
        String str = this.f63069dxjokdxxww;
        String strSubstring = this.f63069dxjokdxxww.substring(length, mk.wflxmlrfwp.dxjokdxxww(str, ":@", length, str.length()));
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final int ojitshcjhn() {
        return this.f63071gxszxtbevo.size();
    }

    public final String oxmwwwfdhm() {
        iobyxmoadg iobyxmoadgVarDraadjrbmk = draadjrbmk("/...");
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(iobyxmoadgVarDraadjrbmk);
        return iobyxmoadgVarDraadjrbmk.lereixgezr("").draadjrbmk("").ppxfxbqfkf().toString();
    }

    public final String ppxfxbqfkf() {
        if (this.f63075ppxfxbqfkf.length() == 0) {
            return "";
        }
        String strSubstring = this.f63069dxjokdxxww.substring(mj.kcexrzcfyt.yfnezrywwk(this.f63069dxjokdxxww, ':', this.f63072iobyxmoadg.length() + 3, false, 4, null) + 1, mj.kcexrzcfyt.yfnezrywwk(this.f63069dxjokdxxww, '@', 0, false, 6, null));
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final int rgvfuqvkyq() {
        return this.f63070eablkybsjg;
    }

    public String toString() {
        return this.f63069dxjokdxxww;
    }

    public final String vdvldrhtss() {
        if (this.f63073lqeggnwhkg == null) {
            return null;
        }
        StringBuilder sb3 = new StringBuilder();
        f63067gtknphoqwx.gtknphoqwx(this.f63073lqeggnwhkg, sb3);
        return sb3.toString();
    }

    public final String wkgbmnqykc() {
        int iYfnezrywwk = mj.kcexrzcfyt.yfnezrywwk(this.f63069dxjokdxxww, '/', this.f63072iobyxmoadg.length() + 3, false, 4, null);
        String str = this.f63069dxjokdxxww;
        String strSubstring = this.f63069dxjokdxxww.substring(iYfnezrywwk, mk.wflxmlrfwp.dxjokdxxww(str, "?#", iYfnezrywwk, str.length()));
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final URI yggfygwlhe() {
        String string = gtknphoqwx().vdvldrhtss().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e13) {
            try {
                URI uriCreate = URI.create(new mj.rgvfuqvkyq("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").rgvfuqvkyq(string, ""));
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e13);
            }
        }
    }

    public final String zdlpuopuiu() {
        return this.f63072iobyxmoadg;
    }

    public final String zoijcleaow() {
        if (this.f63074nufgyqmvbu == null) {
            return null;
        }
        String strSubstring = this.f63069dxjokdxxww.substring(mj.kcexrzcfyt.yfnezrywwk(this.f63069dxjokdxxww, '#', 0, false, 6, null) + 1);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }
}
