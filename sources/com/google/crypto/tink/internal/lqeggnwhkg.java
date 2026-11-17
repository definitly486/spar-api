package com.google.crypto.tink.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final AtomicReference f23842iobyxmoadg = new AtomicReference();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final lqeggnwhkg f23841zoijcleaow = new lqeggnwhkg();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final zoijcleaow f23840ppxfxbqfkf = new zoijcleaow();

    private static class zoijcleaow implements lb.zoijcleaow {
        private zoijcleaow() {
        }

        @Override // lb.zoijcleaow
        public lb.zoijcleaow.iobyxmoadg iobyxmoadg(lb.ppxfxbqfkf ppxfxbqfkfVar, String str, String str2) {
            return gxszxtbevo.f23837iobyxmoadg;
        }
    }

    public static lqeggnwhkg zoijcleaow() {
        return f23841zoijcleaow;
    }

    public lb.zoijcleaow iobyxmoadg() {
        lb.zoijcleaow zoijcleaowVar = (lb.zoijcleaow) this.f23842iobyxmoadg.get();
        return zoijcleaowVar == null ? f23840ppxfxbqfkf : zoijcleaowVar;
    }
}
