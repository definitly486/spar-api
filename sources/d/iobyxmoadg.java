package d;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import h.metgxyhuhe;
import h.yadqdtsiqt;
import kotlin.jvm.internal.gtknphoqwx;
import tg.draadjrbmk;
import w0.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg extends View.DragShadowBuilder {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final w0.wkgbmnqykc f26551iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final draadjrbmk f26552ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final long f26553zoijcleaow;

    public /* synthetic */ iobyxmoadg(w0.wkgbmnqykc wkgbmnqykcVar, long j13, draadjrbmk draadjrbmkVar, gtknphoqwx gtknphoqwxVar) {
        this(wkgbmnqykcVar, j13, draadjrbmkVar);
    }

    @Override // android.view.View.DragShadowBuilder
    public void onDrawShadow(Canvas canvas) {
        j.iobyxmoadg iobyxmoadgVar = new j.iobyxmoadg();
        w0.wkgbmnqykc wkgbmnqykcVar = this.f26551iobyxmoadg;
        long j13 = this.f26553zoijcleaow;
        zdlpuopuiu zdlpuopuiuVar = zdlpuopuiu.Ltr;
        metgxyhuhe metgxyhuheVarZoijcleaow = yadqdtsiqt.zoijcleaow(canvas);
        draadjrbmk draadjrbmkVar = this.f26552ppxfxbqfkf;
        j.iobyxmoadg.C1070iobyxmoadg c1070iobyxmoadgCdpycssgdh = iobyxmoadgVar.cdpycssgdh();
        w0.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = c1070iobyxmoadgCdpycssgdh.iobyxmoadg();
        zdlpuopuiu zdlpuopuiuVarZoijcleaow = c1070iobyxmoadgCdpycssgdh.zoijcleaow();
        metgxyhuhe metgxyhuheVarPpxfxbqfkf = c1070iobyxmoadgCdpycssgdh.ppxfxbqfkf();
        long jWkgbmnqykc = c1070iobyxmoadgCdpycssgdh.wkgbmnqykc();
        j.iobyxmoadg.C1070iobyxmoadg c1070iobyxmoadgCdpycssgdh2 = iobyxmoadgVar.cdpycssgdh();
        c1070iobyxmoadgCdpycssgdh2.btonecajqb(wkgbmnqykcVar);
        c1070iobyxmoadgCdpycssgdh2.gtknphoqwx(zdlpuopuiuVar);
        c1070iobyxmoadgCdpycssgdh2.dxjokdxxww(metgxyhuheVarZoijcleaow);
        c1070iobyxmoadgCdpycssgdh2.draadjrbmk(j13);
        metgxyhuheVarZoijcleaow.jyumaefscl();
        draadjrbmkVar.invoke(iobyxmoadgVar);
        metgxyhuheVarZoijcleaow.agtfadlqog();
        j.iobyxmoadg.C1070iobyxmoadg c1070iobyxmoadgCdpycssgdh3 = iobyxmoadgVar.cdpycssgdh();
        c1070iobyxmoadgCdpycssgdh3.btonecajqb(wkgbmnqykcVarIobyxmoadg);
        c1070iobyxmoadgCdpycssgdh3.gtknphoqwx(zdlpuopuiuVarZoijcleaow);
        c1070iobyxmoadgCdpycssgdh3.dxjokdxxww(metgxyhuheVarPpxfxbqfkf);
        c1070iobyxmoadgCdpycssgdh3.draadjrbmk(jWkgbmnqykc);
    }

    @Override // android.view.View.DragShadowBuilder
    public void onProvideShadowMetrics(Point point, Point point2) {
        w0.wkgbmnqykc wkgbmnqykcVar = this.f26551iobyxmoadg;
        point.set(wkgbmnqykcVar.hszhottldk(wkgbmnqykcVar.A(Float.intBitsToFloat((int) (this.f26553zoijcleaow >> 32)))), wkgbmnqykcVar.hszhottldk(wkgbmnqykcVar.A(Float.intBitsToFloat((int) (this.f26553zoijcleaow & 4294967295L)))));
        point2.set(point.x / 2, point.y / 2);
    }

    private iobyxmoadg(w0.wkgbmnqykc wkgbmnqykcVar, long j13, draadjrbmk draadjrbmkVar) {
        this.f26551iobyxmoadg = wkgbmnqykcVar;
        this.f26553zoijcleaow = j13;
        this.f26552ppxfxbqfkf = draadjrbmkVar;
    }
}
