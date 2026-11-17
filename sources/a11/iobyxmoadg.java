package a11;

import android.app.NotificationChannel;
import android.content.Context;
import androidx.core.app.rgvfuqvkyq;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import zr0.ppxfxbqfkf;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Context f272zoijcleaow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(Context context, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f272zoijcleaow = context;
    }

    private final boolean eablkybsjg() {
        NotificationChannel notificationChannelGxszxtbevo = rgvfuqvkyq.wkgbmnqykc(this.f272zoijcleaow).gxszxtbevo("main_channel");
        boolean z13 = false;
        if (notificationChannelGxszxtbevo != null && notificationChannelGxszxtbevo.getImportance() == 0) {
            z13 = true;
        }
        return !z13;
    }

    private final boolean ppxfxbqfkf() {
        return rgvfuqvkyq.wkgbmnqykc(this.f272zoijcleaow).iobyxmoadg();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, gxszxtbevo gxszxtbevoVar) {
        return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(ppxfxbqfkf() && eablkybsjg());
    }
}
