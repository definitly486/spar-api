package u0;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.runtime.c1;
import androidx.compose.runtime.i1;
import androidx.compose.runtime.iwxlajgraz;
import androidx.compose.runtime.v0;
import g.gtknphoqwx;
import h.a;
import s0.btonecajqb;

/* JADX INFO: loaded from: classes.dex */
public final class lqeggnwhkg extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final float f112419yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final a f112420zdlpuopuiu;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final iwxlajgraz f112418jyumaefscl = c1.ppxfxbqfkf(gtknphoqwx.ppxfxbqfkf(gtknphoqwx.f35588zoijcleaow.iobyxmoadg()), null, 2, null);

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final i1 f112417iwizpuwonk = v0.eablkybsjg(new tg.iobyxmoadg() { // from class: u0.gxszxtbevo
        @Override // tg.iobyxmoadg
        public final Object invoke() {
            return lqeggnwhkg.wkgbmnqykc(this.f112416zdlpuopuiu);
        }
    });

    public lqeggnwhkg(a aVar, float f13) {
        this.f112420zdlpuopuiu = aVar;
        this.f112419yggfygwlhe = f13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Shader wkgbmnqykc(lqeggnwhkg lqeggnwhkgVar) {
        if (lqeggnwhkgVar.zoijcleaow() == 9205357640488583168L || gtknphoqwx.wflxmlrfwp(lqeggnwhkgVar.zoijcleaow())) {
            return null;
        }
        return lqeggnwhkgVar.f112420zdlpuopuiu.zoijcleaow(lqeggnwhkgVar.zoijcleaow());
    }

    public final void ppxfxbqfkf(long j13) {
        this.f112418jyumaefscl.setValue(gtknphoqwx.ppxfxbqfkf(j13));
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        btonecajqb.iobyxmoadg(textPaint, this.f112419yggfygwlhe);
        textPaint.setShader((Shader) this.f112417iwizpuwonk.getValue());
    }

    public final long zoijcleaow() {
        return ((gtknphoqwx) this.f112418jyumaefscl.getValue()).ojitshcjhn();
    }
}
