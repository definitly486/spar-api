package yadqdtsiqt;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import u1.nufgyqmvbu;

/* JADX INFO: loaded from: classes.dex */
final class lqeggnwhkg implements Executor {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Executor f124299yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    final Deque f124300zdlpuopuiu = new ArrayDeque();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final zoijcleaow f124298jyumaefscl = new zoijcleaow();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    ppxfxbqfkf f124297iwizpuwonk = ppxfxbqfkf.IDLE;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    long f124296cqumvgiudr = 0;

    class iobyxmoadg implements Runnable {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Runnable f124302zdlpuopuiu;

        iobyxmoadg(Runnable runnable) {
            this.f124302zdlpuopuiu = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f124302zdlpuopuiu.run();
        }
    }

    enum ppxfxbqfkf {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    final class zoijcleaow implements Runnable {
        zoijcleaow() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
        
            if (r1 == false) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
        
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
        
            r3.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0051, code lost:
        
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0052, code lost:
        
            lereixgezr.sopmlzcsov.wkgbmnqykc("SequentialExecutor", "Exception while executing runnable " + r3, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void iobyxmoadg() {
            /*
                r9 = this;
                r0 = 0
                r1 = r0
            L2:
                yadqdtsiqt.lqeggnwhkg r2 = yadqdtsiqt.lqeggnwhkg.this     // Catch: java.lang.Throwable -> L4f
                java.util.Deque r2 = r2.f124300zdlpuopuiu     // Catch: java.lang.Throwable -> L4f
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L4f
                if (r0 != 0) goto L28
                yadqdtsiqt.lqeggnwhkg r0 = yadqdtsiqt.lqeggnwhkg.this     // Catch: java.lang.Throwable -> L1c
                yadqdtsiqt.lqeggnwhkg$ppxfxbqfkf r3 = r0.f124297iwizpuwonk     // Catch: java.lang.Throwable -> L1c
                yadqdtsiqt.lqeggnwhkg$ppxfxbqfkf r4 = yadqdtsiqt.lqeggnwhkg.ppxfxbqfkf.RUNNING     // Catch: java.lang.Throwable -> L1c
                if (r3 != r4) goto L1e
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                if (r1 == 0) goto L1b
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L1b:
                return
            L1c:
                r0 = move-exception
                goto L69
            L1e:
                long r5 = r0.f124296cqumvgiudr     // Catch: java.lang.Throwable -> L1c
                r7 = 1
                long r5 = r5 + r7
                r0.f124296cqumvgiudr = r5     // Catch: java.lang.Throwable -> L1c
                r0.f124297iwizpuwonk = r4     // Catch: java.lang.Throwable -> L1c
                r0 = 1
            L28:
                yadqdtsiqt.lqeggnwhkg r3 = yadqdtsiqt.lqeggnwhkg.this     // Catch: java.lang.Throwable -> L1c
                java.util.Deque r3 = r3.f124300zdlpuopuiu     // Catch: java.lang.Throwable -> L1c
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L1c
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L1c
                if (r3 != 0) goto L45
                yadqdtsiqt.lqeggnwhkg r0 = yadqdtsiqt.lqeggnwhkg.this     // Catch: java.lang.Throwable -> L1c
                yadqdtsiqt.lqeggnwhkg$ppxfxbqfkf r3 = yadqdtsiqt.lqeggnwhkg.ppxfxbqfkf.IDLE     // Catch: java.lang.Throwable -> L1c
                r0.f124297iwizpuwonk = r3     // Catch: java.lang.Throwable -> L1c
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                if (r1 == 0) goto L44
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L44:
                return
            L45:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L4f
                r1 = r1 | r2
                r3.run()     // Catch: java.lang.Throwable -> L4f java.lang.RuntimeException -> L51
                goto L2
            L4f:
                r0 = move-exception
                goto L6b
            L51:
                r2 = move-exception
                java.lang.String r4 = "SequentialExecutor"
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
                r5.<init>()     // Catch: java.lang.Throwable -> L4f
                java.lang.String r6 = "Exception while executing runnable "
                r5.append(r6)     // Catch: java.lang.Throwable -> L4f
                r5.append(r3)     // Catch: java.lang.Throwable -> L4f
                java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L4f
                lereixgezr.sopmlzcsov.wkgbmnqykc(r4, r3, r2)     // Catch: java.lang.Throwable -> L4f
                goto L2
            L69:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                throw r0     // Catch: java.lang.Throwable -> L4f
            L6b:
                if (r1 == 0) goto L74
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L74:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: yadqdtsiqt.lqeggnwhkg.zoijcleaow.iobyxmoadg():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                iobyxmoadg();
            } catch (Error e13) {
                synchronized (lqeggnwhkg.this.f124300zdlpuopuiu) {
                    lqeggnwhkg.this.f124297iwizpuwonk = ppxfxbqfkf.IDLE;
                    throw e13;
                }
            }
        }
    }

    lqeggnwhkg(Executor executor) {
        this.f124299yggfygwlhe = (Executor) nufgyqmvbu.gxszxtbevo(executor);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0061  */
    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        ppxfxbqfkf ppxfxbqfkfVar;
        boolean z13;
        nufgyqmvbu.gxszxtbevo(runnable);
        synchronized (this.f124300zdlpuopuiu) {
            ppxfxbqfkf ppxfxbqfkfVar2 = this.f124297iwizpuwonk;
            if (ppxfxbqfkfVar2 != ppxfxbqfkf.RUNNING && ppxfxbqfkfVar2 != (ppxfxbqfkfVar = ppxfxbqfkf.QUEUED)) {
                long j13 = this.f124296cqumvgiudr;
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(runnable);
                this.f124300zdlpuopuiu.add(iobyxmoadgVar);
                ppxfxbqfkf ppxfxbqfkfVar3 = ppxfxbqfkf.QUEUING;
                this.f124297iwizpuwonk = ppxfxbqfkfVar3;
                try {
                    this.f124299yggfygwlhe.execute(this.f124298jyumaefscl);
                    if (this.f124297iwizpuwonk != ppxfxbqfkfVar3) {
                        return;
                    }
                    synchronized (this.f124300zdlpuopuiu) {
                        try {
                            if (this.f124296cqumvgiudr == j13 && this.f124297iwizpuwonk == ppxfxbqfkfVar3) {
                                this.f124297iwizpuwonk = ppxfxbqfkfVar;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e13) {
                    synchronized (this.f124300zdlpuopuiu) {
                        try {
                            ppxfxbqfkf ppxfxbqfkfVar4 = this.f124297iwizpuwonk;
                            if (ppxfxbqfkfVar4 != ppxfxbqfkf.IDLE && ppxfxbqfkfVar4 != ppxfxbqfkf.QUEUING) {
                                z13 = false;
                            } else if (this.f124300zdlpuopuiu.removeLastOccurrence(iobyxmoadgVar)) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (!(e13 instanceof RejectedExecutionException) || z13) {
                                throw e13;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    return;
                }
            }
            this.f124300zdlpuopuiu.add(runnable);
        }
    }
}
