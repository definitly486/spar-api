package bz;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import java.util.ArrayList;
import java.util.List;
import t6.h1;

/* JADX INFO: loaded from: classes2.dex */
class h0 implements h1 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private DisplayManager f17429iobyxmoadg;

    h0(Context context) {
        this.f17429iobyxmoadg = (DisplayManager) context.getSystemService("display");
    }

    @Override // t6.h1
    public boolean iobyxmoadg() {
        DisplayManager displayManager = this.f17429iobyxmoadg;
        return displayManager != null && displayManager.getDisplays().length > 1;
    }

    @Override // t6.h1
    public List zoijcleaow() {
        ArrayList arrayList = new ArrayList(1);
        DisplayManager displayManager = this.f17429iobyxmoadg;
        if (displayManager != null) {
            for (Display display : displayManager.getDisplays()) {
                int displayId = display.getDisplayId();
                if (displayId != 0 && displayId != -1) {
                    arrayList.add(new u1.ppxfxbqfkf(Integer.valueOf(displayId), display.getName()));
                }
            }
        }
        return arrayList;
    }
}
