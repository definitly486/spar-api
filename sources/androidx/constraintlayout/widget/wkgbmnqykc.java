package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.protobuf.DescriptorProtos;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.C4007z9;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import modern.payments.ecomAndroid.util.view.CardDateFormatTextWatcher;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private boolean f8148iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public String f8153zoijcleaow;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final int[] f8144dxjokdxxww = {0, 4, 8};

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private static SparseIntArray f8143btonecajqb = new SparseIntArray();

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private static SparseIntArray f8145gtknphoqwx = new SparseIntArray();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public String f8151ppxfxbqfkf = "";

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private String[] f8152wkgbmnqykc = new String[0];

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public int f8146eablkybsjg = 0;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private HashMap f8147gxszxtbevo = new HashMap();

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private boolean f8149lqeggnwhkg = true;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private HashMap f8150nufgyqmvbu = new HashMap();

    public static class eablkybsjg {

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        private static SparseIntArray f8154ojitshcjhn;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public boolean f8162iobyxmoadg = false;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public float f8168zoijcleaow = 0.0f;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public float f8165ppxfxbqfkf = 0.0f;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public float f8167wkgbmnqykc = 0.0f;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public float f8159eablkybsjg = 1.0f;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        public float f8161gxszxtbevo = 1.0f;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        public float f8163lqeggnwhkg = Float.NaN;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        public float f8164nufgyqmvbu = Float.NaN;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        public int f8158dxjokdxxww = -1;

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        public float f8156btonecajqb = 0.0f;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        public float f8160gtknphoqwx = 0.0f;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        public float f8157draadjrbmk = 0.0f;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        public boolean f8166wflxmlrfwp = false;

        /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
        public float f8155agtfadlqog = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f8154ojitshcjhn = sparseIntArray;
            sparseIntArray.append(nufgyqmvbu.Transform_android_rotation, 1);
            f8154ojitshcjhn.append(nufgyqmvbu.Transform_android_rotationX, 2);
            f8154ojitshcjhn.append(nufgyqmvbu.Transform_android_rotationY, 3);
            f8154ojitshcjhn.append(nufgyqmvbu.Transform_android_scaleX, 4);
            f8154ojitshcjhn.append(nufgyqmvbu.Transform_android_scaleY, 5);
            f8154ojitshcjhn.append(nufgyqmvbu.Transform_android_transformPivotX, 6);
            f8154ojitshcjhn.append(nufgyqmvbu.Transform_android_transformPivotY, 7);
            f8154ojitshcjhn.append(nufgyqmvbu.Transform_android_translationX, 8);
            f8154ojitshcjhn.append(nufgyqmvbu.Transform_android_translationY, 9);
            f8154ojitshcjhn.append(nufgyqmvbu.Transform_android_translationZ, 10);
            f8154ojitshcjhn.append(nufgyqmvbu.Transform_android_elevation, 11);
            f8154ojitshcjhn.append(nufgyqmvbu.Transform_transformPivotTarget, 12);
        }

        public void iobyxmoadg(eablkybsjg eablkybsjgVar) {
            this.f8162iobyxmoadg = eablkybsjgVar.f8162iobyxmoadg;
            this.f8168zoijcleaow = eablkybsjgVar.f8168zoijcleaow;
            this.f8165ppxfxbqfkf = eablkybsjgVar.f8165ppxfxbqfkf;
            this.f8167wkgbmnqykc = eablkybsjgVar.f8167wkgbmnqykc;
            this.f8159eablkybsjg = eablkybsjgVar.f8159eablkybsjg;
            this.f8161gxszxtbevo = eablkybsjgVar.f8161gxszxtbevo;
            this.f8163lqeggnwhkg = eablkybsjgVar.f8163lqeggnwhkg;
            this.f8164nufgyqmvbu = eablkybsjgVar.f8164nufgyqmvbu;
            this.f8158dxjokdxxww = eablkybsjgVar.f8158dxjokdxxww;
            this.f8156btonecajqb = eablkybsjgVar.f8156btonecajqb;
            this.f8160gtknphoqwx = eablkybsjgVar.f8160gtknphoqwx;
            this.f8157draadjrbmk = eablkybsjgVar.f8157draadjrbmk;
            this.f8166wflxmlrfwp = eablkybsjgVar.f8166wflxmlrfwp;
            this.f8155agtfadlqog = eablkybsjgVar.f8155agtfadlqog;
        }

        void zoijcleaow(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nufgyqmvbu.Transform);
            this.f8162iobyxmoadg = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i13);
                switch (f8154ojitshcjhn.get(index)) {
                    case 1:
                        this.f8168zoijcleaow = typedArrayObtainStyledAttributes.getFloat(index, this.f8168zoijcleaow);
                        break;
                    case 2:
                        this.f8165ppxfxbqfkf = typedArrayObtainStyledAttributes.getFloat(index, this.f8165ppxfxbqfkf);
                        break;
                    case 3:
                        this.f8167wkgbmnqykc = typedArrayObtainStyledAttributes.getFloat(index, this.f8167wkgbmnqykc);
                        break;
                    case 4:
                        this.f8159eablkybsjg = typedArrayObtainStyledAttributes.getFloat(index, this.f8159eablkybsjg);
                        break;
                    case 5:
                        this.f8161gxszxtbevo = typedArrayObtainStyledAttributes.getFloat(index, this.f8161gxszxtbevo);
                        break;
                    case 6:
                        this.f8163lqeggnwhkg = typedArrayObtainStyledAttributes.getDimension(index, this.f8163lqeggnwhkg);
                        break;
                    case 7:
                        this.f8164nufgyqmvbu = typedArrayObtainStyledAttributes.getDimension(index, this.f8164nufgyqmvbu);
                        break;
                    case 8:
                        this.f8156btonecajqb = typedArrayObtainStyledAttributes.getDimension(index, this.f8156btonecajqb);
                        break;
                    case 9:
                        this.f8160gtknphoqwx = typedArrayObtainStyledAttributes.getDimension(index, this.f8160gtknphoqwx);
                        break;
                    case 10:
                        this.f8157draadjrbmk = typedArrayObtainStyledAttributes.getDimension(index, this.f8157draadjrbmk);
                        break;
                    case 11:
                        this.f8166wflxmlrfwp = true;
                        this.f8155agtfadlqog = typedArrayObtainStyledAttributes.getDimension(index, this.f8155agtfadlqog);
                        break;
                    case 12:
                        this.f8158dxjokdxxww = wkgbmnqykc.cdpycssgdh(typedArrayObtainStyledAttributes, index, this.f8158dxjokdxxww);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        int f8171iobyxmoadg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        C0130iobyxmoadg f8173nufgyqmvbu;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        String f8176zoijcleaow;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final C0131wkgbmnqykc f8174ppxfxbqfkf = new C0131wkgbmnqykc();

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public final ppxfxbqfkf f8175wkgbmnqykc = new ppxfxbqfkf();

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public final zoijcleaow f8169eablkybsjg = new zoijcleaow();

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        public final eablkybsjg f8170gxszxtbevo = new eablkybsjg();

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        public HashMap f8172lqeggnwhkg = new HashMap();

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.wkgbmnqykc$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static class C0130iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            int[] f8183iobyxmoadg = new int[10];

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            int[] f8188zoijcleaow = new int[10];

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            int f8186ppxfxbqfkf = 0;

            /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
            int[] f8187wkgbmnqykc = new int[10];

            /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
            float[] f8180eablkybsjg = new float[10];

            /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
            int f8182gxszxtbevo = 0;

            /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
            int[] f8184lqeggnwhkg = new int[5];

            /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
            String[] f8185nufgyqmvbu = new String[5];

            /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
            int f8179dxjokdxxww = 0;

            /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
            int[] f8177btonecajqb = new int[4];

            /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
            boolean[] f8181gtknphoqwx = new boolean[4];

            /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
            int f8178draadjrbmk = 0;

            C0130iobyxmoadg() {
            }

            void eablkybsjg(iobyxmoadg iobyxmoadgVar) {
                for (int i13 = 0; i13 < this.f8186ppxfxbqfkf; i13++) {
                    wkgbmnqykc.hkdspvbjdz(iobyxmoadgVar, this.f8183iobyxmoadg[i13], this.f8188zoijcleaow[i13]);
                }
                for (int i14 = 0; i14 < this.f8182gxszxtbevo; i14++) {
                    wkgbmnqykc.jpowsppfya(iobyxmoadgVar, this.f8187wkgbmnqykc[i14], this.f8180eablkybsjg[i14]);
                }
                for (int i15 = 0; i15 < this.f8179dxjokdxxww; i15++) {
                    wkgbmnqykc.cllcsxoeiz(iobyxmoadgVar, this.f8184lqeggnwhkg[i15], this.f8185nufgyqmvbu[i15]);
                }
                for (int i16 = 0; i16 < this.f8178draadjrbmk; i16++) {
                    wkgbmnqykc.dsvhmnatus(iobyxmoadgVar, this.f8177btonecajqb[i16], this.f8181gtknphoqwx[i16]);
                }
            }

            void iobyxmoadg(int i13, float f13) {
                int i14 = this.f8182gxszxtbevo;
                int[] iArr = this.f8187wkgbmnqykc;
                if (i14 >= iArr.length) {
                    this.f8187wkgbmnqykc = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f8180eablkybsjg;
                    this.f8180eablkybsjg = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f8187wkgbmnqykc;
                int i15 = this.f8182gxszxtbevo;
                iArr2[i15] = i13;
                float[] fArr2 = this.f8180eablkybsjg;
                this.f8182gxszxtbevo = i15 + 1;
                fArr2[i15] = f13;
            }

            void ppxfxbqfkf(int i13, String str) {
                int i14 = this.f8179dxjokdxxww;
                int[] iArr = this.f8184lqeggnwhkg;
                if (i14 >= iArr.length) {
                    this.f8184lqeggnwhkg = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f8185nufgyqmvbu;
                    this.f8185nufgyqmvbu = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f8184lqeggnwhkg;
                int i15 = this.f8179dxjokdxxww;
                iArr2[i15] = i13;
                String[] strArr2 = this.f8185nufgyqmvbu;
                this.f8179dxjokdxxww = i15 + 1;
                strArr2[i15] = str;
            }

            void wkgbmnqykc(int i13, boolean z13) {
                int i14 = this.f8178draadjrbmk;
                int[] iArr = this.f8177btonecajqb;
                if (i14 >= iArr.length) {
                    this.f8177btonecajqb = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f8181gtknphoqwx;
                    this.f8181gtknphoqwx = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f8177btonecajqb;
                int i15 = this.f8178draadjrbmk;
                iArr2[i15] = i13;
                boolean[] zArr2 = this.f8181gtknphoqwx;
                this.f8178draadjrbmk = i15 + 1;
                zArr2[i15] = z13;
            }

            void zoijcleaow(int i13, int i14) {
                int i15 = this.f8186ppxfxbqfkf;
                int[] iArr = this.f8183iobyxmoadg;
                if (i15 >= iArr.length) {
                    this.f8183iobyxmoadg = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f8188zoijcleaow;
                    this.f8188zoijcleaow = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f8183iobyxmoadg;
                int i16 = this.f8186ppxfxbqfkf;
                iArr3[i16] = i13;
                int[] iArr4 = this.f8188zoijcleaow;
                this.f8186ppxfxbqfkf = i16 + 1;
                iArr4[i16] = i14;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void eablkybsjg(int i13, ConstraintLayout.zoijcleaow zoijcleaowVar) {
            this.f8171iobyxmoadg = i13;
            zoijcleaow zoijcleaowVar2 = this.f8169eablkybsjg;
            zoijcleaowVar2.f8212btonecajqb = zoijcleaowVar.f8013eablkybsjg;
            zoijcleaowVar2.f8223gtknphoqwx = zoijcleaowVar.f8016gxszxtbevo;
            zoijcleaowVar2.f8218draadjrbmk = zoijcleaowVar.f8034lqeggnwhkg;
            zoijcleaowVar2.f8265wflxmlrfwp = zoijcleaowVar.f8039nufgyqmvbu;
            zoijcleaowVar2.f8210agtfadlqog = zoijcleaowVar.f8012dxjokdxxww;
            zoijcleaowVar2.f8247ojitshcjhn = zoijcleaowVar.f8004btonecajqb;
            zoijcleaowVar2.f8254rgvfuqvkyq = zoijcleaowVar.f8015gtknphoqwx;
            zoijcleaowVar2.f8263vdvldrhtss = zoijcleaowVar.f8010draadjrbmk;
            zoijcleaowVar2.f8250oxmwwwfdhm = zoijcleaowVar.f8062wflxmlrfwp;
            zoijcleaowVar2.f8237kcexrzcfyt = zoijcleaowVar.f8002agtfadlqog;
            zoijcleaowVar2.f8275zdlpuopuiu = zoijcleaowVar.f8042ojitshcjhn;
            zoijcleaowVar2.f8273yggfygwlhe = zoijcleaowVar.f8030kcexrzcfyt;
            zoijcleaowVar2.f8235jyumaefscl = zoijcleaowVar.f8072zdlpuopuiu;
            zoijcleaowVar2.f8231iwizpuwonk = zoijcleaowVar.f8070yggfygwlhe;
            zoijcleaowVar2.f8215cqumvgiudr = zoijcleaowVar.f8028jyumaefscl;
            zoijcleaowVar2.f8222esjtqupxsv = zoijcleaowVar.f8033lmojexxdyd;
            zoijcleaowVar2.f8239lereixgezr = zoijcleaowVar.f8064wwaezpbzkn;
            zoijcleaowVar2.f8252pmvmpeiblj = zoijcleaowVar.f8071ylkuphrtab;
            zoijcleaowVar2.f8278zynmafqrjb = zoijcleaowVar.f8049rgvfuqvkyq;
            zoijcleaowVar2.f8230istkbnxepw = zoijcleaowVar.f8059vdvldrhtss;
            zoijcleaowVar2.f8213cdpycssgdh = zoijcleaowVar.f8045oxmwwwfdhm;
            zoijcleaowVar2.f8270yadqdtsiqt = zoijcleaowVar.f8008crxdokpmqz;
            zoijcleaowVar2.f8229iozdgvuglv = zoijcleaowVar.f8026jlmebxxoox;
            zoijcleaowVar2.f8240lmojexxdyd = zoijcleaowVar.f8050ribwqtqdhb;
            zoijcleaowVar2.f8245nufgyqmvbu = zoijcleaowVar.f8048ppxfxbqfkf;
            zoijcleaowVar2.f8224gxszxtbevo = zoijcleaowVar.f8020iobyxmoadg;
            zoijcleaowVar2.f8241lqeggnwhkg = zoijcleaowVar.f8075zoijcleaow;
            zoijcleaowVar2.f8266wkgbmnqykc = ((ViewGroup.MarginLayoutParams) zoijcleaowVar).width;
            zoijcleaowVar2.f8221eablkybsjg = ((ViewGroup.MarginLayoutParams) zoijcleaowVar).height;
            zoijcleaowVar2.f8267wwaezpbzkn = ((ViewGroup.MarginLayoutParams) zoijcleaowVar).leftMargin;
            zoijcleaowVar2.f8274ylkuphrtab = ((ViewGroup.MarginLayoutParams) zoijcleaowVar).rightMargin;
            zoijcleaowVar2.f8251pkzmftpjix = ((ViewGroup.MarginLayoutParams) zoijcleaowVar).topMargin;
            zoijcleaowVar2.f8225hcddaimhww = ((ViewGroup.MarginLayoutParams) zoijcleaowVar).bottomMargin;
            zoijcleaowVar2.f8214cllcsxoeiz = zoijcleaowVar.f8005cdpycssgdh;
            zoijcleaowVar2.f8261ulzqkzuiru = zoijcleaowVar.f8018hkdspvbjdz;
            zoijcleaowVar2.f8258sopmlzcsov = zoijcleaowVar.f8027jpowsppfya;
            zoijcleaowVar2.f8233jlmebxxoox = zoijcleaowVar.f8011dsvhmnatus;
            zoijcleaowVar2.f8216crxdokpmqz = zoijcleaowVar.f8006cllcsxoeiz;
            zoijcleaowVar2.f8276zfvoamnweg = zoijcleaowVar.f8060vipkmwdibw;
            zoijcleaowVar2.f8246oipsdeybqn = zoijcleaowVar.f8025jhduphickx;
            zoijcleaowVar2.f8255ribwqtqdhb = zoijcleaowVar.f8065wypolnanlu;
            zoijcleaowVar2.f8264vipkmwdibw = zoijcleaowVar.f8054stevsuqkhv;
            zoijcleaowVar2.f8232jhduphickx = zoijcleaowVar.f8036mbcevpiqjq;
            zoijcleaowVar2.f8227ikoacuggdj = zoijcleaowVar.f8038ntlheqmsrt;
            zoijcleaowVar2.f8248okpsazkaxt = zoijcleaowVar.f8031kegysxyocb;
            zoijcleaowVar2.f8236jztzpxfvev = zoijcleaowVar.f8056tzroggbefp;
            zoijcleaowVar2.f8269xrmfcynszj = zoijcleaowVar.f8057ulzqkzuiru;
            zoijcleaowVar2.f8243metgxyhuhe = zoijcleaowVar.f8053sopmlzcsov;
            zoijcleaowVar2.f8257sflfametgt = zoijcleaowVar.f8019ikoacuggdj;
            zoijcleaowVar2.f8268wypolnanlu = zoijcleaowVar.f8007cqumvgiudr;
            zoijcleaowVar2.f8238kegysxyocb = zoijcleaowVar.f8032lereixgezr;
            zoijcleaowVar2.f8219dsvhmnatus = zoijcleaowVar.f8023iwizpuwonk;
            zoijcleaowVar2.f8259stevsuqkhv = zoijcleaowVar.f8014esjtqupxsv;
            zoijcleaowVar2.f8242mbcevpiqjq = zoijcleaowVar.f8047pmvmpeiblj;
            zoijcleaowVar2.f8260tzroggbefp = zoijcleaowVar.f8076zynmafqrjb;
            zoijcleaowVar2.f8244ntlheqmsrt = zoijcleaowVar.f8022istkbnxepw;
            zoijcleaowVar2.f8249opjhrmiecq = zoijcleaowVar.f8043okpsazkaxt;
            zoijcleaowVar2.f8234jpowsppfya = zoijcleaowVar.getMarginEnd();
            this.f8169eablkybsjg.f8226hkdspvbjdz = zoijcleaowVar.getMarginStart();
        }

        public void ppxfxbqfkf(ConstraintLayout.zoijcleaow zoijcleaowVar) {
            zoijcleaow zoijcleaowVar2 = this.f8169eablkybsjg;
            zoijcleaowVar.f8013eablkybsjg = zoijcleaowVar2.f8212btonecajqb;
            zoijcleaowVar.f8016gxszxtbevo = zoijcleaowVar2.f8223gtknphoqwx;
            zoijcleaowVar.f8034lqeggnwhkg = zoijcleaowVar2.f8218draadjrbmk;
            zoijcleaowVar.f8039nufgyqmvbu = zoijcleaowVar2.f8265wflxmlrfwp;
            zoijcleaowVar.f8012dxjokdxxww = zoijcleaowVar2.f8210agtfadlqog;
            zoijcleaowVar.f8004btonecajqb = zoijcleaowVar2.f8247ojitshcjhn;
            zoijcleaowVar.f8015gtknphoqwx = zoijcleaowVar2.f8254rgvfuqvkyq;
            zoijcleaowVar.f8010draadjrbmk = zoijcleaowVar2.f8263vdvldrhtss;
            zoijcleaowVar.f8062wflxmlrfwp = zoijcleaowVar2.f8250oxmwwwfdhm;
            zoijcleaowVar.f8002agtfadlqog = zoijcleaowVar2.f8237kcexrzcfyt;
            zoijcleaowVar.f8042ojitshcjhn = zoijcleaowVar2.f8275zdlpuopuiu;
            zoijcleaowVar.f8030kcexrzcfyt = zoijcleaowVar2.f8273yggfygwlhe;
            zoijcleaowVar.f8072zdlpuopuiu = zoijcleaowVar2.f8235jyumaefscl;
            zoijcleaowVar.f8070yggfygwlhe = zoijcleaowVar2.f8231iwizpuwonk;
            zoijcleaowVar.f8028jyumaefscl = zoijcleaowVar2.f8215cqumvgiudr;
            ((ViewGroup.MarginLayoutParams) zoijcleaowVar).leftMargin = zoijcleaowVar2.f8267wwaezpbzkn;
            ((ViewGroup.MarginLayoutParams) zoijcleaowVar).rightMargin = zoijcleaowVar2.f8274ylkuphrtab;
            ((ViewGroup.MarginLayoutParams) zoijcleaowVar).topMargin = zoijcleaowVar2.f8251pkzmftpjix;
            ((ViewGroup.MarginLayoutParams) zoijcleaowVar).bottomMargin = zoijcleaowVar2.f8225hcddaimhww;
            zoijcleaowVar.f8047pmvmpeiblj = zoijcleaowVar2.f8242mbcevpiqjq;
            zoijcleaowVar.f8076zynmafqrjb = zoijcleaowVar2.f8260tzroggbefp;
            zoijcleaowVar.f8007cqumvgiudr = zoijcleaowVar2.f8268wypolnanlu;
            zoijcleaowVar.f8032lereixgezr = zoijcleaowVar2.f8238kegysxyocb;
            zoijcleaowVar.f8033lmojexxdyd = zoijcleaowVar2.f8222esjtqupxsv;
            zoijcleaowVar.f8064wwaezpbzkn = zoijcleaowVar2.f8239lereixgezr;
            zoijcleaowVar.f8049rgvfuqvkyq = zoijcleaowVar2.f8278zynmafqrjb;
            zoijcleaowVar.f8059vdvldrhtss = zoijcleaowVar2.f8230istkbnxepw;
            zoijcleaowVar.f8045oxmwwwfdhm = zoijcleaowVar2.f8213cdpycssgdh;
            zoijcleaowVar.f8071ylkuphrtab = zoijcleaowVar2.f8252pmvmpeiblj;
            zoijcleaowVar.f8008crxdokpmqz = zoijcleaowVar2.f8270yadqdtsiqt;
            zoijcleaowVar.f8026jlmebxxoox = zoijcleaowVar2.f8229iozdgvuglv;
            zoijcleaowVar.f8018hkdspvbjdz = zoijcleaowVar2.f8261ulzqkzuiru;
            zoijcleaowVar.f8027jpowsppfya = zoijcleaowVar2.f8258sopmlzcsov;
            zoijcleaowVar.f8011dsvhmnatus = zoijcleaowVar2.f8233jlmebxxoox;
            zoijcleaowVar.f8006cllcsxoeiz = zoijcleaowVar2.f8216crxdokpmqz;
            zoijcleaowVar.f8060vipkmwdibw = zoijcleaowVar2.f8276zfvoamnweg;
            zoijcleaowVar.f8025jhduphickx = zoijcleaowVar2.f8246oipsdeybqn;
            zoijcleaowVar.f8065wypolnanlu = zoijcleaowVar2.f8255ribwqtqdhb;
            zoijcleaowVar.f8054stevsuqkhv = zoijcleaowVar2.f8264vipkmwdibw;
            zoijcleaowVar.f8036mbcevpiqjq = zoijcleaowVar2.f8232jhduphickx;
            zoijcleaowVar.f8038ntlheqmsrt = zoijcleaowVar2.f8227ikoacuggdj;
            zoijcleaowVar.f8031kegysxyocb = zoijcleaowVar2.f8248okpsazkaxt;
            zoijcleaowVar.f8056tzroggbefp = zoijcleaowVar2.f8236jztzpxfvev;
            zoijcleaowVar.f8057ulzqkzuiru = zoijcleaowVar2.f8269xrmfcynszj;
            zoijcleaowVar.f8053sopmlzcsov = zoijcleaowVar2.f8243metgxyhuhe;
            zoijcleaowVar.f8050ribwqtqdhb = zoijcleaowVar2.f8240lmojexxdyd;
            zoijcleaowVar.f8048ppxfxbqfkf = zoijcleaowVar2.f8245nufgyqmvbu;
            zoijcleaowVar.f8020iobyxmoadg = zoijcleaowVar2.f8224gxszxtbevo;
            zoijcleaowVar.f8075zoijcleaow = zoijcleaowVar2.f8241lqeggnwhkg;
            ((ViewGroup.MarginLayoutParams) zoijcleaowVar).width = zoijcleaowVar2.f8266wkgbmnqykc;
            ((ViewGroup.MarginLayoutParams) zoijcleaowVar).height = zoijcleaowVar2.f8221eablkybsjg;
            String str = zoijcleaowVar2.f8257sflfametgt;
            if (str != null) {
                zoijcleaowVar.f8019ikoacuggdj = str;
            }
            zoijcleaowVar.f8043okpsazkaxt = zoijcleaowVar2.f8249opjhrmiecq;
            zoijcleaowVar.setMarginStart(zoijcleaowVar2.f8226hkdspvbjdz);
            zoijcleaowVar.setMarginEnd(this.f8169eablkybsjg.f8234jpowsppfya);
            zoijcleaowVar.zoijcleaow();
        }

        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public iobyxmoadg clone() {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
            iobyxmoadgVar.f8169eablkybsjg.iobyxmoadg(this.f8169eablkybsjg);
            iobyxmoadgVar.f8175wkgbmnqykc.iobyxmoadg(this.f8175wkgbmnqykc);
            iobyxmoadgVar.f8174ppxfxbqfkf.iobyxmoadg(this.f8174ppxfxbqfkf);
            iobyxmoadgVar.f8170gxszxtbevo.iobyxmoadg(this.f8170gxszxtbevo);
            iobyxmoadgVar.f8171iobyxmoadg = this.f8171iobyxmoadg;
            iobyxmoadgVar.f8173nufgyqmvbu = this.f8173nufgyqmvbu;
            return iobyxmoadgVar;
        }

        public void zoijcleaow(iobyxmoadg iobyxmoadgVar) {
            C0130iobyxmoadg c0130iobyxmoadg = this.f8173nufgyqmvbu;
            if (c0130iobyxmoadg != null) {
                c0130iobyxmoadg.eablkybsjg(iobyxmoadgVar);
            }
        }
    }

    public static class ppxfxbqfkf {

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        private static SparseIntArray f8189ojitshcjhn;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public boolean f8197iobyxmoadg = false;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public int f8203zoijcleaow = -1;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public int f8200ppxfxbqfkf = 0;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public String f8202wkgbmnqykc = null;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public int f8194eablkybsjg = -1;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        public int f8196gxszxtbevo = 0;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        public float f8198lqeggnwhkg = Float.NaN;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        public int f8199nufgyqmvbu = -1;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        public float f8193dxjokdxxww = Float.NaN;

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        public float f8191btonecajqb = Float.NaN;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        public int f8195gtknphoqwx = -1;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        public String f8192draadjrbmk = null;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        public int f8201wflxmlrfwp = -3;

        /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
        public int f8190agtfadlqog = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f8189ojitshcjhn = sparseIntArray;
            sparseIntArray.append(nufgyqmvbu.Motion_motionPathRotate, 1);
            f8189ojitshcjhn.append(nufgyqmvbu.Motion_pathMotionArc, 2);
            f8189ojitshcjhn.append(nufgyqmvbu.Motion_transitionEasing, 3);
            f8189ojitshcjhn.append(nufgyqmvbu.Motion_drawPath, 4);
            f8189ojitshcjhn.append(nufgyqmvbu.Motion_animateRelativeTo, 5);
            f8189ojitshcjhn.append(nufgyqmvbu.Motion_animateCircleAngleTo, 6);
            f8189ojitshcjhn.append(nufgyqmvbu.Motion_motionStagger, 7);
            f8189ojitshcjhn.append(nufgyqmvbu.Motion_quantizeMotionSteps, 8);
            f8189ojitshcjhn.append(nufgyqmvbu.Motion_quantizeMotionPhase, 9);
            f8189ojitshcjhn.append(nufgyqmvbu.Motion_quantizeMotionInterpolator, 10);
        }

        public void iobyxmoadg(ppxfxbqfkf ppxfxbqfkfVar) {
            this.f8197iobyxmoadg = ppxfxbqfkfVar.f8197iobyxmoadg;
            this.f8203zoijcleaow = ppxfxbqfkfVar.f8203zoijcleaow;
            this.f8202wkgbmnqykc = ppxfxbqfkfVar.f8202wkgbmnqykc;
            this.f8194eablkybsjg = ppxfxbqfkfVar.f8194eablkybsjg;
            this.f8196gxszxtbevo = ppxfxbqfkfVar.f8196gxszxtbevo;
            this.f8193dxjokdxxww = ppxfxbqfkfVar.f8193dxjokdxxww;
            this.f8198lqeggnwhkg = ppxfxbqfkfVar.f8198lqeggnwhkg;
            this.f8199nufgyqmvbu = ppxfxbqfkfVar.f8199nufgyqmvbu;
        }

        void zoijcleaow(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nufgyqmvbu.Motion);
            this.f8197iobyxmoadg = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i13);
                switch (f8189ojitshcjhn.get(index)) {
                    case 1:
                        this.f8193dxjokdxxww = typedArrayObtainStyledAttributes.getFloat(index, this.f8193dxjokdxxww);
                        break;
                    case 2:
                        this.f8194eablkybsjg = typedArrayObtainStyledAttributes.getInt(index, this.f8194eablkybsjg);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.f8202wkgbmnqykc = typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            this.f8202wkgbmnqykc = a1.ppxfxbqfkf.f259ppxfxbqfkf[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        this.f8196gxszxtbevo = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f8203zoijcleaow = wkgbmnqykc.cdpycssgdh(typedArrayObtainStyledAttributes, index, this.f8203zoijcleaow);
                        break;
                    case 6:
                        this.f8200ppxfxbqfkf = typedArrayObtainStyledAttributes.getInteger(index, this.f8200ppxfxbqfkf);
                        break;
                    case 7:
                        this.f8198lqeggnwhkg = typedArrayObtainStyledAttributes.getFloat(index, this.f8198lqeggnwhkg);
                        break;
                    case 8:
                        this.f8195gtknphoqwx = typedArrayObtainStyledAttributes.getInteger(index, this.f8195gtknphoqwx);
                        break;
                    case 9:
                        this.f8191btonecajqb = typedArrayObtainStyledAttributes.getFloat(index, this.f8191btonecajqb);
                        break;
                    case 10:
                        int i14 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i14 == 1) {
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.f8190agtfadlqog = resourceId;
                            if (resourceId != -1) {
                                this.f8201wflxmlrfwp = -2;
                            }
                        } else if (i14 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.f8192draadjrbmk = string;
                            if (string.indexOf(CardDateFormatTextWatcher.DIVIDER_CHARACTER) > 0) {
                                this.f8190agtfadlqog = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.f8201wflxmlrfwp = -2;
                            } else {
                                this.f8201wflxmlrfwp = -1;
                            }
                        } else {
                            this.f8201wflxmlrfwp = typedArrayObtainStyledAttributes.getInteger(index, this.f8190agtfadlqog);
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static class C0131wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public boolean f8205iobyxmoadg = false;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public int f8208zoijcleaow = 0;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public int f8206ppxfxbqfkf = 0;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public float f8207wkgbmnqykc = 1.0f;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public float f8204eablkybsjg = Float.NaN;

        public void iobyxmoadg(C0131wkgbmnqykc c0131wkgbmnqykc) {
            this.f8205iobyxmoadg = c0131wkgbmnqykc.f8205iobyxmoadg;
            this.f8208zoijcleaow = c0131wkgbmnqykc.f8208zoijcleaow;
            this.f8207wkgbmnqykc = c0131wkgbmnqykc.f8207wkgbmnqykc;
            this.f8204eablkybsjg = c0131wkgbmnqykc.f8204eablkybsjg;
            this.f8206ppxfxbqfkf = c0131wkgbmnqykc.f8206ppxfxbqfkf;
        }

        void zoijcleaow(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nufgyqmvbu.PropertySet);
            this.f8205iobyxmoadg = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i13);
                if (index == nufgyqmvbu.PropertySet_android_alpha) {
                    this.f8207wkgbmnqykc = typedArrayObtainStyledAttributes.getFloat(index, this.f8207wkgbmnqykc);
                } else if (index == nufgyqmvbu.PropertySet_android_visibility) {
                    this.f8208zoijcleaow = typedArrayObtainStyledAttributes.getInt(index, this.f8208zoijcleaow);
                    this.f8208zoijcleaow = wkgbmnqykc.f8144dxjokdxxww[this.f8208zoijcleaow];
                } else if (index == nufgyqmvbu.PropertySet_visibilityMode) {
                    this.f8206ppxfxbqfkf = typedArrayObtainStyledAttributes.getInt(index, this.f8206ppxfxbqfkf);
                } else if (index == nufgyqmvbu.PropertySet_motionProgress) {
                    this.f8204eablkybsjg = typedArrayObtainStyledAttributes.getFloat(index, this.f8204eablkybsjg);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class zoijcleaow {

        /* JADX INFO: renamed from: iyctptxqzt, reason: collision with root package name */
        private static SparseIntArray f8209iyctptxqzt;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public int f8221eablkybsjg;

        /* JADX INFO: renamed from: sflfametgt, reason: collision with root package name */
        public String f8257sflfametgt;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public int f8266wkgbmnqykc;

        /* JADX INFO: renamed from: ydmasvzmpa, reason: collision with root package name */
        public String f8271ydmasvzmpa;

        /* JADX INFO: renamed from: yfnezrywwk, reason: collision with root package name */
        public int[] f8272yfnezrywwk;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public boolean f8228iobyxmoadg = false;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public boolean f8277zoijcleaow = false;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public boolean f8253ppxfxbqfkf = false;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        public int f8224gxszxtbevo = -1;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        public int f8241lqeggnwhkg = -1;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        public float f8245nufgyqmvbu = -1.0f;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        public boolean f8220dxjokdxxww = true;

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        public int f8212btonecajqb = -1;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        public int f8223gtknphoqwx = -1;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        public int f8218draadjrbmk = -1;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        public int f8265wflxmlrfwp = -1;

        /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
        public int f8210agtfadlqog = -1;

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        public int f8247ojitshcjhn = -1;

        /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
        public int f8254rgvfuqvkyq = -1;

        /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
        public int f8263vdvldrhtss = -1;

        /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
        public int f8250oxmwwwfdhm = -1;

        /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
        public int f8237kcexrzcfyt = -1;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public int f8275zdlpuopuiu = -1;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        public int f8273yggfygwlhe = -1;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        public int f8235jyumaefscl = -1;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        public int f8231iwizpuwonk = -1;

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        public int f8215cqumvgiudr = -1;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        public float f8222esjtqupxsv = 0.5f;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        public float f8239lereixgezr = 0.5f;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        public String f8252pmvmpeiblj = null;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        public int f8278zynmafqrjb = -1;

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        public int f8230istkbnxepw = 0;

        /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
        public float f8213cdpycssgdh = 0.0f;

        /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
        public int f8270yadqdtsiqt = -1;

        /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
        public int f8229iozdgvuglv = -1;

        /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
        public int f8240lmojexxdyd = -1;

        /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
        public int f8267wwaezpbzkn = 0;

        /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
        public int f8274ylkuphrtab = 0;

        /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
        public int f8251pkzmftpjix = 0;

        /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
        public int f8225hcddaimhww = 0;

        /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
        public int f8234jpowsppfya = 0;

        /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
        public int f8226hkdspvbjdz = 0;

        /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
        public int f8214cllcsxoeiz = 0;

        /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
        public int f8219dsvhmnatus = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
        public int f8268wypolnanlu = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
        public int f8259stevsuqkhv = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
        public int f8238kegysxyocb = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
        public int f8260tzroggbefp = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
        public int f8242mbcevpiqjq = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
        public int f8244ntlheqmsrt = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
        public float f8261ulzqkzuiru = -1.0f;

        /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
        public float f8258sopmlzcsov = -1.0f;

        /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
        public int f8216crxdokpmqz = 0;

        /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name */
        public int f8233jlmebxxoox = 0;

        /* JADX INFO: renamed from: ribwqtqdhb, reason: collision with root package name */
        public int f8255ribwqtqdhb = 0;

        /* JADX INFO: renamed from: vipkmwdibw, reason: collision with root package name */
        public int f8264vipkmwdibw = 0;

        /* JADX INFO: renamed from: jhduphickx, reason: collision with root package name */
        public int f8232jhduphickx = 0;

        /* JADX INFO: renamed from: ikoacuggdj, reason: collision with root package name */
        public int f8227ikoacuggdj = 0;

        /* JADX INFO: renamed from: okpsazkaxt, reason: collision with root package name */
        public int f8248okpsazkaxt = 0;

        /* JADX INFO: renamed from: jztzpxfvev, reason: collision with root package name */
        public int f8236jztzpxfvev = 0;

        /* JADX INFO: renamed from: xrmfcynszj, reason: collision with root package name */
        public float f8269xrmfcynszj = 1.0f;

        /* JADX INFO: renamed from: metgxyhuhe, reason: collision with root package name */
        public float f8243metgxyhuhe = 1.0f;

        /* JADX INFO: renamed from: rlfsiqarku, reason: collision with root package name */
        public int f8256rlfsiqarku = -1;

        /* JADX INFO: renamed from: czzsidtyhn, reason: collision with root package name */
        public int f8217czzsidtyhn = 0;

        /* JADX INFO: renamed from: uwvvkdfqfp, reason: collision with root package name */
        public int f8262uwvvkdfqfp = -1;

        /* JADX INFO: renamed from: zfvoamnweg, reason: collision with root package name */
        public boolean f8276zfvoamnweg = false;

        /* JADX INFO: renamed from: oipsdeybqn, reason: collision with root package name */
        public boolean f8246oipsdeybqn = false;

        /* JADX INFO: renamed from: bfopjjpdmp, reason: collision with root package name */
        public boolean f8211bfopjjpdmp = true;

        /* JADX INFO: renamed from: opjhrmiecq, reason: collision with root package name */
        public int f8249opjhrmiecq = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f8209iyctptxqzt = sparseIntArray;
            sparseIntArray.append(nufgyqmvbu.Layout_layout_constraintLeft_toLeftOf, 24);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_layout_constraintLeft_toRightOf, 25);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_layout_constraintRight_toLeftOf, 28);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_layout_constraintRight_toRightOf, 29);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_layout_constraintTop_toTopOf, 35);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_layout_constraintTop_toBottomOf, 34);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_layout_constraintBottom_toTopOf, 4);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_layout_constraintBottom_toBottomOf, 3);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_layout_constraintBaseline_toBaselineOf, 1);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_layout_editor_absoluteX, 6);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_layout_editor_absoluteY, 7);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_layout_constraintGuide_begin, 17);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_layout_constraintGuide_end, 18);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_layout_constraintGuide_percent, 19);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_guidelineUseRtl, 90);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_android_orientation, 26);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_layout_constraintStart_toEndOf, 31);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_layout_constraintStart_toStartOf, 32);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_layout_constraintEnd_toStartOf, 10);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_layout_constraintEnd_toEndOf, 9);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_layout_goneMarginLeft, 13);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_layout_goneMarginTop, 16);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_layout_goneMarginRight, 14);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_layout_goneMarginBottom, 11);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_layout_goneMarginStart, 15);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_layout_goneMarginEnd, 12);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_layout_constraintVertical_weight, 38);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_layout_constraintHorizontal_weight, 37);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_layout_constraintHorizontal_chainStyle, 39);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_layout_constraintVertical_chainStyle, 40);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_layout_constraintHorizontal_bias, 20);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_layout_constraintVertical_bias, 36);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_layout_constraintDimensionRatio, 5);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_layout_constraintLeft_creator, 91);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_layout_constraintTop_creator, 91);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_layout_constraintRight_creator, 91);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_layout_constraintBottom_creator, 91);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_layout_constraintBaseline_creator, 91);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_android_layout_marginLeft, 23);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_android_layout_marginRight, 27);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_android_layout_marginStart, 30);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_android_layout_marginEnd, 8);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_android_layout_marginTop, 33);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_android_layout_marginBottom, 2);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_android_layout_width, 22);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_android_layout_height, 21);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_layout_constraintWidth, 41);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_layout_constraintHeight, 42);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_layout_constrainedWidth, 87);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_layout_constrainedHeight, 88);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_layout_wrapBehaviorInParent, 76);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_layout_constraintCircle, 61);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_layout_constraintCircleRadius, 62);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_layout_constraintCircleAngle, 63);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_layout_constraintWidth_percent, 69);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_layout_constraintHeight_percent, 70);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_chainUseRtl, 71);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_barrierDirection, 72);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_barrierMargin, 73);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_constraint_referenced_ids, 74);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_barrierAllowsGoneWidgets, 75);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_layout_constraintWidth_max, 84);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_layout_constraintWidth_min, 86);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_layout_constraintWidth_max, 83);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_layout_constraintHeight_min, 85);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_layout_constraintWidth, 87);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_layout_constraintHeight, 88);
            f8209iyctptxqzt.append(nufgyqmvbu.ConstraintLayout_Layout_layout_constraintTag, 89);
            f8209iyctptxqzt.append(nufgyqmvbu.Layout_guidelineUseRtl, 90);
        }

        public void iobyxmoadg(zoijcleaow zoijcleaowVar) {
            this.f8228iobyxmoadg = zoijcleaowVar.f8228iobyxmoadg;
            this.f8266wkgbmnqykc = zoijcleaowVar.f8266wkgbmnqykc;
            this.f8277zoijcleaow = zoijcleaowVar.f8277zoijcleaow;
            this.f8221eablkybsjg = zoijcleaowVar.f8221eablkybsjg;
            this.f8224gxszxtbevo = zoijcleaowVar.f8224gxszxtbevo;
            this.f8241lqeggnwhkg = zoijcleaowVar.f8241lqeggnwhkg;
            this.f8245nufgyqmvbu = zoijcleaowVar.f8245nufgyqmvbu;
            this.f8220dxjokdxxww = zoijcleaowVar.f8220dxjokdxxww;
            this.f8212btonecajqb = zoijcleaowVar.f8212btonecajqb;
            this.f8223gtknphoqwx = zoijcleaowVar.f8223gtknphoqwx;
            this.f8218draadjrbmk = zoijcleaowVar.f8218draadjrbmk;
            this.f8265wflxmlrfwp = zoijcleaowVar.f8265wflxmlrfwp;
            this.f8210agtfadlqog = zoijcleaowVar.f8210agtfadlqog;
            this.f8247ojitshcjhn = zoijcleaowVar.f8247ojitshcjhn;
            this.f8254rgvfuqvkyq = zoijcleaowVar.f8254rgvfuqvkyq;
            this.f8263vdvldrhtss = zoijcleaowVar.f8263vdvldrhtss;
            this.f8250oxmwwwfdhm = zoijcleaowVar.f8250oxmwwwfdhm;
            this.f8237kcexrzcfyt = zoijcleaowVar.f8237kcexrzcfyt;
            this.f8275zdlpuopuiu = zoijcleaowVar.f8275zdlpuopuiu;
            this.f8273yggfygwlhe = zoijcleaowVar.f8273yggfygwlhe;
            this.f8235jyumaefscl = zoijcleaowVar.f8235jyumaefscl;
            this.f8231iwizpuwonk = zoijcleaowVar.f8231iwizpuwonk;
            this.f8215cqumvgiudr = zoijcleaowVar.f8215cqumvgiudr;
            this.f8222esjtqupxsv = zoijcleaowVar.f8222esjtqupxsv;
            this.f8239lereixgezr = zoijcleaowVar.f8239lereixgezr;
            this.f8252pmvmpeiblj = zoijcleaowVar.f8252pmvmpeiblj;
            this.f8278zynmafqrjb = zoijcleaowVar.f8278zynmafqrjb;
            this.f8230istkbnxepw = zoijcleaowVar.f8230istkbnxepw;
            this.f8213cdpycssgdh = zoijcleaowVar.f8213cdpycssgdh;
            this.f8270yadqdtsiqt = zoijcleaowVar.f8270yadqdtsiqt;
            this.f8229iozdgvuglv = zoijcleaowVar.f8229iozdgvuglv;
            this.f8240lmojexxdyd = zoijcleaowVar.f8240lmojexxdyd;
            this.f8267wwaezpbzkn = zoijcleaowVar.f8267wwaezpbzkn;
            this.f8274ylkuphrtab = zoijcleaowVar.f8274ylkuphrtab;
            this.f8251pkzmftpjix = zoijcleaowVar.f8251pkzmftpjix;
            this.f8225hcddaimhww = zoijcleaowVar.f8225hcddaimhww;
            this.f8234jpowsppfya = zoijcleaowVar.f8234jpowsppfya;
            this.f8226hkdspvbjdz = zoijcleaowVar.f8226hkdspvbjdz;
            this.f8214cllcsxoeiz = zoijcleaowVar.f8214cllcsxoeiz;
            this.f8219dsvhmnatus = zoijcleaowVar.f8219dsvhmnatus;
            this.f8268wypolnanlu = zoijcleaowVar.f8268wypolnanlu;
            this.f8259stevsuqkhv = zoijcleaowVar.f8259stevsuqkhv;
            this.f8238kegysxyocb = zoijcleaowVar.f8238kegysxyocb;
            this.f8260tzroggbefp = zoijcleaowVar.f8260tzroggbefp;
            this.f8242mbcevpiqjq = zoijcleaowVar.f8242mbcevpiqjq;
            this.f8244ntlheqmsrt = zoijcleaowVar.f8244ntlheqmsrt;
            this.f8261ulzqkzuiru = zoijcleaowVar.f8261ulzqkzuiru;
            this.f8258sopmlzcsov = zoijcleaowVar.f8258sopmlzcsov;
            this.f8216crxdokpmqz = zoijcleaowVar.f8216crxdokpmqz;
            this.f8233jlmebxxoox = zoijcleaowVar.f8233jlmebxxoox;
            this.f8255ribwqtqdhb = zoijcleaowVar.f8255ribwqtqdhb;
            this.f8264vipkmwdibw = zoijcleaowVar.f8264vipkmwdibw;
            this.f8232jhduphickx = zoijcleaowVar.f8232jhduphickx;
            this.f8227ikoacuggdj = zoijcleaowVar.f8227ikoacuggdj;
            this.f8248okpsazkaxt = zoijcleaowVar.f8248okpsazkaxt;
            this.f8236jztzpxfvev = zoijcleaowVar.f8236jztzpxfvev;
            this.f8269xrmfcynszj = zoijcleaowVar.f8269xrmfcynszj;
            this.f8243metgxyhuhe = zoijcleaowVar.f8243metgxyhuhe;
            this.f8256rlfsiqarku = zoijcleaowVar.f8256rlfsiqarku;
            this.f8217czzsidtyhn = zoijcleaowVar.f8217czzsidtyhn;
            this.f8262uwvvkdfqfp = zoijcleaowVar.f8262uwvvkdfqfp;
            this.f8257sflfametgt = zoijcleaowVar.f8257sflfametgt;
            int[] iArr = zoijcleaowVar.f8272yfnezrywwk;
            if (iArr == null || zoijcleaowVar.f8271ydmasvzmpa != null) {
                this.f8272yfnezrywwk = null;
            } else {
                this.f8272yfnezrywwk = Arrays.copyOf(iArr, iArr.length);
            }
            this.f8271ydmasvzmpa = zoijcleaowVar.f8271ydmasvzmpa;
            this.f8276zfvoamnweg = zoijcleaowVar.f8276zfvoamnweg;
            this.f8246oipsdeybqn = zoijcleaowVar.f8246oipsdeybqn;
            this.f8211bfopjjpdmp = zoijcleaowVar.f8211bfopjjpdmp;
            this.f8249opjhrmiecq = zoijcleaowVar.f8249opjhrmiecq;
        }

        void zoijcleaow(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nufgyqmvbu.Layout);
            this.f8277zoijcleaow = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i13);
                int i14 = f8209iyctptxqzt.get(index);
                switch (i14) {
                    case 1:
                        this.f8250oxmwwwfdhm = wkgbmnqykc.cdpycssgdh(typedArrayObtainStyledAttributes, index, this.f8250oxmwwwfdhm);
                        break;
                    case 2:
                        this.f8225hcddaimhww = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8225hcddaimhww);
                        break;
                    case 3:
                        this.f8263vdvldrhtss = wkgbmnqykc.cdpycssgdh(typedArrayObtainStyledAttributes, index, this.f8263vdvldrhtss);
                        break;
                    case 4:
                        this.f8254rgvfuqvkyq = wkgbmnqykc.cdpycssgdh(typedArrayObtainStyledAttributes, index, this.f8254rgvfuqvkyq);
                        break;
                    case 5:
                        this.f8252pmvmpeiblj = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.f8270yadqdtsiqt = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f8270yadqdtsiqt);
                        break;
                    case 7:
                        this.f8229iozdgvuglv = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f8229iozdgvuglv);
                        break;
                    case 8:
                        this.f8234jpowsppfya = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8234jpowsppfya);
                        break;
                    case 9:
                        this.f8215cqumvgiudr = wkgbmnqykc.cdpycssgdh(typedArrayObtainStyledAttributes, index, this.f8215cqumvgiudr);
                        break;
                    case 10:
                        this.f8231iwizpuwonk = wkgbmnqykc.cdpycssgdh(typedArrayObtainStyledAttributes, index, this.f8231iwizpuwonk);
                        break;
                    case 11:
                        this.f8238kegysxyocb = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8238kegysxyocb);
                        break;
                    case 12:
                        this.f8260tzroggbefp = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8260tzroggbefp);
                        break;
                    case 13:
                        this.f8219dsvhmnatus = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8219dsvhmnatus);
                        break;
                    case 14:
                        this.f8259stevsuqkhv = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8259stevsuqkhv);
                        break;
                    case 15:
                        this.f8242mbcevpiqjq = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8242mbcevpiqjq);
                        break;
                    case 16:
                        this.f8268wypolnanlu = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8268wypolnanlu);
                        break;
                    case 17:
                        this.f8224gxszxtbevo = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f8224gxszxtbevo);
                        break;
                    case 18:
                        this.f8241lqeggnwhkg = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f8241lqeggnwhkg);
                        break;
                    case 19:
                        this.f8245nufgyqmvbu = typedArrayObtainStyledAttributes.getFloat(index, this.f8245nufgyqmvbu);
                        break;
                    case 20:
                        this.f8222esjtqupxsv = typedArrayObtainStyledAttributes.getFloat(index, this.f8222esjtqupxsv);
                        break;
                    case 21:
                        this.f8221eablkybsjg = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f8221eablkybsjg);
                        break;
                    case 22:
                        this.f8266wkgbmnqykc = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f8266wkgbmnqykc);
                        break;
                    case 23:
                        this.f8267wwaezpbzkn = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8267wwaezpbzkn);
                        break;
                    case 24:
                        this.f8212btonecajqb = wkgbmnqykc.cdpycssgdh(typedArrayObtainStyledAttributes, index, this.f8212btonecajqb);
                        break;
                    case C4007z9.F /* 25 */:
                        this.f8223gtknphoqwx = wkgbmnqykc.cdpycssgdh(typedArrayObtainStyledAttributes, index, this.f8223gtknphoqwx);
                        break;
                    case C4007z9.G /* 26 */:
                        this.f8240lmojexxdyd = typedArrayObtainStyledAttributes.getInt(index, this.f8240lmojexxdyd);
                        break;
                    case 27:
                        this.f8274ylkuphrtab = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8274ylkuphrtab);
                        break;
                    case 28:
                        this.f8218draadjrbmk = wkgbmnqykc.cdpycssgdh(typedArrayObtainStyledAttributes, index, this.f8218draadjrbmk);
                        break;
                    case C4007z9.I /* 29 */:
                        this.f8265wflxmlrfwp = wkgbmnqykc.cdpycssgdh(typedArrayObtainStyledAttributes, index, this.f8265wflxmlrfwp);
                        break;
                    case 30:
                        this.f8226hkdspvbjdz = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8226hkdspvbjdz);
                        break;
                    case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                        this.f8273yggfygwlhe = wkgbmnqykc.cdpycssgdh(typedArrayObtainStyledAttributes, index, this.f8273yggfygwlhe);
                        break;
                    case 32:
                        this.f8235jyumaefscl = wkgbmnqykc.cdpycssgdh(typedArrayObtainStyledAttributes, index, this.f8235jyumaefscl);
                        break;
                    case 33:
                        this.f8251pkzmftpjix = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8251pkzmftpjix);
                        break;
                    case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                        this.f8247ojitshcjhn = wkgbmnqykc.cdpycssgdh(typedArrayObtainStyledAttributes, index, this.f8247ojitshcjhn);
                        break;
                    case C4007z9.J /* 35 */:
                        this.f8210agtfadlqog = wkgbmnqykc.cdpycssgdh(typedArrayObtainStyledAttributes, index, this.f8210agtfadlqog);
                        break;
                    case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                        this.f8239lereixgezr = typedArrayObtainStyledAttributes.getFloat(index, this.f8239lereixgezr);
                        break;
                    case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                        this.f8258sopmlzcsov = typedArrayObtainStyledAttributes.getFloat(index, this.f8258sopmlzcsov);
                        break;
                    case C4007z9.K /* 38 */:
                        this.f8261ulzqkzuiru = typedArrayObtainStyledAttributes.getFloat(index, this.f8261ulzqkzuiru);
                        break;
                    case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        this.f8216crxdokpmqz = typedArrayObtainStyledAttributes.getInt(index, this.f8216crxdokpmqz);
                        break;
                    case 40:
                        this.f8233jlmebxxoox = typedArrayObtainStyledAttributes.getInt(index, this.f8233jlmebxxoox);
                        break;
                    case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                        wkgbmnqykc.yadqdtsiqt(this, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        wkgbmnqykc.yadqdtsiqt(this, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i14) {
                            case 61:
                                this.f8278zynmafqrjb = wkgbmnqykc.cdpycssgdh(typedArrayObtainStyledAttributes, index, this.f8278zynmafqrjb);
                                break;
                            case 62:
                                this.f8230istkbnxepw = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8230istkbnxepw);
                                break;
                            case 63:
                                this.f8213cdpycssgdh = typedArrayObtainStyledAttributes.getFloat(index, this.f8213cdpycssgdh);
                                break;
                            default:
                                switch (i14) {
                                    case 69:
                                        this.f8269xrmfcynszj = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f8243metgxyhuhe = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.f8256rlfsiqarku = typedArrayObtainStyledAttributes.getInt(index, this.f8256rlfsiqarku);
                                        break;
                                    case 73:
                                        this.f8217czzsidtyhn = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8217czzsidtyhn);
                                        break;
                                    case 74:
                                        this.f8271ydmasvzmpa = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f8211bfopjjpdmp = typedArrayObtainStyledAttributes.getBoolean(index, this.f8211bfopjjpdmp);
                                        break;
                                    case 76:
                                        this.f8249opjhrmiecq = typedArrayObtainStyledAttributes.getInt(index, this.f8249opjhrmiecq);
                                        break;
                                    case 77:
                                        this.f8237kcexrzcfyt = wkgbmnqykc.cdpycssgdh(typedArrayObtainStyledAttributes, index, this.f8237kcexrzcfyt);
                                        break;
                                    case 78:
                                        this.f8275zdlpuopuiu = wkgbmnqykc.cdpycssgdh(typedArrayObtainStyledAttributes, index, this.f8275zdlpuopuiu);
                                        break;
                                    case 79:
                                        this.f8244ntlheqmsrt = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8244ntlheqmsrt);
                                        break;
                                    case 80:
                                        this.f8214cllcsxoeiz = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8214cllcsxoeiz);
                                        break;
                                    case 81:
                                        this.f8255ribwqtqdhb = typedArrayObtainStyledAttributes.getInt(index, this.f8255ribwqtqdhb);
                                        break;
                                    case 82:
                                        this.f8264vipkmwdibw = typedArrayObtainStyledAttributes.getInt(index, this.f8264vipkmwdibw);
                                        break;
                                    case 83:
                                        this.f8227ikoacuggdj = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8227ikoacuggdj);
                                        break;
                                    case 84:
                                        this.f8232jhduphickx = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8232jhduphickx);
                                        break;
                                    case 85:
                                        this.f8236jztzpxfvev = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8236jztzpxfvev);
                                        break;
                                    case 86:
                                        this.f8248okpsazkaxt = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8248okpsazkaxt);
                                        break;
                                    case 87:
                                        this.f8276zfvoamnweg = typedArrayObtainStyledAttributes.getBoolean(index, this.f8276zfvoamnweg);
                                        break;
                                    case 88:
                                        this.f8246oipsdeybqn = typedArrayObtainStyledAttributes.getBoolean(index, this.f8246oipsdeybqn);
                                        break;
                                    case 89:
                                        this.f8257sflfametgt = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                                        this.f8220dxjokdxxww = typedArrayObtainStyledAttributes.getBoolean(index, this.f8220dxjokdxxww);
                                        break;
                                    case 91:
                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f8209iyctptxqzt.get(index));
                                        break;
                                    default:
                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f8209iyctptxqzt.get(index));
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_constraintLeft_toLeftOf, 25);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_constraintLeft_toRightOf, 26);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_constraintRight_toLeftOf, 29);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_constraintRight_toRightOf, 30);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_constraintTop_toTopOf, 36);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_constraintTop_toBottomOf, 35);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_constraintBottom_toTopOf, 4);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_constraintBottom_toBottomOf, 3);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_constraintBaseline_toTopOf, 91);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_constraintBaseline_toBottomOf, 92);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_editor_absoluteX, 6);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_editor_absoluteY, 7);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_constraintGuide_begin, 17);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_constraintGuide_end, 18);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_constraintGuide_percent, 19);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_guidelineUseRtl, 99);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_android_orientation, 27);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_constraintStart_toEndOf, 32);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_constraintStart_toStartOf, 33);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_constraintEnd_toStartOf, 10);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_constraintEnd_toEndOf, 9);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_goneMarginLeft, 13);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_goneMarginTop, 16);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_goneMarginRight, 14);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_goneMarginBottom, 11);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_goneMarginStart, 15);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_goneMarginEnd, 12);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_constraintVertical_weight, 40);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_constraintHorizontal_weight, 39);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_constraintHorizontal_chainStyle, 41);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_constraintVertical_chainStyle, 42);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_constraintHorizontal_bias, 20);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_constraintVertical_bias, 37);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_constraintDimensionRatio, 5);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_constraintLeft_creator, 87);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_constraintTop_creator, 87);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_constraintRight_creator, 87);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_constraintBottom_creator, 87);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_constraintBaseline_creator, 87);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_android_layout_marginLeft, 24);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_android_layout_marginRight, 28);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_android_layout_marginStart, 31);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_android_layout_marginEnd, 8);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_android_layout_marginTop, 34);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_android_layout_marginBottom, 2);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_android_layout_width, 23);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_android_layout_height, 21);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_constraintWidth, 95);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_constraintHeight, 96);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_android_visibility, 22);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_android_alpha, 43);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_android_elevation, 44);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_android_rotationX, 45);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_android_rotationY, 46);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_android_rotation, 60);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_android_scaleX, 47);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_android_scaleY, 48);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_android_transformPivotX, 49);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_android_transformPivotY, 50);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_android_translationX, 51);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_android_translationY, 52);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_android_translationZ, 53);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_constraintWidth_default, 54);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_constraintHeight_default, 55);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_constraintWidth_max, 56);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_constraintHeight_max, 57);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_constraintWidth_min, 58);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_constraintHeight_min, 59);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_constraintCircle, 61);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_constraintCircleRadius, 62);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_constraintCircleAngle, 63);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_animateRelativeTo, 64);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_transitionEasing, 65);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_drawPath, 66);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_transitionPathRotate, 67);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_motionStagger, 79);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_android_id, 38);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_motionProgress, 68);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_constraintWidth_percent, 69);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_constraintHeight_percent, 70);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_wrapBehaviorInParent, 97);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_chainUseRtl, 71);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_barrierDirection, 72);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_barrierMargin, 73);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_constraint_referenced_ids, 74);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_barrierAllowsGoneWidgets, 75);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_pathMotionArc, 76);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_constraintTag, 77);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_visibilityMode, 78);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_constrainedWidth, 80);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_layout_constrainedHeight, 81);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_polarRelativeTo, 82);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_transformPivotTarget, 83);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_quantizeMotionSteps, 84);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_quantizeMotionPhase, 85);
        f8143btonecajqb.append(nufgyqmvbu.Constraint_quantizeMotionInterpolator, 86);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_layout_editor_absoluteY, 6);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_layout_editor_absoluteY, 7);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_android_orientation, 27);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_layout_goneMarginLeft, 13);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_layout_goneMarginTop, 16);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_layout_goneMarginRight, 14);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_layout_goneMarginBottom, 11);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_layout_goneMarginStart, 15);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_layout_goneMarginEnd, 12);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_layout_constraintVertical_weight, 40);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_layout_constraintHorizontal_weight, 39);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_layout_constraintHorizontal_chainStyle, 41);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_layout_constraintVertical_chainStyle, 42);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_layout_constraintHorizontal_bias, 20);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_layout_constraintVertical_bias, 37);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_layout_constraintDimensionRatio, 5);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_layout_constraintLeft_creator, 87);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_layout_constraintTop_creator, 87);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_layout_constraintRight_creator, 87);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_layout_constraintBottom_creator, 87);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_layout_constraintBaseline_creator, 87);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_android_layout_marginLeft, 24);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_android_layout_marginRight, 28);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_android_layout_marginStart, 31);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_android_layout_marginEnd, 8);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_android_layout_marginTop, 34);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_android_layout_marginBottom, 2);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_android_layout_width, 23);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_android_layout_height, 21);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_layout_constraintWidth, 95);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_layout_constraintHeight, 96);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_android_visibility, 22);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_android_alpha, 43);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_android_elevation, 44);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_android_rotationX, 45);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_android_rotationY, 46);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_android_rotation, 60);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_android_scaleX, 47);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_android_scaleY, 48);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_android_transformPivotX, 49);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_android_transformPivotY, 50);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_android_translationX, 51);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_android_translationY, 52);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_android_translationZ, 53);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_layout_constraintWidth_default, 54);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_layout_constraintHeight_default, 55);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_layout_constraintWidth_max, 56);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_layout_constraintHeight_max, 57);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_layout_constraintWidth_min, 58);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_layout_constraintHeight_min, 59);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_layout_constraintCircleRadius, 62);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_layout_constraintCircleAngle, 63);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_animateRelativeTo, 64);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_transitionEasing, 65);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_drawPath, 66);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_transitionPathRotate, 67);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_motionStagger, 79);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_android_id, 38);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_motionTarget, 98);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_motionProgress, 68);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_layout_constraintWidth_percent, 69);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_layout_constraintHeight_percent, 70);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_chainUseRtl, 71);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_barrierDirection, 72);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_barrierMargin, 73);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_constraint_referenced_ids, 74);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_barrierAllowsGoneWidgets, 75);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_pathMotionArc, 76);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_layout_constraintTag, 77);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_visibilityMode, 78);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_layout_constrainedWidth, 80);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_layout_constrainedHeight, 81);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_polarRelativeTo, 82);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_transformPivotTarget, 83);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_quantizeMotionSteps, 84);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_quantizeMotionPhase, 85);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_quantizeMotionInterpolator, 86);
        f8145gtknphoqwx.append(nufgyqmvbu.ConstraintOverride_layout_wrapBehaviorInParent, 97);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int cdpycssgdh(TypedArray typedArray, int i13, int i14) {
        int resourceId = typedArray.getResourceId(i13, i14);
        return resourceId == -1 ? typedArray.getInt(i13, -1) : resourceId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void cllcsxoeiz(iobyxmoadg iobyxmoadgVar, int i13, String str) {
        if (i13 == 5) {
            iobyxmoadgVar.f8169eablkybsjg.f8252pmvmpeiblj = str;
            return;
        }
        if (i13 == 65) {
            iobyxmoadgVar.f8175wkgbmnqykc.f8202wkgbmnqykc = str;
            return;
        }
        if (i13 == 74) {
            zoijcleaow zoijcleaowVar = iobyxmoadgVar.f8169eablkybsjg;
            zoijcleaowVar.f8271ydmasvzmpa = str;
            zoijcleaowVar.f8272yfnezrywwk = null;
        } else if (i13 == 77) {
            iobyxmoadgVar.f8169eablkybsjg.f8257sflfametgt = str;
        } else if (i13 != 87) {
            if (i13 != 90) {
                Log.w("ConstraintSet", "Unknown attribute 0x");
            } else {
                iobyxmoadgVar.f8175wkgbmnqykc.f8192draadjrbmk = str;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void dsvhmnatus(iobyxmoadg iobyxmoadgVar, int i13, boolean z13) {
        if (i13 == 44) {
            iobyxmoadgVar.f8170gxszxtbevo.f8166wflxmlrfwp = z13;
            return;
        }
        if (i13 == 75) {
            iobyxmoadgVar.f8169eablkybsjg.f8211bfopjjpdmp = z13;
            return;
        }
        if (i13 != 87) {
            if (i13 == 80) {
                iobyxmoadgVar.f8169eablkybsjg.f8276zfvoamnweg = z13;
            } else if (i13 != 81) {
                Log.w("ConstraintSet", "Unknown attribute 0x");
            } else {
                iobyxmoadgVar.f8169eablkybsjg.f8246oipsdeybqn = z13;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void hkdspvbjdz(iobyxmoadg iobyxmoadgVar, int i13, int i14) {
        if (i13 == 6) {
            iobyxmoadgVar.f8169eablkybsjg.f8270yadqdtsiqt = i14;
        }
        if (i13 == 7) {
            iobyxmoadgVar.f8169eablkybsjg.f8229iozdgvuglv = i14;
            return;
        }
        if (i13 == 8) {
            iobyxmoadgVar.f8169eablkybsjg.f8234jpowsppfya = i14;
            return;
        }
        if (i13 == 27) {
            iobyxmoadgVar.f8169eablkybsjg.f8240lmojexxdyd = i14;
            return;
        }
        if (i13 == 28) {
            iobyxmoadgVar.f8169eablkybsjg.f8274ylkuphrtab = i14;
            return;
        }
        if (i13 == 41) {
            iobyxmoadgVar.f8169eablkybsjg.f8216crxdokpmqz = i14;
            return;
        }
        if (i13 == 42) {
            iobyxmoadgVar.f8169eablkybsjg.f8233jlmebxxoox = i14;
            return;
        }
        if (i13 == 61) {
            iobyxmoadgVar.f8169eablkybsjg.f8278zynmafqrjb = i14;
            return;
        }
        if (i13 == 62) {
            iobyxmoadgVar.f8169eablkybsjg.f8230istkbnxepw = i14;
            return;
        }
        if (i13 == 72) {
            iobyxmoadgVar.f8169eablkybsjg.f8256rlfsiqarku = i14;
            return;
        }
        if (i13 == 73) {
            iobyxmoadgVar.f8169eablkybsjg.f8217czzsidtyhn = i14;
            return;
        }
        switch (i13) {
            case 2:
                iobyxmoadgVar.f8169eablkybsjg.f8225hcddaimhww = i14;
                break;
            case 11:
                iobyxmoadgVar.f8169eablkybsjg.f8238kegysxyocb = i14;
                break;
            case 12:
                iobyxmoadgVar.f8169eablkybsjg.f8260tzroggbefp = i14;
                break;
            case 13:
                iobyxmoadgVar.f8169eablkybsjg.f8219dsvhmnatus = i14;
                break;
            case 14:
                iobyxmoadgVar.f8169eablkybsjg.f8259stevsuqkhv = i14;
                break;
            case 15:
                iobyxmoadgVar.f8169eablkybsjg.f8242mbcevpiqjq = i14;
                break;
            case 16:
                iobyxmoadgVar.f8169eablkybsjg.f8268wypolnanlu = i14;
                break;
            case 17:
                iobyxmoadgVar.f8169eablkybsjg.f8224gxszxtbevo = i14;
                break;
            case 18:
                iobyxmoadgVar.f8169eablkybsjg.f8241lqeggnwhkg = i14;
                break;
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                iobyxmoadgVar.f8169eablkybsjg.f8226hkdspvbjdz = i14;
                break;
            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                iobyxmoadgVar.f8169eablkybsjg.f8251pkzmftpjix = i14;
                break;
            case C4007z9.K /* 38 */:
                iobyxmoadgVar.f8171iobyxmoadg = i14;
                break;
            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                iobyxmoadgVar.f8175wkgbmnqykc.f8203zoijcleaow = i14;
                break;
            case 66:
                iobyxmoadgVar.f8175wkgbmnqykc.f8196gxszxtbevo = i14;
                break;
            case 76:
                iobyxmoadgVar.f8175wkgbmnqykc.f8194eablkybsjg = i14;
                break;
            case 78:
                iobyxmoadgVar.f8174ppxfxbqfkf.f8206ppxfxbqfkf = i14;
                break;
            case 93:
                iobyxmoadgVar.f8169eablkybsjg.f8214cllcsxoeiz = i14;
                break;
            case 94:
                iobyxmoadgVar.f8169eablkybsjg.f8244ntlheqmsrt = i14;
                break;
            case 97:
                iobyxmoadgVar.f8169eablkybsjg.f8249opjhrmiecq = i14;
                break;
            default:
                switch (i13) {
                    case 21:
                        iobyxmoadgVar.f8169eablkybsjg.f8221eablkybsjg = i14;
                        break;
                    case 22:
                        iobyxmoadgVar.f8174ppxfxbqfkf.f8208zoijcleaow = i14;
                        break;
                    case 23:
                        iobyxmoadgVar.f8169eablkybsjg.f8266wkgbmnqykc = i14;
                        break;
                    case 24:
                        iobyxmoadgVar.f8169eablkybsjg.f8267wwaezpbzkn = i14;
                        break;
                    default:
                        switch (i13) {
                            case 54:
                                iobyxmoadgVar.f8169eablkybsjg.f8255ribwqtqdhb = i14;
                                break;
                            case 55:
                                iobyxmoadgVar.f8169eablkybsjg.f8264vipkmwdibw = i14;
                                break;
                            case 56:
                                iobyxmoadgVar.f8169eablkybsjg.f8232jhduphickx = i14;
                                break;
                            case 57:
                                iobyxmoadgVar.f8169eablkybsjg.f8227ikoacuggdj = i14;
                                break;
                            case 58:
                                iobyxmoadgVar.f8169eablkybsjg.f8248okpsazkaxt = i14;
                                break;
                            case 59:
                                iobyxmoadgVar.f8169eablkybsjg.f8236jztzpxfvev = i14;
                                break;
                            default:
                                switch (i13) {
                                    case 82:
                                        iobyxmoadgVar.f8175wkgbmnqykc.f8200ppxfxbqfkf = i14;
                                        break;
                                    case 83:
                                        iobyxmoadgVar.f8170gxszxtbevo.f8158dxjokdxxww = i14;
                                        break;
                                    case 84:
                                        iobyxmoadgVar.f8175wkgbmnqykc.f8195gtknphoqwx = i14;
                                        break;
                                    default:
                                        switch (i13) {
                                            case 87:
                                                break;
                                            case 88:
                                                iobyxmoadgVar.f8175wkgbmnqykc.f8201wflxmlrfwp = i14;
                                                break;
                                            case 89:
                                                iobyxmoadgVar.f8175wkgbmnqykc.f8190agtfadlqog = i14;
                                                break;
                                            default:
                                                Log.w("ConstraintSet", "Unknown attribute 0x");
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
                break;
        }
    }

    static void iozdgvuglv(Object obj, String str, int i13) {
        if (str == null) {
            return;
        }
        int iIndexOf = str.indexOf(61);
        int length = str.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = str.substring(0, iIndexOf);
        String strSubstring2 = str.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof ConstraintLayout.zoijcleaow) {
                    ConstraintLayout.zoijcleaow zoijcleaowVar = (ConstraintLayout.zoijcleaow) obj;
                    if (i13 == 0) {
                        ((ViewGroup.MarginLayoutParams) zoijcleaowVar).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) zoijcleaowVar).height = 0;
                    }
                    lmojexxdyd(zoijcleaowVar, strTrim2);
                    return;
                }
                if (obj instanceof zoijcleaow) {
                    ((zoijcleaow) obj).f8252pmvmpeiblj = strTrim2;
                    return;
                } else {
                    if (obj instanceof iobyxmoadg.C0130iobyxmoadg) {
                        ((iobyxmoadg.C0130iobyxmoadg) obj).ppxfxbqfkf(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f13 = Float.parseFloat(strTrim2);
                    if (obj instanceof ConstraintLayout.zoijcleaow) {
                        ConstraintLayout.zoijcleaow zoijcleaowVar2 = (ConstraintLayout.zoijcleaow) obj;
                        if (i13 == 0) {
                            ((ViewGroup.MarginLayoutParams) zoijcleaowVar2).width = 0;
                            zoijcleaowVar2.f8027jpowsppfya = f13;
                        } else {
                            ((ViewGroup.MarginLayoutParams) zoijcleaowVar2).height = 0;
                            zoijcleaowVar2.f8018hkdspvbjdz = f13;
                        }
                    } else if (obj instanceof zoijcleaow) {
                        zoijcleaow zoijcleaowVar3 = (zoijcleaow) obj;
                        if (i13 == 0) {
                            zoijcleaowVar3.f8266wkgbmnqykc = 0;
                            zoijcleaowVar3.f8258sopmlzcsov = f13;
                        } else {
                            zoijcleaowVar3.f8221eablkybsjg = 0;
                            zoijcleaowVar3.f8261ulzqkzuiru = f13;
                        }
                    } else if (obj instanceof iobyxmoadg.C0130iobyxmoadg) {
                        iobyxmoadg.C0130iobyxmoadg c0130iobyxmoadg = (iobyxmoadg.C0130iobyxmoadg) obj;
                        if (i13 == 0) {
                            c0130iobyxmoadg.zoijcleaow(23, 0);
                            c0130iobyxmoadg.iobyxmoadg(39, f13);
                        } else {
                            c0130iobyxmoadg.zoijcleaow(21, 0);
                            c0130iobyxmoadg.iobyxmoadg(40, f13);
                        }
                    }
                } else {
                    if (!"parent".equalsIgnoreCase(strTrim)) {
                        return;
                    }
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof ConstraintLayout.zoijcleaow) {
                        ConstraintLayout.zoijcleaow zoijcleaowVar4 = (ConstraintLayout.zoijcleaow) obj;
                        if (i13 == 0) {
                            ((ViewGroup.MarginLayoutParams) zoijcleaowVar4).width = 0;
                            zoijcleaowVar4.f8057ulzqkzuiru = fMax;
                            zoijcleaowVar4.f8065wypolnanlu = 2;
                        } else {
                            ((ViewGroup.MarginLayoutParams) zoijcleaowVar4).height = 0;
                            zoijcleaowVar4.f8053sopmlzcsov = fMax;
                            zoijcleaowVar4.f8054stevsuqkhv = 2;
                        }
                    } else if (obj instanceof zoijcleaow) {
                        zoijcleaow zoijcleaowVar5 = (zoijcleaow) obj;
                        if (i13 == 0) {
                            zoijcleaowVar5.f8266wkgbmnqykc = 0;
                            zoijcleaowVar5.f8269xrmfcynszj = fMax;
                            zoijcleaowVar5.f8255ribwqtqdhb = 2;
                        } else {
                            zoijcleaowVar5.f8221eablkybsjg = 0;
                            zoijcleaowVar5.f8243metgxyhuhe = fMax;
                            zoijcleaowVar5.f8264vipkmwdibw = 2;
                        }
                    } else if (obj instanceof iobyxmoadg.C0130iobyxmoadg) {
                        iobyxmoadg.C0130iobyxmoadg c0130iobyxmoadg2 = (iobyxmoadg.C0130iobyxmoadg) obj;
                        if (i13 == 0) {
                            c0130iobyxmoadg2.zoijcleaow(23, 0);
                            c0130iobyxmoadg2.zoijcleaow(54, 2);
                        } else {
                            c0130iobyxmoadg2.zoijcleaow(21, 0);
                            c0130iobyxmoadg2.zoijcleaow(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void jpowsppfya(iobyxmoadg iobyxmoadgVar, int i13, float f13) {
        if (i13 == 19) {
            iobyxmoadgVar.f8169eablkybsjg.f8245nufgyqmvbu = f13;
        }
        if (i13 == 20) {
            iobyxmoadgVar.f8169eablkybsjg.f8222esjtqupxsv = f13;
            return;
        }
        if (i13 == 37) {
            iobyxmoadgVar.f8169eablkybsjg.f8239lereixgezr = f13;
            return;
        }
        if (i13 == 60) {
            iobyxmoadgVar.f8170gxszxtbevo.f8168zoijcleaow = f13;
            return;
        }
        if (i13 == 63) {
            iobyxmoadgVar.f8169eablkybsjg.f8213cdpycssgdh = f13;
            return;
        }
        if (i13 == 79) {
            iobyxmoadgVar.f8175wkgbmnqykc.f8198lqeggnwhkg = f13;
            return;
        }
        if (i13 == 85) {
            iobyxmoadgVar.f8175wkgbmnqykc.f8191btonecajqb = f13;
            return;
        }
        if (i13 != 87) {
            if (i13 == 39) {
                iobyxmoadgVar.f8169eablkybsjg.f8258sopmlzcsov = f13;
                return;
            }
            if (i13 == 40) {
                iobyxmoadgVar.f8169eablkybsjg.f8261ulzqkzuiru = f13;
                return;
            }
            switch (i13) {
                case 43:
                    iobyxmoadgVar.f8174ppxfxbqfkf.f8207wkgbmnqykc = f13;
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    eablkybsjg eablkybsjgVar = iobyxmoadgVar.f8170gxszxtbevo;
                    eablkybsjgVar.f8155agtfadlqog = f13;
                    eablkybsjgVar.f8166wflxmlrfwp = true;
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    iobyxmoadgVar.f8170gxszxtbevo.f8165ppxfxbqfkf = f13;
                    break;
                case 46:
                    iobyxmoadgVar.f8170gxszxtbevo.f8167wkgbmnqykc = f13;
                    break;
                case 47:
                    iobyxmoadgVar.f8170gxszxtbevo.f8159eablkybsjg = f13;
                    break;
                case 48:
                    iobyxmoadgVar.f8170gxszxtbevo.f8161gxszxtbevo = f13;
                    break;
                case 49:
                    iobyxmoadgVar.f8170gxszxtbevo.f8163lqeggnwhkg = f13;
                    break;
                case 50:
                    iobyxmoadgVar.f8170gxszxtbevo.f8164nufgyqmvbu = f13;
                    break;
                case 51:
                    iobyxmoadgVar.f8170gxszxtbevo.f8156btonecajqb = f13;
                    break;
                case 52:
                    iobyxmoadgVar.f8170gxszxtbevo.f8160gtknphoqwx = f13;
                    break;
                case 53:
                    iobyxmoadgVar.f8170gxszxtbevo.f8157draadjrbmk = f13;
                    break;
                default:
                    switch (i13) {
                        case 67:
                            iobyxmoadgVar.f8175wkgbmnqykc.f8193dxjokdxxww = f13;
                            break;
                        case 68:
                            iobyxmoadgVar.f8174ppxfxbqfkf.f8204eablkybsjg = f13;
                            break;
                        case 69:
                            iobyxmoadgVar.f8169eablkybsjg.f8269xrmfcynszj = f13;
                            break;
                        case 70:
                            iobyxmoadgVar.f8169eablkybsjg.f8243metgxyhuhe = f13;
                            break;
                        default:
                            Log.w("ConstraintSet", "Unknown attribute 0x");
                            break;
                    }
                    break;
            }
        }
    }

    private iobyxmoadg kcexrzcfyt(Context context, AttributeSet attributeSet, boolean z13) {
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z13 ? nufgyqmvbu.ConstraintOverride : nufgyqmvbu.Constraint);
        wwaezpbzkn(iobyxmoadgVar, typedArrayObtainStyledAttributes, z13);
        typedArrayObtainStyledAttributes.recycle();
        return iobyxmoadgVar;
    }

    static void lmojexxdyd(ConstraintLayout.zoijcleaow zoijcleaowVar, String str) {
        float fAbs = Float.NaN;
        int i13 = -1;
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i14 = 0;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase("W")) {
                    i13 = 0;
                } else if (strSubstring.equalsIgnoreCase("H")) {
                    i13 = 1;
                }
                i14 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i14);
                    if (strSubstring2.length() > 0) {
                        fAbs = Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i14, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f13 = Float.parseFloat(strSubstring3);
                        float f14 = Float.parseFloat(strSubstring4);
                        if (f13 > 0.0f && f14 > 0.0f) {
                            fAbs = i13 == 1 ? Math.abs(f14 / f13) : Math.abs(f13 / f14);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        zoijcleaowVar.f8071ylkuphrtab = str;
        zoijcleaowVar.f8046pkzmftpjix = fAbs;
        zoijcleaowVar.f8017hcddaimhww = i13;
    }

    private int[] oxmwwwfdhm(View view, String str) {
        int iIntValue;
        Object designInformation;
        String[] strArrSplit = str.split(StringUtils.COMMA);
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i13 = 0;
        int i14 = 0;
        while (i13 < strArrSplit.length) {
            String strTrim = strArrSplit[i13].trim();
            try {
                iIntValue = lqeggnwhkg.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) view.getParent()).getDesignInformation(0, strTrim)) != null && (designInformation instanceof Integer)) {
                iIntValue = ((Integer) designInformation).intValue();
            }
            iArr[i14] = iIntValue;
            i13++;
            i14++;
        }
        return i14 != strArrSplit.length ? Arrays.copyOf(iArr, i14) : iArr;
    }

    public static iobyxmoadg wflxmlrfwp(Context context, XmlPullParser xmlPullParser) {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSetAsAttributeSet, nufgyqmvbu.ConstraintOverride);
        ylkuphrtab(iobyxmoadgVar, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return iobyxmoadgVar;
    }

    private void wwaezpbzkn(iobyxmoadg iobyxmoadgVar, TypedArray typedArray, boolean z13) {
        if (z13) {
            ylkuphrtab(iobyxmoadgVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i13 = 0; i13 < indexCount; i13++) {
            int index = typedArray.getIndex(i13);
            if (index != nufgyqmvbu.Constraint_android_id && nufgyqmvbu.Constraint_android_layout_marginStart != index && nufgyqmvbu.Constraint_android_layout_marginEnd != index) {
                iobyxmoadgVar.f8175wkgbmnqykc.f8197iobyxmoadg = true;
                iobyxmoadgVar.f8169eablkybsjg.f8277zoijcleaow = true;
                iobyxmoadgVar.f8174ppxfxbqfkf.f8205iobyxmoadg = true;
                iobyxmoadgVar.f8170gxszxtbevo.f8162iobyxmoadg = true;
            }
            switch (f8143btonecajqb.get(index)) {
                case 1:
                    zoijcleaow zoijcleaowVar = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar.f8250oxmwwwfdhm = cdpycssgdh(typedArray, index, zoijcleaowVar.f8250oxmwwwfdhm);
                    break;
                case 2:
                    zoijcleaow zoijcleaowVar2 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar2.f8225hcddaimhww = typedArray.getDimensionPixelSize(index, zoijcleaowVar2.f8225hcddaimhww);
                    break;
                case 3:
                    zoijcleaow zoijcleaowVar3 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar3.f8263vdvldrhtss = cdpycssgdh(typedArray, index, zoijcleaowVar3.f8263vdvldrhtss);
                    break;
                case 4:
                    zoijcleaow zoijcleaowVar4 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar4.f8254rgvfuqvkyq = cdpycssgdh(typedArray, index, zoijcleaowVar4.f8254rgvfuqvkyq);
                    break;
                case 5:
                    iobyxmoadgVar.f8169eablkybsjg.f8252pmvmpeiblj = typedArray.getString(index);
                    break;
                case 6:
                    zoijcleaow zoijcleaowVar5 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar5.f8270yadqdtsiqt = typedArray.getDimensionPixelOffset(index, zoijcleaowVar5.f8270yadqdtsiqt);
                    break;
                case 7:
                    zoijcleaow zoijcleaowVar6 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar6.f8229iozdgvuglv = typedArray.getDimensionPixelOffset(index, zoijcleaowVar6.f8229iozdgvuglv);
                    break;
                case 8:
                    zoijcleaow zoijcleaowVar7 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar7.f8234jpowsppfya = typedArray.getDimensionPixelSize(index, zoijcleaowVar7.f8234jpowsppfya);
                    break;
                case 9:
                    zoijcleaow zoijcleaowVar8 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar8.f8215cqumvgiudr = cdpycssgdh(typedArray, index, zoijcleaowVar8.f8215cqumvgiudr);
                    break;
                case 10:
                    zoijcleaow zoijcleaowVar9 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar9.f8231iwizpuwonk = cdpycssgdh(typedArray, index, zoijcleaowVar9.f8231iwizpuwonk);
                    break;
                case 11:
                    zoijcleaow zoijcleaowVar10 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar10.f8238kegysxyocb = typedArray.getDimensionPixelSize(index, zoijcleaowVar10.f8238kegysxyocb);
                    break;
                case 12:
                    zoijcleaow zoijcleaowVar11 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar11.f8260tzroggbefp = typedArray.getDimensionPixelSize(index, zoijcleaowVar11.f8260tzroggbefp);
                    break;
                case 13:
                    zoijcleaow zoijcleaowVar12 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar12.f8219dsvhmnatus = typedArray.getDimensionPixelSize(index, zoijcleaowVar12.f8219dsvhmnatus);
                    break;
                case 14:
                    zoijcleaow zoijcleaowVar13 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar13.f8259stevsuqkhv = typedArray.getDimensionPixelSize(index, zoijcleaowVar13.f8259stevsuqkhv);
                    break;
                case 15:
                    zoijcleaow zoijcleaowVar14 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar14.f8242mbcevpiqjq = typedArray.getDimensionPixelSize(index, zoijcleaowVar14.f8242mbcevpiqjq);
                    break;
                case 16:
                    zoijcleaow zoijcleaowVar15 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar15.f8268wypolnanlu = typedArray.getDimensionPixelSize(index, zoijcleaowVar15.f8268wypolnanlu);
                    break;
                case 17:
                    zoijcleaow zoijcleaowVar16 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar16.f8224gxszxtbevo = typedArray.getDimensionPixelOffset(index, zoijcleaowVar16.f8224gxszxtbevo);
                    break;
                case 18:
                    zoijcleaow zoijcleaowVar17 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar17.f8241lqeggnwhkg = typedArray.getDimensionPixelOffset(index, zoijcleaowVar17.f8241lqeggnwhkg);
                    break;
                case 19:
                    zoijcleaow zoijcleaowVar18 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar18.f8245nufgyqmvbu = typedArray.getFloat(index, zoijcleaowVar18.f8245nufgyqmvbu);
                    break;
                case 20:
                    zoijcleaow zoijcleaowVar19 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar19.f8222esjtqupxsv = typedArray.getFloat(index, zoijcleaowVar19.f8222esjtqupxsv);
                    break;
                case 21:
                    zoijcleaow zoijcleaowVar20 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar20.f8221eablkybsjg = typedArray.getLayoutDimension(index, zoijcleaowVar20.f8221eablkybsjg);
                    break;
                case 22:
                    C0131wkgbmnqykc c0131wkgbmnqykc = iobyxmoadgVar.f8174ppxfxbqfkf;
                    c0131wkgbmnqykc.f8208zoijcleaow = typedArray.getInt(index, c0131wkgbmnqykc.f8208zoijcleaow);
                    C0131wkgbmnqykc c0131wkgbmnqykc2 = iobyxmoadgVar.f8174ppxfxbqfkf;
                    c0131wkgbmnqykc2.f8208zoijcleaow = f8144dxjokdxxww[c0131wkgbmnqykc2.f8208zoijcleaow];
                    break;
                case 23:
                    zoijcleaow zoijcleaowVar21 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar21.f8266wkgbmnqykc = typedArray.getLayoutDimension(index, zoijcleaowVar21.f8266wkgbmnqykc);
                    break;
                case 24:
                    zoijcleaow zoijcleaowVar22 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar22.f8267wwaezpbzkn = typedArray.getDimensionPixelSize(index, zoijcleaowVar22.f8267wwaezpbzkn);
                    break;
                case C4007z9.F /* 25 */:
                    zoijcleaow zoijcleaowVar23 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar23.f8212btonecajqb = cdpycssgdh(typedArray, index, zoijcleaowVar23.f8212btonecajqb);
                    break;
                case C4007z9.G /* 26 */:
                    zoijcleaow zoijcleaowVar24 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar24.f8223gtknphoqwx = cdpycssgdh(typedArray, index, zoijcleaowVar24.f8223gtknphoqwx);
                    break;
                case 27:
                    zoijcleaow zoijcleaowVar25 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar25.f8240lmojexxdyd = typedArray.getInt(index, zoijcleaowVar25.f8240lmojexxdyd);
                    break;
                case 28:
                    zoijcleaow zoijcleaowVar26 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar26.f8274ylkuphrtab = typedArray.getDimensionPixelSize(index, zoijcleaowVar26.f8274ylkuphrtab);
                    break;
                case C4007z9.I /* 29 */:
                    zoijcleaow zoijcleaowVar27 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar27.f8218draadjrbmk = cdpycssgdh(typedArray, index, zoijcleaowVar27.f8218draadjrbmk);
                    break;
                case 30:
                    zoijcleaow zoijcleaowVar28 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar28.f8265wflxmlrfwp = cdpycssgdh(typedArray, index, zoijcleaowVar28.f8265wflxmlrfwp);
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    zoijcleaow zoijcleaowVar29 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar29.f8226hkdspvbjdz = typedArray.getDimensionPixelSize(index, zoijcleaowVar29.f8226hkdspvbjdz);
                    break;
                case 32:
                    zoijcleaow zoijcleaowVar30 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar30.f8273yggfygwlhe = cdpycssgdh(typedArray, index, zoijcleaowVar30.f8273yggfygwlhe);
                    break;
                case 33:
                    zoijcleaow zoijcleaowVar31 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar31.f8235jyumaefscl = cdpycssgdh(typedArray, index, zoijcleaowVar31.f8235jyumaefscl);
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    zoijcleaow zoijcleaowVar32 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar32.f8251pkzmftpjix = typedArray.getDimensionPixelSize(index, zoijcleaowVar32.f8251pkzmftpjix);
                    break;
                case C4007z9.J /* 35 */:
                    zoijcleaow zoijcleaowVar33 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar33.f8247ojitshcjhn = cdpycssgdh(typedArray, index, zoijcleaowVar33.f8247ojitshcjhn);
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    zoijcleaow zoijcleaowVar34 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar34.f8210agtfadlqog = cdpycssgdh(typedArray, index, zoijcleaowVar34.f8210agtfadlqog);
                    break;
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    zoijcleaow zoijcleaowVar35 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar35.f8239lereixgezr = typedArray.getFloat(index, zoijcleaowVar35.f8239lereixgezr);
                    break;
                case C4007z9.K /* 38 */:
                    iobyxmoadgVar.f8171iobyxmoadg = typedArray.getResourceId(index, iobyxmoadgVar.f8171iobyxmoadg);
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    zoijcleaow zoijcleaowVar36 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar36.f8258sopmlzcsov = typedArray.getFloat(index, zoijcleaowVar36.f8258sopmlzcsov);
                    break;
                case 40:
                    zoijcleaow zoijcleaowVar37 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar37.f8261ulzqkzuiru = typedArray.getFloat(index, zoijcleaowVar37.f8261ulzqkzuiru);
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    zoijcleaow zoijcleaowVar38 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar38.f8216crxdokpmqz = typedArray.getInt(index, zoijcleaowVar38.f8216crxdokpmqz);
                    break;
                case 42:
                    zoijcleaow zoijcleaowVar39 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar39.f8233jlmebxxoox = typedArray.getInt(index, zoijcleaowVar39.f8233jlmebxxoox);
                    break;
                case 43:
                    C0131wkgbmnqykc c0131wkgbmnqykc3 = iobyxmoadgVar.f8174ppxfxbqfkf;
                    c0131wkgbmnqykc3.f8207wkgbmnqykc = typedArray.getFloat(index, c0131wkgbmnqykc3.f8207wkgbmnqykc);
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    eablkybsjg eablkybsjgVar = iobyxmoadgVar.f8170gxszxtbevo;
                    eablkybsjgVar.f8166wflxmlrfwp = true;
                    eablkybsjgVar.f8155agtfadlqog = typedArray.getDimension(index, eablkybsjgVar.f8155agtfadlqog);
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    eablkybsjg eablkybsjgVar2 = iobyxmoadgVar.f8170gxszxtbevo;
                    eablkybsjgVar2.f8165ppxfxbqfkf = typedArray.getFloat(index, eablkybsjgVar2.f8165ppxfxbqfkf);
                    break;
                case 46:
                    eablkybsjg eablkybsjgVar3 = iobyxmoadgVar.f8170gxszxtbevo;
                    eablkybsjgVar3.f8167wkgbmnqykc = typedArray.getFloat(index, eablkybsjgVar3.f8167wkgbmnqykc);
                    break;
                case 47:
                    eablkybsjg eablkybsjgVar4 = iobyxmoadgVar.f8170gxszxtbevo;
                    eablkybsjgVar4.f8159eablkybsjg = typedArray.getFloat(index, eablkybsjgVar4.f8159eablkybsjg);
                    break;
                case 48:
                    eablkybsjg eablkybsjgVar5 = iobyxmoadgVar.f8170gxszxtbevo;
                    eablkybsjgVar5.f8161gxszxtbevo = typedArray.getFloat(index, eablkybsjgVar5.f8161gxszxtbevo);
                    break;
                case 49:
                    eablkybsjg eablkybsjgVar6 = iobyxmoadgVar.f8170gxszxtbevo;
                    eablkybsjgVar6.f8163lqeggnwhkg = typedArray.getDimension(index, eablkybsjgVar6.f8163lqeggnwhkg);
                    break;
                case 50:
                    eablkybsjg eablkybsjgVar7 = iobyxmoadgVar.f8170gxszxtbevo;
                    eablkybsjgVar7.f8164nufgyqmvbu = typedArray.getDimension(index, eablkybsjgVar7.f8164nufgyqmvbu);
                    break;
                case 51:
                    eablkybsjg eablkybsjgVar8 = iobyxmoadgVar.f8170gxszxtbevo;
                    eablkybsjgVar8.f8156btonecajqb = typedArray.getDimension(index, eablkybsjgVar8.f8156btonecajqb);
                    break;
                case 52:
                    eablkybsjg eablkybsjgVar9 = iobyxmoadgVar.f8170gxszxtbevo;
                    eablkybsjgVar9.f8160gtknphoqwx = typedArray.getDimension(index, eablkybsjgVar9.f8160gtknphoqwx);
                    break;
                case 53:
                    eablkybsjg eablkybsjgVar10 = iobyxmoadgVar.f8170gxszxtbevo;
                    eablkybsjgVar10.f8157draadjrbmk = typedArray.getDimension(index, eablkybsjgVar10.f8157draadjrbmk);
                    break;
                case 54:
                    zoijcleaow zoijcleaowVar40 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar40.f8255ribwqtqdhb = typedArray.getInt(index, zoijcleaowVar40.f8255ribwqtqdhb);
                    break;
                case 55:
                    zoijcleaow zoijcleaowVar41 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar41.f8264vipkmwdibw = typedArray.getInt(index, zoijcleaowVar41.f8264vipkmwdibw);
                    break;
                case 56:
                    zoijcleaow zoijcleaowVar42 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar42.f8232jhduphickx = typedArray.getDimensionPixelSize(index, zoijcleaowVar42.f8232jhduphickx);
                    break;
                case 57:
                    zoijcleaow zoijcleaowVar43 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar43.f8227ikoacuggdj = typedArray.getDimensionPixelSize(index, zoijcleaowVar43.f8227ikoacuggdj);
                    break;
                case 58:
                    zoijcleaow zoijcleaowVar44 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar44.f8248okpsazkaxt = typedArray.getDimensionPixelSize(index, zoijcleaowVar44.f8248okpsazkaxt);
                    break;
                case 59:
                    zoijcleaow zoijcleaowVar45 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar45.f8236jztzpxfvev = typedArray.getDimensionPixelSize(index, zoijcleaowVar45.f8236jztzpxfvev);
                    break;
                case 60:
                    eablkybsjg eablkybsjgVar11 = iobyxmoadgVar.f8170gxszxtbevo;
                    eablkybsjgVar11.f8168zoijcleaow = typedArray.getFloat(index, eablkybsjgVar11.f8168zoijcleaow);
                    break;
                case 61:
                    zoijcleaow zoijcleaowVar46 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar46.f8278zynmafqrjb = cdpycssgdh(typedArray, index, zoijcleaowVar46.f8278zynmafqrjb);
                    break;
                case 62:
                    zoijcleaow zoijcleaowVar47 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar47.f8230istkbnxepw = typedArray.getDimensionPixelSize(index, zoijcleaowVar47.f8230istkbnxepw);
                    break;
                case 63:
                    zoijcleaow zoijcleaowVar48 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar48.f8213cdpycssgdh = typedArray.getFloat(index, zoijcleaowVar48.f8213cdpycssgdh);
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    ppxfxbqfkf ppxfxbqfkfVar = iobyxmoadgVar.f8175wkgbmnqykc;
                    ppxfxbqfkfVar.f8203zoijcleaow = cdpycssgdh(typedArray, index, ppxfxbqfkfVar.f8203zoijcleaow);
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (typedArray.peekValue(index).type == 3) {
                        iobyxmoadgVar.f8175wkgbmnqykc.f8202wkgbmnqykc = typedArray.getString(index);
                    } else {
                        iobyxmoadgVar.f8175wkgbmnqykc.f8202wkgbmnqykc = a1.ppxfxbqfkf.f259ppxfxbqfkf[typedArray.getInteger(index, 0)];
                    }
                    break;
                case 66:
                    iobyxmoadgVar.f8175wkgbmnqykc.f8196gxszxtbevo = typedArray.getInt(index, 0);
                    break;
                case 67:
                    ppxfxbqfkf ppxfxbqfkfVar2 = iobyxmoadgVar.f8175wkgbmnqykc;
                    ppxfxbqfkfVar2.f8193dxjokdxxww = typedArray.getFloat(index, ppxfxbqfkfVar2.f8193dxjokdxxww);
                    break;
                case 68:
                    C0131wkgbmnqykc c0131wkgbmnqykc4 = iobyxmoadgVar.f8174ppxfxbqfkf;
                    c0131wkgbmnqykc4.f8204eablkybsjg = typedArray.getFloat(index, c0131wkgbmnqykc4.f8204eablkybsjg);
                    break;
                case 69:
                    iobyxmoadgVar.f8169eablkybsjg.f8269xrmfcynszj = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    iobyxmoadgVar.f8169eablkybsjg.f8243metgxyhuhe = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    zoijcleaow zoijcleaowVar49 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar49.f8256rlfsiqarku = typedArray.getInt(index, zoijcleaowVar49.f8256rlfsiqarku);
                    break;
                case 73:
                    zoijcleaow zoijcleaowVar50 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar50.f8217czzsidtyhn = typedArray.getDimensionPixelSize(index, zoijcleaowVar50.f8217czzsidtyhn);
                    break;
                case 74:
                    iobyxmoadgVar.f8169eablkybsjg.f8271ydmasvzmpa = typedArray.getString(index);
                    break;
                case 75:
                    zoijcleaow zoijcleaowVar51 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar51.f8211bfopjjpdmp = typedArray.getBoolean(index, zoijcleaowVar51.f8211bfopjjpdmp);
                    break;
                case 76:
                    ppxfxbqfkf ppxfxbqfkfVar3 = iobyxmoadgVar.f8175wkgbmnqykc;
                    ppxfxbqfkfVar3.f8194eablkybsjg = typedArray.getInt(index, ppxfxbqfkfVar3.f8194eablkybsjg);
                    break;
                case 77:
                    iobyxmoadgVar.f8169eablkybsjg.f8257sflfametgt = typedArray.getString(index);
                    break;
                case 78:
                    C0131wkgbmnqykc c0131wkgbmnqykc5 = iobyxmoadgVar.f8174ppxfxbqfkf;
                    c0131wkgbmnqykc5.f8206ppxfxbqfkf = typedArray.getInt(index, c0131wkgbmnqykc5.f8206ppxfxbqfkf);
                    break;
                case 79:
                    ppxfxbqfkf ppxfxbqfkfVar4 = iobyxmoadgVar.f8175wkgbmnqykc;
                    ppxfxbqfkfVar4.f8198lqeggnwhkg = typedArray.getFloat(index, ppxfxbqfkfVar4.f8198lqeggnwhkg);
                    break;
                case 80:
                    zoijcleaow zoijcleaowVar52 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar52.f8276zfvoamnweg = typedArray.getBoolean(index, zoijcleaowVar52.f8276zfvoamnweg);
                    break;
                case 81:
                    zoijcleaow zoijcleaowVar53 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar53.f8246oipsdeybqn = typedArray.getBoolean(index, zoijcleaowVar53.f8246oipsdeybqn);
                    break;
                case 82:
                    ppxfxbqfkf ppxfxbqfkfVar5 = iobyxmoadgVar.f8175wkgbmnqykc;
                    ppxfxbqfkfVar5.f8200ppxfxbqfkf = typedArray.getInteger(index, ppxfxbqfkfVar5.f8200ppxfxbqfkf);
                    break;
                case 83:
                    eablkybsjg eablkybsjgVar12 = iobyxmoadgVar.f8170gxszxtbevo;
                    eablkybsjgVar12.f8158dxjokdxxww = cdpycssgdh(typedArray, index, eablkybsjgVar12.f8158dxjokdxxww);
                    break;
                case 84:
                    ppxfxbqfkf ppxfxbqfkfVar6 = iobyxmoadgVar.f8175wkgbmnqykc;
                    ppxfxbqfkfVar6.f8195gtknphoqwx = typedArray.getInteger(index, ppxfxbqfkfVar6.f8195gtknphoqwx);
                    break;
                case 85:
                    ppxfxbqfkf ppxfxbqfkfVar7 = iobyxmoadgVar.f8175wkgbmnqykc;
                    ppxfxbqfkfVar7.f8191btonecajqb = typedArray.getFloat(index, ppxfxbqfkfVar7.f8191btonecajqb);
                    break;
                case 86:
                    int i14 = typedArray.peekValue(index).type;
                    if (i14 == 1) {
                        iobyxmoadgVar.f8175wkgbmnqykc.f8190agtfadlqog = typedArray.getResourceId(index, -1);
                        ppxfxbqfkf ppxfxbqfkfVar8 = iobyxmoadgVar.f8175wkgbmnqykc;
                        if (ppxfxbqfkfVar8.f8190agtfadlqog != -1) {
                            ppxfxbqfkfVar8.f8201wflxmlrfwp = -2;
                        }
                    } else if (i14 == 3) {
                        iobyxmoadgVar.f8175wkgbmnqykc.f8192draadjrbmk = typedArray.getString(index);
                        if (iobyxmoadgVar.f8175wkgbmnqykc.f8192draadjrbmk.indexOf(CardDateFormatTextWatcher.DIVIDER_CHARACTER) > 0) {
                            iobyxmoadgVar.f8175wkgbmnqykc.f8190agtfadlqog = typedArray.getResourceId(index, -1);
                            iobyxmoadgVar.f8175wkgbmnqykc.f8201wflxmlrfwp = -2;
                        } else {
                            iobyxmoadgVar.f8175wkgbmnqykc.f8201wflxmlrfwp = -1;
                        }
                    } else {
                        ppxfxbqfkf ppxfxbqfkfVar9 = iobyxmoadgVar.f8175wkgbmnqykc;
                        ppxfxbqfkfVar9.f8201wflxmlrfwp = typedArray.getInteger(index, ppxfxbqfkfVar9.f8190agtfadlqog);
                    }
                    break;
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f8143btonecajqb.get(index));
                    break;
                case 88:
                case 89:
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f8143btonecajqb.get(index));
                    break;
                case 91:
                    zoijcleaow zoijcleaowVar54 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar54.f8237kcexrzcfyt = cdpycssgdh(typedArray, index, zoijcleaowVar54.f8237kcexrzcfyt);
                    break;
                case 92:
                    zoijcleaow zoijcleaowVar55 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar55.f8275zdlpuopuiu = cdpycssgdh(typedArray, index, zoijcleaowVar55.f8275zdlpuopuiu);
                    break;
                case 93:
                    zoijcleaow zoijcleaowVar56 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar56.f8214cllcsxoeiz = typedArray.getDimensionPixelSize(index, zoijcleaowVar56.f8214cllcsxoeiz);
                    break;
                case 94:
                    zoijcleaow zoijcleaowVar57 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar57.f8244ntlheqmsrt = typedArray.getDimensionPixelSize(index, zoijcleaowVar57.f8244ntlheqmsrt);
                    break;
                case 95:
                    yadqdtsiqt(iobyxmoadgVar.f8169eablkybsjg, typedArray, index, 0);
                    break;
                case 96:
                    yadqdtsiqt(iobyxmoadgVar.f8169eablkybsjg, typedArray, index, 1);
                    break;
                case 97:
                    zoijcleaow zoijcleaowVar58 = iobyxmoadgVar.f8169eablkybsjg;
                    zoijcleaowVar58.f8249opjhrmiecq = typedArray.getInt(index, zoijcleaowVar58.f8249opjhrmiecq);
                    break;
            }
        }
        zoijcleaow zoijcleaowVar59 = iobyxmoadgVar.f8169eablkybsjg;
        if (zoijcleaowVar59.f8271ydmasvzmpa != null) {
            zoijcleaowVar59.f8272yfnezrywwk = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0033  */
    /* JADX WARN: Code duplicated, block: B:23:0x0037  */
    /* JADX WARN: Code duplicated, block: B:24:0x003c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0041  */
    /* JADX WARN: Code duplicated, block: B:27:0x0045  */
    /* JADX WARN: Code duplicated, block: B:29:0x0049  */
    /* JADX WARN: Code duplicated, block: B:30:0x004e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    /* JADX WARN: Code duplicated, block: B:35:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    static void yadqdtsiqt(Object obj, TypedArray typedArray, int i13, int i14) {
        int dimensionPixelSize;
        boolean z13;
        iobyxmoadg.C0130iobyxmoadg c0130iobyxmoadg;
        zoijcleaow zoijcleaowVar;
        ConstraintLayout.zoijcleaow zoijcleaowVar2;
        if (obj == null) {
            return;
        }
        int i15 = typedArray.peekValue(i13).type;
        if (i15 == 3) {
            iozdgvuglv(obj, typedArray.getString(i13), i14);
            return;
        }
        int i16 = 0;
        if (i15 != 5) {
            dimensionPixelSize = typedArray.getInt(i13, 0);
            if (dimensionPixelSize == -4) {
                z13 = true;
                i16 = -2;
            } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                z13 = false;
            }
            if (obj instanceof ConstraintLayout.zoijcleaow) {
                zoijcleaowVar2 = (ConstraintLayout.zoijcleaow) obj;
                if (i14 == 0) {
                    ((ViewGroup.MarginLayoutParams) zoijcleaowVar2).width = i16;
                    zoijcleaowVar2.f8060vipkmwdibw = z13;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) zoijcleaowVar2).height = i16;
                    zoijcleaowVar2.f8025jhduphickx = z13;
                    return;
                }
            }
            if (obj instanceof zoijcleaow) {
                zoijcleaowVar = (zoijcleaow) obj;
                if (i14 == 0) {
                    zoijcleaowVar.f8266wkgbmnqykc = i16;
                    zoijcleaowVar.f8276zfvoamnweg = z13;
                    return;
                } else {
                    zoijcleaowVar.f8221eablkybsjg = i16;
                    zoijcleaowVar.f8246oipsdeybqn = z13;
                    return;
                }
            }
            if (obj instanceof iobyxmoadg.C0130iobyxmoadg) {
                c0130iobyxmoadg = (iobyxmoadg.C0130iobyxmoadg) obj;
                if (i14 == 0) {
                    c0130iobyxmoadg.zoijcleaow(23, i16);
                    c0130iobyxmoadg.wkgbmnqykc(80, z13);
                } else {
                    c0130iobyxmoadg.zoijcleaow(21, i16);
                    c0130iobyxmoadg.wkgbmnqykc(81, z13);
                }
            }
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i13, 0);
        i16 = dimensionPixelSize;
        z13 = false;
        if (obj instanceof ConstraintLayout.zoijcleaow) {
            zoijcleaowVar2 = (ConstraintLayout.zoijcleaow) obj;
            if (i14 == 0) {
                ((ViewGroup.MarginLayoutParams) zoijcleaowVar2).width = i16;
                zoijcleaowVar2.f8060vipkmwdibw = z13;
                return;
            } else {
                ((ViewGroup.MarginLayoutParams) zoijcleaowVar2).height = i16;
                zoijcleaowVar2.f8025jhduphickx = z13;
                return;
            }
        }
        if (obj instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) obj;
            if (i14 == 0) {
                zoijcleaowVar.f8266wkgbmnqykc = i16;
                zoijcleaowVar.f8276zfvoamnweg = z13;
                return;
            } else {
                zoijcleaowVar.f8221eablkybsjg = i16;
                zoijcleaowVar.f8246oipsdeybqn = z13;
                return;
            }
        }
        if (obj instanceof iobyxmoadg.C0130iobyxmoadg) {
            c0130iobyxmoadg = (iobyxmoadg.C0130iobyxmoadg) obj;
            if (i14 == 0) {
                c0130iobyxmoadg.zoijcleaow(23, i16);
                c0130iobyxmoadg.wkgbmnqykc(80, z13);
            } else {
                c0130iobyxmoadg.zoijcleaow(21, i16);
                c0130iobyxmoadg.wkgbmnqykc(81, z13);
            }
        }
    }

    private static void ylkuphrtab(iobyxmoadg iobyxmoadgVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        iobyxmoadg.C0130iobyxmoadg c0130iobyxmoadg = new iobyxmoadg.C0130iobyxmoadg();
        iobyxmoadgVar.f8173nufgyqmvbu = c0130iobyxmoadg;
        iobyxmoadgVar.f8175wkgbmnqykc.f8197iobyxmoadg = false;
        iobyxmoadgVar.f8169eablkybsjg.f8277zoijcleaow = false;
        iobyxmoadgVar.f8174ppxfxbqfkf.f8205iobyxmoadg = false;
        iobyxmoadgVar.f8170gxszxtbevo.f8162iobyxmoadg = false;
        for (int i13 = 0; i13 < indexCount; i13++) {
            int index = typedArray.getIndex(i13);
            switch (f8145gtknphoqwx.get(index)) {
                case 2:
                    c0130iobyxmoadg.zoijcleaow(2, typedArray.getDimensionPixelSize(index, iobyxmoadgVar.f8169eablkybsjg.f8225hcddaimhww));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case C4007z9.F /* 25 */:
                case C4007z9.G /* 26 */:
                case C4007z9.I /* 29 */:
                case 30:
                case 32:
                case 33:
                case C4007z9.J /* 35 */:
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                case 61:
                case 88:
                case 89:
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                case 91:
                case 92:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f8143btonecajqb.get(index));
                    break;
                case 5:
                    c0130iobyxmoadg.ppxfxbqfkf(5, typedArray.getString(index));
                    break;
                case 6:
                    c0130iobyxmoadg.zoijcleaow(6, typedArray.getDimensionPixelOffset(index, iobyxmoadgVar.f8169eablkybsjg.f8270yadqdtsiqt));
                    break;
                case 7:
                    c0130iobyxmoadg.zoijcleaow(7, typedArray.getDimensionPixelOffset(index, iobyxmoadgVar.f8169eablkybsjg.f8229iozdgvuglv));
                    break;
                case 8:
                    c0130iobyxmoadg.zoijcleaow(8, typedArray.getDimensionPixelSize(index, iobyxmoadgVar.f8169eablkybsjg.f8234jpowsppfya));
                    break;
                case 11:
                    c0130iobyxmoadg.zoijcleaow(11, typedArray.getDimensionPixelSize(index, iobyxmoadgVar.f8169eablkybsjg.f8238kegysxyocb));
                    break;
                case 12:
                    c0130iobyxmoadg.zoijcleaow(12, typedArray.getDimensionPixelSize(index, iobyxmoadgVar.f8169eablkybsjg.f8260tzroggbefp));
                    break;
                case 13:
                    c0130iobyxmoadg.zoijcleaow(13, typedArray.getDimensionPixelSize(index, iobyxmoadgVar.f8169eablkybsjg.f8219dsvhmnatus));
                    break;
                case 14:
                    c0130iobyxmoadg.zoijcleaow(14, typedArray.getDimensionPixelSize(index, iobyxmoadgVar.f8169eablkybsjg.f8259stevsuqkhv));
                    break;
                case 15:
                    c0130iobyxmoadg.zoijcleaow(15, typedArray.getDimensionPixelSize(index, iobyxmoadgVar.f8169eablkybsjg.f8242mbcevpiqjq));
                    break;
                case 16:
                    c0130iobyxmoadg.zoijcleaow(16, typedArray.getDimensionPixelSize(index, iobyxmoadgVar.f8169eablkybsjg.f8268wypolnanlu));
                    break;
                case 17:
                    c0130iobyxmoadg.zoijcleaow(17, typedArray.getDimensionPixelOffset(index, iobyxmoadgVar.f8169eablkybsjg.f8224gxszxtbevo));
                    break;
                case 18:
                    c0130iobyxmoadg.zoijcleaow(18, typedArray.getDimensionPixelOffset(index, iobyxmoadgVar.f8169eablkybsjg.f8241lqeggnwhkg));
                    break;
                case 19:
                    c0130iobyxmoadg.iobyxmoadg(19, typedArray.getFloat(index, iobyxmoadgVar.f8169eablkybsjg.f8245nufgyqmvbu));
                    break;
                case 20:
                    c0130iobyxmoadg.iobyxmoadg(20, typedArray.getFloat(index, iobyxmoadgVar.f8169eablkybsjg.f8222esjtqupxsv));
                    break;
                case 21:
                    c0130iobyxmoadg.zoijcleaow(21, typedArray.getLayoutDimension(index, iobyxmoadgVar.f8169eablkybsjg.f8221eablkybsjg));
                    break;
                case 22:
                    c0130iobyxmoadg.zoijcleaow(22, f8144dxjokdxxww[typedArray.getInt(index, iobyxmoadgVar.f8174ppxfxbqfkf.f8208zoijcleaow)]);
                    break;
                case 23:
                    c0130iobyxmoadg.zoijcleaow(23, typedArray.getLayoutDimension(index, iobyxmoadgVar.f8169eablkybsjg.f8266wkgbmnqykc));
                    break;
                case 24:
                    c0130iobyxmoadg.zoijcleaow(24, typedArray.getDimensionPixelSize(index, iobyxmoadgVar.f8169eablkybsjg.f8267wwaezpbzkn));
                    break;
                case 27:
                    c0130iobyxmoadg.zoijcleaow(27, typedArray.getInt(index, iobyxmoadgVar.f8169eablkybsjg.f8240lmojexxdyd));
                    break;
                case 28:
                    c0130iobyxmoadg.zoijcleaow(28, typedArray.getDimensionPixelSize(index, iobyxmoadgVar.f8169eablkybsjg.f8274ylkuphrtab));
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    c0130iobyxmoadg.zoijcleaow(31, typedArray.getDimensionPixelSize(index, iobyxmoadgVar.f8169eablkybsjg.f8226hkdspvbjdz));
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    c0130iobyxmoadg.zoijcleaow(34, typedArray.getDimensionPixelSize(index, iobyxmoadgVar.f8169eablkybsjg.f8251pkzmftpjix));
                    break;
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    c0130iobyxmoadg.iobyxmoadg(37, typedArray.getFloat(index, iobyxmoadgVar.f8169eablkybsjg.f8239lereixgezr));
                    break;
                case C4007z9.K /* 38 */:
                    int resourceId = typedArray.getResourceId(index, iobyxmoadgVar.f8171iobyxmoadg);
                    iobyxmoadgVar.f8171iobyxmoadg = resourceId;
                    c0130iobyxmoadg.zoijcleaow(38, resourceId);
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    c0130iobyxmoadg.iobyxmoadg(39, typedArray.getFloat(index, iobyxmoadgVar.f8169eablkybsjg.f8258sopmlzcsov));
                    break;
                case 40:
                    c0130iobyxmoadg.iobyxmoadg(40, typedArray.getFloat(index, iobyxmoadgVar.f8169eablkybsjg.f8261ulzqkzuiru));
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    c0130iobyxmoadg.zoijcleaow(41, typedArray.getInt(index, iobyxmoadgVar.f8169eablkybsjg.f8216crxdokpmqz));
                    break;
                case 42:
                    c0130iobyxmoadg.zoijcleaow(42, typedArray.getInt(index, iobyxmoadgVar.f8169eablkybsjg.f8233jlmebxxoox));
                    break;
                case 43:
                    c0130iobyxmoadg.iobyxmoadg(43, typedArray.getFloat(index, iobyxmoadgVar.f8174ppxfxbqfkf.f8207wkgbmnqykc));
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    c0130iobyxmoadg.wkgbmnqykc(44, true);
                    c0130iobyxmoadg.iobyxmoadg(44, typedArray.getDimension(index, iobyxmoadgVar.f8170gxszxtbevo.f8155agtfadlqog));
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    c0130iobyxmoadg.iobyxmoadg(45, typedArray.getFloat(index, iobyxmoadgVar.f8170gxszxtbevo.f8165ppxfxbqfkf));
                    break;
                case 46:
                    c0130iobyxmoadg.iobyxmoadg(46, typedArray.getFloat(index, iobyxmoadgVar.f8170gxszxtbevo.f8167wkgbmnqykc));
                    break;
                case 47:
                    c0130iobyxmoadg.iobyxmoadg(47, typedArray.getFloat(index, iobyxmoadgVar.f8170gxszxtbevo.f8159eablkybsjg));
                    break;
                case 48:
                    c0130iobyxmoadg.iobyxmoadg(48, typedArray.getFloat(index, iobyxmoadgVar.f8170gxszxtbevo.f8161gxszxtbevo));
                    break;
                case 49:
                    c0130iobyxmoadg.iobyxmoadg(49, typedArray.getDimension(index, iobyxmoadgVar.f8170gxszxtbevo.f8163lqeggnwhkg));
                    break;
                case 50:
                    c0130iobyxmoadg.iobyxmoadg(50, typedArray.getDimension(index, iobyxmoadgVar.f8170gxszxtbevo.f8164nufgyqmvbu));
                    break;
                case 51:
                    c0130iobyxmoadg.iobyxmoadg(51, typedArray.getDimension(index, iobyxmoadgVar.f8170gxszxtbevo.f8156btonecajqb));
                    break;
                case 52:
                    c0130iobyxmoadg.iobyxmoadg(52, typedArray.getDimension(index, iobyxmoadgVar.f8170gxszxtbevo.f8160gtknphoqwx));
                    break;
                case 53:
                    c0130iobyxmoadg.iobyxmoadg(53, typedArray.getDimension(index, iobyxmoadgVar.f8170gxszxtbevo.f8157draadjrbmk));
                    break;
                case 54:
                    c0130iobyxmoadg.zoijcleaow(54, typedArray.getInt(index, iobyxmoadgVar.f8169eablkybsjg.f8255ribwqtqdhb));
                    break;
                case 55:
                    c0130iobyxmoadg.zoijcleaow(55, typedArray.getInt(index, iobyxmoadgVar.f8169eablkybsjg.f8264vipkmwdibw));
                    break;
                case 56:
                    c0130iobyxmoadg.zoijcleaow(56, typedArray.getDimensionPixelSize(index, iobyxmoadgVar.f8169eablkybsjg.f8232jhduphickx));
                    break;
                case 57:
                    c0130iobyxmoadg.zoijcleaow(57, typedArray.getDimensionPixelSize(index, iobyxmoadgVar.f8169eablkybsjg.f8227ikoacuggdj));
                    break;
                case 58:
                    c0130iobyxmoadg.zoijcleaow(58, typedArray.getDimensionPixelSize(index, iobyxmoadgVar.f8169eablkybsjg.f8248okpsazkaxt));
                    break;
                case 59:
                    c0130iobyxmoadg.zoijcleaow(59, typedArray.getDimensionPixelSize(index, iobyxmoadgVar.f8169eablkybsjg.f8236jztzpxfvev));
                    break;
                case 60:
                    c0130iobyxmoadg.iobyxmoadg(60, typedArray.getFloat(index, iobyxmoadgVar.f8170gxszxtbevo.f8168zoijcleaow));
                    break;
                case 62:
                    c0130iobyxmoadg.zoijcleaow(62, typedArray.getDimensionPixelSize(index, iobyxmoadgVar.f8169eablkybsjg.f8230istkbnxepw));
                    break;
                case 63:
                    c0130iobyxmoadg.iobyxmoadg(63, typedArray.getFloat(index, iobyxmoadgVar.f8169eablkybsjg.f8213cdpycssgdh));
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    c0130iobyxmoadg.zoijcleaow(64, cdpycssgdh(typedArray, index, iobyxmoadgVar.f8175wkgbmnqykc.f8203zoijcleaow));
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (typedArray.peekValue(index).type == 3) {
                        c0130iobyxmoadg.ppxfxbqfkf(65, typedArray.getString(index));
                    } else {
                        c0130iobyxmoadg.ppxfxbqfkf(65, a1.ppxfxbqfkf.f259ppxfxbqfkf[typedArray.getInteger(index, 0)]);
                    }
                    break;
                case 66:
                    c0130iobyxmoadg.zoijcleaow(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    c0130iobyxmoadg.iobyxmoadg(67, typedArray.getFloat(index, iobyxmoadgVar.f8175wkgbmnqykc.f8193dxjokdxxww));
                    break;
                case 68:
                    c0130iobyxmoadg.iobyxmoadg(68, typedArray.getFloat(index, iobyxmoadgVar.f8174ppxfxbqfkf.f8204eablkybsjg));
                    break;
                case 69:
                    c0130iobyxmoadg.iobyxmoadg(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    c0130iobyxmoadg.iobyxmoadg(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    c0130iobyxmoadg.zoijcleaow(72, typedArray.getInt(index, iobyxmoadgVar.f8169eablkybsjg.f8256rlfsiqarku));
                    break;
                case 73:
                    c0130iobyxmoadg.zoijcleaow(73, typedArray.getDimensionPixelSize(index, iobyxmoadgVar.f8169eablkybsjg.f8217czzsidtyhn));
                    break;
                case 74:
                    c0130iobyxmoadg.ppxfxbqfkf(74, typedArray.getString(index));
                    break;
                case 75:
                    c0130iobyxmoadg.wkgbmnqykc(75, typedArray.getBoolean(index, iobyxmoadgVar.f8169eablkybsjg.f8211bfopjjpdmp));
                    break;
                case 76:
                    c0130iobyxmoadg.zoijcleaow(76, typedArray.getInt(index, iobyxmoadgVar.f8175wkgbmnqykc.f8194eablkybsjg));
                    break;
                case 77:
                    c0130iobyxmoadg.ppxfxbqfkf(77, typedArray.getString(index));
                    break;
                case 78:
                    c0130iobyxmoadg.zoijcleaow(78, typedArray.getInt(index, iobyxmoadgVar.f8174ppxfxbqfkf.f8206ppxfxbqfkf));
                    break;
                case 79:
                    c0130iobyxmoadg.iobyxmoadg(79, typedArray.getFloat(index, iobyxmoadgVar.f8175wkgbmnqykc.f8198lqeggnwhkg));
                    break;
                case 80:
                    c0130iobyxmoadg.wkgbmnqykc(80, typedArray.getBoolean(index, iobyxmoadgVar.f8169eablkybsjg.f8276zfvoamnweg));
                    break;
                case 81:
                    c0130iobyxmoadg.wkgbmnqykc(81, typedArray.getBoolean(index, iobyxmoadgVar.f8169eablkybsjg.f8246oipsdeybqn));
                    break;
                case 82:
                    c0130iobyxmoadg.zoijcleaow(82, typedArray.getInteger(index, iobyxmoadgVar.f8175wkgbmnqykc.f8200ppxfxbqfkf));
                    break;
                case 83:
                    c0130iobyxmoadg.zoijcleaow(83, cdpycssgdh(typedArray, index, iobyxmoadgVar.f8170gxszxtbevo.f8158dxjokdxxww));
                    break;
                case 84:
                    c0130iobyxmoadg.zoijcleaow(84, typedArray.getInteger(index, iobyxmoadgVar.f8175wkgbmnqykc.f8195gtknphoqwx));
                    break;
                case 85:
                    c0130iobyxmoadg.iobyxmoadg(85, typedArray.getFloat(index, iobyxmoadgVar.f8175wkgbmnqykc.f8191btonecajqb));
                    break;
                case 86:
                    int i14 = typedArray.peekValue(index).type;
                    if (i14 == 1) {
                        iobyxmoadgVar.f8175wkgbmnqykc.f8190agtfadlqog = typedArray.getResourceId(index, -1);
                        c0130iobyxmoadg.zoijcleaow(89, iobyxmoadgVar.f8175wkgbmnqykc.f8190agtfadlqog);
                        ppxfxbqfkf ppxfxbqfkfVar = iobyxmoadgVar.f8175wkgbmnqykc;
                        if (ppxfxbqfkfVar.f8190agtfadlqog != -1) {
                            ppxfxbqfkfVar.f8201wflxmlrfwp = -2;
                            c0130iobyxmoadg.zoijcleaow(88, -2);
                        }
                    } else if (i14 == 3) {
                        iobyxmoadgVar.f8175wkgbmnqykc.f8192draadjrbmk = typedArray.getString(index);
                        c0130iobyxmoadg.ppxfxbqfkf(90, iobyxmoadgVar.f8175wkgbmnqykc.f8192draadjrbmk);
                        if (iobyxmoadgVar.f8175wkgbmnqykc.f8192draadjrbmk.indexOf(CardDateFormatTextWatcher.DIVIDER_CHARACTER) > 0) {
                            iobyxmoadgVar.f8175wkgbmnqykc.f8190agtfadlqog = typedArray.getResourceId(index, -1);
                            c0130iobyxmoadg.zoijcleaow(89, iobyxmoadgVar.f8175wkgbmnqykc.f8190agtfadlqog);
                            iobyxmoadgVar.f8175wkgbmnqykc.f8201wflxmlrfwp = -2;
                            c0130iobyxmoadg.zoijcleaow(88, -2);
                        } else {
                            iobyxmoadgVar.f8175wkgbmnqykc.f8201wflxmlrfwp = -1;
                            c0130iobyxmoadg.zoijcleaow(88, -1);
                        }
                    } else {
                        ppxfxbqfkf ppxfxbqfkfVar2 = iobyxmoadgVar.f8175wkgbmnqykc;
                        ppxfxbqfkfVar2.f8201wflxmlrfwp = typedArray.getInteger(index, ppxfxbqfkfVar2.f8190agtfadlqog);
                        c0130iobyxmoadg.zoijcleaow(88, iobyxmoadgVar.f8175wkgbmnqykc.f8201wflxmlrfwp);
                    }
                    break;
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f8143btonecajqb.get(index));
                    break;
                case 93:
                    c0130iobyxmoadg.zoijcleaow(93, typedArray.getDimensionPixelSize(index, iobyxmoadgVar.f8169eablkybsjg.f8214cllcsxoeiz));
                    break;
                case 94:
                    c0130iobyxmoadg.zoijcleaow(94, typedArray.getDimensionPixelSize(index, iobyxmoadgVar.f8169eablkybsjg.f8244ntlheqmsrt));
                    break;
                case 95:
                    yadqdtsiqt(c0130iobyxmoadg, typedArray, index, 0);
                    break;
                case 96:
                    yadqdtsiqt(c0130iobyxmoadg, typedArray, index, 1);
                    break;
                case 97:
                    c0130iobyxmoadg.zoijcleaow(97, typedArray.getInt(index, iobyxmoadgVar.f8169eablkybsjg.f8249opjhrmiecq));
                    break;
                case 98:
                    if (MotionLayout.f7530eslsurpljm) {
                        int resourceId2 = typedArray.getResourceId(index, iobyxmoadgVar.f8171iobyxmoadg);
                        iobyxmoadgVar.f8171iobyxmoadg = resourceId2;
                        if (resourceId2 == -1) {
                            iobyxmoadgVar.f8176zoijcleaow = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        iobyxmoadgVar.f8176zoijcleaow = typedArray.getString(index);
                    } else {
                        iobyxmoadgVar.f8171iobyxmoadg = typedArray.getResourceId(index, iobyxmoadgVar.f8171iobyxmoadg);
                    }
                    break;
                case 99:
                    c0130iobyxmoadg.wkgbmnqykc(99, typedArray.getBoolean(index, iobyxmoadgVar.f8169eablkybsjg.f8220dxjokdxxww));
                    break;
            }
        }
    }

    private iobyxmoadg zdlpuopuiu(int i13) {
        if (!this.f8150nufgyqmvbu.containsKey(Integer.valueOf(i13))) {
            this.f8150nufgyqmvbu.put(Integer.valueOf(i13), new iobyxmoadg());
        }
        return (iobyxmoadg) this.f8150nufgyqmvbu.get(Integer.valueOf(i13));
    }

    public void agtfadlqog(Context context, int i13) {
        ojitshcjhn((ConstraintLayout) LayoutInflater.from(context).inflate(i13, (ViewGroup) null));
    }

    public void btonecajqb(androidx.constraintlayout.widget.zoijcleaow zoijcleaowVar, c1.eablkybsjg eablkybsjgVar, ConstraintLayout.zoijcleaow zoijcleaowVar2, SparseArray sparseArray) {
        iobyxmoadg iobyxmoadgVar;
        int id2 = zoijcleaowVar.getId();
        if (this.f8150nufgyqmvbu.containsKey(Integer.valueOf(id2)) && (iobyxmoadgVar = (iobyxmoadg) this.f8150nufgyqmvbu.get(Integer.valueOf(id2))) != null && (eablkybsjgVar instanceof c1.btonecajqb)) {
            zoijcleaowVar.gtknphoqwx(iobyxmoadgVar, (c1.btonecajqb) eablkybsjgVar, zoijcleaowVar2, sparseArray);
        }
    }

    public iobyxmoadg cqumvgiudr(int i13) {
        return zdlpuopuiu(i13);
    }

    public void draadjrbmk(int i13, ConstraintLayout.zoijcleaow zoijcleaowVar) {
        iobyxmoadg iobyxmoadgVar;
        if (!this.f8150nufgyqmvbu.containsKey(Integer.valueOf(i13)) || (iobyxmoadgVar = (iobyxmoadg) this.f8150nufgyqmvbu.get(Integer.valueOf(i13))) == null) {
            return;
        }
        iobyxmoadgVar.ppxfxbqfkf(zoijcleaowVar);
    }

    public void dxjokdxxww(ConstraintLayout constraintLayout) {
        gtknphoqwx(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public int esjtqupxsv(int i13) {
        return zdlpuopuiu(i13).f8174ppxfxbqfkf.f8208zoijcleaow;
    }

    void gtknphoqwx(ConstraintLayout constraintLayout, boolean z13) {
        int childCount = constraintLayout.getChildCount();
        HashSet<Integer> hashSet = new HashSet(this.f8150nufgyqmvbu.keySet());
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = constraintLayout.getChildAt(i13);
            int id2 = childAt.getId();
            if (!this.f8150nufgyqmvbu.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + androidx.constraintlayout.motion.widget.iobyxmoadg.wkgbmnqykc(childAt));
            } else {
                if (this.f8149lqeggnwhkg && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id2 != -1) {
                    if (this.f8150nufgyqmvbu.containsKey(Integer.valueOf(id2))) {
                        hashSet.remove(Integer.valueOf(id2));
                        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) this.f8150nufgyqmvbu.get(Integer.valueOf(id2));
                        if (iobyxmoadgVar != null) {
                            if (childAt instanceof Barrier) {
                                iobyxmoadgVar.f8169eablkybsjg.f8262uwvvkdfqfp = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id2);
                                barrier.setType(iobyxmoadgVar.f8169eablkybsjg.f8256rlfsiqarku);
                                barrier.setMargin(iobyxmoadgVar.f8169eablkybsjg.f8217czzsidtyhn);
                                barrier.setAllowsGoneWidget(iobyxmoadgVar.f8169eablkybsjg.f8211bfopjjpdmp);
                                zoijcleaow zoijcleaowVar = iobyxmoadgVar.f8169eablkybsjg;
                                int[] iArr = zoijcleaowVar.f8272yfnezrywwk;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = zoijcleaowVar.f8271ydmasvzmpa;
                                    if (str != null) {
                                        zoijcleaowVar.f8272yfnezrywwk = oxmwwwfdhm(barrier, str);
                                        barrier.setReferencedIds(iobyxmoadgVar.f8169eablkybsjg.f8272yfnezrywwk);
                                    }
                                }
                            }
                            ConstraintLayout.zoijcleaow zoijcleaowVar2 = (ConstraintLayout.zoijcleaow) childAt.getLayoutParams();
                            zoijcleaowVar2.zoijcleaow();
                            iobyxmoadgVar.ppxfxbqfkf(zoijcleaowVar2);
                            if (z13) {
                                androidx.constraintlayout.widget.iobyxmoadg.btonecajqb(childAt, iobyxmoadgVar.f8172lqeggnwhkg);
                            }
                            childAt.setLayoutParams(zoijcleaowVar2);
                            C0131wkgbmnqykc c0131wkgbmnqykc = iobyxmoadgVar.f8174ppxfxbqfkf;
                            if (c0131wkgbmnqykc.f8206ppxfxbqfkf == 0) {
                                childAt.setVisibility(c0131wkgbmnqykc.f8208zoijcleaow);
                            }
                            childAt.setAlpha(iobyxmoadgVar.f8174ppxfxbqfkf.f8207wkgbmnqykc);
                            childAt.setRotation(iobyxmoadgVar.f8170gxszxtbevo.f8168zoijcleaow);
                            childAt.setRotationX(iobyxmoadgVar.f8170gxszxtbevo.f8165ppxfxbqfkf);
                            childAt.setRotationY(iobyxmoadgVar.f8170gxszxtbevo.f8167wkgbmnqykc);
                            childAt.setScaleX(iobyxmoadgVar.f8170gxszxtbevo.f8159eablkybsjg);
                            childAt.setScaleY(iobyxmoadgVar.f8170gxszxtbevo.f8161gxszxtbevo);
                            eablkybsjg eablkybsjgVar = iobyxmoadgVar.f8170gxszxtbevo;
                            if (eablkybsjgVar.f8158dxjokdxxww != -1) {
                                View viewFindViewById = ((View) childAt.getParent()).findViewById(iobyxmoadgVar.f8170gxszxtbevo.f8158dxjokdxxww);
                                if (viewFindViewById != null) {
                                    float top = (viewFindViewById.getTop() + viewFindViewById.getBottom()) / 2.0f;
                                    float left = (viewFindViewById.getLeft() + viewFindViewById.getRight()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        float left2 = left - childAt.getLeft();
                                        float top2 = top - childAt.getTop();
                                        childAt.setPivotX(left2);
                                        childAt.setPivotY(top2);
                                    }
                                }
                            } else {
                                if (!Float.isNaN(eablkybsjgVar.f8163lqeggnwhkg)) {
                                    childAt.setPivotX(iobyxmoadgVar.f8170gxszxtbevo.f8163lqeggnwhkg);
                                }
                                if (!Float.isNaN(iobyxmoadgVar.f8170gxszxtbevo.f8164nufgyqmvbu)) {
                                    childAt.setPivotY(iobyxmoadgVar.f8170gxszxtbevo.f8164nufgyqmvbu);
                                }
                            }
                            childAt.setTranslationX(iobyxmoadgVar.f8170gxszxtbevo.f8156btonecajqb);
                            childAt.setTranslationY(iobyxmoadgVar.f8170gxszxtbevo.f8160gtknphoqwx);
                            childAt.setTranslationZ(iobyxmoadgVar.f8170gxszxtbevo.f8157draadjrbmk);
                            eablkybsjg eablkybsjgVar2 = iobyxmoadgVar.f8170gxszxtbevo;
                            if (eablkybsjgVar2.f8166wflxmlrfwp) {
                                childAt.setElevation(eablkybsjgVar2.f8155agtfadlqog);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            iobyxmoadg iobyxmoadgVar2 = (iobyxmoadg) this.f8150nufgyqmvbu.get(num);
            if (iobyxmoadgVar2 != null) {
                if (iobyxmoadgVar2.f8169eablkybsjg.f8262uwvvkdfqfp == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    zoijcleaow zoijcleaowVar3 = iobyxmoadgVar2.f8169eablkybsjg;
                    int[] iArr2 = zoijcleaowVar3.f8272yfnezrywwk;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = zoijcleaowVar3.f8271ydmasvzmpa;
                        if (str2 != null) {
                            zoijcleaowVar3.f8272yfnezrywwk = oxmwwwfdhm(barrier2, str2);
                            barrier2.setReferencedIds(iobyxmoadgVar2.f8169eablkybsjg.f8272yfnezrywwk);
                        }
                    }
                    barrier2.setType(iobyxmoadgVar2.f8169eablkybsjg.f8256rlfsiqarku);
                    barrier2.setMargin(iobyxmoadgVar2.f8169eablkybsjg.f8217czzsidtyhn);
                    ConstraintLayout.zoijcleaow zoijcleaowVarGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.oxmwwwfdhm();
                    iobyxmoadgVar2.ppxfxbqfkf(zoijcleaowVarGenerateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, zoijcleaowVarGenerateDefaultLayoutParams);
                }
                if (iobyxmoadgVar2.f8169eablkybsjg.f8228iobyxmoadg) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.zoijcleaow zoijcleaowVarGenerateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    iobyxmoadgVar2.ppxfxbqfkf(zoijcleaowVarGenerateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, zoijcleaowVarGenerateDefaultLayoutParams2);
                }
            }
        }
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt2 = constraintLayout.getChildAt(i14);
            if (childAt2 instanceof androidx.constraintlayout.widget.zoijcleaow) {
                ((androidx.constraintlayout.widget.zoijcleaow) childAt2).gxszxtbevo(constraintLayout);
            }
        }
    }

    public void hcddaimhww(wkgbmnqykc wkgbmnqykcVar) {
        for (Integer num : wkgbmnqykcVar.f8150nufgyqmvbu.keySet()) {
            num.intValue();
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) wkgbmnqykcVar.f8150nufgyqmvbu.get(num);
            if (!this.f8150nufgyqmvbu.containsKey(num)) {
                this.f8150nufgyqmvbu.put(num, new iobyxmoadg());
            }
            iobyxmoadg iobyxmoadgVar2 = (iobyxmoadg) this.f8150nufgyqmvbu.get(num);
            if (iobyxmoadgVar2 != null) {
                zoijcleaow zoijcleaowVar = iobyxmoadgVar2.f8169eablkybsjg;
                if (!zoijcleaowVar.f8277zoijcleaow) {
                    zoijcleaowVar.iobyxmoadg(iobyxmoadgVar.f8169eablkybsjg);
                }
                C0131wkgbmnqykc c0131wkgbmnqykc = iobyxmoadgVar2.f8174ppxfxbqfkf;
                if (!c0131wkgbmnqykc.f8205iobyxmoadg) {
                    c0131wkgbmnqykc.iobyxmoadg(iobyxmoadgVar.f8174ppxfxbqfkf);
                }
                eablkybsjg eablkybsjgVar = iobyxmoadgVar2.f8170gxszxtbevo;
                if (!eablkybsjgVar.f8162iobyxmoadg) {
                    eablkybsjgVar.iobyxmoadg(iobyxmoadgVar.f8170gxszxtbevo);
                }
                ppxfxbqfkf ppxfxbqfkfVar = iobyxmoadgVar2.f8175wkgbmnqykc;
                if (!ppxfxbqfkfVar.f8197iobyxmoadg) {
                    ppxfxbqfkfVar.iobyxmoadg(iobyxmoadgVar.f8175wkgbmnqykc);
                }
                for (String str : iobyxmoadgVar.f8172lqeggnwhkg.keySet()) {
                    if (!iobyxmoadgVar2.f8172lqeggnwhkg.containsKey(str)) {
                        iobyxmoadgVar2.f8172lqeggnwhkg.put(str, (androidx.constraintlayout.widget.iobyxmoadg) iobyxmoadgVar.f8172lqeggnwhkg.get(str));
                    }
                }
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void istkbnxepw(Context context, XmlPullParser xmlPullParser) {
        try {
            int eventType = xmlPullParser.getEventType();
            iobyxmoadg iobyxmoadgVarKcexrzcfyt = null;
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlPullParser.getName();
                } else if (eventType == 2) {
                    switch (xmlPullParser.getName()) {
                        case "Constraint":
                            iobyxmoadgVarKcexrzcfyt = kcexrzcfyt(context, Xml.asAttributeSet(xmlPullParser), false);
                            break;
                        case "ConstraintOverride":
                            iobyxmoadgVarKcexrzcfyt = kcexrzcfyt(context, Xml.asAttributeSet(xmlPullParser), true);
                            break;
                        case "Guideline":
                            iobyxmoadgVarKcexrzcfyt = kcexrzcfyt(context, Xml.asAttributeSet(xmlPullParser), false);
                            zoijcleaow zoijcleaowVar = iobyxmoadgVarKcexrzcfyt.f8169eablkybsjg;
                            zoijcleaowVar.f8228iobyxmoadg = true;
                            zoijcleaowVar.f8277zoijcleaow = true;
                            break;
                        case "Barrier":
                            iobyxmoadgVarKcexrzcfyt = kcexrzcfyt(context, Xml.asAttributeSet(xmlPullParser), false);
                            iobyxmoadgVarKcexrzcfyt.f8169eablkybsjg.f8262uwvvkdfqfp = 1;
                            break;
                        case "PropertySet":
                            if (iobyxmoadgVarKcexrzcfyt == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                            }
                            iobyxmoadgVarKcexrzcfyt.f8174ppxfxbqfkf.zoijcleaow(context, Xml.asAttributeSet(xmlPullParser));
                            break;
                            break;
                        case "Transform":
                            if (iobyxmoadgVarKcexrzcfyt == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                            }
                            iobyxmoadgVarKcexrzcfyt.f8170gxszxtbevo.zoijcleaow(context, Xml.asAttributeSet(xmlPullParser));
                            break;
                            break;
                        case "Layout":
                            if (iobyxmoadgVarKcexrzcfyt == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                            }
                            iobyxmoadgVarKcexrzcfyt.f8169eablkybsjg.zoijcleaow(context, Xml.asAttributeSet(xmlPullParser));
                            break;
                            break;
                        case "Motion":
                            if (iobyxmoadgVarKcexrzcfyt == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                            }
                            iobyxmoadgVarKcexrzcfyt.f8175wkgbmnqykc.zoijcleaow(context, Xml.asAttributeSet(xmlPullParser));
                            break;
                            break;
                        case "CustomAttribute":
                        case "CustomMethod":
                            if (iobyxmoadgVarKcexrzcfyt == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                            }
                            androidx.constraintlayout.widget.iobyxmoadg.dxjokdxxww(context, xmlPullParser, iobyxmoadgVarKcexrzcfyt.f8172lqeggnwhkg);
                            break;
                            break;
                    }
                } else if (eventType == 3) {
                    String lowerCase = xmlPullParser.getName().toLowerCase(Locale.ROOT);
                    switch (lowerCase.hashCode()) {
                        case -2075718416:
                            if (lowerCase.equals("guideline")) {
                            }
                            break;
                        case -190376483:
                            if (lowerCase.equals("constraint")) {
                            }
                            break;
                        case 426575017:
                            if (lowerCase.equals("constraintoverride")) {
                            }
                            break;
                        case 2146106725:
                            if (lowerCase.equals("constraintset")) {
                            }
                            break;
                    }
                    if (r6 == 0) {
                        return;
                    }
                    if (r6 == 1 || r6 == 2 || r6 == 3) {
                        this.f8150nufgyqmvbu.put(Integer.valueOf(iobyxmoadgVarKcexrzcfyt.f8171iobyxmoadg), iobyxmoadgVarKcexrzcfyt);
                        iobyxmoadgVarKcexrzcfyt = null;
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e13) {
            Log.e("ConstraintSet", "Error parsing XML resource", e13);
        } catch (XmlPullParserException e14) {
            Log.e("ConstraintSet", "Error parsing XML resource", e14);
        }
    }

    public int[] iwizpuwonk() {
        Integer[] numArr = (Integer[]) this.f8150nufgyqmvbu.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i13 = 0; i13 < length; i13++) {
            iArr[i13] = numArr[i13].intValue();
        }
        return iArr;
    }

    public int jyumaefscl(int i13) {
        return zdlpuopuiu(i13).f8169eablkybsjg.f8221eablkybsjg;
    }

    public void kegysxyocb(boolean z13) {
        this.f8148iobyxmoadg = z13;
    }

    public int lereixgezr(int i13) {
        return zdlpuopuiu(i13).f8174ppxfxbqfkf.f8206ppxfxbqfkf;
    }

    public void lqeggnwhkg(ConstraintLayout constraintLayout) {
        iobyxmoadg iobyxmoadgVar;
        int childCount = constraintLayout.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = constraintLayout.getChildAt(i13);
            int id2 = childAt.getId();
            if (!this.f8150nufgyqmvbu.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + androidx.constraintlayout.motion.widget.iobyxmoadg.wkgbmnqykc(childAt));
            } else {
                if (this.f8149lqeggnwhkg && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (this.f8150nufgyqmvbu.containsKey(Integer.valueOf(id2)) && (iobyxmoadgVar = (iobyxmoadg) this.f8150nufgyqmvbu.get(Integer.valueOf(id2))) != null) {
                    androidx.constraintlayout.widget.iobyxmoadg.btonecajqb(childAt, iobyxmoadgVar.f8172lqeggnwhkg);
                }
            }
        }
    }

    public void nufgyqmvbu(wkgbmnqykc wkgbmnqykcVar) {
        for (iobyxmoadg iobyxmoadgVar : wkgbmnqykcVar.f8150nufgyqmvbu.values()) {
            if (iobyxmoadgVar.f8173nufgyqmvbu != null) {
                if (iobyxmoadgVar.f8176zoijcleaow == null) {
                    iobyxmoadgVar.f8173nufgyqmvbu.eablkybsjg(yggfygwlhe(iobyxmoadgVar.f8171iobyxmoadg));
                } else {
                    Iterator it = this.f8150nufgyqmvbu.keySet().iterator();
                    while (it.hasNext()) {
                        iobyxmoadg iobyxmoadgVarYggfygwlhe = yggfygwlhe(((Integer) it.next()).intValue());
                        String str = iobyxmoadgVarYggfygwlhe.f8169eablkybsjg.f8257sflfametgt;
                        if (str != null && iobyxmoadgVar.f8176zoijcleaow.matches(str)) {
                            iobyxmoadgVar.f8173nufgyqmvbu.eablkybsjg(iobyxmoadgVarYggfygwlhe);
                            iobyxmoadgVarYggfygwlhe.f8172lqeggnwhkg.putAll((HashMap) iobyxmoadgVar.f8172lqeggnwhkg.clone());
                        }
                    }
                }
            }
        }
    }

    public void ojitshcjhn(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f8150nufgyqmvbu.clear();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = constraintLayout.getChildAt(i13);
            ConstraintLayout.zoijcleaow zoijcleaowVar = (ConstraintLayout.zoijcleaow) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f8149lqeggnwhkg && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f8150nufgyqmvbu.containsKey(Integer.valueOf(id2))) {
                this.f8150nufgyqmvbu.put(Integer.valueOf(id2), new iobyxmoadg());
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) this.f8150nufgyqmvbu.get(Integer.valueOf(id2));
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.f8172lqeggnwhkg = androidx.constraintlayout.widget.iobyxmoadg.zoijcleaow(this.f8147gxszxtbevo, childAt);
                iobyxmoadgVar.eablkybsjg(id2, zoijcleaowVar);
                iobyxmoadgVar.f8174ppxfxbqfkf.f8208zoijcleaow = childAt.getVisibility();
                iobyxmoadgVar.f8174ppxfxbqfkf.f8207wkgbmnqykc = childAt.getAlpha();
                iobyxmoadgVar.f8170gxszxtbevo.f8168zoijcleaow = childAt.getRotation();
                iobyxmoadgVar.f8170gxszxtbevo.f8165ppxfxbqfkf = childAt.getRotationX();
                iobyxmoadgVar.f8170gxszxtbevo.f8167wkgbmnqykc = childAt.getRotationY();
                iobyxmoadgVar.f8170gxszxtbevo.f8159eablkybsjg = childAt.getScaleX();
                iobyxmoadgVar.f8170gxszxtbevo.f8161gxszxtbevo = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    eablkybsjg eablkybsjgVar = iobyxmoadgVar.f8170gxszxtbevo;
                    eablkybsjgVar.f8163lqeggnwhkg = pivotX;
                    eablkybsjgVar.f8164nufgyqmvbu = pivotY;
                }
                iobyxmoadgVar.f8170gxszxtbevo.f8156btonecajqb = childAt.getTranslationX();
                iobyxmoadgVar.f8170gxszxtbevo.f8160gtknphoqwx = childAt.getTranslationY();
                iobyxmoadgVar.f8170gxszxtbevo.f8157draadjrbmk = childAt.getTranslationZ();
                eablkybsjg eablkybsjgVar2 = iobyxmoadgVar.f8170gxszxtbevo;
                if (eablkybsjgVar2.f8166wflxmlrfwp) {
                    eablkybsjgVar2.f8155agtfadlqog = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    iobyxmoadgVar.f8169eablkybsjg.f8211bfopjjpdmp = barrier.getAllowsGoneWidget();
                    iobyxmoadgVar.f8169eablkybsjg.f8272yfnezrywwk = barrier.getReferencedIds();
                    iobyxmoadgVar.f8169eablkybsjg.f8256rlfsiqarku = barrier.getType();
                    iobyxmoadgVar.f8169eablkybsjg.f8217czzsidtyhn = barrier.getMargin();
                }
            }
        }
    }

    public void pkzmftpjix(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = constraintLayout.getChildAt(i13);
            ConstraintLayout.zoijcleaow zoijcleaowVar = (ConstraintLayout.zoijcleaow) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f8149lqeggnwhkg && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f8150nufgyqmvbu.containsKey(Integer.valueOf(id2))) {
                this.f8150nufgyqmvbu.put(Integer.valueOf(id2), new iobyxmoadg());
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) this.f8150nufgyqmvbu.get(Integer.valueOf(id2));
            if (iobyxmoadgVar != null) {
                if (!iobyxmoadgVar.f8169eablkybsjg.f8277zoijcleaow) {
                    iobyxmoadgVar.eablkybsjg(id2, zoijcleaowVar);
                    if (childAt instanceof androidx.constraintlayout.widget.zoijcleaow) {
                        iobyxmoadgVar.f8169eablkybsjg.f8272yfnezrywwk = ((androidx.constraintlayout.widget.zoijcleaow) childAt).getReferencedIds();
                        if (childAt instanceof Barrier) {
                            Barrier barrier = (Barrier) childAt;
                            iobyxmoadgVar.f8169eablkybsjg.f8211bfopjjpdmp = barrier.getAllowsGoneWidget();
                            iobyxmoadgVar.f8169eablkybsjg.f8256rlfsiqarku = barrier.getType();
                            iobyxmoadgVar.f8169eablkybsjg.f8217czzsidtyhn = barrier.getMargin();
                        }
                    }
                    iobyxmoadgVar.f8169eablkybsjg.f8277zoijcleaow = true;
                }
                C0131wkgbmnqykc c0131wkgbmnqykc = iobyxmoadgVar.f8174ppxfxbqfkf;
                if (!c0131wkgbmnqykc.f8205iobyxmoadg) {
                    c0131wkgbmnqykc.f8208zoijcleaow = childAt.getVisibility();
                    iobyxmoadgVar.f8174ppxfxbqfkf.f8207wkgbmnqykc = childAt.getAlpha();
                    iobyxmoadgVar.f8174ppxfxbqfkf.f8205iobyxmoadg = true;
                }
                eablkybsjg eablkybsjgVar = iobyxmoadgVar.f8170gxszxtbevo;
                if (!eablkybsjgVar.f8162iobyxmoadg) {
                    eablkybsjgVar.f8162iobyxmoadg = true;
                    eablkybsjgVar.f8168zoijcleaow = childAt.getRotation();
                    iobyxmoadgVar.f8170gxszxtbevo.f8165ppxfxbqfkf = childAt.getRotationX();
                    iobyxmoadgVar.f8170gxszxtbevo.f8167wkgbmnqykc = childAt.getRotationY();
                    iobyxmoadgVar.f8170gxszxtbevo.f8159eablkybsjg = childAt.getScaleX();
                    iobyxmoadgVar.f8170gxszxtbevo.f8161gxszxtbevo = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (pivotX != 0.0d || pivotY != 0.0d) {
                        eablkybsjg eablkybsjgVar2 = iobyxmoadgVar.f8170gxszxtbevo;
                        eablkybsjgVar2.f8163lqeggnwhkg = pivotX;
                        eablkybsjgVar2.f8164nufgyqmvbu = pivotY;
                    }
                    iobyxmoadgVar.f8170gxszxtbevo.f8156btonecajqb = childAt.getTranslationX();
                    iobyxmoadgVar.f8170gxszxtbevo.f8160gtknphoqwx = childAt.getTranslationY();
                    iobyxmoadgVar.f8170gxszxtbevo.f8157draadjrbmk = childAt.getTranslationZ();
                    eablkybsjg eablkybsjgVar3 = iobyxmoadgVar.f8170gxszxtbevo;
                    if (eablkybsjgVar3.f8166wflxmlrfwp) {
                        eablkybsjgVar3.f8155agtfadlqog = childAt.getElevation();
                    }
                }
            }
        }
    }

    public int pmvmpeiblj(int i13) {
        return zdlpuopuiu(i13).f8169eablkybsjg.f8266wkgbmnqykc;
    }

    public void rgvfuqvkyq(wkgbmnqykc wkgbmnqykcVar) {
        this.f8150nufgyqmvbu.clear();
        for (Integer num : wkgbmnqykcVar.f8150nufgyqmvbu.keySet()) {
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) wkgbmnqykcVar.f8150nufgyqmvbu.get(num);
            if (iobyxmoadgVar != null) {
                this.f8150nufgyqmvbu.put(num, iobyxmoadgVar.clone());
            }
        }
    }

    public void stevsuqkhv(String str) {
        this.f8152wkgbmnqykc = str.split(StringUtils.COMMA);
        int i13 = 0;
        while (true) {
            String[] strArr = this.f8152wkgbmnqykc;
            if (i13 >= strArr.length) {
                return;
            }
            strArr[i13] = strArr[i13].trim();
            i13++;
        }
    }

    public void vdvldrhtss(int i13, int i14, int i15, float f13) {
        zoijcleaow zoijcleaowVar = zdlpuopuiu(i13).f8169eablkybsjg;
        zoijcleaowVar.f8278zynmafqrjb = i14;
        zoijcleaowVar.f8230istkbnxepw = i15;
        zoijcleaowVar.f8213cdpycssgdh = f13;
    }

    public void wypolnanlu(boolean z13) {
        this.f8149lqeggnwhkg = z13;
    }

    public iobyxmoadg yggfygwlhe(int i13) {
        if (this.f8150nufgyqmvbu.containsKey(Integer.valueOf(i13))) {
            return (iobyxmoadg) this.f8150nufgyqmvbu.get(Integer.valueOf(i13));
        }
        return null;
    }

    public void zynmafqrjb(Context context, int i13) {
        XmlResourceParser xml = context.getResources().getXml(i13);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    iobyxmoadg iobyxmoadgVarKcexrzcfyt = kcexrzcfyt(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        iobyxmoadgVarKcexrzcfyt.f8169eablkybsjg.f8228iobyxmoadg = true;
                    }
                    this.f8150nufgyqmvbu.put(Integer.valueOf(iobyxmoadgVarKcexrzcfyt.f8171iobyxmoadg), iobyxmoadgVarKcexrzcfyt);
                }
            }
        } catch (IOException e13) {
            Log.e("ConstraintSet", "Error parsing resource: " + i13, e13);
        } catch (XmlPullParserException e14) {
            Log.e("ConstraintSet", "Error parsing resource: " + i13, e14);
        }
    }
}
