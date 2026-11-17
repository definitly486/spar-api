package ac;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class dsvhmnatus {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final AtomicInteger f1334iobyxmoadg = new AtomicInteger();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final AtomicInteger f1335zoijcleaow = new AtomicInteger();

    public void iobyxmoadg() {
        this.f1335zoijcleaow.getAndIncrement();
    }

    public void ppxfxbqfkf() {
        this.f1335zoijcleaow.set(0);
    }

    public void zoijcleaow() {
        this.f1334iobyxmoadg.getAndIncrement();
    }
}
