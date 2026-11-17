package com.google.firebase.concurrent;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
class rgvfuqvkyq extends androidx.concurrent.futures.iobyxmoadg implements ScheduledFuture {

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final ScheduledFuture f24233pmvmpeiblj;

    class iobyxmoadg implements zoijcleaow {
        iobyxmoadg() {
        }

        @Override // com.google.firebase.concurrent.rgvfuqvkyq.zoijcleaow
        public void iobyxmoadg(Throwable th2) {
            rgvfuqvkyq.this.rgvfuqvkyq(th2);
        }

        @Override // com.google.firebase.concurrent.rgvfuqvkyq.zoijcleaow
        public void set(Object obj) {
            rgvfuqvkyq.this.ojitshcjhn(obj);
        }
    }

    interface ppxfxbqfkf {
        ScheduledFuture iobyxmoadg(zoijcleaow zoijcleaowVar);
    }

    interface zoijcleaow {
        void iobyxmoadg(Throwable th2);

        void set(Object obj);
    }

    rgvfuqvkyq(ppxfxbqfkf ppxfxbqfkfVar) {
        this.f24233pmvmpeiblj = ppxfxbqfkfVar.iobyxmoadg(new iobyxmoadg());
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f24233pmvmpeiblj.getDelay(timeUnit);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: jyumaefscl, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        return this.f24233pmvmpeiblj.compareTo(delayed);
    }

    @Override // androidx.concurrent.futures.iobyxmoadg
    protected void ppxfxbqfkf() {
        this.f24233pmvmpeiblj.cancel(oxmwwwfdhm());
    }
}
