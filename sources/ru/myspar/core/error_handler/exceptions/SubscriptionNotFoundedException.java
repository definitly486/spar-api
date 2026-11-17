package ru.myspar.core.error_handler.exceptions;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lru/myspar/core/error_handler/exceptions/SubscriptionNotFoundedException;", "Lru/myspar/core/error_handler/exceptions/DomainException;", "", "yggfygwlhe", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "error-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SubscriptionNotFoundedException extends DomainException {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata */
    private final String message;

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
