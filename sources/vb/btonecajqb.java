package vb;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
final class btonecajqb implements Executor {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final Logger f116438esjtqupxsv = Logger.getLogger(btonecajqb.class.getName());

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Executor f116443zdlpuopuiu;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Deque f116442yggfygwlhe = new ArrayDeque();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private ppxfxbqfkf f116441jyumaefscl = ppxfxbqfkf.IDLE;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private long f116440iwizpuwonk = 0;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final zoijcleaow f116439cqumvgiudr = new zoijcleaow(this, null);

    class iobyxmoadg implements Runnable {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Runnable f116445zdlpuopuiu;

        iobyxmoadg(Runnable runnable) {
            this.f116445zdlpuopuiu = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f116445zdlpuopuiu.run();
        }

        public String toString() {
            return this.f116445zdlpuopuiu.toString();
        }
    }

    enum ppxfxbqfkf {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    private final class zoijcleaow implements Runnable {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Runnable f116452zdlpuopuiu;

        private zoijcleaow() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
        
            if (r1 == false) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
        
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
        
            r8.f116452zdlpuopuiu.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0062, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0063, code lost:
        
            vb.btonecajqb.f116438esjtqupxsv.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.f116452zdlpuopuiu, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
        
            r8.f116452zdlpuopuiu = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0082, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void iobyxmoadg() {
            /*
                r8 = this;
                r0 = 0
                r1 = r0
            L2:
                vb.btonecajqb r2 = vb.btonecajqb.this     // Catch: java.lang.Throwable -> L5e
                java.util.Deque r2 = vb.btonecajqb.iobyxmoadg(r2)     // Catch: java.lang.Throwable -> L5e
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L5e
                if (r0 != 0) goto L2d
                vb.btonecajqb r0 = vb.btonecajqb.this     // Catch: java.lang.Throwable -> L20
                vb.btonecajqb$ppxfxbqfkf r0 = vb.btonecajqb.zoijcleaow(r0)     // Catch: java.lang.Throwable -> L20
                vb.btonecajqb$ppxfxbqfkf r3 = vb.btonecajqb.ppxfxbqfkf.RUNNING     // Catch: java.lang.Throwable -> L20
                if (r0 != r3) goto L22
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L1f
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L1f:
                return
            L20:
                r0 = move-exception
                goto L83
            L22:
                vb.btonecajqb r0 = vb.btonecajqb.this     // Catch: java.lang.Throwable -> L20
                vb.btonecajqb.wkgbmnqykc(r0)     // Catch: java.lang.Throwable -> L20
                vb.btonecajqb r0 = vb.btonecajqb.this     // Catch: java.lang.Throwable -> L20
                vb.btonecajqb.ppxfxbqfkf(r0, r3)     // Catch: java.lang.Throwable -> L20
                r0 = 1
            L2d:
                vb.btonecajqb r3 = vb.btonecajqb.this     // Catch: java.lang.Throwable -> L20
                java.util.Deque r3 = vb.btonecajqb.iobyxmoadg(r3)     // Catch: java.lang.Throwable -> L20
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L20
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L20
                r8.f116452zdlpuopuiu = r3     // Catch: java.lang.Throwable -> L20
                if (r3 != 0) goto L4f
                vb.btonecajqb r0 = vb.btonecajqb.this     // Catch: java.lang.Throwable -> L20
                vb.btonecajqb$ppxfxbqfkf r3 = vb.btonecajqb.ppxfxbqfkf.IDLE     // Catch: java.lang.Throwable -> L20
                vb.btonecajqb.ppxfxbqfkf(r0, r3)     // Catch: java.lang.Throwable -> L20
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L4e
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L4e:
                return
            L4f:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L5e
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r8.f116452zdlpuopuiu     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62
                r3.run()     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62
            L5b:
                r8.f116452zdlpuopuiu = r2     // Catch: java.lang.Throwable -> L5e
                goto L2
            L5e:
                r0 = move-exception
                goto L85
            L60:
                r0 = move-exception
                goto L80
            L62:
                r3 = move-exception
                java.util.logging.Logger r4 = vb.btonecajqb.eablkybsjg()     // Catch: java.lang.Throwable -> L60
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L60
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
                r6.<init>()     // Catch: java.lang.Throwable -> L60
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L60
                java.lang.Runnable r7 = r8.f116452zdlpuopuiu     // Catch: java.lang.Throwable -> L60
                r6.append(r7)     // Catch: java.lang.Throwable -> L60
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L60
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L60
                goto L5b
            L80:
                r8.f116452zdlpuopuiu = r2     // Catch: java.lang.Throwable -> L5e
                throw r0     // Catch: java.lang.Throwable -> L5e
            L83:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                throw r0     // Catch: java.lang.Throwable -> L5e
            L85:
                if (r1 == 0) goto L8e
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L8e:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: vb.btonecajqb.zoijcleaow.iobyxmoadg():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                iobyxmoadg();
            } catch (Error e13) {
                synchronized (btonecajqb.this.f116442yggfygwlhe) {
                    btonecajqb.this.f116441jyumaefscl = ppxfxbqfkf.IDLE;
                    throw e13;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.f116452zdlpuopuiu;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + btonecajqb.this.f116441jyumaefscl + "}";
        }

        /* synthetic */ zoijcleaow(btonecajqb btonecajqbVar, iobyxmoadg iobyxmoadgVar) {
            this();
        }
    }

