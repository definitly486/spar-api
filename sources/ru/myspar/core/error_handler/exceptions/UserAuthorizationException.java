package ru.myspar.core.error_handler.exceptions;

import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/myspar/core/error_handler/exceptions/UserAuthorizationException;", "Lru/myspar/core/error_handler/exceptions/DomainException;", "", "message", "<init>", "(Ljava/lang/String;)V", "yggfygwlhe", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "error-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UserAuthorizationException extends DomainException {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata */
    private final String message;

    /* JADX WARN: Multi-variable type inference failed */
    public UserAuthorizationException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public /* synthetic */ UserAuthorizationException(String str, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? null : str);
    }

    public UserAuthorizationException(String str) {
        super(str, null, 2, null);
        this.message = str;
    }
}
