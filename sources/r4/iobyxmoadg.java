package r4;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.protobuf.DescriptorProtos;
import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.impl.C4007z9;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import modern.payments.ecomAndroid.util.networkErrorHandler.impl.OrderServiceErrorHandlerImpl;
import q4.gtknphoqwx;
import q4.ojitshcjhn;
import q4.rgvfuqvkyq;
import y2.kcexrzcfyt;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg extends eablkybsjg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final int f81626btonecajqb;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f81627cqumvgiudr;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final long f81628draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final int f81629dxjokdxxww;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private long f81630esjtqupxsv;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final int f81631gtknphoqwx;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private byte f81633jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private boolean f81634kcexrzcfyt;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private List f81636ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private int f81637oxmwwwfdhm;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private List f81638rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private int f81639vdvldrhtss;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private byte f81641yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private boolean f81642zdlpuopuiu;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private static final int[] f81620lereixgezr = {11, 1, 3, 12, 14, 5, 7, 9};

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private static final int[] f81622pmvmpeiblj = {0, 4, 8, 12, 16, 20, 24, 28};

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private static final int[] f81624zynmafqrjb = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private static final int[] f81619istkbnxepw = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, BuildConfig.API_LEVEL, 116, 117, 118, 119, 120, 121, 122, 231, 247, OrderServiceErrorHandlerImpl.PAYMENT_UNSUCCESSFUL_DESCRIPTION, 241, 9632};

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private static final int[] f81617cdpycssgdh = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private static final int[] f81623yadqdtsiqt = {193, OrderServiceErrorHandlerImpl.ACCESS_DENIED, OrderServiceErrorHandlerImpl.SYSTEM_ERROR, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, OrderServiceErrorHandlerImpl.VALIDATION_EXCEPTION, OrderServiceErrorHandlerImpl.OPERATION_PARAMETER_INCORRECT, 235, OrderServiceErrorHandlerImpl.PAYMENT_TOKEN_EXPIRED, OrderServiceErrorHandlerImpl.ORDER_LOCKED, 239, 212, 217, 249, 219, 171, 187};

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private static final int[] f81618iozdgvuglv = {195, 227, OrderServiceErrorHandlerImpl.PAYMENT_ATTEMPTS_EXCEEDED, OrderServiceErrorHandlerImpl.ORDER_NOT_FOUND, 236, OrderServiceErrorHandlerImpl.ORDER_IN_PROGRESS, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private static final boolean[] f81621lmojexxdyd = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final yadqdtsiqt f81635nufgyqmvbu = new yadqdtsiqt();

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final ArrayList f81640wflxmlrfwp = new ArrayList();

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private C1820iobyxmoadg f81625agtfadlqog = new C1820iobyxmoadg(0, 4);

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f81632iwizpuwonk = 0;

    /* JADX INFO: renamed from: r4.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static final class C1820iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private int f81643eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private int f81644gxszxtbevo;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private int f81646lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private int f81647nufgyqmvbu;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private int f81649wkgbmnqykc;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f81645iobyxmoadg = new ArrayList();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f81650zoijcleaow = new ArrayList();

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final StringBuilder f81648ppxfxbqfkf = new StringBuilder();

        /* JADX INFO: renamed from: r4.iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        private static class C1821iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public final int f81651iobyxmoadg;

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            public int f81652ppxfxbqfkf;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            public final boolean f81653zoijcleaow;

            public C1821iobyxmoadg(int i13, boolean z13, int i14) {
                this.f81651iobyxmoadg = i13;
                this.f81653zoijcleaow = z13;
                this.f81652ppxfxbqfkf = i14;
            }
        }

        public C1820iobyxmoadg(int i13, int i14) {
            btonecajqb(i13);
            this.f81647nufgyqmvbu = i14;
        }

        private static void agtfadlqog(SpannableStringBuilder spannableStringBuilder, int i13, int i14, int i15) {
            if (i15 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i15), i13, i14, 33);
        }

        private SpannableString nufgyqmvbu() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f81648ppxfxbqfkf);
            int length = spannableStringBuilder.length();
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = 0;
            int i18 = 0;
            boolean z13 = false;
            while (i17 < this.f81645iobyxmoadg.size()) {
                C1821iobyxmoadg c1821iobyxmoadg = (C1821iobyxmoadg) this.f81645iobyxmoadg.get(i17);
                boolean z14 = c1821iobyxmoadg.f81653zoijcleaow;
                int i19 = c1821iobyxmoadg.f81651iobyxmoadg;
                if (i19 != 8) {
                    boolean z15 = i19 == 7;
                    if (i19 != 7) {
                        i16 = iobyxmoadg.f81624zynmafqrjb[i19];
                    }
                    z13 = z15;
                }
                int i23 = c1821iobyxmoadg.f81652ppxfxbqfkf;
                i17++;
                if (i23 != (i17 < this.f81645iobyxmoadg.size() ? ((C1821iobyxmoadg) this.f81645iobyxmoadg.get(i17)).f81652ppxfxbqfkf : length)) {
                    if (i13 != -1 && !z14) {
                        vdvldrhtss(spannableStringBuilder, i13, i23);
                        i13 = -1;
                    } else if (i13 == -1 && z14) {
                        i13 = i23;
                    }
                    if (i14 != -1 && !z13) {
                        ojitshcjhn(spannableStringBuilder, i14, i23);
                        i14 = -1;
                    } else if (i14 == -1 && z13) {
                        i14 = i23;
                    }
                    if (i16 != i15) {
                        agtfadlqog(spannableStringBuilder, i18, i23, i15);
                        i15 = i16;
                        i18 = i23;
                    }
                }
            }
            if (i13 != -1 && i13 != length) {
                vdvldrhtss(spannableStringBuilder, i13, length);
            }
            if (i14 != -1 && i14 != length) {
                ojitshcjhn(spannableStringBuilder, i14, length);
            }
            if (i18 != length) {
                agtfadlqog(spannableStringBuilder, i18, length, i15);
            }
            return new SpannableString(spannableStringBuilder);
        }

        private static void ojitshcjhn(SpannableStringBuilder spannableStringBuilder, int i13, int i14) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i13, i14, 33);
        }

        private static void vdvldrhtss(SpannableStringBuilder spannableStringBuilder, int i13, int i14) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i13, i14, 33);
        }

        public void btonecajqb(int i13) {
            this.f81646lqeggnwhkg = i13;
            this.f81645iobyxmoadg.clear();
            this.f81650zoijcleaow.clear();
            this.f81648ppxfxbqfkf.setLength(0);
            this.f81649wkgbmnqykc = 15;
            this.f81643eablkybsjg = 0;
            this.f81644gxszxtbevo = 0;
        }

        public void draadjrbmk(int i13) {
            this.f81646lqeggnwhkg = i13;
        }

        public boolean dxjokdxxww() {
            return this.f81645iobyxmoadg.isEmpty() && this.f81650zoijcleaow.isEmpty() && this.f81648ppxfxbqfkf.length() == 0;
        }

        public void eablkybsjg(char c13) {
            if (this.f81648ppxfxbqfkf.length() < 32) {
                this.f81648ppxfxbqfkf.append(c13);
            }
        }

        public void gtknphoqwx() {
            this.f81650zoijcleaow.add(nufgyqmvbu());
            this.f81648ppxfxbqfkf.setLength(0);
            this.f81645iobyxmoadg.clear();
            int iMin = Math.min(this.f81647nufgyqmvbu, this.f81649wkgbmnqykc);
            while (this.f81650zoijcleaow.size() >= iMin) {
                this.f81650zoijcleaow.remove(0);
            }
        }

        public void gxszxtbevo() {
            int length = this.f81648ppxfxbqfkf.length();
            if (length > 0) {
                this.f81648ppxfxbqfkf.delete(length - 1, length);
                for (int size = this.f81645iobyxmoadg.size() - 1; size >= 0; size--) {
                    C1821iobyxmoadg c1821iobyxmoadg = (C1821iobyxmoadg) this.f81645iobyxmoadg.get(size);
                    int i13 = c1821iobyxmoadg.f81652ppxfxbqfkf;
                    if (i13 != length) {
                        return;
                    }
                    c1821iobyxmoadg.f81652ppxfxbqfkf = i13 - 1;
                }
            }
        }

        public x2.iobyxmoadg lqeggnwhkg(int i13) {
            float f13;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i14 = 0; i14 < this.f81650zoijcleaow.size(); i14++) {
                spannableStringBuilder.append((CharSequence) this.f81650zoijcleaow.get(i14));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) nufgyqmvbu());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i15 = this.f81643eablkybsjg + this.f81644gxszxtbevo;
            int length = (32 - i15) - spannableStringBuilder.length();
            int i16 = i15 - length;
            if (i13 == Integer.MIN_VALUE) {
                i13 = (this.f81646lqeggnwhkg != 2 || (Math.abs(i16) >= 3 && length >= 0)) ? (this.f81646lqeggnwhkg != 2 || i16 <= 0) ? 0 : 2 : 1;
            }
            if (i13 != 1) {
                if (i13 == 2) {
                    i15 = 32 - length;
                }
                f13 = ((i15 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f13 = 0.5f;
            }
            int i17 = this.f81649wkgbmnqykc;
            if (i17 > 7) {
                i17 -= 17;
            } else if (this.f81646lqeggnwhkg == 1) {
                i17 -= this.f81647nufgyqmvbu - 1;
            }
            return new x2.iobyxmoadg.zoijcleaow().ojitshcjhn(spannableStringBuilder).rgvfuqvkyq(Layout.Alignment.ALIGN_NORMAL).nufgyqmvbu(i17, 1).gtknphoqwx(f13).draadjrbmk(i13).iobyxmoadg();
        }

        public void rgvfuqvkyq(int i13, boolean z13) {
            this.f81645iobyxmoadg.add(new C1821iobyxmoadg(i13, z13, this.f81648ppxfxbqfkf.length()));
        }

        public void wflxmlrfwp(int i13) {
            this.f81647nufgyqmvbu = i13;
        }
    }

    public iobyxmoadg(String str, int i13, long j13) {
        if (j13 != -9223372036854775807L) {
            y2.iobyxmoadg.iobyxmoadg(j13 >= 16000);
            this.f81628draadjrbmk = j13 * 1000;
        } else {
            this.f81628draadjrbmk = -9223372036854775807L;
        }
        this.f81629dxjokdxxww = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i13 == 1) {
            this.f81631gtknphoqwx = 0;
            this.f81626btonecajqb = 0;
        } else if (i13 == 2) {
            this.f81631gtknphoqwx = 1;
            this.f81626btonecajqb = 0;
        } else if (i13 == 3) {
            this.f81631gtknphoqwx = 0;
            this.f81626btonecajqb = 1;
        } else if (i13 != 4) {
            kcexrzcfyt.nufgyqmvbu("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f81631gtknphoqwx = 0;
            this.f81626btonecajqb = 0;
        } else {
            this.f81631gtknphoqwx = 1;
            this.f81626btonecajqb = 1;
        }
        dsvhmnatus(0);
        cllcsxoeiz();
        this.f81627cqumvgiudr = true;
        this.f81630esjtqupxsv = -9223372036854775807L;
    }

    private static boolean cdpycssgdh(byte b13, byte b14) {
        return (b13 & 247) == 17 && (b14 & 240) == 32;
    }

    private void cllcsxoeiz() {
        this.f81625agtfadlqog.btonecajqb(this.f81639vdvldrhtss);
        this.f81640wflxmlrfwp.clear();
        this.f81640wflxmlrfwp.add(this.f81625agtfadlqog);
    }

    private static char cqumvgiudr(byte b13) {
        return (char) f81617cdpycssgdh[b13 & 15];
    }

    private void dsvhmnatus(int i13) {
        int i14 = this.f81639vdvldrhtss;
        if (i14 == i13) {
            return;
        }
        this.f81639vdvldrhtss = i13;
        if (i13 == 3) {
            for (int i15 = 0; i15 < this.f81640wflxmlrfwp.size(); i15++) {
                ((C1820iobyxmoadg) this.f81640wflxmlrfwp.get(i15)).draadjrbmk(i13);
            }
            return;
        }
        cllcsxoeiz();
        if (i14 == 3 || i13 == 1 || i13 == 0) {
            this.f81636ojitshcjhn = Collections.emptyList();
        }
    }

    private void esjtqupxsv(byte b13) {
        this.f81625agtfadlqog.eablkybsjg(' ');
        this.f81625agtfadlqog.rgvfuqvkyq((b13 >> 1) & 7, (b13 & 1) == 1);
    }

    private static boolean hcddaimhww(byte b13, byte b14) {
        return (b13 & 247) == 23 && b14 >= 33 && b14 <= 35;
    }

    private void hkdspvbjdz(byte b13, byte b14) {
        if (jpowsppfya(b13)) {
            this.f81627cqumvgiudr = false;
            return;
        }
        if (ylkuphrtab(b13)) {
            if (b14 != 32 && b14 != 47) {
                switch (b14) {
                    case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    case C4007z9.K /* 38 */:
                    case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        break;
                    default:
                        switch (b14) {
                            case 42:
                            case 43:
                                this.f81627cqumvgiudr = false;
                                break;
                        }
                }
            }
            this.f81627cqumvgiudr = true;
        }
    }

    private static boolean iozdgvuglv(byte b13, byte b14) {
        return (b13 & 240) == 16 && (b14 & 192) == 64;
    }

    private static boolean istkbnxepw(byte b13, byte b14) {
        return (b13 & 246) == 18 && (b14 & 224) == 32;
    }

    private static char iwizpuwonk(byte b13, byte b14) {
        return (b13 & 1) == 0 ? yggfygwlhe(b14) : jyumaefscl(b14);
    }

    private static boolean jpowsppfya(byte b13) {
        return 1 <= b13 && b13 <= 15;
    }

    private static char jyumaefscl(byte b13) {
        return (char) f81618iozdgvuglv[b13 & 31];
    }

    private static int kcexrzcfyt(byte b13) {
        return (b13 >> 3) & 1;
    }

    private boolean kegysxyocb(byte b13) {
        if (zynmafqrjb(b13)) {
            this.f81632iwizpuwonk = kcexrzcfyt(b13);
        }
        return this.f81632iwizpuwonk == this.f81631gtknphoqwx;
    }

    private void lereixgezr(byte b13) {
        if (b13 == 32) {
            dsvhmnatus(2);
            return;
        }
        if (b13 == 41) {
            dsvhmnatus(3);
            return;
        }
        switch (b13) {
            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                dsvhmnatus(1);
                wypolnanlu(2);
                break;
            case C4007z9.K /* 38 */:
                dsvhmnatus(1);
                wypolnanlu(3);
                break;
            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                dsvhmnatus(1);
                wypolnanlu(4);
                break;
            default:
                int i13 = this.f81639vdvldrhtss;
                if (i13 != 0) {
                    if (b13 != 33) {
                        switch (b13) {
                            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                this.f81636ojitshcjhn = Collections.emptyList();
                                int i14 = this.f81639vdvldrhtss;
                                if (i14 == 1 || i14 == 3) {
                                    cllcsxoeiz();
                                }
                                break;
                            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                if (i13 == 1 && !this.f81625agtfadlqog.dxjokdxxww()) {
                                    this.f81625agtfadlqog.gtknphoqwx();
                                    break;
                                }
                                break;
                            case 46:
                                cllcsxoeiz();
                                break;
                            case 47:
                                this.f81636ojitshcjhn = zdlpuopuiu();
                                cllcsxoeiz();
                                break;
                        }
                    } else {
                        this.f81625agtfadlqog.gxszxtbevo();
                        break;
                    }
                }
                break;
        }
    }

    private static boolean lmojexxdyd(byte b13) {
        return (b13 & 240) == 16;
    }

    private static char oxmwwwfdhm(byte b13) {
        return (char) f81619istkbnxepw[(b13 & 127) - 32];
    }

    private static boolean pkzmftpjix(byte b13, byte b14) {
        return (b13 & 247) == 17 && (b14 & 240) == 48;
    }

    private void pmvmpeiblj(byte b13, byte b14) {
        int i13 = f81620lereixgezr[b13 & 7];
        if ((b14 & 32) != 0) {
            i13++;
        }
        if (i13 != this.f81625agtfadlqog.f81649wkgbmnqykc) {
            if (this.f81639vdvldrhtss != 1 && !this.f81625agtfadlqog.dxjokdxxww()) {
                C1820iobyxmoadg c1820iobyxmoadg = new C1820iobyxmoadg(this.f81639vdvldrhtss, this.f81637oxmwwwfdhm);
                this.f81625agtfadlqog = c1820iobyxmoadg;
                this.f81640wflxmlrfwp.add(c1820iobyxmoadg);
            }
            this.f81625agtfadlqog.f81649wkgbmnqykc = i13;
        }
        boolean z13 = (b14 & 16) == 16;
        boolean z14 = (b14 & 1) == 1;
        int i14 = (b14 >> 1) & 7;
        this.f81625agtfadlqog.rgvfuqvkyq(z13 ? 8 : i14, z14);
        if (z13) {
            this.f81625agtfadlqog.f81643eablkybsjg = f81622pmvmpeiblj[i14];
        }
    }

    private boolean stevsuqkhv() {
        return (this.f81628draadjrbmk == -9223372036854775807L || this.f81630esjtqupxsv == -9223372036854775807L || draadjrbmk() - this.f81630esjtqupxsv < this.f81628draadjrbmk) ? false : true;
    }

    private boolean wwaezpbzkn(boolean z13, byte b13, byte b14) {
        if (!z13 || !lmojexxdyd(b13)) {
            this.f81642zdlpuopuiu = false;
        } else {
            if (this.f81642zdlpuopuiu && this.f81641yggfygwlhe == b13 && this.f81633jyumaefscl == b14) {
                this.f81642zdlpuopuiu = false;
                return true;
            }
            this.f81642zdlpuopuiu = true;
            this.f81641yggfygwlhe = b13;
            this.f81633jyumaefscl = b14;
        }
        return false;
    }

    private void wypolnanlu(int i13) {
        this.f81637oxmwwwfdhm = i13;
        this.f81625agtfadlqog.wflxmlrfwp(i13);
    }

    private static boolean yadqdtsiqt(byte b13, byte b14) {
        return (b13 & 246) == 20 && (b14 & 240) == 32;
    }

    private static char yggfygwlhe(byte b13) {
        return (char) f81623yadqdtsiqt[b13 & 31];
    }

    private static boolean ylkuphrtab(byte b13) {
        return (b13 & 246) == 20;
    }

    private List zdlpuopuiu() {
        int size = this.f81640wflxmlrfwp.size();
        ArrayList arrayList = new ArrayList(size);
        int iMin = 2;
        for (int i13 = 0; i13 < size; i13++) {
            x2.iobyxmoadg iobyxmoadgVarLqeggnwhkg = ((C1820iobyxmoadg) this.f81640wflxmlrfwp.get(i13)).lqeggnwhkg(Integer.MIN_VALUE);
            arrayList.add(iobyxmoadgVarLqeggnwhkg);
            if (iobyxmoadgVarLqeggnwhkg != null) {
                iMin = Math.min(iMin, iobyxmoadgVarLqeggnwhkg.f120958dxjokdxxww);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i14 = 0; i14 < size; i14++) {
            x2.iobyxmoadg iobyxmoadgVar = (x2.iobyxmoadg) arrayList.get(i14);
            if (iobyxmoadgVar != null) {
                if (iobyxmoadgVar.f120958dxjokdxxww != iMin) {
                    iobyxmoadgVar = (x2.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(((C1820iobyxmoadg) this.f81640wflxmlrfwp.get(i14)).lqeggnwhkg(iMin));
                }
                arrayList2.add(iobyxmoadgVar);
            }
        }
        return arrayList2;
    }

    private static boolean zynmafqrjb(byte b13) {
        return (b13 & 224) == 0;
    }

    @Override // r4.eablkybsjg
    /* JADX INFO: renamed from: agtfadlqog */
    public /* bridge */ /* synthetic */ void ppxfxbqfkf(ojitshcjhn ojitshcjhnVar) {
        super.ppxfxbqfkf(ojitshcjhnVar);
    }

    @Override // r4.eablkybsjg, e3.wkgbmnqykc
    /* JADX INFO: renamed from: btonecajqb */
    public rgvfuqvkyq iobyxmoadg() {
        rgvfuqvkyq rgvfuqvkyqVarGtknphoqwx;
        rgvfuqvkyq rgvfuqvkyqVarIobyxmoadg = super.iobyxmoadg();
        if (rgvfuqvkyqVarIobyxmoadg != null) {
            return rgvfuqvkyqVarIobyxmoadg;
        }
        if (!stevsuqkhv() || (rgvfuqvkyqVarGtknphoqwx = gtknphoqwx()) == null) {
            return null;
        }
        this.f81636ojitshcjhn = Collections.emptyList();
        this.f81630esjtqupxsv = -9223372036854775807L;
        rgvfuqvkyqVarGtknphoqwx.rgvfuqvkyq(draadjrbmk(), lqeggnwhkg(), Long.MAX_VALUE);
        return rgvfuqvkyqVarGtknphoqwx;
    }

    @Override // r4.eablkybsjg
    /* JADX INFO: renamed from: dxjokdxxww */
    public /* bridge */ /* synthetic */ ojitshcjhn eablkybsjg() {
        return super.eablkybsjg();
    }

    @Override // r4.eablkybsjg, e3.wkgbmnqykc
    public void flush() {
        super.flush();
        this.f81636ojitshcjhn = null;
        this.f81638rgvfuqvkyq = null;
        dsvhmnatus(0);
        wypolnanlu(4);
        cllcsxoeiz();
        this.f81634kcexrzcfyt = false;
        this.f81642zdlpuopuiu = false;
        this.f81641yggfygwlhe = (byte) 0;
        this.f81633jyumaefscl = (byte) 0;
        this.f81632iwizpuwonk = 0;
        this.f81627cqumvgiudr = true;
        this.f81630esjtqupxsv = -9223372036854775807L;
    }

    @Override // r4.eablkybsjg
    protected gtknphoqwx lqeggnwhkg() {
        List list = this.f81636ojitshcjhn;
        this.f81638rgvfuqvkyq = list;
        return new gxszxtbevo((List) y2.iobyxmoadg.eablkybsjg(list));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    @Override // r4.eablkybsjg
    protected void nufgyqmvbu(ojitshcjhn ojitshcjhnVar) {
        boolean z13;
        ByteBuffer byteBuffer = (ByteBuffer) y2.iobyxmoadg.eablkybsjg(ojitshcjhnVar.f10021iwizpuwonk);
        this.f81635nufgyqmvbu.ntlheqmsrt(byteBuffer.array(), byteBuffer.limit());
        boolean z14 = false;
        while (true) {
            int iIobyxmoadg = this.f81635nufgyqmvbu.iobyxmoadg();
            int i13 = this.f81629dxjokdxxww;
            if (iIobyxmoadg < i13) {
                break;
            }
            int iWwaezpbzkn = i13 == 2 ? -4 : this.f81635nufgyqmvbu.wwaezpbzkn();
            int iWwaezpbzkn2 = this.f81635nufgyqmvbu.wwaezpbzkn();
            int iWwaezpbzkn3 = this.f81635nufgyqmvbu.wwaezpbzkn();
            if ((iWwaezpbzkn & 2) == 0 && (iWwaezpbzkn & 1) == this.f81626btonecajqb) {
                byte b13 = (byte) (iWwaezpbzkn2 & 127);
                byte b14 = (byte) (iWwaezpbzkn3 & 127);
                if (b13 != 0 || b14 != 0) {
                    boolean z15 = this.f81634kcexrzcfyt;
                    if ((iWwaezpbzkn & 4) == 4) {
                        boolean[] zArr = f81621lmojexxdyd;
                        if (zArr[iWwaezpbzkn2] && zArr[iWwaezpbzkn3]) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                    } else {
                        z13 = false;
                    }
                    this.f81634kcexrzcfyt = z13;
                    if (!wwaezpbzkn(z13, b13, b14)) {
                        if (this.f81634kcexrzcfyt) {
                            hkdspvbjdz(b13, b14);
                            if (this.f81627cqumvgiudr && kegysxyocb(b13)) {
                                if (!zynmafqrjb(b13)) {
                                    this.f81625agtfadlqog.eablkybsjg(oxmwwwfdhm(b13));
                                    if ((b14 & 224) != 0) {
                                        this.f81625agtfadlqog.eablkybsjg(oxmwwwfdhm(b14));
                                    }
                                } else if (pkzmftpjix(b13, b14)) {
                                    this.f81625agtfadlqog.eablkybsjg(cqumvgiudr(b14));
                                } else if (istkbnxepw(b13, b14)) {
                                    this.f81625agtfadlqog.gxszxtbevo();
                                    this.f81625agtfadlqog.eablkybsjg(iwizpuwonk(b13, b14));
                                } else if (cdpycssgdh(b13, b14)) {
                                    esjtqupxsv(b14);
                                } else if (iozdgvuglv(b13, b14)) {
                                    pmvmpeiblj(b13, b14);
                                } else if (hcddaimhww(b13, b14)) {
                                    this.f81625agtfadlqog.f81644gxszxtbevo = b14 - 32;
                                } else if (yadqdtsiqt(b13, b14)) {
                                    lereixgezr(b14);
                                }
                                z14 = true;
                            }
                        } else if (z15) {
                            cllcsxoeiz();
                            z14 = true;
                        }
                    }
                }
            }
        }
        if (z14) {
            int i14 = this.f81639vdvldrhtss;
            if (i14 == 1 || i14 == 3) {
                this.f81636ojitshcjhn = zdlpuopuiu();
                this.f81630esjtqupxsv = draadjrbmk();
            }
        }
    }

    @Override // r4.eablkybsjg, e3.wkgbmnqykc
    public void release() {
    }

    @Override // r4.eablkybsjg
    protected boolean wflxmlrfwp() {
        return this.f81636ojitshcjhn != this.f81638rgvfuqvkyq;
    }

    @Override // r4.eablkybsjg, q4.draadjrbmk
    public /* bridge */ /* synthetic */ void zoijcleaow(long j13) {
        super.zoijcleaow(j13);
    }
}
