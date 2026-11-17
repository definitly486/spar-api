package com.caverock.androidsvg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import modern.payments.ecomAndroid.util.networkErrorHandler.impl.OkHttpErrorHandlerImpl;

/* JADX INFO: loaded from: classes2.dex */
public class lqeggnwhkg {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static boolean f21392lqeggnwhkg = true;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private iozdgvuglv f21395iobyxmoadg = null;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private String f21398zoijcleaow = "";

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private String f21396ppxfxbqfkf = "";

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private float f21397wkgbmnqykc = 96.0f;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private com.caverock.androidsvg.zoijcleaow.oxmwwwfdhm f21393eablkybsjg = new com.caverock.androidsvg.zoijcleaow.oxmwwwfdhm();

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private Map f21394gxszxtbevo = new HashMap();

    interface agtfadlqog {
        void gtknphoqwx(Matrix matrix);
    }

    static abstract class btonecajqb extends jpowsppfya implements pkzmftpjix {

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        Matrix f21399btonecajqb;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        String f21400draadjrbmk;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        Boolean f21401dxjokdxxww;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        gtknphoqwx f21402gtknphoqwx;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        List f21403nufgyqmvbu = new ArrayList();

        btonecajqb() {
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.pkzmftpjix
        public List iobyxmoadg() {
            return this.f21403nufgyqmvbu;
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.pkzmftpjix
        public void nufgyqmvbu(cllcsxoeiz cllcsxoeizVar) throws SVGParseException {
            if (cllcsxoeizVar instanceof cdpycssgdh) {
                this.f21403nufgyqmvbu.add(cllcsxoeizVar);
                return;
            }
            throw new SVGParseException("Gradient elements cannot contain " + cllcsxoeizVar + " elements.");
        }
    }

    static class cdpycssgdh extends jpowsppfya implements pkzmftpjix {

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        Float f21404nufgyqmvbu;

        cdpycssgdh() {
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz
        String agtfadlqog() {
            return "stop";
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.pkzmftpjix
        public List iobyxmoadg() {
            return Collections.emptyList();
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.pkzmftpjix
        public void nufgyqmvbu(cllcsxoeiz cllcsxoeizVar) {
        }
    }

    static class cllcsxoeiz {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        lqeggnwhkg f21405iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        pkzmftpjix f21406zoijcleaow;

        cllcsxoeiz() {
        }

        abstract String agtfadlqog();
    }

    interface cqumvgiudr {
        void close();

        void eablkybsjg(float f13, float f14, float f15, float f16);

        void gxszxtbevo(float f13, float f14, float f15, boolean z13, boolean z14, float f16, float f17);

        void iobyxmoadg(float f13, float f14);

        void ppxfxbqfkf(float f13, float f14, float f15, float f16, float f17, float f18);

        void wkgbmnqykc(float f13, float f14);
    }

    interface crxdokpmqz {
        jhduphickx eablkybsjg();
    }

    static abstract class draadjrbmk extends ylkuphrtab implements agtfadlqog {

        /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
        Matrix f21407agtfadlqog;

        draadjrbmk() {
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.agtfadlqog
        public void gtknphoqwx(Matrix matrix) {
            this.f21407agtfadlqog = matrix;
        }
    }

    static abstract class dsvhmnatus implements Cloneable {
        dsvhmnatus() {
        }
    }

    static class dxjokdxxww extends draadjrbmk {

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        rgvfuqvkyq f21408ojitshcjhn;

        /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
        rgvfuqvkyq f21409oxmwwwfdhm;

        /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
        rgvfuqvkyq f21410rgvfuqvkyq;

        /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
        rgvfuqvkyq f21411vdvldrhtss;

        dxjokdxxww() {
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz
        String agtfadlqog() {
            return "ellipse";
        }
    }

    static class eablkybsjg extends wflxmlrfwp implements zdlpuopuiu {

        /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
        Boolean f21412rgvfuqvkyq;

        eablkybsjg() {
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.wflxmlrfwp, com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz
        String agtfadlqog() {
            return "clipPath";
        }
    }

    static class esjtqupxsv extends kegysxyocb implements zdlpuopuiu {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        String f21413cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        rgvfuqvkyq f21414iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        rgvfuqvkyq f21415jyumaefscl;

        /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
        Matrix f21416kcexrzcfyt;

        /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
        Boolean f21417oxmwwwfdhm;

        /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
        Boolean f21418vdvldrhtss;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        rgvfuqvkyq f21419yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        rgvfuqvkyq f21420zdlpuopuiu;

        esjtqupxsv() {
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz
        String agtfadlqog() {
            return "pattern";
        }
    }

    enum gtknphoqwx {
        pad,
        reflect,
        repeat
    }

    static class gxszxtbevo extends dsvhmnatus {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f21427zdlpuopuiu;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        static final gxszxtbevo f21426yggfygwlhe = new gxszxtbevo(-16777216);

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        static final gxszxtbevo f21425jyumaefscl = new gxszxtbevo(0);

        gxszxtbevo(int i13) {
            this.f21427zdlpuopuiu = i13;
        }

        public String toString() {
            return String.format("#%08x", Integer.valueOf(this.f21427zdlpuopuiu));
        }
    }

    static abstract class hcddaimhww extends jpowsppfya {

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        zoijcleaow f21428nufgyqmvbu = null;

        hcddaimhww() {
        }
    }

    static class hkdspvbjdz extends btonecajqb {

        /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
        rgvfuqvkyq f21429agtfadlqog;

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        rgvfuqvkyq f21430ojitshcjhn;

        /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
        rgvfuqvkyq f21431rgvfuqvkyq;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        rgvfuqvkyq f21432wflxmlrfwp;

        hkdspvbjdz() {
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz
        String agtfadlqog() {
            return "linearGradient";
        }
    }

    static class ikoacuggdj extends cllcsxoeiz implements crxdokpmqz {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        String f21433ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private jhduphickx f21434wkgbmnqykc;

        ikoacuggdj(String str) {
            this.f21433ppxfxbqfkf = str;
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.crxdokpmqz
        public jhduphickx eablkybsjg() {
            return this.f21434wkgbmnqykc;
        }

        public String toString() {
            return "TextChild: '" + this.f21433ppxfxbqfkf + "'";
        }
    }

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f21435iobyxmoadg;

        static {
            int[] iArr = new int[okpsazkaxt.values().length];
            f21435iobyxmoadg = iArr;
            try {
                iArr[okpsazkaxt.px.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21435iobyxmoadg[okpsazkaxt.em.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21435iobyxmoadg[okpsazkaxt.ex.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21435iobyxmoadg[okpsazkaxt.in.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21435iobyxmoadg[okpsazkaxt.cm.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21435iobyxmoadg[okpsazkaxt.mm.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21435iobyxmoadg[okpsazkaxt.pt.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21435iobyxmoadg[okpsazkaxt.pc.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21435iobyxmoadg[okpsazkaxt.percent.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static class iozdgvuglv extends kegysxyocb {

        /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
        rgvfuqvkyq f21436kcexrzcfyt;

        /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
        rgvfuqvkyq f21437oxmwwwfdhm;

        /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
        rgvfuqvkyq f21438vdvldrhtss;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        public String f21439yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        rgvfuqvkyq f21440zdlpuopuiu;

        iozdgvuglv() {
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz
        String agtfadlqog() {
            return "svg";
        }
    }

    static class istkbnxepw extends jpowsppfya implements pkzmftpjix {
        istkbnxepw() {
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz
        String agtfadlqog() {
            return "solidColor";
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.pkzmftpjix
        public List iobyxmoadg() {
            return Collections.emptyList();
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.pkzmftpjix
        public void nufgyqmvbu(cllcsxoeiz cllcsxoeizVar) {
        }
    }

    static class iwizpuwonk implements cqumvgiudr {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private int f21444zoijcleaow = 0;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private int f21443wkgbmnqykc = 0;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private byte[] f21441iobyxmoadg = new byte[8];

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private float[] f21442ppxfxbqfkf = new float[16];

        iwizpuwonk() {
        }

        private void lqeggnwhkg(int i13) {
            float[] fArr = this.f21442ppxfxbqfkf;
            if (fArr.length < this.f21443wkgbmnqykc + i13) {
                float[] fArr2 = new float[fArr.length * 2];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.f21442ppxfxbqfkf = fArr2;
            }
        }

        private void zoijcleaow(byte b13) {
            int i13 = this.f21444zoijcleaow;
            byte[] bArr = this.f21441iobyxmoadg;
            if (i13 == bArr.length) {
                byte[] bArr2 = new byte[bArr.length * 2];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.f21441iobyxmoadg = bArr2;
            }
            byte[] bArr3 = this.f21441iobyxmoadg;
            int i14 = this.f21444zoijcleaow;
            this.f21444zoijcleaow = i14 + 1;
            bArr3[i14] = b13;
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.cqumvgiudr
        public void close() {
            zoijcleaow((byte) 8);
        }

        boolean dxjokdxxww() {
            return this.f21444zoijcleaow == 0;
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.cqumvgiudr
        public void eablkybsjg(float f13, float f14, float f15, float f16) {
            zoijcleaow((byte) 3);
            lqeggnwhkg(4);
            float[] fArr = this.f21442ppxfxbqfkf;
            int i13 = this.f21443wkgbmnqykc;
            int i14 = i13 + 1;
            this.f21443wkgbmnqykc = i14;
            fArr[i13] = f13;
            int i15 = i13 + 2;
            this.f21443wkgbmnqykc = i15;
            fArr[i14] = f14;
            int i16 = i13 + 3;
            this.f21443wkgbmnqykc = i16;
            fArr[i15] = f15;
            this.f21443wkgbmnqykc = i13 + 4;
            fArr[i16] = f16;
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.cqumvgiudr
        public void gxszxtbevo(float f13, float f14, float f15, boolean z13, boolean z14, float f16, float f17) {
            zoijcleaow((byte) ((z13 ? 2 : 0) | 4 | (z14 ? 1 : 0)));
            lqeggnwhkg(5);
            float[] fArr = this.f21442ppxfxbqfkf;
            int i13 = this.f21443wkgbmnqykc;
            int i14 = i13 + 1;
            this.f21443wkgbmnqykc = i14;
            fArr[i13] = f13;
            int i15 = i13 + 2;
            this.f21443wkgbmnqykc = i15;
            fArr[i14] = f14;
            int i16 = i13 + 3;
            this.f21443wkgbmnqykc = i16;
            fArr[i15] = f15;
            int i17 = i13 + 4;
            this.f21443wkgbmnqykc = i17;
            fArr[i16] = f16;
            this.f21443wkgbmnqykc = i13 + 5;
            fArr[i17] = f17;
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.cqumvgiudr
        public void iobyxmoadg(float f13, float f14) {
            zoijcleaow((byte) 0);
            lqeggnwhkg(2);
            float[] fArr = this.f21442ppxfxbqfkf;
            int i13 = this.f21443wkgbmnqykc;
            int i14 = i13 + 1;
            this.f21443wkgbmnqykc = i14;
            fArr[i13] = f13;
            this.f21443wkgbmnqykc = i13 + 2;
            fArr[i14] = f14;
        }

        void nufgyqmvbu(cqumvgiudr cqumvgiudrVar) {
            int i13 = 0;
            for (int i14 = 0; i14 < this.f21444zoijcleaow; i14++) {
                byte b13 = this.f21441iobyxmoadg[i14];
                if (b13 == 0) {
                    float[] fArr = this.f21442ppxfxbqfkf;
                    int i15 = i13 + 1;
                    float f13 = fArr[i13];
                    i13 += 2;
                    cqumvgiudrVar.iobyxmoadg(f13, fArr[i15]);
                } else if (b13 == 1) {
                    float[] fArr2 = this.f21442ppxfxbqfkf;
                    int i16 = i13 + 1;
                    float f14 = fArr2[i13];
                    i13 += 2;
                    cqumvgiudrVar.wkgbmnqykc(f14, fArr2[i16]);
                } else if (b13 == 2) {
                    float[] fArr3 = this.f21442ppxfxbqfkf;
                    float f15 = fArr3[i13];
                    float f16 = fArr3[i13 + 1];
                    float f17 = fArr3[i13 + 2];
                    float f18 = fArr3[i13 + 3];
                    int i17 = i13 + 5;
                    float f19 = fArr3[i13 + 4];
                    i13 += 6;
                    cqumvgiudrVar.ppxfxbqfkf(f15, f16, f17, f18, f19, fArr3[i17]);
                } else if (b13 == 3) {
                    float[] fArr4 = this.f21442ppxfxbqfkf;
                    float f23 = fArr4[i13];
                    float f24 = fArr4[i13 + 1];
                    int i18 = i13 + 3;
                    float f25 = fArr4[i13 + 2];
                    i13 += 4;
                    cqumvgiudrVar.eablkybsjg(f23, f24, f25, fArr4[i18]);
                } else if (b13 != 8) {
                    boolean z13 = (b13 & 2) != 0;
                    boolean z14 = (b13 & 1) != 0;
                    float[] fArr5 = this.f21442ppxfxbqfkf;
                    float f26 = fArr5[i13];
                    float f27 = fArr5[i13 + 1];
                    float f28 = fArr5[i13 + 2];
                    int i19 = i13 + 4;
                    float f29 = fArr5[i13 + 3];
                    i13 += 5;
                    cqumvgiudrVar.gxszxtbevo(f26, f27, f28, z13, z14, f29, fArr5[i19]);
                } else {
                    cqumvgiudrVar.close();
                }
            }
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.cqumvgiudr
        public void ppxfxbqfkf(float f13, float f14, float f15, float f16, float f17, float f18) {
            zoijcleaow((byte) 2);
            lqeggnwhkg(6);
            float[] fArr = this.f21442ppxfxbqfkf;
            int i13 = this.f21443wkgbmnqykc;
            int i14 = i13 + 1;
            this.f21443wkgbmnqykc = i14;
            fArr[i13] = f13;
            int i15 = i13 + 2;
            this.f21443wkgbmnqykc = i15;
            fArr[i14] = f14;
            int i16 = i13 + 3;
            this.f21443wkgbmnqykc = i16;
            fArr[i15] = f15;
            int i17 = i13 + 4;
            this.f21443wkgbmnqykc = i17;
            fArr[i16] = f16;
            int i18 = i13 + 5;
            this.f21443wkgbmnqykc = i18;
            fArr[i17] = f17;
            this.f21443wkgbmnqykc = i13 + 6;
            fArr[i18] = f18;
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.cqumvgiudr
        public void wkgbmnqykc(float f13, float f14) {
            zoijcleaow((byte) 1);
            lqeggnwhkg(2);
            float[] fArr = this.f21442ppxfxbqfkf;
            int i13 = this.f21443wkgbmnqykc;
            int i14 = i13 + 1;
            this.f21443wkgbmnqykc = i14;
            fArr[i13] = f13;
            this.f21443wkgbmnqykc = i13 + 2;
            fArr[i14] = f14;
        }
    }

    interface jhduphickx {
    }

    static abstract class jlmebxxoox extends wwaezpbzkn {
        jlmebxxoox() {
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.wwaezpbzkn, com.caverock.androidsvg.lqeggnwhkg.pkzmftpjix
        public void nufgyqmvbu(cllcsxoeiz cllcsxoeizVar) throws SVGParseException {
            if (cllcsxoeizVar instanceof crxdokpmqz) {
                this.f21521dxjokdxxww.add(cllcsxoeizVar);
                return;
            }
            throw new SVGParseException("Text content elements cannot contain " + cllcsxoeizVar + " elements.");
        }
    }

    static abstract class jpowsppfya extends cllcsxoeiz {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        String f21448ppxfxbqfkf = null;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        Boolean f21449wkgbmnqykc = null;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        yadqdtsiqt f21445eablkybsjg = null;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        yadqdtsiqt f21446gxszxtbevo = null;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        List f21447lqeggnwhkg = null;

        jpowsppfya() {
        }

        public String toString() {
            return agtfadlqog();
        }
    }

    static class jyumaefscl extends draadjrbmk {

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        iwizpuwonk f21450ojitshcjhn;

        /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
        Float f21451rgvfuqvkyq;

        jyumaefscl() {
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz
        String agtfadlqog() {
            return "path";
        }
    }

    static class jztzpxfvev extends wflxmlrfwp {

        /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
        rgvfuqvkyq f21452kcexrzcfyt;

        /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
        rgvfuqvkyq f21453oxmwwwfdhm;

        /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
        String f21454rgvfuqvkyq;

        /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
        rgvfuqvkyq f21455vdvldrhtss;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        rgvfuqvkyq f21456zdlpuopuiu;

        jztzpxfvev() {
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.wflxmlrfwp, com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz
        String agtfadlqog() {
            return "use";
        }
    }

    static class kcexrzcfyt extends wwaezpbzkn implements zdlpuopuiu {

        /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
        rgvfuqvkyq f21457kcexrzcfyt;

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        Boolean f21458ojitshcjhn;

        /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
        rgvfuqvkyq f21459oxmwwwfdhm;

        /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
        Boolean f21460rgvfuqvkyq;

        /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
        rgvfuqvkyq f21461vdvldrhtss;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        rgvfuqvkyq f21462zdlpuopuiu;

        kcexrzcfyt() {
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz
        String agtfadlqog() {
            return "mask";
        }
    }

    static abstract class kegysxyocb extends wypolnanlu {

        /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
        zoijcleaow f21463rgvfuqvkyq;

        kegysxyocb() {
        }
    }

    static class lereixgezr extends draadjrbmk {

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        float[] f21464ojitshcjhn;

        lereixgezr() {
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz
        String agtfadlqog() {
            return "polyline";
        }
    }

    interface lmojexxdyd {
        void btonecajqb(String str);

        Set draadjrbmk();

        void dxjokdxxww(Set set);

        Set getRequiredFeatures();

        void gxszxtbevo(Set set);

        void lqeggnwhkg(Set set);

        String ppxfxbqfkf();

        Set wflxmlrfwp();

        void wkgbmnqykc(Set set);

        Set zoijcleaow();
    }

    /* JADX INFO: renamed from: com.caverock.androidsvg.lqeggnwhkg$lqeggnwhkg, reason: collision with other inner class name */
    static class C0389lqeggnwhkg extends dsvhmnatus {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private static C0389lqeggnwhkg f21465zdlpuopuiu = new C0389lqeggnwhkg();

        private C0389lqeggnwhkg() {
        }

        static C0389lqeggnwhkg iobyxmoadg() {
            return f21465zdlpuopuiu;
        }
    }

    static class mbcevpiqjq extends kegysxyocb implements zdlpuopuiu {
        mbcevpiqjq() {
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz
        String agtfadlqog() {
            return "symbol";
        }
    }

    static class ntlheqmsrt extends jlmebxxoox implements crxdokpmqz {

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        String f21466ojitshcjhn;

        /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
        private jhduphickx f21467rgvfuqvkyq;

        ntlheqmsrt() {
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz
        String agtfadlqog() {
            return "tref";
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.crxdokpmqz
        public jhduphickx eablkybsjg() {
            return this.f21467rgvfuqvkyq;
        }

        public void ojitshcjhn(jhduphickx jhduphickxVar) {
            this.f21467rgvfuqvkyq = jhduphickxVar;
        }
    }

    static class nufgyqmvbu extends wflxmlrfwp implements zdlpuopuiu {
        nufgyqmvbu() {
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.wflxmlrfwp, com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz
        String agtfadlqog() {
            return "defs";
        }
    }

    static class ojitshcjhn extends wypolnanlu implements agtfadlqog {

        /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
        rgvfuqvkyq f21468kcexrzcfyt;

        /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
        rgvfuqvkyq f21469oxmwwwfdhm;

        /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
        String f21470rgvfuqvkyq;

        /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
        rgvfuqvkyq f21471vdvldrhtss;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Matrix f21472yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        rgvfuqvkyq f21473zdlpuopuiu;

        ojitshcjhn() {
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz
        String agtfadlqog() {
            return "image";
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.agtfadlqog
        public void gtknphoqwx(Matrix matrix) {
            this.f21472yggfygwlhe = matrix;
        }
    }

    enum okpsazkaxt {
        px,
        em,
        ex,
        in,
        cm,
        mm,
        pt,
        pc,
        percent
    }

    static class oxmwwwfdhm extends kegysxyocb implements zdlpuopuiu {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Float f21484jyumaefscl;

        /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
        rgvfuqvkyq f21485kcexrzcfyt;

        /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
        rgvfuqvkyq f21486oxmwwwfdhm;

        /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
        boolean f21487vdvldrhtss;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        rgvfuqvkyq f21488yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        rgvfuqvkyq f21489zdlpuopuiu;

        oxmwwwfdhm() {
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz
        String agtfadlqog() {
            return "marker";
        }
    }

    interface pkzmftpjix {
        List iobyxmoadg();

        void nufgyqmvbu(cllcsxoeiz cllcsxoeizVar);
    }

    static class pmvmpeiblj extends lereixgezr {
        pmvmpeiblj() {
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.lereixgezr, com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz
        String agtfadlqog() {
            return "polygon";
        }
    }

    static class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        rgvfuqvkyq f21490iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        rgvfuqvkyq f21491ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        rgvfuqvkyq f21492wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        rgvfuqvkyq f21493zoijcleaow;

        ppxfxbqfkf(rgvfuqvkyq rgvfuqvkyqVar, rgvfuqvkyq rgvfuqvkyqVar2, rgvfuqvkyq rgvfuqvkyqVar3, rgvfuqvkyq rgvfuqvkyqVar4) {
            this.f21490iobyxmoadg = rgvfuqvkyqVar;
            this.f21493zoijcleaow = rgvfuqvkyqVar2;
            this.f21491ppxfxbqfkf = rgvfuqvkyqVar3;
            this.f21492wkgbmnqykc = rgvfuqvkyqVar4;
        }
    }

    static class ribwqtqdhb extends jlmebxxoox implements crxdokpmqz {

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        String f21496ojitshcjhn;

        /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
        rgvfuqvkyq f21497rgvfuqvkyq;

        /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
        private jhduphickx f21498vdvldrhtss;

        ribwqtqdhb() {
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz
        String agtfadlqog() {
            return "textPath";
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.crxdokpmqz
        public jhduphickx eablkybsjg() {
            return this.f21498vdvldrhtss;
        }

        public void ojitshcjhn(jhduphickx jhduphickxVar) {
            this.f21498vdvldrhtss = jhduphickxVar;
        }
    }

    static class sopmlzcsov extends vipkmwdibw implements jhduphickx, agtfadlqog {

        /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
        Matrix f21499kcexrzcfyt;

        sopmlzcsov() {
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz
        String agtfadlqog() {
            return "text";
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.agtfadlqog
        public void gtknphoqwx(Matrix matrix) {
            this.f21499kcexrzcfyt = matrix;
        }
    }

    static class stevsuqkhv extends btonecajqb {

        /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
        rgvfuqvkyq f21500agtfadlqog;

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        rgvfuqvkyq f21501ojitshcjhn;

        /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
        rgvfuqvkyq f21502rgvfuqvkyq;

        /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
        rgvfuqvkyq f21503vdvldrhtss;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        rgvfuqvkyq f21504wflxmlrfwp;

        stevsuqkhv() {
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz
        String agtfadlqog() {
            return "radialGradient";
        }
    }

    static class tzroggbefp extends wflxmlrfwp {
        tzroggbefp() {
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.wflxmlrfwp, com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz
        String agtfadlqog() {
            return "switch";
        }
    }

    static class ulzqkzuiru extends vipkmwdibw implements crxdokpmqz {

        /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
        private jhduphickx f21505kcexrzcfyt;

        ulzqkzuiru() {
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz
        String agtfadlqog() {
            return "tspan";
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.crxdokpmqz
        public jhduphickx eablkybsjg() {
            return this.f21505kcexrzcfyt;
        }

        public void ojitshcjhn(jhduphickx jhduphickxVar) {
            this.f21505kcexrzcfyt = jhduphickxVar;
        }
    }

    static class vdvldrhtss extends draadjrbmk {

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        rgvfuqvkyq f21506ojitshcjhn;

        /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
        rgvfuqvkyq f21507oxmwwwfdhm;

        /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
        rgvfuqvkyq f21508rgvfuqvkyq;

        /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
        rgvfuqvkyq f21509vdvldrhtss;

        vdvldrhtss() {
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz
        String agtfadlqog() {
            return "line";
        }
    }

    static abstract class vipkmwdibw extends jlmebxxoox {

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        List f21510ojitshcjhn;

        /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
        List f21511oxmwwwfdhm;

        /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
        List f21512rgvfuqvkyq;

        /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
        List f21513vdvldrhtss;

        vipkmwdibw() {
        }
    }

    static class wflxmlrfwp extends wwaezpbzkn implements agtfadlqog {

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        Matrix f21514ojitshcjhn;

        wflxmlrfwp() {
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz
        String agtfadlqog() {
            return "group";
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.agtfadlqog
        public void gtknphoqwx(Matrix matrix) {
            this.f21514ojitshcjhn = matrix;
        }
    }

    static class wkgbmnqykc extends draadjrbmk {

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        rgvfuqvkyq f21515ojitshcjhn;

        /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
        rgvfuqvkyq f21516rgvfuqvkyq;

        /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
        rgvfuqvkyq f21517vdvldrhtss;

        wkgbmnqykc() {
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz
        String agtfadlqog() {
            return "circle";
        }
    }

    static abstract class wwaezpbzkn extends hcddaimhww implements pkzmftpjix, lmojexxdyd {

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        List f21521dxjokdxxww = new ArrayList();

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        Set f21519btonecajqb = null;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        String f21522gtknphoqwx = null;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        Set f21520draadjrbmk = null;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        Set f21523wflxmlrfwp = null;

        /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
        Set f21518agtfadlqog = null;

        wwaezpbzkn() {
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.lmojexxdyd
        public void btonecajqb(String str) {
            this.f21522gtknphoqwx = str;
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.lmojexxdyd
        public Set draadjrbmk() {
            return this.f21523wflxmlrfwp;
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.lmojexxdyd
        public void dxjokdxxww(Set set) {
            this.f21523wflxmlrfwp = set;
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.lmojexxdyd
        public Set getRequiredFeatures() {
            return this.f21519btonecajqb;
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.lmojexxdyd
        public void gxszxtbevo(Set set) {
            this.f21519btonecajqb = set;
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.pkzmftpjix
        public List iobyxmoadg() {
            return this.f21521dxjokdxxww;
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.lmojexxdyd
        public void lqeggnwhkg(Set set) {
            this.f21520draadjrbmk = set;
        }

        public void nufgyqmvbu(cllcsxoeiz cllcsxoeizVar) {
            this.f21521dxjokdxxww.add(cllcsxoeizVar);
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.lmojexxdyd
        public String ppxfxbqfkf() {
            return this.f21522gtknphoqwx;
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.lmojexxdyd
        public Set wflxmlrfwp() {
            return this.f21518agtfadlqog;
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.lmojexxdyd
        public void wkgbmnqykc(Set set) {
            this.f21518agtfadlqog = set;
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.lmojexxdyd
        public Set zoijcleaow() {
            return null;
        }
    }

    static abstract class wypolnanlu extends wwaezpbzkn {

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        com.caverock.androidsvg.eablkybsjg f21524ojitshcjhn = null;

        wypolnanlu() {
        }
    }

    static class xrmfcynszj extends kegysxyocb implements zdlpuopuiu {
        xrmfcynszj() {
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz
        String agtfadlqog() {
            return "view";
        }
    }

    static class yadqdtsiqt implements Cloneable {

        /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
        rgvfuqvkyq[] f21525cdpycssgdh;

        /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
        gxszxtbevo f21526cllcsxoeiz;

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        dsvhmnatus f21527cqumvgiudr;

        /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
        String f21528crxdokpmqz;

        /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
        Boolean f21529dsvhmnatus;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        Float f21530esjtqupxsv;

        /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
        zoijcleaow f21531hcddaimhww;

        /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
        nufgyqmvbu f21532hkdspvbjdz;

        /* JADX INFO: renamed from: ikoacuggdj, reason: collision with root package name */
        dsvhmnatus f21533ikoacuggdj;

        /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
        Float f21534iozdgvuglv;

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        Float f21535istkbnxepw;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        Float f21536iwizpuwonk;

        /* JADX INFO: renamed from: jhduphickx, reason: collision with root package name */
        Float f21537jhduphickx;

        /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name */
        iobyxmoadg f21538jlmebxxoox;

        /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
        EnumC0390lqeggnwhkg f21539jpowsppfya;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        iobyxmoadg f21540jyumaefscl;

        /* JADX INFO: renamed from: jztzpxfvev, reason: collision with root package name */
        dxjokdxxww f21541jztzpxfvev;

        /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
        String f21542kegysxyocb;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        rgvfuqvkyq f21543lereixgezr;

        /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
        gxszxtbevo f21544lmojexxdyd;

        /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
        Boolean f21545mbcevpiqjq;

        /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
        Boolean f21546ntlheqmsrt;

        /* JADX INFO: renamed from: okpsazkaxt, reason: collision with root package name */
        Float f21547okpsazkaxt;

        /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
        Integer f21548pkzmftpjix;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        ppxfxbqfkf f21549pmvmpeiblj;

        /* JADX INFO: renamed from: ribwqtqdhb, reason: collision with root package name */
        String f21550ribwqtqdhb;

        /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
        Float f21551sopmlzcsov;

        /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
        String f21552stevsuqkhv;

        /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
        String f21553tzroggbefp;

        /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
        dsvhmnatus f21554ulzqkzuiru;

        /* JADX INFO: renamed from: vipkmwdibw, reason: collision with root package name */
        dsvhmnatus f21555vipkmwdibw;

        /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
        List f21556wwaezpbzkn;

        /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
        ppxfxbqfkf f21557wypolnanlu;

        /* JADX INFO: renamed from: xrmfcynszj, reason: collision with root package name */
        eablkybsjg f21558xrmfcynszj;

        /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
        rgvfuqvkyq f21559yadqdtsiqt;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        dsvhmnatus f21560yggfygwlhe;

        /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
        rgvfuqvkyq f21561ylkuphrtab;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        long f21562zdlpuopuiu = 0;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        wkgbmnqykc f21563zynmafqrjb;

        public enum dxjokdxxww {
            None,
            NonScalingStroke
        }

        public enum eablkybsjg {
            auto,
            optimizeQuality,
            optimizeSpeed
        }

        public enum gxszxtbevo {
            Start,
            Middle,
            End
        }

        public enum iobyxmoadg {
            NonZero,
            EvenOdd
        }

        /* JADX INFO: renamed from: com.caverock.androidsvg.lqeggnwhkg$yadqdtsiqt$lqeggnwhkg, reason: collision with other inner class name */
        public enum EnumC0390lqeggnwhkg {
            None,
            Underline,
            Overline,
            LineThrough,
            Blink
        }

        public enum nufgyqmvbu {
            LTR,
            RTL
        }

        public enum ppxfxbqfkf {
            Butt,
            Round,
            Square
        }

        public enum wkgbmnqykc {
            Miter,
            Round,
            Bevel
        }

        public enum zoijcleaow {
            Normal,
            Italic,
            Oblique
        }

        yadqdtsiqt() {
        }

        static yadqdtsiqt iobyxmoadg() {
            yadqdtsiqt yadqdtsiqtVar = new yadqdtsiqt();
            yadqdtsiqtVar.f21562zdlpuopuiu = -1L;
            gxszxtbevo gxszxtbevoVar = gxszxtbevo.f21426yggfygwlhe;
            yadqdtsiqtVar.f21560yggfygwlhe = gxszxtbevoVar;
            iobyxmoadg iobyxmoadgVar = iobyxmoadg.NonZero;
            yadqdtsiqtVar.f21540jyumaefscl = iobyxmoadgVar;
            Float fValueOf = Float.valueOf(1.0f);
            yadqdtsiqtVar.f21536iwizpuwonk = fValueOf;
            yadqdtsiqtVar.f21527cqumvgiudr = null;
            yadqdtsiqtVar.f21530esjtqupxsv = fValueOf;
            yadqdtsiqtVar.f21543lereixgezr = new rgvfuqvkyq(1.0f);
            yadqdtsiqtVar.f21549pmvmpeiblj = ppxfxbqfkf.Butt;
            yadqdtsiqtVar.f21563zynmafqrjb = wkgbmnqykc.Miter;
            yadqdtsiqtVar.f21535istkbnxepw = Float.valueOf(4.0f);
            yadqdtsiqtVar.f21525cdpycssgdh = null;
            yadqdtsiqtVar.f21559yadqdtsiqt = new rgvfuqvkyq(0.0f);
            yadqdtsiqtVar.f21534iozdgvuglv = fValueOf;
            yadqdtsiqtVar.f21544lmojexxdyd = gxszxtbevoVar;
            yadqdtsiqtVar.f21556wwaezpbzkn = null;
            yadqdtsiqtVar.f21561ylkuphrtab = new rgvfuqvkyq(12.0f, okpsazkaxt.pt);
            yadqdtsiqtVar.f21548pkzmftpjix = Integer.valueOf(OkHttpErrorHandlerImpl.HTTP_BAD_REQUEST);
            yadqdtsiqtVar.f21531hcddaimhww = zoijcleaow.Normal;
            yadqdtsiqtVar.f21539jpowsppfya = EnumC0390lqeggnwhkg.None;
            yadqdtsiqtVar.f21532hkdspvbjdz = nufgyqmvbu.LTR;
            yadqdtsiqtVar.f21526cllcsxoeiz = gxszxtbevo.Start;
            Boolean bool = Boolean.TRUE;
            yadqdtsiqtVar.f21529dsvhmnatus = bool;
            yadqdtsiqtVar.f21557wypolnanlu = null;
            yadqdtsiqtVar.f21552stevsuqkhv = null;
            yadqdtsiqtVar.f21542kegysxyocb = null;
            yadqdtsiqtVar.f21553tzroggbefp = null;
            yadqdtsiqtVar.f21545mbcevpiqjq = bool;
            yadqdtsiqtVar.f21546ntlheqmsrt = bool;
            yadqdtsiqtVar.f21554ulzqkzuiru = gxszxtbevoVar;
            yadqdtsiqtVar.f21551sopmlzcsov = fValueOf;
            yadqdtsiqtVar.f21528crxdokpmqz = null;
            yadqdtsiqtVar.f21538jlmebxxoox = iobyxmoadgVar;
            yadqdtsiqtVar.f21550ribwqtqdhb = null;
            yadqdtsiqtVar.f21555vipkmwdibw = null;
            yadqdtsiqtVar.f21537jhduphickx = fValueOf;
            yadqdtsiqtVar.f21533ikoacuggdj = null;
            yadqdtsiqtVar.f21547okpsazkaxt = fValueOf;
            yadqdtsiqtVar.f21541jztzpxfvev = dxjokdxxww.None;
            yadqdtsiqtVar.f21558xrmfcynszj = eablkybsjg.auto;
            return yadqdtsiqtVar;
        }

        protected Object clone() {
            yadqdtsiqt yadqdtsiqtVar = (yadqdtsiqt) super.clone();
            rgvfuqvkyq[] rgvfuqvkyqVarArr = this.f21525cdpycssgdh;
            if (rgvfuqvkyqVarArr != null) {
                yadqdtsiqtVar.f21525cdpycssgdh = (rgvfuqvkyq[]) rgvfuqvkyqVarArr.clone();
            }
            return yadqdtsiqtVar;
        }

        void zoijcleaow(boolean z13) {
            Boolean bool = Boolean.TRUE;
            this.f21545mbcevpiqjq = bool;
            if (!z13) {
                bool = Boolean.FALSE;
            }
            this.f21529dsvhmnatus = bool;
            this.f21557wypolnanlu = null;
            this.f21528crxdokpmqz = null;
            this.f21534iozdgvuglv = Float.valueOf(1.0f);
            this.f21554ulzqkzuiru = gxszxtbevo.f21426yggfygwlhe;
            this.f21551sopmlzcsov = Float.valueOf(1.0f);
            this.f21550ribwqtqdhb = null;
            this.f21555vipkmwdibw = null;
            this.f21537jhduphickx = Float.valueOf(1.0f);
            this.f21533ikoacuggdj = null;
            this.f21547okpsazkaxt = Float.valueOf(1.0f);
            this.f21541jztzpxfvev = dxjokdxxww.None;
        }
    }

    static class yggfygwlhe extends dsvhmnatus {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        dsvhmnatus f21599yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        String f21600zdlpuopuiu;

        yggfygwlhe(String str, dsvhmnatus dsvhmnatusVar) {
            this.f21600zdlpuopuiu = str;
            this.f21599yggfygwlhe = dsvhmnatusVar;
        }

        public String toString() {
            return this.f21600zdlpuopuiu + " " + this.f21599yggfygwlhe;
        }
    }

    static abstract class ylkuphrtab extends hcddaimhww implements lmojexxdyd {

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        Set f21603dxjokdxxww = null;

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        String f21601btonecajqb = null;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        Set f21604gtknphoqwx = null;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        Set f21602draadjrbmk = null;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        Set f21605wflxmlrfwp = null;

        ylkuphrtab() {
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.lmojexxdyd
        public void btonecajqb(String str) {
            this.f21601btonecajqb = str;
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.lmojexxdyd
        public Set draadjrbmk() {
            return this.f21602draadjrbmk;
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.lmojexxdyd
        public void dxjokdxxww(Set set) {
            this.f21602draadjrbmk = set;
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.lmojexxdyd
        public Set getRequiredFeatures() {
            return this.f21603dxjokdxxww;
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.lmojexxdyd
        public void gxszxtbevo(Set set) {
            this.f21603dxjokdxxww = set;
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.lmojexxdyd
        public void lqeggnwhkg(Set set) {
            this.f21604gtknphoqwx = set;
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.lmojexxdyd
        public String ppxfxbqfkf() {
            return this.f21601btonecajqb;
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.lmojexxdyd
        public Set wflxmlrfwp() {
            return this.f21605wflxmlrfwp;
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.lmojexxdyd
        public void wkgbmnqykc(Set set) {
            this.f21605wflxmlrfwp = set;
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.lmojexxdyd
        public Set zoijcleaow() {
            return this.f21604gtknphoqwx;
        }
    }

    interface zdlpuopuiu {
    }

    static class zynmafqrjb extends draadjrbmk {

        /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
        rgvfuqvkyq f21610kcexrzcfyt;

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        rgvfuqvkyq f21611ojitshcjhn;

        /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
        rgvfuqvkyq f21612oxmwwwfdhm;

        /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
        rgvfuqvkyq f21613rgvfuqvkyq;

        /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
        rgvfuqvkyq f21614vdvldrhtss;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        rgvfuqvkyq f21615zdlpuopuiu;

        zynmafqrjb() {
        }

        @Override // com.caverock.androidsvg.lqeggnwhkg.cllcsxoeiz
        String agtfadlqog() {
            return "rect";
        }
    }

    lqeggnwhkg() {
    }

    public static lqeggnwhkg draadjrbmk(InputStream inputStream) {
        return new com.caverock.androidsvg.dxjokdxxww().lereixgezr(inputStream, f21392lqeggnwhkg);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private jpowsppfya dxjokdxxww(pkzmftpjix pkzmftpjixVar, String str) {
        jpowsppfya jpowsppfyaVarDxjokdxxww;
        jpowsppfya jpowsppfyaVar = (jpowsppfya) pkzmftpjixVar;
        if (str.equals(jpowsppfyaVar.f21448ppxfxbqfkf)) {
            return jpowsppfyaVar;
        }
        for (Object obj : pkzmftpjixVar.iobyxmoadg()) {
            if (obj instanceof jpowsppfya) {
                jpowsppfya jpowsppfyaVar2 = (jpowsppfya) obj;
                if (str.equals(jpowsppfyaVar2.f21448ppxfxbqfkf)) {
                    return jpowsppfyaVar2;
                }
                if ((obj instanceof pkzmftpjix) && (jpowsppfyaVarDxjokdxxww = dxjokdxxww((pkzmftpjix) obj, str)) != null) {
                    return jpowsppfyaVarDxjokdxxww;
                }
            }
        }
        return null;
    }

    private zoijcleaow eablkybsjg(float f13) {
        okpsazkaxt okpsazkaxtVar;
        okpsazkaxt okpsazkaxtVar2;
        okpsazkaxt okpsazkaxtVar3;
        okpsazkaxt okpsazkaxtVar4;
        float fZoijcleaow;
        okpsazkaxt okpsazkaxtVar5;
        iozdgvuglv iozdgvuglvVar = this.f21395iobyxmoadg;
        rgvfuqvkyq rgvfuqvkyqVar = iozdgvuglvVar.f21436kcexrzcfyt;
        rgvfuqvkyq rgvfuqvkyqVar2 = iozdgvuglvVar.f21440zdlpuopuiu;
        if (rgvfuqvkyqVar == null || rgvfuqvkyqVar.nufgyqmvbu() || (okpsazkaxtVar = rgvfuqvkyqVar.f21494yggfygwlhe) == (okpsazkaxtVar2 = okpsazkaxt.percent) || okpsazkaxtVar == (okpsazkaxtVar3 = okpsazkaxt.em) || okpsazkaxtVar == (okpsazkaxtVar4 = okpsazkaxt.ex)) {
            return new zoijcleaow(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float fZoijcleaow2 = rgvfuqvkyqVar.zoijcleaow(f13);
        if (rgvfuqvkyqVar2 == null) {
            zoijcleaow zoijcleaowVar = this.f21395iobyxmoadg.f21463rgvfuqvkyq;
            fZoijcleaow = zoijcleaowVar != null ? (zoijcleaowVar.f21608wkgbmnqykc * fZoijcleaow2) / zoijcleaowVar.f21607ppxfxbqfkf : fZoijcleaow2;
        } else {
            if (rgvfuqvkyqVar2.nufgyqmvbu() || (okpsazkaxtVar5 = rgvfuqvkyqVar2.f21494yggfygwlhe) == okpsazkaxtVar2 || okpsazkaxtVar5 == okpsazkaxtVar3 || okpsazkaxtVar5 == okpsazkaxtVar4) {
                return new zoijcleaow(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            fZoijcleaow = rgvfuqvkyqVar2.zoijcleaow(f13);
        }
        return new zoijcleaow(0.0f, 0.0f, fZoijcleaow2, fZoijcleaow);
    }

    static i9.iobyxmoadg gtknphoqwx() {
        return null;
    }

    private String ppxfxbqfkf(String str) {
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        return str.replace("\\\n", "").replace("\\A", "\n");
    }

    boolean agtfadlqog() {
        return !this.f21393eablkybsjg.wkgbmnqykc();
    }

    jpowsppfya btonecajqb(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.equals(this.f21395iobyxmoadg.f21448ppxfxbqfkf)) {
            return this.f21395iobyxmoadg;
        }
        if (this.f21394gxszxtbevo.containsKey(str)) {
            return (jpowsppfya) this.f21394gxszxtbevo.get(str);
        }
        jpowsppfya jpowsppfyaVarDxjokdxxww = dxjokdxxww(this.f21395iobyxmoadg, str);
        this.f21394gxszxtbevo.put(str, jpowsppfyaVarDxjokdxxww);
        return jpowsppfyaVarDxjokdxxww;
    }

    public void cqumvgiudr(float f13) {
        iozdgvuglv iozdgvuglvVar = this.f21395iobyxmoadg;
        if (iozdgvuglvVar == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        iozdgvuglvVar.f21436kcexrzcfyt = new rgvfuqvkyq(f13);
    }

    public void esjtqupxsv(String str) {
        iozdgvuglv iozdgvuglvVar = this.f21395iobyxmoadg;
        if (iozdgvuglvVar == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        iozdgvuglvVar.f21436kcexrzcfyt = com.caverock.androidsvg.dxjokdxxww.oipsdeybqn(str);
    }

    public float gxszxtbevo() {
        if (this.f21395iobyxmoadg != null) {
            return eablkybsjg(this.f21397wkgbmnqykc).f21608wkgbmnqykc;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    void iobyxmoadg(com.caverock.androidsvg.zoijcleaow.oxmwwwfdhm oxmwwwfdhmVar) {
        this.f21393eablkybsjg.zoijcleaow(oxmwwwfdhmVar);
    }

    public void iwizpuwonk(float f13, float f14, float f15, float f16) {
        iozdgvuglv iozdgvuglvVar = this.f21395iobyxmoadg;
        if (iozdgvuglvVar == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        iozdgvuglvVar.f21463rgvfuqvkyq = new zoijcleaow(f13, f14, f15, f16);
    }

    public void jyumaefscl(com.caverock.androidsvg.eablkybsjg eablkybsjgVar) {
        iozdgvuglv iozdgvuglvVar = this.f21395iobyxmoadg;
        if (iozdgvuglvVar == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        iozdgvuglvVar.f21524ojitshcjhn = eablkybsjgVar;
    }

    void kcexrzcfyt(String str) {
        this.f21396ppxfxbqfkf = str;
    }

    void lereixgezr(iozdgvuglv iozdgvuglvVar) {
        this.f21395iobyxmoadg = iozdgvuglvVar;
    }

    public RectF lqeggnwhkg() {
        iozdgvuglv iozdgvuglvVar = this.f21395iobyxmoadg;
        if (iozdgvuglvVar == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        zoijcleaow zoijcleaowVar = iozdgvuglvVar.f21463rgvfuqvkyq;
        if (zoijcleaowVar == null) {
            return null;
        }
        return zoijcleaowVar.wkgbmnqykc();
    }

    public float nufgyqmvbu() {
        if (this.f21395iobyxmoadg != null) {
            return eablkybsjg(this.f21397wkgbmnqykc).f21607ppxfxbqfkf;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public void ojitshcjhn(Canvas canvas, com.caverock.androidsvg.gxszxtbevo gxszxtbevoVar) {
        if (gxszxtbevoVar == null) {
            gxszxtbevoVar = new com.caverock.androidsvg.gxszxtbevo();
        }
        if (!gxszxtbevoVar.lqeggnwhkg()) {
            gxszxtbevoVar.nufgyqmvbu(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        }
        new com.caverock.androidsvg.nufgyqmvbu(canvas, this.f21397wkgbmnqykc).hszhottldk(this, gxszxtbevoVar);
    }

    cllcsxoeiz oxmwwwfdhm(String str) {
        if (str == null) {
            return null;
        }
        String strPpxfxbqfkf = ppxfxbqfkf(str);
        if (strPpxfxbqfkf.length() <= 1 || !strPpxfxbqfkf.startsWith("#")) {
            return null;
        }
        return btonecajqb(strPpxfxbqfkf.substring(1));
    }

    void pmvmpeiblj(String str) {
        this.f21398zoijcleaow = str;
    }

    public Picture rgvfuqvkyq(int i13, int i14) {
        return vdvldrhtss(i13, i14, null);
    }

    public Picture vdvldrhtss(int i13, int i14, com.caverock.androidsvg.gxszxtbevo gxszxtbevoVar) {
        Picture picture = new Picture();
        Canvas canvasBeginRecording = picture.beginRecording(i13, i14);
        if (gxszxtbevoVar == null || gxszxtbevoVar.f21387gxszxtbevo == null) {
            gxszxtbevoVar = gxszxtbevoVar == null ? new com.caverock.androidsvg.gxszxtbevo() : new com.caverock.androidsvg.gxszxtbevo(gxszxtbevoVar);
            gxszxtbevoVar.nufgyqmvbu(0.0f, 0.0f, i13, i14);
        }
        new com.caverock.androidsvg.nufgyqmvbu(canvasBeginRecording, this.f21397wkgbmnqykc).hszhottldk(this, gxszxtbevoVar);
        picture.endRecording();
        return picture;
    }

    iozdgvuglv wflxmlrfwp() {
        return this.f21395iobyxmoadg;
    }

    List wkgbmnqykc() {
        return this.f21393eablkybsjg.ppxfxbqfkf();
    }

    public void yggfygwlhe(String str) {
        iozdgvuglv iozdgvuglvVar = this.f21395iobyxmoadg;
        if (iozdgvuglvVar == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        iozdgvuglvVar.f21440zdlpuopuiu = com.caverock.androidsvg.dxjokdxxww.oipsdeybqn(str);
    }

    public void zdlpuopuiu(float f13) {
        iozdgvuglv iozdgvuglvVar = this.f21395iobyxmoadg;
        if (iozdgvuglvVar == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        iozdgvuglvVar.f21440zdlpuopuiu = new rgvfuqvkyq(f13);
    }

    void zoijcleaow() {
        this.f21393eablkybsjg.eablkybsjg(com.caverock.androidsvg.zoijcleaow.yggfygwlhe.RenderOptions);
    }

    static class rgvfuqvkyq implements Cloneable {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        okpsazkaxt f21494yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        float f21495zdlpuopuiu;

        rgvfuqvkyq(float f13, okpsazkaxt okpsazkaxtVar) {
            this.f21495zdlpuopuiu = f13;
            this.f21494yggfygwlhe = okpsazkaxtVar;
        }

        float eablkybsjg(com.caverock.androidsvg.nufgyqmvbu nufgyqmvbuVar) {
            switch (iobyxmoadg.f21435iobyxmoadg[this.f21494yggfygwlhe.ordinal()]) {
                case 1:
                    return this.f21495zdlpuopuiu;
                case 2:
                    return this.f21495zdlpuopuiu * nufgyqmvbuVar.stevsuqkhv();
                case 3:
                    return this.f21495zdlpuopuiu * nufgyqmvbuVar.kegysxyocb();
                case 4:
                    return this.f21495zdlpuopuiu * nufgyqmvbuVar.mbcevpiqjq();
                case 5:
                    return (this.f21495zdlpuopuiu * nufgyqmvbuVar.mbcevpiqjq()) / 2.54f;
                case 6:
                    return (this.f21495zdlpuopuiu * nufgyqmvbuVar.mbcevpiqjq()) / 25.4f;
                case 7:
                    return (this.f21495zdlpuopuiu * nufgyqmvbuVar.mbcevpiqjq()) / 72.0f;
                case 8:
                    return (this.f21495zdlpuopuiu * nufgyqmvbuVar.mbcevpiqjq()) / 6.0f;
                case 9:
                    zoijcleaow zoijcleaowVarTzroggbefp = nufgyqmvbuVar.tzroggbefp();
                    return zoijcleaowVarTzroggbefp == null ? this.f21495zdlpuopuiu : (this.f21495zdlpuopuiu * zoijcleaowVarTzroggbefp.f21607ppxfxbqfkf) / 100.0f;
                default:
                    return this.f21495zdlpuopuiu;
            }
        }

        float gxszxtbevo(com.caverock.androidsvg.nufgyqmvbu nufgyqmvbuVar) {
            if (this.f21494yggfygwlhe != okpsazkaxt.percent) {
                return eablkybsjg(nufgyqmvbuVar);
            }
            zoijcleaow zoijcleaowVarTzroggbefp = nufgyqmvbuVar.tzroggbefp();
            return zoijcleaowVarTzroggbefp == null ? this.f21495zdlpuopuiu : (this.f21495zdlpuopuiu * zoijcleaowVarTzroggbefp.f21608wkgbmnqykc) / 100.0f;
        }

        float iobyxmoadg() {
            return this.f21495zdlpuopuiu;
        }

        boolean lqeggnwhkg() {
            return this.f21495zdlpuopuiu < 0.0f;
        }

        boolean nufgyqmvbu() {
            return this.f21495zdlpuopuiu == 0.0f;
        }

        float ppxfxbqfkf(com.caverock.androidsvg.nufgyqmvbu nufgyqmvbuVar) {
            if (this.f21494yggfygwlhe != okpsazkaxt.percent) {
                return eablkybsjg(nufgyqmvbuVar);
            }
            zoijcleaow zoijcleaowVarTzroggbefp = nufgyqmvbuVar.tzroggbefp();
            if (zoijcleaowVarTzroggbefp == null) {
                return this.f21495zdlpuopuiu;
            }
            float f13 = zoijcleaowVarTzroggbefp.f21607ppxfxbqfkf;
            float f14 = zoijcleaowVarTzroggbefp.f21608wkgbmnqykc;
            if (f13 == f14) {
                return (this.f21495zdlpuopuiu * f13) / 100.0f;
            }
            return (this.f21495zdlpuopuiu * ((float) (Math.sqrt((f13 * f13) + (f14 * f14)) / 1.414213562373095d))) / 100.0f;
        }

        public String toString() {
            return String.valueOf(this.f21495zdlpuopuiu) + this.f21494yggfygwlhe;
        }

        float wkgbmnqykc(com.caverock.androidsvg.nufgyqmvbu nufgyqmvbuVar, float f13) {
            return this.f21494yggfygwlhe == okpsazkaxt.percent ? (this.f21495zdlpuopuiu * f13) / 100.0f : eablkybsjg(nufgyqmvbuVar);
        }

        float zoijcleaow(float f13) {
            int i13 = iobyxmoadg.f21435iobyxmoadg[this.f21494yggfygwlhe.ordinal()];
            if (i13 == 1) {
                return this.f21495zdlpuopuiu;
            }
            switch (i13) {
                case 4:
                    return this.f21495zdlpuopuiu * f13;
                case 5:
                    return (this.f21495zdlpuopuiu * f13) / 2.54f;
                case 6:
                    return (this.f21495zdlpuopuiu * f13) / 25.4f;
                case 7:
                    return (this.f21495zdlpuopuiu * f13) / 72.0f;
                case 8:
                    return (this.f21495zdlpuopuiu * f13) / 6.0f;
                default:
                    return this.f21495zdlpuopuiu;
            }
        }

        rgvfuqvkyq(float f13) {
            this.f21495zdlpuopuiu = f13;
            this.f21494yggfygwlhe = okpsazkaxt.px;
        }
    }

    static class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        float f21606iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        float f21607ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        float f21608wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        float f21609zoijcleaow;

        zoijcleaow(float f13, float f14, float f15, float f16) {
            this.f21606iobyxmoadg = f13;
            this.f21609zoijcleaow = f14;
            this.f21607ppxfxbqfkf = f15;
            this.f21608wkgbmnqykc = f16;
        }

        static zoijcleaow iobyxmoadg(float f13, float f14, float f15, float f16) {
            return new zoijcleaow(f13, f14, f15 - f13, f16 - f14);
        }

        void eablkybsjg(zoijcleaow zoijcleaowVar) {
            float f13 = zoijcleaowVar.f21606iobyxmoadg;
            if (f13 < this.f21606iobyxmoadg) {
                this.f21606iobyxmoadg = f13;
            }
            float f14 = zoijcleaowVar.f21609zoijcleaow;
            if (f14 < this.f21609zoijcleaow) {
                this.f21609zoijcleaow = f14;
            }
            if (zoijcleaowVar.zoijcleaow() > zoijcleaow()) {
                this.f21607ppxfxbqfkf = zoijcleaowVar.zoijcleaow() - this.f21606iobyxmoadg;
            }
            if (zoijcleaowVar.ppxfxbqfkf() > ppxfxbqfkf()) {
                this.f21608wkgbmnqykc = zoijcleaowVar.ppxfxbqfkf() - this.f21609zoijcleaow;
            }
        }

        float ppxfxbqfkf() {
            return this.f21609zoijcleaow + this.f21608wkgbmnqykc;
        }

        public String toString() {
            return "[" + this.f21606iobyxmoadg + " " + this.f21609zoijcleaow + " " + this.f21607ppxfxbqfkf + " " + this.f21608wkgbmnqykc + "]";
        }

        RectF wkgbmnqykc() {
            return new RectF(this.f21606iobyxmoadg, this.f21609zoijcleaow, zoijcleaow(), ppxfxbqfkf());
        }

        float zoijcleaow() {
            return this.f21606iobyxmoadg + this.f21607ppxfxbqfkf;
        }

        zoijcleaow(zoijcleaow zoijcleaowVar) {
            this.f21606iobyxmoadg = zoijcleaowVar.f21606iobyxmoadg;
            this.f21609zoijcleaow = zoijcleaowVar.f21609zoijcleaow;
            this.f21607ppxfxbqfkf = zoijcleaowVar.f21607ppxfxbqfkf;
            this.f21608wkgbmnqykc = zoijcleaowVar.f21608wkgbmnqykc;
        }
    }
}
