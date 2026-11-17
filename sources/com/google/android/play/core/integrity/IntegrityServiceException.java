package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class IntegrityServiceException extends ApiException {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Throwable f23577zdlpuopuiu;

    IntegrityServiceException(int i13, Throwable th2) {
        super(new Status(i13, String.format(Locale.ROOT, "Integrity API error (%d): %s.", Integer.valueOf(i13), va.iobyxmoadg.iobyxmoadg(i13))));
        if (i13 == 0) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.f23577zdlpuopuiu = th2;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f23577zdlpuopuiu;
    }
}
