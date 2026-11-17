package r4;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.KotlinVersion;
import q4.gtknphoqwx;
import q4.ojitshcjhn;
import q4.rgvfuqvkyq;
import y2.btonecajqb;
import y2.cdpycssgdh;
import y2.kcexrzcfyt;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
public final class ppxfxbqfkf extends eablkybsjg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private zoijcleaow f81654agtfadlqog;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final int f81656draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final boolean f81658gtknphoqwx;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private List f81660ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private int f81661oxmwwwfdhm;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private List f81662rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private C1822ppxfxbqfkf f81663vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final zoijcleaow[] f81664wflxmlrfwp;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final yadqdtsiqt f81659nufgyqmvbu = new yadqdtsiqt();

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final cdpycssgdh f81657dxjokdxxww = new cdpycssgdh();

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private int f81655btonecajqb = -1;

    /* JADX INFO: Access modifiers changed from: private */
    static final class iobyxmoadg {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private static final Comparator f81665ppxfxbqfkf = new Comparator() { // from class: r4.zoijcleaow
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ppxfxbqfkf.iobyxmoadg.ppxfxbqfkf((ppxfxbqfkf.iobyxmoadg) obj, (ppxfxbqfkf.iobyxmoadg) obj2);
            }
        };

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final x2.iobyxmoadg f81666iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final int f81667zoijcleaow;

        public iobyxmoadg(CharSequence charSequence, Layout.Alignment alignment, float f13, int i13, int i14, float f14, int i15, float f15, boolean z13, int i16, int i17) {
            x2.iobyxmoadg.zoijcleaow zoijcleaowVarAgtfadlqog = new x2.iobyxmoadg.zoijcleaow().ojitshcjhn(charSequence).rgvfuqvkyq(alignment).nufgyqmvbu(f13, i13).dxjokdxxww(i14).gtknphoqwx(f14).draadjrbmk(i15).agtfadlqog(f15);
            if (z13) {
                zoijcleaowVarAgtfadlqog.kcexrzcfyt(i16);
            }
            this.f81666iobyxmoadg = zoijcleaowVarAgtfadlqog.iobyxmoadg();
            this.f81667zoijcleaow = i17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int ppxfxbqfkf(iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2) {
            return Integer.compare(iobyxmoadgVar2.f81667zoijcleaow, iobyxmoadgVar.f81667zoijcleaow);
        }
    }

    /* JADX INFO: renamed from: r4.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    private static final class C1822ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final int f81668iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final byte[] f81669ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        int f81670wkgbmnqykc = 0;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final int f81671zoijcleaow;

        public C1822ppxfxbqfkf(int i13, int i14) {
            this.f81668iobyxmoadg = i13;
            this.f81671zoijcleaow = i14;
            this.f81669ppxfxbqfkf = new byte[(i14 * 2) - 1];
        }
    }

    private static final class zoijcleaow {

        /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
        private static final int[] f81672cdpycssgdh;

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        public static final int f81673cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private static final int[] f81674esjtqupxsv;

        /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
        private static final int[] f81675iozdgvuglv;

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        private static final int[] f81676istkbnxepw;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        public static final int f81677iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        public static final int f81678jyumaefscl = nufgyqmvbu(2, 2, 2, 0);

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        private static final int[] f81679lereixgezr;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        private static final int[] f81680pmvmpeiblj;

        /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
        private static final int[] f81681yadqdtsiqt;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        private static final boolean[] f81682zynmafqrjb;

        /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
        private int f81683agtfadlqog;

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        private int f81684btonecajqb;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        private int f81685draadjrbmk;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private int f81686dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private int f81687eablkybsjg;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        private int f81688gtknphoqwx;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private boolean f81689gxszxtbevo;

        /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
        private int f81691kcexrzcfyt;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private int f81692lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private int f81693nufgyqmvbu;

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        private int f81694ojitshcjhn;

        /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
        private int f81695oxmwwwfdhm;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private boolean f81696ppxfxbqfkf;

        /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
        private int f81697rgvfuqvkyq;

        /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
        private int f81698vdvldrhtss;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        private int f81699wflxmlrfwp;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private boolean f81700wkgbmnqykc;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private int f81701yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private int f81702zdlpuopuiu;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f81690iobyxmoadg = new ArrayList();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final SpannableStringBuilder f81703zoijcleaow = new SpannableStringBuilder();

        static {
            int iNufgyqmvbu = nufgyqmvbu(0, 0, 0, 0);
            f81677iwizpuwonk = iNufgyqmvbu;
            int iNufgyqmvbu2 = nufgyqmvbu(0, 0, 0, 3);
            f81673cqumvgiudr = iNufgyqmvbu2;
            f81674esjtqupxsv = new int[]{0, 0, 0, 0, 0, 2, 0};
            f81679lereixgezr = new int[]{0, 0, 0, 0, 0, 0, 2};
            f81680pmvmpeiblj = new int[]{3, 3, 3, 3, 3, 3, 1};
            f81682zynmafqrjb = new boolean[]{false, false, false, true, true, true, false};
            f81676istkbnxepw = new int[]{iNufgyqmvbu, iNufgyqmvbu2, iNufgyqmvbu, iNufgyqmvbu, iNufgyqmvbu2, iNufgyqmvbu, iNufgyqmvbu};
            f81672cdpycssgdh = new int[]{0, 1, 2, 3, 4, 3, 4};
            f81681yadqdtsiqt = new int[]{0, 0, 0, 0, 0, 3, 3};
            f81675iozdgvuglv = new int[]{iNufgyqmvbu, iNufgyqmvbu, iNufgyqmvbu, iNufgyqmvbu, iNufgyqmvbu, iNufgyqmvbu2, iNufgyqmvbu2};
        }

        public zoijcleaow() {
            draadjrbmk();
        }

        public static int lqeggnwhkg(int i13, int i14, int i15) {
            return nufgyqmvbu(i13, i14, i15, 0);
        }

        /* JADX WARN: Code duplicated, block: B:9:0x001b  */
        public static int nufgyqmvbu(int i13, int i14, int i15, int i16) {
            int i17;
            y2.iobyxmoadg.ppxfxbqfkf(i13, 0, 4);
            y2.iobyxmoadg.ppxfxbqfkf(i14, 0, 4);
            y2.iobyxmoadg.ppxfxbqfkf(i15, 0, 4);
            y2.iobyxmoadg.ppxfxbqfkf(i16, 0, 4);
            if (i16 == 0 || i16 == 1) {
                i17 = 255;
            } else if (i16 == 2) {
                i17 = 127;
            } else if (i16 != 3) {
                i17 = 255;
            } else {
                i17 = 0;
            }
            return Color.argb(i17, i13 > 1 ? 255 : 0, i14 > 1 ? 255 : 0, i15 > 1 ? 255 : 0);
        }

        public void agtfadlqog(int i13, int i14, int i15) {
            if (this.f81698vdvldrhtss != -1 && this.f81695oxmwwwfdhm != i13) {
                this.f81703zoijcleaow.setSpan(new ForegroundColorSpan(this.f81695oxmwwwfdhm), this.f81698vdvldrhtss, this.f81703zoijcleaow.length(), 33);
            }
            if (i13 != f81678jyumaefscl) {
                this.f81698vdvldrhtss = this.f81703zoijcleaow.length();
                this.f81695oxmwwwfdhm = i13;
            }
            if (this.f81691kcexrzcfyt != -1 && this.f81702zdlpuopuiu != i14) {
                this.f81703zoijcleaow.setSpan(new BackgroundColorSpan(this.f81702zdlpuopuiu), this.f81691kcexrzcfyt, this.f81703zoijcleaow.length(), 33);
            }
            if (i14 != f81677iwizpuwonk) {
                this.f81691kcexrzcfyt = this.f81703zoijcleaow.length();
                this.f81702zdlpuopuiu = i14;
            }
        }

        public boolean btonecajqb() {
            return !dxjokdxxww() || (this.f81690iobyxmoadg.isEmpty() && this.f81703zoijcleaow.length() == 0);
        }

        public void draadjrbmk() {
            eablkybsjg();
            this.f81696ppxfxbqfkf = false;
            this.f81700wkgbmnqykc = false;
            this.f81687eablkybsjg = 4;
            this.f81689gxszxtbevo = false;
            this.f81692lqeggnwhkg = 0;
            this.f81693nufgyqmvbu = 0;
            this.f81686dxjokdxxww = 0;
            this.f81684btonecajqb = 15;
            this.f81688gtknphoqwx = 0;
            this.f81685draadjrbmk = 0;
            this.f81699wflxmlrfwp = 0;
            int i13 = f81677iwizpuwonk;
            this.f81683agtfadlqog = i13;
            this.f81695oxmwwwfdhm = f81678jyumaefscl;
            this.f81702zdlpuopuiu = i13;
        }

        public boolean dxjokdxxww() {
            return this.f81696ppxfxbqfkf;
        }

        public void eablkybsjg() {
            this.f81690iobyxmoadg.clear();
            this.f81703zoijcleaow.clear();
            this.f81694ojitshcjhn = -1;
            this.f81697rgvfuqvkyq = -1;
            this.f81698vdvldrhtss = -1;
            this.f81691kcexrzcfyt = -1;
            this.f81701yggfygwlhe = 0;
        }

        public boolean gtknphoqwx() {
            return this.f81700wkgbmnqykc;
        }

        public void gxszxtbevo(boolean z13, int i13, boolean z14, int i14, int i15, int i16, int i17, int i18, int i19) {
            this.f81696ppxfxbqfkf = true;
            this.f81700wkgbmnqykc = z13;
            this.f81687eablkybsjg = i13;
            this.f81689gxszxtbevo = z14;
            this.f81692lqeggnwhkg = i14;
            this.f81693nufgyqmvbu = i15;
            this.f81686dxjokdxxww = i17;
            int i23 = i16 + 1;
            if (this.f81684btonecajqb != i23) {
                this.f81684btonecajqb = i23;
                while (true) {
                    if (this.f81690iobyxmoadg.size() < this.f81684btonecajqb && this.f81690iobyxmoadg.size() < 15) {
                        break;
                    } else {
                        this.f81690iobyxmoadg.remove(0);
                    }
                }
            }
            if (i18 != 0 && this.f81685draadjrbmk != i18) {
                this.f81685draadjrbmk = i18;
                int i24 = i18 - 1;
                vdvldrhtss(f81676istkbnxepw[i24], f81673cqumvgiudr, f81682zynmafqrjb[i24], 0, f81679lereixgezr[i24], f81680pmvmpeiblj[i24], f81674esjtqupxsv[i24]);
            }
            if (i19 == 0 || this.f81699wflxmlrfwp == i19) {
                return;
            }
            this.f81699wflxmlrfwp = i19;
            int i25 = i19 - 1;
            wflxmlrfwp(0, 1, 1, false, false, f81681yadqdtsiqt[i25], f81672cdpycssgdh[i25]);
            agtfadlqog(f81678jyumaefscl, f81675iozdgvuglv[i25], f81677iwizpuwonk);
        }

        public void iobyxmoadg(char c13) {
            if (c13 != '\n') {
                this.f81703zoijcleaow.append(c13);
                return;
            }
            this.f81690iobyxmoadg.add(wkgbmnqykc());
            this.f81703zoijcleaow.clear();
            if (this.f81694ojitshcjhn != -1) {
                this.f81694ojitshcjhn = 0;
            }
            if (this.f81697rgvfuqvkyq != -1) {
                this.f81697rgvfuqvkyq = 0;
            }
            if (this.f81698vdvldrhtss != -1) {
                this.f81698vdvldrhtss = 0;
            }
            if (this.f81691kcexrzcfyt != -1) {
                this.f81691kcexrzcfyt = 0;
            }
            while (true) {
                if (this.f81690iobyxmoadg.size() < this.f81684btonecajqb && this.f81690iobyxmoadg.size() < 15) {
                    this.f81701yggfygwlhe = this.f81690iobyxmoadg.size();
                    return;
                }
                this.f81690iobyxmoadg.remove(0);
            }
        }

        public void ojitshcjhn(int i13, int i14) {
            if (this.f81701yggfygwlhe != i13) {
                iobyxmoadg('\n');
            }
            this.f81701yggfygwlhe = i13;
        }

        public iobyxmoadg ppxfxbqfkf() {
            Layout.Alignment alignment;
            float f13;
            float f14;
            if (btonecajqb()) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i13 = 0; i13 < this.f81690iobyxmoadg.size(); i13++) {
                spannableStringBuilder.append((CharSequence) this.f81690iobyxmoadg.get(i13));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) wkgbmnqykc());
            int i14 = this.f81688gtknphoqwx;
            if (i14 == 0) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i14 == 1) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (i14 != 2) {
                if (i14 != 3) {
                    throw new IllegalArgumentException("Unexpected justification value: " + this.f81688gtknphoqwx);
                }
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            Layout.Alignment alignment2 = alignment;
            if (this.f81689gxszxtbevo) {
                f13 = this.f81693nufgyqmvbu / 99.0f;
                f14 = this.f81692lqeggnwhkg / 99.0f;
            } else {
                f13 = this.f81693nufgyqmvbu / 209.0f;
                f14 = this.f81692lqeggnwhkg / 74.0f;
            }
            float f15 = (f13 * 0.9f) + 0.05f;
            float f16 = (f14 * 0.9f) + 0.05f;
            int i15 = this.f81686dxjokdxxww;
            return new iobyxmoadg(spannableStringBuilder, alignment2, f16, 0, i15 / 3 == 0 ? 0 : i15 / 3 == 1 ? 1 : 2, f15, i15 % 3 == 0 ? 0 : i15 % 3 == 1 ? 1 : 2, -3.4028235E38f, this.f81683agtfadlqog != f81677iwizpuwonk, this.f81683agtfadlqog, this.f81687eablkybsjg);
        }

        public void rgvfuqvkyq(boolean z13) {
            this.f81700wkgbmnqykc = z13;
        }

        public void vdvldrhtss(int i13, int i14, boolean z13, int i15, int i16, int i17, int i18) {
            this.f81683agtfadlqog = i13;
            this.f81688gtknphoqwx = i18;
        }

        public void wflxmlrfwp(int i13, int i14, int i15, boolean z13, boolean z14, int i16, int i17) {
            if (this.f81694ojitshcjhn != -1) {
                if (!z13) {
                    this.f81703zoijcleaow.setSpan(new StyleSpan(2), this.f81694ojitshcjhn, this.f81703zoijcleaow.length(), 33);
                    this.f81694ojitshcjhn = -1;
                }
            } else if (z13) {
                this.f81694ojitshcjhn = this.f81703zoijcleaow.length();
            }
            if (this.f81697rgvfuqvkyq == -1) {
                if (z14) {
                    this.f81697rgvfuqvkyq = this.f81703zoijcleaow.length();
                }
            } else {
                if (z14) {
                    return;
                }
                this.f81703zoijcleaow.setSpan(new UnderlineSpan(), this.f81697rgvfuqvkyq, this.f81703zoijcleaow.length(), 33);
                this.f81697rgvfuqvkyq = -1;
            }
        }

        public SpannableString wkgbmnqykc() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f81703zoijcleaow);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f81694ojitshcjhn != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f81694ojitshcjhn, length, 33);
                }
                if (this.f81697rgvfuqvkyq != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f81697rgvfuqvkyq, length, 33);
                }
                if (this.f81698vdvldrhtss != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f81695oxmwwwfdhm), this.f81698vdvldrhtss, length, 33);
                }
                if (this.f81691kcexrzcfyt != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f81702zdlpuopuiu), this.f81691kcexrzcfyt, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void zoijcleaow() {
            int length = this.f81703zoijcleaow.length();
            if (length > 0) {
                this.f81703zoijcleaow.delete(length - 1, length);
            }
        }
    }

    public ppxfxbqfkf(int i13, List list) {
        this.f81656draadjrbmk = i13 == -1 ? 1 : i13;
        this.f81658gtknphoqwx = list != null && btonecajqb.jyumaefscl(list);
        this.f81664wflxmlrfwp = new zoijcleaow[8];
        for (int i14 = 0; i14 < 8; i14++) {
            this.f81664wflxmlrfwp[i14] = new zoijcleaow();
        }
        this.f81654agtfadlqog = this.f81664wflxmlrfwp[0];
    }

    private void cdpycssgdh() {
        this.f81657dxjokdxxww.oxmwwwfdhm(4);
        int iNufgyqmvbu = this.f81657dxjokdxxww.nufgyqmvbu(4);
        this.f81657dxjokdxxww.oxmwwwfdhm(2);
        this.f81654agtfadlqog.ojitshcjhn(iNufgyqmvbu, this.f81657dxjokdxxww.nufgyqmvbu(6));
    }

    private void cqumvgiudr(int i13) {
        if (i13 == 127) {
            this.f81654agtfadlqog.iobyxmoadg((char) 9835);
        } else {
            this.f81654agtfadlqog.iobyxmoadg((char) (i13 & KotlinVersion.MAX_COMPONENT_VALUE));
        }
    }

    private void esjtqupxsv(int i13) {
        this.f81654agtfadlqog.iobyxmoadg((char) (i13 & KotlinVersion.MAX_COMPONENT_VALUE));
    }

    private void iozdgvuglv() {
        C1822ppxfxbqfkf c1822ppxfxbqfkf = this.f81663vdvldrhtss;
        if (c1822ppxfxbqfkf.f81670wkgbmnqykc != (c1822ppxfxbqfkf.f81671zoijcleaow * 2) - 1) {
            kcexrzcfyt.zoijcleaow("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f81663vdvldrhtss.f81671zoijcleaow * 2) - 1) + ", but current index is " + this.f81663vdvldrhtss.f81670wkgbmnqykc + " (sequence number " + this.f81663vdvldrhtss.f81668iobyxmoadg + ");");
        }
        cdpycssgdh cdpycssgdhVar = this.f81657dxjokdxxww;
        C1822ppxfxbqfkf c1822ppxfxbqfkf2 = this.f81663vdvldrhtss;
        cdpycssgdhVar.ojitshcjhn(c1822ppxfxbqfkf2.f81669ppxfxbqfkf, c1822ppxfxbqfkf2.f81670wkgbmnqykc);
        boolean z13 = false;
        while (this.f81657dxjokdxxww.zoijcleaow() > 0) {
            int iNufgyqmvbu = this.f81657dxjokdxxww.nufgyqmvbu(3);
            int iNufgyqmvbu2 = this.f81657dxjokdxxww.nufgyqmvbu(5);
            if (iNufgyqmvbu == 7) {
                this.f81657dxjokdxxww.oxmwwwfdhm(2);
                iNufgyqmvbu = this.f81657dxjokdxxww.nufgyqmvbu(6);
                if (iNufgyqmvbu < 7) {
                    kcexrzcfyt.nufgyqmvbu("Cea708Decoder", "Invalid extended service number: " + iNufgyqmvbu);
                }
            }
            if (iNufgyqmvbu2 == 0) {
                if (iNufgyqmvbu == 0) {
                    break;
                }
                kcexrzcfyt.nufgyqmvbu("Cea708Decoder", "serviceNumber is non-zero (" + iNufgyqmvbu + ") when blockSize is 0");
                break;
            }
            if (iNufgyqmvbu != this.f81656draadjrbmk) {
                this.f81657dxjokdxxww.kcexrzcfyt(iNufgyqmvbu2);
            } else {
                int iEablkybsjg = this.f81657dxjokdxxww.eablkybsjg() + (iNufgyqmvbu2 * 8);
                while (this.f81657dxjokdxxww.eablkybsjg() < iEablkybsjg) {
                    int iNufgyqmvbu3 = this.f81657dxjokdxxww.nufgyqmvbu(8);
                    if (iNufgyqmvbu3 == 16) {
                        int iNufgyqmvbu4 = this.f81657dxjokdxxww.nufgyqmvbu(8);
                        if (iNufgyqmvbu4 <= 31) {
                            yggfygwlhe(iNufgyqmvbu4);
                        } else {
                            if (iNufgyqmvbu4 <= 127) {
                                lereixgezr(iNufgyqmvbu4);
                            } else if (iNufgyqmvbu4 <= 159) {
                                jyumaefscl(iNufgyqmvbu4);
                            } else if (iNufgyqmvbu4 <= 255) {
                                pmvmpeiblj(iNufgyqmvbu4);
                            } else {
                                kcexrzcfyt.nufgyqmvbu("Cea708Decoder", "Invalid extended command: " + iNufgyqmvbu4);
                            }
                            z13 = true;
                        }
                    } else if (iNufgyqmvbu3 <= 31) {
                        kcexrzcfyt(iNufgyqmvbu3);
                    } else {
                        if (iNufgyqmvbu3 <= 127) {
                            cqumvgiudr(iNufgyqmvbu3);
                        } else if (iNufgyqmvbu3 <= 159) {
                            zdlpuopuiu(iNufgyqmvbu3);
                        } else if (iNufgyqmvbu3 <= 255) {
                            esjtqupxsv(iNufgyqmvbu3);
                        } else {
                            kcexrzcfyt.nufgyqmvbu("Cea708Decoder", "Invalid base command: " + iNufgyqmvbu3);
                        }
                        z13 = true;
                    }
                }
            }
        }
        if (z13) {
            this.f81660ojitshcjhn = oxmwwwfdhm();
        }
    }

    private void istkbnxepw() {
        int iNufgyqmvbu = zoijcleaow.nufgyqmvbu(this.f81657dxjokdxxww.nufgyqmvbu(2), this.f81657dxjokdxxww.nufgyqmvbu(2), this.f81657dxjokdxxww.nufgyqmvbu(2), this.f81657dxjokdxxww.nufgyqmvbu(2));
        int iNufgyqmvbu2 = zoijcleaow.nufgyqmvbu(this.f81657dxjokdxxww.nufgyqmvbu(2), this.f81657dxjokdxxww.nufgyqmvbu(2), this.f81657dxjokdxxww.nufgyqmvbu(2), this.f81657dxjokdxxww.nufgyqmvbu(2));
        this.f81657dxjokdxxww.oxmwwwfdhm(2);
        this.f81654agtfadlqog.agtfadlqog(iNufgyqmvbu, iNufgyqmvbu2, zoijcleaow.lqeggnwhkg(this.f81657dxjokdxxww.nufgyqmvbu(2), this.f81657dxjokdxxww.nufgyqmvbu(2), this.f81657dxjokdxxww.nufgyqmvbu(2)));
    }

    private void iwizpuwonk(int i13) {
        zoijcleaow zoijcleaowVar = this.f81664wflxmlrfwp[i13];
        this.f81657dxjokdxxww.oxmwwwfdhm(2);
        boolean zLqeggnwhkg = this.f81657dxjokdxxww.lqeggnwhkg();
        this.f81657dxjokdxxww.oxmwwwfdhm(2);
        int iNufgyqmvbu = this.f81657dxjokdxxww.nufgyqmvbu(3);
        boolean zLqeggnwhkg2 = this.f81657dxjokdxxww.lqeggnwhkg();
        int iNufgyqmvbu2 = this.f81657dxjokdxxww.nufgyqmvbu(7);
        int iNufgyqmvbu3 = this.f81657dxjokdxxww.nufgyqmvbu(8);
        int iNufgyqmvbu4 = this.f81657dxjokdxxww.nufgyqmvbu(4);
        int iNufgyqmvbu5 = this.f81657dxjokdxxww.nufgyqmvbu(4);
        this.f81657dxjokdxxww.oxmwwwfdhm(2);
        this.f81657dxjokdxxww.oxmwwwfdhm(6);
        this.f81657dxjokdxxww.oxmwwwfdhm(2);
        zoijcleaowVar.gxszxtbevo(zLqeggnwhkg, iNufgyqmvbu, zLqeggnwhkg2, iNufgyqmvbu2, iNufgyqmvbu3, iNufgyqmvbu5, iNufgyqmvbu4, this.f81657dxjokdxxww.nufgyqmvbu(3), this.f81657dxjokdxxww.nufgyqmvbu(3));
    }

    private void jyumaefscl(int i13) {
        if (i13 <= 135) {
            this.f81657dxjokdxxww.oxmwwwfdhm(32);
            return;
        }
        if (i13 <= 143) {
            this.f81657dxjokdxxww.oxmwwwfdhm(40);
        } else if (i13 <= 159) {
            this.f81657dxjokdxxww.oxmwwwfdhm(2);
            this.f81657dxjokdxxww.oxmwwwfdhm(this.f81657dxjokdxxww.nufgyqmvbu(6) * 8);
        }
    }

    private void kcexrzcfyt(int i13) {
        if (i13 != 0) {
            if (i13 == 3) {
                this.f81660ojitshcjhn = oxmwwwfdhm();
            }
            if (i13 == 8) {
                this.f81654agtfadlqog.zoijcleaow();
                return;
            }
            switch (i13) {
                case 12:
                    lmojexxdyd();
                    break;
                case 13:
                    this.f81654agtfadlqog.iobyxmoadg('\n');
                    break;
                case 14:
                    break;
                default:
                    if (i13 >= 17 && i13 <= 23) {
                        kcexrzcfyt.nufgyqmvbu("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i13);
                        this.f81657dxjokdxxww.oxmwwwfdhm(8);
                    } else if (i13 >= 24 && i13 <= 31) {
                        kcexrzcfyt.nufgyqmvbu("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i13);
                        this.f81657dxjokdxxww.oxmwwwfdhm(16);
                    } else {
                        kcexrzcfyt.nufgyqmvbu("Cea708Decoder", "Invalid C0 command: " + i13);
                    }
                    break;
            }
        }
    }

    private void lereixgezr(int i13) {
        if (i13 == 32) {
            this.f81654agtfadlqog.iobyxmoadg(' ');
        }
        if (i13 == 33) {
            this.f81654agtfadlqog.iobyxmoadg((char) 160);
            return;
        }
        if (i13 == 37) {
            this.f81654agtfadlqog.iobyxmoadg((char) 8230);
            return;
        }
        if (i13 == 42) {
            this.f81654agtfadlqog.iobyxmoadg((char) 352);
            return;
        }
        if (i13 == 44) {
            this.f81654agtfadlqog.iobyxmoadg((char) 338);
            return;
        }
        if (i13 == 63) {
            this.f81654agtfadlqog.iobyxmoadg((char) 376);
            return;
        }
        if (i13 == 57) {
            this.f81654agtfadlqog.iobyxmoadg((char) 8482);
            return;
        }
        if (i13 == 58) {
            this.f81654agtfadlqog.iobyxmoadg((char) 353);
            return;
        }
        if (i13 == 60) {
            this.f81654agtfadlqog.iobyxmoadg((char) 339);
            return;
        }
        if (i13 == 61) {
            this.f81654agtfadlqog.iobyxmoadg((char) 8480);
            return;
        }
        switch (i13) {
            case 48:
                this.f81654agtfadlqog.iobyxmoadg((char) 9608);
                break;
            case 49:
                this.f81654agtfadlqog.iobyxmoadg((char) 8216);
                break;
            case 50:
                this.f81654agtfadlqog.iobyxmoadg((char) 8217);
                break;
            case 51:
                this.f81654agtfadlqog.iobyxmoadg((char) 8220);
                break;
            case 52:
                this.f81654agtfadlqog.iobyxmoadg((char) 8221);
                break;
            case 53:
                this.f81654agtfadlqog.iobyxmoadg((char) 8226);
                break;
            default:
                switch (i13) {
                    case 118:
                        this.f81654agtfadlqog.iobyxmoadg((char) 8539);
                        break;
                    case 119:
                        this.f81654agtfadlqog.iobyxmoadg((char) 8540);
                        break;
                    case 120:
                        this.f81654agtfadlqog.iobyxmoadg((char) 8541);
                        break;
                    case 121:
                        this.f81654agtfadlqog.iobyxmoadg((char) 8542);
                        break;
                    case 122:
                        this.f81654agtfadlqog.iobyxmoadg((char) 9474);
                        break;
                    case 123:
                        this.f81654agtfadlqog.iobyxmoadg((char) 9488);
                        break;
                    case 124:
                        this.f81654agtfadlqog.iobyxmoadg((char) 9492);
                        break;
                    case 125:
                        this.f81654agtfadlqog.iobyxmoadg((char) 9472);
                        break;
                    case 126:
                        this.f81654agtfadlqog.iobyxmoadg((char) 9496);
                        break;
                    case 127:
                        this.f81654agtfadlqog.iobyxmoadg((char) 9484);
                        break;
                    default:
                        kcexrzcfyt.nufgyqmvbu("Cea708Decoder", "Invalid G2 character: " + i13);
                        break;
                }
                break;
        }
    }

    private void lmojexxdyd() {
        for (int i13 = 0; i13 < 8; i13++) {
            this.f81664wflxmlrfwp[i13].draadjrbmk();
        }
    }

    private List oxmwwwfdhm() {
        iobyxmoadg iobyxmoadgVarPpxfxbqfkf;
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < 8; i13++) {
            if (!this.f81664wflxmlrfwp[i13].btonecajqb() && this.f81664wflxmlrfwp[i13].gtknphoqwx() && (iobyxmoadgVarPpxfxbqfkf = this.f81664wflxmlrfwp[i13].ppxfxbqfkf()) != null) {
                arrayList.add(iobyxmoadgVarPpxfxbqfkf);
            }
        }
        Collections.sort(arrayList, iobyxmoadg.f81665ppxfxbqfkf);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            arrayList2.add(((iobyxmoadg) arrayList.get(i14)).f81666iobyxmoadg);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    private void pmvmpeiblj(int i13) {
        if (i13 == 160) {
            this.f81654agtfadlqog.iobyxmoadg((char) 13252);
            return;
        }
        kcexrzcfyt.nufgyqmvbu("Cea708Decoder", "Invalid G3 character: " + i13);
        this.f81654agtfadlqog.iobyxmoadg('_');
    }

    private void vdvldrhtss() {
        if (this.f81663vdvldrhtss == null) {
            return;
        }
        iozdgvuglv();
        this.f81663vdvldrhtss = null;
    }

    private void yadqdtsiqt() {
        int iNufgyqmvbu = zoijcleaow.nufgyqmvbu(this.f81657dxjokdxxww.nufgyqmvbu(2), this.f81657dxjokdxxww.nufgyqmvbu(2), this.f81657dxjokdxxww.nufgyqmvbu(2), this.f81657dxjokdxxww.nufgyqmvbu(2));
        int iNufgyqmvbu2 = this.f81657dxjokdxxww.nufgyqmvbu(2);
        int iLqeggnwhkg = zoijcleaow.lqeggnwhkg(this.f81657dxjokdxxww.nufgyqmvbu(2), this.f81657dxjokdxxww.nufgyqmvbu(2), this.f81657dxjokdxxww.nufgyqmvbu(2));
        if (this.f81657dxjokdxxww.lqeggnwhkg()) {
            iNufgyqmvbu2 |= 4;
        }
        boolean zLqeggnwhkg = this.f81657dxjokdxxww.lqeggnwhkg();
        int iNufgyqmvbu3 = this.f81657dxjokdxxww.nufgyqmvbu(2);
        int iNufgyqmvbu4 = this.f81657dxjokdxxww.nufgyqmvbu(2);
        int iNufgyqmvbu5 = this.f81657dxjokdxxww.nufgyqmvbu(2);
        this.f81657dxjokdxxww.oxmwwwfdhm(8);
        this.f81654agtfadlqog.vdvldrhtss(iNufgyqmvbu, iLqeggnwhkg, zLqeggnwhkg, iNufgyqmvbu2, iNufgyqmvbu3, iNufgyqmvbu4, iNufgyqmvbu5);
    }

    private void yggfygwlhe(int i13) {
        if (i13 <= 7) {
            return;
        }
        if (i13 <= 15) {
            this.f81657dxjokdxxww.oxmwwwfdhm(8);
        } else if (i13 <= 23) {
            this.f81657dxjokdxxww.oxmwwwfdhm(16);
        } else if (i13 <= 31) {
            this.f81657dxjokdxxww.oxmwwwfdhm(24);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void zdlpuopuiu(int i13) {
        int i14 = 1;
        switch (i13) {
            case UserVerificationMethods.USER_VERIFY_PATTERN /* 128 */:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i15 = i13 - 128;
                if (this.f81661oxmwwwfdhm != i15) {
                    this.f81661oxmwwwfdhm = i15;
                    this.f81654agtfadlqog = this.f81664wflxmlrfwp[i15];
                }
                break;
            case 136:
                while (i14 <= 8) {
                    if (this.f81657dxjokdxxww.lqeggnwhkg()) {
                        this.f81664wflxmlrfwp[8 - i14].eablkybsjg();
                    }
                    i14++;
                }
                break;
            case 137:
                for (int i16 = 1; i16 <= 8; i16++) {
                    if (this.f81657dxjokdxxww.lqeggnwhkg()) {
                        this.f81664wflxmlrfwp[8 - i16].rgvfuqvkyq(true);
                    }
                }
                break;
            case 138:
                while (i14 <= 8) {
                    if (this.f81657dxjokdxxww.lqeggnwhkg()) {
                        this.f81664wflxmlrfwp[8 - i14].rgvfuqvkyq(false);
                    }
                    i14++;
                }
                break;
            case 139:
                for (int i17 = 1; i17 <= 8; i17++) {
                    if (this.f81657dxjokdxxww.lqeggnwhkg()) {
                        zoijcleaow zoijcleaowVar = this.f81664wflxmlrfwp[8 - i17];
                        zoijcleaowVar.rgvfuqvkyq(!zoijcleaowVar.gtknphoqwx());
                    }
                }
                break;
            case 140:
                while (i14 <= 8) {
                    if (this.f81657dxjokdxxww.lqeggnwhkg()) {
                        this.f81664wflxmlrfwp[8 - i14].draadjrbmk();
                    }
                    i14++;
                }
                break;
            case 141:
                this.f81657dxjokdxxww.oxmwwwfdhm(8);
                break;
            case 142:
                break;
            case 143:
                lmojexxdyd();
                break;
            case 144:
                if (this.f81654agtfadlqog.dxjokdxxww()) {
                    zynmafqrjb();
                } else {
                    this.f81657dxjokdxxww.oxmwwwfdhm(16);
                }
                break;
            case 145:
                if (this.f81654agtfadlqog.dxjokdxxww()) {
                    istkbnxepw();
                } else {
                    this.f81657dxjokdxxww.oxmwwwfdhm(24);
                }
                break;
            case 146:
                if (this.f81654agtfadlqog.dxjokdxxww()) {
                    cdpycssgdh();
                } else {
                    this.f81657dxjokdxxww.oxmwwwfdhm(16);
                }
                break;
            case 147:
            case 148:
            case 149:
            case 150:
            default:
                kcexrzcfyt.nufgyqmvbu("Cea708Decoder", "Invalid C1 command: " + i13);
                break;
            case 151:
                if (this.f81654agtfadlqog.dxjokdxxww()) {
                    yadqdtsiqt();
                } else {
                    this.f81657dxjokdxxww.oxmwwwfdhm(32);
                }
                break;
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
                int i18 = i13 - 152;
                iwizpuwonk(i18);
                if (this.f81661oxmwwwfdhm != i18) {
                    this.f81661oxmwwwfdhm = i18;
                    this.f81654agtfadlqog = this.f81664wflxmlrfwp[i18];
                }
                break;
        }
    }

    private void zynmafqrjb() {
        this.f81654agtfadlqog.wflxmlrfwp(this.f81657dxjokdxxww.nufgyqmvbu(4), this.f81657dxjokdxxww.nufgyqmvbu(2), this.f81657dxjokdxxww.nufgyqmvbu(2), this.f81657dxjokdxxww.lqeggnwhkg(), this.f81657dxjokdxxww.lqeggnwhkg(), this.f81657dxjokdxxww.nufgyqmvbu(3), this.f81657dxjokdxxww.nufgyqmvbu(3));
    }

    @Override // r4.eablkybsjg
    /* JADX INFO: renamed from: agtfadlqog */
    public /* bridge */ /* synthetic */ void ppxfxbqfkf(ojitshcjhn ojitshcjhnVar) {
        super.ppxfxbqfkf(ojitshcjhnVar);
    }

    @Override // r4.eablkybsjg
    /* JADX INFO: renamed from: btonecajqb */
    public /* bridge */ /* synthetic */ rgvfuqvkyq iobyxmoadg() {
        return super.iobyxmoadg();
    }

    @Override // r4.eablkybsjg
    /* JADX INFO: renamed from: dxjokdxxww */
    public /* bridge */ /* synthetic */ ojitshcjhn eablkybsjg() {
        return super.eablkybsjg();
    }

    @Override // r4.eablkybsjg, e3.wkgbmnqykc
    public void flush() {
        super.flush();
        this.f81660ojitshcjhn = null;
        this.f81662rgvfuqvkyq = null;
        this.f81661oxmwwwfdhm = 0;
        this.f81654agtfadlqog = this.f81664wflxmlrfwp[0];
        lmojexxdyd();
        this.f81663vdvldrhtss = null;
    }

    @Override // r4.eablkybsjg
    protected gtknphoqwx lqeggnwhkg() {
        List list = this.f81660ojitshcjhn;
        this.f81662rgvfuqvkyq = list;
        return new gxszxtbevo((List) y2.iobyxmoadg.eablkybsjg(list));
    }

    @Override // r4.eablkybsjg
    protected void nufgyqmvbu(ojitshcjhn ojitshcjhnVar) {
        ByteBuffer byteBuffer = (ByteBuffer) y2.iobyxmoadg.eablkybsjg(ojitshcjhnVar.f10021iwizpuwonk);
        this.f81659nufgyqmvbu.ntlheqmsrt(byteBuffer.array(), byteBuffer.limit());
        while (this.f81659nufgyqmvbu.iobyxmoadg() >= 3) {
            int iWwaezpbzkn = this.f81659nufgyqmvbu.wwaezpbzkn();
            int i13 = iWwaezpbzkn & 3;
            boolean z13 = (iWwaezpbzkn & 4) == 4;
            byte bWwaezpbzkn = (byte) this.f81659nufgyqmvbu.wwaezpbzkn();
            byte bWwaezpbzkn2 = (byte) this.f81659nufgyqmvbu.wwaezpbzkn();
            if (i13 == 2 || i13 == 3) {
                if (z13) {
                    if (i13 == 3) {
                        vdvldrhtss();
                        int i14 = (bWwaezpbzkn & 192) >> 6;
                        int i15 = this.f81655btonecajqb;
                        if (i15 != -1 && i14 != (i15 + 1) % 4) {
                            lmojexxdyd();
                            kcexrzcfyt.nufgyqmvbu("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f81655btonecajqb + " current=" + i14);
                        }
                        this.f81655btonecajqb = i14;
                        int i16 = bWwaezpbzkn & 63;
                        if (i16 == 0) {
                            i16 = 64;
                        }
                        C1822ppxfxbqfkf c1822ppxfxbqfkf = new C1822ppxfxbqfkf(i14, i16);
                        this.f81663vdvldrhtss = c1822ppxfxbqfkf;
                        byte[] bArr = c1822ppxfxbqfkf.f81669ppxfxbqfkf;
                        int i17 = c1822ppxfxbqfkf.f81670wkgbmnqykc;
                        c1822ppxfxbqfkf.f81670wkgbmnqykc = i17 + 1;
                        bArr[i17] = bWwaezpbzkn2;
                    } else {
                        y2.iobyxmoadg.iobyxmoadg(i13 == 2);
                        C1822ppxfxbqfkf c1822ppxfxbqfkf2 = this.f81663vdvldrhtss;
                        if (c1822ppxfxbqfkf2 == null) {
                            kcexrzcfyt.ppxfxbqfkf("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = c1822ppxfxbqfkf2.f81669ppxfxbqfkf;
                            int i18 = c1822ppxfxbqfkf2.f81670wkgbmnqykc;
                            int i19 = i18 + 1;
                            c1822ppxfxbqfkf2.f81670wkgbmnqykc = i19;
                            bArr2[i18] = bWwaezpbzkn;
                            c1822ppxfxbqfkf2.f81670wkgbmnqykc = i18 + 2;
                            bArr2[i19] = bWwaezpbzkn2;
                        }
                    }
                    C1822ppxfxbqfkf c1822ppxfxbqfkf3 = this.f81663vdvldrhtss;
                    if (c1822ppxfxbqfkf3.f81670wkgbmnqykc == (c1822ppxfxbqfkf3.f81671zoijcleaow * 2) - 1) {
                        vdvldrhtss();
                    }
                }
            }
        }
    }

    @Override // r4.eablkybsjg, e3.wkgbmnqykc
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    @Override // r4.eablkybsjg
    protected boolean wflxmlrfwp() {
        return this.f81660ojitshcjhn != this.f81662rgvfuqvkyq;
    }

    @Override // r4.eablkybsjg, q4.draadjrbmk
    public /* bridge */ /* synthetic */ void zoijcleaow(long j13) {
        super.zoijcleaow(j13);
    }
}
