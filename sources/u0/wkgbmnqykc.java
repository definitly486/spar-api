package u0;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import h.ixidwrxhsl;
import h.kegysxyocb;
import j.btonecajqb;
import j.gtknphoqwx;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public final class wkgbmnqykc extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final j.lqeggnwhkg f112430zdlpuopuiu;

    public wkgbmnqykc(j.lqeggnwhkg lqeggnwhkgVar) {
        this.f112430zdlpuopuiu = lqeggnwhkgVar;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            j.lqeggnwhkg lqeggnwhkgVar = this.f112430zdlpuopuiu;
            if (zdlpuopuiu.eablkybsjg(lqeggnwhkgVar, btonecajqb.f50092iobyxmoadg)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(lqeggnwhkgVar instanceof gtknphoqwx)) {
                throw new NoWhenBranchMatchedException();
            }
            textPaint.setStyle(Paint.Style.STROKE);
            textPaint.setStrokeWidth(((gtknphoqwx) this.f112430zdlpuopuiu).gxszxtbevo());
            textPaint.setStrokeMiter(((gtknphoqwx) this.f112430zdlpuopuiu).wkgbmnqykc());
            textPaint.setStrokeJoin(eablkybsjg.zoijcleaow(((gtknphoqwx) this.f112430zdlpuopuiu).ppxfxbqfkf()));
            textPaint.setStrokeCap(eablkybsjg.iobyxmoadg(((gtknphoqwx) this.f112430zdlpuopuiu).zoijcleaow()));
            ixidwrxhsl ixidwrxhslVarEablkybsjg = ((gtknphoqwx) this.f112430zdlpuopuiu).eablkybsjg();
            textPaint.setPathEffect(ixidwrxhslVarEablkybsjg != null ? kegysxyocb.zoijcleaow(ixidwrxhslVarEablkybsjg) : null);
        }
    }
}
