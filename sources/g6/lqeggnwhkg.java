package g6;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public enum lqeggnwhkg implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable command) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(command, "command");
        command.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "DirectExecutor";
    }
}
