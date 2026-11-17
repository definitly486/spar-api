package r7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import androidx.collection.esjtqupxsv;
import com.airbnb.lottie.btonecajqb;
import com.airbnb.lottie.dsvhmnatus;
import com.airbnb.lottie.hcddaimhww;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinVersion;
import l7.ojitshcjhn;
import p7.gtknphoqwx;
import q7.vdvldrhtss;

/* JADX INFO: loaded from: classes2.dex */
public class dxjokdxxww extends r7.zoijcleaow {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final StringBuilder f81857cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private final btonecajqb f81858cllcsxoeiz;

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    private l7.iobyxmoadg f81859crxdokpmqz;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private l7.iobyxmoadg f81860dsvhmnatus;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private final List f81861hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private final hcddaimhww f81862hkdspvbjdz;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private final Matrix f81863iozdgvuglv;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private final ojitshcjhn f81864jpowsppfya;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private l7.iobyxmoadg f81865kegysxyocb;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private final Paint f81866lmojexxdyd;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    private l7.iobyxmoadg f81867mbcevpiqjq;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    private l7.iobyxmoadg f81868ntlheqmsrt;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private final esjtqupxsv f81869pkzmftpjix;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    private l7.iobyxmoadg f81870sopmlzcsov;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private l7.iobyxmoadg f81871stevsuqkhv;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private l7.iobyxmoadg f81872tzroggbefp;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    private l7.iobyxmoadg f81873ulzqkzuiru;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private final Paint f81874wwaezpbzkn;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private l7.iobyxmoadg f81875wypolnanlu;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private final RectF f81876yadqdtsiqt;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private final Map f81877ylkuphrtab;

    class iobyxmoadg extends Paint {
        iobyxmoadg(int i13) {
            super(i13);
            setStyle(Paint.Style.FILL);
        }
    }

    static /* synthetic */ class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f81879iobyxmoadg;

