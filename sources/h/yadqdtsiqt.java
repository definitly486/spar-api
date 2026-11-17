package h;

import android.graphics.Canvas;

/* JADX INFO: loaded from: classes.dex */
public abstract class yadqdtsiqt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Canvas f38986iobyxmoadg = new Canvas();

    public static final metgxyhuhe iobyxmoadg(dvvnrvtcbc dvvnrvtcbcVar) {
        cdpycssgdh cdpycssgdhVar = new cdpycssgdh();
        cdpycssgdhVar.lereixgezr(new Canvas(hkdspvbjdz.zoijcleaow(dvvnrvtcbcVar)));
        return cdpycssgdhVar;
    }

    public static final Canvas wkgbmnqykc(metgxyhuhe metgxyhuheVar) {
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(metgxyhuheVar, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidCanvas");
        return ((cdpycssgdh) metgxyhuheVar).iobyxmoadg();
    }

    public static final metgxyhuhe zoijcleaow(Canvas canvas) {
        cdpycssgdh cdpycssgdhVar = new cdpycssgdh();
        cdpycssgdhVar.lereixgezr(canvas);
        return cdpycssgdhVar;
    }
}
