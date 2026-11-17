package u0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import h.a;
import h.ageimvtcrz;
import h.bfopjjpdmp;
import h.f;
import h.ixidwrxhsl;
import h.jztzpxfvev;
import h.kegysxyocb;
import h.mhtqkkgtqm;
import h.ntlheqmsrt;
import h.wypolnanlu;
import j.btonecajqb;
import j.gtknphoqwx;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void eablkybsjg(Paint paint, jztzpxfvev jztzpxfvevVar, float f13, long j13, tg.iobyxmoadg iobyxmoadgVar) {
        Integer numValueOf = null;
        if (jztzpxfvevVar == null) {
            if (!Float.isNaN(f13)) {
                numValueOf = Integer.valueOf(paint.getAlpha());
                paint.setAlpha((int) Math.rint(f13 * 255.0f));
            }
            iobyxmoadgVar.invoke();
            if (numValueOf != null) {
                paint.setAlpha(numValueOf.intValue());
                return;
            }
            return;
        }
        if (jztzpxfvevVar instanceof f) {
            int color = paint.getColor();
            if (!Float.isNaN(f13)) {
                numValueOf = Integer.valueOf(paint.getAlpha());
                paint.setAlpha((int) Math.rint(f13 * 255.0f));
            }
            paint.setColor(bfopjjpdmp.nufgyqmvbu(((f) jztzpxfvevVar).zoijcleaow()));
            iobyxmoadgVar.invoke();
            paint.setColor(color);
            if (numValueOf != null) {
                paint.setAlpha(numValueOf.intValue());
                return;
            }
            return;
        }
        if (!(jztzpxfvevVar instanceof a)) {
            throw new NoWhenBranchMatchedException();
        }
        Shader shader = paint.getShader();
        if (!Float.isNaN(f13)) {
            numValueOf = Integer.valueOf(paint.getAlpha());
            paint.setAlpha((int) Math.rint(f13 * 255.0f));
        }
        paint.setShader(((a) jztzpxfvevVar).zoijcleaow(j13));
        iobyxmoadgVar.invoke();
        paint.setShader(shader);
        if (numValueOf != null) {
            paint.setAlpha(numValueOf.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gxszxtbevo(Paint paint, j.lqeggnwhkg lqeggnwhkgVar) {
        if (zdlpuopuiu.eablkybsjg(lqeggnwhkgVar, btonecajqb.f50092iobyxmoadg)) {
            paint.setStyle(Paint.Style.FILL);
            return;
        }
        if (!(lqeggnwhkgVar instanceof gtknphoqwx)) {
            throw new NoWhenBranchMatchedException();
        }
        paint.setStyle(Paint.Style.STROKE);
        gtknphoqwx gtknphoqwxVar = (gtknphoqwx) lqeggnwhkgVar;
        paint.setStrokeWidth(gtknphoqwxVar.gxszxtbevo());
        paint.setStrokeMiter(gtknphoqwxVar.wkgbmnqykc());
        paint.setStrokeCap(eablkybsjg.iobyxmoadg(gtknphoqwxVar.zoijcleaow()));
        paint.setStrokeJoin(eablkybsjg.zoijcleaow(gtknphoqwxVar.ppxfxbqfkf()));
        ixidwrxhsl ixidwrxhslVarEablkybsjg = gtknphoqwxVar.eablkybsjg();
        paint.setPathEffect(ixidwrxhslVarEablkybsjg != null ? kegysxyocb.zoijcleaow(ixidwrxhslVarEablkybsjg) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wkgbmnqykc(ageimvtcrz ageimvtcrzVar, Canvas canvas, Paint paint, float f13, float f14, int i13) {
        if (ageimvtcrzVar instanceof ageimvtcrz.iobyxmoadg) {
            canvas.save();
            ageimvtcrz.iobyxmoadg iobyxmoadgVar = (ageimvtcrz.iobyxmoadg) ageimvtcrzVar;
            g.lqeggnwhkg lqeggnwhkgVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
            canvas.translate(f13, f14 - ((lqeggnwhkgVarIobyxmoadg.eablkybsjg() - lqeggnwhkgVarIobyxmoadg.gtknphoqwx()) / 2.0f));
            mhtqkkgtqm mhtqkkgtqmVarZoijcleaow = iobyxmoadgVar.zoijcleaow();
            if (!(mhtqkkgtqmVarZoijcleaow instanceof wypolnanlu)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            canvas.drawPath(((wypolnanlu) mhtqkkgtqmVarZoijcleaow).cqumvgiudr(), paint);
            canvas.restore();
            return;
        }
        if (!(ageimvtcrzVar instanceof ageimvtcrz.ppxfxbqfkf)) {
            if (!(ageimvtcrzVar instanceof ageimvtcrz.zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            ageimvtcrz.zoijcleaow zoijcleaowVar = (ageimvtcrz.zoijcleaow) ageimvtcrzVar;
            g.lqeggnwhkg lqeggnwhkgVarZoijcleaow = zoijcleaowVar.zoijcleaow();
            float fEablkybsjg = f14 - ((lqeggnwhkgVarZoijcleaow.eablkybsjg() - lqeggnwhkgVarZoijcleaow.gtknphoqwx()) / 2.0f);
            g.lqeggnwhkg lqeggnwhkgVarZoijcleaow2 = zoijcleaowVar.zoijcleaow();
            float fDxjokdxxww = (i13 * (lqeggnwhkgVarZoijcleaow2.dxjokdxxww() - lqeggnwhkgVarZoijcleaow2.nufgyqmvbu())) + f13;
            g.lqeggnwhkg lqeggnwhkgVarZoijcleaow3 = zoijcleaowVar.zoijcleaow();
            canvas.drawRect(f13, fEablkybsjg, fDxjokdxxww, ((lqeggnwhkgVarZoijcleaow3.eablkybsjg() - lqeggnwhkgVarZoijcleaow3.gtknphoqwx()) / 2.0f) + f14, paint);
            return;
        }
        ageimvtcrz.ppxfxbqfkf ppxfxbqfkfVar = (ageimvtcrz.ppxfxbqfkf) ageimvtcrzVar;
        if (g.btonecajqb.eablkybsjg(ppxfxbqfkfVar.zoijcleaow())) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (ppxfxbqfkfVar.zoijcleaow().nufgyqmvbu() >> 32));
            canvas.drawRoundRect(f13, f14 - (ppxfxbqfkfVar.zoijcleaow().wkgbmnqykc() / 2.0f), (i13 * ppxfxbqfkfVar.zoijcleaow().btonecajqb()) + f13, f14 + (ppxfxbqfkfVar.zoijcleaow().wkgbmnqykc() / 2.0f), fIntBitsToFloat, fIntBitsToFloat, paint);
            return;
        }
        mhtqkkgtqm mhtqkkgtqmVarIobyxmoadg = ntlheqmsrt.iobyxmoadg();
        mhtqkkgtqm.zdlpuopuiu(mhtqkkgtqmVarIobyxmoadg, ppxfxbqfkfVar.zoijcleaow(), null, 2, null);
        canvas.save();
        canvas.translate(f13, f14 - (ppxfxbqfkfVar.zoijcleaow().wkgbmnqykc() / 2.0f));
        if (!(mhtqkkgtqmVarIobyxmoadg instanceof wypolnanlu)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((wypolnanlu) mhtqkkgtqmVarIobyxmoadg).cqumvgiudr(), paint);
        canvas.restore();
    }
}
