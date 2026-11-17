package n6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import g6.yggfygwlhe;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public abstract class eablkybsjg extends nufgyqmvbu {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final BroadcastReceiver f69165gxszxtbevo;

    public static final class iobyxmoadg extends BroadcastReceiver {
        iobyxmoadg() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            zdlpuopuiu.btonecajqb(context, "context");
            zdlpuopuiu.btonecajqb(intent, "intent");
            eablkybsjg.this.gtknphoqwx(intent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eablkybsjg(Context context, r6.zoijcleaow taskExecutor) {
        super(context, taskExecutor);
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(taskExecutor, "taskExecutor");
        this.f69165gxszxtbevo = new iobyxmoadg();
    }

    public abstract IntentFilter btonecajqb();

    @Override // n6.nufgyqmvbu
    public void dxjokdxxww() {
        yggfygwlhe.eablkybsjg().iobyxmoadg(gxszxtbevo.f69168iobyxmoadg, getClass().getSimpleName() + ": unregistering receiver");
        wkgbmnqykc().unregisterReceiver(this.f69165gxszxtbevo);
    }

    public abstract void gtknphoqwx(Intent intent);

    @Override // n6.nufgyqmvbu
    public void nufgyqmvbu() {
        yggfygwlhe.eablkybsjg().iobyxmoadg(gxszxtbevo.f69168iobyxmoadg, getClass().getSimpleName() + ": registering receiver");
        wkgbmnqykc().registerReceiver(this.f69165gxszxtbevo, btonecajqb());
    }
}
