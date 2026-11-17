package r7;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.dsvhmnatus;
import com.airbnb.lottie.hcddaimhww;
import l7.vdvldrhtss;

/* JADX INFO: loaded from: classes2.dex */
public class nufgyqmvbu extends zoijcleaow {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final RectF f81926cdpycssgdh;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private final float[] f81927iozdgvuglv;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private final Path f81928lmojexxdyd;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private l7.iobyxmoadg f81929pkzmftpjix;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private final eablkybsjg f81930wwaezpbzkn;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private final Paint f81931yadqdtsiqt;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private l7.iobyxmoadg f81932ylkuphrtab;

    nufgyqmvbu(hcddaimhww hcddaimhwwVar, eablkybsjg eablkybsjgVar) {
        super(hcddaimhwwVar, eablkybsjgVar);
        this.f81926cdpycssgdh = new RectF();
        j7.iobyxmoadg iobyxmoadgVar = new j7.iobyxmoadg();
        this.f81931yadqdtsiqt = iobyxmoadgVar;
        this.f81927iozdgvuglv = new float[8];
        this.f81928lmojexxdyd = new Path();
        this.f81930wwaezpbzkn = eablkybsjgVar;
        iobyxmoadgVar.setAlpha(0);
        iobyxmoadgVar.setStyle(Paint.Style.FILL);
        iobyxmoadgVar.setColor(eablkybsjgVar.rgvfuqvkyq());
    }

    @Override // r7.zoijcleaow, k7.eablkybsjg
    public void eablkybsjg(RectF rectF, Matrix matrix, boolean z13) {
        super.eablkybsjg(rectF, matrix, z13);
        this.f81926cdpycssgdh.set(0.0f, 0.0f, this.f81930wwaezpbzkn.oxmwwwfdhm(), this.f81930wwaezpbzkn.vdvldrhtss());
        this.f81964ojitshcjhn.mapRect(this.f81926cdpycssgdh);
        rectF.set(this.f81926cdpycssgdh);
    }

    @Override // r7.zoijcleaow, o7.gxszxtbevo
    public void nufgyqmvbu(Object obj, w7.ppxfxbqfkf ppxfxbqfkfVar) {
        super.nufgyqmvbu(obj, ppxfxbqfkfVar);
        if (obj == dsvhmnatus.f20367hcddaimhww) {
            if (ppxfxbqfkfVar == null) {
                this.f81932ylkuphrtab = null;
                return;
            } else {
                this.f81932ylkuphrtab = new vdvldrhtss(ppxfxbqfkfVar);
                return;
            }
        }
        if (obj == dsvhmnatus.f20369iobyxmoadg) {
            if (ppxfxbqfkfVar != null) {
                this.f81929pkzmftpjix = new vdvldrhtss(ppxfxbqfkfVar);
            } else {
                this.f81929pkzmftpjix = null;
                this.f81931yadqdtsiqt.setColor(this.f81930wwaezpbzkn.rgvfuqvkyq());
            }
        }
    }

    @Override // r7.zoijcleaow
    public void yggfygwlhe(Canvas canvas, Matrix matrix, int i13) {
        int iAlpha = Color.alpha(this.f81930wwaezpbzkn.rgvfuqvkyq());
        if (iAlpha == 0) {
            return;
        }
        l7.iobyxmoadg iobyxmoadgVar = this.f81929pkzmftpjix;
        Integer num = iobyxmoadgVar == null ? null : (Integer) iobyxmoadgVar.nufgyqmvbu();
        if (num != null) {
            this.f81931yadqdtsiqt.setColor(num.intValue());
        } else {
            this.f81931yadqdtsiqt.setColor(this.f81930wwaezpbzkn.rgvfuqvkyq());
        }
        int iIntValue = (int) ((i13 / 255.0f) * (((iAlpha / 255.0f) * (this.f81949cqumvgiudr.nufgyqmvbu() == null ? 100 : ((Integer) this.f81949cqumvgiudr.nufgyqmvbu().nufgyqmvbu()).intValue())) / 100.0f) * 255.0f);
        this.f81931yadqdtsiqt.setAlpha(iIntValue);
        l7.iobyxmoadg iobyxmoadgVar2 = this.f81932ylkuphrtab;
        if (iobyxmoadgVar2 != null) {
            this.f81931yadqdtsiqt.setColorFilter((ColorFilter) iobyxmoadgVar2.nufgyqmvbu());
        }
        if (iIntValue > 0) {
            float[] fArr = this.f81927iozdgvuglv;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.f81930wwaezpbzkn.oxmwwwfdhm();
            float[] fArr2 = this.f81927iozdgvuglv;
            fArr2[3] = 0.0f;
            fArr2[4] = this.f81930wwaezpbzkn.oxmwwwfdhm();
            this.f81927iozdgvuglv[5] = this.f81930wwaezpbzkn.vdvldrhtss();
            float[] fArr3 = this.f81927iozdgvuglv;
            fArr3[6] = 0.0f;
            fArr3[7] = this.f81930wwaezpbzkn.vdvldrhtss();
            matrix.mapPoints(this.f81927iozdgvuglv);
            this.f81928lmojexxdyd.reset();
            Path path = this.f81928lmojexxdyd;
            float[] fArr4 = this.f81927iozdgvuglv;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.f81928lmojexxdyd;
            float[] fArr5 = this.f81927iozdgvuglv;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.f81928lmojexxdyd;
            float[] fArr6 = this.f81927iozdgvuglv;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.f81928lmojexxdyd;
            float[] fArr7 = this.f81927iozdgvuglv;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.f81928lmojexxdyd;
            float[] fArr8 = this.f81927iozdgvuglv;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.f81928lmojexxdyd.close();
            canvas.drawPath(this.f81928lmojexxdyd, this.f81931yadqdtsiqt);
        }
    }
}
