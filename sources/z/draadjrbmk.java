package z;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class draadjrbmk {
    public static final View iobyxmoadg(btonecajqb btonecajqbVar) {
        if (!btonecajqbVar.wflxmlrfwp().n0()) {
            w.iobyxmoadg.zoijcleaow("Cannot get View because the Modifier node is not currently attached.");
        }
        Object objZoijcleaow = cllcsxoeiz.zoijcleaow(gtknphoqwx.rgvfuqvkyq(btonecajqbVar));
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(objZoijcleaow, "null cannot be cast to non-null type android.view.View");
        return (View) objZoijcleaow;
    }
}
