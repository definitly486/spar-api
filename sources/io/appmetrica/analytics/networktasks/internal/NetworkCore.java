package io.appmetrica.analytics.networktasks.internal;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.networktasks.impl.d;
import io.appmetrica.analytics.networktasks.impl.f;
import io.appmetrica.analytics.networktasks.impl.g;
import io.appmetrica.analytics.networktasks.impl.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes3.dex */
public class NetworkCore extends InterruptionSafeThread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedBlockingQueue f48835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f48836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f48837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile d f48838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g f48839e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final IExecutionPolicy f48840f;

    public NetworkCore(IExecutionPolicy iExecutionPolicy) {
        this(iExecutionPolicy, new g());
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        NetworkTask networkTask = null;
        while (isRunning()) {
            try {
                synchronized (this.f48837c) {
                    try {
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                this.f48838d = (d) this.f48835a.take();
                networkTask = this.f48838d.f48806a;
                Executor executor = networkTask.getExecutor();
                this.f48839e.getClass();
                executor.execute(new h(networkTask, this, new f()));
                networkTask.onTaskFinished();
                synchronized (this.f48837c) {
                    this.f48838d = null;
                }
            } catch (InterruptedException unused) {
                if (networkTask != null) {
                    networkTask.onTaskFinished();
                    synchronized (this.f48837c) {
                        this.f48838d = null;
                    }
                } else {
                    continue;
                }
            } catch (Throwable th3) {
                if (networkTask != null) {
                    networkTask.onTaskFinished();
                    synchronized (this.f48837c) {
                        this.f48838d = null;
                        networkTask.onTaskRemoved();
                    }
                }
                throw th3;
            }
            networkTask.onTaskRemoved();
        }
    }

    public void startTask(NetworkTask networkTask) {
        if (this.f48840f.canBeExecuted()) {
            synchronized (this.f48836b) {
                try {
                    d dVar = new d(networkTask);
                    if (isRunning() && !this.f48835a.contains(dVar) && !dVar.equals(this.f48838d) && networkTask.onTaskAdded()) {
                        this.f48835a.offer(dVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void stopTasks() {
        synchronized (this.f48837c) {
            try {
                ArrayList arrayList = new ArrayList(this.f48835a.size());
                this.f48835a.drainTo(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).f48806a.onTaskRemoved();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    NetworkCore(IExecutionPolicy iExecutionPolicy, g gVar) {
        this.f48835a = new LinkedBlockingQueue();
        this.f48836b = new Object();
        this.f48837c = new Object();
        this.f48840f = iExecutionPolicy;
        this.f48839e = gVar;
    }
}