        static {
            int[] iArr = new int[o7.zoijcleaow.iobyxmoadg.values().length];
            f81879iobyxmoadg = iArr;
            try {
                iArr[o7.zoijcleaow.iobyxmoadg.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f81879iobyxmoadg[o7.zoijcleaow.iobyxmoadg.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f81879iobyxmoadg[o7.zoijcleaow.iobyxmoadg.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    class zoijcleaow extends Paint {
        zoijcleaow(int i13) {
            super(i13);
            setStyle(Paint.Style.STROKE);
        }
    }

    dxjokdxxww(hcddaimhww hcddaimhwwVar, eablkybsjg eablkybsjgVar) {
        p7.zoijcleaow zoijcleaowVar;
        p7.zoijcleaow zoijcleaowVar2;
        p7.iobyxmoadg iobyxmoadgVar;
        p7.iobyxmoadg iobyxmoadgVar2;
        super(hcddaimhwwVar, eablkybsjgVar);
        this.f81857cdpycssgdh = new StringBuilder(2);
        this.f81876yadqdtsiqt = new RectF();
        this.f81863iozdgvuglv = new Matrix();
        this.f81866lmojexxdyd = new iobyxmoadg(1);
        this.f81874wwaezpbzkn = new zoijcleaow(1);
        this.f81877ylkuphrtab = new HashMap();
        this.f81869pkzmftpjix = new esjtqupxsv();
        this.f81861hcddaimhww = new ArrayList();
        this.f81862hkdspvbjdz = hcddaimhwwVar;
        this.f81858cllcsxoeiz = eablkybsjgVar.ppxfxbqfkf();
        ojitshcjhn ojitshcjhnVarEablkybsjg = eablkybsjgVar.zdlpuopuiu().eablkybsjg();
        this.f81864jpowsppfya = ojitshcjhnVarEablkybsjg;
        ojitshcjhnVarEablkybsjg.iobyxmoadg(this);
        btonecajqb(ojitshcjhnVarEablkybsjg);
        gtknphoqwx gtknphoqwxVarYggfygwlhe = eablkybsjgVar.yggfygwlhe();
        if (gtknphoqwxVarYggfygwlhe != null && (iobyxmoadgVar2 = gtknphoqwxVarYggfygwlhe.f75869iobyxmoadg) != null) {
            l7.iobyxmoadg iobyxmoadgVarEablkybsjg = iobyxmoadgVar2.eablkybsjg();
            this.f81860dsvhmnatus = iobyxmoadgVarEablkybsjg;
            iobyxmoadgVarEablkybsjg.iobyxmoadg(this);
            btonecajqb(this.f81860dsvhmnatus);
        }
        if (gtknphoqwxVarYggfygwlhe != null && (iobyxmoadgVar = gtknphoqwxVarYggfygwlhe.f75872zoijcleaow) != null) {
            l7.iobyxmoadg iobyxmoadgVarEablkybsjg2 = iobyxmoadgVar.eablkybsjg();
            this.f81871stevsuqkhv = iobyxmoadgVarEablkybsjg2;
            iobyxmoadgVarEablkybsjg2.iobyxmoadg(this);
            btonecajqb(this.f81871stevsuqkhv);
        }
        if (gtknphoqwxVarYggfygwlhe != null && (zoijcleaowVar2 = gtknphoqwxVarYggfygwlhe.f75870ppxfxbqfkf) != null) {
            l7.iobyxmoadg iobyxmoadgVarEablkybsjg3 = zoijcleaowVar2.eablkybsjg();
            this.f81872tzroggbefp = iobyxmoadgVarEablkybsjg3;
            iobyxmoadgVarEablkybsjg3.iobyxmoadg(this);
            btonecajqb(this.f81872tzroggbefp);
        }
        if (gtknphoqwxVarYggfygwlhe == null || (zoijcleaowVar = gtknphoqwxVarYggfygwlhe.f75871wkgbmnqykc) == null) {
            return;
        }
        l7.iobyxmoadg iobyxmoadgVarEablkybsjg4 = zoijcleaowVar.eablkybsjg();
        this.f81868ntlheqmsrt = iobyxmoadgVarEablkybsjg4;
        iobyxmoadgVarEablkybsjg4.iobyxmoadg(this);
        btonecajqb(this.f81868ntlheqmsrt);
    }

    private void crxdokpmqz(String str, o7.zoijcleaow zoijcleaowVar, o7.ppxfxbqfkf ppxfxbqfkfVar, Canvas canvas, float f13, float f14, float f15) {
        for (int i13 = 0; i13 < str.length(); i13++) {
            o7.wkgbmnqykc wkgbmnqykcVar = (o7.wkgbmnqykc) this.f81858cllcsxoeiz.ppxfxbqfkf().eablkybsjg(o7.wkgbmnqykc.ppxfxbqfkf(str.charAt(i13), ppxfxbqfkfVar.iobyxmoadg(), ppxfxbqfkfVar.ppxfxbqfkf()));
            if (wkgbmnqykcVar != null) {
                mbcevpiqjq(wkgbmnqykcVar, f14, zoijcleaowVar, canvas);
                canvas.translate((((float) wkgbmnqykcVar.zoijcleaow()) * f14 * v7.btonecajqb.eablkybsjg()) + f15, 0.0f);
            }
        }
    }

    private List ikoacuggdj(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private List jhduphickx(o7.wkgbmnqykc wkgbmnqykcVar) {
        if (this.f81877ylkuphrtab.containsKey(wkgbmnqykcVar)) {
            return (List) this.f81877ylkuphrtab.get(wkgbmnqykcVar);
        }
        List listIobyxmoadg = wkgbmnqykcVar.iobyxmoadg();
        int size = listIobyxmoadg.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i13 = 0; i13 < size; i13++) {
            arrayList.add(new k7.wkgbmnqykc(this.f81862hkdspvbjdz, this, (vdvldrhtss) listIobyxmoadg.get(i13), this.f81858cllcsxoeiz));
        }
        this.f81877ylkuphrtab.put(wkgbmnqykcVar, arrayList);
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0089  */
    /* JADX WARN: Code duplicated, block: B:20:0x0094  */
    /* JADX WARN: Code duplicated, block: B:22:0x0097  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cd A[SYNTHETIC] */
    private void jlmebxxoox(o7.zoijcleaow zoijcleaowVar, o7.ppxfxbqfkf ppxfxbqfkfVar, Canvas canvas) {
        float fFloatValue;
        float fEablkybsjg;
        List listIkoacuggdj;
        int size;
        int i13;
        int i14;
        PointF pointF;
        float f13;
        List listMetgxyhuhe;
        int i15;
        wkgbmnqykc wkgbmnqykcVar;
        Typeface typefaceOkpsazkaxt = okpsazkaxt(ppxfxbqfkfVar);
        if (typefaceOkpsazkaxt == null) {
            return;
        }
        String str = zoijcleaowVar.f72217iobyxmoadg;
        this.f81862hkdspvbjdz.vipkmwdibw();
        this.f81866lmojexxdyd.setTypeface(typefaceOkpsazkaxt);
        l7.iobyxmoadg iobyxmoadgVar = this.f81870sopmlzcsov;
        float fFloatValue2 = iobyxmoadgVar != null ? ((Float) iobyxmoadgVar.nufgyqmvbu()).floatValue() : zoijcleaowVar.f72220ppxfxbqfkf;
        this.f81866lmojexxdyd.setTextSize(v7.btonecajqb.eablkybsjg() * fFloatValue2);
        this.f81874wwaezpbzkn.setTypeface(this.f81866lmojexxdyd.getTypeface());
        this.f81874wwaezpbzkn.setTextSize(this.f81866lmojexxdyd.getTextSize());
        float f14 = zoijcleaowVar.f72214eablkybsjg / 10.0f;
        l7.iobyxmoadg iobyxmoadgVar2 = this.f81873ulzqkzuiru;
        if (iobyxmoadgVar2 == null) {
            l7.iobyxmoadg iobyxmoadgVar3 = this.f81868ntlheqmsrt;
            if (iobyxmoadgVar3 != null) {
                fFloatValue = ((Float) iobyxmoadgVar3.nufgyqmvbu()).floatValue();
            }
            fEablkybsjg = ((f14 * v7.btonecajqb.eablkybsjg()) * fFloatValue2) / 100.0f;
            listIkoacuggdj = ikoacuggdj(str);
            size = listIkoacuggdj.size();
            i13 = -1;
            i14 = 0;
            while (i14 < size) {
                String str2 = (String) listIkoacuggdj.get(i14);
                pointF = zoijcleaowVar.f72221wflxmlrfwp;
                if (pointF == null) {
                    f13 = 0.0f;
                } else {
                    f13 = pointF.x;
                }
                int i16 = i14;
                listMetgxyhuhe = metgxyhuhe(str2, f13, ppxfxbqfkfVar, 0.0f, fEablkybsjg, false);
                for (i15 = 0; i15 < listMetgxyhuhe.size(); i15++) {
                    wkgbmnqykcVar = (wkgbmnqykc) listMetgxyhuhe.get(i15);
                    i13++;
                    canvas.save();
                    if (xrmfcynszj(canvas, zoijcleaowVar, i13, wkgbmnqykcVar.f81881zoijcleaow)) {
                        ulzqkzuiru(wkgbmnqykcVar.f81880iobyxmoadg, zoijcleaowVar, canvas, fEablkybsjg);
                    }
                    canvas.restore();
                }
                i14 = i16 + 1;
            }
        }
        fFloatValue = ((Float) iobyxmoadgVar2.nufgyqmvbu()).floatValue();
        f14 += fFloatValue;
        fEablkybsjg = ((f14 * v7.btonecajqb.eablkybsjg()) * fFloatValue2) / 100.0f;
        listIkoacuggdj = ikoacuggdj(str);
        size = listIkoacuggdj.size();
        i13 = -1;
        i14 = 0;
        while (i14 < size) {
            String str3 = (String) listIkoacuggdj.get(i14);
            pointF = zoijcleaowVar.f72221wflxmlrfwp;
            if (pointF == null) {
                f13 = 0.0f;
            } else {
                f13 = pointF.x;
            }
            int i17 = i14;
            listMetgxyhuhe = metgxyhuhe(str3, f13, ppxfxbqfkfVar, 0.0f, fEablkybsjg, false);
            while (i15 < listMetgxyhuhe.size()) {
                wkgbmnqykcVar = (wkgbmnqykc) listMetgxyhuhe.get(i15);
                i13++;
                canvas.save();
                if (xrmfcynszj(canvas, zoijcleaowVar, i13, wkgbmnqykcVar.f81881zoijcleaow)) {
                    ulzqkzuiru(wkgbmnqykcVar.f81880iobyxmoadg, zoijcleaowVar, canvas, fEablkybsjg);
                }
                canvas.restore();
            }
            i14 = i17 + 1;
        }
    }

    private boolean jztzpxfvev(int i13) {
        return Character.getType(i13) == 16 || Character.getType(i13) == 27 || Character.getType(i13) == 6 || Character.getType(i13) == 28 || Character.getType(i13) == 8 || Character.getType(i13) == 19;
    }

    private void kegysxyocb(o7.zoijcleaow zoijcleaowVar, int i13) {
        l7.iobyxmoadg iobyxmoadgVar = this.f81875wypolnanlu;
        if (iobyxmoadgVar != null) {
            this.f81866lmojexxdyd.setColor(((Integer) iobyxmoadgVar.nufgyqmvbu()).intValue());
        } else {
            l7.iobyxmoadg iobyxmoadgVar2 = this.f81860dsvhmnatus;
            if (iobyxmoadgVar2 != null) {
                this.f81866lmojexxdyd.setColor(((Integer) iobyxmoadgVar2.nufgyqmvbu()).intValue());
            } else {
                this.f81866lmojexxdyd.setColor(zoijcleaowVar.f72219nufgyqmvbu);
            }
        }
        l7.iobyxmoadg iobyxmoadgVar3 = this.f81865kegysxyocb;
        if (iobyxmoadgVar3 != null) {
            this.f81874wwaezpbzkn.setColor(((Integer) iobyxmoadgVar3.nufgyqmvbu()).intValue());
        } else {
            l7.iobyxmoadg iobyxmoadgVar4 = this.f81871stevsuqkhv;
            if (iobyxmoadgVar4 != null) {
                this.f81874wwaezpbzkn.setColor(((Integer) iobyxmoadgVar4.nufgyqmvbu()).intValue());
            } else {
                this.f81874wwaezpbzkn.setColor(zoijcleaowVar.f72213dxjokdxxww);
            }
        }
        int iIntValue = ((((this.f81949cqumvgiudr.nufgyqmvbu() == null ? 100 : ((Integer) this.f81949cqumvgiudr.nufgyqmvbu().nufgyqmvbu()).intValue()) * KotlinVersion.MAX_COMPONENT_VALUE) / 100) * i13) / KotlinVersion.MAX_COMPONENT_VALUE;
        this.f81866lmojexxdyd.setAlpha(iIntValue);
        this.f81874wwaezpbzkn.setAlpha(iIntValue);
        l7.iobyxmoadg iobyxmoadgVar5 = this.f81867mbcevpiqjq;
        if (iobyxmoadgVar5 != null) {
            this.f81874wwaezpbzkn.setStrokeWidth(((Float) iobyxmoadgVar5.nufgyqmvbu()).floatValue());
            return;
        }
        l7.iobyxmoadg iobyxmoadgVar6 = this.f81872tzroggbefp;
        if (iobyxmoadgVar6 != null) {
            this.f81874wwaezpbzkn.setStrokeWidth(((Float) iobyxmoadgVar6.nufgyqmvbu()).floatValue());
        } else {
            this.f81874wwaezpbzkn.setStrokeWidth(zoijcleaowVar.f72211btonecajqb * v7.btonecajqb.eablkybsjg());
        }
    }

    private void mbcevpiqjq(o7.wkgbmnqykc wkgbmnqykcVar, float f13, o7.zoijcleaow zoijcleaowVar, Canvas canvas) {
        List listJhduphickx = jhduphickx(wkgbmnqykcVar);
        for (int i13 = 0; i13 < listJhduphickx.size(); i13++) {
            Path pathGxszxtbevo = ((k7.wkgbmnqykc) listJhduphickx.get(i13)).gxszxtbevo();
            pathGxszxtbevo.computeBounds(this.f81876yadqdtsiqt, false);
            this.f81863iozdgvuglv.reset();
            this.f81863iozdgvuglv.preTranslate(0.0f, (-zoijcleaowVar.f72218lqeggnwhkg) * v7.btonecajqb.eablkybsjg());
            this.f81863iozdgvuglv.preScale(f13, f13);
            pathGxszxtbevo.transform(this.f81863iozdgvuglv);
            if (zoijcleaowVar.f72215gtknphoqwx) {
                sopmlzcsov(pathGxszxtbevo, this.f81866lmojexxdyd, canvas);
                sopmlzcsov(pathGxszxtbevo, this.f81874wwaezpbzkn, canvas);
            } else {
                sopmlzcsov(pathGxszxtbevo, this.f81874wwaezpbzkn, canvas);
                sopmlzcsov(pathGxszxtbevo, this.f81866lmojexxdyd, canvas);
            }
        }
    }

    private List metgxyhuhe(String str, float f13, o7.ppxfxbqfkf ppxfxbqfkfVar, float f14, float f15, boolean z13) {
        float fMeasureText;
        int i13 = 0;
        int i14 = 0;
        boolean z14 = false;
        int i15 = 0;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        for (int i16 = 0; i16 < str.length(); i16++) {
            char cCharAt = str.charAt(i16);
            if (z13) {
                o7.wkgbmnqykc wkgbmnqykcVar = (o7.wkgbmnqykc) this.f81858cllcsxoeiz.ppxfxbqfkf().eablkybsjg(o7.wkgbmnqykc.ppxfxbqfkf(cCharAt, ppxfxbqfkfVar.iobyxmoadg(), ppxfxbqfkfVar.ppxfxbqfkf()));
                if (wkgbmnqykcVar != null) {
                    fMeasureText = ((float) wkgbmnqykcVar.zoijcleaow()) * f14 * v7.btonecajqb.eablkybsjg();
                }
            } else {
                fMeasureText = this.f81866lmojexxdyd.measureText(str.substring(i16, i16 + 1));
            }
            float f19 = fMeasureText + f15;
            if (cCharAt == ' ') {
                z14 = true;
                f18 = f19;
            } else if (z14) {
                z14 = false;
                i15 = i16;
                f17 = f19;
            } else {
                f17 += f19;
            }
            f16 += f19;
            if (f13 > 0.0f && f16 >= f13 && cCharAt != ' ') {
                i13++;
                wkgbmnqykc wkgbmnqykcVarVipkmwdibw = vipkmwdibw(i13);
                if (i15 == i14) {
                    String strSubstring = str.substring(i14, i16);
                    String strTrim = strSubstring.trim();
                    wkgbmnqykcVarVipkmwdibw.ppxfxbqfkf(strTrim, (f16 - f19) - ((strTrim.length() - strSubstring.length()) * f18));
                    i14 = i16;
                    i15 = i14;
                    f16 = f19;
                    f17 = f16;
                } else {
                    String strSubstring2 = str.substring(i14, i15 - 1);
                    String strTrim2 = strSubstring2.trim();
                    wkgbmnqykcVarVipkmwdibw.ppxfxbqfkf(strTrim2, ((f16 - f17) - ((strSubstring2.length() - strTrim2.length()) * f18)) - f18);
                    f16 = f17;
                    i14 = i15;
                }
            }
        }
        if (f16 > 0.0f) {
            i13++;
            vipkmwdibw(i13).ppxfxbqfkf(str.substring(i14), f16);
        }
        return this.f81861hcddaimhww.subList(0, i13);
    }

    private void ntlheqmsrt(String str, o7.zoijcleaow zoijcleaowVar, Canvas canvas) {
        if (zoijcleaowVar.f72215gtknphoqwx) {
            tzroggbefp(str, this.f81866lmojexxdyd, canvas);
            tzroggbefp(str, this.f81874wwaezpbzkn, canvas);
        } else {
            tzroggbefp(str, this.f81874wwaezpbzkn, canvas);
            tzroggbefp(str, this.f81866lmojexxdyd, canvas);
        }
    }

    private Typeface okpsazkaxt(o7.ppxfxbqfkf ppxfxbqfkfVar) {
        Typeface typeface;
        l7.iobyxmoadg iobyxmoadgVar = this.f81859crxdokpmqz;
        if (iobyxmoadgVar != null && (typeface = (Typeface) iobyxmoadgVar.nufgyqmvbu()) != null) {
            return typeface;
        }
        Typeface typefaceJhduphickx = this.f81862hkdspvbjdz.jhduphickx(ppxfxbqfkfVar);
        return typefaceJhduphickx != null ? typefaceJhduphickx : ppxfxbqfkfVar.wkgbmnqykc();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0053  */
    /* JADX WARN: Code duplicated, block: B:18:0x005e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0061  */
    /* JADX WARN: Code duplicated, block: B:24:0x007b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0092  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ab  */
    private void ribwqtqdhb(o7.zoijcleaow zoijcleaowVar, Matrix matrix, o7.ppxfxbqfkf ppxfxbqfkfVar, Canvas canvas) {
        float fFloatValue;
        float f13;
        int i13;
        int i14;
        PointF pointF;
        float f14;
        List listMetgxyhuhe;
        int i15;
        wkgbmnqykc wkgbmnqykcVar;
        int i16;
        l7.iobyxmoadg iobyxmoadgVar = this.f81870sopmlzcsov;
        float fFloatValue2 = (iobyxmoadgVar != null ? ((Float) iobyxmoadgVar.nufgyqmvbu()).floatValue() : zoijcleaowVar.f72220ppxfxbqfkf) / 100.0f;
        float fLqeggnwhkg = v7.btonecajqb.lqeggnwhkg(matrix);
        List listIkoacuggdj = ikoacuggdj(zoijcleaowVar.f72217iobyxmoadg);
        int size = listIkoacuggdj.size();
        float f15 = zoijcleaowVar.f72214eablkybsjg / 10.0f;
        l7.iobyxmoadg iobyxmoadgVar2 = this.f81873ulzqkzuiru;
        if (iobyxmoadgVar2 == null) {
            l7.iobyxmoadg iobyxmoadgVar3 = this.f81868ntlheqmsrt;
            if (iobyxmoadgVar3 != null) {
                fFloatValue = ((Float) iobyxmoadgVar3.nufgyqmvbu()).floatValue();
            }
            f13 = f15;
            i13 = -1;
            i14 = 0;
            while (i14 < size) {
                String str = (String) listIkoacuggdj.get(i14);
                pointF = zoijcleaowVar.f72221wflxmlrfwp;
                if (pointF == null) {
                    f14 = 0.0f;
                } else {
                    f14 = pointF.x;
                }
                int i17 = i14;
                listMetgxyhuhe = metgxyhuhe(str, f14, ppxfxbqfkfVar, fFloatValue2, f13, true);
                i15 = 0;
                while (i15 < listMetgxyhuhe.size()) {
                    wkgbmnqykcVar = (wkgbmnqykc) listMetgxyhuhe.get(i15);
                    i16 = i13 + 1;
                    canvas.save();
                    if (xrmfcynszj(canvas, zoijcleaowVar, i16, wkgbmnqykcVar.f81881zoijcleaow)) {
                        crxdokpmqz(wkgbmnqykcVar.f81880iobyxmoadg, zoijcleaowVar, ppxfxbqfkfVar, canvas, fLqeggnwhkg, fFloatValue2, f13);
                    }
                    canvas.restore();
                    i15++;
                    listMetgxyhuhe = listMetgxyhuhe;
                    i13 = i16;
                }
                i14 = i17 + 1;
            }
        }
        fFloatValue = ((Float) iobyxmoadgVar2.nufgyqmvbu()).floatValue();
        f15 += fFloatValue;
        f13 = f15;
        i13 = -1;
        i14 = 0;
        while (i14 < size) {
            String str2 = (String) listIkoacuggdj.get(i14);
            pointF = zoijcleaowVar.f72221wflxmlrfwp;
            if (pointF == null) {
                f14 = 0.0f;
            } else {
                f14 = pointF.x;
            }
            int i18 = i14;
            listMetgxyhuhe = metgxyhuhe(str2, f14, ppxfxbqfkfVar, fFloatValue2, f13, true);
            i15 = 0;
            while (i15 < listMetgxyhuhe.size()) {
                wkgbmnqykcVar = (wkgbmnqykc) listMetgxyhuhe.get(i15);
                i16 = i13 + 1;
                canvas.save();
                if (xrmfcynszj(canvas, zoijcleaowVar, i16, wkgbmnqykcVar.f81881zoijcleaow)) {
                    crxdokpmqz(wkgbmnqykcVar.f81880iobyxmoadg, zoijcleaowVar, ppxfxbqfkfVar, canvas, fLqeggnwhkg, fFloatValue2, f13);
                }
                canvas.restore();
                i15++;
                listMetgxyhuhe = listMetgxyhuhe;
                i13 = i16;
            }
            i14 = i18 + 1;
        }
    }

    private void sopmlzcsov(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private String stevsuqkhv(String str, int i13) {
        int iCodePointAt = str.codePointAt(i13);
        int iCharCount = Character.charCount(iCodePointAt) + i13;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (!jztzpxfvev(iCodePointAt2)) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j13 = iCodePointAt;
        if (this.f81869pkzmftpjix.ppxfxbqfkf(j13)) {
            return (String) this.f81869pkzmftpjix.wkgbmnqykc(j13);
        }
        this.f81857cdpycssgdh.setLength(0);
        while (i13 < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i13);
            this.f81857cdpycssgdh.appendCodePoint(iCodePointAt3);
            i13 += Character.charCount(iCodePointAt3);
        }
        String string = this.f81857cdpycssgdh.toString();
        this.f81869pkzmftpjix.nufgyqmvbu(j13, string);
        return string;
    }

    private void tzroggbefp(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private void ulzqkzuiru(String str, o7.zoijcleaow zoijcleaowVar, Canvas canvas, float f13) {
        int length = 0;
        while (length < str.length()) {
            String strStevsuqkhv = stevsuqkhv(str, length);
            length += strStevsuqkhv.length();
            ntlheqmsrt(strStevsuqkhv, zoijcleaowVar, canvas);
            canvas.translate(this.f81866lmojexxdyd.measureText(strStevsuqkhv) + f13, 0.0f);
        }
    }

    private wkgbmnqykc vipkmwdibw(int i13) {
        for (int size = this.f81861hcddaimhww.size(); size < i13; size++) {
            this.f81861hcddaimhww.add(new wkgbmnqykc(null));
        }
        return (wkgbmnqykc) this.f81861hcddaimhww.get(i13 - 1);
    }

    private boolean xrmfcynszj(Canvas canvas, o7.zoijcleaow zoijcleaowVar, int i13, float f13) {
        PointF pointF = zoijcleaowVar.f72212draadjrbmk;
        PointF pointF2 = zoijcleaowVar.f72221wflxmlrfwp;
        float fEablkybsjg = v7.btonecajqb.eablkybsjg();
        float f14 = (i13 * zoijcleaowVar.f72216gxszxtbevo * fEablkybsjg) + (pointF == null ? 0.0f : (zoijcleaowVar.f72216gxszxtbevo * fEablkybsjg) + pointF.y);
        if (this.f81862hkdspvbjdz.wwaezpbzkn() && pointF2 != null && pointF != null && f14 >= pointF.y + pointF2.y + zoijcleaowVar.f72220ppxfxbqfkf) {
            return false;
        }
        float f15 = pointF == null ? 0.0f : pointF.x;
        float f16 = pointF2 != null ? pointF2.x : 0.0f;
        int i14 = ppxfxbqfkf.f81879iobyxmoadg[zoijcleaowVar.f72222wkgbmnqykc.ordinal()];
        if (i14 == 1) {
            canvas.translate(f15, f14);
        } else if (i14 == 2) {
            canvas.translate((f15 + f16) - f13, f14);
        } else if (i14 == 3) {
            canvas.translate((f15 + (f16 / 2.0f)) - (f13 / 2.0f), f14);
        }
        return true;
    }

    @Override // r7.zoijcleaow, k7.eablkybsjg
    public void eablkybsjg(RectF rectF, Matrix matrix, boolean z13) {
        super.eablkybsjg(rectF, matrix, z13);
        rectF.set(0.0f, 0.0f, this.f81858cllcsxoeiz.zoijcleaow().width(), this.f81858cllcsxoeiz.zoijcleaow().height());
    }

    @Override // r7.zoijcleaow, o7.gxszxtbevo
    public void nufgyqmvbu(Object obj, w7.ppxfxbqfkf ppxfxbqfkfVar) {
        super.nufgyqmvbu(obj, ppxfxbqfkfVar);
        if (obj == dsvhmnatus.f20369iobyxmoadg) {
            l7.iobyxmoadg iobyxmoadgVar = this.f81875wypolnanlu;
            if (iobyxmoadgVar != null) {
                ylkuphrtab(iobyxmoadgVar);
            }
            if (ppxfxbqfkfVar == null) {
                this.f81875wypolnanlu = null;
                return;
            }
            l7.vdvldrhtss vdvldrhtssVar = new l7.vdvldrhtss(ppxfxbqfkfVar);
            this.f81875wypolnanlu = vdvldrhtssVar;
            vdvldrhtssVar.iobyxmoadg(this);
            btonecajqb(this.f81875wypolnanlu);
            return;
        }
        if (obj == dsvhmnatus.f20395zoijcleaow) {
            l7.iobyxmoadg iobyxmoadgVar2 = this.f81865kegysxyocb;
            if (iobyxmoadgVar2 != null) {
                ylkuphrtab(iobyxmoadgVar2);
            }
            if (ppxfxbqfkfVar == null) {
                this.f81865kegysxyocb = null;
                return;
            }
            l7.vdvldrhtss vdvldrhtssVar2 = new l7.vdvldrhtss(ppxfxbqfkfVar);
            this.f81865kegysxyocb = vdvldrhtssVar2;
            vdvldrhtssVar2.iobyxmoadg(this);
            btonecajqb(this.f81865kegysxyocb);
            return;
        }
        if (obj == dsvhmnatus.f20375kcexrzcfyt) {
            l7.iobyxmoadg iobyxmoadgVar3 = this.f81867mbcevpiqjq;
            if (iobyxmoadgVar3 != null) {
                ylkuphrtab(iobyxmoadgVar3);
            }
            if (ppxfxbqfkfVar == null) {
                this.f81867mbcevpiqjq = null;
                return;
            }
            l7.vdvldrhtss vdvldrhtssVar3 = new l7.vdvldrhtss(ppxfxbqfkfVar);
            this.f81867mbcevpiqjq = vdvldrhtssVar3;
            vdvldrhtssVar3.iobyxmoadg(this);
            btonecajqb(this.f81867mbcevpiqjq);
            return;
        }
        if (obj == dsvhmnatus.f20394zdlpuopuiu) {
            l7.iobyxmoadg iobyxmoadgVar4 = this.f81873ulzqkzuiru;
            if (iobyxmoadgVar4 != null) {
                ylkuphrtab(iobyxmoadgVar4);
            }
            if (ppxfxbqfkfVar == null) {
                this.f81873ulzqkzuiru = null;
                return;
            }
            l7.vdvldrhtss vdvldrhtssVar4 = new l7.vdvldrhtss(ppxfxbqfkfVar);
            this.f81873ulzqkzuiru = vdvldrhtssVar4;
            vdvldrhtssVar4.iobyxmoadg(this);
            btonecajqb(this.f81873ulzqkzuiru);
            return;
        }
        if (obj == dsvhmnatus.f20370iozdgvuglv) {
            l7.iobyxmoadg iobyxmoadgVar5 = this.f81870sopmlzcsov;
            if (iobyxmoadgVar5 != null) {
                ylkuphrtab(iobyxmoadgVar5);
            }
            if (ppxfxbqfkfVar == null) {
                this.f81870sopmlzcsov = null;
                return;
            }
            l7.vdvldrhtss vdvldrhtssVar5 = new l7.vdvldrhtss(ppxfxbqfkfVar);
            this.f81870sopmlzcsov = vdvldrhtssVar5;
            vdvldrhtssVar5.iobyxmoadg(this);
            btonecajqb(this.f81870sopmlzcsov);
            return;
        }
        if (obj != dsvhmnatus.f20368hkdspvbjdz) {
            if (obj == dsvhmnatus.f20361dsvhmnatus) {
                this.f81864jpowsppfya.oxmwwwfdhm(ppxfxbqfkfVar);
                return;
            }
            return;
        }
        l7.iobyxmoadg iobyxmoadgVar6 = this.f81859crxdokpmqz;
        if (iobyxmoadgVar6 != null) {
            ylkuphrtab(iobyxmoadgVar6);
        }
        if (ppxfxbqfkfVar == null) {
            this.f81859crxdokpmqz = null;
            return;
        }
        l7.vdvldrhtss vdvldrhtssVar6 = new l7.vdvldrhtss(ppxfxbqfkfVar);
        this.f81859crxdokpmqz = vdvldrhtssVar6;
        vdvldrhtssVar6.iobyxmoadg(this);
        btonecajqb(this.f81859crxdokpmqz);
    }

    @Override // r7.zoijcleaow
    void yggfygwlhe(Canvas canvas, Matrix matrix, int i13) {
        o7.zoijcleaow zoijcleaowVar = (o7.zoijcleaow) this.f81864jpowsppfya.nufgyqmvbu();
        o7.ppxfxbqfkf ppxfxbqfkfVar = (o7.ppxfxbqfkf) this.f81858cllcsxoeiz.lqeggnwhkg().get(zoijcleaowVar.f72223zoijcleaow);
        if (ppxfxbqfkfVar == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        kegysxyocb(zoijcleaowVar, i13);
        if (this.f81862hkdspvbjdz.o()) {
            ribwqtqdhb(zoijcleaowVar, matrix, ppxfxbqfkfVar, canvas);
        } else {
            jlmebxxoox(zoijcleaowVar, ppxfxbqfkfVar, canvas);
        }
        canvas.restore();
    }

    private static class wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private String f81880iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private float f81881zoijcleaow;

        private wkgbmnqykc() {
            this.f81880iobyxmoadg = "";
            this.f81881zoijcleaow = 0.0f;
        }

        void ppxfxbqfkf(String str, float f13) {
            this.f81880iobyxmoadg = str;
            this.f81881zoijcleaow = f13;
        }

        /* synthetic */ wkgbmnqykc(iobyxmoadg iobyxmoadgVar) {
            this();
        }
    }
}
