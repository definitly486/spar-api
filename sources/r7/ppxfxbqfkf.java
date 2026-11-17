package r7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.collection.esjtqupxsv;
import com.airbnb.lottie.btonecajqb;
import com.airbnb.lottie.dsvhmnatus;
import com.airbnb.lottie.hcddaimhww;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l7.vdvldrhtss;

/* JADX INFO: loaded from: classes2.dex */
public class ppxfxbqfkf extends zoijcleaow {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private l7.iobyxmoadg f81933cdpycssgdh;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private final RectF f81934iozdgvuglv;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private final RectF f81935lmojexxdyd;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private boolean f81936pkzmftpjix;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private final Paint f81937wwaezpbzkn;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private final List f81938yadqdtsiqt;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private float f81939ylkuphrtab;

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f81940iobyxmoadg;

        static {
            int[] iArr = new int[eablkybsjg.zoijcleaow.values().length];
            f81940iobyxmoadg = iArr;
            try {
                iArr[eablkybsjg.zoijcleaow.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f81940iobyxmoadg[eablkybsjg.zoijcleaow.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ppxfxbqfkf(hcddaimhww hcddaimhwwVar, eablkybsjg eablkybsjgVar, List list, btonecajqb btonecajqbVar) {
        int i13;
        zoijcleaow zoijcleaowVar;
        super(hcddaimhwwVar, eablkybsjgVar);
        this.f81938yadqdtsiqt = new ArrayList();
        this.f81934iozdgvuglv = new RectF();
        this.f81935lmojexxdyd = new RectF();
        this.f81937wwaezpbzkn = new Paint();
        this.f81936pkzmftpjix = true;
        p7.zoijcleaow zoijcleaowVarJyumaefscl = eablkybsjgVar.jyumaefscl();
        if (zoijcleaowVarJyumaefscl != null) {
            l7.iobyxmoadg iobyxmoadgVarEablkybsjg = zoijcleaowVarJyumaefscl.eablkybsjg();
            this.f81933cdpycssgdh = iobyxmoadgVarEablkybsjg;
            btonecajqb(iobyxmoadgVarEablkybsjg);
            this.f81933cdpycssgdh.iobyxmoadg(this);
        } else {
            this.f81933cdpycssgdh = null;
        }
        esjtqupxsv esjtqupxsvVar = new esjtqupxsv(btonecajqbVar.gtknphoqwx().size());
        int size = list.size() - 1;
        zoijcleaow zoijcleaowVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            eablkybsjg eablkybsjgVar2 = (eablkybsjg) list.get(size);
            zoijcleaow zoijcleaowVarJyumaefscl2 = zoijcleaow.jyumaefscl(this, eablkybsjgVar2, hcddaimhwwVar, btonecajqbVar);
            if (zoijcleaowVarJyumaefscl2 != null) {
                esjtqupxsvVar.nufgyqmvbu(zoijcleaowVarJyumaefscl2.pmvmpeiblj().eablkybsjg(), zoijcleaowVarJyumaefscl2);
                if (zoijcleaowVar2 != null) {
                    zoijcleaowVar2.hcddaimhww(zoijcleaowVarJyumaefscl2);
                    zoijcleaowVar2 = null;
                } else {
                    this.f81938yadqdtsiqt.add(0, zoijcleaowVarJyumaefscl2);
                    int i14 = iobyxmoadg.f81940iobyxmoadg[eablkybsjgVar2.dxjokdxxww().ordinal()];
                    if (i14 == 1 || i14 == 2) {
                        zoijcleaowVar2 = zoijcleaowVarJyumaefscl2;
                    }
                }
            }
            size--;
        }
        for (i13 = 0; i13 < esjtqupxsvVar.wflxmlrfwp(); i13++) {
            zoijcleaow zoijcleaowVar3 = (zoijcleaow) esjtqupxsvVar.wkgbmnqykc(esjtqupxsvVar.lqeggnwhkg(i13));
            if (zoijcleaowVar3 != null && (zoijcleaowVar = (zoijcleaow) esjtqupxsvVar.wkgbmnqykc(zoijcleaowVar3.pmvmpeiblj().gtknphoqwx())) != null) {
                zoijcleaowVar3.hkdspvbjdz(zoijcleaowVar);
            }
        }
    }

    @Override // r7.zoijcleaow
    public void cllcsxoeiz(float f13) {
        com.airbnb.lottie.eablkybsjg.zoijcleaow("CompositionLayer#setProgress");
        this.f81939ylkuphrtab = f13;
        super.cllcsxoeiz(f13);
        if (this.f81933cdpycssgdh != null) {
            f13 = ((((Float) this.f81933cdpycssgdh.nufgyqmvbu()).floatValue() * this.f81969vdvldrhtss.ppxfxbqfkf().dxjokdxxww()) - this.f81969vdvldrhtss.ppxfxbqfkf().rgvfuqvkyq()) / (this.f81968rgvfuqvkyq.pkzmftpjix().eablkybsjg() + 0.01f);
        }
        if (this.f81933cdpycssgdh == null) {
            f13 -= this.f81969vdvldrhtss.kcexrzcfyt();
        }
        if (this.f81969vdvldrhtss.iwizpuwonk() != 0.0f && !"__container".equals(this.f81969vdvldrhtss.btonecajqb())) {
            f13 /= this.f81969vdvldrhtss.iwizpuwonk();
        }
        for (int size = this.f81938yadqdtsiqt.size() - 1; size >= 0; size--) {
            ((zoijcleaow) this.f81938yadqdtsiqt.get(size)).cllcsxoeiz(f13);
        }
        com.airbnb.lottie.eablkybsjg.ppxfxbqfkf("CompositionLayer#setProgress");
    }

    @Override // r7.zoijcleaow, k7.eablkybsjg
    public void eablkybsjg(RectF rectF, Matrix matrix, boolean z13) {
        super.eablkybsjg(rectF, matrix, z13);
        for (int size = this.f81938yadqdtsiqt.size() - 1; size >= 0; size--) {
            this.f81934iozdgvuglv.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((zoijcleaow) this.f81938yadqdtsiqt.get(size)).eablkybsjg(this.f81934iozdgvuglv, this.f81964ojitshcjhn, true);
            rectF.union(this.f81934iozdgvuglv);
        }
    }

    @Override // r7.zoijcleaow
    public void jpowsppfya(boolean z13) {
        super.jpowsppfya(z13);
        Iterator it = this.f81938yadqdtsiqt.iterator();
        while (it.hasNext()) {
            ((zoijcleaow) it.next()).jpowsppfya(z13);
        }
    }

    public void kegysxyocb(boolean z13) {
        this.f81936pkzmftpjix = z13;
    }

    @Override // r7.zoijcleaow, o7.gxszxtbevo
    public void nufgyqmvbu(Object obj, w7.ppxfxbqfkf ppxfxbqfkfVar) {
        super.nufgyqmvbu(obj, ppxfxbqfkfVar);
        if (obj == dsvhmnatus.f20391yadqdtsiqt) {
            if (ppxfxbqfkfVar == null) {
                l7.iobyxmoadg iobyxmoadgVar = this.f81933cdpycssgdh;
                if (iobyxmoadgVar != null) {
                    iobyxmoadgVar.ojitshcjhn(null);
                    return;
                }
                return;
            }
            vdvldrhtss vdvldrhtssVar = new vdvldrhtss(ppxfxbqfkfVar);
            this.f81933cdpycssgdh = vdvldrhtssVar;
            vdvldrhtssVar.iobyxmoadg(this);
            btonecajqb(this.f81933cdpycssgdh);
        }
    }

    @Override // r7.zoijcleaow
    protected void pkzmftpjix(o7.eablkybsjg eablkybsjgVar, int i13, List list, o7.eablkybsjg eablkybsjgVar2) {
        for (int i14 = 0; i14 < this.f81938yadqdtsiqt.size(); i14++) {
            ((zoijcleaow) this.f81938yadqdtsiqt.get(i14)).ppxfxbqfkf(eablkybsjgVar, i13, list, eablkybsjgVar2);
        }
    }

    public float stevsuqkhv() {
        return this.f81939ylkuphrtab;
    }

    @Override // r7.zoijcleaow
    void yggfygwlhe(Canvas canvas, Matrix matrix, int i13) {
        com.airbnb.lottie.eablkybsjg.zoijcleaow("CompositionLayer#draw");
        this.f81935lmojexxdyd.set(0.0f, 0.0f, this.f81969vdvldrhtss.wflxmlrfwp(), this.f81969vdvldrhtss.draadjrbmk());
        matrix.mapRect(this.f81935lmojexxdyd);
        boolean z13 = this.f81968rgvfuqvkyq.xrmfcynszj() && this.f81938yadqdtsiqt.size() > 1 && i13 != 255;
        if (z13) {
            this.f81937wwaezpbzkn.setAlpha(i13);
            v7.btonecajqb.wflxmlrfwp(canvas, this.f81935lmojexxdyd, this.f81937wwaezpbzkn);
        } else {
            canvas.save();
        }
        if (z13) {
            i13 = 255;
        }
        for (int size = this.f81938yadqdtsiqt.size() - 1; size >= 0; size--) {
            if (((this.f81936pkzmftpjix || !"__container".equals(this.f81969vdvldrhtss.btonecajqb())) && !this.f81935lmojexxdyd.isEmpty()) ? canvas.clipRect(this.f81935lmojexxdyd) : true) {
                ((zoijcleaow) this.f81938yadqdtsiqt.get(size)).dxjokdxxww(canvas, matrix, i13);
            }
        }
        canvas.restore();
        com.airbnb.lottie.eablkybsjg.ppxfxbqfkf("CompositionLayer#draw");
    }
}
