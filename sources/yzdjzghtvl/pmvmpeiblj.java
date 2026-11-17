package yzdjzghtvl;

/* JADX INFO: loaded from: classes.dex */
public abstract class pmvmpeiblj implements lereixgezr {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final ezmngbhpjk.iobyxmoadg f126940zdlpuopuiu = new ezmngbhpjk.iobyxmoadg(0);

    public final boolean jlmebxxoox(int i13) {
        return (i13 & androidx.compose.runtime.snapshots.eablkybsjg.iobyxmoadg(this.f126940zdlpuopuiu.get())) != 0;
    }

    public final void ribwqtqdhb(int i13) {
        int iIobyxmoadg;
        do {
            iIobyxmoadg = androidx.compose.runtime.snapshots.eablkybsjg.iobyxmoadg(this.f126940zdlpuopuiu.get());
            if ((iIobyxmoadg & i13) != 0) {
                return;
            }
        } while (!this.f126940zdlpuopuiu.compareAndSet(iIobyxmoadg, androidx.compose.runtime.snapshots.eablkybsjg.iobyxmoadg(iIobyxmoadg | i13)));
    }
}
