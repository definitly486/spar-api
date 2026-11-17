package r7;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.airbnb.lottie.dsvhmnatus;
import com.airbnb.lottie.hcddaimhww;
import com.airbnb.lottie.jpowsppfya;
import l7.vdvldrhtss;
import v7.btonecajqb;

/* JADX INFO: loaded from: classes2.dex */
public class wkgbmnqykc extends zoijcleaow {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final Paint f81941cdpycssgdh;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private final Rect f81942iozdgvuglv;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private final jpowsppfya f81943lmojexxdyd;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private l7.iobyxmoadg f81944wwaezpbzkn;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private final Rect f81945yadqdtsiqt;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private l7.iobyxmoadg f81946ylkuphrtab;

    wkgbmnqykc(hcddaimhww hcddaimhwwVar, eablkybsjg eablkybsjgVar) {
        super(hcddaimhwwVar, eablkybsjgVar);
        this.f81941cdpycssgdh = new j7.iobyxmoadg(3);
        this.f81945yadqdtsiqt = new Rect();
        this.f81942iozdgvuglv = new Rect();
        this.f81943lmojexxdyd = hcddaimhwwVar.wypolnanlu(eablkybsjgVar.agtfadlqog());
    }

    private Bitmap stevsuqkhv() {
        Bitmap bitmap;
        l7.iobyxmoadg iobyxmoadgVar = this.f81946ylkuphrtab;
        if (iobyxmoadgVar != null && (bitmap = (Bitmap) iobyxmoadgVar.nufgyqmvbu()) != null) {
            return bitmap;
        }
        Bitmap bitmapLmojexxdyd = this.f81968rgvfuqvkyq.lmojexxdyd(this.f81969vdvldrhtss.agtfadlqog());
        if (bitmapLmojexxdyd != null) {
            return bitmapLmojexxdyd;
        }
        jpowsppfya jpowsppfyaVar = this.f81943lmojexxdyd;
        if (jpowsppfyaVar != null) {
            return jpowsppfyaVar.zoijcleaow();
        }
        return null;
    }

    @Override // r7.zoijcleaow, k7.eablkybsjg
    public void eablkybsjg(RectF rectF, Matrix matrix, boolean z13) {
        super.eablkybsjg(rectF, matrix, z13);
        if (this.f81943lmojexxdyd != null) {
            float fEablkybsjg = btonecajqb.eablkybsjg();
            rectF.set(0.0f, 0.0f, this.f81943lmojexxdyd.gxszxtbevo() * fEablkybsjg, this.f81943lmojexxdyd.wkgbmnqykc() * fEablkybsjg);
            this.f81964ojitshcjhn.mapRect(rectF);
        }
    }

    @Override // r7.zoijcleaow, o7.gxszxtbevo
    public void nufgyqmvbu(Object obj, w7.ppxfxbqfkf ppxfxbqfkfVar) {
        super.nufgyqmvbu(obj, ppxfxbqfkfVar);
        if (obj == dsvhmnatus.f20367hcddaimhww) {
            if (ppxfxbqfkfVar == null) {
                this.f81944wwaezpbzkn = null;
                return;
            } else {
                this.f81944wwaezpbzkn = new vdvldrhtss(ppxfxbqfkfVar);
                return;
            }
        }
        if (obj == dsvhmnatus.f20358cllcsxoeiz) {
            if (ppxfxbqfkfVar == null) {
                this.f81946ylkuphrtab = null;
            } else {
                this.f81946ylkuphrtab = new vdvldrhtss(ppxfxbqfkfVar);
            }
        }
    }

    @Override // r7.zoijcleaow
    public void yggfygwlhe(Canvas canvas, Matrix matrix, int i13) {
        Bitmap bitmapStevsuqkhv = stevsuqkhv();
        if (bitmapStevsuqkhv == null || bitmapStevsuqkhv.isRecycled() || this.f81943lmojexxdyd == null) {
            return;
        }
        float fEablkybsjg = btonecajqb.eablkybsjg();
        this.f81941cdpycssgdh.setAlpha(i13);
        l7.iobyxmoadg iobyxmoadgVar = this.f81944wwaezpbzkn;
        if (iobyxmoadgVar != null) {
            this.f81941cdpycssgdh.setColorFilter((ColorFilter) iobyxmoadgVar.nufgyqmvbu());
        }
        canvas.save();
        canvas.concat(matrix);
        this.f81945yadqdtsiqt.set(0, 0, bitmapStevsuqkhv.getWidth(), bitmapStevsuqkhv.getHeight());
        if (this.f81968rgvfuqvkyq.stevsuqkhv()) {
            this.f81942iozdgvuglv.set(0, 0, (int) (this.f81943lmojexxdyd.gxszxtbevo() * fEablkybsjg), (int) (this.f81943lmojexxdyd.wkgbmnqykc() * fEablkybsjg));
        } else {
            this.f81942iozdgvuglv.set(0, 0, (int) (bitmapStevsuqkhv.getWidth() * fEablkybsjg), (int) (bitmapStevsuqkhv.getHeight() * fEablkybsjg));
        }
        canvas.drawBitmap(bitmapStevsuqkhv, this.f81945yadqdtsiqt, this.f81942iozdgvuglv, this.f81941cdpycssgdh);
        canvas.restore();
    }
}
