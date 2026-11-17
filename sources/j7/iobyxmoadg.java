package j7;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import kotlin.KotlinVersion;
import v7.dxjokdxxww;

/* JADX INFO: loaded from: classes2.dex */
public class iobyxmoadg extends Paint {
    public iobyxmoadg() {
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i13) {
        if (Build.VERSION.SDK_INT >= 30) {
            super.setAlpha(dxjokdxxww.ppxfxbqfkf(i13, 0, KotlinVersion.MAX_COMPONENT_VALUE));
        } else {
            setColor((dxjokdxxww.ppxfxbqfkf(i13, 0, KotlinVersion.MAX_COMPONENT_VALUE) << 24) | (getColor() & 16777215));
        }
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
    }

    public iobyxmoadg(int i13) {
        super(i13);
    }

    public iobyxmoadg(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public iobyxmoadg(int i13, PorterDuff.Mode mode) {
        super(i13);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
