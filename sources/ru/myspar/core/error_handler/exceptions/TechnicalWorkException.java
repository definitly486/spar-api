package ru.myspar.core.error_handler.exceptions;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/myspar/core/error_handler/exceptions/TechnicalWorkException;", "Ljava/io/IOException;", "", "message", "<init>", "(Ljava/lang/String;)V", "zdlpuopuiu", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "error-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TechnicalWorkException extends IOException {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private final String message;

    public TechnicalWorkException(String message) {
        zdlpuopuiu.btonecajqb(message, "message");
        this.message = message;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
