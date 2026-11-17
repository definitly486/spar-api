package androidx.window.layout;

import android.graphics.Point;
import android.view.Display;

/* JADX INFO: loaded from: classes2.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final gxszxtbevo f13822iobyxmoadg = new gxszxtbevo();

    private gxszxtbevo() {
    }

    public final void iobyxmoadg(Display display, Point point) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(display, "display");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(point, "point");
        display.getRealSize(point);
    }
}
