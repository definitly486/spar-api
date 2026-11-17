package cc2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow extends Handler implements iobyxmoadg {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Map f19644zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(Looper looper) {
        super(looper);
        zdlpuopuiu.btonecajqb(looper, "looper");
        this.f19644zdlpuopuiu = new LinkedHashMap();
    }

    @Override // android.os.Handler
    public void handleMessage(Message msg) {
        zdlpuopuiu.btonecajqb(msg, "msg");
        int i13 = msg.what;
        if (!this.f19644zdlpuopuiu.containsKey(Integer.valueOf(i13))) {
            super.handleMessage(msg);
            return;
        }
        Runnable runnable = (Runnable) this.f19644zdlpuopuiu.get(Integer.valueOf(i13));
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // cc2.iobyxmoadg
    public void iobyxmoadg(int i13, long j13, Runnable runnable) {
        zdlpuopuiu.btonecajqb(runnable, "runnable");
        removeMessages(i13);
        this.f19644zdlpuopuiu.put(Integer.valueOf(i13), runnable);
        sendEmptyMessageDelayed(i13, j13);
    }
}
