package com.google.common.util.concurrent;

import com.google.common.collect.jyumaefscl;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CycleDetectingLockFactory {

    public static final class PotentialDeadlockException extends iobyxmoadg {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final iobyxmoadg f23775jyumaefscl;

        @Override // java.lang.Throwable
        public String getMessage() {
            String message = super.getMessage();
            Objects.requireNonNull(message);
            StringBuilder sb3 = new StringBuilder(message);
            for (Throwable cause = this.f23775jyumaefscl; cause != null; cause = cause.getCause()) {
                sb3.append(", ");
                sb3.append(cause.getMessage());
            }
            return sb3.toString();
        }
    }

    private static class iobyxmoadg extends IllegalStateException {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        static final StackTraceElement[] f23777zdlpuopuiu = new StackTraceElement[0];

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        static final jyumaefscl f23776yggfygwlhe = jyumaefscl.cdpycssgdh(CycleDetectingLockFactory.class.getName(), iobyxmoadg.class.getName(), zoijcleaow.class.getName());
    }

    private static class zoijcleaow {
    }
}
