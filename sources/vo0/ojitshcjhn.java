package vo0;

import android.graphics.Color;
import ru.myspar.proloyalty.core.domain.models.cart.CartProgressBar;

/* JADX INFO: loaded from: classes5.dex */
public final class ojitshcjhn implements tg.draadjrbmk {
    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public wo0.nufgyqmvbu invoke(CartProgressBar progressBar) {
        Object objWkgbmnqykc;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(progressBar, "progressBar");
        Double dValueOf = Double.valueOf(progressBar.getNeededValue());
        if (dValueOf.doubleValue() <= 0.0d) {
            dValueOf = null;
        }
        float fMin = Math.min(1.0f, (float) jr0.wkgbmnqykc.ppxfxbqfkf(progressBar.getCurrentValue(), dValueOf != null ? dValueOf.doubleValue() : 1.0d, null, 2, null));
        String title = progressBar.getTitle();
        String valuesDifference = progressBar.getValuesDifference();
        try {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(Integer.valueOf(Color.parseColor(progressBar.getProgressColor())));
        } catch (Throwable th2) {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
        return new wo0.nufgyqmvbu(fMin, title, valuesDifference, (Integer) (gg.kcexrzcfyt.draadjrbmk(objWkgbmnqykc) ? null : objWkgbmnqykc), progressBar.getDeliveryTerms() != null);
    }
}