    btonecajqb(Executor executor) {
        this.f116443zdlpuopuiu = (Executor) Preconditions.checkNotNull(executor);
    }

    static /* synthetic */ long wkgbmnqykc(btonecajqb btonecajqbVar) {
        long j13 = btonecajqbVar.f116440iwizpuwonk;
        btonecajqbVar.f116440iwizpuwonk = 1 + j13;
        return j13;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0061  */
    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        ppxfxbqfkf ppxfxbqfkfVar;
        boolean z13;
        Preconditions.checkNotNull(runnable);
        synchronized (this.f116442yggfygwlhe) {
            ppxfxbqfkf ppxfxbqfkfVar2 = this.f116441jyumaefscl;
            if (ppxfxbqfkfVar2 != ppxfxbqfkf.RUNNING && ppxfxbqfkfVar2 != (ppxfxbqfkfVar = ppxfxbqfkf.QUEUED)) {
                long j13 = this.f116440iwizpuwonk;
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(runnable);
                this.f116442yggfygwlhe.add(iobyxmoadgVar);
                ppxfxbqfkf ppxfxbqfkfVar3 = ppxfxbqfkf.QUEUING;
                this.f116441jyumaefscl = ppxfxbqfkfVar3;
                try {
                    this.f116443zdlpuopuiu.execute(this.f116439cqumvgiudr);
                    if (this.f116441jyumaefscl != ppxfxbqfkfVar3) {
                        return;
                    }
                    synchronized (this.f116442yggfygwlhe) {
                        try {
                            if (this.f116440iwizpuwonk == j13 && this.f116441jyumaefscl == ppxfxbqfkfVar3) {
                                this.f116441jyumaefscl = ppxfxbqfkfVar;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e13) {
                    synchronized (this.f116442yggfygwlhe) {
                        try {
                            ppxfxbqfkf ppxfxbqfkfVar4 = this.f116441jyumaefscl;
                            if (ppxfxbqfkfVar4 != ppxfxbqfkf.IDLE && ppxfxbqfkfVar4 != ppxfxbqfkf.QUEUING) {
                                z13 = false;
                            } else if (this.f116442yggfygwlhe.removeLastOccurrence(iobyxmoadgVar)) {
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
            this.f116442yggfygwlhe.add(runnable);
        }
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f116443zdlpuopuiu + "}";
    }
}
